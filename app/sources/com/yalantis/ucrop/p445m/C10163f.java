package com.yalantis.ucrop.p445m;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p027c.p084n.p085a.C2049a;

/* renamed from: com.yalantis.ucrop.m.f */
public class C10163f {

    /* renamed from: a */
    private static final byte[] f27131a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f27132b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: c */
    private final C10165b f27133c;

    /* renamed from: com.yalantis.ucrop.m.f$a */
    private static class C10164a {

        /* renamed from: a */
        private final ByteBuffer f27134a;

        public C10164a(byte[] bArr, int i) {
            this.f27134a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        public short mo25277a(int i) {
            return this.f27134a.getShort(i);
        }

        /* renamed from: b */
        public int mo25278b(int i) {
            return this.f27134a.getInt(i);
        }

        /* renamed from: c */
        public int mo25279c() {
            return this.f27134a.remaining();
        }

        /* renamed from: d */
        public void mo25280d(ByteOrder byteOrder) {
            this.f27134a.order(byteOrder);
        }
    }

    /* renamed from: com.yalantis.ucrop.m.f$b */
    private interface C10165b {
        /* renamed from: l */
        long mo25281l(long j);

        /* renamed from: m */
        int mo25282m();

        /* renamed from: n */
        int mo25283n(byte[] bArr, int i);

        /* renamed from: o */
        short mo25284o();
    }

    /* renamed from: com.yalantis.ucrop.m.f$c */
    private static class C10166c implements C10165b {

        /* renamed from: a */
        private final InputStream f27135a;

        public C10166c(InputStream inputStream) {
            this.f27135a = inputStream;
        }

        /* renamed from: l */
        public long mo25281l(long j) {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f27135a.skip(j2);
                if (skip <= 0) {
                    if (this.f27135a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        /* renamed from: m */
        public int mo25282m() {
            return ((this.f27135a.read() << 8) & 65280) | (this.f27135a.read() & 255);
        }

        /* renamed from: n */
        public int mo25283n(byte[] bArr, int i) {
            int i2 = i;
            while (i2 > 0) {
                int read = this.f27135a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }

        /* renamed from: o */
        public short mo25284o() {
            return (short) (this.f27135a.read() & 255);
        }
    }

    public C10163f(InputStream inputStream) {
        this.f27133c = new C10166c(inputStream);
    }

    /* renamed from: a */
    private static int m34392a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: b */
    public static void m34393b(C2049a aVar, int i, int i2, String str) {
        String[] strArr = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "PhotographicSensitivity", "Make", "Model", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
        try {
            C2049a aVar2 = new C2049a(str);
            for (int i3 = 0; i3 < 22; i3++) {
                String str2 = strArr[i3];
                String g = aVar.mo6895g(str2);
                if (!TextUtils.isEmpty(g)) {
                    aVar2.mo6892c0(str2, g);
                }
            }
            aVar2.mo6892c0("ImageWidth", String.valueOf(i));
            aVar2.mo6892c0("ImageLength", String.valueOf(i2));
            aVar2.mo6892c0("Orientation", "0");
            aVar2.mo6890X();
        } catch (IOException e) {
            Log.d("ImageHeaderParser", e.getMessage());
        }
    }

    /* renamed from: d */
    private static boolean m34394d(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: e */
    private boolean m34395e(byte[] bArr, int i) {
        boolean z = bArr != null && i > f27131a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f27131a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: f */
    private int m34396f() {
        short o;
        int m;
        long j;
        long l;
        do {
            short o2 = this.f27133c.mo25284o();
            if (o2 != 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Unknown segmentId=" + o2);
                }
                return -1;
            }
            o = this.f27133c.mo25284o();
            if (o == 218) {
                return -1;
            }
            if (o == 217) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            m = this.f27133c.mo25282m() - 2;
            if (o == 225) {
                return m;
            }
            j = (long) m;
            l = this.f27133c.mo25281l(j);
        } while (l == j);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to skip enough data, type: " + o + ", wanted to skip: " + m + ", but actually skipped: " + l);
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0042  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m34397g(com.yalantis.ucrop.p445m.C10163f.C10164a r12) {
        /*
            r0 = 6
            short r1 = r12.mo25277a(r0)
            r2 = 3
            java.lang.String r3 = "ImageHeaderParser"
            r4 = 19789(0x4d4d, float:2.773E-41)
            if (r1 != r4) goto L_0x000f
        L_0x000c:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            goto L_0x0031
        L_0x000f:
            r4 = 18761(0x4949, float:2.629E-41)
            if (r1 != r4) goto L_0x0016
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            goto L_0x0031
        L_0x0016:
            boolean r4 = android.util.Log.isLoggable(r3, r2)
            if (r4 == 0) goto L_0x000c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unknown endianness = "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            android.util.Log.d(r3, r1)
            goto L_0x000c
        L_0x0031:
            r12.mo25280d(r1)
            r1 = 10
            int r1 = r12.mo25278b(r1)
            int r1 = r1 + r0
            short r0 = r12.mo25277a(r1)
            r4 = 0
        L_0x0040:
            if (r4 >= r0) goto L_0x0123
            int r5 = m34392a(r1, r4)
            short r6 = r12.mo25277a(r5)
            r7 = 274(0x112, float:3.84E-43)
            if (r6 == r7) goto L_0x0050
            goto L_0x011f
        L_0x0050:
            int r7 = r5 + 2
            short r7 = r12.mo25277a(r7)
            r8 = 1
            if (r7 < r8) goto L_0x0105
            r8 = 12
            if (r7 <= r8) goto L_0x005f
            goto L_0x0105
        L_0x005f:
            int r8 = r5 + 4
            int r8 = r12.mo25278b(r8)
            if (r8 >= 0) goto L_0x0071
            boolean r5 = android.util.Log.isLoggable(r3, r2)
            if (r5 == 0) goto L_0x011f
            java.lang.String r5 = "Negative tiff component count"
            goto L_0x011c
        L_0x0071:
            boolean r9 = android.util.Log.isLoggable(r3, r2)
            java.lang.String r10 = " tagType="
            if (r9 == 0) goto L_0x00a3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "Got tagIndex="
            r9.append(r11)
            r9.append(r4)
            r9.append(r10)
            r9.append(r6)
            java.lang.String r11 = " formatCode="
            r9.append(r11)
            r9.append(r7)
            java.lang.String r11 = " componentCount="
            r9.append(r11)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r3, r9)
        L_0x00a3:
            int[] r9 = f27132b
            r9 = r9[r7]
            int r8 = r8 + r9
            r9 = 4
            if (r8 <= r9) goto L_0x00b9
            boolean r5 = android.util.Log.isLoggable(r3, r2)
            if (r5 == 0) goto L_0x011f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Got byte count > 4, not orientation, continuing, formatCode="
            goto L_0x0112
        L_0x00b9:
            int r5 = r5 + 8
            if (r5 < 0) goto L_0x00e7
            int r7 = r12.mo25279c()
            if (r5 <= r7) goto L_0x00c4
            goto L_0x00e7
        L_0x00c4:
            if (r8 < 0) goto L_0x00d3
            int r8 = r8 + r5
            int r7 = r12.mo25279c()
            if (r8 <= r7) goto L_0x00ce
            goto L_0x00d3
        L_0x00ce:
            short r12 = r12.mo25277a(r5)
            return r12
        L_0x00d3:
            boolean r5 = android.util.Log.isLoggable(r3, r2)
            if (r5 == 0) goto L_0x011f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Illegal number of bytes for TI tag data tagType="
            r5.append(r7)
            r5.append(r6)
            goto L_0x0118
        L_0x00e7:
            boolean r7 = android.util.Log.isLoggable(r3, r2)
            if (r7 == 0) goto L_0x011f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Illegal tagValueOffset="
            r7.append(r8)
            r7.append(r5)
            r7.append(r10)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            goto L_0x011c
        L_0x0105:
            boolean r5 = android.util.Log.isLoggable(r3, r2)
            if (r5 == 0) goto L_0x011f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Got invalid format code = "
        L_0x0112:
            r5.append(r6)
            r5.append(r7)
        L_0x0118:
            java.lang.String r5 = r5.toString()
        L_0x011c:
            android.util.Log.d(r3, r5)
        L_0x011f:
            int r4 = r4 + 1
            goto L_0x0040
        L_0x0123:
            r12 = -1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.p445m.C10163f.m34397g(com.yalantis.ucrop.m.f$a):int");
    }

    /* renamed from: h */
    private int m34398h(byte[] bArr, int i) {
        int n = this.f27133c.mo25283n(bArr, i);
        if (n != i) {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + n);
            }
            return -1;
        } else if (m34395e(bArr, i)) {
            return m34397g(new C10164a(bArr, i));
        } else {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    /* renamed from: c */
    public int mo25276c() {
        int m = this.f27133c.mo25282m();
        if (!m34394d(m)) {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Parser doesn't handle magic number: " + m);
            }
            return -1;
        }
        int f = m34396f();
        if (f != -1) {
            return m34398h(new byte[f], f);
        }
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
        }
        return -1;
    }
}
