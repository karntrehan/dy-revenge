package p027c.p100v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import p027c.p064i.p072j.C1988t;

/* renamed from: c.v.e */
public class C2145e extends C2214x {

    /* renamed from: X */
    private static final String[] f6293X = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: Y */
    private static final Property<C2150e, float[]> f6294Y = new C2146a(float[].class, "nonTranslations");

    /* renamed from: Z */
    private static final Property<C2150e, PointF> f6295Z = new C2147b(PointF.class, "translations");

    /* renamed from: a0 */
    private static final boolean f6296a0 = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b0 */
    boolean f6297b0 = true;

    /* renamed from: c0 */
    private boolean f6298c0 = true;

    /* renamed from: d0 */
    private Matrix f6299d0 = new Matrix();

    /* renamed from: c.v.e$a */
    static class C2146a extends Property<C2150e, float[]> {
        C2146a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public float[] get(C2150e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C2150e eVar, float[] fArr) {
            eVar.mo7260d(fArr);
        }
    }

    /* renamed from: c.v.e$b */
    static class C2147b extends Property<C2150e, PointF> {
        C2147b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C2150e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C2150e eVar, PointF pointF) {
            eVar.mo7259c(pointF);
        }
    }

    /* renamed from: c.v.e$c */
    class C2148c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f6300a;

        /* renamed from: b */
        private Matrix f6301b = new Matrix();

        /* renamed from: c */
        final /* synthetic */ boolean f6302c;

        /* renamed from: d */
        final /* synthetic */ Matrix f6303d;

        /* renamed from: e */
        final /* synthetic */ View f6304e;

        /* renamed from: f */
        final /* synthetic */ C2151f f6305f;

        /* renamed from: g */
        final /* synthetic */ C2150e f6306g;

        C2148c(boolean z, Matrix matrix, View view, C2151f fVar, C2150e eVar) {
            this.f6302c = z;
            this.f6303d = matrix;
            this.f6304e = view;
            this.f6305f = fVar;
            this.f6306g = eVar;
        }

        /* renamed from: a */
        private void m9149a(Matrix matrix) {
            this.f6301b.set(matrix);
            this.f6304e.setTag(C2192s.transition_transform, this.f6301b);
            this.f6305f.mo7261a(this.f6304e);
        }

        public void onAnimationCancel(Animator animator) {
            this.f6300a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f6300a) {
                if (!this.f6302c || !C2145e.this.f6297b0) {
                    this.f6304e.setTag(C2192s.transition_transform, (Object) null);
                    this.f6304e.setTag(C2192s.parent_matrix, (Object) null);
                } else {
                    m9149a(this.f6303d);
                }
            }
            C2183o0.m9258f(this.f6304e, (Matrix) null);
            this.f6305f.mo7261a(this.f6304e);
        }

        public void onAnimationPause(Animator animator) {
            m9149a(this.f6306g.mo7258a());
        }

        public void onAnimationResume(Animator animator) {
            C2145e.m9138s0(this.f6304e);
        }
    }

    /* renamed from: c.v.e$d */
    private static class C2149d extends C2222y {

        /* renamed from: a */
        private View f6308a;

        /* renamed from: b */
        private C2166i f6309b;

        C2149d(View view, C2166i iVar) {
            this.f6308a = view;
            this.f6309b = iVar;
        }

        /* renamed from: b */
        public void mo7238b(C2214x xVar) {
            this.f6309b.setVisibility(4);
        }

        /* renamed from: c */
        public void mo7207c(C2214x xVar) {
            xVar.mo7177Z(this);
            C2177m.m9246b(this.f6308a);
            this.f6308a.setTag(C2192s.transition_transform, (Object) null);
            this.f6308a.setTag(C2192s.parent_matrix, (Object) null);
        }

        /* renamed from: e */
        public void mo7240e(C2214x xVar) {
            this.f6309b.setVisibility(0);
        }
    }

    /* renamed from: c.v.e$e */
    private static class C2150e {

        /* renamed from: a */
        private final Matrix f6310a = new Matrix();

        /* renamed from: b */
        private final View f6311b;

        /* renamed from: c */
        private final float[] f6312c;

        /* renamed from: d */
        private float f6313d;

        /* renamed from: e */
        private float f6314e;

        C2150e(View view, float[] fArr) {
            this.f6311b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f6312c = fArr2;
            this.f6313d = fArr2[2];
            this.f6314e = fArr2[5];
            m9153b();
        }

        /* renamed from: b */
        private void m9153b() {
            float[] fArr = this.f6312c;
            fArr[2] = this.f6313d;
            fArr[5] = this.f6314e;
            this.f6310a.setValues(fArr);
            C2183o0.m9258f(this.f6311b, this.f6310a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Matrix mo7258a() {
            return this.f6310a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo7259c(PointF pointF) {
            this.f6313d = pointF.x;
            this.f6314e = pointF.y;
            m9153b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo7260d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f6312c, 0, fArr.length);
            m9153b();
        }
    }

    /* renamed from: c.v.e$f */
    private static class C2151f {

        /* renamed from: a */
        final float f6315a;

        /* renamed from: b */
        final float f6316b;

        /* renamed from: c */
        final float f6317c;

        /* renamed from: d */
        final float f6318d;

        /* renamed from: e */
        final float f6319e;

        /* renamed from: f */
        final float f6320f;

        /* renamed from: g */
        final float f6321g;

        /* renamed from: h */
        final float f6322h;

        C2151f(View view) {
            this.f6315a = view.getTranslationX();
            this.f6316b = view.getTranslationY();
            this.f6317c = C1988t.m8349I(view);
            this.f6318d = view.getScaleX();
            this.f6319e = view.getScaleY();
            this.f6320f = view.getRotationX();
            this.f6321g = view.getRotationY();
            this.f6322h = view.getRotation();
        }

        /* renamed from: a */
        public void mo7261a(View view) {
            C2145e.m9140u0(view, this.f6315a, this.f6316b, this.f6317c, this.f6318d, this.f6319e, this.f6320f, this.f6321g, this.f6322h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2151f)) {
                return false;
            }
            C2151f fVar = (C2151f) obj;
            return fVar.f6315a == this.f6315a && fVar.f6316b == this.f6316b && fVar.f6317c == this.f6317c && fVar.f6318d == this.f6318d && fVar.f6319e == this.f6319e && fVar.f6320f == this.f6320f && fVar.f6321g == this.f6321g && fVar.f6322h == this.f6322h;
        }

        public int hashCode() {
            float f = this.f6315a;
            int i = 0;
            int floatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.f6316b;
            int floatToIntBits2 = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f6317c;
            int floatToIntBits3 = (floatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.f6318d;
            int floatToIntBits4 = (floatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f6319e;
            int floatToIntBits5 = (floatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f6320f;
            int floatToIntBits6 = (floatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f6321g;
            int floatToIntBits7 = (floatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f6322h;
            if (f8 != 0.0f) {
                i = Float.floatToIntBits(f8);
            }
            return floatToIntBits7 + i;
        }
    }

    /* renamed from: o0 */
    private void m9134o0(C2144d0 d0Var) {
        View view = d0Var.f6291b;
        if (view.getVisibility() != 8) {
            d0Var.f6290a.put("android:changeTransform:parent", view.getParent());
            d0Var.f6290a.put("android:changeTransform:transforms", new C2151f(view));
            Matrix matrix = view.getMatrix();
            d0Var.f6290a.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
            if (this.f6298c0) {
                Matrix matrix2 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                C2183o0.m9262j(viewGroup, matrix2);
                matrix2.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                d0Var.f6290a.put("android:changeTransform:parentMatrix", matrix2);
                d0Var.f6290a.put("android:changeTransform:intermediateMatrix", view.getTag(C2192s.transition_transform));
                d0Var.f6290a.put("android:changeTransform:intermediateParentMatrix", view.getTag(C2192s.parent_matrix));
            }
        }
    }

    /* renamed from: p0 */
    private void m9135p0(ViewGroup viewGroup, C2144d0 d0Var, C2144d0 d0Var2) {
        View view = d0Var2.f6291b;
        Matrix matrix = new Matrix((Matrix) d0Var2.f6290a.get("android:changeTransform:parentMatrix"));
        C2183o0.m9263k(viewGroup, matrix);
        C2166i a = C2177m.m9245a(view, viewGroup, matrix);
        if (a != null) {
            a.mo7278a((ViewGroup) d0Var.f6290a.get("android:changeTransform:parent"), d0Var.f6291b);
            C2214x xVar = this;
            while (true) {
                C2214x xVar2 = xVar.f6453H;
                if (xVar2 == null) {
                    break;
                }
                xVar = xVar2;
            }
            xVar.mo7180c(new C2149d(view, a));
            if (f6296a0) {
                View view2 = d0Var.f6291b;
                if (view2 != d0Var2.f6291b) {
                    C2183o0.m9260h(view2, 0.0f);
                }
                C2183o0.m9260h(view, 1.0f);
            }
        }
    }

    /* renamed from: q0 */
    private ObjectAnimator m9136q0(C2144d0 d0Var, C2144d0 d0Var2, boolean z) {
        Matrix matrix = (Matrix) d0Var.f6290a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) d0Var2.f6290a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = C2179n.f6388a;
        }
        if (matrix2 == null) {
            matrix2 = C2179n.f6388a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        View view = d0Var2.f6291b;
        m9138s0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        C2150e eVar = new C2150e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, new PropertyValuesHolder[]{PropertyValuesHolder.ofObject(f6294Y, new C2158g(new float[9]), new float[][]{fArr, fArr2}), C2190r.m9278a(f6295Z, mo7395z().mo7341a(fArr[2], fArr[5], fArr2[2], fArr2[5]))});
        C2148c cVar = new C2148c(z, matrix3, view, (C2151f) d0Var2.f6290a.get("android:changeTransform:transforms"), eVar);
        ofPropertyValuesHolder.addListener(cVar);
        C2123a.m9063a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r5 == r4.f6291b) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r4 == r5) goto L_0x001e;
     */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m9137r0(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo7380O(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r3.mo7380O(r5)
            if (r0 != 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            c.v.d0 r4 = r3.mo7393x(r4, r1)
            if (r4 == 0) goto L_0x001f
            android.view.View r4 = r4.f6291b
            if (r5 != r4) goto L_0x001d
            goto L_0x001e
        L_0x001a:
            if (r4 != r5) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            r2 = r1
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p100v.C2145e.m9137r0(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    /* renamed from: s0 */
    static void m9138s0(View view) {
        m9140u0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: t0 */
    private void m9139t0(C2144d0 d0Var, C2144d0 d0Var2) {
        Matrix matrix = (Matrix) d0Var2.f6290a.get("android:changeTransform:parentMatrix");
        d0Var2.f6291b.setTag(C2192s.parent_matrix, matrix);
        Matrix matrix2 = this.f6299d0;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) d0Var.f6290a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            d0Var.f6290a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) d0Var.f6290a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    /* renamed from: u0 */
    static void m9140u0(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        C1988t.m8342E0(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    /* renamed from: K */
    public String[] mo7209K() {
        return f6293X;
    }

    /* renamed from: i */
    public void mo7187i(C2144d0 d0Var) {
        m9134o0(d0Var);
    }

    /* renamed from: l */
    public void mo7191l(C2144d0 d0Var) {
        m9134o0(d0Var);
        if (!f6296a0) {
            ((ViewGroup) d0Var.f6291b.getParent()).startViewTransition(d0Var.f6291b);
        }
    }

    /* renamed from: q */
    public Animator mo7210q(ViewGroup viewGroup, C2144d0 d0Var, C2144d0 d0Var2) {
        if (d0Var == null || d0Var2 == null || !d0Var.f6290a.containsKey("android:changeTransform:parent") || !d0Var2.f6290a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) d0Var.f6290a.get("android:changeTransform:parent");
        boolean z = this.f6298c0 && !m9137r0(viewGroup2, (ViewGroup) d0Var2.f6290a.get("android:changeTransform:parent"));
        Matrix matrix = (Matrix) d0Var.f6290a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            d0Var.f6290a.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) d0Var.f6290a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            d0Var.f6290a.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z) {
            m9139t0(d0Var, d0Var2);
        }
        ObjectAnimator q0 = m9136q0(d0Var, d0Var2, z);
        if (z && q0 != null && this.f6297b0) {
            m9135p0(viewGroup, d0Var, d0Var2);
        } else if (!f6296a0) {
            viewGroup2.endViewTransition(d0Var.f6291b);
        }
        return q0;
    }
}
