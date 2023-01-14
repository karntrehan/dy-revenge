package okhttp3.internal.http2;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p493i.C10598d0;
import p493i.C10603f;
import p493i.C10615h;
import p493i.C10616i;
import p493i.C10625q;

public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<C10616i, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final C10615h source;

        public Reader(C10598d0 d0Var, int i) {
            this(d0Var, i, 0, 4, (C10452g) null);
        }

        public Reader(C10598d0 d0Var, int i, int i2) {
            C10457l.m35320e(d0Var, "source");
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.headerList = new ArrayList();
            this.source = C10625q.m36156d(d0Var);
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Reader(C10598d0 d0Var, int i, int i2, int i3, C10452g gVar) {
            this(d0Var, i, (i3 & 4) != 0 ? i : i2);
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                clearDynamicTable();
            } else {
                evictToRecoverBytes(i2 - i);
            }
        }

        private final void clearDynamicTable() {
            C10341g.m35075k(this.dynamicTable, (Object) null, 0, 0, 6, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i) {
            return this.nextHeaderIndex + 1 + i;
        }

        private final int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i <= 0) {
                        Header[] headerArr = this.dynamicTable;
                        System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.headerCount);
                        this.nextHeaderIndex += i3;
                    } else {
                        Header header = this.dynamicTable[length];
                        C10457l.m35317b(header);
                        int i4 = header.hpackSize;
                        i -= i4;
                        this.dynamicTableByteCount -= i4;
                        this.headerCount--;
                        i3++;
                    }
                }
                Header[] headerArr2 = this.dynamicTable;
                System.arraycopy(headerArr2, i2 + 1, headerArr2, i2 + 1 + i3, this.headerCount);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        private final C10616i getName(int i) {
            Header header;
            if (isStaticHeader(i)) {
                header = Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i];
            } else {
                int dynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
                if (dynamicTableIndex >= 0) {
                    Header[] headerArr = this.dynamicTable;
                    if (dynamicTableIndex < headerArr.length) {
                        header = headerArr[dynamicTableIndex];
                        C10457l.m35317b(header);
                    }
                }
                throw new IOException("Header index too large " + (i + 1));
            }
            return header.name;
        }

        private final void insertIntoDynamicTable(int i, Header header) {
            this.headerList.add(header);
            int i2 = header.hpackSize;
            if (i != -1) {
                Header header2 = this.dynamicTable[dynamicTableIndex(i)];
                C10457l.m35317b(header2);
                i2 -= header2.hpackSize;
            }
            int i3 = this.maxDynamicTableByteCount;
            if (i2 > i3) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i2) - i3);
            if (i == -1) {
                int i4 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i4 > headerArr.length) {
                    Header[] headerArr2 = new Header[(headerArr.length * 2)];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i5 = this.nextHeaderIndex;
                this.nextHeaderIndex = i5 - 1;
                this.dynamicTable[i5] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[i + dynamicTableIndex(i) + evictToRecoverBytes] = header;
            }
            this.dynamicTableByteCount += i2;
        }

        private final boolean isStaticHeader(int i) {
            return i >= 0 && i <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final int readByte() {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i) {
            if (isStaticHeader(i)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    List<Header> list = this.headerList;
                    Header header = headerArr[dynamicTableIndex];
                    C10457l.m35317b(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i) {
            insertIntoDynamicTable(-1, new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i) {
            this.headerList.add(new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> R = C10358t.m35171R(this.headerList);
            this.headerList.clear();
            return R;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public final C10616i readByteString() {
            int readByte = readByte();
            boolean z = (readByte & 128) == 128;
            long readInt = (long) readInt(readByte, 127);
            if (!z) {
                return this.source.mo26365q(readInt);
            }
            C10603f fVar = new C10603f();
            Huffman.INSTANCE.decode(this.source, readInt, fVar);
            return fVar.mo26335T();
        }

        public final void readHeaders() {
            while (!this.source.mo26390x()) {
                int and = Util.and(this.source.readByte(), 255);
                if (and == 128) {
                    throw new IOException("index == 0");
                } else if ((and & 128) == 128) {
                    readIndexedHeader(readInt(and, 127) - 1);
                } else if (and == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((and & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(and, Hpack.PREFIX_6_BITS) - 1);
                } else if ((and & 32) == 32) {
                    int readInt = readInt(and, 31);
                    this.maxDynamicTableByteCount = readInt;
                    if (readInt < 0 || readInt > this.headerTableSizeSetting) {
                        throw new IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    adjustDynamicTableByteCount();
                } else if (and == 16 || and == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(and, 15) - 1);
                }
            }
        }

        public final int readInt(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & 128) == 0) {
                    return i2 + (readByte << i4);
                }
                i2 += (readByte & 127) << i4;
                i4 += 7;
            }
        }
    }

    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final C10603f out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(int i, C10603f fVar) {
            this(i, false, fVar, 2, (C10452g) null);
        }

        public Writer(int i, boolean z, C10603f fVar) {
            C10457l.m35320e(fVar, "out");
            this.headerTableSizeSetting = i;
            this.useCompression = z;
            this.out = fVar;
            this.smallestHeaderTableSizeSetting = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
            this.maxDynamicTableByteCount = i;
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.nextHeaderIndex = headerArr.length - 1;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Writer(int i, boolean z, C10603f fVar, int i2, C10452g gVar) {
            this((i2 & 1) != 0 ? Hpack.SETTINGS_HEADER_TABLE_SIZE : i, (i2 & 2) != 0 ? true : z, fVar);
        }

        public Writer(C10603f fVar) {
            this(0, false, fVar, 3, (C10452g) null);
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                clearDynamicTable();
            } else {
                evictToRecoverBytes(i2 - i);
            }
        }

        private final void clearDynamicTable() {
            C10341g.m35075k(this.dynamicTable, (Object) null, 0, 0, 6, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i <= 0) {
                        Header[] headerArr = this.dynamicTable;
                        System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.headerCount);
                        Header[] headerArr2 = this.dynamicTable;
                        int i4 = this.nextHeaderIndex;
                        Arrays.fill(headerArr2, i4 + 1, i4 + 1 + i3, (Object) null);
                        this.nextHeaderIndex += i3;
                    } else {
                        Header header = this.dynamicTable[length];
                        C10457l.m35317b(header);
                        i -= header.hpackSize;
                        int i5 = this.dynamicTableByteCount;
                        Header header2 = this.dynamicTable[length];
                        C10457l.m35317b(header2);
                        this.dynamicTableByteCount = i5 - header2.hpackSize;
                        this.headerCount--;
                        i3++;
                    }
                }
                Header[] headerArr3 = this.dynamicTable;
                System.arraycopy(headerArr3, i2 + 1, headerArr3, i2 + 1 + i3, this.headerCount);
                Header[] headerArr22 = this.dynamicTable;
                int i42 = this.nextHeaderIndex;
                Arrays.fill(headerArr22, i42 + 1, i42 + 1 + i3, (Object) null);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i = header.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i3 > headerArr.length) {
                Header[] headerArr2 = new Header[(headerArr.length * 2)];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        public final void resizeHeaderTable(int i) {
            this.headerTableSizeSetting = i;
            int min = Math.min(i, 16384);
            int i2 = this.maxDynamicTableByteCount;
            if (i2 != min) {
                if (min < i2) {
                    this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
                }
                this.emitDynamicTableSizeUpdate = true;
                this.maxDynamicTableByteCount = min;
                adjustDynamicTableByteCount();
            }
        }

        public final void writeByteString(C10616i iVar) {
            int i;
            int i2;
            C10457l.m35320e(iVar, "data");
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(iVar) < iVar.mo26420Y()) {
                    C10603f fVar = new C10603f();
                    huffman.encode(iVar, fVar);
                    iVar = fVar.mo26335T();
                    i2 = iVar.mo26420Y();
                    i = 128;
                    writeInt(i2, 127, i);
                    this.out.mo26351d0(iVar);
                }
            }
            i2 = iVar.mo26420Y();
            i = 0;
            writeInt(i2, 127, i);
            this.out.mo26351d0(iVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00ce  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> r14) {
            /*
                r13 = this;
                java.lang.String r0 = "headerBlock"
                p455g.p470y.p472d.C10457l.m35320e(r14, r0)
                boolean r0 = r13.emitDynamicTableSizeUpdate
                r1 = 0
                if (r0 == 0) goto L_0x0023
                int r0 = r13.smallestHeaderTableSizeSetting
                int r2 = r13.maxDynamicTableByteCount
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0017
                r13.writeInt(r0, r4, r3)
            L_0x0017:
                r13.emitDynamicTableSizeUpdate = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r13.smallestHeaderTableSizeSetting = r0
                int r0 = r13.maxDynamicTableByteCount
                r13.writeInt(r0, r4, r3)
            L_0x0023:
                int r0 = r14.size()
                r2 = 0
            L_0x0028:
                if (r2 >= r0) goto L_0x0106
                java.lang.Object r3 = r14.get(r2)
                okhttp3.internal.http2.Header r3 = (okhttp3.internal.http2.Header) r3
                i.i r4 = r3.name
                i.i r4 = r4.mo26267a0()
                i.i r5 = r3.value
                okhttp3.internal.http2.Hpack r6 = okhttp3.internal.http2.Hpack.INSTANCE
                java.util.Map r7 = r6.getNAME_TO_FIRST_INDEX()
                java.lang.Object r7 = r7.get(r4)
                java.lang.Integer r7 = (java.lang.Integer) r7
                r8 = -1
                if (r7 == 0) goto L_0x007c
                int r7 = r7.intValue()
                int r7 = r7 + 1
                r9 = 7
                r10 = 2
                if (r10 <= r7) goto L_0x0052
                goto L_0x007a
            L_0x0052:
                if (r9 < r7) goto L_0x007a
                okhttp3.internal.http2.Header[] r9 = r6.getSTATIC_HEADER_TABLE()
                int r10 = r7 + -1
                r9 = r9[r10]
                i.i r9 = r9.value
                boolean r9 = p455g.p470y.p472d.C10457l.m35316a(r9, r5)
                if (r9 == 0) goto L_0x0066
                r6 = r7
                goto L_0x007e
            L_0x0066:
                okhttp3.internal.http2.Header[] r6 = r6.getSTATIC_HEADER_TABLE()
                r6 = r6[r7]
                i.i r6 = r6.value
                boolean r6 = p455g.p470y.p472d.C10457l.m35316a(r6, r5)
                if (r6 == 0) goto L_0x007a
                int r6 = r7 + 1
                r12 = r7
                r7 = r6
                r6 = r12
                goto L_0x007e
            L_0x007a:
                r6 = r7
                goto L_0x007d
            L_0x007c:
                r6 = -1
            L_0x007d:
                r7 = -1
            L_0x007e:
                if (r7 != r8) goto L_0x00c4
                int r9 = r13.nextHeaderIndex
                int r9 = r9 + 1
                okhttp3.internal.http2.Header[] r10 = r13.dynamicTable
                int r10 = r10.length
            L_0x0087:
                if (r9 >= r10) goto L_0x00c4
                okhttp3.internal.http2.Header[] r11 = r13.dynamicTable
                r11 = r11[r9]
                p455g.p470y.p472d.C10457l.m35317b(r11)
                i.i r11 = r11.name
                boolean r11 = p455g.p470y.p472d.C10457l.m35316a(r11, r4)
                if (r11 == 0) goto L_0x00c1
                okhttp3.internal.http2.Header[] r11 = r13.dynamicTable
                r11 = r11[r9]
                p455g.p470y.p472d.C10457l.m35317b(r11)
                i.i r11 = r11.value
                boolean r11 = p455g.p470y.p472d.C10457l.m35316a(r11, r5)
                if (r11 == 0) goto L_0x00b3
                int r7 = r13.nextHeaderIndex
                int r9 = r9 - r7
                okhttp3.internal.http2.Hpack r7 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r7 = r7.getSTATIC_HEADER_TABLE()
                int r7 = r7.length
                int r7 = r7 + r9
                goto L_0x00c4
            L_0x00b3:
                if (r6 != r8) goto L_0x00c1
                int r6 = r13.nextHeaderIndex
                int r6 = r9 - r6
                okhttp3.internal.http2.Hpack r11 = okhttp3.internal.http2.Hpack.INSTANCE
                okhttp3.internal.http2.Header[] r11 = r11.getSTATIC_HEADER_TABLE()
                int r11 = r11.length
                int r6 = r6 + r11
            L_0x00c1:
                int r9 = r9 + 1
                goto L_0x0087
            L_0x00c4:
                if (r7 == r8) goto L_0x00ce
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r13.writeInt(r7, r3, r4)
                goto L_0x0102
            L_0x00ce:
                r7 = 64
                if (r6 != r8) goto L_0x00e1
                i.f r6 = r13.out
                r6.writeByte(r7)
                r13.writeByteString(r4)
            L_0x00da:
                r13.writeByteString(r5)
                r13.insertIntoDynamicTable(r3)
                goto L_0x0102
            L_0x00e1:
                i.i r8 = okhttp3.internal.http2.Header.PSEUDO_PREFIX
                boolean r8 = r4.mo26421Z(r8)
                if (r8 == 0) goto L_0x00fc
                i.i r8 = okhttp3.internal.http2.Header.TARGET_AUTHORITY
                boolean r4 = p455g.p470y.p472d.C10457l.m35316a(r8, r4)
                r4 = r4 ^ 1
                if (r4 == 0) goto L_0x00fc
                r3 = 15
                r13.writeInt(r6, r3, r1)
                r13.writeByteString(r5)
                goto L_0x0102
            L_0x00fc:
                r4 = 63
                r13.writeInt(r6, r4, r7)
                goto L_0x00da
            L_0x0102:
                int r2 = r2 + 1
                goto L_0x0028
            L_0x0106:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.writeHeaders(java.util.List):void");
        }

        public final void writeInt(int i, int i2, int i3) {
            int i4;
            C10603f fVar;
            if (i < i2) {
                fVar = this.out;
                i4 = i | i3;
            } else {
                this.out.writeByte(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.out.writeByte(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                fVar = this.out;
            }
            fVar.writeByte(i4);
        }
    }

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        C10616i iVar = Header.TARGET_METHOD;
        C10616i iVar2 = Header.TARGET_PATH;
        C10616i iVar3 = Header.TARGET_SCHEME;
        C10616i iVar4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{new Header(Header.TARGET_AUTHORITY, (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header(iVar, "GET"), new Header(iVar, "POST"), new Header(iVar2, "/"), new Header(iVar2, "/index.html"), new Header(iVar3, "http"), new Header(iVar3, "https"), new Header(iVar4, "200"), new Header(iVar4, "204"), new Header(iVar4, "206"), new Header(iVar4, "304"), new Header(iVar4, "400"), new Header(iVar4, "404"), new Header(iVar4, "500"), new Header("accept-charset", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("accept-ranges", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("accept", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("access-control-allow-origin", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("age", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("allow", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("authorization", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("cache-control", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-disposition", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-encoding", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-language", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-length", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-location", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-range", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("content-type", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("cookie", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("date", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("etag", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("expect", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("expires", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("from", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("host", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-match", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-modified-since", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-none-match", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-range", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("if-unmodified-since", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("last-modified", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("link", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("location", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("max-forwards", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("proxy-authenticate", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("proxy-authorization", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("range", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("referer", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("refresh", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("retry-after", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("server", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("set-cookie", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("strict-transport-security", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("transfer-encoding", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("user-agent", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("vary", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("via", (String) HttpUrl.FRAGMENT_ENCODE_SET), new Header("www-authenticate", (String) HttpUrl.FRAGMENT_ENCODE_SET)};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<C10616i, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i = 0; i < length; i++) {
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i].name)) {
                linkedHashMap.put(headerArr2[i].name, Integer.valueOf(i));
            }
        }
        Map<C10616i, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C10457l.m35319d(unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public final C10616i checkLowercase(C10616i iVar) {
        C10457l.m35320e(iVar, "name");
        int Y = iVar.mo26420Y();
        for (int i = 0; i < Y; i++) {
            byte b = (byte) 65;
            byte b2 = (byte) 90;
            byte A = iVar.mo26411A(i);
            if (b <= A && b2 >= A) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + iVar.mo26422c0());
            }
        }
        return iVar;
    }

    public final Map<C10616i, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }
}
