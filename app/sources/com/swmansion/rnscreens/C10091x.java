package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.C1231l;
import androidx.fragment.app.C1252s;
import androidx.fragment.app.Fragment;
import com.facebook.react.C3249w;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.C2790a;
import com.facebook.react.modules.core.C2804g;
import com.swmansion.rnscreens.C10084w;
import com.swmansion.rnscreens.ScreenFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p455g.C10323s;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.rnscreens.x */
public class C10091x<T extends ScreenFragment> extends ViewGroup {

    /* renamed from: f */
    protected final ArrayList<T> f26884f = new ArrayList<>();

    /* renamed from: o */
    protected C1231l f26885o;

    /* renamed from: p */
    private boolean f26886p;

    /* renamed from: q */
    private boolean f26887q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f26888r;

    /* renamed from: s */
    private final C2790a.C2791a f26889s = new C10092a(this);

    /* renamed from: t */
    private ScreenFragment f26890t;

    /* renamed from: com.swmansion.rnscreens.x$a */
    public static final class C10092a extends C2790a.C2791a {

        /* renamed from: b */
        final /* synthetic */ C10091x<T> f26891b;

        C10092a(C10091x<T> xVar) {
            this.f26891b = xVar;
        }

        /* renamed from: a */
        public void mo9129a(long j) {
            this.f26891b.f26888r = false;
            C10091x<T> xVar = this.f26891b;
            xVar.measure(View.MeasureSpec.makeMeasureSpec(xVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f26891b.getHeight(), 1073741824));
            C10091x<T> xVar2 = this.f26891b;
            xVar2.layout(xVar2.getLeft(), this.f26891b.getTop(), this.f26891b.getRight(), this.f26891b.getBottom());
        }
    }

    public C10091x(Context context) {
        super(context);
    }

    /* renamed from: d */
    private final void m34130d(C1252s sVar, ScreenFragment screenFragment) {
        sVar.mo4242b(getId(), screenFragment);
    }

    /* renamed from: f */
    private final void m34131f(C1252s sVar, ScreenFragment screenFragment) {
        sVar.mo3976m(screenFragment);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.fragment.app.C1231l m34132g(com.facebook.react.C3249w r4) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getContext()
        L_0x0004:
            boolean r1 = r0 instanceof androidx.fragment.app.C1214c
            if (r1 != 0) goto L_0x0013
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x0013
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x0004
        L_0x0013:
            if (r1 == 0) goto L_0x0040
            androidx.fragment.app.c r0 = (androidx.fragment.app.C1214c) r0
            androidx.fragment.app.l r1 = r0.mo4006q()
            java.util.List r1 = r1.mo4143i0()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x002f
            androidx.fragment.app.l r4 = r0.mo4006q()
            java.lang.String r0 = "{\n            // We are …FragmentManager\n        }"
        L_0x002b:
            p455g.p470y.p472d.C10457l.m35319d(r4, r0)
            goto L_0x003f
        L_0x002f:
            androidx.fragment.app.Fragment r4 = androidx.fragment.app.C1231l.m4997X(r4)     // Catch:{ IllegalStateException -> 0x0038 }
            androidx.fragment.app.l r4 = r4.mo3927r()     // Catch:{ IllegalStateException -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            androidx.fragment.app.l r4 = r0.mo4006q()
        L_0x003c:
            java.lang.String r0 = "{\n            // We are …r\n            }\n        }"
            goto L_0x002b
        L_0x003f:
            return r4
        L_0x0040:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "In order to use RNScreens components your app's activity need to extend ReactActivity"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.C10091x.m34132g(com.facebook.react.w):androidx.fragment.app.l");
    }

    /* renamed from: h */
    private final C10084w.C10085a m34133h(ScreenFragment screenFragment) {
        return screenFragment.mo24892I1().getActivityState();
    }

    /* renamed from: n */
    private final void m34135n() {
        this.f26887q = true;
        Context context = getContext();
        ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
        if (reactContext != null) {
            reactContext.runOnUiQueueThread(new C10035c(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m34136o(C10091x xVar) {
        C10457l.m35320e(xVar, "this$0");
        xVar.mo25104q();
    }

    private final void setFragmentManager(C1231l lVar) {
        this.f26885o = lVar;
        mo25105r();
    }

    /* renamed from: t */
    private final void m34137t(C1231l lVar) {
        C1252s i = lVar.mo4142i();
        C10457l.m35319d(i, "fragmentManager.beginTransaction()");
        boolean z = false;
        for (Fragment next : lVar.mo4143i0()) {
            if ((next instanceof ScreenFragment) && ((ScreenFragment) next).mo24892I1().getContainer() == this) {
                i.mo3976m(next);
                z = true;
            }
        }
        if (z) {
            i.mo3974j();
        }
    }

    /* renamed from: v */
    private final void m34138v() {
        boolean z;
        C10323s sVar;
        ViewParent viewParent = this;
        while (true) {
            z = viewParent instanceof C3249w;
            if (!z && !(viewParent instanceof C10084w) && viewParent.getParent() != null) {
                viewParent = viewParent.getParent();
                C10457l.m35319d(viewParent, "parent.parent");
            }
        }
        if (viewParent instanceof C10084w) {
            ScreenFragment fragment = ((C10084w) viewParent).getFragment();
            if (fragment != null) {
                this.f26890t = fragment;
                fragment.mo24896O1(this);
                C1231l r = fragment.mo3927r();
                C10457l.m35319d(r, "screenFragment.childFragmentManager");
                setFragmentManager(r);
                sVar = C10323s.f27547a;
            } else {
                sVar = null;
            }
            if (sVar == null) {
                throw new IllegalStateException("Parent Screen does not have its Fragment attached".toString());
            }
        } else if (z) {
            setFragmentManager(m34132g((C3249w) viewParent));
        } else {
            throw new IllegalStateException("ScreenContainer is not attached under ReactRootView".toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public T mo25090b(C10084w wVar) {
        C10457l.m35320e(wVar, "screen");
        return new ScreenFragment(wVar);
    }

    /* renamed from: c */
    public final void mo25091c(C10084w wVar, int i) {
        C10457l.m35320e(wVar, "screen");
        ScreenFragment b = mo25090b(wVar);
        wVar.setFragment(b);
        this.f26884f.add(i, b);
        wVar.setContainer(this);
        m34135n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C1252s mo25092e() {
        C1231l lVar = this.f26885o;
        if (lVar != null) {
            C1252s s = lVar.mo4142i().mo4253s(true);
            C10457l.m35319d(s, "requireNotNull(mFragment…etReorderingAllowed(true)");
            return s;
        }
        throw new IllegalArgumentException("mFragmentManager is null when creating transaction".toString());
    }

    public final int getScreenCount() {
        return this.f26884f.size();
    }

    public C10084w getTopScreen() {
        T t;
        boolean z;
        Iterator<T> it = this.f26884f.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (m34133h((ScreenFragment) t) == C10084w.C10085a.ON_TOP) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        ScreenFragment screenFragment = (ScreenFragment) t;
        if (screenFragment != null) {
            return screenFragment.mo24892I1();
        }
        return null;
    }

    /* renamed from: i */
    public final C10084w mo25095i(int i) {
        return ((ScreenFragment) this.f26884f.get(i)).mo24892I1();
    }

    /* renamed from: j */
    public boolean mo25096j(ScreenFragment screenFragment) {
        return C10358t.m35177y(this.f26884f, screenFragment);
    }

    /* renamed from: l */
    public final void mo25097l() {
        mo25105r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo25098m() {
        ScreenFragment fragment;
        C10084w topScreen = getTopScreen();
        if (topScreen != null && (fragment = topScreen.getFragment()) != null) {
            fragment.mo24893K1();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26886p = true;
        m34138v();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C1231l lVar = this.f26885o;
        if (lVar != null && !lVar.mo4155r0()) {
            m34137t(lVar);
            lVar.mo4124U();
        }
        ScreenFragment screenFragment = this.f26890t;
        if (screenFragment != null) {
            screenFragment.mo24900T1(this);
        }
        this.f26890t = null;
        super.onDetachedFromWindow();
        this.f26886p = false;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                removeViewAt(childCount);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).layout(0, 0, getWidth(), getHeight());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(i, i2);
        }
    }

    /* renamed from: p */
    public void mo25103p() {
        C1252s e = mo25092e();
        C1231l lVar = this.f26885o;
        if (lVar != null) {
            HashSet hashSet = new HashSet(lVar.mo4143i0());
            Iterator<T> it = this.f26884f.iterator();
            while (it.hasNext()) {
                ScreenFragment screenFragment = (ScreenFragment) it.next();
                C10457l.m35319d(screenFragment, "screenFragment");
                if (m34133h(screenFragment) == C10084w.C10085a.INACTIVE && screenFragment.mo3867R()) {
                    m34131f(e, screenFragment);
                }
                hashSet.remove(screenFragment);
            }
            boolean z = false;
            if (!hashSet.isEmpty()) {
                Object[] array = hashSet.toArray(new Fragment[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                for (Fragment fragment : (Fragment[]) array) {
                    if (fragment instanceof ScreenFragment) {
                        ScreenFragment screenFragment2 = (ScreenFragment) fragment;
                        if (screenFragment2.mo24892I1().getContainer() == null) {
                            m34131f(e, screenFragment2);
                        }
                    }
                }
            }
            boolean z2 = getTopScreen() == null;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = this.f26884f.iterator();
            while (it2.hasNext()) {
                ScreenFragment screenFragment3 = (ScreenFragment) it2.next();
                C10457l.m35319d(screenFragment3, "screenFragment");
                C10084w.C10085a h = m34133h(screenFragment3);
                C10084w.C10085a aVar = C10084w.C10085a.INACTIVE;
                if (h != aVar && !screenFragment3.mo3867R()) {
                    m34130d(e, screenFragment3);
                    z = true;
                } else if (h != aVar && z) {
                    m34131f(e, screenFragment3);
                    arrayList.add(screenFragment3);
                }
                screenFragment3.mo24892I1().setTransitioning(z2);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ScreenFragment screenFragment4 = (ScreenFragment) it3.next();
                C10457l.m35319d(screenFragment4, "screenFragment");
                m34130d(e, screenFragment4);
            }
            e.mo3974j();
            return;
        }
        throw new IllegalArgumentException("mFragmentManager is null when performing update in ScreenContainer".toString());
    }

    /* renamed from: q */
    public final void mo25104q() {
        C1231l lVar;
        if (this.f26887q && this.f26886p && (lVar = this.f26885o) != null) {
            boolean z = true;
            if (lVar == null || !lVar.mo4155r0()) {
                z = false;
            }
            if (!z) {
                this.f26887q = false;
                mo25103p();
                mo25098m();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo25105r() {
        this.f26887q = true;
        mo25104q();
    }

    public void removeView(View view) {
        C10457l.m35320e(view, "view");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    public void requestLayout() {
        super.requestLayout();
        if (!this.f26888r && this.f26889s != null) {
            this.f26888r = true;
            C2804g.m11194i().mo9151m(C2804g.C2807c.NATIVE_ANIMATED_MODULE, this.f26889s);
        }
    }

    /* renamed from: s */
    public void mo25108s() {
        Iterator<T> it = this.f26884f.iterator();
        while (it.hasNext()) {
            ((ScreenFragment) it.next()).mo24892I1().setContainer((C10091x<?>) null);
        }
        this.f26884f.clear();
        m34135n();
    }

    /* renamed from: u */
    public void mo25109u(int i) {
        ((ScreenFragment) this.f26884f.get(i)).mo24892I1().setContainer((C10091x<?>) null);
        this.f26884f.remove(i);
        m34135n();
    }
}
