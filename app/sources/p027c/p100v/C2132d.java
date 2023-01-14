package p027c.p100v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import p027c.p064i.p072j.C1988t;

/* renamed from: c.v.d */
public class C2132d extends C2214x {

    /* renamed from: X */
    private static final String[] f6253X = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: Y */
    private static final Property<Drawable, PointF> f6254Y = new C2134b(PointF.class, "boundsOrigin");

    /* renamed from: Z */
    private static final Property<C2143k, PointF> f6255Z = new C2135c(PointF.class, "topLeft");

    /* renamed from: a0 */
    private static final Property<C2143k, PointF> f6256a0 = new C2136d(PointF.class, "bottomRight");

    /* renamed from: b0 */
    private static final Property<View, PointF> f6257b0 = new C2137e(PointF.class, "bottomRight");

    /* renamed from: c0 */
    private static final Property<View, PointF> f6258c0 = new C2138f(PointF.class, "topLeft");

    /* renamed from: d0 */
    private static final Property<View, PointF> f6259d0 = new C2139g(PointF.class, "position");

    /* renamed from: e0 */
    private static C2194t f6260e0 = new C2194t();

    /* renamed from: f0 */
    private int[] f6261f0 = new int[2];

    /* renamed from: g0 */
    private boolean f6262g0 = false;

    /* renamed from: h0 */
    private boolean f6263h0 = false;

    /* renamed from: c.v.d$a */
    class C2133a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f6264a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f6265b;

        /* renamed from: c */
        final /* synthetic */ View f6266c;

        /* renamed from: d */
        final /* synthetic */ float f6267d;

        C2133a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f6264a = viewGroup;
            this.f6265b = bitmapDrawable;
            this.f6266c = view;
            this.f6267d = f;
        }

        public void onAnimationEnd(Animator animator) {
            C2183o0.m9254b(this.f6264a).mo7277b(this.f6265b);
            C2183o0.m9260h(this.f6266c, this.f6267d);
        }
    }

    /* renamed from: c.v.d$b */
    static class C2134b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f6269a = new Rect();

        C2134b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f6269a);
            Rect rect = this.f6269a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f6269a);
            this.f6269a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f6269a);
        }
    }

    /* renamed from: c.v.d$c */
    static class C2135c extends Property<C2143k, PointF> {
        C2135c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C2143k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C2143k kVar, PointF pointF) {
            kVar.mo7242c(pointF);
        }
    }

    /* renamed from: c.v.d$d */
    static class C2136d extends Property<C2143k, PointF> {
        C2136d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C2143k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C2143k kVar, PointF pointF) {
            kVar.mo7241a(pointF);
        }
    }

    /* renamed from: c.v.d$e */
    static class C2137e extends Property<View, PointF> {
        C2137e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C2183o0.m9259g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: c.v.d$f */
    static class C2138f extends Property<View, PointF> {
        C2138f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C2183o0.m9259g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: c.v.d$g */
    static class C2139g extends Property<View, PointF> {
        C2139g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C2183o0.m9259g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: c.v.d$h */
    class C2140h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C2143k f6270a;
        private C2143k mViewBounds;

        C2140h(C2143k kVar) {
            this.f6270a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: c.v.d$i */
    class C2141i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f6272a;

        /* renamed from: b */
        final /* synthetic */ View f6273b;

        /* renamed from: c */
        final /* synthetic */ Rect f6274c;

        /* renamed from: d */
        final /* synthetic */ int f6275d;

        /* renamed from: e */
        final /* synthetic */ int f6276e;

        /* renamed from: f */
        final /* synthetic */ int f6277f;

        /* renamed from: g */
        final /* synthetic */ int f6278g;

        C2141i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f6273b = view;
            this.f6274c = rect;
            this.f6275d = i;
            this.f6276e = i2;
            this.f6277f = i3;
            this.f6278g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f6272a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f6272a) {
                C1988t.m8406s0(this.f6273b, this.f6274c);
                C2183o0.m9259g(this.f6273b, this.f6275d, this.f6276e, this.f6277f, this.f6278g);
            }
        }
    }

    /* renamed from: c.v.d$j */
    class C2142j extends C2222y {

        /* renamed from: a */
        boolean f6280a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f6281b;

        C2142j(ViewGroup viewGroup) {
            this.f6281b = viewGroup;
        }

        /* renamed from: b */
        public void mo7238b(C2214x xVar) {
            C2169j0.m9217d(this.f6281b, false);
        }

        /* renamed from: c */
        public void mo7207c(C2214x xVar) {
            if (!this.f6280a) {
                C2169j0.m9217d(this.f6281b, false);
            }
            xVar.mo7177Z(this);
        }

        /* renamed from: d */
        public void mo7239d(C2214x xVar) {
            C2169j0.m9217d(this.f6281b, false);
            this.f6280a = true;
        }

        /* renamed from: e */
        public void mo7240e(C2214x xVar) {
            C2169j0.m9217d(this.f6281b, true);
        }
    }

    /* renamed from: c.v.d$k */
    private static class C2143k {

        /* renamed from: a */
        private int f6283a;

        /* renamed from: b */
        private int f6284b;

        /* renamed from: c */
        private int f6285c;

        /* renamed from: d */
        private int f6286d;

        /* renamed from: e */
        private View f6287e;

        /* renamed from: f */
        private int f6288f;

        /* renamed from: g */
        private int f6289g;

        C2143k(View view) {
            this.f6287e = view;
        }

        /* renamed from: b */
        private void m9131b() {
            C2183o0.m9259g(this.f6287e, this.f6283a, this.f6284b, this.f6285c, this.f6286d);
            this.f6288f = 0;
            this.f6289g = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7241a(PointF pointF) {
            this.f6285c = Math.round(pointF.x);
            this.f6286d = Math.round(pointF.y);
            int i = this.f6289g + 1;
            this.f6289g = i;
            if (this.f6288f == i) {
                m9131b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo7242c(PointF pointF) {
            this.f6283a = Math.round(pointF.x);
            this.f6284b = Math.round(pointF.y);
            int i = this.f6288f + 1;
            this.f6288f = i;
            if (i == this.f6289g) {
                m9131b();
            }
        }
    }

    /* renamed from: o0 */
    private void m9109o0(C2144d0 d0Var) {
        View view = d0Var.f6291b;
        if (C1988t.m8361S(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            d0Var.f6290a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            d0Var.f6290a.put("android:changeBounds:parent", d0Var.f6291b.getParent());
            if (this.f6263h0) {
                d0Var.f6291b.getLocationInWindow(this.f6261f0);
                d0Var.f6290a.put("android:changeBounds:windowX", Integer.valueOf(this.f6261f0[0]));
                d0Var.f6290a.put("android:changeBounds:windowY", Integer.valueOf(this.f6261f0[1]));
            }
            if (this.f6262g0) {
                d0Var.f6290a.put("android:changeBounds:clip", C1988t.m8403r(view));
            }
        }
    }

    /* renamed from: p0 */
    private boolean m9110p0(View view, View view2) {
        if (!this.f6263h0) {
            return true;
        }
        C2144d0 x = mo7393x(view, true);
        if (x == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == x.f6291b) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public String[] mo7209K() {
        return f6253X;
    }

    /* renamed from: i */
    public void mo7187i(C2144d0 d0Var) {
        m9109o0(d0Var);
    }

    /* renamed from: l */
    public void mo7191l(C2144d0 d0Var) {
        m9109o0(d0Var);
    }

    /* renamed from: q */
    public Animator mo7210q(ViewGroup viewGroup, C2144d0 d0Var, C2144d0 d0Var2) {
        int i;
        View view;
        Animator animator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        C2144d0 d0Var3 = d0Var;
        C2144d0 d0Var4 = d0Var2;
        if (d0Var3 == null || d0Var4 == null) {
            return null;
        }
        Map<String, Object> map = d0Var3.f6290a;
        Map<String, Object> map2 = d0Var4.f6290a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = d0Var4.f6291b;
        if (m9110p0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) d0Var3.f6290a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) d0Var4.f6290a.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            Rect rect4 = (Rect) d0Var3.f6290a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) d0Var4.f6290a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.f6262g0) {
                view = view3;
                C2183o0.m9259g(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        path = mo7395z().mo7341a((float) i3, (float) i5, (float) i4, (float) i6);
                        property = f6259d0;
                    } else {
                        C2143k kVar = new C2143k(view);
                        ObjectAnimator a = C2182o.m9252a(kVar, f6255Z, mo7395z().mo7341a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = C2182o.m9252a(kVar, f6256a0, mo7395z().mo7341a((float) i7, (float) i9, (float) i8, (float) i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a, a2});
                        animatorSet.addListener(new C2140h(kVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    path = mo7395z().mo7341a((float) i7, (float) i9, (float) i8, (float) i10);
                    property = f6257b0;
                } else {
                    path = mo7395z().mo7341a((float) i3, (float) i5, (float) i4, (float) i6);
                    property = f6258c0;
                }
                animator = C2182o.m9252a(view, property, path);
            } else {
                view = view3;
                C2183o0.m9259g(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                ObjectAnimator a3 = (i3 == i4 && i5 == i6) ? null : C2182o.m9252a(view, f6259d0, mo7395z().mo7341a((float) i3, (float) i5, (float) i4, (float) i6));
                if (rect7 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                if (!rect.equals(rect8)) {
                    C1988t.m8406s0(view, rect);
                    C2194t tVar = f6260e0;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect8;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", tVar, objArr);
                    ofObject.addListener(new C2141i(view, rect6, i4, i6, i8, i10));
                    objectAnimator = ofObject;
                } else {
                    objectAnimator = null;
                }
                animator = C2131c0.m9108c(a3, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C2169j0.m9217d(viewGroup4, true);
                mo7180c(new C2142j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) d0Var3.f6290a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) d0Var3.f6290a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) d0Var4.f6290a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) d0Var4.f6290a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f6261f0);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = C2183o0.m9255c(view2);
        C2183o0.m9260h(view2, 0.0f);
        C2183o0.m9254b(viewGroup).mo7276a(bitmapDrawable);
        C2186p z = mo7395z();
        int[] iArr = this.f6261f0;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C2190r.m9278a(f6254Y, z.mo7341a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
        ofPropertyValuesHolder.addListener(new C2133a(viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }
}
