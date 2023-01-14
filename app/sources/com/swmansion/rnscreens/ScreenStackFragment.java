package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.C3038r;
import com.google.android.material.appbar.AppBarLayout;
import com.swmansion.rnscreens.C10028a0;
import java.util.Objects;
import okhttp3.HttpUrl;
import p455g.C10323s;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10457l;

public final class ScreenStackFragment extends ScreenFragment {

    /* renamed from: s0 */
    private AppBarLayout f26734s0;

    /* renamed from: t0 */
    private Toolbar f26735t0;

    /* renamed from: u0 */
    private boolean f26736u0;

    /* renamed from: v0 */
    private boolean f26737v0;

    /* renamed from: w0 */
    private C10076p f26738w0;

    /* renamed from: x0 */
    private C10430l<? super C10076p, C10323s> f26739x0;

    /* renamed from: com.swmansion.rnscreens.ScreenStackFragment$a */
    private static final class C10019a extends Animation {

        /* renamed from: f */
        private final ScreenFragment f26740f;

        public C10019a(ScreenFragment screenFragment) {
            C10457l.m35320e(screenFragment, "mFragment");
            this.f26740f = screenFragment;
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f, Transformation transformation) {
            C10457l.m35320e(transformation, "t");
            super.applyTransformation(f, transformation);
            ScreenFragment screenFragment = this.f26740f;
            screenFragment.mo24890E1(f, !screenFragment.mo3881Y());
        }
    }

    /* renamed from: com.swmansion.rnscreens.ScreenStackFragment$b */
    private static final class C10020b extends CoordinatorLayout {
        /* access modifiers changed from: private */

        /* renamed from: M */
        public final ScreenFragment f26741M;

        /* renamed from: N */
        private final Animation.AnimationListener f26742N = new C10021a(this);

        /* renamed from: com.swmansion.rnscreens.ScreenStackFragment$b$a */
        public static final class C10021a implements Animation.AnimationListener {

            /* renamed from: a */
            final /* synthetic */ C10020b f26743a;

            C10021a(C10020b bVar) {
                this.f26743a = bVar;
            }

            public void onAnimationEnd(Animation animation) {
                C10457l.m35320e(animation, "animation");
                this.f26743a.f26741M.mo24894L1();
            }

            public void onAnimationRepeat(Animation animation) {
                C10457l.m35320e(animation, "animation");
            }

            public void onAnimationStart(Animation animation) {
                C10457l.m35320e(animation, "animation");
                this.f26743a.f26741M.mo24895M1();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10020b(Context context, ScreenFragment screenFragment) {
            super(context);
            C10457l.m35320e(context, "context");
            C10457l.m35320e(screenFragment, "mFragment");
            this.f26741M = screenFragment;
        }

        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }

        public void startAnimation(Animation animation) {
            C10457l.m35320e(animation, "animation");
            C10019a aVar = new C10019a(this.f26741M);
            aVar.setDuration(animation.getDuration());
            if (!(animation instanceof AnimationSet) || this.f26741M.mo3877W()) {
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(animation);
                animationSet.addAnimation(aVar);
                animationSet.setAnimationListener(this.f26742N);
                super.startAnimation(animationSet);
                return;
            }
            AnimationSet animationSet2 = (AnimationSet) animation;
            animationSet2.addAnimation(aVar);
            animationSet2.setAnimationListener(this.f26742N);
            super.startAnimation(animationSet2);
        }
    }

    public ScreenStackFragment() {
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ValidFragment"})
    public ScreenStackFragment(C10084w wVar) {
        super(wVar);
        C10457l.m35320e(wVar, "screenView");
    }

    /* renamed from: Y1 */
    private final void m33991Y1() {
        View N = mo3861N();
        ViewParent parent = N != null ? N.getParent() : null;
        if (parent instanceof C10093y) {
            ((C10093y) parent).mo25110E();
        }
    }

    /* renamed from: e2 */
    private final boolean m33992e2() {
        C10097z headerConfig = mo24892I1().getHeaderConfig();
        int configSubviewsCount = headerConfig != null ? headerConfig.getConfigSubviewsCount() : 0;
        if (headerConfig != null && configSubviewsCount > 0) {
            for (int i = 0; i < configSubviewsCount; i++) {
                if (headerConfig.mo25127c(i).getType() == C10028a0.C10029a.SEARCH_BAR) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f2 */
    private final void m33993f2(Menu menu) {
        menu.clear();
        if (m33992e2()) {
            Context s = mo3930s();
            if (this.f26738w0 == null && s != null) {
                C10076p pVar = new C10076p(s, this);
                this.f26738w0 = pVar;
                C10430l<? super C10076p, C10323s> lVar = this.f26739x0;
                if (lVar != null) {
                    lVar.invoke(pVar);
                }
            }
            MenuItem add = menu.add(HttpUrl.FRAGMENT_ENCODE_SET);
            add.setShowAsAction(2);
            add.setActionView(this.f26738w0);
        }
    }

    /* renamed from: K1 */
    public void mo24893K1() {
        C10097z headerConfig = mo24892I1().getHeaderConfig();
        if (headerConfig != null) {
            headerConfig.mo25128g();
        }
    }

    /* renamed from: L1 */
    public void mo24894L1() {
        super.mo24894L1();
        m33991Y1();
    }

    /* renamed from: V1 */
    public final boolean mo24904V1() {
        C10091x<?> container = mo24892I1().getContainer();
        if (!(container instanceof C10093y)) {
            throw new IllegalStateException("ScreenStackFragment added into a non-stack container".toString());
        } else if (!C10457l.m35316a(((C10093y) container).getRootScreen(), mo24892I1())) {
            return true;
        } else {
            Fragment C = mo3842C();
            if (C instanceof ScreenStackFragment) {
                return ((ScreenStackFragment) C).mo24904V1();
            }
            return false;
        }
    }

    /* renamed from: W1 */
    public final void mo24905W1() {
        C10091x<?> container = mo24892I1().getContainer();
        if (container instanceof C10093y) {
            ((C10093y) container).mo25119y(this);
            return;
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container".toString());
    }

    /* renamed from: X1 */
    public final C10076p mo24906X1() {
        return this.f26738w0;
    }

    /* renamed from: Z1 */
    public final void mo24907Z1() {
        Toolbar toolbar;
        AppBarLayout appBarLayout = this.f26734s0;
        if (!(appBarLayout == null || (toolbar = this.f26735t0) == null || toolbar.getParent() != appBarLayout)) {
            appBarLayout.removeView(toolbar);
        }
        this.f26735t0 = null;
    }

    /* renamed from: a2 */
    public final void mo24908a2(C10430l<? super C10076p, C10323s> lVar) {
        this.f26739x0 = lVar;
    }

    /* renamed from: b2 */
    public final void mo24909b2(Toolbar toolbar) {
        C10457l.m35320e(toolbar, "toolbar");
        AppBarLayout appBarLayout = this.f26734s0;
        if (appBarLayout != null) {
            appBarLayout.addView(toolbar);
        }
        AppBarLayout.C4142d dVar = new AppBarLayout.C4142d(-1, -2);
        dVar.mo12651d(0);
        toolbar.setLayoutParams(dVar);
        this.f26735t0 = toolbar;
    }

    /* renamed from: c2 */
    public final void mo24910c2(boolean z) {
        if (this.f26736u0 != z) {
            AppBarLayout appBarLayout = this.f26734s0;
            if (appBarLayout != null) {
                appBarLayout.setTargetElevation(z ? 0.0f : C3038r.m12006c(4.0f));
            }
            this.f26736u0 = z;
        }
    }

    /* renamed from: d2 */
    public final void mo24911d2(boolean z) {
        if (this.f26737v0 != z) {
            ViewGroup.LayoutParams layoutParams = mo24892I1().getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((CoordinatorLayout.C1090f) layoutParams).mo3515o(z ? null : new AppBarLayout.ScrollingViewBehavior());
            this.f26737v0 = z;
        }
    }

    /* renamed from: k0 */
    public void mo3907k0(Menu menu, MenuInflater menuInflater) {
        C10457l.m35320e(menu, "menu");
        C10457l.m35320e(menuInflater, "inflater");
        m33993f2(menu);
        super.mo3907k0(menu, menuInflater);
    }

    /* renamed from: l0 */
    public View mo3910l0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AppBarLayout appBarLayout;
        AppBarLayout appBarLayout2;
        C10457l.m35320e(layoutInflater, "inflater");
        Context s = mo3930s();
        AppBarLayout appBarLayout3 = null;
        C10020b bVar = s != null ? new C10020b(s, this) : null;
        C10084w I1 = mo24892I1();
        CoordinatorLayout.C1090f fVar = new CoordinatorLayout.C1090f(-1, -1);
        fVar.mo3515o(this.f26737v0 ? null : new AppBarLayout.ScrollingViewBehavior());
        I1.setLayoutParams(fVar);
        if (bVar != null) {
            bVar.addView(ScreenFragment.m33968N1(mo24892I1()));
        }
        Context s2 = mo3930s();
        if (s2 != null) {
            appBarLayout3 = new AppBarLayout(s2);
            appBarLayout3.setBackgroundColor(0);
            appBarLayout3.setLayoutParams(new AppBarLayout.C4142d(-1, -2));
        }
        this.f26734s0 = appBarLayout3;
        if (bVar != null) {
            bVar.addView(appBarLayout3);
        }
        if (this.f26736u0 && (appBarLayout2 = this.f26734s0) != null) {
            appBarLayout2.setTargetElevation(0.0f);
        }
        Toolbar toolbar = this.f26735t0;
        if (!(toolbar == null || (appBarLayout = this.f26734s0) == null)) {
            appBarLayout.addView(ScreenFragment.m33968N1(toolbar));
        }
        mo3919o1(true);
        return bVar;
    }

    /* renamed from: z0 */
    public void mo3952z0(Menu menu) {
        C10457l.m35320e(menu, "menu");
        m33993f2(menu);
        super.mo3952z0(menu);
    }
}
