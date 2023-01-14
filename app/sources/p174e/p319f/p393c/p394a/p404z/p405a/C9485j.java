package p174e.p319f.p393c.p394a.p404z.p405a;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* renamed from: e.f.c.a.z.a.j */
public abstract class C9485j {

    /* renamed from: a */
    int f25382a;

    /* renamed from: b */
    int f25383b;

    /* renamed from: c */
    int f25384c;

    /* renamed from: d */
    C9490k f25385d;

    /* renamed from: e */
    private boolean f25386e;

    /* renamed from: e.f.c.a.z.a.j$b */
    private static final class C9487b extends C9485j {

        /* renamed from: f */
        private final byte[] f25387f;

        /* renamed from: g */
        private final boolean f25388g;

        /* renamed from: h */
        private int f25389h;

        /* renamed from: i */
        private int f25390i;

        /* renamed from: j */
        private int f25391j;

        /* renamed from: k */
        private int f25392k;

        /* renamed from: l */
        private int f25393l;

        /* renamed from: m */
        private boolean f25394m;

        /* renamed from: n */
        private int f25395n;

        private C9487b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f25395n = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
            this.f25387f = bArr;
            this.f25389h = i2 + i;
            this.f25391j = i;
            this.f25392k = i;
            this.f25388g = z;
        }

        /* renamed from: K */
        private void m31759K() {
            int i = this.f25389h + this.f25390i;
            this.f25389h = i;
            int i2 = i - this.f25392k;
            int i3 = this.f25395n;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f25390i = i4;
                this.f25389h = i - i4;
                return;
            }
            this.f25390i = 0;
        }

        /* renamed from: N */
        private void m31760N() {
            if (this.f25389h - this.f25391j >= 10) {
                m31761O();
            } else {
                m31762P();
            }
        }

        /* renamed from: O */
        private void m31761O() {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f25387f;
                int i2 = this.f25391j;
                this.f25391j = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C9443c0.m31445e();
        }

        /* renamed from: P */
        private void m31762P() {
            int i = 0;
            while (i < 10) {
                if (mo23698D() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C9443c0.m31445e();
        }

        /* renamed from: A */
        public int mo23674A() {
            return mo23702H();
        }

        /* renamed from: B */
        public long mo23675B() {
            return mo23703I();
        }

        /* renamed from: C */
        public boolean mo23676C(int i) {
            int b = C9555u1.m32444b(i);
            if (b == 0) {
                m31760N();
                return true;
            } else if (b == 1) {
                mo23706M(8);
                return true;
            } else if (b == 2) {
                mo23706M(mo23702H());
                return true;
            } else if (b == 3) {
                mo23705L();
                mo23677a(C9555u1.m32445c(C9555u1.m32443a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo23706M(4);
                    return true;
                }
                throw C9443c0.m31444d();
            }
        }

        /* renamed from: D */
        public byte mo23698D() {
            int i = this.f25391j;
            if (i != this.f25389h) {
                byte[] bArr = this.f25387f;
                this.f25391j = i + 1;
                return bArr[i];
            }
            throw C9443c0.m31449j();
        }

        /* renamed from: E */
        public byte[] mo23699E(int i) {
            if (i > 0) {
                int i2 = this.f25389h;
                int i3 = this.f25391j;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f25391j = i4;
                    return Arrays.copyOfRange(this.f25387f, i3, i4);
                }
            }
            if (i > 0) {
                throw C9443c0.m31449j();
            } else if (i == 0) {
                return C9431b0.f25307c;
            } else {
                throw C9443c0.m31446f();
            }
        }

        /* renamed from: F */
        public int mo23700F() {
            int i = this.f25391j;
            if (this.f25389h - i >= 4) {
                byte[] bArr = this.f25387f;
                this.f25391j = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw C9443c0.m31449j();
        }

        /* renamed from: G */
        public long mo23701G() {
            int i = this.f25391j;
            if (this.f25389h - i >= 8) {
                byte[] bArr = this.f25387f;
                this.f25391j = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw C9443c0.m31449j();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: H */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo23702H() {
            /*
                r5 = this;
                int r0 = r5.f25391j
                int r1 = r5.f25389h
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f25387f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f25391j = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo23704J()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f25391j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9485j.C9487b.mo23702H():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: I */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo23703I() {
            /*
                r11 = this;
                int r0 = r11.f25391j
                int r1 = r11.f25389h
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f25387f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f25391j = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo23704J()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f25391j = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9485j.C9487b.mo23703I():long");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public long mo23704J() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte D = mo23698D();
                j |= ((long) (D & Byte.MAX_VALUE)) << i;
                if ((D & 128) == 0) {
                    return j;
                }
            }
            throw C9443c0.m31445e();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: L */
        public void mo23705L() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo23697z()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo23676C(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9485j.C9487b.mo23705L():void");
        }

        /* renamed from: M */
        public void mo23706M(int i) {
            if (i >= 0) {
                int i2 = this.f25389h;
                int i3 = this.f25391j;
                if (i <= i2 - i3) {
                    this.f25391j = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw C9443c0.m31446f();
            }
            throw C9443c0.m31449j();
        }

        /* renamed from: a */
        public void mo23677a(int i) {
            if (this.f25393l != i) {
                throw C9443c0.m31441a();
            }
        }

        /* renamed from: d */
        public int mo23678d() {
            return this.f25391j - this.f25392k;
        }

        /* renamed from: e */
        public boolean mo23679e() {
            return this.f25391j == this.f25389h;
        }

        /* renamed from: i */
        public void mo23680i(int i) {
            this.f25395n = i;
            m31759K();
        }

        /* renamed from: j */
        public int mo23681j(int i) {
            if (i >= 0) {
                int d = i + mo23678d();
                int i2 = this.f25395n;
                if (d <= i2) {
                    this.f25395n = d;
                    m31759K();
                    return i2;
                }
                throw C9443c0.m31449j();
            }
            throw C9443c0.m31446f();
        }

        /* renamed from: k */
        public boolean mo23682k() {
            return mo23703I() != 0;
        }

        /* renamed from: l */
        public C9468i mo23683l() {
            int H = mo23702H();
            if (H > 0) {
                int i = this.f25389h;
                int i2 = this.f25391j;
                if (H <= i - i2) {
                    C9468i o = (!this.f25388g || !this.f25394m) ? C9468i.m31675o(this.f25387f, i2, H) : C9468i.m31670N(this.f25387f, i2, H);
                    this.f25391j += H;
                    return o;
                }
            }
            return H == 0 ? C9468i.f25367f : C9468i.m31669M(mo23699E(H));
        }

        /* renamed from: m */
        public double mo23684m() {
            return Double.longBitsToDouble(mo23701G());
        }

        /* renamed from: n */
        public int mo23685n() {
            return mo23702H();
        }

        /* renamed from: o */
        public int mo23686o() {
            return mo23700F();
        }

        /* renamed from: p */
        public long mo23687p() {
            return mo23701G();
        }

        /* renamed from: q */
        public float mo23688q() {
            return Float.intBitsToFloat(mo23700F());
        }

        /* renamed from: r */
        public int mo23689r() {
            return mo23702H();
        }

        /* renamed from: s */
        public long mo23690s() {
            return mo23703I();
        }

        /* renamed from: t */
        public int mo23691t() {
            return mo23700F();
        }

        /* renamed from: u */
        public long mo23692u() {
            return mo23701G();
        }

        /* renamed from: v */
        public int mo23693v() {
            return C9485j.m31730b(mo23702H());
        }

        /* renamed from: w */
        public long mo23694w() {
            return C9485j.m31731c(mo23703I());
        }

        /* renamed from: x */
        public String mo23695x() {
            int H = mo23702H();
            if (H > 0 && H <= this.f25389h - this.f25391j) {
                String str = new String(this.f25387f, this.f25391j, H, C9431b0.f25305a);
                this.f25391j += H;
                return str;
            } else if (H == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                if (H < 0) {
                    throw C9443c0.m31446f();
                }
                throw C9443c0.m31449j();
            }
        }

        /* renamed from: y */
        public String mo23696y() {
            int H = mo23702H();
            if (H > 0) {
                int i = this.f25389h;
                int i2 = this.f25391j;
                if (H <= i - i2) {
                    String e = C9547t1.m32394e(this.f25387f, i2, H);
                    this.f25391j += H;
                    return e;
                }
            }
            if (H == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (H <= 0) {
                throw C9443c0.m31446f();
            }
            throw C9443c0.m31449j();
        }

        /* renamed from: z */
        public int mo23697z() {
            if (mo23679e()) {
                this.f25393l = 0;
                return 0;
            }
            int H = mo23702H();
            this.f25393l = H;
            if (C9555u1.m32443a(H) != 0) {
                return this.f25393l;
            }
            throw C9443c0.m31442b();
        }
    }

    private C9485j() {
        this.f25383b = 100;
        this.f25384c = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        this.f25386e = false;
    }

    /* renamed from: b */
    public static int m31730b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m31731c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: f */
    public static C9485j m31732f(byte[] bArr) {
        return m31733g(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public static C9485j m31733g(byte[] bArr, int i, int i2) {
        return m31734h(bArr, i, i2, false);
    }

    /* renamed from: h */
    static C9485j m31734h(byte[] bArr, int i, int i2, boolean z) {
        C9487b bVar = new C9487b(bArr, i, i2, z);
        try {
            bVar.mo23681j(i2);
            return bVar;
        } catch (C9443c0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract int mo23674A();

    /* renamed from: B */
    public abstract long mo23675B();

    /* renamed from: C */
    public abstract boolean mo23676C(int i);

    /* renamed from: a */
    public abstract void mo23677a(int i);

    /* renamed from: d */
    public abstract int mo23678d();

    /* renamed from: e */
    public abstract boolean mo23679e();

    /* renamed from: i */
    public abstract void mo23680i(int i);

    /* renamed from: j */
    public abstract int mo23681j(int i);

    /* renamed from: k */
    public abstract boolean mo23682k();

    /* renamed from: l */
    public abstract C9468i mo23683l();

    /* renamed from: m */
    public abstract double mo23684m();

    /* renamed from: n */
    public abstract int mo23685n();

    /* renamed from: o */
    public abstract int mo23686o();

    /* renamed from: p */
    public abstract long mo23687p();

    /* renamed from: q */
    public abstract float mo23688q();

    /* renamed from: r */
    public abstract int mo23689r();

    /* renamed from: s */
    public abstract long mo23690s();

    /* renamed from: t */
    public abstract int mo23691t();

    /* renamed from: u */
    public abstract long mo23692u();

    /* renamed from: v */
    public abstract int mo23693v();

    /* renamed from: w */
    public abstract long mo23694w();

    /* renamed from: x */
    public abstract String mo23695x();

    /* renamed from: y */
    public abstract String mo23696y();

    /* renamed from: z */
    public abstract int mo23697z();
}
