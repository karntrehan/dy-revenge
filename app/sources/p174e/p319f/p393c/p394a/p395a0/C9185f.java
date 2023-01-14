package p174e.p319f.p393c.p394a.p395a0;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: e.f.c.a.a0.f */
public final class C9185f {

    /* renamed from: a */
    private static final Charset f25076a = Charset.forName("UTF-8");

    /* renamed from: e.f.c.a.a0.f$a */
    static abstract class C9186a {

        /* renamed from: a */
        public byte[] f25077a;

        /* renamed from: b */
        public int f25078b;

        C9186a() {
        }
    }

    /* renamed from: e.f.c.a.a0.f$b */
    static class C9187b extends C9186a {

        /* renamed from: c */
        private static final int[] f25079c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: d */
        private static final int[] f25080d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: e */
        private int f25081e;

        /* renamed from: f */
        private int f25082f;

        /* renamed from: g */
        private final int[] f25083g;

        public C9187b(int i, byte[] bArr) {
            this.f25077a = bArr;
            this.f25083g = (i & 8) == 0 ? f25079c : f25080d;
            this.f25081e = 0;
            this.f25082f = 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
            r0.f25081e = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c0, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ef, code lost:
            if (r20 != false) goto L_0x00f8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f1, code lost:
            r0.f25081e = r5;
            r0.f25082f = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f5, code lost:
            r0.f25078b = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f7, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f8, code lost:
            if (r5 == 1) goto L_0x00bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fa, code lost:
            if (r5 == 2) goto L_0x0110;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fc, code lost:
            if (r5 == 3) goto L_0x0101;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fe, code lost:
            if (r5 == 4) goto L_0x00bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0101, code lost:
            r1 = r9 + 1;
            r6[r9] = (byte) (r8 >> 10);
            r9 = r1 + 1;
            r6[r1] = (byte) (r8 >> 2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0110, code lost:
            r6[r9] = (byte) (r8 >> 4);
            r9 = r9 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0118, code lost:
            r0.f25081e = r5;
         */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x00ef A[EDGE_INSN: B:69:0x00ef->B:54:0x00ef ?: BREAK  , SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo23167a(byte[] r17, int r18, int r19, boolean r20) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f25081e
                r2 = 0
                r3 = 6
                if (r1 != r3) goto L_0x0009
                return r2
            L_0x0009:
                int r4 = r19 + r18
                int r5 = r0.f25082f
                byte[] r6 = r0.f25077a
                int[] r7 = r0.f25083g
                r8 = r5
                r9 = 0
                r5 = r1
                r1 = r18
            L_0x0016:
                r10 = 3
                r11 = 4
                r12 = 2
                r13 = 1
                if (r1 >= r4) goto L_0x00ef
                if (r5 != 0) goto L_0x0063
            L_0x001e:
                int r14 = r1 + 4
                if (r14 > r4) goto L_0x005f
                byte r8 = r17[r1]
                r8 = r8 & 255(0xff, float:3.57E-43)
                r8 = r7[r8]
                int r8 = r8 << 18
                int r15 = r1 + 1
                byte r15 = r17[r15]
                r15 = r15 & 255(0xff, float:3.57E-43)
                r15 = r7[r15]
                int r15 = r15 << 12
                r8 = r8 | r15
                int r15 = r1 + 2
                byte r15 = r17[r15]
                r15 = r15 & 255(0xff, float:3.57E-43)
                r15 = r7[r15]
                int r15 = r15 << r3
                r8 = r8 | r15
                int r15 = r1 + 3
                byte r15 = r17[r15]
                r15 = r15 & 255(0xff, float:3.57E-43)
                r15 = r7[r15]
                r8 = r8 | r15
                if (r8 < 0) goto L_0x005f
                int r1 = r9 + 2
                byte r15 = (byte) r8
                r6[r1] = r15
                int r1 = r9 + 1
                int r15 = r8 >> 8
                byte r15 = (byte) r15
                r6[r1] = r15
                int r1 = r8 >> 16
                byte r1 = (byte) r1
                r6[r9] = r1
                int r9 = r9 + 3
                r1 = r14
                goto L_0x001e
            L_0x005f:
                if (r1 < r4) goto L_0x0063
                goto L_0x00ef
            L_0x0063:
                int r14 = r1 + 1
                byte r1 = r17[r1]
                r1 = r1 & 255(0xff, float:3.57E-43)
                r1 = r7[r1]
                r15 = 5
                r2 = -1
                if (r5 == 0) goto L_0x00df
                if (r5 == r13) goto L_0x00d3
                r13 = -2
                if (r5 == r12) goto L_0x00c1
                if (r5 == r10) goto L_0x008e
                if (r5 == r11) goto L_0x0082
                if (r5 == r15) goto L_0x007c
                goto L_0x00eb
            L_0x007c:
                if (r1 == r2) goto L_0x00eb
            L_0x007e:
                r0.f25081e = r3
                r10 = 0
                return r10
            L_0x0082:
                r10 = 0
                if (r1 != r13) goto L_0x0089
                int r5 = r5 + 1
                goto L_0x00eb
            L_0x0089:
                if (r1 == r2) goto L_0x00eb
                r0.f25081e = r3
                return r10
            L_0x008e:
                if (r1 < 0) goto L_0x00a9
                int r2 = r8 << 6
                r1 = r1 | r2
                int r2 = r9 + 2
                byte r5 = (byte) r1
                r6[r2] = r5
                int r2 = r9 + 1
                int r5 = r1 >> 8
                byte r5 = (byte) r5
                r6[r2] = r5
                int r2 = r1 >> 16
                byte r2 = (byte) r2
                r6[r9] = r2
                int r9 = r9 + 3
                r8 = r1
                r5 = 0
                goto L_0x00eb
            L_0x00a9:
                if (r1 != r13) goto L_0x00bb
                int r1 = r9 + 1
                int r2 = r8 >> 2
                byte r2 = (byte) r2
                r6[r1] = r2
                int r1 = r8 >> 10
                byte r1 = (byte) r1
                r6[r9] = r1
                int r9 = r9 + 2
                r5 = 5
                goto L_0x00eb
            L_0x00bb:
                if (r1 == r2) goto L_0x00eb
            L_0x00bd:
                r0.f25081e = r3
                r1 = 0
                return r1
            L_0x00c1:
                if (r1 < 0) goto L_0x00c4
                goto L_0x00d6
            L_0x00c4:
                if (r1 != r13) goto L_0x00d0
                int r1 = r9 + 1
                int r2 = r8 >> 4
                byte r2 = (byte) r2
                r6[r9] = r2
                r9 = r1
                r5 = 4
                goto L_0x00eb
            L_0x00d0:
                if (r1 == r2) goto L_0x00eb
                goto L_0x007e
            L_0x00d3:
                r10 = 0
                if (r1 < 0) goto L_0x00da
            L_0x00d6:
                int r2 = r8 << 6
                r1 = r1 | r2
                goto L_0x00e2
            L_0x00da:
                if (r1 == r2) goto L_0x00eb
                r0.f25081e = r3
                return r10
            L_0x00df:
                r10 = 0
                if (r1 < 0) goto L_0x00e6
            L_0x00e2:
                int r5 = r5 + 1
                r8 = r1
                goto L_0x00eb
            L_0x00e6:
                if (r1 == r2) goto L_0x00eb
                r0.f25081e = r3
                return r10
            L_0x00eb:
                r1 = r14
                r2 = 0
                goto L_0x0016
            L_0x00ef:
                if (r20 != 0) goto L_0x00f8
                r0.f25081e = r5
                r0.f25082f = r8
            L_0x00f5:
                r0.f25078b = r9
                return r13
            L_0x00f8:
                if (r5 == r13) goto L_0x00bd
                if (r5 == r12) goto L_0x0110
                if (r5 == r10) goto L_0x0101
                if (r5 == r11) goto L_0x00bd
                goto L_0x0118
            L_0x0101:
                int r1 = r9 + 1
                int r2 = r8 >> 10
                byte r2 = (byte) r2
                r6[r9] = r2
                int r9 = r1 + 1
                int r2 = r8 >> 2
                byte r2 = (byte) r2
                r6[r1] = r2
                goto L_0x0118
            L_0x0110:
                int r1 = r9 + 1
                int r2 = r8 >> 4
                byte r2 = (byte) r2
                r6[r9] = r2
                r9 = r1
            L_0x0118:
                r0.f25081e = r5
                goto L_0x00f5
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p395a0.C9185f.C9187b.mo23167a(byte[], int, int, boolean):boolean");
        }
    }

    /* renamed from: e.f.c.a.a0.f$c */
    static class C9188c extends C9186a {

        /* renamed from: c */
        private static final byte[] f25084c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: d */
        private static final byte[] f25085d = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: e */
        private final byte[] f25086e;

        /* renamed from: f */
        int f25087f;

        /* renamed from: g */
        private int f25088g;

        /* renamed from: h */
        public final boolean f25089h;

        /* renamed from: i */
        public final boolean f25090i;

        /* renamed from: j */
        public final boolean f25091j;

        /* renamed from: k */
        private final byte[] f25092k;

        public C9188c(int i, byte[] bArr) {
            this.f25077a = bArr;
            boolean z = true;
            this.f25089h = (i & 1) == 0;
            boolean z2 = (i & 2) == 0;
            this.f25090i = z2;
            this.f25091j = (i & 4) == 0 ? false : z;
            this.f25092k = (i & 8) == 0 ? f25084c : f25085d;
            this.f25086e = new byte[2];
            this.f25087f = 0;
            this.f25088g = z2 ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01af  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x00e6 A[SYNTHETIC] */
        /* renamed from: a */
        public boolean mo23168a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                r17 = this;
                r0 = r17
                byte[] r1 = r0.f25092k
                byte[] r2 = r0.f25077a
                int r3 = r0.f25088g
                int r4 = r20 + r19
                int r5 = r0.f25087f
                r6 = -1
                r7 = 0
                r8 = 2
                r9 = 1
                if (r5 == r9) goto L_0x0031
                if (r5 == r8) goto L_0x0015
                goto L_0x0050
            L_0x0015:
                int r5 = r19 + 1
                if (r5 > r4) goto L_0x0050
                byte[] r10 = r0.f25086e
                byte r11 = r10[r7]
                r11 = r11 & 255(0xff, float:3.57E-43)
                int r11 = r11 << 16
                byte r10 = r10[r9]
                r10 = r10 & 255(0xff, float:3.57E-43)
                int r10 = r10 << 8
                r10 = r10 | r11
                byte r11 = r18[r19]
                r11 = r11 & 255(0xff, float:3.57E-43)
                r10 = r10 | r11
                r0.f25087f = r7
                r11 = r5
                goto L_0x0053
            L_0x0031:
                int r5 = r19 + 2
                if (r5 > r4) goto L_0x0050
                byte[] r5 = r0.f25086e
                byte r5 = r5[r7]
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r5 = r5 << 16
                int r10 = r19 + 1
                byte r11 = r18[r19]
                r11 = r11 & 255(0xff, float:3.57E-43)
                int r11 = r11 << 8
                r5 = r5 | r11
                int r11 = r10 + 1
                byte r10 = r18[r10]
                r10 = r10 & 255(0xff, float:3.57E-43)
                r10 = r10 | r5
                r0.f25087f = r7
                goto L_0x0053
            L_0x0050:
                r11 = r19
                r10 = -1
            L_0x0053:
                r12 = 4
                r13 = 13
                r14 = 10
                if (r10 == r6) goto L_0x008f
                int r6 = r10 >> 18
                r6 = r6 & 63
                byte r6 = r1[r6]
                r2[r7] = r6
                int r6 = r10 >> 12
                r6 = r6 & 63
                byte r6 = r1[r6]
                r2[r9] = r6
                int r6 = r10 >> 6
                r6 = r6 & 63
                byte r6 = r1[r6]
                r2[r8] = r6
                r6 = r10 & 63
                byte r6 = r1[r6]
                r10 = 3
                r2[r10] = r6
                int r3 = r3 + -1
                if (r3 != 0) goto L_0x008d
                boolean r3 = r0.f25091j
                if (r3 == 0) goto L_0x0085
                r3 = 5
                r2[r12] = r13
                goto L_0x0086
            L_0x0085:
                r3 = 4
            L_0x0086:
                int r6 = r3 + 1
                r2[r3] = r14
            L_0x008a:
                r3 = 19
                goto L_0x0090
            L_0x008d:
                r6 = 4
                goto L_0x0090
            L_0x008f:
                r6 = 0
            L_0x0090:
                int r10 = r11 + 3
                if (r10 > r4) goto L_0x00e6
                byte r15 = r18[r11]
                r15 = r15 & 255(0xff, float:3.57E-43)
                int r15 = r15 << 16
                int r16 = r11 + 1
                byte r5 = r18[r16]
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r5 = r5 << 8
                r5 = r5 | r15
                int r11 = r11 + 2
                byte r11 = r18[r11]
                r11 = r11 & 255(0xff, float:3.57E-43)
                r5 = r5 | r11
                int r11 = r5 >> 18
                r11 = r11 & 63
                byte r11 = r1[r11]
                r2[r6] = r11
                int r11 = r6 + 1
                int r15 = r5 >> 12
                r15 = r15 & 63
                byte r15 = r1[r15]
                r2[r11] = r15
                int r11 = r6 + 2
                int r15 = r5 >> 6
                r15 = r15 & 63
                byte r15 = r1[r15]
                r2[r11] = r15
                int r11 = r6 + 3
                r5 = r5 & 63
                byte r5 = r1[r5]
                r2[r11] = r5
                int r6 = r6 + 4
                int r3 = r3 + -1
                if (r3 != 0) goto L_0x00e4
                boolean r3 = r0.f25091j
                if (r3 == 0) goto L_0x00dd
                int r3 = r6 + 1
                r2[r6] = r13
                r6 = r3
            L_0x00dd:
                int r3 = r6 + 1
                r2[r6] = r14
                r6 = r3
                r11 = r10
                goto L_0x008a
            L_0x00e4:
                r11 = r10
                goto L_0x0090
            L_0x00e6:
                if (r21 == 0) goto L_0x01af
                int r5 = r0.f25087f
                int r10 = r11 - r5
                int r15 = r4 + -1
                r16 = 61
                if (r10 != r15) goto L_0x0134
                if (r5 <= 0) goto L_0x00fa
                byte[] r4 = r0.f25086e
                byte r4 = r4[r7]
                r7 = 1
                goto L_0x00fc
            L_0x00fa:
                byte r4 = r18[r11]
            L_0x00fc:
                r4 = r4 & 255(0xff, float:3.57E-43)
                int r4 = r4 << r12
                int r5 = r5 - r7
                r0.f25087f = r5
                int r5 = r6 + 1
                int r7 = r4 >> 6
                r7 = r7 & 63
                byte r7 = r1[r7]
                r2[r6] = r7
                int r6 = r5 + 1
                r4 = r4 & 63
                byte r1 = r1[r4]
                r2[r5] = r1
                boolean r1 = r0.f25089h
                if (r1 == 0) goto L_0x0120
                int r1 = r6 + 1
                r2[r6] = r16
                int r6 = r1 + 1
                r2[r1] = r16
            L_0x0120:
                boolean r1 = r0.f25090i
                if (r1 == 0) goto L_0x01d8
                boolean r1 = r0.f25091j
                if (r1 == 0) goto L_0x012d
                int r1 = r6 + 1
                r2[r6] = r13
                r6 = r1
            L_0x012d:
                int r1 = r6 + 1
                r2[r6] = r14
            L_0x0131:
                r6 = r1
                goto L_0x01d8
            L_0x0134:
                int r10 = r11 - r5
                int r4 = r4 - r8
                if (r10 != r4) goto L_0x0197
                if (r5 <= r9) goto L_0x0141
                byte[] r4 = r0.f25086e
                byte r4 = r4[r7]
                r7 = 1
                goto L_0x0147
            L_0x0141:
                int r4 = r11 + 1
                byte r10 = r18[r11]
                r11 = r4
                r4 = r10
            L_0x0147:
                r4 = r4 & 255(0xff, float:3.57E-43)
                int r4 = r4 << r14
                if (r5 <= 0) goto L_0x0153
                byte[] r10 = r0.f25086e
                int r11 = r7 + 1
                byte r7 = r10[r7]
                goto L_0x0157
            L_0x0153:
                byte r10 = r18[r11]
                r11 = r7
                r7 = r10
            L_0x0157:
                r7 = r7 & 255(0xff, float:3.57E-43)
                int r7 = r7 << r8
                r4 = r4 | r7
                int r5 = r5 - r11
                r0.f25087f = r5
                int r5 = r6 + 1
                int r7 = r4 >> 12
                r7 = r7 & 63
                byte r7 = r1[r7]
                r2[r6] = r7
                int r6 = r5 + 1
                int r7 = r4 >> 6
                r7 = r7 & 63
                byte r7 = r1[r7]
                r2[r5] = r7
                int r5 = r6 + 1
                r4 = r4 & 63
                byte r1 = r1[r4]
                r2[r6] = r1
                boolean r1 = r0.f25089h
                if (r1 == 0) goto L_0x0183
                int r1 = r5 + 1
                r2[r5] = r16
                r5 = r1
            L_0x0183:
                boolean r1 = r0.f25090i
                if (r1 == 0) goto L_0x0195
                boolean r1 = r0.f25091j
                if (r1 == 0) goto L_0x0190
                int r1 = r5 + 1
                r2[r5] = r13
                r5 = r1
            L_0x0190:
                int r1 = r5 + 1
                r2[r5] = r14
                r5 = r1
            L_0x0195:
                r6 = r5
                goto L_0x01d8
            L_0x0197:
                boolean r1 = r0.f25090i
                if (r1 == 0) goto L_0x01d8
                if (r6 <= 0) goto L_0x01d8
                r1 = 19
                if (r3 == r1) goto L_0x01d8
                boolean r1 = r0.f25091j
                if (r1 == 0) goto L_0x01aa
                int r1 = r6 + 1
                r2[r6] = r13
                r6 = r1
            L_0x01aa:
                int r1 = r6 + 1
                r2[r6] = r14
                goto L_0x0131
            L_0x01af:
                int r1 = r4 + -1
                if (r11 != r1) goto L_0x01c0
                byte[] r1 = r0.f25086e
                int r2 = r0.f25087f
                int r4 = r2 + 1
                r0.f25087f = r4
                byte r4 = r18[r11]
                r1[r2] = r4
                goto L_0x01d8
            L_0x01c0:
                int r4 = r4 - r8
                if (r11 != r4) goto L_0x01d8
                byte[] r1 = r0.f25086e
                int r2 = r0.f25087f
                int r4 = r2 + 1
                r0.f25087f = r4
                byte r5 = r18[r11]
                r1[r2] = r5
                int r2 = r4 + 1
                r0.f25087f = r2
                int r11 = r11 + r9
                byte r2 = r18[r11]
                r1[r4] = r2
            L_0x01d8:
                r0.f25078b = r6
                r0.f25088g = r3
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p395a0.C9185f.C9188c.mo23168a(byte[], int, int, boolean):boolean");
        }
    }

    /* renamed from: a */
    public static byte[] m30521a(String str, int i) {
        return m30522b(str.getBytes(f25076a), i);
    }

    /* renamed from: b */
    public static byte[] m30522b(byte[] bArr, int i) {
        return m30523c(bArr, 0, bArr.length, i);
    }

    /* renamed from: c */
    public static byte[] m30523c(byte[] bArr, int i, int i2, int i3) {
        C9187b bVar = new C9187b(i3, new byte[((i2 * 3) / 4)]);
        if (bVar.mo23167a(bArr, i, i2, true)) {
            int i4 = bVar.f25078b;
            byte[] bArr2 = bVar.f25077a;
            if (i4 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr2, 0, bArr3, 0, i4);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    /* renamed from: d */
    public static String m30524d(byte[] bArr) {
        return m30527g(bArr, 2);
    }

    /* renamed from: e */
    public static byte[] m30525e(byte[] bArr, int i) {
        return m30526f(bArr, 0, bArr.length, i);
    }

    /* renamed from: f */
    public static byte[] m30526f(byte[] bArr, int i, int i2, int i3) {
        C9188c cVar = new C9188c(i3, (byte[]) null);
        int i4 = (i2 / 3) * 4;
        int i5 = 2;
        if (!cVar.f25089h) {
            int i6 = i2 % 3;
            if (i6 == 1) {
                i4 += 2;
            } else if (i6 == 2) {
                i4 += 3;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (cVar.f25090i && i2 > 0) {
            int i7 = ((i2 - 1) / 57) + 1;
            if (!cVar.f25091j) {
                i5 = 1;
            }
            i4 += i7 * i5;
        }
        cVar.f25077a = new byte[i4];
        cVar.mo23168a(bArr, i, i2, true);
        return cVar.f25077a;
    }

    /* renamed from: g */
    public static String m30527g(byte[] bArr, int i) {
        try {
            return new String(m30525e(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
