package p174e.p181b.p182a.p193y.p194k0;

import java.io.EOFException;
import java.util.Objects;
import p174e.p181b.p182a.p193y.p194k0.C5618c;
import p493i.C10603f;
import p493i.C10615h;
import p493i.C10616i;

/* renamed from: e.b.a.y.k0.e */
final class C5622e extends C5618c {

    /* renamed from: u */
    private static final C10616i f15924u = C10616i.m36110z("'\\");

    /* renamed from: v */
    private static final C10616i f15925v = C10616i.m36110z("\"\\");

    /* renamed from: w */
    private static final C10616i f15926w = C10616i.m36110z("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: x */
    private static final C10616i f15927x = C10616i.m36110z("\n\r");

    /* renamed from: y */
    private static final C10616i f15928y = C10616i.m36110z("*/");

    /* renamed from: A */
    private final C10603f f15929A;

    /* renamed from: B */
    private int f15930B = 0;

    /* renamed from: C */
    private long f15931C;

    /* renamed from: D */
    private int f15932D;

    /* renamed from: E */
    private String f15933E;

    /* renamed from: z */
    private final C10615h f15934z;

    C5622e(C10615h hVar) {
        Objects.requireNonNull(hVar, "source == null");
        this.f15934z = hVar;
        this.f15929A = hVar.mo26363p();
        mo16871s0(6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0110  */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m20944A0() {
        /*
            r16 = this;
            r0 = r16
            int[] r1 = r0.f15906p
            int r2 = r0.f15905o
            int r3 = r2 + -1
            r3 = r1[r3]
            r4 = 0
            r6 = 8
            r8 = 34
            r9 = 93
            r10 = 3
            r11 = 7
            r12 = 59
            r13 = 44
            r14 = 4
            r15 = 2
            r7 = 1
            if (r3 != r7) goto L_0x0022
            int r2 = r2 - r7
            r1[r2] = r15
            goto L_0x009a
        L_0x0022:
            if (r3 != r15) goto L_0x003d
            int r1 = r0.m20947D0(r7)
            i.f r2 = r0.f15929A
            r2.readByte()
            if (r1 == r13) goto L_0x009a
            if (r1 == r12) goto L_0x0094
            if (r1 != r9) goto L_0x0036
            r0.f15930B = r14
            return r14
        L_0x0036:
            java.lang.String r1 = "Unterminated array"
            e.b.a.y.k0.b r1 = r0.mo16875y0(r1)
            throw r1
        L_0x003d:
            r15 = 5
            if (r3 == r10) goto L_0x0121
            if (r3 != r15) goto L_0x0044
            goto L_0x0121
        L_0x0044:
            if (r3 != r14) goto L_0x007e
            int r2 = r2 - r7
            r1[r2] = r15
            int r1 = r0.m20947D0(r7)
            i.f r2 = r0.f15929A
            r2.readByte()
            r2 = 58
            if (r1 == r2) goto L_0x009a
            r2 = 61
            if (r1 != r2) goto L_0x0077
            r16.m20957z0()
            i.h r1 = r0.f15934z
            r14 = 1
            boolean r1 = r1.mo26338V(r14)
            if (r1 == 0) goto L_0x009a
            i.f r1 = r0.f15929A
            byte r1 = r1.mo26392y0(r4)
            r2 = 62
            if (r1 != r2) goto L_0x009a
            i.f r1 = r0.f15929A
            r1.readByte()
            goto L_0x009a
        L_0x0077:
            java.lang.String r1 = "Expected ':'"
            e.b.a.y.k0.b r1 = r0.mo16875y0(r1)
            throw r1
        L_0x007e:
            r14 = 6
            if (r3 != r14) goto L_0x0085
            int r2 = r2 - r7
            r1[r2] = r11
            goto L_0x009a
        L_0x0085:
            if (r3 != r11) goto L_0x0098
            r1 = 0
            int r1 = r0.m20947D0(r1)
            r2 = -1
            if (r1 != r2) goto L_0x0094
            r1 = 18
        L_0x0091:
            r0.f15930B = r1
            return r1
        L_0x0094:
            r16.m20957z0()
            goto L_0x009a
        L_0x0098:
            if (r3 == r6) goto L_0x0119
        L_0x009a:
            int r1 = r0.m20947D0(r7)
            if (r1 == r8) goto L_0x0110
            r2 = 39
            if (r1 == r2) goto L_0x0105
            if (r1 == r13) goto L_0x00f2
            if (r1 == r12) goto L_0x00f2
            r2 = 91
            if (r1 == r2) goto L_0x00ea
            if (r1 == r9) goto L_0x00e1
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x00d9
            int r1 = r16.m20950G0()
            if (r1 == 0) goto L_0x00b9
            return r1
        L_0x00b9:
            int r1 = r16.m20951H0()
            if (r1 == 0) goto L_0x00c0
            return r1
        L_0x00c0:
            i.f r1 = r0.f15929A
            byte r1 = r1.mo26392y0(r4)
            boolean r1 = r0.m20946C0(r1)
            if (r1 == 0) goto L_0x00d2
            r16.m20957z0()
            r1 = 10
            goto L_0x0091
        L_0x00d2:
            java.lang.String r1 = "Expected value"
            e.b.a.y.k0.b r1 = r0.mo16875y0(r1)
            throw r1
        L_0x00d9:
            i.f r1 = r0.f15929A
            r1.readByte()
            r0.f15930B = r7
            return r7
        L_0x00e1:
            if (r3 != r7) goto L_0x00f2
            i.f r1 = r0.f15929A
            r1.readByte()
            r1 = 4
            goto L_0x0091
        L_0x00ea:
            i.f r1 = r0.f15929A
            r1.readByte()
            r0.f15930B = r10
            return r10
        L_0x00f2:
            if (r3 == r7) goto L_0x00ff
            r1 = 2
            if (r3 != r1) goto L_0x00f8
            goto L_0x00ff
        L_0x00f8:
            java.lang.String r1 = "Unexpected value"
            e.b.a.y.k0.b r1 = r0.mo16875y0(r1)
            throw r1
        L_0x00ff:
            r16.m20957z0()
            r0.f15930B = r11
            return r11
        L_0x0105:
            r16.m20957z0()
            i.f r1 = r0.f15929A
            r1.readByte()
            r0.f15930B = r6
            return r6
        L_0x0110:
            i.f r1 = r0.f15929A
            r1.readByte()
            r1 = 9
            goto L_0x0091
        L_0x0119:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x0121:
            int r2 = r2 - r7
            r4 = 4
            r1[r2] = r4
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r15) goto L_0x0145
            int r2 = r0.m20947D0(r7)
            i.f r4 = r0.f15929A
            r4.readByte()
            if (r2 == r13) goto L_0x0145
            if (r2 == r12) goto L_0x0142
            if (r2 != r1) goto L_0x013b
        L_0x0138:
            r1 = 2
            goto L_0x0091
        L_0x013b:
            java.lang.String r1 = "Unterminated object"
            e.b.a.y.k0.b r1 = r0.mo16875y0(r1)
            throw r1
        L_0x0142:
            r16.m20957z0()
        L_0x0145:
            int r2 = r0.m20947D0(r7)
            if (r2 == r8) goto L_0x017f
            r4 = 39
            if (r2 == r4) goto L_0x0173
            java.lang.String r4 = "Expected name"
            if (r2 == r1) goto L_0x0166
            r16.m20957z0()
            char r1 = (char) r2
            boolean r1 = r0.m20946C0(r1)
            if (r1 == 0) goto L_0x0161
            r1 = 14
            goto L_0x0091
        L_0x0161:
            e.b.a.y.k0.b r1 = r0.mo16875y0(r4)
            throw r1
        L_0x0166:
            if (r3 == r15) goto L_0x016e
            i.f r1 = r0.f15929A
            r1.readByte()
            goto L_0x0138
        L_0x016e:
            e.b.a.y.k0.b r1 = r0.mo16875y0(r4)
            throw r1
        L_0x0173:
            i.f r1 = r0.f15929A
            r1.readByte()
            r16.m20957z0()
            r1 = 12
            goto L_0x0091
        L_0x017f:
            i.f r1 = r0.f15929A
            r1.readByte()
            r1 = 13
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p181b.p182a.p193y.p194k0.C5622e.m20944A0():int");
    }

    /* renamed from: B0 */
    private int m20945B0(String str, C5618c.C5619a aVar) {
        int length = aVar.f15911a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f15911a[i])) {
                this.f15930B = 0;
                this.f15907q[this.f15905o - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: C0 */
    private boolean m20946C0(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m20957z0();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f15929A.mo26358l((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 != 47) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.f15934z.mo26338V(2) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        m20957z0();
        r3 = r6.f15929A.mo26392y0(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r3 == 42) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r3 == 47) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r6.f15929A.readByte();
        r6.f15929A.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        m20955L0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        r6.f15929A.readByte();
        r6.f15929A.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (m20954K0() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        throw mo16875y0("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (r1 != 35) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        m20957z0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        return r1;
     */
    /* renamed from: D0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m20947D0(boolean r7) {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            i.h r2 = r6.f15934z
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.mo26338V(r4)
            if (r2 == 0) goto L_0x007f
            i.f r2 = r6.f15929A
            long r4 = (long) r1
            byte r1 = r2.mo26392y0(r4)
            r2 = 10
            if (r1 == r2) goto L_0x007d
            r2 = 32
            if (r1 == r2) goto L_0x007d
            r2 = 13
            if (r1 == r2) goto L_0x007d
            r2 = 9
            if (r1 != r2) goto L_0x0025
            goto L_0x007d
        L_0x0025:
            i.f r2 = r6.f15929A
            int r3 = r3 + -1
            long r3 = (long) r3
            r2.mo26358l(r3)
            r2 = 47
            if (r1 != r2) goto L_0x0074
            i.h r3 = r6.f15934z
            r4 = 2
            boolean r3 = r3.mo26338V(r4)
            if (r3 != 0) goto L_0x003c
            return r1
        L_0x003c:
            r6.m20957z0()
            i.f r3 = r6.f15929A
            r4 = 1
            byte r3 = r3.mo26392y0(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005c
            if (r3 == r2) goto L_0x004e
            return r1
        L_0x004e:
            i.f r1 = r6.f15929A
            r1.readByte()
            i.f r1 = r6.f15929A
            r1.readByte()
        L_0x0058:
            r6.m20955L0()
            goto L_0x0001
        L_0x005c:
            i.f r1 = r6.f15929A
            r1.readByte()
            i.f r1 = r6.f15929A
            r1.readByte()
            boolean r1 = r6.m20954K0()
            if (r1 == 0) goto L_0x006d
            goto L_0x0001
        L_0x006d:
            java.lang.String r7 = "Unterminated comment"
            e.b.a.y.k0.b r7 = r6.mo16875y0(r7)
            throw r7
        L_0x0074:
            r2 = 35
            if (r1 != r2) goto L_0x007c
            r6.m20957z0()
            goto L_0x0058
        L_0x007c:
            return r1
        L_0x007d:
            r1 = r3
            goto L_0x0002
        L_0x007f:
            if (r7 != 0) goto L_0x0083
            r7 = -1
            return r7
        L_0x0083:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p181b.p182a.p193y.p194k0.C5622e.m20947D0(boolean):int");
    }

    /* renamed from: E0 */
    private String m20948E0(C10616i iVar) {
        StringBuilder sb = null;
        while (true) {
            long B = this.f15934z.mo26308B(iVar);
            if (B == -1) {
                throw mo16875y0("Unterminated string");
            } else if (this.f15929A.mo26392y0(B) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f15929A.mo26321K0(B));
                this.f15929A.readByte();
                sb.append(m20952I0());
            } else {
                String K0 = this.f15929A.mo26321K0(B);
                if (sb == null) {
                    this.f15929A.readByte();
                    return K0;
                }
                sb.append(K0);
                this.f15929A.readByte();
                return sb.toString();
            }
        }
    }

    /* renamed from: F0 */
    private String m20949F0() {
        long B = this.f15934z.mo26308B(f15926w);
        return B != -1 ? this.f15929A.mo26321K0(B) : this.f15929A.mo26319J0();
    }

    /* renamed from: G0 */
    private int m20950G0() {
        String str;
        String str2;
        int i;
        byte y0 = this.f15929A.mo26392y0(0);
        if (y0 == 116 || y0 == 84) {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (y0 == 102 || y0 == 70) {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (y0 != 110 && y0 != 78) {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f15934z.mo26338V((long) i3)) {
                return 0;
            }
            byte y02 = this.f15929A.mo26392y0((long) i2);
            if (y02 != str2.charAt(i2) && y02 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f15934z.mo26338V((long) (length + 1)) && m20946C0(this.f15929A.mo26392y0((long) length))) {
            return 0;
        }
        this.f15929A.mo26358l((long) length);
        this.f15930B = i;
        return i;
    }

    /* renamed from: H0 */
    private int m20951H0() {
        int i;
        byte y0;
        boolean z = true;
        int i2 = 0;
        long j = 0;
        int i3 = 0;
        char c = 0;
        boolean z2 = true;
        boolean z3 = false;
        while (true) {
            int i4 = i3 + 1;
            if (!this.f15934z.mo26338V((long) i4)) {
                break;
            }
            y0 = this.f15929A.mo26392y0((long) i3);
            if (y0 != 43) {
                if (y0 != 69 && y0 != 101) {
                    if (y0 != 45) {
                        if (y0 != 46) {
                            if (y0 >= 48 && y0 <= 57) {
                                if (c == z || c == 0) {
                                    j = (long) (-(y0 - 48));
                                    i2 = 0;
                                    c = 2;
                                } else {
                                    if (c == 2) {
                                        if (j == 0) {
                                            return i2;
                                        }
                                        long j2 = (10 * j) - ((long) (y0 - 48));
                                        int i5 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                                        z2 &= i5 > 0 || (i5 == 0 && j2 < j);
                                        j = j2;
                                    } else if (c == 3) {
                                        i2 = 0;
                                        c = 4;
                                    } else if (c == 5 || c == 6) {
                                        i2 = 0;
                                        c = 7;
                                    }
                                    i2 = 0;
                                }
                            }
                        } else if (c != 2) {
                            return i2;
                        } else {
                            c = 3;
                        }
                    } else if (c == 0) {
                        c = 1;
                        z3 = true;
                    } else if (c != 5) {
                        return i2;
                    }
                    i3 = i4;
                    z = true;
                } else if (c != 2 && c != 4) {
                    return i2;
                } else {
                    c = 5;
                    i3 = i4;
                    z = true;
                }
            } else if (c != 5) {
                return i2;
            }
            c = 6;
            i3 = i4;
            z = true;
        }
        if (m20946C0(y0)) {
            return 0;
        }
        if (c == 2 && z2 && ((j != Long.MIN_VALUE || z3) && (j != 0 || !z3))) {
            if (!z3) {
                j = -j;
            }
            this.f15931C = j;
            this.f15929A.mo26358l((long) i3);
            i = 16;
        } else if (c != 2 && c != 4 && c != 7) {
            return 0;
        } else {
            this.f15932D = i3;
            i = 17;
        }
        this.f15930B = i;
        return i;
    }

    /* renamed from: I0 */
    private char m20952I0() {
        int i;
        int i2;
        if (this.f15934z.mo26338V(1)) {
            byte readByte = this.f15929A.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                if (this.f15909s) {
                    return (char) readByte;
                }
                throw mo16875y0("Invalid escape sequence: \\" + ((char) readByte));
            } else if (this.f15934z.mo26338V(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte y0 = this.f15929A.mo26392y0((long) i3);
                    char c2 = (char) (c << 4);
                    if (y0 < 48 || y0 > 57) {
                        if (y0 >= 97 && y0 <= 102) {
                            i = y0 - 97;
                        } else if (y0 < 65 || y0 > 70) {
                            throw mo16875y0("\\u" + this.f15929A.mo26321K0(4));
                        } else {
                            i = y0 - 65;
                        }
                        i2 = i + 10;
                    } else {
                        i2 = y0 - 48;
                    }
                    c = (char) (c2 + i2);
                }
                this.f15929A.mo26358l(4);
                return c;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + mo16859A());
            }
        } else {
            throw mo16875y0("Unterminated escape sequence");
        }
    }

    /* renamed from: J0 */
    private void m20953J0(C10616i iVar) {
        while (true) {
            long B = this.f15934z.mo26308B(iVar);
            if (B == -1) {
                throw mo16875y0("Unterminated string");
            } else if (this.f15929A.mo26392y0(B) == 92) {
                this.f15929A.mo26358l(B + 1);
                m20952I0();
            } else {
                this.f15929A.mo26358l(B + 1);
                return;
            }
        }
    }

    /* renamed from: K0 */
    private boolean m20954K0() {
        C10615h hVar = this.f15934z;
        C10616i iVar = f15928y;
        long w = hVar.mo26382w(iVar);
        boolean z = w != -1;
        C10603f fVar = this.f15929A;
        fVar.mo26358l(z ? w + ((long) iVar.mo26420Y()) : fVar.size());
        return z;
    }

    /* renamed from: L0 */
    private void m20955L0() {
        long B = this.f15934z.mo26308B(f15927x);
        C10603f fVar = this.f15929A;
        fVar.mo26358l(B != -1 ? B + 1 : fVar.size());
    }

    /* renamed from: M0 */
    private void m20956M0() {
        long B = this.f15934z.mo26308B(f15926w);
        C10603f fVar = this.f15929A;
        if (B == -1) {
            B = fVar.size();
        }
        fVar.mo26358l(B);
    }

    /* renamed from: z0 */
    private void m20957z0() {
        if (!this.f15909s) {
            throw mo16875y0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: E */
    public boolean mo16860E() {
        int i = this.f15930B;
        if (i == 0) {
            i = m20944A0();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    /* renamed from: I */
    public boolean mo16861I() {
        int i = this.f15930B;
        if (i == 0) {
            i = m20944A0();
        }
        if (i == 5) {
            this.f15930B = 0;
            int[] iArr = this.f15908r;
            int i2 = this.f15905o - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f15930B = 0;
            int[] iArr2 = this.f15908r;
            int i3 = this.f15905o - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new C5616a("Expected a boolean but was " + mo16868n0() + " at path " + mo16859A());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double mo16862L() {
        /*
            r8 = this;
            int r0 = r8.f15930B
            if (r0 != 0) goto L_0x0008
            int r0 = r8.m20944A0()
        L_0x0008:
            r1 = 16
            r2 = 0
            if (r0 != r1) goto L_0x001f
            r8.f15930B = r2
            int[] r0 = r8.f15908r
            int r1 = r8.f15905o
            int r1 = r1 + -1
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            long r0 = r8.f15931C
            double r0 = (double) r0
            return r0
        L_0x001f:
            r1 = 17
            java.lang.String r3 = "Expected a double but was "
            r4 = 11
            java.lang.String r5 = " at path "
            if (r0 != r1) goto L_0x0035
            i.f r0 = r8.f15929A
            int r1 = r8.f15932D
            long r6 = (long) r1
            java.lang.String r0 = r0.mo26321K0(r6)
        L_0x0032:
            r8.f15933E = r0
            goto L_0x0052
        L_0x0035:
            r1 = 9
            if (r0 != r1) goto L_0x0040
            i.i r0 = f15925v
        L_0x003b:
            java.lang.String r0 = r8.m20948E0(r0)
            goto L_0x0032
        L_0x0040:
            r1 = 8
            if (r0 != r1) goto L_0x0047
            i.i r0 = f15924u
            goto L_0x003b
        L_0x0047:
            r1 = 10
            if (r0 != r1) goto L_0x0050
            java.lang.String r0 = r8.m20949F0()
            goto L_0x0032
        L_0x0050:
            if (r0 != r4) goto L_0x00bf
        L_0x0052:
            r8.f15930B = r4
            java.lang.String r0 = r8.f15933E     // Catch:{ NumberFormatException -> 0x009e }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x009e }
            boolean r3 = r8.f15909s
            if (r3 != 0) goto L_0x008c
            boolean r3 = java.lang.Double.isNaN(r0)
            if (r3 != 0) goto L_0x006b
            boolean r3 = java.lang.Double.isInfinite(r0)
            if (r3 != 0) goto L_0x006b
            goto L_0x008c
        L_0x006b:
            e.b.a.y.k0.b r2 = new e.b.a.y.k0.b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "JSON forbids NaN and infinities: "
            r3.append(r4)
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = r8.mo16859A()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x008c:
            r3 = 0
            r8.f15933E = r3
            r8.f15930B = r2
            int[] r2 = r8.f15908r
            int r3 = r8.f15905o
            int r3 = r3 + -1
            r4 = r2[r3]
            int r4 = r4 + 1
            r2[r3] = r4
            return r0
        L_0x009e:
            e.b.a.y.k0.a r0 = new e.b.a.y.k0.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r8.f15933E
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = r8.mo16859A()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00bf:
            e.b.a.y.k0.a r0 = new e.b.a.y.k0.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            e.b.a.y.k0.c$b r2 = r8.mo16868n0()
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = r8.mo16859A()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p181b.p182a.p193y.p194k0.C5622e.mo16862L():double");
    }

    /* renamed from: W */
    public int mo16863W() {
        int i = this.f15930B;
        if (i == 0) {
            i = m20944A0();
        }
        if (i == 16) {
            long j = this.f15931C;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f15930B = 0;
                int[] iArr = this.f15908r;
                int i3 = this.f15905o - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new C5616a("Expected an int but was " + this.f15931C + " at path " + mo16859A());
        }
        if (i == 17) {
            this.f15933E = this.f15929A.mo26321K0((long) this.f15932D);
        } else if (i == 9 || i == 8) {
            String E0 = m20948E0(i == 9 ? f15925v : f15924u);
            this.f15933E = E0;
            try {
                int parseInt = Integer.parseInt(E0);
                this.f15930B = 0;
                int[] iArr2 = this.f15908r;
                int i4 = this.f15905o - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new C5616a("Expected an int but was " + mo16868n0() + " at path " + mo16859A());
        }
        this.f15930B = 11;
        try {
            double parseDouble = Double.parseDouble(this.f15933E);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f15933E = null;
                this.f15930B = 0;
                int[] iArr3 = this.f15908r;
                int i6 = this.f15905o - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new C5616a("Expected an int but was " + this.f15933E + " at path " + mo16859A());
        } catch (NumberFormatException unused2) {
            throw new C5616a("Expected an int but was " + this.f15933E + " at path " + mo16859A());
        }
    }

    /* renamed from: X */
    public String mo16864X() {
        String str;
        C10616i iVar;
        int i = this.f15930B;
        if (i == 0) {
            i = m20944A0();
        }
        if (i == 14) {
            str = m20949F0();
        } else {
            if (i == 13) {
                iVar = f15925v;
            } else if (i == 12) {
                iVar = f15924u;
            } else if (i == 15) {
                str = this.f15933E;
            } else {
                throw new C5616a("Expected a name but was " + mo16868n0() + " at path " + mo16859A());
            }
            str = m20948E0(iVar);
        }
        this.f15930B = 0;
        this.f15907q[this.f15905o - 1] = str;
        return str;
    }

    /* renamed from: b */
    public void mo16865b() {
        int i = this.f15930B;
        if (i == 0) {
            i = m20944A0();
        }
        if (i == 3) {
            mo16871s0(1);
            this.f15908r[this.f15905o - 1] = 0;
            this.f15930B = 0;
            return;
        }
        throw new C5616a("Expected BEGIN_ARRAY but was " + mo16868n0() + " at path " + mo16859A());
    }

    public void close() {
        this.f15930B = 0;
        this.f15906p[0] = 8;
        this.f15905o = 1;
        this.f15929A.mo26366r();
        this.f15934z.close();
    }

    /* renamed from: e0 */
    public String mo16866e0() {
        String str;
        C10616i iVar;
        int i = this.f15930B;
        if (i == 0) {
            i = m20944A0();
        }
        if (i == 10) {
            str = m20949F0();
        } else {
            if (i == 9) {
                iVar = f15925v;
            } else if (i == 8) {
                iVar = f15924u;
            } else if (i == 11) {
                str = this.f15933E;
                this.f15933E = null;
            } else if (i == 16) {
                str = Long.toString(this.f15931C);
            } else if (i == 17) {
                str = this.f15929A.mo26321K0((long) this.f15932D);
            } else {
                throw new C5616a("Expected a string but was " + mo16868n0() + " at path " + mo16859A());
            }
            str = m20948E0(iVar);
        }
        this.f15930B = 0;
        int[] iArr = this.f15908r;
        int i2 = this.f15905o - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: h */
    public void mo16867h() {
        int i = this.f15930B;
        if (i == 0) {
            i = m20944A0();
        }
        if (i == 1) {
            mo16871s0(3);
            this.f15930B = 0;
            return;
        }
        throw new C5616a("Expected BEGIN_OBJECT but was " + mo16868n0() + " at path " + mo16859A());
    }

    /* renamed from: n0 */
    public C5618c.C5620b mo16868n0() {
        int i = this.f15930B;
        if (i == 0) {
            i = m20944A0();
        }
        switch (i) {
            case 1:
                return C5618c.C5620b.BEGIN_OBJECT;
            case 2:
                return C5618c.C5620b.END_OBJECT;
            case 3:
                return C5618c.C5620b.BEGIN_ARRAY;
            case 4:
                return C5618c.C5620b.END_ARRAY;
            case 5:
            case 6:
                return C5618c.C5620b.BOOLEAN;
            case 7:
                return C5618c.C5620b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C5618c.C5620b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return C5618c.C5620b.NAME;
            case 16:
            case 17:
                return C5618c.C5620b.NUMBER;
            case 18:
                return C5618c.C5620b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: o */
    public void mo16869o() {
        int i = this.f15930B;
        if (i == 0) {
            i = m20944A0();
        }
        if (i == 4) {
            int i2 = this.f15905o - 1;
            this.f15905o = i2;
            int[] iArr = this.f15908r;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f15930B = 0;
            return;
        }
        throw new C5616a("Expected END_ARRAY but was " + mo16868n0() + " at path " + mo16859A());
    }

    /* renamed from: r */
    public void mo16870r() {
        int i = this.f15930B;
        if (i == 0) {
            i = m20944A0();
        }
        if (i == 2) {
            int i2 = this.f15905o - 1;
            this.f15905o = i2;
            this.f15907q[i2] = null;
            int[] iArr = this.f15908r;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f15930B = 0;
            return;
        }
        throw new C5616a("Expected END_OBJECT but was " + mo16868n0() + " at path " + mo16859A());
    }

    public String toString() {
        return "JsonReader(" + this.f15934z + ")";
    }

    /* renamed from: u0 */
    public int mo16872u0(C5618c.C5619a aVar) {
        int i = this.f15930B;
        if (i == 0) {
            i = m20944A0();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m20945B0(this.f15933E, aVar);
        }
        int t0 = this.f15934z.mo26377t0(aVar.f15912b);
        if (t0 != -1) {
            this.f15930B = 0;
            this.f15907q[this.f15905o - 1] = aVar.f15911a[t0];
            return t0;
        }
        String str = this.f15907q[this.f15905o - 1];
        String X = mo16864X();
        int B0 = m20945B0(X, aVar);
        if (B0 == -1) {
            this.f15930B = 15;
            this.f15933E = X;
            this.f15907q[this.f15905o - 1] = str;
        }
        return B0;
    }

    /* renamed from: v0 */
    public void mo16873v0() {
        C10616i iVar;
        if (!this.f15910t) {
            int i = this.f15930B;
            if (i == 0) {
                i = m20944A0();
            }
            if (i == 14) {
                m20956M0();
            } else {
                if (i == 13) {
                    iVar = f15925v;
                } else if (i == 12) {
                    iVar = f15924u;
                } else if (i != 15) {
                    throw new C5616a("Expected a name but was " + mo16868n0() + " at path " + mo16859A());
                }
                m20953J0(iVar);
            }
            this.f15930B = 0;
            this.f15907q[this.f15905o - 1] = "null";
            return;
        }
        throw new C5616a("Cannot skip unexpected " + mo16868n0() + " at " + mo16859A());
    }

    /* renamed from: w0 */
    public void mo16874w0() {
        C10616i iVar;
        if (!this.f15910t) {
            int i = 0;
            do {
                int i2 = this.f15930B;
                if (i2 == 0) {
                    i2 = m20944A0();
                }
                if (i2 == 3) {
                    mo16871s0(1);
                } else if (i2 == 1) {
                    mo16871s0(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i < 0) {
                            throw new C5616a("Expected a value but was " + mo16868n0() + " at path " + mo16859A());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i < 0) {
                            throw new C5616a("Expected a value but was " + mo16868n0() + " at path " + mo16859A());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        m20956M0();
                        this.f15930B = 0;
                    } else {
                        if (i2 == 9 || i2 == 13) {
                            iVar = f15925v;
                        } else if (i2 == 8 || i2 == 12) {
                            iVar = f15924u;
                        } else {
                            if (i2 == 17) {
                                this.f15929A.mo26358l((long) this.f15932D);
                            } else if (i2 == 18) {
                                throw new C5616a("Expected a value but was " + mo16868n0() + " at path " + mo16859A());
                            }
                            this.f15930B = 0;
                        }
                        m20953J0(iVar);
                        this.f15930B = 0;
                    }
                    this.f15905o--;
                    this.f15930B = 0;
                }
                i++;
                this.f15930B = 0;
            } while (i != 0);
            int[] iArr = this.f15908r;
            int i3 = this.f15905o;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f15907q[i3 - 1] = "null";
            return;
        }
        throw new C5616a("Cannot skip unexpected " + mo16868n0() + " at " + mo16859A());
    }
}
