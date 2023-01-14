package p493i.p494g0;

import p455g.p470y.p472d.C10457l;
import p493i.C10588a0;
import p493i.C10603f;
import p493i.C10616i;

/* renamed from: i.g0.b */
public final class C10610b {

    /* renamed from: a */
    private static final char[] f28046a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0068, code lost:
        return -1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m36072c(byte[] r19, int r20) {
        /*
            r0 = r19
            r1 = r20
            int r2 = r0.length
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0008:
            if (r4 >= r2) goto L_0x01dd
            byte r7 = r0[r4]
            r8 = 127(0x7f, float:1.78E-43)
            r9 = 159(0x9f, float:2.23E-43)
            r10 = 31
            r11 = 13
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 10
            r14 = 65536(0x10000, float:9.18355E-41)
            r16 = -1
            r17 = 1
            if (r7 < 0) goto L_0x0071
            int r18 = r6 + 1
            if (r6 != r1) goto L_0x0026
            return r5
        L_0x0026:
            if (r7 == r13) goto L_0x0038
            if (r7 == r11) goto L_0x0038
            if (r7 < 0) goto L_0x002e
            if (r10 >= r7) goto L_0x0033
        L_0x002e:
            if (r8 <= r7) goto L_0x0031
            goto L_0x0035
        L_0x0031:
            if (r9 < r7) goto L_0x0035
        L_0x0033:
            r6 = 1
            goto L_0x0036
        L_0x0035:
            r6 = 0
        L_0x0036:
            if (r6 != 0) goto L_0x003a
        L_0x0038:
            if (r7 != r12) goto L_0x003b
        L_0x003a:
            return r16
        L_0x003b:
            if (r7 >= r14) goto L_0x003f
            r6 = 1
            goto L_0x0040
        L_0x003f:
            r6 = 2
        L_0x0040:
            int r5 = r5 + r6
            int r4 = r4 + 1
        L_0x0043:
            r6 = r18
            if (r4 >= r2) goto L_0x0008
            byte r7 = r0[r4]
            if (r7 < 0) goto L_0x0008
            int r7 = r4 + 1
            byte r4 = r0[r4]
            int r18 = r6 + 1
            if (r6 != r1) goto L_0x0054
            return r5
        L_0x0054:
            if (r4 == r13) goto L_0x0066
            if (r4 == r11) goto L_0x0066
            if (r4 < 0) goto L_0x005c
            if (r10 >= r4) goto L_0x0061
        L_0x005c:
            if (r8 <= r4) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            if (r9 < r4) goto L_0x0063
        L_0x0061:
            r6 = 1
            goto L_0x0064
        L_0x0063:
            r6 = 0
        L_0x0064:
            if (r6 != 0) goto L_0x0068
        L_0x0066:
            if (r4 != r12) goto L_0x0069
        L_0x0068:
            return r16
        L_0x0069:
            if (r4 >= r14) goto L_0x006d
            r4 = 1
            goto L_0x006e
        L_0x006d:
            r4 = 2
        L_0x006e:
            int r5 = r5 + r4
            r4 = r7
            goto L_0x0043
        L_0x0071:
            int r3 = r7 >> 5
            r15 = -2
            r14 = 128(0x80, float:1.794E-43)
            if (r3 != r15) goto L_0x00c5
            int r3 = r4 + 1
            if (r2 > r3) goto L_0x0080
            if (r6 != r1) goto L_0x007f
            return r5
        L_0x007f:
            return r16
        L_0x0080:
            byte r7 = r0[r4]
            byte r3 = r0[r3]
            r15 = r3 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x008a
            r15 = 1
            goto L_0x008b
        L_0x008a:
            r15 = 0
        L_0x008b:
            if (r15 != 0) goto L_0x0091
            if (r6 != r1) goto L_0x0090
            return r5
        L_0x0090:
            return r16
        L_0x0091:
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r7 << 6
            r3 = r3 ^ r7
            if (r3 >= r14) goto L_0x009c
            if (r6 != r1) goto L_0x009b
            return r5
        L_0x009b:
            return r16
        L_0x009c:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x00a1
            return r5
        L_0x00a1:
            if (r3 == r13) goto L_0x00b3
            if (r3 == r11) goto L_0x00b3
            if (r3 < 0) goto L_0x00a9
            if (r10 >= r3) goto L_0x00ae
        L_0x00a9:
            if (r8 <= r3) goto L_0x00ac
            goto L_0x00b0
        L_0x00ac:
            if (r9 < r3) goto L_0x00b0
        L_0x00ae:
            r6 = 1
            goto L_0x00b1
        L_0x00b0:
            r6 = 0
        L_0x00b1:
            if (r6 != 0) goto L_0x00b5
        L_0x00b3:
            if (r3 != r12) goto L_0x00b6
        L_0x00b5:
            return r16
        L_0x00b6:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x00bc
            r15 = 1
            goto L_0x00bd
        L_0x00bc:
            r15 = 2
        L_0x00bd:
            int r5 = r5 + r15
            g.s r3 = p455g.C10323s.f27547a
            int r4 = r4 + 2
        L_0x00c2:
            r6 = r7
            goto L_0x0008
        L_0x00c5:
            int r3 = r7 >> 4
            r12 = 55296(0xd800, float:7.7486E-41)
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r3 != r15) goto L_0x0142
            int r3 = r4 + 2
            if (r2 > r3) goto L_0x00d7
            if (r6 != r1) goto L_0x00d6
            return r5
        L_0x00d6:
            return r16
        L_0x00d7:
            byte r7 = r0[r4]
            int r15 = r4 + 1
            byte r15 = r0[r15]
            r8 = r15 & 192(0xc0, float:2.69E-43)
            if (r8 != r14) goto L_0x00e3
            r8 = 1
            goto L_0x00e4
        L_0x00e3:
            r8 = 0
        L_0x00e4:
            if (r8 != 0) goto L_0x00ea
            if (r6 != r1) goto L_0x00e9
            return r5
        L_0x00e9:
            return r16
        L_0x00ea:
            byte r3 = r0[r3]
            r8 = r3 & 192(0xc0, float:2.69E-43)
            if (r8 != r14) goto L_0x00f2
            r8 = 1
            goto L_0x00f3
        L_0x00f2:
            r8 = 0
        L_0x00f3:
            if (r8 != 0) goto L_0x00f9
            if (r6 != r1) goto L_0x00f8
            return r5
        L_0x00f8:
            return r16
        L_0x00f9:
            r8 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r8
            int r8 = r15 << 6
            r3 = r3 ^ r8
            int r7 = r7 << 12
            r3 = r3 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 >= r7) goto L_0x010b
            if (r6 != r1) goto L_0x010a
            return r5
        L_0x010a:
            return r16
        L_0x010b:
            if (r12 <= r3) goto L_0x010e
            goto L_0x0114
        L_0x010e:
            if (r9 < r3) goto L_0x0114
            if (r6 != r1) goto L_0x0113
            return r5
        L_0x0113:
            return r16
        L_0x0114:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x0119
            return r5
        L_0x0119:
            if (r3 == r13) goto L_0x012f
            if (r3 == r11) goto L_0x012f
            if (r3 < 0) goto L_0x0121
            if (r10 >= r3) goto L_0x012a
        L_0x0121:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 <= r3) goto L_0x0126
            goto L_0x012c
        L_0x0126:
            r6 = 159(0x9f, float:2.23E-43)
            if (r6 < r3) goto L_0x012c
        L_0x012a:
            r6 = 1
            goto L_0x012d
        L_0x012c:
            r6 = 0
        L_0x012d:
            if (r6 != 0) goto L_0x0134
        L_0x012f:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x0135
        L_0x0134:
            return r16
        L_0x0135:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x013b
            r15 = 1
            goto L_0x013c
        L_0x013b:
            r15 = 2
        L_0x013c:
            int r5 = r5 + r15
            g.s r3 = p455g.C10323s.f27547a
            int r4 = r4 + 3
            goto L_0x00c2
        L_0x0142:
            int r3 = r7 >> 3
            if (r3 != r15) goto L_0x01d9
            int r3 = r4 + 3
            if (r2 > r3) goto L_0x014e
            if (r6 != r1) goto L_0x014d
            return r5
        L_0x014d:
            return r16
        L_0x014e:
            byte r7 = r0[r4]
            int r8 = r4 + 1
            byte r8 = r0[r8]
            r15 = r8 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x015a
            r15 = 1
            goto L_0x015b
        L_0x015a:
            r15 = 0
        L_0x015b:
            if (r15 != 0) goto L_0x0161
            if (r6 != r1) goto L_0x0160
            return r5
        L_0x0160:
            return r16
        L_0x0161:
            int r15 = r4 + 2
            byte r15 = r0[r15]
            r10 = r15 & 192(0xc0, float:2.69E-43)
            if (r10 != r14) goto L_0x016b
            r10 = 1
            goto L_0x016c
        L_0x016b:
            r10 = 0
        L_0x016c:
            if (r10 != 0) goto L_0x0172
            if (r6 != r1) goto L_0x0171
            return r5
        L_0x0171:
            return r16
        L_0x0172:
            byte r3 = r0[r3]
            r10 = r3 & 192(0xc0, float:2.69E-43)
            if (r10 != r14) goto L_0x017a
            r10 = 1
            goto L_0x017b
        L_0x017a:
            r10 = 0
        L_0x017b:
            if (r10 != 0) goto L_0x0181
            if (r6 != r1) goto L_0x0180
            return r5
        L_0x0180:
            return r16
        L_0x0181:
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r10
            int r10 = r15 << 6
            r3 = r3 ^ r10
            int r8 = r8 << 12
            r3 = r3 ^ r8
            int r7 = r7 << 18
            r3 = r3 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r7) goto L_0x0197
            if (r6 != r1) goto L_0x0196
            return r5
        L_0x0196:
            return r16
        L_0x0197:
            if (r12 <= r3) goto L_0x019a
            goto L_0x01a0
        L_0x019a:
            if (r9 < r3) goto L_0x01a0
            if (r6 != r1) goto L_0x019f
            return r5
        L_0x019f:
            return r16
        L_0x01a0:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r7) goto L_0x01a8
            if (r6 != r1) goto L_0x01a7
            return r5
        L_0x01a7:
            return r16
        L_0x01a8:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x01ad
            return r5
        L_0x01ad:
            if (r3 == r13) goto L_0x01c5
            if (r3 == r11) goto L_0x01c5
            if (r3 < 0) goto L_0x01b7
            r6 = 31
            if (r6 >= r3) goto L_0x01c0
        L_0x01b7:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 <= r3) goto L_0x01bc
            goto L_0x01c2
        L_0x01bc:
            r6 = 159(0x9f, float:2.23E-43)
            if (r6 < r3) goto L_0x01c2
        L_0x01c0:
            r6 = 1
            goto L_0x01c3
        L_0x01c2:
            r6 = 0
        L_0x01c3:
            if (r6 != 0) goto L_0x01ca
        L_0x01c5:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x01cb
        L_0x01ca:
            return r16
        L_0x01cb:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x01d1
            r15 = 1
            goto L_0x01d2
        L_0x01d1:
            r15 = 2
        L_0x01d2:
            int r5 = r5 + r15
            g.s r3 = p455g.C10323s.f27547a
            int r4 = r4 + 4
            goto L_0x00c2
        L_0x01d9:
            if (r6 != r1) goto L_0x01dc
            return r5
        L_0x01dc:
            return r16
        L_0x01dd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p493i.p494g0.C10610b.m36072c(byte[], int):int");
    }

    /* renamed from: d */
    public static final C10616i m36073d(C10616i iVar, String str) {
        C10457l.m35320e(iVar, "$this$commonDigest");
        C10457l.m35320e(str, "algorithm");
        C10611c a = C10612d.m36080a(str);
        a.mo26410b(iVar.mo26412B(), 0, iVar.mo26420Y());
        return new C10616i(a.mo26409a());
    }

    /* renamed from: e */
    public static final C10616i m36074e(C10588a0 a0Var, String str) {
        C10457l.m35320e(a0Var, "$this$commonSegmentDigest");
        C10457l.m35320e(str, "algorithm");
        C10611c a = C10612d.m36080a(str);
        int length = a0Var.mo26273f0().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = a0Var.mo26271e0()[length + i];
            int i4 = a0Var.mo26271e0()[i];
            a.mo26410b(a0Var.mo26273f0()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        return new C10616i(a.mo26409a());
    }

    /* renamed from: f */
    public static final void m36075f(C10616i iVar, C10603f fVar, int i, int i2) {
        C10457l.m35320e(iVar, "$this$commonWrite");
        C10457l.m35320e(fVar, "buffer");
        fVar.write(iVar.mo26412B(), i, i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final int m36076g(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: h */
    public static final char[] m36077h() {
        return f28046a;
    }
}
