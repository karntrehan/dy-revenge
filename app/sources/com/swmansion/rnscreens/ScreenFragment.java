package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.C1214c;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.C3051u0;
import com.facebook.react.uimanager.events.C2944c;
import com.facebook.react.uimanager.events.C2945d;
import com.swmansion.rnscreens.p442f0.C10051a;
import com.swmansion.rnscreens.p442f0.C10053b;
import com.swmansion.rnscreens.p442f0.C10055c;
import com.swmansion.rnscreens.p442f0.C10057d;
import com.swmansion.rnscreens.p442f0.C10059e;
import com.swmansion.rnscreens.p442f0.C10061f;
import com.swmansion.rnscreens.p442f0.C10063g;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p455g.C10313k;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

public class ScreenFragment extends Fragment {

    /* renamed from: k0 */
    public static final C10015a f26720k0 = new C10015a((C10452g) null);

    /* renamed from: l0 */
    public C10084w f26721l0;

    /* renamed from: m0 */
    private final List<C10091x<?>> f26722m0 = new ArrayList();

    /* renamed from: n0 */
    private boolean f26723n0;

    /* renamed from: o0 */
    private float f26724o0 = -1.0f;

    /* renamed from: p0 */
    private boolean f26725p0 = true;

    /* renamed from: q0 */
    private boolean f26726q0 = true;

    /* renamed from: r0 */
    private boolean f26727r0;

    /* renamed from: com.swmansion.rnscreens.ScreenFragment$a */
    public static final class C10015a {
        private C10015a() {
        }

        public /* synthetic */ C10015a(C10452g gVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final View mo24902a(View view) {
            C10457l.m35320e(view, "view");
            ViewParent parent = view.getParent();
            if (parent != null) {
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.endViewTransition(view);
                viewGroup.removeView(view);
            }
            view.setVisibility(0);
            return view;
        }
    }

    /* renamed from: com.swmansion.rnscreens.ScreenFragment$b */
    public enum C10016b {
        Appear,
        WillAppear,
        Disappear,
        WillDisappear
    }

    /* renamed from: com.swmansion.rnscreens.ScreenFragment$c */
    private static final class C10017c extends FrameLayout {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10017c(Context context) {
            super(context);
            C10457l.m35320e(context, "context");
        }

        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }
    }

    /* renamed from: com.swmansion.rnscreens.ScreenFragment$d */
    public /* synthetic */ class C10018d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26733a;

        static {
            int[] iArr = new int[C10016b.values().length];
            iArr[C10016b.WillAppear.ordinal()] = 1;
            iArr[C10016b.Appear.ordinal()] = 2;
            iArr[C10016b.WillDisappear.ordinal()] = 3;
            iArr[C10016b.Disappear.ordinal()] = 4;
            f26733a = iArr;
        }
    }

    public ScreenFragment() {
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    @SuppressLint({"ValidFragment"})
    public ScreenFragment(C10084w wVar) {
        C10457l.m35320e(wVar, "screenView");
        mo24897Q1(wVar);
    }

    /* renamed from: A1 */
    private final void m33961A1() {
        m33972x1(C10016b.Appear, this);
        mo24890E1(1.0f, false);
    }

    /* renamed from: B1 */
    private final void m33962B1() {
        m33972x1(C10016b.Disappear, this);
        mo24890E1(1.0f, true);
    }

    /* renamed from: C1 */
    private final void m33963C1() {
        m33972x1(C10016b.WillAppear, this);
        mo24890E1(0.0f, false);
    }

    /* renamed from: D1 */
    private final void m33964D1() {
        m33972x1(C10016b.WillDisappear, this);
        mo24890E1(0.0f, true);
    }

    /* renamed from: F1 */
    private final void m33965F1(boolean z) {
        this.f26727r0 = !z;
        Fragment C = mo3842C();
        if (C != null && (!(C instanceof ScreenFragment) || ((ScreenFragment) C).f26727r0)) {
            return;
        }
        if (mo3881Y()) {
            UiThreadUtil.runOnUiThread(new C10037d(z, this));
        } else if (z) {
            m33962B1();
        } else {
            m33964D1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m33966G1(boolean z, ScreenFragment screenFragment) {
        C10457l.m35320e(screenFragment, "this$0");
        if (z) {
            screenFragment.m33961A1();
        } else {
            screenFragment.m33963C1();
        }
    }

    /* renamed from: N1 */
    protected static final View m33968N1(View view) {
        return f26720k0.mo24902a(view);
    }

    /* renamed from: P1 */
    private final void m33969P1(C10016b bVar) {
        int i = C10018d.f26733a[bVar.ordinal()];
        if (i == 1) {
            this.f26725p0 = false;
        } else if (i == 2) {
            this.f26726q0 = false;
        } else if (i == 3) {
            this.f26725p0 = true;
        } else if (i == 4) {
            this.f26726q0 = true;
        }
    }

    /* renamed from: U1 */
    private final void m33970U1() {
        C1214c l = mo3909l();
        if (l == null) {
            this.f26723n0 = true;
        } else {
            C10031b0.f26755a.mo25003v(mo24892I1(), l, mo24899S1());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024 A[RETURN, SYNTHETIC] */
    /* renamed from: w1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m33971w1(com.swmansion.rnscreens.ScreenFragment.C10016b r4) {
        /*
            r3 = this;
            int[] r0 = com.swmansion.rnscreens.ScreenFragment.C10018d.f26733a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            r0 = 0
            r1 = 1
            if (r4 == r1) goto L_0x0029
            r2 = 2
            if (r4 == r2) goto L_0x0026
            r2 = 3
            if (r4 == r2) goto L_0x0020
            r2 = 4
            if (r4 != r2) goto L_0x001a
            boolean r4 = r3.f26726q0
            if (r4 != 0) goto L_0x002b
            goto L_0x0024
        L_0x001a:
            g.k r4 = new g.k
            r4.<init>()
            throw r4
        L_0x0020:
            boolean r4 = r3.f26725p0
            if (r4 != 0) goto L_0x002b
        L_0x0024:
            r0 = 1
            goto L_0x002b
        L_0x0026:
            boolean r0 = r3.f26726q0
            goto L_0x002b
        L_0x0029:
            boolean r0 = r3.f26725p0
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenFragment.m33971w1(com.swmansion.rnscreens.ScreenFragment$b):boolean");
    }

    /* renamed from: x1 */
    private final void m33972x1(C10016b bVar, ScreenFragment screenFragment) {
        C2944c cVar;
        if ((screenFragment instanceof ScreenStackFragment) && screenFragment.m33971w1(bVar)) {
            C10084w I1 = screenFragment.mo24892I1();
            screenFragment.m33969P1(bVar);
            int i = C10018d.f26733a[bVar.ordinal()];
            if (i == 1) {
                cVar = new C10061f(I1.getId());
            } else if (i == 2) {
                cVar = new C10053b(I1.getId());
            } else if (i == 3) {
                cVar = new C10063g(I1.getId());
            } else if (i == 4) {
                cVar = new C10055c(I1.getId());
            } else {
                throw new C10313k();
            }
            Context context = mo24892I1().getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            C2945d b = C3051u0.m12085b((ReactContext) context, mo24892I1().getId());
            if (b != null) {
                b.mo9651c(cVar);
            }
            screenFragment.m33973y1(bVar);
        }
    }

    /* renamed from: y1 */
    private final void m33973y1(C10016b bVar) {
        ScreenFragment fragment;
        List<C10091x<?>> list = this.f26722m0;
        ArrayList<C10091x> arrayList = new ArrayList<>();
        for (T next : list) {
            if (((C10091x) next).getScreenCount() > 0) {
                arrayList.add(next);
            }
        }
        for (C10091x topScreen : arrayList) {
            C10084w topScreen2 = topScreen.getTopScreen();
            if (!(topScreen2 == null || (fragment = topScreen2.getFragment()) == null)) {
                m33972x1(bVar, fragment);
            }
        }
    }

    /* renamed from: C0 */
    public void mo3843C0() {
        super.mo3843C0();
        if (this.f26723n0) {
            this.f26723n0 = false;
            C10031b0.f26755a.mo25003v(mo24892I1(), mo24898R1(), mo24899S1());
        }
    }

    /* renamed from: E1 */
    public final void mo24890E1(float f, boolean z) {
        if (this instanceof ScreenStackFragment) {
            int i = 1;
            if (!(this.f26724o0 == f)) {
                float max = Math.max(0.0f, Math.min(1.0f, f));
                this.f26724o0 = max;
                if (!(max == 0.0f)) {
                    if (max != 1.0f) {
                        i = 0;
                    }
                    i = i != 0 ? 2 : 3;
                }
                short s = (short) i;
                C10091x<?> container = mo24892I1().getContainer();
                boolean goingForward = container instanceof C10093y ? ((C10093y) container).getGoingForward() : false;
                Context context = mo24892I1().getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                C2945d b = C3051u0.m12085b((ReactContext) context, mo24892I1().getId());
                if (b != null) {
                    b.mo9651c(new C10059e(mo24892I1().getId(), this.f26724o0, z, goingForward, s));
                }
            }
        }
    }

    /* renamed from: H1 */
    public final List<C10091x<?>> mo24891H1() {
        return this.f26722m0;
    }

    /* renamed from: I1 */
    public final C10084w mo24892I1() {
        C10084w wVar = this.f26721l0;
        if (wVar != null) {
            return wVar;
        }
        C10457l.m35332q("screen");
        return null;
    }

    /* renamed from: K1 */
    public void mo24893K1() {
        m33970U1();
    }

    /* renamed from: L1 */
    public void mo24894L1() {
        m33965F1(true);
    }

    /* renamed from: M1 */
    public final void mo24895M1() {
        m33965F1(false);
    }

    /* renamed from: O1 */
    public final void mo24896O1(C10091x<?> xVar) {
        C10457l.m35320e(xVar, "screenContainer");
        this.f26722m0.add(xVar);
    }

    /* renamed from: Q1 */
    public final void mo24897Q1(C10084w wVar) {
        C10457l.m35320e(wVar, "<set-?>");
        this.f26721l0 = wVar;
    }

    /* renamed from: R1 */
    public final Activity mo24898R1() {
        ScreenFragment fragment;
        C1214c l;
        C1214c l2 = mo3909l();
        if (l2 != null) {
            return l2;
        }
        Context context = mo24892I1().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = mo24892I1().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof C10084w) && (fragment = ((C10084w) container).getFragment()) != null && (l = fragment.mo3909l()) != null) {
                return l;
            }
        }
        return null;
    }

    /* renamed from: S1 */
    public final ReactContext mo24899S1() {
        if (mo3930s() instanceof ReactContext) {
            Context s = mo3930s();
            Objects.requireNonNull(s, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) s;
        } else if (mo24892I1().getContext() instanceof ReactContext) {
            Context context = mo24892I1().getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context;
        } else {
            for (ViewParent container = mo24892I1().getContainer(); container != null; container = container.getParent()) {
                if (container instanceof C10084w) {
                    C10084w wVar = (C10084w) container;
                    if (wVar.getContext() instanceof ReactContext) {
                        Context context2 = wVar.getContext();
                        Objects.requireNonNull(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                        return (ReactContext) context2;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: T1 */
    public final void mo24900T1(C10091x<?> xVar) {
        C10457l.m35320e(xVar, "screenContainer");
        this.f26722m0.remove(xVar);
    }

    /* renamed from: l0 */
    public View mo3910l0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C10457l.m35320e(layoutInflater, "inflater");
        mo24892I1().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context s = mo3930s();
        if (s == null) {
            return null;
        }
        C10017c cVar = new C10017c(s);
        cVar.addView(m33968N1(mo24892I1()));
        return cVar;
    }

    /* renamed from: m0 */
    public void mo3913m0() {
        C2945d b;
        super.mo3913m0();
        C10091x<?> container = mo24892I1().getContainer();
        if (container == null || !container.mo25096j(this)) {
            Context context = mo24892I1().getContext();
            if ((context instanceof ReactContext) && (b = C3051u0.m12085b((ReactContext) context, mo24892I1().getId())) != null) {
                b.mo9651c(new C10057d(mo24892I1().getId()));
            }
        }
        this.f26722m0.clear();
    }

    /* renamed from: z1 */
    public final void mo24901z1() {
        Context context = mo24892I1().getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        C2945d b = C3051u0.m12085b((ReactContext) context, mo24892I1().getId());
        if (b != null) {
            b.mo9651c(new C10051a(mo24892I1().getId()));
        }
    }
}
