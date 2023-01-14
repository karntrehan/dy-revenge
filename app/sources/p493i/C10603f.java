package p493i;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Objects;
import okhttp3.HttpUrl;
import okhttp3.internal.connection.RealConnection;
import p455g.p459d0.C10283d;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10471z;
import p493i.p494g0.C10609a;

/* renamed from: i.f */
public final class C10603f implements C10615h, C10608g, Cloneable, ByteChannel {

    /* renamed from: f */
    public C10636y f28034f;

    /* renamed from: o */
    private long f28035o;

    /* renamed from: i.f$a */
    public static final class C10604a implements Closeable {

        /* renamed from: f */
        public C10603f f28036f;

        /* renamed from: o */
        public boolean f28037o;

        /* renamed from: p */
        private C10636y f28038p;

        /* renamed from: q */
        public long f28039q = -1;

        /* renamed from: r */
        public byte[] f28040r;

        /* renamed from: s */
        public int f28041s = -1;

        /* renamed from: t */
        public int f28042t = -1;

        /* renamed from: a */
        public final int mo26395a() {
            long j = this.f28039q;
            C10603f fVar = this.f28036f;
            C10457l.m35317b(fVar);
            if (j != fVar.size()) {
                long j2 = this.f28039q;
                return mo26398h(j2 == -1 ? 0 : j2 + ((long) (this.f28042t - this.f28041s)));
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        /* renamed from: b */
        public final long mo26396b(long j) {
            long j2 = j;
            C10603f fVar = this.f28036f;
            if (fVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            } else if (this.f28037o) {
                long size = fVar.size();
                int i = 1;
                int i2 = (j2 > size ? 1 : (j2 == size ? 0 : -1));
                if (i2 <= 0) {
                    if (j2 >= 0) {
                        long j3 = size - j2;
                        while (true) {
                            if (j3 <= 0) {
                                break;
                            }
                            C10636y yVar = fVar.f28034f;
                            C10457l.m35317b(yVar);
                            C10636y yVar2 = yVar.f28096h;
                            C10457l.m35317b(yVar2);
                            int i3 = yVar2.f28092d;
                            long j4 = (long) (i3 - yVar2.f28091c);
                            if (j4 > j3) {
                                yVar2.f28092d = i3 - ((int) j3);
                                break;
                            }
                            fVar.f28034f = yVar2.mo26476b();
                            C10638z.m36238b(yVar2);
                            j3 -= j4;
                        }
                        this.f28038p = null;
                        this.f28039q = j2;
                        this.f28040r = null;
                        this.f28041s = -1;
                        this.f28042t = -1;
                    } else {
                        throw new IllegalArgumentException(("newSize < 0: " + j2).toString());
                    }
                } else if (i2 > 0) {
                    long j5 = j2 - size;
                    boolean z = true;
                    while (j5 > 0) {
                        C10636y O0 = fVar.mo26327O0(i);
                        int min = (int) Math.min(j5, (long) (8192 - O0.f28092d));
                        int i4 = O0.f28092d + min;
                        O0.f28092d = i4;
                        j5 -= (long) min;
                        if (z) {
                            this.f28038p = O0;
                            this.f28039q = size;
                            this.f28040r = O0.f28090b;
                            this.f28041s = i4 - min;
                            this.f28042t = i4;
                            z = false;
                        }
                        i = 1;
                    }
                }
                fVar.mo26322L0(j2);
                return size;
            } else {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
        }

        public void close() {
            if (this.f28036f != null) {
                this.f28036f = null;
                this.f28038p = null;
                this.f28039q = -1;
                this.f28040r = null;
                this.f28041s = -1;
                this.f28042t = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        /* renamed from: h */
        public final int mo26398h(long j) {
            C10636y yVar;
            C10603f fVar = this.f28036f;
            if (fVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            } else if (j < ((long) -1) || j > fVar.size()) {
                C10471z zVar = C10471z.f27629a;
                String format = String.format("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(fVar.size())}, 2));
                C10457l.m35319d(format, "java.lang.String.format(format, *args)");
                throw new ArrayIndexOutOfBoundsException(format);
            } else if (j == -1 || j == fVar.size()) {
                this.f28038p = null;
                this.f28039q = j;
                this.f28040r = null;
                this.f28041s = -1;
                this.f28042t = -1;
                return -1;
            } else {
                long j2 = 0;
                long size = fVar.size();
                C10636y yVar2 = fVar.f28034f;
                C10636y yVar3 = this.f28038p;
                if (yVar3 != null) {
                    long j3 = this.f28039q;
                    int i = this.f28041s;
                    C10457l.m35317b(yVar3);
                    long j4 = j3 - ((long) (i - yVar3.f28091c));
                    if (j4 > j) {
                        yVar = yVar2;
                        yVar2 = this.f28038p;
                        size = j4;
                    } else {
                        yVar = this.f28038p;
                        j2 = j4;
                    }
                } else {
                    yVar = yVar2;
                }
                if (size - j > j - j2) {
                    while (true) {
                        C10457l.m35317b(yVar);
                        int i2 = yVar.f28092d;
                        int i3 = yVar.f28091c;
                        if (j < ((long) (i2 - i3)) + j2) {
                            break;
                        }
                        j2 += (long) (i2 - i3);
                        yVar = yVar.f28095g;
                    }
                } else {
                    while (size > j) {
                        C10457l.m35317b(yVar2);
                        yVar2 = yVar2.f28096h;
                        C10457l.m35317b(yVar2);
                        size -= (long) (yVar2.f28092d - yVar2.f28091c);
                    }
                    j2 = size;
                    yVar = yVar2;
                }
                if (this.f28037o) {
                    C10457l.m35317b(yVar);
                    if (yVar.f28093e) {
                        C10636y f = yVar.mo26480f();
                        if (fVar.f28034f == yVar) {
                            fVar.f28034f = f;
                        }
                        yVar = yVar.mo26477c(f);
                        C10636y yVar4 = yVar.f28096h;
                        C10457l.m35317b(yVar4);
                        yVar4.mo26476b();
                    }
                }
                this.f28038p = yVar;
                this.f28039q = j;
                C10457l.m35317b(yVar);
                this.f28040r = yVar.f28090b;
                int i4 = yVar.f28091c + ((int) (j - j2));
                this.f28041s = i4;
                int i5 = yVar.f28092d;
                this.f28042t = i5;
                return i5 - i4;
            }
        }
    }

    /* renamed from: i.f$b */
    public static final class C10605b extends InputStream {

        /* renamed from: f */
        final /* synthetic */ C10603f f28043f;

        C10605b(C10603f fVar) {
            this.f28043f = fVar;
        }

        public int available() {
            return (int) Math.min(this.f28043f.size(), (long) RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
        }

        public void close() {
        }

        public int read() {
            if (this.f28043f.size() > 0) {
                return this.f28043f.readByte() & 255;
            }
            return -1;
        }

        public int read(byte[] bArr, int i, int i2) {
            C10457l.m35320e(bArr, "sink");
            return this.f28043f.mo26313D0(bArr, i, i2);
        }

        public String toString() {
            return this.f28043f + ".inputStream()";
        }
    }

    /* renamed from: i.f$c */
    public static final class C10606c extends OutputStream {

        /* renamed from: f */
        final /* synthetic */ C10603f f28044f;

        C10606c(C10603f fVar) {
            this.f28044f = fVar;
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return this.f28044f + ".outputStream()";
        }

        public void write(int i) {
            this.f28044f.writeByte(i);
        }

        public void write(byte[] bArr, int i, int i2) {
            C10457l.m35320e(bArr, "data");
            this.f28044f.write(bArr, i, i2);
        }
    }

    /* renamed from: F0 */
    public static /* synthetic */ C10604a m35979F0(C10603f fVar, C10604a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = new C10604a();
        }
        return fVar.mo26314E0(aVar);
    }

    /* renamed from: A0 */
    public long mo26307A0(C10616i iVar, long j) {
        long j2 = j;
        C10457l.m35320e(iVar, "bytes");
        if (iVar.mo26420Y() > 0) {
            long j3 = 0;
            if (j2 >= 0) {
                C10636y yVar = this.f28034f;
                if (yVar != null) {
                    if (size() - j2 < j2) {
                        long size = size();
                        while (size > j2) {
                            yVar = yVar.f28096h;
                            C10457l.m35317b(yVar);
                            size -= (long) (yVar.f28092d - yVar.f28091c);
                        }
                        byte[] O = iVar.mo26263O();
                        byte b = O[0];
                        int Y = iVar.mo26420Y();
                        long size2 = (size() - ((long) Y)) + 1;
                        while (size < size2) {
                            byte[] bArr = yVar.f28090b;
                            long j4 = size;
                            int min = (int) Math.min((long) yVar.f28092d, (((long) yVar.f28091c) + size2) - size);
                            long j5 = ((long) yVar.f28091c) + j2;
                            long j6 = j4;
                            for (int i = (int) (j5 - j6); i < min; i++) {
                                if (bArr[i] == b && C10609a.m36066b(yVar, i + 1, O, 1, Y)) {
                                    return ((long) (i - yVar.f28091c)) + j6;
                                }
                            }
                            size = j6 + ((long) (yVar.f28092d - yVar.f28091c));
                            yVar = yVar.f28095g;
                            C10457l.m35317b(yVar);
                            j2 = size;
                        }
                    } else {
                        while (true) {
                            long j7 = ((long) (yVar.f28092d - yVar.f28091c)) + j3;
                            if (j7 > j2) {
                                break;
                            }
                            yVar = yVar.f28095g;
                            C10457l.m35317b(yVar);
                            j3 = j7;
                        }
                        byte[] O2 = iVar.mo26263O();
                        byte b2 = O2[0];
                        int Y2 = iVar.mo26420Y();
                        long size3 = (size() - ((long) Y2)) + 1;
                        while (j3 < size3) {
                            byte[] bArr2 = yVar.f28090b;
                            long j8 = size3;
                            int min2 = (int) Math.min((long) yVar.f28092d, (((long) yVar.f28091c) + size3) - j3);
                            for (int i2 = (int) ((((long) yVar.f28091c) + j2) - j3); i2 < min2; i2++) {
                                if (bArr2[i2] == b2) {
                                    if (C10609a.m36066b(yVar, i2 + 1, O2, 1, Y2)) {
                                        return ((long) (i2 - yVar.f28091c)) + j3;
                                    }
                                }
                            }
                            j3 += (long) (yVar.f28092d - yVar.f28091c);
                            yVar = yVar.f28095g;
                            C10457l.m35317b(yVar);
                            j2 = j3;
                            size3 = j8;
                        }
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    /* renamed from: B */
    public long mo26308B(C10616i iVar) {
        C10457l.m35320e(iVar, "targetBytes");
        return mo26309B0(iVar, 0);
    }

    /* renamed from: B0 */
    public long mo26309B0(C10616i iVar, long j) {
        long j2;
        int i;
        C10457l.m35320e(iVar, "targetBytes");
        long j3 = 0;
        if (j >= 0) {
            C10636y yVar = this.f28034f;
            if (yVar == null) {
                return -1;
            }
            if (size() - j < j) {
                j2 = size();
                while (j2 > j) {
                    yVar = yVar.f28096h;
                    C10457l.m35317b(yVar);
                    j2 -= (long) (yVar.f28092d - yVar.f28091c);
                }
                if (iVar.mo26420Y() == 2) {
                    byte A = iVar.mo26411A(0);
                    byte A2 = iVar.mo26411A(1);
                    while (j2 < size()) {
                        byte[] bArr = yVar.f28090b;
                        i = (int) ((((long) yVar.f28091c) + j) - j2);
                        int i2 = yVar.f28092d;
                        while (i < i2) {
                            byte b = bArr[i];
                            if (!(b == A || b == A2)) {
                                i++;
                            }
                        }
                        j2 += (long) (yVar.f28092d - yVar.f28091c);
                        yVar = yVar.f28095g;
                        C10457l.m35317b(yVar);
                        j = j2;
                    }
                    return -1;
                }
                byte[] O = iVar.mo26263O();
                while (j2 < size()) {
                    byte[] bArr2 = yVar.f28090b;
                    int i3 = (int) ((((long) yVar.f28091c) + j) - j2);
                    int i4 = yVar.f28092d;
                    while (i < i4) {
                        byte b2 = bArr2[i];
                        int length = O.length;
                        int i5 = 0;
                        while (i5 < length) {
                            if (b2 != O[i5]) {
                                i5++;
                            }
                        }
                        i3 = i + 1;
                    }
                    j2 += (long) (yVar.f28092d - yVar.f28091c);
                    yVar = yVar.f28095g;
                    C10457l.m35317b(yVar);
                    j = j2;
                }
                return -1;
            }
            while (true) {
                long j4 = ((long) (yVar.f28092d - yVar.f28091c)) + j3;
                if (j4 > j) {
                    break;
                }
                yVar = yVar.f28095g;
                C10457l.m35317b(yVar);
                j3 = j4;
            }
            if (iVar.mo26420Y() == 2) {
                byte A3 = iVar.mo26411A(0);
                byte A4 = iVar.mo26411A(1);
                while (j2 < size()) {
                    byte[] bArr3 = yVar.f28090b;
                    int i6 = (int) ((((long) yVar.f28091c) + j) - j2);
                    int i7 = yVar.f28092d;
                    while (i < i7) {
                        byte b3 = bArr3[i];
                        if (!(b3 == A3 || b3 == A4)) {
                            i6 = i + 1;
                        }
                    }
                    j3 = j2 + ((long) (yVar.f28092d - yVar.f28091c));
                    yVar = yVar.f28095g;
                    C10457l.m35317b(yVar);
                    j = j3;
                }
                return -1;
            }
            byte[] O2 = iVar.mo26263O();
            while (j2 < size()) {
                byte[] bArr4 = yVar.f28090b;
                int i8 = (int) ((((long) yVar.f28091c) + j) - j2);
                int i9 = yVar.f28092d;
                while (i < i9) {
                    byte b4 = bArr4[i];
                    int length2 = O2.length;
                    int i10 = 0;
                    while (i10 < length2) {
                        if (b4 != O2[i10]) {
                            i10++;
                        }
                    }
                    i8 = i + 1;
                }
                j3 = j2 + ((long) (yVar.f28092d - yVar.f28091c));
                yVar = yVar.f28095g;
                C10457l.m35317b(yVar);
                j = j3;
            }
            return -1;
            return ((long) (i - yVar.f28091c)) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
    }

    /* renamed from: C0 */
    public boolean mo26311C0(long j, C10616i iVar, int i, int i2) {
        C10457l.m35320e(iVar, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || size() - j < ((long) i2) || iVar.mo26420Y() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (mo26392y0(((long) i3) + j) != iVar.mo26411A(i + i3)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ac, code lost:
        if (r10 != r11) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
        r0.f28034f = r16.mo26476b();
        p493i.C10638z.m36238b(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
        r16.f28091c = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bc, code lost:
        if (r7 != false) goto L_0x00c2;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo26312D() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r17.size()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00d0
            r1 = -7
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0011:
            i.y r8 = r0.f28034f
            p455g.p470y.p472d.C10457l.m35317b(r8)
            byte[] r9 = r8.f28090b
            int r10 = r8.f28091c
            int r11 = r8.f28092d
        L_0x001c:
            r12 = 1
            if (r10 >= r11) goto L_0x00a9
            byte r13 = r9[r10]
            r14 = 48
            byte r14 = (byte) r14
            if (r13 < r14) goto L_0x0074
            r15 = 57
            byte r15 = (byte) r15
            if (r13 > r15) goto L_0x0074
            int r14 = r14 - r13
            r15 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r12 < 0) goto L_0x0047
            r15 = r7
            r16 = r8
            if (r12 != 0) goto L_0x0040
            long r7 = (long) r14
            int r12 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r12 >= 0) goto L_0x0040
            goto L_0x0047
        L_0x0040:
            r7 = 10
            long r3 = r3 * r7
            long r7 = (long) r14
            long r3 = r3 + r7
            goto L_0x0082
        L_0x0047:
            i.f r1 = new i.f
            r1.<init>()
            i.f r1 = r1.mo26360m0(r3)
            i.f r1 = r1.writeByte(r13)
            if (r6 != 0) goto L_0x0059
            r1.readByte()
        L_0x0059:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.mo26319J0()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0074:
            r15 = r7
            r16 = r8
            r7 = 45
            byte r7 = (byte) r7
            if (r13 != r7) goto L_0x008a
            if (r5 != 0) goto L_0x008a
            r6 = 1
            long r1 = r1 - r6
            r6 = 1
        L_0x0082:
            int r10 = r10 + 1
            int r5 = r5 + 1
            r7 = r15
            r8 = r16
            goto L_0x001c
        L_0x008a:
            if (r5 == 0) goto L_0x008e
            r7 = 1
            goto L_0x00ac
        L_0x008e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = p493i.C10591c.m35969e(r13)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00a9:
            r15 = r7
            r16 = r8
        L_0x00ac:
            if (r10 != r11) goto L_0x00b8
            i.y r8 = r16.mo26476b()
            r0.f28034f = r8
            p493i.C10638z.m36238b(r16)
            goto L_0x00bc
        L_0x00b8:
            r8 = r16
            r8.f28091c = r10
        L_0x00bc:
            if (r7 != 0) goto L_0x00c2
            i.y r8 = r0.f28034f
            if (r8 != 0) goto L_0x0011
        L_0x00c2:
            long r1 = r17.size()
            long r7 = (long) r5
            long r1 = r1 - r7
            r0.mo26322L0(r1)
            if (r6 == 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            long r3 = -r3
        L_0x00cf:
            return r3
        L_0x00d0:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p493i.C10603f.mo26312D():long");
    }

    /* renamed from: D0 */
    public int mo26313D0(byte[] bArr, int i, int i2) {
        C10457l.m35320e(bArr, "sink");
        C10591c.m35966b((long) bArr.length, (long) i, (long) i2);
        C10636y yVar = this.f28034f;
        if (yVar == null) {
            return -1;
        }
        int min = Math.min(i2, yVar.f28092d - yVar.f28091c);
        byte[] bArr2 = yVar.f28090b;
        int i3 = yVar.f28091c;
        byte[] unused = C10341g.m35067c(bArr2, bArr, i, i3, i3 + min);
        yVar.f28091c += min;
        mo26322L0(size() - ((long) min));
        if (yVar.f28091c != yVar.f28092d) {
            return min;
        }
        this.f28034f = yVar.mo26476b();
        C10638z.m36238b(yVar);
        return min;
    }

    /* renamed from: E0 */
    public final C10604a mo26314E0(C10604a aVar) {
        C10457l.m35320e(aVar, "unsafeCursor");
        if (aVar.f28036f == null) {
            aVar.f28036f = this;
            aVar.f28037o = true;
            return aVar;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    /* renamed from: G */
    public String mo26315G(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long z0 = mo26394z0(b, 0, j2);
            if (z0 != -1) {
                return C10609a.m36067c(this, z0);
            }
            if (j2 < size() && mo26392y0(j2 - 1) == ((byte) 13) && mo26392y0(j2) == b) {
                return C10609a.m36067c(this, j2);
            }
            C10603f fVar = new C10603f();
            mo26381v0(fVar, 0, Math.min((long) 32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + fVar.mo26335T().mo26262N() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    /* renamed from: G0 */
    public int mo26316G0() {
        return C10591c.m35967c(readInt());
    }

    /* renamed from: H0 */
    public short mo26317H0() {
        return C10591c.m35968d(readShort());
    }

    /* renamed from: I0 */
    public String mo26318I0(long j, Charset charset) {
        C10457l.m35320e(charset, "charset");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0 && j <= ((long) RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (this.f28035o < j) {
            throw new EOFException();
        } else if (i == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            C10636y yVar = this.f28034f;
            C10457l.m35317b(yVar);
            int i2 = yVar.f28091c;
            if (((long) i2) + j > ((long) yVar.f28092d)) {
                return new String(mo26344Z(j), charset);
            }
            int i3 = (int) j;
            String str = new String(yVar.f28090b, i2, i3, charset);
            int i4 = yVar.f28091c + i3;
            yVar.f28091c = i4;
            this.f28035o -= j;
            if (i4 == yVar.f28092d) {
                this.f28034f = yVar.mo26476b();
                C10638z.m36238b(yVar);
            }
            return str;
        }
    }

    /* renamed from: J0 */
    public String mo26319J0() {
        return mo26318I0(this.f28035o, C10283d.f27505b);
    }

    /* renamed from: K0 */
    public String mo26321K0(long j) {
        return mo26318I0(j, C10283d.f27505b);
    }

    /* renamed from: L0 */
    public final void mo26322L0(long j) {
        this.f28035o = j;
    }

    /* renamed from: M */
    public boolean mo26323M(long j, C10616i iVar) {
        C10457l.m35320e(iVar, "bytes");
        return mo26311C0(j, iVar, 0, iVar.mo26420Y());
    }

    /* renamed from: M0 */
    public final C10616i mo26324M0() {
        if (size() <= ((long) RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO)) {
            return mo26326N0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    /* renamed from: N */
    public String mo26325N(Charset charset) {
        C10457l.m35320e(charset, "charset");
        return mo26318I0(this.f28035o, charset);
    }

    /* renamed from: N0 */
    public final C10616i mo26326N0(int i) {
        if (i == 0) {
            return C10616i.f28049f;
        }
        C10591c.m35966b(size(), 0, (long) i);
        C10636y yVar = this.f28034f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C10457l.m35317b(yVar);
            int i5 = yVar.f28092d;
            int i6 = yVar.f28091c;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                yVar = yVar.f28095g;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        C10636y yVar2 = this.f28034f;
        int i7 = 0;
        while (i2 < i) {
            C10457l.m35317b(yVar2);
            bArr[i7] = yVar2.f28090b;
            i2 += yVar2.f28092d - yVar2.f28091c;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = yVar2.f28091c;
            yVar2.f28093e = true;
            i7++;
            yVar2 = yVar2.f28095g;
        }
        return new C10588a0(bArr, iArr);
    }

    /* renamed from: O0 */
    public final C10636y mo26327O0(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            C10636y yVar = this.f28034f;
            if (yVar == null) {
                C10636y c = C10638z.m36239c();
                this.f28034f = c;
                c.f28096h = c;
                c.f28095g = c;
                return c;
            }
            C10457l.m35317b(yVar);
            C10636y yVar2 = yVar.f28096h;
            C10457l.m35317b(yVar2);
            return (yVar2.f28092d + i > 8192 || !yVar2.f28094f) ? yVar2.mo26477c(C10638z.m36239c()) : yVar2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    /* renamed from: P0 */
    public C10603f mo26351d0(C10616i iVar) {
        C10457l.m35320e(iVar, "byteString");
        iVar.mo26269d0(this, 0, iVar.mo26420Y());
        return this;
    }

    /* renamed from: Q */
    public long mo26330Q(C10598d0 d0Var) {
        C10457l.m35320e(d0Var, "source");
        long j = 0;
        while (true) {
            long read = d0Var.read(this, (long) 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    /* renamed from: Q0 */
    public C10603f mo26331Q0(C10598d0 d0Var, long j) {
        C10457l.m35320e(d0Var, "source");
        while (j > 0) {
            long read = d0Var.read(this, j);
            if (read != -1) {
                j -= read;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    /* renamed from: R0 */
    public C10603f write(byte[] bArr) {
        C10457l.m35320e(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    /* renamed from: S0 */
    public C10603f write(byte[] bArr, int i, int i2) {
        C10457l.m35320e(bArr, "source");
        long j = (long) i2;
        C10591c.m35966b((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C10636y O0 = mo26327O0(1);
            int min = Math.min(i3 - i, 8192 - O0.f28092d);
            int i4 = i + min;
            byte[] unused = C10341g.m35067c(bArr, O0.f28090b, O0.f28092d, i, i4);
            O0.f28092d += min;
            i = i4;
        }
        mo26322L0(size() + j);
        return this;
    }

    /* renamed from: T */
    public C10616i mo26335T() {
        return mo26365q(size());
    }

    /* renamed from: T0 */
    public C10603f writeByte(int i) {
        C10636y O0 = mo26327O0(1);
        byte[] bArr = O0.f28090b;
        int i2 = O0.f28092d;
        O0.f28092d = i2 + 1;
        bArr[i2] = (byte) i;
        mo26322L0(size() + 1);
        return this;
    }

    /* renamed from: U0 */
    public C10603f mo26360m0(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return writeByte(48);
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return mo26320K("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        C10636y O0 = mo26327O0(i2);
        byte[] bArr = O0.f28090b;
        int i3 = O0.f28092d + i2;
        while (j != 0) {
            long j2 = (long) 10;
            i3--;
            bArr[i3] = C10609a.m36065a()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = (byte) 45;
        }
        O0.f28092d += i2;
        mo26322L0(size() + ((long) i2));
        return this;
    }

    /* renamed from: V */
    public boolean mo26338V(long j) {
        return this.f28035o >= j;
    }

    /* renamed from: V0 */
    public C10603f mo26332R(long j) {
        if (j == 0) {
            return writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C10636y O0 = mo26327O0(i);
        byte[] bArr = O0.f28090b;
        int i2 = O0.f28092d;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = C10609a.m36065a()[(int) (15 & j)];
            j >>>= 4;
        }
        O0.f28092d += i;
        mo26322L0(size() + ((long) i));
        return this;
    }

    /* renamed from: W0 */
    public C10603f writeInt(int i) {
        C10636y O0 = mo26327O0(4);
        byte[] bArr = O0.f28090b;
        int i2 = O0.f28092d;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        O0.f28092d = i5 + 1;
        mo26322L0(size() + 4);
        return this;
    }

    /* renamed from: X0 */
    public C10603f mo26341X0(long j) {
        C10636y O0 = mo26327O0(8);
        byte[] bArr = O0.f28090b;
        int i = O0.f28092d;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i8] = (byte) ((int) (j & 255));
        O0.f28092d = i8 + 1;
        mo26322L0(size() + 8);
        return this;
    }

    /* renamed from: Y */
    public String mo26342Y() {
        return mo26315G(Long.MAX_VALUE);
    }

    /* renamed from: Y0 */
    public C10603f writeShort(int i) {
        C10636y O0 = mo26327O0(2);
        byte[] bArr = O0.f28090b;
        int i2 = O0.f28092d;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        O0.f28092d = i3 + 1;
        mo26322L0(size() + 2);
        return this;
    }

    /* renamed from: Z */
    public byte[] mo26344Z(long j) {
        if (!(j >= 0 && j <= ((long) RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (size() >= j) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: Z0 */
    public C10603f mo26345Z0(String str, int i, int i2, Charset charset) {
        C10457l.m35320e(str, "string");
        C10457l.m35320e(charset, "charset");
        boolean z = true;
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 > str.length()) {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
                } else if (C10457l.m35316a(charset, C10283d.f27505b)) {
                    return mo26328P(str, i, i2);
                } else {
                    String substring = str.substring(i, i2);
                    C10457l.m35319d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                    byte[] bytes = substring.getBytes(charset);
                    C10457l.m35319d(bytes, "(this as java.lang.String).getBytes(charset)");
                    return write(bytes, 0, bytes.length);
                }
            } else {
                throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
            }
        } else {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
    }

    /* renamed from: a1 */
    public C10603f mo26346a1(String str, Charset charset) {
        C10457l.m35320e(str, "string");
        C10457l.m35320e(charset, "charset");
        return mo26345Z0(str, 0, str.length(), charset);
    }

    /* renamed from: b1 */
    public C10603f mo26320K(String str) {
        C10457l.m35320e(str, "string");
        return mo26328P(str, 0, str.length());
    }

    /* renamed from: c1 */
    public C10603f mo26328P(String str, int i, int i2) {
        long size;
        long j;
        C10457l.m35320e(str, "string");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            C10636y O0 = mo26327O0(1);
                            byte[] bArr = O0.f28090b;
                            int i3 = O0.f28092d - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                            while (i4 < min) {
                                char charAt2 = str.charAt(i4);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                bArr[i4 + i3] = (byte) charAt2;
                                i4++;
                            }
                            int i5 = O0.f28092d;
                            int i6 = (i3 + i4) - i5;
                            O0.f28092d = i5 + i6;
                            mo26322L0(size() + ((long) i6));
                            i = i4;
                        } else {
                            if (charAt < 2048) {
                                C10636y O02 = mo26327O0(2);
                                byte[] bArr2 = O02.f28090b;
                                int i7 = O02.f28092d;
                                bArr2[i7] = (byte) ((charAt >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt & '?') | 128);
                                O02.f28092d = i7 + 2;
                                size = size();
                                j = 2;
                            } else if (charAt < 55296 || charAt > 57343) {
                                C10636y O03 = mo26327O0(3);
                                byte[] bArr3 = O03.f28090b;
                                int i8 = O03.f28092d;
                                bArr3[i8] = (byte) ((charAt >> 12) | 224);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt & '?') | 128);
                                O03.f28092d = i8 + 3;
                                size = size();
                                j = 3;
                            } else {
                                int i9 = i + 1;
                                char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                                if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    writeByte(63);
                                    i = i9;
                                } else {
                                    int i10 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 0;
                                    C10636y O04 = mo26327O0(4);
                                    byte[] bArr4 = O04.f28090b;
                                    int i11 = O04.f28092d;
                                    bArr4[i11] = (byte) ((i10 >> 18) | 240);
                                    bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                    bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                                    bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                                    O04.f28092d = i11 + 4;
                                    mo26322L0(size() + 4);
                                    i += 2;
                                }
                            }
                            mo26322L0(size + j);
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    public void close() {
    }

    /* renamed from: d */
    public C10603f mo26350d() {
        return this;
    }

    /* renamed from: d1 */
    public C10603f mo26352d1(int i) {
        long size;
        long j;
        if (i < 128) {
            writeByte(i);
        } else {
            if (i < 2048) {
                C10636y O0 = mo26327O0(2);
                byte[] bArr = O0.f28090b;
                int i2 = O0.f28092d;
                bArr[i2] = (byte) ((i >> 6) | 192);
                bArr[i2 + 1] = (byte) ((i & 63) | 128);
                O0.f28092d = i2 + 2;
                size = size();
                j = 2;
            } else if (55296 <= i && 57343 >= i) {
                writeByte(63);
            } else if (i < 65536) {
                C10636y O02 = mo26327O0(3);
                byte[] bArr2 = O02.f28090b;
                int i3 = O02.f28092d;
                bArr2[i3] = (byte) ((i >> 12) | 224);
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                O02.f28092d = i3 + 3;
                size = size();
                j = 3;
            } else if (i <= 1114111) {
                C10636y O03 = mo26327O0(4);
                byte[] bArr3 = O03.f28090b;
                int i4 = O03.f28092d;
                bArr3[i4] = (byte) ((i >> 18) | 240);
                bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i4 + 3] = (byte) ((i & 63) | 128);
                O03.f28092d = i4 + 4;
                size = size();
                j = 4;
            } else {
                throw new IllegalArgumentException("Unexpected code point: 0x" + C10591c.m35970f(i));
            }
            mo26322L0(size + j);
        }
        return this;
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x000b
        L_0x0008:
            r2 = 1
            goto L_0x0082
        L_0x000b:
            boolean r4 = r1 instanceof p493i.C10603f
            if (r4 != 0) goto L_0x0011
            goto L_0x0082
        L_0x0011:
            long r4 = r20.size()
            i.f r1 = (p493i.C10603f) r1
            long r6 = r1.size()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0020
            goto L_0x0082
        L_0x0020:
            long r4 = r20.size()
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x002b
            goto L_0x0008
        L_0x002b:
            i.y r4 = r0.f28034f
            p455g.p470y.p472d.C10457l.m35317b(r4)
            i.y r1 = r1.f28034f
            p455g.p470y.p472d.C10457l.m35317b(r1)
            int r5 = r4.f28091c
            int r8 = r1.f28091c
            r9 = r6
        L_0x003a:
            long r11 = r20.size()
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0008
            int r11 = r4.f28092d
            int r11 = r11 - r5
            int r12 = r1.f28092d
            int r12 = r12 - r8
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r6
        L_0x004e:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x006a
            byte[] r15 = r4.f28090b
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f28090b
            int r17 = r8 + 1
            byte r8 = r15[r8]
            if (r5 == r8) goto L_0x0061
            goto L_0x0082
        L_0x0061:
            r18 = 1
            long r13 = r13 + r18
            r5 = r16
            r8 = r17
            goto L_0x004e
        L_0x006a:
            int r13 = r4.f28092d
            if (r5 != r13) goto L_0x0075
            i.y r4 = r4.f28095g
            p455g.p470y.p472d.C10457l.m35317b(r4)
            int r5 = r4.f28091c
        L_0x0075:
            int r13 = r1.f28092d
            if (r8 != r13) goto L_0x0080
            i.y r1 = r1.f28095g
            p455g.p470y.p472d.C10457l.m35317b(r1)
            int r8 = r1.f28091c
        L_0x0080:
            long r9 = r9 + r11
            goto L_0x003a
        L_0x0082:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p493i.C10603f.equals(java.lang.Object):boolean");
    }

    public void flush() {
    }

    /* renamed from: g0 */
    public long mo26354g0(C10590b0 b0Var) {
        C10457l.m35320e(b0Var, "sink");
        long size = size();
        if (size > 0) {
            b0Var.write(this, size);
        }
        return size;
    }

    public int hashCode() {
        C10636y yVar = this.f28034f;
        if (yVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = yVar.f28092d;
            for (int i3 = yVar.f28091c; i3 < i2; i3++) {
                i = (i * 31) + yVar.f28090b[i3];
            }
            yVar = yVar.f28095g;
            C10457l.m35317b(yVar);
        } while (yVar != this.f28034f);
        return i;
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j0 */
    public C10615h mo26357j0() {
        return C10625q.m36156d(new C10631v(this));
    }

    /* renamed from: l */
    public void mo26358l(long j) {
        while (j > 0) {
            C10636y yVar = this.f28034f;
            if (yVar != null) {
                int min = (int) Math.min(j, (long) (yVar.f28092d - yVar.f28091c));
                long j2 = (long) min;
                mo26322L0(size() - j2);
                j -= j2;
                int i = yVar.f28091c + min;
                yVar.f28091c = i;
                if (i == yVar.f28092d) {
                    this.f28034f = yVar.mo26476b();
                    C10638z.m36238b(yVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: l0 */
    public void mo26359l0(long j) {
        if (this.f28035o < j) {
            throw new EOFException();
        }
    }

    /* renamed from: n0 */
    public C10603f clone() {
        return mo26380u0();
    }

    /* renamed from: o0 */
    public OutputStream mo26362o0() {
        return new C10606c(this);
    }

    /* renamed from: p */
    public C10603f mo26363p() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009a, code lost:
        if (r8 != r9) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        r15.f28034f = r6.mo26476b();
        p493i.C10638z.m36238b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        r6.f28091c = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        if (r1 != false) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007f A[SYNTHETIC] */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo26364p0() {
        /*
            r15 = this;
            long r0 = r15.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00b8
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000d:
            i.y r6 = r15.f28034f
            p455g.p470y.p472d.C10457l.m35317b(r6)
            byte[] r7 = r6.f28090b
            int r8 = r6.f28091c
            int r9 = r6.f28092d
        L_0x0018:
            if (r8 >= r9) goto L_0x009a
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0029
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0029
            int r11 = r10 - r11
            goto L_0x0043
        L_0x0029:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0038
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0038
        L_0x0033:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0043
        L_0x0038:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x007b
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x007b
            goto L_0x0033
        L_0x0043:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0053
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0018
        L_0x0053:
            i.f r0 = new i.f
            r0.<init>()
            i.f r0 = r0.mo26332R(r4)
            i.f r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo26319J0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x007b:
            if (r0 == 0) goto L_0x007f
            r1 = 1
            goto L_0x009a
        L_0x007f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = p493i.C10591c.m35969e(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009a:
            if (r8 != r9) goto L_0x00a6
            i.y r7 = r6.mo26476b()
            r15.f28034f = r7
            p493i.C10638z.m36238b(r6)
            goto L_0x00a8
        L_0x00a6:
            r6.f28091c = r8
        L_0x00a8:
            if (r1 != 0) goto L_0x00ae
            i.y r6 = r15.f28034f
            if (r6 != 0) goto L_0x000d
        L_0x00ae:
            long r1 = r15.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.mo26322L0(r1)
            return r4
        L_0x00b8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p493i.C10603f.mo26364p0():long");
    }

    /* renamed from: q */
    public C10616i mo26365q(long j) {
        if (!(j >= 0 && j <= ((long) RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (size() < j) {
            throw new EOFException();
        } else if (j < ((long) 4096)) {
            return new C10616i(mo26344Z(j));
        } else {
            C10616i N0 = mo26326N0((int) j);
            mo26358l(j);
            return N0;
        }
    }

    /* renamed from: r */
    public final void mo26366r() {
        mo26358l(size());
    }

    /* renamed from: r0 */
    public InputStream mo26367r0() {
        return new C10605b(this);
    }

    public int read(ByteBuffer byteBuffer) {
        C10457l.m35320e(byteBuffer, "sink");
        C10636y yVar = this.f28034f;
        if (yVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), yVar.f28092d - yVar.f28091c);
        byteBuffer.put(yVar.f28090b, yVar.f28091c, min);
        int i = yVar.f28091c + min;
        yVar.f28091c = i;
        this.f28035o -= (long) min;
        if (i == yVar.f28092d) {
            this.f28034f = yVar.mo26476b();
            C10638z.m36238b(yVar);
        }
        return min;
    }

    public long read(C10603f fVar, long j) {
        C10457l.m35320e(fVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (size() == 0) {
            return -1;
        } else {
            if (j > size()) {
                j = size();
            }
            fVar.write(this, j);
            return j;
        }
    }

    public byte readByte() {
        if (size() != 0) {
            C10636y yVar = this.f28034f;
            C10457l.m35317b(yVar);
            int i = yVar.f28091c;
            int i2 = yVar.f28092d;
            int i3 = i + 1;
            byte b = yVar.f28090b[i];
            mo26322L0(size() - 1);
            if (i3 == i2) {
                this.f28034f = yVar.mo26476b();
                C10638z.m36238b(yVar);
            } else {
                yVar.f28091c = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public void readFully(byte[] bArr) {
        C10457l.m35320e(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int D0 = mo26313D0(bArr, i, bArr.length - i);
            if (D0 != -1) {
                i += D0;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        if (size() >= 4) {
            C10636y yVar = this.f28034f;
            C10457l.m35317b(yVar);
            int i = yVar.f28091c;
            int i2 = yVar.f28092d;
            if (((long) (i2 - i)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = yVar.f28090b;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            mo26322L0(size() - 4);
            if (i6 == i2) {
                this.f28034f = yVar.mo26476b();
                C10638z.m36238b(yVar);
            } else {
                yVar.f28091c = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    public long readLong() {
        if (size() >= 8) {
            C10636y yVar = this.f28034f;
            C10457l.m35317b(yVar);
            int i = yVar.f28091c;
            int i2 = yVar.f28092d;
            if (((long) (i2 - i)) < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = yVar.f28090b;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40);
            int i6 = i5 + 1;
            long j2 = ((((long) bArr[i5]) & 255) << 32) | j;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            long j3 = j2 | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16);
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j4 = j3 | ((((long) bArr[i8]) & 255) << 8) | (((long) bArr[i9]) & 255);
            mo26322L0(size() - 8);
            if (i10 == i2) {
                this.f28034f = yVar.mo26476b();
                C10638z.m36238b(yVar);
            } else {
                yVar.f28091c = i10;
            }
            return j4;
        }
        throw new EOFException();
    }

    public short readShort() {
        if (size() >= 2) {
            C10636y yVar = this.f28034f;
            C10457l.m35317b(yVar);
            int i = yVar.f28091c;
            int i2 = yVar.f28092d;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = yVar.f28090b;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            mo26322L0(size() - 2);
            if (i4 == i2) {
                this.f28034f = yVar.mo26476b();
                C10638z.m36238b(yVar);
            } else {
                yVar.f28091c = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    /* renamed from: s0 */
    public final long mo26375s0() {
        long size = size();
        if (size == 0) {
            return 0;
        }
        C10636y yVar = this.f28034f;
        C10457l.m35317b(yVar);
        C10636y yVar2 = yVar.f28096h;
        C10457l.m35317b(yVar2);
        int i = yVar2.f28092d;
        if (i < 8192 && yVar2.f28094f) {
            size -= (long) (i - yVar2.f28091c);
        }
        return size;
    }

    public final long size() {
        return this.f28035o;
    }

    /* renamed from: t0 */
    public int mo26377t0(C10628t tVar) {
        C10457l.m35320e(tVar, "options");
        int e = C10609a.m36069e(this, tVar, false, 2, (Object) null);
        if (e == -1) {
            return -1;
        }
        mo26358l((long) tVar.mo26446j()[e].mo26420Y());
        return e;
    }

    public C10600e0 timeout() {
        return C10600e0.NONE;
    }

    public String toString() {
        return mo26324M0().toString();
    }

    /* renamed from: u */
    public byte[] mo26379u() {
        return mo26344Z(size());
    }

    /* renamed from: u0 */
    public final C10603f mo26380u0() {
        C10603f fVar = new C10603f();
        if (size() != 0) {
            C10636y yVar = this.f28034f;
            C10457l.m35317b(yVar);
            C10636y d = yVar.mo26478d();
            fVar.f28034f = d;
            d.f28096h = d;
            d.f28095g = d;
            for (C10636y yVar2 = yVar.f28095g; yVar2 != yVar; yVar2 = yVar2.f28095g) {
                C10636y yVar3 = d.f28096h;
                C10457l.m35317b(yVar3);
                C10457l.m35317b(yVar2);
                yVar3.mo26477c(yVar2.mo26478d());
            }
            fVar.mo26322L0(size());
        }
        return fVar;
    }

    /* renamed from: v0 */
    public final C10603f mo26381v0(C10603f fVar, long j, long j2) {
        C10457l.m35320e(fVar, "out");
        C10591c.m35966b(size(), j, j2);
        if (j2 != 0) {
            fVar.mo26322L0(fVar.size() + j2);
            C10636y yVar = this.f28034f;
            while (true) {
                C10457l.m35317b(yVar);
                int i = yVar.f28092d;
                int i2 = yVar.f28091c;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                yVar = yVar.f28095g;
            }
            while (j2 > 0) {
                C10457l.m35317b(yVar);
                C10636y d = yVar.mo26478d();
                int i3 = d.f28091c + ((int) j);
                d.f28091c = i3;
                d.f28092d = Math.min(i3 + ((int) j2), d.f28092d);
                C10636y yVar2 = fVar.f28034f;
                if (yVar2 == null) {
                    d.f28096h = d;
                    d.f28095g = d;
                    fVar.f28034f = d;
                } else {
                    C10457l.m35317b(yVar2);
                    C10636y yVar3 = yVar2.f28096h;
                    C10457l.m35317b(yVar3);
                    yVar3.mo26477c(d);
                }
                j2 -= (long) (d.f28092d - d.f28091c);
                yVar = yVar.f28095g;
                j = 0;
            }
        }
        return this;
    }

    /* renamed from: w */
    public long mo26382w(C10616i iVar) {
        C10457l.m35320e(iVar, "bytes");
        return mo26307A0(iVar, 0);
    }

    /* renamed from: w0 */
    public C10603f mo26374s() {
        return this;
    }

    public int write(ByteBuffer byteBuffer) {
        C10457l.m35320e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C10636y O0 = mo26327O0(1);
            int min = Math.min(i, 8192 - O0.f28092d);
            byteBuffer.get(O0.f28090b, O0.f28092d, min);
            i -= min;
            O0.f28092d += min;
        }
        this.f28035o += (long) remaining;
        return remaining;
    }

    public void write(C10603f fVar, long j) {
        C10636y yVar;
        C10457l.m35320e(fVar, "source");
        if (fVar != this) {
            C10591c.m35966b(fVar.size(), 0, j);
            while (j > 0) {
                C10636y yVar2 = fVar.f28034f;
                C10457l.m35317b(yVar2);
                int i = yVar2.f28092d;
                C10636y yVar3 = fVar.f28034f;
                C10457l.m35317b(yVar3);
                if (j < ((long) (i - yVar3.f28091c))) {
                    C10636y yVar4 = this.f28034f;
                    if (yVar4 != null) {
                        C10457l.m35317b(yVar4);
                        yVar = yVar4.f28096h;
                    } else {
                        yVar = null;
                    }
                    if (yVar != null && yVar.f28094f) {
                        if ((((long) yVar.f28092d) + j) - ((long) (yVar.f28093e ? 0 : yVar.f28091c)) <= ((long) 8192)) {
                            C10636y yVar5 = fVar.f28034f;
                            C10457l.m35317b(yVar5);
                            yVar5.mo26481g(yVar, (int) j);
                            fVar.mo26322L0(fVar.size() - j);
                            mo26322L0(size() + j);
                            return;
                        }
                    }
                    C10636y yVar6 = fVar.f28034f;
                    C10457l.m35317b(yVar6);
                    fVar.f28034f = yVar6.mo26479e((int) j);
                }
                C10636y yVar7 = fVar.f28034f;
                C10457l.m35317b(yVar7);
                long j2 = (long) (yVar7.f28092d - yVar7.f28091c);
                fVar.f28034f = yVar7.mo26476b();
                C10636y yVar8 = this.f28034f;
                if (yVar8 == null) {
                    this.f28034f = yVar7;
                    yVar7.f28096h = yVar7;
                    yVar7.f28095g = yVar7;
                } else {
                    C10457l.m35317b(yVar8);
                    C10636y yVar9 = yVar8.f28096h;
                    C10457l.m35317b(yVar9);
                    yVar9.mo26477c(yVar7).mo26475a();
                }
                fVar.mo26322L0(fVar.size() - j2);
                mo26322L0(size() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* renamed from: x */
    public boolean mo26390x() {
        return this.f28035o == 0;
    }

    /* renamed from: x0 */
    public C10603f mo26310C() {
        return this;
    }

    /* renamed from: y0 */
    public final byte mo26392y0(long j) {
        C10591c.m35966b(size(), j, 1);
        C10636y yVar = this.f28034f;
        if (yVar == null) {
            C10457l.m35317b((Object) null);
            throw null;
        } else if (size() - j < j) {
            long size = size();
            while (size > j) {
                yVar = yVar.f28096h;
                C10457l.m35317b(yVar);
                size -= (long) (yVar.f28092d - yVar.f28091c);
            }
            C10457l.m35317b(yVar);
            return yVar.f28090b[(int) ((((long) yVar.f28091c) + j) - size)];
        } else {
            long j2 = 0;
            while (true) {
                long j3 = ((long) (yVar.f28092d - yVar.f28091c)) + j2;
                if (j3 > j) {
                    C10457l.m35317b(yVar);
                    return yVar.f28090b[(int) ((((long) yVar.f28091c) + j) - j2)];
                }
                yVar = yVar.f28095g;
                C10457l.m35317b(yVar);
                j2 = j3;
            }
        }
    }

    /* renamed from: z */
    public void mo26393z(C10603f fVar, long j) {
        C10457l.m35320e(fVar, "sink");
        if (size() >= j) {
            fVar.write(this, j);
        } else {
            fVar.write(this, size());
            throw new EOFException();
        }
    }

    /* renamed from: z0 */
    public long mo26394z0(byte b, long j, long j2) {
        C10636y yVar;
        long j3;
        int i;
        long j4 = 0;
        if (0 <= j && j2 >= j) {
            if (j2 > size()) {
                j2 = size();
            }
            if (j == j2 || (yVar = this.f28034f) == null) {
                return -1;
            }
            if (size() - j < j) {
                j3 = size();
                while (j3 > j) {
                    yVar = yVar.f28096h;
                    C10457l.m35317b(yVar);
                    j3 -= (long) (yVar.f28092d - yVar.f28091c);
                }
                while (j3 < j2) {
                    byte[] bArr = yVar.f28090b;
                    int min = (int) Math.min((long) yVar.f28092d, (((long) yVar.f28091c) + j2) - j3);
                    i = (int) ((((long) yVar.f28091c) + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b) {
                            i++;
                        }
                    }
                    j3 += (long) (yVar.f28092d - yVar.f28091c);
                    yVar = yVar.f28095g;
                    C10457l.m35317b(yVar);
                    j = j3;
                }
                return -1;
            }
            while (true) {
                long j5 = ((long) (yVar.f28092d - yVar.f28091c)) + j4;
                if (j5 > j) {
                    break;
                }
                yVar = yVar.f28095g;
                C10457l.m35317b(yVar);
                j4 = j5;
            }
            while (j3 < j2) {
                byte[] bArr2 = yVar.f28090b;
                int min2 = (int) Math.min((long) yVar.f28092d, (((long) yVar.f28091c) + j2) - j3);
                int i2 = (int) ((((long) yVar.f28091c) + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b) {
                        i2 = i + 1;
                    }
                }
                j4 = j3 + ((long) (yVar.f28092d - yVar.f28091c));
                yVar = yVar.f28095g;
                C10457l.m35317b(yVar);
                j = j4;
            }
            return -1;
            return ((long) (i - yVar.f28091c)) + j3;
        }
        throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }
}
