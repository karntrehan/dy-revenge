package com.facebook.react.uimanager;

import com.facebook.yoga.C3301a;
import com.facebook.yoga.C3302b;
import com.facebook.yoga.C3303c;
import com.facebook.yoga.C3307g;
import com.facebook.yoga.C3308h;
import com.facebook.yoga.C3309i;
import com.facebook.yoga.C3310j;
import com.facebook.yoga.C3311k;
import com.facebook.yoga.C3312l;
import com.facebook.yoga.C3313m;
import com.facebook.yoga.C3316p;
import com.facebook.yoga.C3318q;
import com.facebook.yoga.C3320s;
import com.facebook.yoga.C3321t;
import com.facebook.yoga.C3323v;
import com.facebook.yoga.C3325w;
import java.util.ArrayList;
import java.util.Arrays;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.uimanager.e0 */
public class C2940e0 implements C2931d0<C2940e0> {

    /* renamed from: a */
    private static final C3303c f8213a = C2965g0.m11810a();

    /* renamed from: b */
    private int f8214b;

    /* renamed from: c */
    private String f8215c;

    /* renamed from: d */
    private int f8216d;

    /* renamed from: e */
    private C3031o0 f8217e;

    /* renamed from: f */
    private boolean f8218f;

    /* renamed from: g */
    private boolean f8219g = true;

    /* renamed from: h */
    private ArrayList<C2940e0> f8220h;

    /* renamed from: i */
    private C2940e0 f8221i;

    /* renamed from: j */
    private C2940e0 f8222j;

    /* renamed from: k */
    private boolean f8223k;

    /* renamed from: l */
    private int f8224l = 0;

    /* renamed from: m */
    private C2940e0 f8225m;

    /* renamed from: n */
    private ArrayList<C2940e0> f8226n;

    /* renamed from: o */
    private int f8227o;

    /* renamed from: p */
    private int f8228p;

    /* renamed from: q */
    private int f8229q;

    /* renamed from: r */
    private int f8230r;

    /* renamed from: s */
    private final C3001m0 f8231s;

    /* renamed from: t */
    private final float[] f8232t;

    /* renamed from: u */
    private final boolean[] f8233u;

    /* renamed from: v */
    private C3316p f8234v;

    /* renamed from: w */
    private Integer f8235w;

    /* renamed from: x */
    private Integer f8236x;

    public C2940e0() {
        float[] fArr = new float[9];
        this.f8232t = fArr;
        this.f8233u = new boolean[9];
        this.f8231s = new C3001m0(0.0f);
        if (!mo9551w()) {
            C3316p b = C2986i1.m11844a().mo3702b();
            b = b == null ? C3318q.m13043a(f8213a) : b;
            this.f8234v = b;
            b.mo10755C(this);
            Arrays.fill(fArr, Float.NaN);
            return;
        }
        this.f8234v = null;
    }

    /* renamed from: m0 */
    private int m11589m0() {
        C3000m J = mo9507J();
        if (J == C3000m.NONE) {
            return this.f8224l;
        }
        if (J == C3000m.LEAF) {
            return 1 + this.f8224l;
        }
        return 1;
    }

    /* renamed from: n1 */
    private void m11590n1(int i) {
        if (mo9507J() != C3000m.PARENT) {
            C2940e0 l0 = getParent();
            while (l0 != null) {
                l0.f8224l += i;
                if (l0.mo9507J() != C3000m.PARENT) {
                    l0 = l0.getParent();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: o1 */
    private void m11591o1() {
        float f;
        C3310j jVar;
        C3316p pVar;
        for (int i = 0; i <= 8; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 5 ? !(!C3307g.m12971a(this.f8232t[i]) || !C3307g.m12971a(this.f8232t[6]) || !C3307g.m12971a(this.f8232t[8])) : !(i == 1 || i == 3 ? !C3307g.m12971a(this.f8232t[i]) || !C3307g.m12971a(this.f8232t[7]) || !C3307g.m12971a(this.f8232t[8]) : !C3307g.m12971a(this.f8232t[i]))) {
                pVar = this.f8234v;
                jVar = C3310j.m12975e(i);
                f = this.f8231s.mo9736b(i);
            } else if (this.f8233u[i]) {
                this.f8234v.mo10793l0(C3310j.m12975e(i), this.f8232t[i]);
            } else {
                pVar = this.f8234v;
                jVar = C3310j.m12975e(i);
                f = this.f8232t[i];
            }
            pVar.mo10791k0(jVar, f);
        }
    }

    /* renamed from: A0 */
    public C2940e0 mo9536h(int i) {
        ArrayList<C2940e0> arrayList = this.f8220h;
        if (arrayList != null) {
            C2940e0 remove = arrayList.remove(i);
            remove.f8221i = null;
            if (this.f8234v != null && !mo9619v0()) {
                this.f8234v.mo10808t(i);
            }
            mo9621x0();
            int m0 = remove.m11589m0();
            this.f8224l -= m0;
            m11590n1(-m0);
            return remove;
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
    }

    /* renamed from: B */
    public final void mo9499B(int i) {
        this.f8216d = i;
    }

    /* renamed from: B0 */
    public final C2940e0 mo9518U(int i) {
        C6409a.m24521c(this.f8226n);
        C2940e0 remove = this.f8226n.remove(i);
        remove.f8225m = null;
        return remove;
    }

    /* renamed from: C */
    public void mo9500C(C3031o0 o0Var) {
        this.f8217e = o0Var;
    }

    /* renamed from: C0 */
    public void mo9560C0(C3301a aVar) {
        this.f8234v.mo10811v(aVar);
    }

    /* renamed from: D */
    public void mo9501D(float f) {
        this.f8234v.mo10801p0(f);
    }

    /* renamed from: D0 */
    public void mo9561D0(C3301a aVar) {
        this.f8234v.mo10813w(aVar);
    }

    /* renamed from: E */
    public int mo9502E() {
        return this.f8229q;
    }

    /* renamed from: E0 */
    public void mo9562E0(C3301a aVar) {
        this.f8234v.mo10814x(aVar);
    }

    /* renamed from: F */
    public final C3323v mo9503F() {
        return this.f8234v.mo10797n();
    }

    /* renamed from: F0 */
    public void mo9563F0(C3302b bVar) {
        this.f8234v.mo10816z(bVar);
    }

    /* renamed from: G */
    public int mo9504G() {
        return this.f8228p;
    }

    /* renamed from: G0 */
    public void mo9564G0(int i, float f) {
        this.f8234v.mo10754B(C3310j.m12975e(i), f);
    }

    /* renamed from: H */
    public void mo9505H(Object obj) {
    }

    /* renamed from: H0 */
    public void mo9565H0(int i, float f) {
        this.f8231s.mo9737d(i, f);
        m11591o1();
    }

    /* renamed from: I */
    public final C3031o0 mo9506I() {
        return (C3031o0) C6409a.m24521c(this.f8217e);
    }

    /* renamed from: I0 */
    public void mo9566I0(C3309i iVar) {
        this.f8234v.mo10757F(iVar);
    }

    /* renamed from: J */
    public C3000m mo9507J() {
        return (mo9551w() || mo9528c0()) ? C3000m.NONE : mo9607o0() ? C3000m.LEAF : C3000m.PARENT;
    }

    /* renamed from: J0 */
    public void mo9567J0(float f) {
        this.f8234v.mo10759H(f);
    }

    /* renamed from: K */
    public final int mo9508K() {
        C6409a.m24519a(this.f8216d != 0);
        return this.f8216d;
    }

    /* renamed from: K0 */
    public void mo9568K0() {
        this.f8234v.mo10760J();
    }

    /* renamed from: L0 */
    public void mo9569L0(float f) {
        this.f8234v.mo10761K(f);
    }

    /* renamed from: M */
    public final boolean mo9510M() {
        return this.f8218f;
    }

    /* renamed from: M0 */
    public void mo9570M0(C3311k kVar) {
        this.f8234v.mo10762M(kVar);
    }

    /* renamed from: N0 */
    public void mo9571N0(C3325w wVar) {
        this.f8234v.mo10807s0(wVar);
    }

    /* renamed from: O */
    public final String mo9512O() {
        return (String) C6409a.m24521c(this.f8215c);
    }

    /* renamed from: O0 */
    public void mo9572O0(C3312l lVar) {
        this.f8234v.mo10768S(lVar);
    }

    /* renamed from: P0 */
    public final void mo9513P(C2940e0 e0Var) {
        this.f8222j = e0Var;
    }

    /* renamed from: Q */
    public void mo9514Q(int i) {
        this.f8214b = i;
    }

    /* renamed from: Q0 */
    public void mo9574Q0(int i, float f) {
        this.f8234v.mo10769T(C3310j.m12975e(i), f);
    }

    /* renamed from: R */
    public final float mo9515R() {
        return this.f8234v.mo10794m();
    }

    /* renamed from: R0 */
    public void mo9575R0(int i) {
        this.f8234v.mo10770U(C3310j.m12975e(i));
    }

    /* renamed from: S */
    public void mo9516S(float f, float f2) {
        this.f8234v.mo10779d(f, f2);
    }

    /* renamed from: S0 */
    public void mo9576S0(int i, float f) {
        this.f8234v.mo10771V(C3310j.m12975e(i), f);
    }

    /* renamed from: T */
    public int mo9517T() {
        return this.f8227o;
    }

    /* renamed from: T0 */
    public void mo9577T0(C3313m mVar) {
        this.f8234v.mo10778c0(mVar);
    }

    /* renamed from: U0 */
    public void mo9578U0(C3320s sVar) {
        this.f8234v.mo10789j0(sVar);
    }

    /* renamed from: V */
    public final float mo9519V() {
        return this.f8234v.mo10792l();
    }

    /* renamed from: V0 */
    public void mo9579V0(int i, float f) {
        this.f8232t[i] = f;
        this.f8233u[i] = false;
        m11591o1();
    }

    /* renamed from: W */
    public void mo9520W(C3029o oVar) {
    }

    /* renamed from: W0 */
    public void mo9580W0(int i, float f) {
        this.f8232t[i] = f;
        this.f8233u[i] = !C3307g.m12971a(f);
        m11591o1();
    }

    /* renamed from: X0 */
    public void mo9581X0(int i, float f) {
        this.f8234v.mo10795m0(C3310j.m12975e(i), f);
    }

    /* renamed from: Y0 */
    public void mo9582Y0(int i, float f) {
        this.f8234v.mo10798n0(C3310j.m12975e(i), f);
    }

    /* renamed from: Z0 */
    public void mo9583Z0(C3321t tVar) {
        this.f8234v.mo10799o0(tVar);
    }

    /* renamed from: a0 */
    public final void mo9525a0(boolean z) {
        boolean z2 = true;
        C6409a.m24520b(getParent() == null, "Must remove from no opt parent first");
        C6409a.m24520b(this.f8225m == null, "Must remove from native parent first");
        if (mo9553y() != 0) {
            z2 = false;
        }
        C6409a.m24520b(z2, "Must remove all native children first");
        this.f8223k = z;
    }

    /* renamed from: a1 */
    public void mo9584a1(float f) {
        this.f8234v.mo10815y(f);
    }

    /* renamed from: b */
    public final int mo9526b() {
        ArrayList<C2940e0> arrayList = this.f8220h;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: b0 */
    public final void mo9527b0(C2962f0 f0Var) {
        C2932d1.m11578f(this, f0Var);
        mo9622y0();
    }

    /* renamed from: b1 */
    public void mo9585b1() {
        this.f8234v.mo10766Q();
    }

    /* renamed from: c0 */
    public final boolean mo9528c0() {
        return this.f8223k;
    }

    /* renamed from: c1 */
    public void mo9586c1(float f) {
        this.f8234v.mo10767R(f);
    }

    /* renamed from: d */
    public void mo9509L(C2940e0 e0Var, int i) {
        if (this.f8220h == null) {
            this.f8220h = new ArrayList<>(4);
        }
        this.f8220h.add(i, e0Var);
        e0Var.f8221i = this;
        if (this.f8234v != null && !mo9619v0()) {
            C3316p pVar = e0Var.f8234v;
            if (pVar != null) {
                this.f8234v.mo10777c(pVar, i);
            } else {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + e0Var.toString() + "' to a '" + toString() + "')");
            }
        }
        mo9621x0();
        int m0 = e0Var.m11589m0();
        this.f8224l += m0;
        m11590n1(m0);
    }

    /* renamed from: d0 */
    public final float mo9529d0() {
        return this.f8234v.mo10790k();
    }

    /* renamed from: d1 */
    public void mo9588d1(float f) {
        this.f8234v.mo10772Y(f);
    }

    /* renamed from: e */
    public void mo9530e() {
        C3316p pVar = this.f8234v;
        if (pVar != null) {
            pVar.mo10809u();
            C2986i1.m11844a().mo3701a(this.f8234v);
        }
    }

    /* renamed from: e0 */
    public final void mo9498A(C2940e0 e0Var, int i) {
        boolean z = true;
        C6409a.m24519a(mo9507J() == C3000m.PARENT);
        if (e0Var.mo9507J() == C3000m.NONE) {
            z = false;
        }
        C6409a.m24519a(z);
        if (this.f8226n == null) {
            this.f8226n = new ArrayList<>(4);
        }
        this.f8226n.add(i, e0Var);
        e0Var.f8225m = this;
    }

    /* renamed from: e1 */
    public void mo9590e1(float f) {
        this.f8234v.mo10773Z(f);
    }

    /* renamed from: f */
    public int mo9531f() {
        return this.f8230r;
    }

    /* renamed from: f0 */
    public final C2940e0 mo9524a(int i) {
        ArrayList<C2940e0> arrayList = this.f8220h;
        if (arrayList != null) {
            return arrayList.get(i);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
    }

    /* renamed from: f1 */
    public void mo9592f1(float f) {
        this.f8234v.mo10774a0(f);
    }

    /* renamed from: g */
    public final void mo9532g() {
        this.f8219g = false;
        if (mo9606n0()) {
            mo9620w0();
        }
    }

    /* renamed from: g0 */
    public final C3308h mo9593g0() {
        return this.f8234v.mo10784g();
    }

    /* renamed from: g1 */
    public void mo9594g1(float f) {
        this.f8234v.mo10775b0(f);
    }

    public Integer getHeightMeasureSpec() {
        return this.f8236x;
    }

    public Integer getWidthMeasureSpec() {
        return this.f8235w;
    }

    /* renamed from: h0 */
    public final C2940e0 mo9521X() {
        C2940e0 e0Var = this.f8222j;
        return e0Var != null ? e0Var : mo9523Z();
    }

    /* renamed from: h1 */
    public void mo9596h1(float f) {
        this.f8234v.mo10780d0(f);
    }

    /* renamed from: i */
    public void mo9537i(float f) {
        this.f8234v.mo10765P(f);
    }

    /* renamed from: i0 */
    public final int mo9552x(C2940e0 e0Var) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= mo9526b()) {
                break;
            }
            C2940e0 f0 = mo9524a(i);
            if (e0Var == f0) {
                z = true;
                break;
            }
            i2 += f0.m11589m0();
            i++;
        }
        if (z) {
            return i2;
        }
        throw new RuntimeException("Child " + e0Var.mo9548t() + " was not a child of " + this.f8214b);
    }

    /* renamed from: i1 */
    public void mo9598i1(float f) {
        this.f8234v.mo10783f0(f);
    }

    /* renamed from: j */
    public void mo9538j(int i, int i2) {
        this.f8235w = Integer.valueOf(i);
        this.f8236x = Integer.valueOf(i2);
    }

    /* renamed from: j0 */
    public final C2940e0 mo9523Z() {
        return this.f8225m;
    }

    /* renamed from: j1 */
    public void mo9600j1(float f) {
        this.f8234v.mo10785g0(f);
    }

    /* renamed from: k */
    public void mo9539k() {
        if (!mo9551w()) {
            this.f8234v.mo10781e();
        } else if (getParent() != null) {
            getParent().mo9539k();
        }
    }

    /* renamed from: k0 */
    public final float mo9601k0(int i) {
        return this.f8234v.mo10788j(C3310j.m12975e(i));
    }

    /* renamed from: k1 */
    public void mo9602k1(float f) {
        this.f8234v.mo10786h0(f);
    }

    /* renamed from: l */
    public final void mo9540l(String str) {
        this.f8215c = str;
    }

    /* renamed from: l0 */
    public final C2940e0 getParent() {
        return this.f8221i;
    }

    /* renamed from: l1 */
    public void mo9604l1() {
        this.f8234v.mo10803q0();
    }

    /* renamed from: m */
    public void mo9541m(C3308h hVar) {
        this.f8234v.mo10756D(hVar);
    }

    /* renamed from: m1 */
    public void mo9605m1(float f) {
        this.f8234v.mo10805r0(f);
    }

    /* renamed from: n */
    public final float mo9542n() {
        return this.f8234v.mo10787i();
    }

    /* renamed from: n0 */
    public final boolean mo9606n0() {
        C3316p pVar = this.f8234v;
        return pVar != null && pVar.mo10800p();
    }

    /* renamed from: o */
    public final boolean mo9543o() {
        return this.f8219g || mo9606n0() || mo9611s0();
    }

    /* renamed from: o0 */
    public boolean mo9607o0() {
        return false;
    }

    /* renamed from: p */
    public final C3323v mo9544p() {
        return this.f8234v.mo10782f();
    }

    /* renamed from: p0 */
    public final int mo9511N(C2940e0 e0Var) {
        ArrayList<C2940e0> arrayList = this.f8220h;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(e0Var);
    }

    /* renamed from: q */
    public Iterable<? extends C2931d0> mo9545q() {
        if (mo9618u0()) {
            return null;
        }
        return this.f8220h;
    }

    /* renamed from: q0 */
    public final int mo9554z(C2940e0 e0Var) {
        C6409a.m24521c(this.f8226n);
        return this.f8226n.indexOf(e0Var);
    }

    /* renamed from: r */
    public boolean mo9546r(float f, float f2, C3061z0 z0Var, C3029o oVar) {
        if (this.f8219g) {
            mo9623z0(z0Var);
        }
        boolean z = false;
        if (mo9606n0()) {
            float V = mo9519V();
            float R = mo9515R();
            float f3 = f + V;
            int round = Math.round(f3);
            float f4 = f2 + R;
            int round2 = Math.round(f4);
            int round3 = Math.round(f3 + mo9529d0());
            int round4 = Math.round(f4 + mo9542n());
            int round5 = Math.round(V);
            int round6 = Math.round(R);
            int i = round3 - round;
            int i2 = round4 - round2;
            if (!(round5 == this.f8227o && round6 == this.f8228p && i == this.f8229q && i2 == this.f8230r)) {
                z = true;
            }
            this.f8227o = round5;
            this.f8228p = round6;
            this.f8229q = i;
            this.f8230r = i2;
            if (z) {
                if (oVar != null) {
                    oVar.mo9802l(this);
                } else {
                    z0Var.mo9891S(getParent().mo9548t(), mo9548t(), mo9517T(), mo9504G(), mo9502E(), mo9531f());
                }
            }
        }
        return z;
    }

    /* renamed from: r0 */
    public boolean mo9522Y(C2940e0 e0Var) {
        for (C2940e0 l0 = getParent(); l0 != null; l0 = l0.getParent()) {
            if (l0 == e0Var) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public void mo9547s() {
        if (mo9526b() != 0) {
            int i = 0;
            for (int b = mo9526b() - 1; b >= 0; b--) {
                if (this.f8234v != null && !mo9619v0()) {
                    this.f8234v.mo10808t(b);
                }
                C2940e0 f0 = mo9524a(b);
                f0.f8221i = null;
                i += f0.m11589m0();
                f0.mo9530e();
            }
            ((ArrayList) C6409a.m24521c(this.f8220h)).clear();
            mo9621x0();
            this.f8224l -= i;
            m11590n1(-i);
        }
    }

    /* renamed from: s0 */
    public final boolean mo9611s0() {
        C3316p pVar = this.f8234v;
        return pVar != null && pVar.mo10802q();
    }

    public void setFlex(float f) {
        this.f8234v.mo10758G(f);
    }

    public void setFlexGrow(float f) {
        this.f8234v.mo10763N(f);
    }

    public void setFlexShrink(float f) {
        this.f8234v.mo10764O(f);
    }

    public void setShouldNotifyOnLayout(boolean z) {
        this.f8218f = z;
    }

    /* renamed from: t */
    public final int mo9548t() {
        return this.f8214b;
    }

    /* renamed from: t0 */
    public boolean mo9616t0() {
        return this.f8234v.mo10804r();
    }

    public String toString() {
        return "[" + this.f8215c + " " + mo9548t() + "]";
    }

    /* renamed from: u */
    public final void mo9549u() {
        ArrayList<C2940e0> arrayList = this.f8226n;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.f8226n.get(size).f8225m = null;
            }
            this.f8226n.clear();
        }
    }

    /* renamed from: u0 */
    public boolean mo9618u0() {
        return false;
    }

    /* renamed from: v */
    public void mo9550v() {
        mo9516S(Float.NaN, Float.NaN);
    }

    /* renamed from: v0 */
    public boolean mo9619v0() {
        return mo9616t0();
    }

    /* renamed from: w */
    public boolean mo9551w() {
        return false;
    }

    /* renamed from: w0 */
    public final void mo9620w0() {
        C3316p pVar = this.f8234v;
        if (pVar != null) {
            pVar.mo10806s();
        }
    }

    /* renamed from: x0 */
    public void mo9621x0() {
        if (!this.f8219g) {
            this.f8219g = true;
            C2940e0 l0 = getParent();
            if (l0 != null) {
                l0.mo9621x0();
            }
        }
    }

    /* renamed from: y */
    public final int mo9553y() {
        ArrayList<C2940e0> arrayList = this.f8226n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: y0 */
    public void mo9622y0() {
    }

    /* renamed from: z0 */
    public void mo9623z0(C3061z0 z0Var) {
    }
}
