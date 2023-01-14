package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p027c.p064i.p072j.C1988t;
import p174e.p319f.p320a.p363d.C9019f;
import p174e.p319f.p320a.p363d.p366l.C9025a;
import p174e.p319f.p320a.p363d.p366l.C9026b;
import p174e.p319f.p320a.p363d.p366l.C9027c;
import p174e.p319f.p320a.p363d.p366l.C9028d;
import p174e.p319f.p320a.p363d.p366l.C9029e;
import p174e.p319f.p320a.p363d.p366l.C9032h;
import p174e.p319f.p320a.p363d.p366l.C9033i;
import p174e.p319f.p320a.p363d.p366l.C9034j;
import p174e.p319f.p320a.p363d.p370p.C9041a;
import p174e.p319f.p320a.p363d.p370p.C9044c;
import p174e.p319f.p320a.p363d.p370p.C9045d;
import p174e.p319f.p320a.p363d.p377v.C9057a;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f12347c = new Rect();

    /* renamed from: d */
    private final RectF f12348d = new RectF();

    /* renamed from: e */
    private final RectF f12349e = new RectF();

    /* renamed from: f */
    private final int[] f12350f = new int[2];

    /* renamed from: g */
    private float f12351g;

    /* renamed from: h */
    private float f12352h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    class C4347a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f12353a;

        /* renamed from: b */
        final /* synthetic */ View f12354b;

        /* renamed from: c */
        final /* synthetic */ View f12355c;

        C4347a(boolean z, View view, View view2) {
            this.f12353a = z;
            this.f12354b = view;
            this.f12355c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f12353a) {
                this.f12354b.setVisibility(4);
                this.f12355c.setAlpha(1.0f);
                this.f12355c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f12353a) {
                this.f12354b.setVisibility(0);
                this.f12355c.setAlpha(0.0f);
                this.f12355c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    class C4348b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f12357a;

        C4348b(View view) {
            this.f12357a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f12357a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    class C4349c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C9045d f12359a;

        /* renamed from: b */
        final /* synthetic */ Drawable f12360b;

        C4349c(C9045d dVar, Drawable drawable) {
            this.f12359a = dVar;
            this.f12360b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f12359a.setCircularRevealOverlayDrawable((Drawable) null);
        }

        public void onAnimationStart(Animator animator) {
            this.f12359a.setCircularRevealOverlayDrawable(this.f12360b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    class C4350d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C9045d f12362a;

        C4350d(C9045d dVar) {
            this.f12362a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            C9045d.C9050e revealInfo = this.f12362a.getRevealInfo();
            revealInfo.f24864c = Float.MAX_VALUE;
            this.f12362a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    protected static class C4351e {

        /* renamed from: a */
        public C9032h f12364a;

        /* renamed from: b */
        public C9034j f12365b;

        protected C4351e() {
        }
    }

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: K */
    private ViewGroup m16710K(View view) {
        View findViewById = view.findViewById(C9019f.mtrl_child_content_container);
        return findViewById != null ? m16730f0(findViewById) : ((view instanceof C4354b) || (view instanceof C4353a)) ? m16730f0(((ViewGroup) view).getChildAt(0)) : m16730f0(view);
    }

    /* renamed from: L */
    private void m16711L(View view, C4351e eVar, C9033i iVar, C9033i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float S = m16718S(eVar, iVar, f, f3);
        float S2 = m16718S(eVar, iVar2, f2, f4);
        Rect rect = this.f12347c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f12348d;
        rectF2.set(rect);
        RectF rectF3 = this.f12349e;
        m16719T(view, rectF3);
        rectF3.offset(S, S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: M */
    private void m16712M(View view, RectF rectF) {
        m16719T(view, rectF);
        rectF.offset(this.f12351g, this.f12352h);
    }

    /* renamed from: N */
    private Pair<C9033i, C9033i> m16713N(float f, float f2, boolean z, C4351e eVar) {
        String str;
        C9032h hVar;
        C9033i iVar;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            iVar = eVar.f12364a.mo22922e("translationXLinear");
            hVar = eVar.f12364a;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
            iVar = eVar.f12364a.mo22922e("translationXCurveDownwards");
            hVar = eVar.f12364a;
            str = "translationYCurveDownwards";
        } else {
            iVar = eVar.f12364a.mo22922e("translationXCurveUpwards");
            hVar = eVar.f12364a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(iVar, hVar.mo22922e(str));
    }

    /* renamed from: O */
    private float m16714O(View view, View view2, C9034j jVar) {
        RectF rectF = this.f12348d;
        RectF rectF2 = this.f12349e;
        m16712M(view, rectF);
        m16719T(view2, rectF2);
        rectF2.offset(-m16716Q(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: P */
    private float m16715P(View view, View view2, C9034j jVar) {
        RectF rectF = this.f12348d;
        RectF rectF2 = this.f12349e;
        m16712M(view, rectF);
        m16719T(view2, rectF2);
        rectF2.offset(0.0f, -m16717R(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: Q */
    private float m16716Q(View view, View view2, C9034j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f12348d;
        RectF rectF2 = this.f12349e;
        m16712M(view, rectF);
        m16719T(view2, rectF2);
        int i = jVar.f24839a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jVar.f24840b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f24840b;
    }

    /* renamed from: R */
    private float m16717R(View view, View view2, C9034j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f12348d;
        RectF rectF2 = this.f12349e;
        m16712M(view, rectF);
        m16719T(view2, rectF2);
        int i = jVar.f24839a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jVar.f24841c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f24841c;
    }

    /* renamed from: S */
    private float m16718S(C4351e eVar, C9033i iVar, float f, float f2) {
        long c = iVar.mo22931c();
        long d = iVar.mo22932d();
        C9033i e = eVar.f12364a.mo22922e("expansion");
        return C9025a.m30120a(f, f2, iVar.mo22933e().getInterpolation(((float) (((e.mo22931c() + e.mo22932d()) + 17) - c)) / ((float) d)));
    }

    /* renamed from: T */
    private void m16719T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f12350f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: U */
    private void m16720U(View view, View view2, boolean z, boolean z2, C4351e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup K;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof C9045d) || C9044c.f24857a != 0) && (K = m16710K(view2)) != null) {
                if (z) {
                    if (!z2) {
                        C9028d.f24825a.set(K, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(K, C9028d.f24825a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(K, C9028d.f24825a, new float[]{0.0f});
                }
                eVar.f12364a.mo22922e("contentFade").mo22930a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    /* renamed from: V */
    private void m16721V(View view, View view2, boolean z, boolean z2, C4351e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof C9045d) {
            C9045d dVar = (C9045d) view2;
            int d0 = m16729d0(view);
            int i = 16777215 & d0;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(d0);
                }
                objectAnimator = ObjectAnimator.ofInt(dVar, C9045d.C9049d.f24861a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(dVar, C9045d.C9049d.f24861a, new int[]{d0});
            }
            objectAnimator.setEvaluator(C9027c.m30122b());
            eVar.f12364a.mo22922e("color").mo22930a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: W */
    private void m16722W(View view, View view2, boolean z, C4351e eVar, List<Animator> list) {
        float Q = m16716Q(view, view2, eVar.f12365b);
        float R = m16717R(view, view2, eVar.f12365b);
        Pair<C9033i, C9033i> N = m16713N(Q, R, z, eVar);
        C9033i iVar = (C9033i) N.first;
        C9033i iVar2 = (C9033i) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            Q = this.f12351g;
        }
        fArr[0] = Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            R = this.f12352h;
        }
        fArr2[0] = R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.mo22930a(ofFloat);
        iVar2.mo22930a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    /* renamed from: X */
    private void m16723X(View view, View view2, boolean z, boolean z2, C4351e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float t = C1988t.m8407t(view2) - C1988t.m8407t(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-t);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-t});
        }
        eVar.f12364a.mo22922e("elevation").mo22930a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: Y */
    private void m16724Y(View view, View view2, boolean z, boolean z2, C4351e eVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        C4351e eVar2 = eVar;
        if (view4 instanceof C9045d) {
            C9045d dVar = (C9045d) view4;
            float O = m16714O(view3, view4, eVar2.f12365b);
            float P = m16715P(view3, view4, eVar2.f12365b);
            ((FloatingActionButton) view3).mo13296i(this.f12347c);
            float width = ((float) this.f12347c.width()) / 2.0f;
            C9033i e = eVar2.f12364a.mo22922e("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new C9045d.C9050e(O, P, width));
                }
                if (z2) {
                    width = dVar.getRevealInfo().f24864c;
                }
                animator = C9041a.m30156a(dVar, O, P, C9057a.m30185b(O, P, 0.0f, 0.0f, f, f2));
                animator.addListener(new C4350d(dVar));
                m16727b0(view2, e.mo22931c(), (int) O, (int) P, width, list);
            } else {
                float f3 = dVar.getRevealInfo().f24864c;
                Animator a = C9041a.m30156a(dVar, O, P, width);
                int i = (int) O;
                int i2 = (int) P;
                View view5 = view2;
                m16727b0(view5, e.mo22931c(), i, i2, f3, list);
                long c = e.mo22931c();
                long d = e.mo22932d();
                long f4 = eVar2.f12364a.mo22924f();
                m16726a0(view5, c, d, f4, i, i2, width, list);
                animator = a;
            }
            e.mo22930a(animator);
            list.add(animator);
            list2.add(C9041a.m30157b(dVar));
        }
    }

    /* renamed from: Z */
    private void m16725Z(View view, View view2, boolean z, boolean z2, C4351e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof C9045d) && (view instanceof ImageView)) {
            C9045d dVar = (C9045d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C9029e.f24826a, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C9029e.f24826a, new int[]{255});
                }
                objectAnimator.addUpdateListener(new C4348b(view2));
                eVar.f12364a.mo22922e("iconFade").mo22930a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new C4349c(dVar, drawable));
            }
        }
    }

    /* renamed from: a0 */
    private void m16726a0(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    /* renamed from: b0 */
    private void m16727b0(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: c0 */
    private void m16728c0(View view, View view2, boolean z, boolean z2, C4351e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        C4351e eVar2 = eVar;
        List<Animator> list3 = list;
        float Q = m16716Q(view3, view4, eVar2.f12365b);
        float R = m16717R(view3, view4, eVar2.f12365b);
        Pair<C9033i, C9033i> N = m16713N(Q, R, z3, eVar2);
        C9033i iVar = (C9033i) N.first;
        C9033i iVar2 = (C9033i) N.second;
        if (z3) {
            if (!z2) {
                view4.setTranslationX(-Q);
                view4.setTranslationY(-R);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            m16711L(view2, eVar, iVar, iVar2, -Q, -R, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-Q});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-R});
        }
        iVar.mo22930a(objectAnimator2);
        iVar2.mo22930a(objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    /* renamed from: d0 */
    private int m16729d0(View view) {
        ColorStateList p = C1988t.m8399p(view);
        if (p != null) {
            return p.getColorForState(view.getDrawableState(), p.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: f0 */
    private ViewGroup m16730f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public AnimatorSet mo13778J(View view, View view2, boolean z, boolean z2) {
        boolean z3 = z;
        C4351e e0 = mo13780e0(view2.getContext(), z3);
        if (z3) {
            this.f12351g = view.getTranslationX();
            this.f12352h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m16723X(view, view2, z, z2, e0, arrayList, arrayList2);
        }
        RectF rectF = this.f12348d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        m16728c0(view3, view4, z4, z2, e0, arrayList3, arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m16722W(view3, view4, z4, e0, arrayList);
        boolean z5 = z2;
        C4351e eVar = e0;
        m16725Z(view3, view4, z4, z5, eVar, arrayList3, arrayList4);
        m16724Y(view3, view4, z4, z5, eVar, width, height, arrayList, arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        m16721V(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        m16720U(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        C9026b.m30121a(animatorSet, arrayList);
        animatorSet.addListener(new C4347a(z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    /* renamed from: e */
    public boolean mo3477e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public abstract C4351e mo13780e0(Context context, boolean z);

    /* renamed from: g */
    public void mo3479g(CoordinatorLayout.C1090f fVar) {
        if (fVar.f3045h == 0) {
            fVar.f3045h = 80;
        }
    }
}
