package p174e.p319f.p393c.p394a.p404z.p405a;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import p174e.p319f.p393c.p394a.p404z.p405a.C9547t1;

/* renamed from: e.f.c.a.z.a.l */
public abstract class C9504l extends C9465h {

    /* renamed from: a */
    private static final Logger f25431a = Logger.getLogger(C9504l.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final boolean f25432b = C9539s1.m32302C();

    /* renamed from: c */
    C9511m f25433c;

    /* renamed from: d */
    private boolean f25434d;

    /* renamed from: e.f.c.a.z.a.l$b */
    private static class C9506b extends C9504l {

        /* renamed from: e */
        private final byte[] f25435e;

        /* renamed from: f */
        private final int f25436f;

        /* renamed from: g */
        private final int f25437g;

        /* renamed from: h */
        private int f25438h;

        C9506b(byte[] bArr, int i, int i2) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) >= 0) {
                this.f25435e = bArr;
                this.f25436f = i;
                this.f25438h = i;
                this.f25437g = i3;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A0 */
        public final void mo23770A0(int i, C9537s0 s0Var, C9467h1 h1Var) {
            mo23782M0(i, 2);
            mo23784O0(((C9426a) s0Var).mo23478h(h1Var));
            h1Var.mo23633e(s0Var, this.f25433c);
        }

        /* renamed from: B0 */
        public final void mo23771B0(int i, C9537s0 s0Var) {
            mo23782M0(1, 3);
            mo23783N0(2, i);
            mo23813T0(3, s0Var);
            mo23782M0(1, 4);
        }

        /* renamed from: C0 */
        public final void mo23772C0(int i, C9468i iVar) {
            mo23782M0(1, 3);
            mo23783N0(2, i);
            mo23794j0(3, iVar);
            mo23782M0(1, 4);
        }

        /* renamed from: L0 */
        public final void mo23781L0(int i, String str) {
            mo23782M0(i, 2);
            mo23815V0(str);
        }

        /* renamed from: M0 */
        public final void mo23782M0(int i, int i2) {
            mo23784O0(C9555u1.m32445c(i, i2));
        }

        /* renamed from: N0 */
        public final void mo23783N0(int i, int i2) {
            mo23782M0(i, 0);
            mo23784O0(i2);
        }

        /* renamed from: O0 */
        public final void mo23784O0(int i) {
            if (!C9504l.f25432b || C9446d.m31453c() || mo23790f0() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f25435e;
                    int i2 = this.f25438h;
                    this.f25438h = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f25435e;
                    int i3 = this.f25438h;
                    this.f25438h = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C9507c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25438h), Integer.valueOf(this.f25437g), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f25435e;
                int i4 = this.f25438h;
                this.f25438h = i4 + 1;
                C9539s1.m32307H(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f25435e;
                int i5 = this.f25438h;
                this.f25438h = i5 + 1;
                C9539s1.m32307H(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f25435e;
                    int i7 = this.f25438h;
                    this.f25438h = i7 + 1;
                    C9539s1.m32307H(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f25435e;
                int i8 = this.f25438h;
                this.f25438h = i8 + 1;
                C9539s1.m32307H(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f25435e;
                    int i10 = this.f25438h;
                    this.f25438h = i10 + 1;
                    C9539s1.m32307H(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f25435e;
                int i11 = this.f25438h;
                this.f25438h = i11 + 1;
                C9539s1.m32307H(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f25435e;
                    int i13 = this.f25438h;
                    this.f25438h = i13 + 1;
                    C9539s1.m32307H(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f25435e;
                int i14 = this.f25438h;
                this.f25438h = i14 + 1;
                C9539s1.m32307H(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f25435e;
                int i15 = this.f25438h;
                this.f25438h = i15 + 1;
                C9539s1.m32307H(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        /* renamed from: P0 */
        public final void mo23785P0(int i, long j) {
            mo23782M0(i, 0);
            mo23786Q0(j);
        }

        /* renamed from: Q0 */
        public final void mo23786Q0(long j) {
            if (!C9504l.f25432b || mo23790f0() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f25435e;
                    int i = this.f25438h;
                    this.f25438h = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f25435e;
                    int i2 = this.f25438h;
                    this.f25438h = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C9507c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25438h), Integer.valueOf(this.f25437g), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f25435e;
                    int i3 = this.f25438h;
                    this.f25438h = i3 + 1;
                    C9539s1.m32307H(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f25435e;
                int i4 = this.f25438h;
                this.f25438h = i4 + 1;
                C9539s1.m32307H(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: R0 */
        public final void mo23811R0(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f25435e, this.f25438h, i2);
                this.f25438h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C9507c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25438h), Integer.valueOf(this.f25437g), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: S0 */
        public final void mo23812S0(C9468i iVar) {
            mo23784O0(iVar.size());
            iVar.mo23648O(this);
        }

        /* renamed from: T0 */
        public final void mo23813T0(int i, C9537s0 s0Var) {
            mo23782M0(i, 2);
            mo23814U0(s0Var);
        }

        /* renamed from: U0 */
        public final void mo23814U0(C9537s0 s0Var) {
            mo23784O0(s0Var.mo23981g());
            s0Var.mo23980e(this);
        }

        /* renamed from: V0 */
        public final void mo23815V0(String str) {
            int f;
            int i = this.f25438h;
            try {
                int W = C9504l.m31977W(str.length() * 3);
                int W2 = C9504l.m31977W(str.length());
                if (W2 == W) {
                    int i2 = i + W2;
                    this.f25438h = i2;
                    f = C9547t1.m32395f(str, this.f25435e, i2, mo23790f0());
                    this.f25438h = i;
                    mo23784O0((f - i) - W2);
                } else {
                    mo23784O0(C9547t1.m32396g(str));
                    f = C9547t1.m32395f(str, this.f25435e, this.f25438h, mo23790f0());
                }
                this.f25438h = f;
            } catch (C9547t1.C9551d e) {
                this.f25438h = i;
                mo23787b0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C9507c(e2);
            }
        }

        /* renamed from: a */
        public final void mo23628a(byte[] bArr, int i, int i2) {
            mo23811R0(bArr, i, i2);
        }

        /* renamed from: f0 */
        public final int mo23790f0() {
            return this.f25437g - this.f25438h;
        }

        /* renamed from: g0 */
        public final void mo23791g0(byte b) {
            try {
                byte[] bArr = this.f25435e;
                int i = this.f25438h;
                this.f25438h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C9507c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25438h), Integer.valueOf(this.f25437g), 1}), e);
            }
        }

        /* renamed from: h0 */
        public final void mo23792h0(int i, boolean z) {
            mo23782M0(i, 0);
            mo23791g0(z ? (byte) 1 : 0);
        }

        /* renamed from: j0 */
        public final void mo23794j0(int i, C9468i iVar) {
            mo23782M0(i, 2);
            mo23812S0(iVar);
        }

        /* renamed from: o0 */
        public final void mo23799o0(int i, int i2) {
            mo23782M0(i, 5);
            mo23800p0(i2);
        }

        /* renamed from: p0 */
        public final void mo23800p0(int i) {
            try {
                byte[] bArr = this.f25435e;
                int i2 = this.f25438h;
                int i3 = i2 + 1;
                this.f25438h = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                this.f25438h = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                this.f25438h = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f25438h = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C9507c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25438h), Integer.valueOf(this.f25437g), 1}), e);
            }
        }

        /* renamed from: q0 */
        public final void mo23801q0(int i, long j) {
            mo23782M0(i, 1);
            mo23802r0(j);
        }

        /* renamed from: r0 */
        public final void mo23802r0(long j) {
            try {
                byte[] bArr = this.f25435e;
                int i = this.f25438h;
                int i2 = i + 1;
                this.f25438h = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i2 + 1;
                this.f25438h = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i3 + 1;
                this.f25438h = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i4 + 1;
                this.f25438h = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i5 + 1;
                this.f25438h = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i6 + 1;
                this.f25438h = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i7 + 1;
                this.f25438h = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f25438h = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C9507c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f25438h), Integer.valueOf(this.f25437g), 1}), e);
            }
        }

        /* renamed from: w0 */
        public final void mo23807w0(int i, int i2) {
            mo23782M0(i, 0);
            mo23808x0(i2);
        }

        /* renamed from: x0 */
        public final void mo23808x0(int i) {
            if (i >= 0) {
                mo23784O0(i);
            } else {
                mo23786Q0((long) i);
            }
        }
    }

    /* renamed from: e.f.c.a.z.a.l$c */
    public static class C9507c extends IOException {
        C9507c(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        C9507c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private C9504l() {
    }

    /* renamed from: A */
    public static int m31955A(int i, C9460f0 f0Var) {
        return m31975U(i) + m31956B(f0Var);
    }

    /* renamed from: B */
    public static int m31956B(C9460f0 f0Var) {
        return m31957C(f0Var.mo23590b());
    }

    /* renamed from: C */
    static int m31957C(int i) {
        return m31977W(i) + i;
    }

    /* renamed from: D */
    public static int m31958D(int i, C9537s0 s0Var) {
        return (m31975U(1) * 2) + m31976V(2, i) + m31959E(3, s0Var);
    }

    /* renamed from: E */
    public static int m31959E(int i, C9537s0 s0Var) {
        return m31975U(i) + m31961G(s0Var);
    }

    /* renamed from: F */
    static int m31960F(int i, C9537s0 s0Var, C9467h1 h1Var) {
        return m31975U(i) + m31962H(s0Var, h1Var);
    }

    /* renamed from: G */
    public static int m31961G(C9537s0 s0Var) {
        return m31957C(s0Var.mo23981g());
    }

    /* renamed from: H */
    static int m31962H(C9537s0 s0Var, C9467h1 h1Var) {
        return m31957C(((C9426a) s0Var).mo23478h(h1Var));
    }

    /* renamed from: I */
    public static int m31963I(int i, C9468i iVar) {
        return (m31975U(1) * 2) + m31976V(2, i) + m31988g(3, iVar);
    }

    @Deprecated
    /* renamed from: J */
    public static int m31964J(int i) {
        return m31977W(i);
    }

    /* renamed from: K */
    public static int m31965K(int i, int i2) {
        return m31975U(i) + m31966L(i2);
    }

    /* renamed from: L */
    public static int m31966L(int i) {
        return 4;
    }

    /* renamed from: M */
    public static int m31967M(int i, long j) {
        return m31975U(i) + m31968N(j);
    }

    /* renamed from: N */
    public static int m31968N(long j) {
        return 8;
    }

    /* renamed from: O */
    public static int m31969O(int i, int i2) {
        return m31975U(i) + m31970P(i2);
    }

    /* renamed from: P */
    public static int m31970P(int i) {
        return m31977W(m31980Z(i));
    }

    /* renamed from: Q */
    public static int m31971Q(int i, long j) {
        return m31975U(i) + m31972R(j);
    }

    /* renamed from: R */
    public static int m31972R(long j) {
        return m31979Y(m31981a0(j));
    }

    /* renamed from: S */
    public static int m31973S(int i, String str) {
        return m31975U(i) + m31974T(str);
    }

    /* renamed from: T */
    public static int m31974T(String str) {
        int i;
        try {
            i = C9547t1.m32396g(str);
        } catch (C9547t1.C9551d unused) {
            i = str.getBytes(C9431b0.f25305a).length;
        }
        return m31957C(i);
    }

    /* renamed from: U */
    public static int m31975U(int i) {
        return m31977W(C9555u1.m32445c(i, 0));
    }

    /* renamed from: V */
    public static int m31976V(int i, int i2) {
        return m31975U(i) + m31977W(i2);
    }

    /* renamed from: W */
    public static int m31977W(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: X */
    public static int m31978X(int i, long j) {
        return m31975U(i) + m31979Y(j);
    }

    /* renamed from: Y */
    public static int m31979Y(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: Z */
    public static int m31980Z(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a0 */
    public static long m31981a0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: d */
    public static int m31983d(int i, boolean z) {
        return m31975U(i) + m31985e(z);
    }

    /* renamed from: d0 */
    public static C9504l m31984d0(byte[] bArr) {
        return m31986e0(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static int m31985e(boolean z) {
        return 1;
    }

    /* renamed from: e0 */
    public static C9504l m31986e0(byte[] bArr, int i, int i2) {
        return new C9506b(bArr, i, i2);
    }

    /* renamed from: f */
    public static int m31987f(byte[] bArr) {
        return m31957C(bArr.length);
    }

    /* renamed from: g */
    public static int m31988g(int i, C9468i iVar) {
        return m31975U(i) + m31989h(iVar);
    }

    /* renamed from: h */
    public static int m31989h(C9468i iVar) {
        return m31957C(iVar.size());
    }

    /* renamed from: i */
    public static int m31990i(int i, double d) {
        return m31975U(i) + m31991j(d);
    }

    /* renamed from: j */
    public static int m31991j(double d) {
        return 8;
    }

    /* renamed from: k */
    public static int m31992k(int i, int i2) {
        return m31975U(i) + m31993l(i2);
    }

    /* renamed from: l */
    public static int m31993l(int i) {
        return m32004w(i);
    }

    /* renamed from: m */
    public static int m31994m(int i, int i2) {
        return m31975U(i) + m31995n(i2);
    }

    /* renamed from: n */
    public static int m31995n(int i) {
        return 4;
    }

    /* renamed from: o */
    public static int m31996o(int i, long j) {
        return m31975U(i) + m31997p(j);
    }

    /* renamed from: p */
    public static int m31997p(long j) {
        return 8;
    }

    /* renamed from: q */
    public static int m31998q(int i, float f) {
        return m31975U(i) + m31999r(f);
    }

    /* renamed from: r */
    public static int m31999r(float f) {
        return 4;
    }

    @Deprecated
    /* renamed from: s */
    static int m32000s(int i, C9537s0 s0Var, C9467h1 h1Var) {
        return (m31975U(i) * 2) + m32002u(s0Var, h1Var);
    }

    @Deprecated
    /* renamed from: t */
    public static int m32001t(C9537s0 s0Var) {
        return s0Var.mo23981g();
    }

    @Deprecated
    /* renamed from: u */
    static int m32002u(C9537s0 s0Var, C9467h1 h1Var) {
        return ((C9426a) s0Var).mo23478h(h1Var);
    }

    /* renamed from: v */
    public static int m32003v(int i, int i2) {
        return m31975U(i) + m32004w(i2);
    }

    /* renamed from: w */
    public static int m32004w(int i) {
        if (i >= 0) {
            return m31977W(i);
        }
        return 10;
    }

    /* renamed from: x */
    public static int m32005x(int i, long j) {
        return m31975U(i) + m32006y(j);
    }

    /* renamed from: y */
    public static int m32006y(long j) {
        return m31979Y(j);
    }

    /* renamed from: z */
    public static int m32007z(int i, C9460f0 f0Var) {
        return (m31975U(1) * 2) + m31976V(2, i) + m31955A(3, f0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public abstract void mo23770A0(int i, C9537s0 s0Var, C9467h1 h1Var);

    /* renamed from: B0 */
    public abstract void mo23771B0(int i, C9537s0 s0Var);

    /* renamed from: C0 */
    public abstract void mo23772C0(int i, C9468i iVar);

    /* renamed from: D0 */
    public final void mo23773D0(int i, int i2) {
        mo23799o0(i, i2);
    }

    /* renamed from: E0 */
    public final void mo23774E0(int i) {
        mo23800p0(i);
    }

    /* renamed from: F0 */
    public final void mo23775F0(int i, long j) {
        mo23801q0(i, j);
    }

    /* renamed from: G0 */
    public final void mo23776G0(long j) {
        mo23802r0(j);
    }

    /* renamed from: H0 */
    public final void mo23777H0(int i, int i2) {
        mo23783N0(i, m31980Z(i2));
    }

    /* renamed from: I0 */
    public final void mo23778I0(int i) {
        mo23784O0(m31980Z(i));
    }

    /* renamed from: J0 */
    public final void mo23779J0(int i, long j) {
        mo23785P0(i, m31981a0(j));
    }

    /* renamed from: K0 */
    public final void mo23780K0(long j) {
        mo23786Q0(m31981a0(j));
    }

    /* renamed from: L0 */
    public abstract void mo23781L0(int i, String str);

    /* renamed from: M0 */
    public abstract void mo23782M0(int i, int i2);

    /* renamed from: N0 */
    public abstract void mo23783N0(int i, int i2);

    /* renamed from: O0 */
    public abstract void mo23784O0(int i);

    /* renamed from: P0 */
    public abstract void mo23785P0(int i, long j);

    /* renamed from: Q0 */
    public abstract void mo23786Q0(long j);

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final void mo23787b0(String str, C9547t1.C9551d dVar) {
        f25431a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(C9431b0.f25305a);
        try {
            mo23784O0(bytes.length);
            mo23628a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C9507c(e);
        } catch (C9507c e2) {
            throw e2;
        }
    }

    /* renamed from: c */
    public final void mo23788c() {
        if (mo23790f0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public boolean mo23789c0() {
        return this.f25434d;
    }

    /* renamed from: f0 */
    public abstract int mo23790f0();

    /* renamed from: g0 */
    public abstract void mo23791g0(byte b);

    /* renamed from: h0 */
    public abstract void mo23792h0(int i, boolean z);

    /* renamed from: i0 */
    public final void mo23793i0(boolean z) {
        mo23791g0(z ? (byte) 1 : 0);
    }

    /* renamed from: j0 */
    public abstract void mo23794j0(int i, C9468i iVar);

    /* renamed from: k0 */
    public final void mo23795k0(int i, double d) {
        mo23801q0(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: l0 */
    public final void mo23796l0(double d) {
        mo23802r0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: m0 */
    public final void mo23797m0(int i, int i2) {
        mo23807w0(i, i2);
    }

    /* renamed from: n0 */
    public final void mo23798n0(int i) {
        mo23808x0(i);
    }

    /* renamed from: o0 */
    public abstract void mo23799o0(int i, int i2);

    /* renamed from: p0 */
    public abstract void mo23800p0(int i);

    /* renamed from: q0 */
    public abstract void mo23801q0(int i, long j);

    /* renamed from: r0 */
    public abstract void mo23802r0(long j);

    /* renamed from: s0 */
    public final void mo23803s0(int i, float f) {
        mo23799o0(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: t0 */
    public final void mo23804t0(float f) {
        mo23800p0(Float.floatToRawIntBits(f));
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: u0 */
    public final void mo23805u0(int i, C9537s0 s0Var, C9467h1 h1Var) {
        mo23782M0(i, 3);
        mo23806v0(s0Var, h1Var);
        mo23782M0(i, 4);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: v0 */
    public final void mo23806v0(C9537s0 s0Var, C9467h1 h1Var) {
        h1Var.mo23633e(s0Var, this.f25433c);
    }

    /* renamed from: w0 */
    public abstract void mo23807w0(int i, int i2);

    /* renamed from: x0 */
    public abstract void mo23808x0(int i);

    /* renamed from: y0 */
    public final void mo23809y0(int i, long j) {
        mo23785P0(i, j);
    }

    /* renamed from: z0 */
    public final void mo23810z0(long j) {
        mo23786Q0(j);
    }
}
