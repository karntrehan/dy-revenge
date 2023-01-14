package com.swmansion.reanimated.layoutReanimation;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.C2981h;
import com.facebook.react.uimanager.C3022n;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.p123m1.C3007e;
import com.facebook.react.uimanager.p123m1.C3011f;
import com.swmansion.reanimated.ReanimatedModule;
import com.swmansion.rnscreens.ScreenStackViewManager;
import com.swmansion.rnscreens.ScreenViewManager;
import java.lang.ref.WeakReference;

/* renamed from: com.swmansion.reanimated.layoutReanimation.f */
class C9944f extends C3007e {

    /* renamed from: i */
    private C9941d f26618i = null;

    /* renamed from: j */
    private volatile boolean f26619j = false;

    /* renamed from: k */
    private ReactApplicationContext f26620k;

    /* renamed from: l */
    private WeakReference<C3022n> f26621l = new WeakReference<>((Object) null);

    C9944f(ReactApplicationContext reactApplicationContext, C3022n nVar) {
        this.f26620k = reactApplicationContext;
        this.f26621l = new WeakReference<>(nVar);
    }

    /* renamed from: i */
    private void m33868i(View view, C3022n nVar) {
        int id = view.getId();
        if (id != -1) {
            ViewManager viewManager = null;
            try {
                viewManager = nVar.mo9787x(id);
                this.f26618i.mo24840h(view, (ViewGroup) view.getParent(), new C9947h(view, (C3022n) this.f26621l.get()), new C9940c(nVar, view));
            } catch (C2981h e) {
                e.printStackTrace();
            }
            if (viewManager instanceof ViewGroupManager) {
                ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                int i = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i < viewGroupManager.getChildCount(viewGroup)) {
                        m33868i(viewGroupManager.getChildAt(viewGroup, i), nVar);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo9744b(View view, int i, int i2, int i3, int i4) {
        if (!mo24846j()) {
            super.mo9744b(view, i, i2, i3, i4);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        mo24847m();
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            view.layout(i, i2, i3 + i, i4 + i2);
            if (view.getId() != -1) {
                this.f26618i.mo24839g(view, (ViewGroup) view.getParent(), new C9947h(view, (C3022n) this.f26621l.get()));
                return;
            }
            return;
        }
        C9947h hVar = new C9947h(view, (C3022n) this.f26621l.get());
        view.layout(i, i2, i3 + i, i4 + i2);
        this.f26618i.mo24841i(view, hVar, new C9947h(view, (C3022n) this.f26621l.get()));
    }

    /* renamed from: c */
    public void mo9745c(View view, C3011f fVar) {
        if (!mo24846j()) {
            super.mo9745c(view, fVar);
            return;
        }
        UiThreadUtil.assertOnUiThread();
        C3022n nVar = (C3022n) this.f26621l.get();
        try {
            ViewManager x = nVar.mo9787x(view.getId());
            if (x.getName().equals(ScreenViewManager.REACT_CLASS) && view.getParent() != null && (view.getParent().getParent() instanceof View)) {
                if (nVar.mo9787x(((View) view.getParent().getParent()).getId()).getName().equals(ScreenStackViewManager.REACT_CLASS)) {
                    super.mo9745c(view, fVar);
                    return;
                }
            }
            mo24847m();
            this.f26618i.mo24840h(view, (ViewGroup) view.getParent(), new C9947h(view, (C3022n) this.f26621l.get()), new C9939b(fVar));
            if (x instanceof ViewGroupManager) {
                ViewGroupManager viewGroupManager = (ViewGroupManager) x;
                int i = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i < viewGroupManager.getChildCount(viewGroup)) {
                        m33868i(viewGroupManager.getChildAt(viewGroup, i), nVar);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        } catch (C2981h e) {
            e.printStackTrace();
            super.mo9745c(view, fVar);
        }
    }

    /* renamed from: h */
    public boolean mo9748h(View view) {
        return !mo24846j() ? super.mo9748h(view) : (view == null || view.getParent() == null) ? false : true;
    }

    /* renamed from: j */
    public boolean mo24846j() {
        mo24847m();
        return this.f26618i.mo24836c();
    }

    /* renamed from: m */
    public void mo24847m() {
        if (!this.f26619j) {
            this.f26619j = true;
            C9941d s = ((ReanimatedModule) this.f26620k.getNativeModule(ReanimatedModule.class)).getNodesManager().mo24810s();
            this.f26618i = s;
            s.mo24844n((C9945g) this.f26621l.get());
        }
    }
}
