package p174e.p319f.p393c.p394a.p404z.p405a;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import p174e.p319f.p393c.p394a.p404z.p405a.C9508l0;

/* renamed from: e.f.c.a.z.a.f */
abstract class C9457f implements C9464g1 {

    /* renamed from: e.f.c.a.z.a.f$b */
    private static final class C9459b extends C9457f {

        /* renamed from: a */
        private final boolean f25345a;

        /* renamed from: b */
        private final byte[] f25346b;

        /* renamed from: c */
        private int f25347c;

        /* renamed from: d */
        private final int f25348d;

        /* renamed from: e */
        private int f25349e;

        /* renamed from: f */
        private int f25350f;

        /* renamed from: g */
        private int f25351g;

        public C9459b(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f25345a = z;
            this.f25346b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f25347c = arrayOffset;
            this.f25348d = arrayOffset;
            this.f25349e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        /* renamed from: R */
        private boolean m31510R() {
            return this.f25347c == this.f25349e;
        }

        /* renamed from: S */
        private byte m31511S() {
            int i = this.f25347c;
            if (i != this.f25349e) {
                byte[] bArr = this.f25346b;
                this.f25347c = i + 1;
                return bArr[i];
            }
            throw C9443c0.m31449j();
        }

        /* renamed from: T */
        private <T> T m31512T(C9467h1<T> h1Var, C9526q qVar) {
            int i = this.f25351g;
            this.f25351g = C9555u1.m32445c(C9555u1.m32443a(this.f25350f), 4);
            try {
                T i2 = h1Var.mo23637i();
                h1Var.mo23634f(i2, this, qVar);
                h1Var.mo23630b(i2);
                if (this.f25350f == this.f25351g) {
                    return i2;
                }
                throw C9443c0.m31447g();
            } finally {
                this.f25351g = i;
            }
        }

        /* renamed from: U */
        private int m31513U() {
            m31520e0(4);
            return m31514V();
        }

        /* renamed from: V */
        private int m31514V() {
            int i = this.f25347c;
            byte[] bArr = this.f25346b;
            this.f25347c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: W */
        private long m31515W() {
            m31520e0(8);
            return m31516X();
        }

        /* renamed from: X */
        private long m31516X() {
            int i = this.f25347c;
            byte[] bArr = this.f25346b;
            this.f25347c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* renamed from: Y */
        private <T> T m31517Y(C9467h1<T> h1Var, C9526q qVar) {
            int b0 = m31518b0();
            m31520e0(b0);
            int i = this.f25349e;
            int i2 = this.f25347c + b0;
            this.f25349e = i2;
            try {
                T i3 = h1Var.mo23637i();
                h1Var.mo23634f(i3, this, qVar);
                h1Var.mo23630b(i3);
                if (this.f25347c == i2) {
                    return i3;
                }
                throw C9443c0.m31447g();
            } finally {
                this.f25349e = i;
            }
        }

        /* renamed from: b0 */
        private int m31518b0() {
            byte b;
            int i = this.f25347c;
            int i2 = this.f25349e;
            if (i2 != i) {
                byte[] bArr = this.f25346b;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f25347c = i3;
                    return b2;
                } else if (i2 - i3 < 9) {
                    return (int) m31519d0();
                } else {
                    int i4 = i3 + 1;
                    byte b3 = b2 ^ (bArr[i3] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i5 = i4 + 1;
                        byte b4 = b3 ^ (bArr[i4] << 14);
                        if (b4 >= 0) {
                            b = b4 ^ 16256;
                        } else {
                            i4 = i5 + 1;
                            byte b5 = b4 ^ (bArr[i5] << 21);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                i5 = i4 + 1;
                                byte b6 = bArr[i4];
                                b = (b5 ^ (b6 << 28)) ^ 266354560;
                                if (b6 < 0) {
                                    i4 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i4 + 1;
                                        if (bArr[i4] < 0) {
                                            i4 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i4 + 1;
                                                if (bArr[i4] < 0) {
                                                    i4 = i5 + 1;
                                                    if (bArr[i5] < 0) {
                                                        throw C9443c0.m31445e();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i4 = i5;
                    }
                    this.f25347c = i4;
                    return b;
                }
            } else {
                throw C9443c0.m31449j();
            }
        }

        /* renamed from: d0 */
        private long m31519d0() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte S = m31511S();
                j |= ((long) (S & Byte.MAX_VALUE)) << i;
                if ((S & 128) == 0) {
                    return j;
                }
            }
            throw C9443c0.m31445e();
        }

        /* renamed from: e0 */
        private void m31520e0(int i) {
            if (i < 0 || i > this.f25349e - this.f25347c) {
                throw C9443c0.m31449j();
            }
        }

        /* renamed from: f0 */
        private void m31521f0(int i) {
            if (this.f25347c != i) {
                throw C9443c0.m31449j();
            }
        }

        /* renamed from: g0 */
        private void m31522g0(int i) {
            if (C9555u1.m32444b(this.f25350f) != i) {
                throw C9443c0.m31444d();
            }
        }

        /* renamed from: h0 */
        private void m31523h0(int i) {
            m31520e0(i);
            this.f25347c += i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x001c, LOOP_START] */
        /* renamed from: i0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m31524i0() {
            /*
                r3 = this;
                int r0 = r3.f25351g
                int r1 = r3.f25350f
                int r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9555u1.m32443a(r1)
                r2 = 4
                int r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9555u1.m32445c(r1, r2)
                r3.f25351g = r1
            L_0x000f:
                int r1 = r3.mo23543B()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L_0x001e
                boolean r1 = r3.mo23549H()
                if (r1 != 0) goto L_0x000f
            L_0x001e:
                int r1 = r3.f25350f
                int r2 = r3.f25351g
                if (r1 != r2) goto L_0x0027
                r3.f25351g = r0
                return
            L_0x0027:
                e.f.c.a.z.a.c0 r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9443c0.m31447g()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9457f.C9459b.m31524i0():void");
        }

        /* renamed from: j0 */
        private void m31525j0() {
            int i = this.f25349e;
            int i2 = this.f25347c;
            if (i - i2 >= 10) {
                byte[] bArr = this.f25346b;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f25347c = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            m31526k0();
        }

        /* renamed from: k0 */
        private void m31526k0() {
            int i = 0;
            while (i < 10) {
                if (m31511S() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C9443c0.m31445e();
        }

        /* renamed from: l0 */
        private void m31527l0(int i) {
            m31520e0(i);
            if ((i & 3) != 0) {
                throw C9443c0.m31447g();
            }
        }

        /* renamed from: m0 */
        private void m31528m0(int i) {
            m31520e0(i);
            if ((i & 7) != 0) {
                throw C9443c0.m31447g();
            }
        }

        /* renamed from: A */
        public <T> T mo23542A(Class<T> cls, C9526q qVar) {
            m31522g0(2);
            return m31517Y(C9448d1.m31455a().mo23522d(cls), qVar);
        }

        /* renamed from: B */
        public int mo23543B() {
            if (m31510R()) {
                return RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
            }
            int b0 = m31518b0();
            this.f25350f = b0;
            return b0 == this.f25351g ? RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO : C9555u1.m32443a(b0);
        }

        /* renamed from: C */
        public void mo23544C(List<String> list) {
            mo23560a0(list, false);
        }

        /* renamed from: D */
        public void mo23545D(List<String> list) {
            mo23560a0(list, true);
        }

        /* renamed from: E */
        public C9468i mo23546E() {
            m31522g0(2);
            int b0 = m31518b0();
            if (b0 == 0) {
                return C9468i.f25367f;
            }
            m31520e0(b0);
            C9468i N = this.f25345a ? C9468i.m31670N(this.f25346b, this.f25347c, b0) : C9468i.m31675o(this.f25346b, this.f25347c, b0);
            this.f25347c += b0;
            return N;
        }

        /* renamed from: F */
        public void mo23547F(List<Float> list) {
            int i;
            int i2;
            if (list instanceof C9573x) {
                C9573x xVar = (C9573x) list;
                int b = C9555u1.m32444b(this.f25350f);
                if (b == 2) {
                    int b0 = m31518b0();
                    m31527l0(b0);
                    int i3 = this.f25347c + b0;
                    while (this.f25347c < i3) {
                        xVar.mo24043j(Float.intBitsToFloat(m31514V()));
                    }
                } else if (b == 5) {
                    do {
                        xVar.mo24043j(readFloat());
                        if (!m31510R()) {
                            i2 = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i2;
                } else {
                    throw C9443c0.m31444d();
                }
            } else {
                int b2 = C9555u1.m32444b(this.f25350f);
                if (b2 == 2) {
                    int b02 = m31518b0();
                    m31527l0(b02);
                    int i4 = this.f25347c + b02;
                    while (this.f25347c < i4) {
                        list.add(Float.valueOf(Float.intBitsToFloat(m31514V())));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!m31510R()) {
                            i = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i;
                } else {
                    throw C9443c0.m31444d();
                }
            }
        }

        /* renamed from: G */
        public int mo23548G() {
            m31522g0(0);
            return m31518b0();
        }

        /* renamed from: H */
        public boolean mo23549H() {
            int i;
            int i2;
            if (m31510R() || (i = this.f25350f) == this.f25351g) {
                return false;
            }
            int b = C9555u1.m32444b(i);
            if (b != 0) {
                if (b == 1) {
                    i2 = 8;
                } else if (b == 2) {
                    i2 = m31518b0();
                } else if (b == 3) {
                    m31524i0();
                    return true;
                } else if (b == 5) {
                    i2 = 4;
                } else {
                    throw C9443c0.m31444d();
                }
                m31523h0(i2);
                return true;
            }
            m31525j0();
            return true;
        }

        /* renamed from: I */
        public int mo23550I() {
            m31522g0(5);
            return m31513U();
        }

        /* renamed from: J */
        public void mo23551J(List<C9468i> list) {
            int i;
            if (C9555u1.m32444b(this.f25350f) == 2) {
                do {
                    list.add(mo23546E());
                    if (!m31510R()) {
                        i = this.f25347c;
                    } else {
                        return;
                    }
                } while (m31518b0() == this.f25350f);
                this.f25347c = i;
                return;
            }
            throw C9443c0.m31444d();
        }

        /* renamed from: K */
        public <K, V> void mo23552K(Map<K, V> map, C9508l0.C9509a<K, V> aVar, C9526q qVar) {
            m31522g0(2);
            int b0 = m31518b0();
            m31520e0(b0);
            int i = this.f25349e;
            this.f25349e = this.f25347c + b0;
            try {
                throw null;
            } catch (Throwable th) {
                this.f25349e = i;
                throw th;
            }
        }

        /* renamed from: L */
        public void mo23553L(List<Double> list) {
            int i;
            int i2;
            if (list instanceof C9517n) {
                C9517n nVar = (C9517n) list;
                int b = C9555u1.m32444b(this.f25350f);
                if (b == 1) {
                    do {
                        nVar.mo23881j(readDouble());
                        if (!m31510R()) {
                            i2 = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i2;
                } else if (b == 2) {
                    int b0 = m31518b0();
                    m31528m0(b0);
                    int i3 = this.f25347c + b0;
                    while (this.f25347c < i3) {
                        nVar.mo23881j(Double.longBitsToDouble(m31516X()));
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            } else {
                int b2 = C9555u1.m32444b(this.f25350f);
                if (b2 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!m31510R()) {
                            i = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i;
                } else if (b2 == 2) {
                    int b02 = m31518b0();
                    m31528m0(b02);
                    int i4 = this.f25347c + b02;
                    while (this.f25347c < i4) {
                        list.add(Double.valueOf(Double.longBitsToDouble(m31516X())));
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            }
        }

        /* renamed from: M */
        public <T> void mo23554M(List<T> list, C9467h1<T> h1Var, C9526q qVar) {
            int i;
            if (C9555u1.m32444b(this.f25350f) == 3) {
                int i2 = this.f25350f;
                do {
                    list.add(m31512T(h1Var, qVar));
                    if (!m31510R()) {
                        i = this.f25347c;
                    } else {
                        return;
                    }
                } while (m31518b0() == i2);
                this.f25347c = i;
                return;
            }
            throw C9443c0.m31444d();
        }

        /* renamed from: N */
        public long mo23555N() {
            m31522g0(0);
            return mo23563c0();
        }

        /* renamed from: O */
        public String mo23556O() {
            return mo23558Z(true);
        }

        /* renamed from: P */
        public void mo23557P(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C9488j0) {
                C9488j0 j0Var = (C9488j0) list;
                int b = C9555u1.m32444b(this.f25350f);
                if (b == 1) {
                    do {
                        j0Var.mo23714k(mo23562c());
                        if (!m31510R()) {
                            i2 = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i2;
                } else if (b == 2) {
                    int b0 = m31518b0();
                    m31528m0(b0);
                    int i3 = this.f25347c + b0;
                    while (this.f25347c < i3) {
                        j0Var.mo23714k(m31516X());
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            } else {
                int b2 = C9555u1.m32444b(this.f25350f);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo23562c()));
                        if (!m31510R()) {
                            i = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i;
                } else if (b2 == 2) {
                    int b02 = m31518b0();
                    m31528m0(b02);
                    int i4 = this.f25347c + b02;
                    while (this.f25347c < i4) {
                        list.add(Long.valueOf(m31516X()));
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            }
        }

        /* renamed from: Z */
        public String mo23558Z(boolean z) {
            m31522g0(2);
            int b0 = m31518b0();
            if (b0 == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            m31520e0(b0);
            if (z) {
                byte[] bArr = this.f25346b;
                int i = this.f25347c;
                if (!C9547t1.m32403n(bArr, i, i + b0)) {
                    throw C9443c0.m31443c();
                }
            }
            String str = new String(this.f25346b, this.f25347c, b0, C9431b0.f25305a);
            this.f25347c += b0;
            return str;
        }

        /* renamed from: a */
        public void mo23559a(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C9428a0) {
                C9428a0 a0Var = (C9428a0) list;
                int b = C9555u1.m32444b(this.f25350f);
                if (b == 0) {
                    do {
                        a0Var.mo23496j(mo23584v());
                        if (!m31510R()) {
                            i2 = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i2;
                } else if (b == 2) {
                    int b0 = this.f25347c + m31518b0();
                    while (this.f25347c < b0) {
                        a0Var.mo23496j(C9485j.m31730b(m31518b0()));
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            } else {
                int b2 = C9555u1.m32444b(this.f25350f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo23584v()));
                        if (!m31510R()) {
                            i = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i;
                } else if (b2 == 2) {
                    int b02 = this.f25347c + m31518b0();
                    while (this.f25347c < b02) {
                        list.add(Integer.valueOf(C9485j.m31730b(m31518b0())));
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            }
        }

        /* renamed from: a0 */
        public void mo23560a0(List<String> list, boolean z) {
            int i;
            int i2;
            if (C9555u1.m32444b(this.f25350f) != 2) {
                throw C9443c0.m31444d();
            } else if (!(list instanceof C9466h0) || z) {
                do {
                    list.add(mo23558Z(z));
                    if (!m31510R()) {
                        i = this.f25347c;
                    } else {
                        return;
                    }
                } while (m31518b0() == this.f25350f);
                this.f25347c = i;
            } else {
                C9466h0 h0Var = (C9466h0) list;
                do {
                    h0Var.mo23623s(mo23546E());
                    if (!m31510R()) {
                        i2 = this.f25347c;
                    } else {
                        return;
                    }
                } while (m31518b0() == this.f25350f);
                this.f25347c = i2;
            }
        }

        /* renamed from: b */
        public long mo23561b() {
            m31522g0(0);
            return mo23563c0();
        }

        /* renamed from: c */
        public long mo23562c() {
            m31522g0(1);
            return m31515W();
        }

        /* renamed from: c0 */
        public long mo23563c0() {
            long j;
            int i;
            long j2;
            long j3;
            byte b;
            int i2 = this.f25347c;
            int i3 = this.f25349e;
            if (i3 != i2) {
                byte[] bArr = this.f25346b;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f25347c = i4;
                    return (long) b2;
                } else if (i3 - i4 < 9) {
                    return m31519d0();
                } else {
                    int i5 = i4 + 1;
                    byte b3 = b2 ^ (bArr[i4] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i6 = i5 + 1;
                        byte b4 = b3 ^ (bArr[i5] << 14);
                        if (b4 >= 0) {
                            i = i6;
                            j = (long) (b4 ^ 16256);
                        } else {
                            i5 = i6 + 1;
                            byte b5 = b4 ^ (bArr[i6] << 21);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                long j4 = (long) b5;
                                int i7 = i5 + 1;
                                long j5 = j4 ^ (((long) bArr[i5]) << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i8 = i7 + 1;
                                    long j6 = j5 ^ (((long) bArr[i7]) << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i7 = i8 + 1;
                                        j5 = j6 ^ (((long) bArr[i8]) << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i7 + 1;
                                            j6 = j5 ^ (((long) bArr[i7]) << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i9 = i8 + 1;
                                                long j7 = (j6 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    i = i9 + 1;
                                                    if (((long) bArr[i9]) < 0) {
                                                        throw C9443c0.m31445e();
                                                    }
                                                } else {
                                                    i = i9;
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i = i7;
                            }
                        }
                        this.f25347c = i;
                        return j;
                    }
                    j = (long) b;
                    this.f25347c = i;
                    return j;
                }
            } else {
                throw C9443c0.m31449j();
            }
        }

        /* renamed from: d */
        public void mo23564d(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C9428a0) {
                C9428a0 a0Var = (C9428a0) list;
                int b = C9555u1.m32444b(this.f25350f);
                if (b == 2) {
                    int b0 = m31518b0();
                    m31527l0(b0);
                    int i3 = this.f25347c + b0;
                    while (this.f25347c < i3) {
                        a0Var.mo23496j(m31514V());
                    }
                } else if (b == 5) {
                    do {
                        a0Var.mo23496j(mo23550I());
                        if (!m31510R()) {
                            i2 = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i2;
                } else {
                    throw C9443c0.m31444d();
                }
            } else {
                int b2 = C9555u1.m32444b(this.f25350f);
                if (b2 == 2) {
                    int b02 = m31518b0();
                    m31527l0(b02);
                    int i4 = this.f25347c + b02;
                    while (this.f25347c < i4) {
                        list.add(Integer.valueOf(m31514V()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo23550I()));
                        if (!m31510R()) {
                            i = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i;
                } else {
                    throw C9443c0.m31444d();
                }
            }
        }

        /* renamed from: e */
        public void mo23565e(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C9488j0) {
                C9488j0 j0Var = (C9488j0) list;
                int b = C9555u1.m32444b(this.f25350f);
                if (b == 0) {
                    do {
                        j0Var.mo23714k(mo23585w());
                        if (!m31510R()) {
                            i2 = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i2;
                } else if (b == 2) {
                    int b0 = this.f25347c + m31518b0();
                    while (this.f25347c < b0) {
                        j0Var.mo23714k(C9485j.m31731c(mo23563c0()));
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            } else {
                int b2 = C9555u1.m32444b(this.f25350f);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo23585w()));
                        if (!m31510R()) {
                            i = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i;
                } else if (b2 == 2) {
                    int b02 = this.f25347c + m31518b0();
                    while (this.f25347c < b02) {
                        list.add(Long.valueOf(C9485j.m31731c(mo23563c0())));
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            }
        }

        /* renamed from: f */
        public void mo23566f(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C9428a0) {
                C9428a0 a0Var = (C9428a0) list;
                int b = C9555u1.m32444b(this.f25350f);
                if (b == 0) {
                    do {
                        a0Var.mo23496j(mo23572l());
                        if (!m31510R()) {
                            i2 = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i2;
                } else if (b == 2) {
                    int b0 = this.f25347c + m31518b0();
                    while (this.f25347c < b0) {
                        a0Var.mo23496j(m31518b0());
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            } else {
                int b2 = C9555u1.m32444b(this.f25350f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo23572l()));
                        if (!m31510R()) {
                            i = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i;
                } else if (b2 == 2) {
                    int b02 = this.f25347c + m31518b0();
                    while (this.f25347c < b02) {
                        list.add(Integer.valueOf(m31518b0()));
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            }
        }

        /* renamed from: g */
        public <T> void mo23567g(List<T> list, C9467h1<T> h1Var, C9526q qVar) {
            int i;
            if (C9555u1.m32444b(this.f25350f) == 2) {
                int i2 = this.f25350f;
                do {
                    list.add(m31517Y(h1Var, qVar));
                    if (!m31510R()) {
                        i = this.f25347c;
                    } else {
                        return;
                    }
                } while (m31518b0() == i2);
                this.f25347c = i;
                return;
            }
            throw C9443c0.m31444d();
        }

        /* renamed from: h */
        public int mo23568h() {
            m31522g0(5);
            return m31513U();
        }

        /* renamed from: i */
        public boolean mo23569i() {
            m31522g0(0);
            return m31518b0() != 0;
        }

        /* renamed from: j */
        public long mo23570j() {
            m31522g0(1);
            return m31515W();
        }

        /* renamed from: k */
        public void mo23571k(List<Long> list) {
            int i;
            int i2;
            int i3;
            if (list instanceof C9488j0) {
                C9488j0 j0Var = (C9488j0) list;
                int b = C9555u1.m32444b(this.f25350f);
                if (b == 0) {
                    do {
                        j0Var.mo23714k(mo23561b());
                        if (!m31510R()) {
                            i3 = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i3;
                    return;
                } else if (b == 2) {
                    i = this.f25347c + m31518b0();
                    while (this.f25347c < i) {
                        j0Var.mo23714k(mo23563c0());
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            } else {
                int b2 = C9555u1.m32444b(this.f25350f);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo23561b()));
                        if (!m31510R()) {
                            i2 = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i2;
                    return;
                } else if (b2 == 2) {
                    i = this.f25347c + m31518b0();
                    while (this.f25347c < i) {
                        list.add(Long.valueOf(mo23563c0()));
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            }
            m31521f0(i);
        }

        /* renamed from: l */
        public int mo23572l() {
            m31522g0(0);
            return m31518b0();
        }

        /* renamed from: m */
        public void mo23573m(List<Long> list) {
            int i;
            int i2;
            int i3;
            if (list instanceof C9488j0) {
                C9488j0 j0Var = (C9488j0) list;
                int b = C9555u1.m32444b(this.f25350f);
                if (b == 0) {
                    do {
                        j0Var.mo23714k(mo23555N());
                        if (!m31510R()) {
                            i3 = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i3;
                    return;
                } else if (b == 2) {
                    i = this.f25347c + m31518b0();
                    while (this.f25347c < i) {
                        j0Var.mo23714k(mo23563c0());
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            } else {
                int b2 = C9555u1.m32444b(this.f25350f);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo23555N()));
                        if (!m31510R()) {
                            i2 = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i2;
                    return;
                } else if (b2 == 2) {
                    i = this.f25347c + m31518b0();
                    while (this.f25347c < i) {
                        list.add(Long.valueOf(mo23563c0()));
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            }
            m31521f0(i);
        }

        /* renamed from: n */
        public void mo23574n(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C9488j0) {
                C9488j0 j0Var = (C9488j0) list;
                int b = C9555u1.m32444b(this.f25350f);
                if (b == 1) {
                    do {
                        j0Var.mo23714k(mo23570j());
                        if (!m31510R()) {
                            i2 = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i2;
                } else if (b == 2) {
                    int b0 = m31518b0();
                    m31528m0(b0);
                    int i3 = this.f25347c + b0;
                    while (this.f25347c < i3) {
                        j0Var.mo23714k(m31516X());
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            } else {
                int b2 = C9555u1.m32444b(this.f25350f);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo23570j()));
                        if (!m31510R()) {
                            i = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i;
                } else if (b2 == 2) {
                    int b02 = m31518b0();
                    m31528m0(b02);
                    int i4 = this.f25347c + b02;
                    while (this.f25347c < i4) {
                        list.add(Long.valueOf(m31516X()));
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            }
        }

        /* renamed from: o */
        public void mo23575o(List<Integer> list) {
            int i;
            int i2;
            int i3;
            if (list instanceof C9428a0) {
                C9428a0 a0Var = (C9428a0) list;
                int b = C9555u1.m32444b(this.f25350f);
                if (b == 0) {
                    do {
                        a0Var.mo23496j(mo23548G());
                        if (!m31510R()) {
                            i3 = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i3;
                    return;
                } else if (b == 2) {
                    i = this.f25347c + m31518b0();
                    while (this.f25347c < i) {
                        a0Var.mo23496j(m31518b0());
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            } else {
                int b2 = C9555u1.m32444b(this.f25350f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo23548G()));
                        if (!m31510R()) {
                            i2 = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i2;
                    return;
                } else if (b2 == 2) {
                    i = this.f25347c + m31518b0();
                    while (this.f25347c < i) {
                        list.add(Integer.valueOf(m31518b0()));
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            }
            m31521f0(i);
        }

        /* renamed from: p */
        public void mo23576p(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C9428a0) {
                C9428a0 a0Var = (C9428a0) list;
                int b = C9555u1.m32444b(this.f25350f);
                if (b == 0) {
                    do {
                        a0Var.mo23496j(mo23578r());
                        if (!m31510R()) {
                            i2 = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i2;
                } else if (b == 2) {
                    int b0 = this.f25347c + m31518b0();
                    while (this.f25347c < b0) {
                        a0Var.mo23496j(m31518b0());
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            } else {
                int b2 = C9555u1.m32444b(this.f25350f);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo23578r()));
                        if (!m31510R()) {
                            i = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i;
                } else if (b2 == 2) {
                    int b02 = this.f25347c + m31518b0();
                    while (this.f25347c < b02) {
                        list.add(Integer.valueOf(m31518b0()));
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            }
        }

        /* renamed from: q */
        public <T> T mo23577q(C9467h1<T> h1Var, C9526q qVar) {
            m31522g0(3);
            return m31512T(h1Var, qVar);
        }

        /* renamed from: r */
        public int mo23578r() {
            m31522g0(0);
            return m31518b0();
        }

        public double readDouble() {
            m31522g0(1);
            return Double.longBitsToDouble(m31515W());
        }

        public float readFloat() {
            m31522g0(5);
            return Float.intBitsToFloat(m31513U());
        }

        /* renamed from: s */
        public <T> T mo23581s(C9467h1<T> h1Var, C9526q qVar) {
            m31522g0(2);
            return m31517Y(h1Var, qVar);
        }

        /* renamed from: t */
        public int mo23582t() {
            return this.f25350f;
        }

        /* renamed from: u */
        public void mo23583u(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C9428a0) {
                C9428a0 a0Var = (C9428a0) list;
                int b = C9555u1.m32444b(this.f25350f);
                if (b == 2) {
                    int b0 = m31518b0();
                    m31527l0(b0);
                    int i3 = this.f25347c + b0;
                    while (this.f25347c < i3) {
                        a0Var.mo23496j(m31514V());
                    }
                } else if (b == 5) {
                    do {
                        a0Var.mo23496j(mo23568h());
                        if (!m31510R()) {
                            i2 = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i2;
                } else {
                    throw C9443c0.m31444d();
                }
            } else {
                int b2 = C9555u1.m32444b(this.f25350f);
                if (b2 == 2) {
                    int b02 = m31518b0();
                    m31527l0(b02);
                    int i4 = this.f25347c + b02;
                    while (this.f25347c < i4) {
                        list.add(Integer.valueOf(m31514V()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo23568h()));
                        if (!m31510R()) {
                            i = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i;
                } else {
                    throw C9443c0.m31444d();
                }
            }
        }

        /* renamed from: v */
        public int mo23584v() {
            m31522g0(0);
            return C9485j.m31730b(m31518b0());
        }

        /* renamed from: w */
        public long mo23585w() {
            m31522g0(0);
            return C9485j.m31731c(mo23563c0());
        }

        /* renamed from: x */
        public <T> T mo23586x(Class<T> cls, C9526q qVar) {
            m31522g0(3);
            return m31512T(C9448d1.m31455a().mo23522d(cls), qVar);
        }

        /* renamed from: y */
        public void mo23587y(List<Boolean> list) {
            int i;
            int i2;
            int i3;
            if (list instanceof C9462g) {
                C9462g gVar = (C9462g) list;
                int b = C9555u1.m32444b(this.f25350f);
                if (b == 0) {
                    do {
                        gVar.mo23606k(mo23569i());
                        if (!m31510R()) {
                            i3 = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i3;
                    return;
                } else if (b == 2) {
                    i = this.f25347c + m31518b0();
                    while (this.f25347c < i) {
                        gVar.mo23606k(m31518b0() != 0);
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            } else {
                int b2 = C9555u1.m32444b(this.f25350f);
                if (b2 == 0) {
                    do {
                        list.add(Boolean.valueOf(mo23569i()));
                        if (!m31510R()) {
                            i2 = this.f25347c;
                        } else {
                            return;
                        }
                    } while (m31518b0() == this.f25350f);
                    this.f25347c = i2;
                    return;
                } else if (b2 == 2) {
                    i = this.f25347c + m31518b0();
                    while (this.f25347c < i) {
                        list.add(Boolean.valueOf(m31518b0() != 0));
                    }
                } else {
                    throw C9443c0.m31444d();
                }
            }
            m31521f0(i);
        }

        /* renamed from: z */
        public String mo23588z() {
            return mo23558Z(false);
        }
    }

    private C9457f() {
    }

    /* renamed from: Q */
    public static C9457f m31509Q(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new C9459b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
