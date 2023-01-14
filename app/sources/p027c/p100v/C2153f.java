package p027c.p100v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import p027c.p064i.p072j.C1988t;

/* renamed from: c.v.f */
public class C2153f extends C2199v0 {

    /* renamed from: c.v.f$a */
    class C2154a extends C2222y {

        /* renamed from: a */
        final /* synthetic */ View f6327a;

        C2154a(View view) {
            this.f6327a = view;
        }

        /* renamed from: c */
        public void mo7207c(C2214x xVar) {
            C2183o0.m9260h(this.f6327a, 1.0f);
            C2183o0.m9253a(this.f6327a);
            xVar.mo7177Z(this);
        }
    }

    /* renamed from: c.v.f$b */
    private static class C2155b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f6329a;

        /* renamed from: b */
        private boolean f6330b = false;

        C2155b(View view) {
            this.f6329a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C2183o0.m9260h(this.f6329a, 1.0f);
            if (this.f6330b) {
                this.f6329a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C1988t.m8356N(this.f6329a) && this.f6329a.getLayerType() == 0) {
                this.f6330b = true;
                this.f6329a.setLayerType(2, (Paint) null);
            }
        }
    }

    public C2153f(int i) {
        mo7362u0(i);
    }

    /* renamed from: v0 */
    private Animator m9158v0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C2183o0.m9260h(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C2183o0.f6390b, new float[]{f2});
        ofFloat.addListener(new C2155b(view));
        mo7180c(new C2154a(view));
        return ofFloat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f6290a.get("android:fade:transitionAlpha");
     */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float m9159w0(p027c.p100v.C2144d0 r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f6290a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p100v.C2153f.m9159w0(c.v.d0, float):float");
    }

    /* renamed from: l */
    public void mo7191l(C2144d0 d0Var) {
        super.mo7191l(d0Var);
        d0Var.f6290a.put("android:fade:transitionAlpha", Float.valueOf(C2183o0.m9255c(d0Var.f6291b)));
    }

    /* renamed from: q0 */
    public Animator mo7264q0(ViewGroup viewGroup, View view, C2144d0 d0Var, C2144d0 d0Var2) {
        float f = 0.0f;
        float w0 = m9159w0(d0Var, 0.0f);
        if (w0 != 1.0f) {
            f = w0;
        }
        return m9158v0(view, f, 1.0f);
    }

    /* renamed from: s0 */
    public Animator mo7265s0(ViewGroup viewGroup, View view, C2144d0 d0Var, C2144d0 d0Var2) {
        C2183o0.m9257e(view);
        return m9158v0(view, m9159w0(d0Var, 1.0f), 0.0f);
    }
}
