package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C1164a;
import androidx.core.util.C1173d;
import com.google.android.material.internal.C4273g;
import java.lang.ref.WeakReference;
import java.util.List;
import p027c.p028a.p029k.p030a.C1445a;
import p027c.p064i.p068f.C1847a;
import p027c.p064i.p072j.C1929e0;
import p027c.p064i.p072j.C1978j;
import p027c.p064i.p072j.C1984p;
import p027c.p064i.p072j.C1988t;
import p027c.p077k.p078a.C2019a;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9017d;
import p174e.p319f.p320a.p363d.C9020g;
import p174e.p319f.p320a.p363d.C9023j;
import p174e.p319f.p320a.p363d.C9024k;
import p174e.p319f.p320a.p363d.p364a0.C8990g;
import p174e.p319f.p320a.p363d.p364a0.C8994h;
import p174e.p319f.p320a.p363d.p366l.C9025a;

@CoordinatorLayout.C1088d(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: A */
    private WeakReference<View> f11489A;

    /* renamed from: B */
    private ValueAnimator f11490B;

    /* renamed from: C */
    private int[] f11491C;

    /* renamed from: D */
    private Drawable f11492D;

    /* renamed from: f */
    private int f11493f;

    /* renamed from: o */
    private int f11494o;

    /* renamed from: p */
    private int f11495p;

    /* renamed from: q */
    private int f11496q;

    /* renamed from: r */
    private boolean f11497r;

    /* renamed from: s */
    private int f11498s;

    /* renamed from: t */
    private C1929e0 f11499t;

    /* renamed from: u */
    private List<C4141c> f11500u;

    /* renamed from: v */
    private boolean f11501v;

    /* renamed from: w */
    private boolean f11502w;

    /* renamed from: x */
    private boolean f11503x;

    /* renamed from: y */
    private boolean f11504y;

    /* renamed from: z */
    private int f11505z;

    protected static class BaseBehavior<T extends AppBarLayout> extends C4143a<T> {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f11506k;

        /* renamed from: l */
        private int f11507l;

        /* renamed from: m */
        private ValueAnimator f11508m;

        /* renamed from: n */
        private int f11509n = -1;

        /* renamed from: o */
        private boolean f11510o;

        /* renamed from: p */
        private float f11511p;

        /* renamed from: q */
        private WeakReference<View> f11512q;

        /* renamed from: r */
        private C4136b f11513r;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        class C4135a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f11514a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f11515b;

            C4135a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f11514a = coordinatorLayout;
                this.f11515b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.mo12656P(this.f11514a, this.f11515b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        public static abstract class C4136b<T extends AppBarLayout> {
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        protected static class C4137c extends C2019a {
            public static final Parcelable.Creator<C4137c> CREATOR = new C4138a();

            /* renamed from: p */
            int f11517p;

            /* renamed from: q */
            float f11518q;

            /* renamed from: r */
            boolean f11519r;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c$a */
            static class C4138a implements Parcelable.ClassLoaderCreator<C4137c> {
                C4138a() {
                }

                /* renamed from: a */
                public C4137c createFromParcel(Parcel parcel) {
                    return new C4137c(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public C4137c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C4137c(parcel, classLoader);
                }

                /* renamed from: c */
                public C4137c[] newArray(int i) {
                    return new C4137c[i];
                }
            }

            public C4137c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f11517p = parcel.readInt();
                this.f11518q = parcel.readFloat();
                this.f11519r = parcel.readByte() != 0;
            }

            public C4137c(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f11517p);
                parcel.writeFloat(this.f11518q);
                parcel.writeByte(this.f11519r ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: S */
        private void m15526S(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(mo12617M() - i);
            float abs2 = Math.abs(f);
            m15527T(coordinatorLayout, t, i, abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f));
        }

        /* renamed from: T */
        private void m15527T(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int M = mo12617M();
            if (M == i) {
                ValueAnimator valueAnimator = this.f11508m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f11508m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f11508m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f11508m = valueAnimator3;
                valueAnimator3.setInterpolator(C9025a.f24823e);
                this.f11508m.addUpdateListener(new C4135a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f11508m.setDuration((long) Math.min(i2, 600));
            this.f11508m.setIntValues(new int[]{M, i});
            this.f11508m.start();
        }

        /* renamed from: V */
        private boolean m15528V(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.mo12590h() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: W */
        private static boolean m15529W(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: X */
        private View m15530X(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C1978j) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: Y */
        private static View m15531Y(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: Z */
        private int m15532Z(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C4142d dVar = (C4142d) childAt.getLayoutParams();
                if (m15529W(dVar.mo12648a(), 32)) {
                    top -= dVar.topMargin;
                    bottom += dVar.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: c0 */
        private int m15533c0(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C4142d dVar = (C4142d) childAt.getLayoutParams();
                Interpolator b = dVar.mo12649b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = dVar.mo12648a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + dVar.topMargin + dVar.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= C1988t.m8419z(childAt);
                        }
                    }
                    if (C1988t.m8411v(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: n0 */
        private boolean m15534n0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> s = coordinatorLayout.mo3456s(t);
            int size = s.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.C1087c f = ((CoordinatorLayout.C1090f) s.get(i).getLayoutParams()).mo3507f();
                if (f instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f).mo12660K() != 0;
                }
            }
            return false;
        }

        /* renamed from: o0 */
        private void m15535o0(CoordinatorLayout coordinatorLayout, T t) {
            int M = mo12617M();
            int Z = m15532Z(t, M);
            if (Z >= 0) {
                View childAt = t.getChildAt(Z);
                C4142d dVar = (C4142d) childAt.getLayoutParams();
                int a = dVar.mo12648a();
                if ((a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (Z == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m15529W(a, 2)) {
                        i2 += C1988t.m8419z(childAt);
                    } else if (m15529W(a, 5)) {
                        int z = C1988t.m8419z(childAt) + i2;
                        if (M < z) {
                            i = z;
                        } else {
                            i2 = z;
                        }
                    }
                    if (m15529W(a, 32)) {
                        i += dVar.topMargin;
                        i2 -= dVar.bottomMargin;
                    }
                    if (M < (i2 + i) / 2) {
                        i = i2;
                    }
                    m15526S(coordinatorLayout, t, C1847a.m7858b(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: p0 */
        private void m15536p0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View Y = m15531Y(t, i);
            if (Y != null) {
                int a = ((C4142d) Y.getLayoutParams()).mo12648a();
                boolean z2 = false;
                if ((a & 1) != 0) {
                    int z3 = C1988t.m8419z(Y);
                    if (i2 <= 0 || (a & 12) == 0 ? !((a & 2) == 0 || (-i) < (Y.getBottom() - z3) - t.getTopInset()) : (-i) >= (Y.getBottom() - z3) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.mo12591j()) {
                    z2 = t.mo12602s(m15530X(coordinatorLayout));
                }
                boolean q = t.mo12601q(z2);
                if (z || (q && m15534n0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public int mo12617M() {
            return mo12640E() + this.f11506k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: U */
        public boolean mo12614H(T t) {
            if (this.f11513r == null) {
                WeakReference<View> weakReference = this.f11512q;
                if (weakReference == null) {
                    return true;
                }
                View view = (View) weakReference.get();
                return view != null && view.isShown() && !view.canScrollVertically(-1);
            }
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a0 */
        public int mo12615K(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b0 */
        public int mo12616L(T t) {
            return t.getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d0 */
        public void mo12618N(CoordinatorLayout coordinatorLayout, T t) {
            m15535o0(coordinatorLayout, t);
            if (t.mo12591j()) {
                t.mo12601q(t.mo12602s(m15530X(coordinatorLayout)));
            }
        }

        /* renamed from: e0 */
        public boolean mo3484l(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean l = super.mo3484l(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i2 = this.f11509n;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i2);
                mo12656P(coordinatorLayout, t, (-childAt.getBottom()) + (this.f11510o ? C1988t.m8419z(childAt) + t.getTopInset() : Math.round(((float) childAt.getHeight()) * this.f11511p)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m15526S(coordinatorLayout, t, i3, 0.0f);
                    } else {
                        mo12656P(coordinatorLayout, t, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m15526S(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        mo12656P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.mo12594m();
            this.f11509n = -1;
            mo12641G(C1847a.m7858b(mo12640E(), -t.getTotalScrollRange(), 0));
            m15536p0(coordinatorLayout, t, mo12640E(), 0, true);
            t.mo12592k(mo12640E());
            return l;
        }

        /* renamed from: f0 */
        public boolean mo3485m(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.C1090f) t.getLayoutParams()).height != -2) {
                return super.mo3485m(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo3421J(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: g0 */
        public void mo3489q(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo12655O(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.mo12591j()) {
                t.mo12601q(t.mo12602s(view));
            }
        }

        /* renamed from: h0 */
        public void mo3492t(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = mo12655O(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
        }

        /* renamed from: i0 */
        public void mo3496x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof C4137c) {
                C4137c cVar = (C4137c) parcelable;
                super.mo3496x(coordinatorLayout, t, cVar.mo6726a());
                this.f11509n = cVar.f11517p;
                this.f11511p = cVar.f11518q;
                this.f11510o = cVar.f11519r;
                return;
            }
            super.mo3496x(coordinatorLayout, t, parcelable);
            this.f11509n = -1;
        }

        /* renamed from: j0 */
        public Parcelable mo3497y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable y = super.mo3497y(coordinatorLayout, t);
            int E = mo12640E();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E > 0 || bottom < 0) {
                    i++;
                } else {
                    C4137c cVar = new C4137c(y);
                    cVar.f11517p = i;
                    if (bottom == C1988t.m8419z(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    cVar.f11519r = z;
                    cVar.f11518q = ((float) bottom) / ((float) childAt.getHeight());
                    return cVar;
                }
            }
            return y;
        }

        /* renamed from: k0 */
        public boolean mo3469A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.mo12591j() || m15528V(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f11508m) != null) {
                valueAnimator.cancel();
            }
            this.f11512q = null;
            this.f11507l = i2;
            return z;
        }

        /* renamed from: l0 */
        public void mo3471C(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f11507l == 0 || i == 1) {
                m15535o0(coordinatorLayout, t);
                if (t.mo12591j()) {
                    t.mo12601q(t.mo12602s(view));
                }
            }
            this.f11512q = new WeakReference<>(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m0 */
        public int mo12619Q(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int M = mo12617M();
            int i4 = 0;
            if (i2 == 0 || M < i2 || M > i3) {
                this.f11506k = 0;
            } else {
                int b = C1847a.m7858b(i, i2, i3);
                if (M != b) {
                    int c0 = t.mo12576f() ? m15533c0(t, b) : b;
                    boolean G = mo12641G(c0);
                    i4 = M - b;
                    this.f11506k = b - c0;
                    if (!G && t.mo12576f()) {
                        coordinatorLayout.mo3429g(t);
                    }
                    t.mo12592k(mo12640E());
                    m15536p0(coordinatorLayout, t, b, b < M ? -1 : 1, false);
                }
            }
            return i4;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: E */
        public /* bridge */ /* synthetic */ int mo12640E() {
            return super.mo12640E();
        }

        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean mo12641G(int i) {
            return super.mo12641G(i);
        }

        /* renamed from: e0 */
        public /* bridge */ /* synthetic */ boolean mo12624e0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.mo3484l(coordinatorLayout, appBarLayout, i);
        }

        /* renamed from: f0 */
        public /* bridge */ /* synthetic */ boolean mo12625f0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo3485m(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        /* renamed from: g0 */
        public /* bridge */ /* synthetic */ void mo12626g0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo3489q(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        /* renamed from: h0 */
        public /* bridge */ /* synthetic */ void mo12627h0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.mo3492t(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        /* renamed from: i0 */
        public /* bridge */ /* synthetic */ void mo12628i0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo3496x(coordinatorLayout, appBarLayout, parcelable);
        }

        /* renamed from: j0 */
        public /* bridge */ /* synthetic */ Parcelable mo12629j0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo3497y(coordinatorLayout, appBarLayout);
        }

        /* renamed from: k0 */
        public /* bridge */ /* synthetic */ boolean mo12630k0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.mo3469A(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        /* renamed from: l0 */
        public /* bridge */ /* synthetic */ void mo12631l0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.mo3471C(coordinatorLayout, appBarLayout, view, i);
        }
    }

    public static class ScrollingViewBehavior extends C4145b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9024k.f24556E2);
            mo12662O(obtainStyledAttributes.getDimensionPixelSize(C9024k.f24561F2, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: R */
        private static int m15577R(AppBarLayout appBarLayout) {
            CoordinatorLayout.C1087c f = ((CoordinatorLayout.C1090f) appBarLayout.getLayoutParams()).mo3507f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).mo12617M();
            }
            return 0;
        }

        /* renamed from: S */
        private void m15578S(View view, View view2) {
            CoordinatorLayout.C1087c f = ((CoordinatorLayout.C1090f) view2.getLayoutParams()).mo3507f();
            if (f instanceof BaseBehavior) {
                C1988t.m8367Y(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f).f11506k) + mo12661M()) - mo12659I(view2));
            }
        }

        /* renamed from: T */
        private void m15579T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo12591j()) {
                    appBarLayout.mo12601q(appBarLayout.mo12602s(view));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public float mo12643J(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = m15577R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) R) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public int mo12644L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo12644L(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public AppBarLayout mo12642H(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: e */
        public boolean mo3477e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: h */
        public boolean mo3480h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m15578S(view, view2);
            m15579T(view, view2);
            return false;
        }

        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo3484l(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo3484l(coordinatorLayout, view, i);
        }

        /* renamed from: m */
        public /* bridge */ /* synthetic */ boolean mo3485m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo3485m(coordinatorLayout, view, i, i2, i3, i4);
        }

        /* renamed from: w */
        public boolean mo3495w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout Q = mo12642H(coordinatorLayout.mo3453r(view));
            if (Q != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f11536d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    Q.mo12595n(false, !z);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    class C4139a implements C1984p {
        C4139a() {
        }

        /* renamed from: a */
        public C1929e0 mo319a(View view, C1929e0 e0Var) {
            return AppBarLayout.this.mo12593l(e0Var);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    class C4140b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C8990g f11521a;

        C4140b(C8990g gVar) {
            this.f11521a = gVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f11521a.mo22818S(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public interface C4141c<T extends AppBarLayout> {
        /* renamed from: a */
        void mo12647a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static class C4142d extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f11523a = 1;

        /* renamed from: b */
        Interpolator f11524b;

        public C4142d(int i, int i2) {
            super(i, i2);
        }

        public C4142d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9024k.f24783u);
            this.f11523a = obtainStyledAttributes.getInt(C9024k.f24789v, 0);
            int i = C9024k.f24795w;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f11524b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C4142d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C4142d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C4142d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public int mo12648a() {
            return this.f11523a;
        }

        /* renamed from: b */
        public Interpolator mo12649b() {
            return this.f11524b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo12650c() {
            int i = this.f11523a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        /* renamed from: d */
        public void mo12651d(int i) {
            this.f11523a = i;
        }
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9013b.appBarLayoutStyle);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11494o = -1;
        this.f11495p = -1;
        this.f11496q = -1;
        this.f11498s = 0;
        setOrientation(1);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            C4148e.m15628a(this);
            C4148e.m15630c(this, attributeSet, i, C9023j.Widget_Design_AppBarLayout);
        }
        TypedArray k = C4273g.m16429k(context, attributeSet, C9024k.f24723k, i, C9023j.Widget_Design_AppBarLayout, new int[0]);
        C1988t.m8400p0(this, k.getDrawable(C9024k.f24729l));
        if (getBackground() instanceof ColorDrawable) {
            C8990g gVar = new C8990g();
            gVar.mo22819T(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            gVar.mo22815L(context);
            C1988t.m8400p0(this, gVar);
        }
        int i3 = C9024k.f24753p;
        if (k.hasValue(i3)) {
            m15507o(k.getBoolean(i3, false), false, false);
        }
        if (i2 >= 21) {
            int i4 = C9024k.f24747o;
            if (k.hasValue(i4)) {
                C4148e.m15629b(this, (float) k.getDimensionPixelSize(i4, 0));
            }
        }
        if (i2 >= 26) {
            int i5 = C9024k.f24741n;
            if (k.hasValue(i5)) {
                setKeyboardNavigationCluster(k.getBoolean(i5, false));
            }
            int i6 = C9024k.f24735m;
            if (k.hasValue(i6)) {
                setTouchscreenBlocksFocus(k.getBoolean(i6, false));
            }
        }
        this.f11504y = k.getBoolean(C9024k.f24759q, false);
        this.f11505z = k.getResourceId(C9024k.f24765r, -1);
        setStatusBarForeground(k.getDrawable(C9024k.f24771s));
        k.recycle();
        C1988t.m8334A0(this, new C4139a());
    }

    /* renamed from: a */
    private void m15503a() {
        WeakReference<View> weakReference = this.f11489A;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f11489A = null;
    }

    /* renamed from: b */
    private View m15504b(View view) {
        int i;
        if (this.f11489A == null && (i = this.f11505z) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f11505z);
            }
            if (findViewById != null) {
                this.f11489A = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f11489A;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: g */
    private boolean m15505g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C4142d) getChildAt(i).getLayoutParams()).mo12650c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m15506i() {
        this.f11494o = -1;
        this.f11495p = -1;
        this.f11496q = -1;
    }

    /* renamed from: o */
    private void m15507o(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f11498s = i2 | i;
        requestLayout();
    }

    /* renamed from: p */
    private boolean m15508p(boolean z) {
        if (this.f11502w == z) {
            return false;
        }
        this.f11502w = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: r */
    private boolean m15509r() {
        return this.f11492D != null && getTopInset() > 0;
    }

    /* renamed from: t */
    private boolean m15510t() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return childAt.getVisibility() != 8 && !C1988t.m8411v(childAt);
    }

    /* renamed from: u */
    private void m15511u(C8990g gVar, boolean z) {
        float dimension = getResources().getDimension(C9017d.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f11490B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
        this.f11490B = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(C9020g.app_bar_elevation_anim_duration));
        this.f11490B.setInterpolator(C9025a.f24819a);
        this.f11490B.addUpdateListener(new C4140b(gVar));
        this.f11490B.start();
    }

    /* renamed from: v */
    private void m15512v() {
        setWillNotDraw(!m15509r());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C4142d generateDefaultLayoutParams() {
        return new C4142d(-1, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C4142d;
    }

    /* renamed from: d */
    public C4142d generateLayoutParams(AttributeSet attributeSet) {
        return new C4142d(getContext(), attributeSet);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m15509r()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f11493f));
            this.f11492D.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f11492D;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C4142d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (Build.VERSION.SDK_INT < 19 || !(layoutParams instanceof LinearLayout.LayoutParams)) ? layoutParams instanceof ViewGroup.MarginLayoutParams ? new C4142d((ViewGroup.MarginLayoutParams) layoutParams) : new C4142d(layoutParams) : new C4142d((LinearLayout.LayoutParams) layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo12576f() {
        return this.f11497r;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i;
        int z;
        int i2 = this.f11495p;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C4142d dVar = (C4142d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.f11523a;
            if ((i4 & 5) == 5) {
                int i5 = dVar.topMargin + dVar.bottomMargin;
                if ((i4 & 8) != 0) {
                    z = C1988t.m8419z(childAt);
                } else if ((i4 & 2) != 0) {
                    z = measuredHeight - C1988t.m8419z(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C1988t.m8411v(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + z;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f11495p = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i = this.f11496q;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C4142d dVar = (C4142d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + dVar.topMargin + dVar.bottomMargin;
            int i4 = dVar.f11523a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C1988t.m8419z(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f11496q = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f11505z;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int z = C1988t.m8419z(this);
        if (z == 0) {
            int childCount = getChildCount();
            z = childCount >= 1 ? C1988t.m8419z(getChildAt(childCount - 1)) : 0;
            if (z == 0) {
                return getHeight() / 3;
            }
        }
        return (z * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f11498s;
    }

    public Drawable getStatusBarForeground() {
        return this.f11492D;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        C1929e0 e0Var = this.f11499t;
        if (e0Var != null) {
            return e0Var.mo6492k();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f11494o;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C4142d dVar = (C4142d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.f11523a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + dVar.topMargin + dVar.bottomMargin;
            if (i2 == 0 && C1988t.m8411v(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= C1988t.m8419z(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f11494o = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo12590h() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: j */
    public boolean mo12591j() {
        return this.f11504y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo12592k(int i) {
        this.f11493f = i;
        if (!willNotDraw()) {
            C1988t.m8376d0(this);
        }
        List<C4141c> list = this.f11500u;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C4141c cVar = this.f11500u.get(i2);
                if (cVar != null) {
                    cVar.mo12647a(this, i);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C1929e0 mo12593l(C1929e0 e0Var) {
        C1929e0 e0Var2 = C1988t.m8411v(this) ? e0Var : null;
        if (!C1173d.m4572a(this.f11499t, e0Var2)) {
            this.f11499t = e0Var2;
            m15512v();
            requestLayout();
        }
        return e0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo12594m() {
        this.f11498s = 0;
    }

    /* renamed from: n */
    public void mo12595n(boolean z, boolean z2) {
        m15507o(z, z2, true);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8994h.m29990e(this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f11491C == null) {
            this.f11491C = new int[4];
        }
        int[] iArr = this.f11491C;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f11502w;
        int i2 = C9013b.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (!z || !this.f11503x) ? -C9013b.state_lifted : C9013b.state_lifted;
        int i3 = C9013b.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (!z || !this.f11503x) ? -C9013b.state_collapsed : C9013b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m15503a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C1988t.m8411v(this) && m15510t()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C1988t.m8367Y(getChildAt(childCount), topInset);
            }
        }
        m15506i();
        this.f11497r = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C4142d) getChildAt(i5).getLayoutParams()).mo12649b() != null) {
                this.f11497r = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f11492D;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f11501v) {
            if (!this.f11504y && !m15505g()) {
                z2 = false;
            }
            m15508p(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C1988t.m8411v(this) && m15510t()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C1847a.m7858b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m15506i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo12601q(boolean z) {
        if (this.f11503x == z) {
            return false;
        }
        this.f11503x = z;
        refreshDrawableState();
        if (!this.f11504y || !(getBackground() instanceof C8990g)) {
            return true;
        }
        m15511u((C8990g) getBackground(), z);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo12602s(View view) {
        View b = m15504b(view);
        if (b != null) {
            view = b;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C8994h.m29989d(this, f);
    }

    public void setExpanded(boolean z) {
        mo12595n(z, C1988t.m8361S(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f11504y = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f11505z = i;
        m15503a();
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f11492D;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f11492D = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f11492D.setState(getDrawableState());
                }
                C1164a.m4549m(this.f11492D, C1988t.m8417y(this));
                this.f11492D.setVisible(getVisibility() == 0, false);
                this.f11492D.setCallback(this);
            }
            m15512v();
            C1988t.m8376d0(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C1445a.m6446d(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C4148e.m15629b(this, f);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f11492D;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11492D;
    }
}
