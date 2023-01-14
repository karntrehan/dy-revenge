package p027c.p100v;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import p027c.p064i.p072j.C1988t;

/* renamed from: c.v.w */
public class C2203w extends C2199v0 {

    /* renamed from: Z */
    private static final TimeInterpolator f6432Z = new DecelerateInterpolator();

    /* renamed from: a0 */
    private static final TimeInterpolator f6433a0 = new AccelerateInterpolator();

    /* renamed from: b0 */
    private static final C2210g f6434b0 = new C2204a();

    /* renamed from: c0 */
    private static final C2210g f6435c0 = new C2205b();

    /* renamed from: d0 */
    private static final C2210g f6436d0 = new C2206c();

    /* renamed from: e0 */
    private static final C2210g f6437e0 = new C2207d();

    /* renamed from: f0 */
    private static final C2210g f6438f0 = new C2208e();

    /* renamed from: g0 */
    private static final C2210g f6439g0 = new C2209f();

    /* renamed from: h0 */
    private C2210g f6440h0 = f6439g0;

    /* renamed from: i0 */
    private int f6441i0 = 80;

    /* renamed from: c.v.w$a */
    static class C2204a extends C2211h {
        C2204a() {
            super((C2204a) null);
        }

        /* renamed from: b */
        public float mo7368b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: c.v.w$b */
    static class C2205b extends C2211h {
        C2205b() {
            super((C2204a) null);
        }

        /* renamed from: b */
        public float mo7368b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (C1988t.m8417y(viewGroup) != 1) {
                z = false;
            }
            float translationX = view.getTranslationX();
            float width = (float) viewGroup.getWidth();
            return z ? translationX + width : translationX - width;
        }
    }

    /* renamed from: c.v.w$c */
    static class C2206c extends C2212i {
        C2206c() {
            super((C2204a) null);
        }

        /* renamed from: a */
        public float mo7369a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: c.v.w$d */
    static class C2207d extends C2211h {
        C2207d() {
            super((C2204a) null);
        }

        /* renamed from: b */
        public float mo7368b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: c.v.w$e */
    static class C2208e extends C2211h {
        C2208e() {
            super((C2204a) null);
        }

        /* renamed from: b */
        public float mo7368b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (C1988t.m8417y(viewGroup) != 1) {
                z = false;
            }
            float translationX = view.getTranslationX();
            float width = (float) viewGroup.getWidth();
            return z ? translationX - width : translationX + width;
        }
    }

    /* renamed from: c.v.w$f */
    static class C2209f extends C2212i {
        C2209f() {
            super((C2204a) null);
        }

        /* renamed from: a */
        public float mo7369a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: c.v.w$g */
    private interface C2210g {
        /* renamed from: a */
        float mo7369a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo7368b(ViewGroup viewGroup, View view);
    }

    /* renamed from: c.v.w$h */
    private static abstract class C2211h implements C2210g {
        private C2211h() {
        }

        /* synthetic */ C2211h(C2204a aVar) {
            this();
        }

        /* renamed from: a */
        public float mo7369a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: c.v.w$i */
    private static abstract class C2212i implements C2210g {
        private C2212i() {
        }

        /* synthetic */ C2212i(C2204a aVar) {
            this();
        }

        /* renamed from: b */
        public float mo7368b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public C2203w(int i) {
        mo7367v0(i);
    }

    /* renamed from: o0 */
    private void m9328o0(C2144d0 d0Var) {
        int[] iArr = new int[2];
        d0Var.f6291b.getLocationOnScreen(iArr);
        d0Var.f6290a.put("android:slide:screenPosition", iArr);
    }

    /* renamed from: i */
    public void mo7187i(C2144d0 d0Var) {
        super.mo7187i(d0Var);
        m9328o0(d0Var);
    }

    /* renamed from: l */
    public void mo7191l(C2144d0 d0Var) {
        super.mo7191l(d0Var);
        m9328o0(d0Var);
    }

    /* renamed from: q0 */
    public Animator mo7264q0(ViewGroup viewGroup, View view, C2144d0 d0Var, C2144d0 d0Var2) {
        if (d0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) d0Var2.f6290a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C2156f0.m9164a(view, d0Var2, iArr[0], iArr[1], this.f6440h0.mo7368b(viewGroup, view), this.f6440h0.mo7369a(viewGroup, view), translationX, translationY, f6432Z, this);
    }

    /* renamed from: s0 */
    public Animator mo7265s0(ViewGroup viewGroup, View view, C2144d0 d0Var, C2144d0 d0Var2) {
        if (d0Var == null) {
            return null;
        }
        int[] iArr = (int[]) d0Var.f6290a.get("android:slide:screenPosition");
        return C2156f0.m9164a(view, d0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f6440h0.mo7368b(viewGroup, view), this.f6440h0.mo7369a(viewGroup, view), f6433a0, this);
    }

    /* renamed from: v0 */
    public void mo7367v0(int i) {
        C2210g gVar;
        if (i == 3) {
            gVar = f6434b0;
        } else if (i == 5) {
            gVar = f6437e0;
        } else if (i == 48) {
            gVar = f6436d0;
        } else if (i == 80) {
            gVar = f6439g0;
        } else if (i == 8388611) {
            gVar = f6435c0;
        } else if (i == 8388613) {
            gVar = f6438f0;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f6440h0 = gVar;
        this.f6441i0 = i;
        C2198v vVar = new C2198v();
        vVar.mo7358j(i);
        mo7190k0(vVar);
    }
}
