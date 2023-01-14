package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.C1130o;
import androidx.lifecycle.C1286d;
import androidx.lifecycle.C1289e;
import androidx.lifecycle.C1291g;
import androidx.lifecycle.C1292h;
import androidx.lifecycle.C1300m;
import androidx.lifecycle.C1311s;
import androidx.lifecycle.C1312t;
import androidx.savedstate.C1422a;
import androidx.savedstate.C1423b;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import p027c.p064i.p072j.C1944f;
import p027c.p092r.p093a.C2068a;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, C1291g, C1312t, C1423b {

    /* renamed from: f */
    static final Object f3356f = new Object();

    /* renamed from: A */
    boolean f3357A;

    /* renamed from: B */
    boolean f3358B;

    /* renamed from: C */
    boolean f3359C;

    /* renamed from: D */
    boolean f3360D;

    /* renamed from: E */
    int f3361E;

    /* renamed from: F */
    C1231l f3362F;

    /* renamed from: G */
    C1227i<?> f3363G;

    /* renamed from: H */
    C1231l f3364H = new C1242m();

    /* renamed from: I */
    Fragment f3365I;

    /* renamed from: J */
    int f3366J;

    /* renamed from: K */
    int f3367K;

    /* renamed from: L */
    String f3368L;

    /* renamed from: M */
    boolean f3369M;

    /* renamed from: N */
    boolean f3370N;

    /* renamed from: O */
    boolean f3371O;

    /* renamed from: P */
    boolean f3372P;

    /* renamed from: Q */
    boolean f3373Q;

    /* renamed from: R */
    boolean f3374R = true;

    /* renamed from: S */
    private boolean f3375S;

    /* renamed from: T */
    ViewGroup f3376T;

    /* renamed from: U */
    View f3377U;

    /* renamed from: V */
    boolean f3378V;

    /* renamed from: W */
    boolean f3379W = true;

    /* renamed from: X */
    C1206d f3380X;

    /* renamed from: Y */
    Runnable f3381Y = new C1203a();

    /* renamed from: Z */
    boolean f3382Z;

    /* renamed from: a0 */
    boolean f3383a0;

    /* renamed from: b0 */
    float f3384b0;

    /* renamed from: c0 */
    LayoutInflater f3385c0;

    /* renamed from: d0 */
    boolean f3386d0;

    /* renamed from: e0 */
    C1286d.C1288b f3387e0 = C1286d.C1288b.RESUMED;

    /* renamed from: f0 */
    C1292h f3388f0;

    /* renamed from: g0 */
    C1273w f3389g0;

    /* renamed from: h0 */
    C1300m<C1291g> f3390h0 = new C1300m<>();

    /* renamed from: i0 */
    C1422a f3391i0;

    /* renamed from: j0 */
    private int f3392j0;

    /* renamed from: o */
    int f3393o = -1;

    /* renamed from: p */
    Bundle f3394p;

    /* renamed from: q */
    SparseArray<Parcelable> f3395q;

    /* renamed from: r */
    Boolean f3396r;

    /* renamed from: s */
    String f3397s = UUID.randomUUID().toString();

    /* renamed from: t */
    Bundle f3398t;

    /* renamed from: u */
    Fragment f3399u;

    /* renamed from: v */
    String f3400v = null;

    /* renamed from: w */
    int f3401w;

    /* renamed from: x */
    private Boolean f3402x = null;

    /* renamed from: y */
    boolean f3403y;

    /* renamed from: z */
    boolean f3404z;

    /* renamed from: androidx.fragment.app.Fragment$a */
    class C1203a implements Runnable {
        C1203a() {
        }

        public void run() {
            Fragment.this.mo3944v1();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    class C1204b implements Runnable {
        C1204b() {
        }

        public void run() {
            Fragment.this.mo3892e();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    class C1205c extends C1223e {
        C1205c() {
        }

        /* renamed from: c */
        public View mo3955c(int i) {
            View view = Fragment.this.f3377U;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + this + " does not have a view");
        }

        /* renamed from: d */
        public boolean mo3956d() {
            return Fragment.this.f3377U != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    static class C1206d {

        /* renamed from: a */
        View f3409a;

        /* renamed from: b */
        Animator f3410b;

        /* renamed from: c */
        int f3411c;

        /* renamed from: d */
        int f3412d;

        /* renamed from: e */
        int f3413e;

        /* renamed from: f */
        Object f3414f = null;

        /* renamed from: g */
        Object f3415g;

        /* renamed from: h */
        Object f3416h;

        /* renamed from: i */
        Object f3417i;

        /* renamed from: j */
        Object f3418j;

        /* renamed from: k */
        Object f3419k;

        /* renamed from: l */
        Boolean f3420l;

        /* renamed from: m */
        Boolean f3421m;

        /* renamed from: n */
        C1130o f3422n;

        /* renamed from: o */
        C1130o f3423o;

        /* renamed from: p */
        boolean f3424p;

        /* renamed from: q */
        C1208f f3425q;

        /* renamed from: r */
        boolean f3426r;

        C1206d() {
            Object obj = Fragment.f3356f;
            this.f3415g = obj;
            this.f3416h = null;
            this.f3417i = obj;
            this.f3418j = null;
            this.f3419k = obj;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    public static class C1207e extends RuntimeException {
        public C1207e(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    interface C1208f {
        /* renamed from: a */
        void mo3957a();

        /* renamed from: b */
        void mo3958b();
    }

    public Fragment() {
        m4735O();
    }

    /* renamed from: O */
    private void m4735O() {
        this.f3388f0 = new C1292h(this);
        this.f3391i0 = C1422a.m6371a(this);
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3388f0.mo4338a(new C1289e() {
                /* renamed from: h */
                public void mo137h(C1291g gVar, C1286d.C1287a aVar) {
                    View view;
                    if (aVar == C1286d.C1287a.ON_STOP && (view = Fragment.this.f3377U) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
        }
    }

    @Deprecated
    /* renamed from: Q */
    public static Fragment m4736Q(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C1226h.m4955d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mo3917n1(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new C1207e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C1207e("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C1207e("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C1207e("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* renamed from: h */
    private C1206d m4737h() {
        if (this.f3380X == null) {
            this.f3380X = new C1206d();
        }
        return this.f3380X;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public int mo3838A() {
        C1206d dVar = this.f3380X;
        if (dVar == null) {
            return 0;
        }
        return dVar.f3412d;
    }

    /* renamed from: A0 */
    public void mo3839A0(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int mo3840B() {
        C1206d dVar = this.f3380X;
        if (dVar == null) {
            return 0;
        }
        return dVar.f3413e;
    }

    /* renamed from: B0 */
    public void mo3841B0(int i, String[] strArr, int[] iArr) {
    }

    /* renamed from: C */
    public final Fragment mo3842C() {
        return this.f3365I;
    }

    /* renamed from: C0 */
    public void mo3843C0() {
        this.f3375S = true;
    }

    /* renamed from: D */
    public final C1231l mo3844D() {
        C1231l lVar = this.f3362F;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: D0 */
    public void mo3818D0(Bundle bundle) {
    }

    /* renamed from: E */
    public Object mo3845E() {
        C1206d dVar = this.f3380X;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f3417i;
        return obj == f3356f ? mo3942v() : obj;
    }

    /* renamed from: E0 */
    public void mo3820E0() {
        this.f3375S = true;
    }

    /* renamed from: F */
    public final Resources mo3846F() {
        return mo3900h1().getResources();
    }

    /* renamed from: F0 */
    public void mo3821F0() {
        this.f3375S = true;
    }

    /* renamed from: G */
    public final boolean mo3847G() {
        return this.f3371O;
    }

    /* renamed from: G0 */
    public void mo3848G0(View view, Bundle bundle) {
    }

    /* renamed from: H */
    public Object mo3849H() {
        C1206d dVar = this.f3380X;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f3415g;
        return obj == f3356f ? mo3935t() : obj;
    }

    /* renamed from: H0 */
    public void mo3850H0(Bundle bundle) {
        this.f3375S = true;
    }

    /* renamed from: I */
    public Object mo3851I() {
        C1206d dVar = this.f3380X;
        if (dVar == null) {
            return null;
        }
        return dVar.f3418j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I0 */
    public void mo3852I0(Bundle bundle) {
        this.f3364H.mo4104E0();
        this.f3393o = 2;
        this.f3375S = false;
        mo3823b0(bundle);
        if (this.f3375S) {
            this.f3364H.mo4154r();
            return;
        }
        throw new C1274x("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* renamed from: J */
    public Object mo3853J() {
        C1206d dVar = this.f3380X;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f3419k;
        return obj == f3356f ? mo3851I() : obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public void mo3854J0() {
        this.f3364H.mo4139g(this.f3363G, new C1205c(), this);
        this.f3393o = 0;
        this.f3375S = false;
        mo3824e0(this.f3363G.mo4078f());
        if (!this.f3375S) {
            throw new C1274x("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public int mo3855K() {
        C1206d dVar = this.f3380X;
        if (dVar == null) {
            return 0;
        }
        return dVar.f3411c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public void mo3856K0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f3364H.mo4156s(configuration);
    }

    /* renamed from: L */
    public final String mo3857L(int i) {
        return mo3846F().getString(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L0 */
    public boolean mo3858L0(MenuItem menuItem) {
        if (!this.f3369M) {
            return mo3898g0(menuItem) || this.f3364H.mo4157t(menuItem);
        }
        return false;
    }

    /* renamed from: M */
    public final Fragment mo3859M() {
        String str;
        Fragment fragment = this.f3399u;
        if (fragment != null) {
            return fragment;
        }
        C1231l lVar = this.f3362F;
        if (lVar == null || (str = this.f3400v) == null) {
            return null;
        }
        return lVar.mo4127W(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public void mo3860M0(Bundle bundle) {
        this.f3364H.mo4104E0();
        this.f3393o = 1;
        this.f3375S = false;
        this.f3391i0.mo5266c(bundle);
        mo3825h0(bundle);
        this.f3386d0 = true;
        if (this.f3375S) {
            this.f3388f0.mo4342i(C1286d.C1287a.ON_CREATE);
            return;
        }
        throw new C1274x("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* renamed from: N */
    public View mo3861N() {
        return this.f3377U;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public boolean mo3862N0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f3369M) {
            return false;
        }
        if (this.f3373Q && this.f3374R) {
            z = true;
            mo3907k0(menu, menuInflater);
        }
        return z | this.f3364H.mo4161v(menu, menuInflater);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void mo3863O0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3364H.mo4104E0();
        this.f3360D = true;
        this.f3389g0 = new C1273w();
        View l0 = mo3910l0(layoutInflater, viewGroup, bundle);
        this.f3377U = l0;
        if (l0 != null) {
            this.f3389g0.mo4305c();
            this.f3390h0.mo4316n(this.f3389g0);
        } else if (!this.f3389g0.mo4306d()) {
            this.f3389g0 = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo3864P() {
        m4735O();
        this.f3397s = UUID.randomUUID().toString();
        this.f3403y = false;
        this.f3404z = false;
        this.f3357A = false;
        this.f3358B = false;
        this.f3359C = false;
        this.f3361E = 0;
        this.f3362F = null;
        this.f3364H = new C1242m();
        this.f3363G = null;
        this.f3366J = 0;
        this.f3367K = 0;
        this.f3368L = null;
        this.f3369M = false;
        this.f3370N = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo3865P0() {
        this.f3364H.mo4163w();
        this.f3388f0.mo4342i(C1286d.C1287a.ON_DESTROY);
        this.f3393o = 0;
        this.f3375S = false;
        this.f3386d0 = false;
        mo3913m0();
        if (!this.f3375S) {
            throw new C1274x("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public void mo3866Q0() {
        this.f3364H.mo4165x();
        if (this.f3377U != null) {
            this.f3389g0.mo4304a(C1286d.C1287a.ON_DESTROY);
        }
        this.f3393o = 1;
        this.f3375S = false;
        mo3826o0();
        if (this.f3375S) {
            C2068a.m8878b(this).mo6950d();
            this.f3360D = false;
            return;
        }
        throw new C1274x("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* renamed from: R */
    public final boolean mo3867R() {
        return this.f3363G != null && this.f3403y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R0 */
    public void mo3868R0() {
        this.f3393o = -1;
        this.f3375S = false;
        mo3829p0();
        this.f3385c0 = null;
        if (!this.f3375S) {
            throw new C1274x("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.f3364H.mo4155r0()) {
            this.f3364H.mo4163w();
            this.f3364H = new C1242m();
        }
    }

    /* renamed from: S */
    public final boolean mo3869S() {
        return this.f3369M;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public LayoutInflater mo3870S0(Bundle bundle) {
        LayoutInflater q0 = mo3830q0(bundle);
        this.f3385c0 = q0;
        return q0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public boolean mo3871T() {
        C1206d dVar = this.f3380X;
        if (dVar == null) {
            return false;
        }
        return dVar.f3426r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void mo3872T0() {
        onLowMemory();
        this.f3364H.mo4167y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final boolean mo3873U() {
        return this.f3361E > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U0 */
    public void mo3874U0(boolean z) {
        mo3940u0(z);
        this.f3364H.mo4168z(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public boolean mo3875V() {
        C1206d dVar = this.f3380X;
        if (dVar == null) {
            return false;
        }
        return dVar.f3424p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public boolean mo3876V0(MenuItem menuItem) {
        if (!this.f3369M) {
            return (this.f3373Q && this.f3374R && mo3943v0(menuItem)) || this.f3364H.mo4096A(menuItem);
        }
        return false;
    }

    /* renamed from: W */
    public final boolean mo3877W() {
        return this.f3404z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void mo3878W0(Menu menu) {
        if (!this.f3369M) {
            if (this.f3373Q && this.f3374R) {
                mo3946w0(menu);
            }
            this.f3364H.mo4098B(menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final boolean mo3879X() {
        Fragment C = mo3842C();
        return C != null && (C.mo3877W() || C.mo3879X());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X0 */
    public void mo3880X0() {
        this.f3364H.mo4101D();
        if (this.f3377U != null) {
            this.f3389g0.mo4304a(C1286d.C1287a.ON_PAUSE);
        }
        this.f3388f0.mo4342i(C1286d.C1287a.ON_PAUSE);
        this.f3393o = 3;
        this.f3375S = false;
        mo3948x0();
        if (!this.f3375S) {
            throw new C1274x("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* renamed from: Y */
    public final boolean mo3881Y() {
        return this.f3393o >= 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void mo3882Y0(boolean z) {
        mo3950y0(z);
        this.f3364H.mo4103E(z);
    }

    /* renamed from: Z */
    public final boolean mo3883Z() {
        C1231l lVar = this.f3362F;
        if (lVar == null) {
            return false;
        }
        return lVar.mo4164w0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public boolean mo3884Z0(Menu menu) {
        boolean z = false;
        if (this.f3369M) {
            return false;
        }
        if (this.f3373Q && this.f3374R) {
            z = true;
            mo3952z0(menu);
        }
        return z | this.f3364H.mo4105F(menu);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo3885a0() {
        this.f3364H.mo4104E0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a1 */
    public void mo3886a1() {
        boolean u0 = this.f3362F.mo4160u0(this);
        Boolean bool = this.f3402x;
        if (bool == null || bool.booleanValue() != u0) {
            this.f3402x = Boolean.valueOf(u0);
            mo3839A0(u0);
            this.f3364H.mo4107G();
        }
    }

    /* renamed from: b0 */
    public void mo3823b0(Bundle bundle) {
        this.f3375S = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b1 */
    public void mo3887b1() {
        this.f3364H.mo4104E0();
        this.f3364H.mo4119Q(true);
        this.f3393o = 4;
        this.f3375S = false;
        mo3843C0();
        if (this.f3375S) {
            C1292h hVar = this.f3388f0;
            C1286d.C1287a aVar = C1286d.C1287a.ON_RESUME;
            hVar.mo4342i(aVar);
            if (this.f3377U != null) {
                this.f3389g0.mo4304a(aVar);
            }
            this.f3364H.mo4109H();
            return;
        }
        throw new C1274x("Fragment " + this + " did not call through to super.onResume()");
    }

    /* renamed from: c0 */
    public void mo3888c0(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public void mo3889c1(Bundle bundle) {
        mo3818D0(bundle);
        this.f3391i0.mo5267d(bundle);
        Parcelable S0 = this.f3364H.mo4122S0();
        if (S0 != null) {
            bundle.putParcelable("android:support:fragments", S0);
        }
    }

    @Deprecated
    /* renamed from: d0 */
    public void mo3890d0(Activity activity) {
        this.f3375S = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public void mo3891d1() {
        this.f3364H.mo4104E0();
        this.f3364H.mo4119Q(true);
        this.f3393o = 3;
        this.f3375S = false;
        mo3820E0();
        if (this.f3375S) {
            C1292h hVar = this.f3388f0;
            C1286d.C1287a aVar = C1286d.C1287a.ON_START;
            hVar.mo4342i(aVar);
            if (this.f3377U != null) {
                this.f3389g0.mo4304a(aVar);
            }
            this.f3364H.mo4111I();
            return;
        }
        throw new C1274x("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3892e() {
        C1206d dVar = this.f3380X;
        C1208f fVar = null;
        if (dVar != null) {
            dVar.f3424p = false;
            C1208f fVar2 = dVar.f3425q;
            dVar.f3425q = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.mo3958b();
        }
    }

    /* renamed from: e0 */
    public void mo3824e0(Context context) {
        this.f3375S = true;
        C1227i<?> iVar = this.f3363G;
        Activity e = iVar == null ? null : iVar.mo4077e();
        if (e != null) {
            this.f3375S = false;
            mo3890d0(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e1 */
    public void mo3893e1() {
        this.f3364H.mo4113K();
        if (this.f3377U != null) {
            this.f3389g0.mo4304a(C1286d.C1287a.ON_STOP);
        }
        this.f3388f0.mo4342i(C1286d.C1287a.ON_STOP);
        this.f3393o = 2;
        this.f3375S = false;
        mo3821F0();
        if (!this.f3375S) {
            throw new C1274x("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public void mo3895f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f3366J));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f3367K));
        printWriter.print(" mTag=");
        printWriter.println(this.f3368L);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f3393o);
        printWriter.print(" mWho=");
        printWriter.print(this.f3397s);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f3361E);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f3403y);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f3404z);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f3357A);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f3358B);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f3369M);
        printWriter.print(" mDetached=");
        printWriter.print(this.f3370N);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f3374R);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f3373Q);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f3371O);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f3379W);
        if (this.f3362F != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f3362F);
        }
        if (this.f3363G != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f3363G);
        }
        if (this.f3365I != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f3365I);
        }
        if (this.f3398t != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f3398t);
        }
        if (this.f3394p != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f3394p);
        }
        if (this.f3395q != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f3395q);
        }
        Fragment M = mo3859M();
        if (M != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(M);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f3401w);
        }
        if (mo3838A() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(mo3838A());
        }
        if (this.f3376T != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f3376T);
        }
        if (this.f3377U != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f3377U);
        }
        if (mo3918o() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo3918o());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(mo3855K());
        }
        if (mo3930s() != null) {
            C2068a.m8878b(this).mo6948a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f3364H + ":");
        C1231l lVar = this.f3364H;
        lVar.mo4115M(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* renamed from: f0 */
    public void mo3896f0(Fragment fragment) {
    }

    /* renamed from: f1 */
    public final void mo3897f1(String[] strArr, int i) {
        C1227i<?> iVar = this.f3363G;
        if (iVar != null) {
            iVar.mo4020m(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: g */
    public C1311s mo129g() {
        C1231l lVar = this.f3362F;
        if (lVar != null) {
            return lVar.mo4150o0(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: g0 */
    public boolean mo3898g0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: g1 */
    public final C1214c mo3899g1() {
        C1214c l = mo3909l();
        if (l != null) {
            return l;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public C1286d getLifecycle() {
        return this.f3388f0;
    }

    /* renamed from: h0 */
    public void mo3825h0(Bundle bundle) {
        this.f3375S = true;
        mo3905j1(bundle);
        if (!this.f3364H.mo4162v0(1)) {
            this.f3364H.mo4159u();
        }
    }

    /* renamed from: h1 */
    public final Context mo3900h1() {
        Context s = mo3930s();
        if (s != null) {
            return s;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i0 */
    public Animation mo3902i0(int i, boolean z, int i2) {
        return null;
    }

    /* renamed from: i1 */
    public final View mo3903i1() {
        View N = mo3861N();
        if (N != null) {
            return N;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: j */
    public final SavedStateRegistry mo131j() {
        return this.f3391i0.mo5265b();
    }

    /* renamed from: j0 */
    public Animator mo3904j0(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public void mo3905j1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f3364H.mo4120Q0(parcelable);
            this.f3364H.mo4159u();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Fragment mo3906k(String str) {
        return str.equals(this.f3397s) ? this : this.f3364H.mo4132a0(str);
    }

    /* renamed from: k0 */
    public void mo3907k0(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k1 */
    public final void mo3908k1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f3395q;
        if (sparseArray != null) {
            this.f3377U.restoreHierarchyState(sparseArray);
            this.f3395q = null;
        }
        this.f3375S = false;
        mo3850H0(bundle);
        if (!this.f3375S) {
            throw new C1274x("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.f3377U != null) {
            this.f3389g0.mo4304a(C1286d.C1287a.ON_CREATE);
        }
    }

    /* renamed from: l */
    public final C1214c mo3909l() {
        C1227i<?> iVar = this.f3363G;
        if (iVar == null) {
            return null;
        }
        return (C1214c) iVar.mo4077e();
    }

    /* renamed from: l0 */
    public View mo3910l0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f3392j0;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l1 */
    public void mo3911l1(View view) {
        m4737h().f3409a = view;
    }

    /* renamed from: m */
    public boolean mo3912m() {
        Boolean bool;
        C1206d dVar = this.f3380X;
        if (dVar == null || (bool = dVar.f3421m) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: m0 */
    public void mo3913m0() {
        this.f3375S = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m1 */
    public void mo3914m1(Animator animator) {
        m4737h().f3410b = animator;
    }

    /* renamed from: n */
    public boolean mo3915n() {
        Boolean bool;
        C1206d dVar = this.f3380X;
        if (dVar == null || (bool = dVar.f3420l) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: n0 */
    public void mo3916n0() {
    }

    /* renamed from: n1 */
    public void mo3917n1(Bundle bundle) {
        if (this.f3362F == null || !mo3883Z()) {
            this.f3398t = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public View mo3918o() {
        C1206d dVar = this.f3380X;
        if (dVar == null) {
            return null;
        }
        return dVar.f3409a;
    }

    /* renamed from: o0 */
    public void mo3826o0() {
        this.f3375S = true;
    }

    /* renamed from: o1 */
    public void mo3919o1(boolean z) {
        if (this.f3373Q != z) {
            this.f3373Q = z;
            if (mo3867R() && !mo3869S()) {
                this.f3363G.mo4024q();
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f3375S = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        mo3899g1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f3375S = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public Animator mo3923p() {
        C1206d dVar = this.f3380X;
        if (dVar == null) {
            return null;
        }
        return dVar.f3410b;
    }

    /* renamed from: p0 */
    public void mo3829p0() {
        this.f3375S = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public void mo3924p1(boolean z) {
        m4737h().f3426r = z;
    }

    /* renamed from: q */
    public final Bundle mo3925q() {
        return this.f3398t;
    }

    /* renamed from: q0 */
    public LayoutInflater mo3830q0(Bundle bundle) {
        return mo3951z(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q1 */
    public void mo3926q1(int i) {
        if (this.f3380X != null || i != 0) {
            m4737h().f3412d = i;
        }
    }

    /* renamed from: r */
    public final C1231l mo3927r() {
        if (this.f3363G != null) {
            return this.f3364H;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: r0 */
    public void mo3928r0(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public void mo3929r1(int i) {
        if (this.f3380X != null || i != 0) {
            m4737h();
            this.f3380X.f3413e = i;
        }
    }

    /* renamed from: s */
    public Context mo3930s() {
        C1227i<?> iVar = this.f3363G;
        if (iVar == null) {
            return null;
        }
        return iVar.mo4078f();
    }

    @Deprecated
    /* renamed from: s0 */
    public void mo3931s0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f3375S = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s1 */
    public void mo3932s1(C1208f fVar) {
        m4737h();
        C1206d dVar = this.f3380X;
        C1208f fVar2 = dVar.f3425q;
        if (fVar != fVar2) {
            if (fVar == null || fVar2 == null) {
                if (dVar.f3424p) {
                    dVar.f3425q = fVar;
                }
                if (fVar != null) {
                    fVar.mo3957a();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        C1227i<?> iVar = this.f3363G;
        if (iVar != null) {
            return iVar.mo4022o(str);
        }
        return false;
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        mo3941u1(intent, i, (Bundle) null);
    }

    /* renamed from: t */
    public Object mo3935t() {
        C1206d dVar = this.f3380X;
        if (dVar == null) {
            return null;
        }
        return dVar.f3414f;
    }

    /* renamed from: t0 */
    public void mo3936t0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f3375S = true;
        C1227i<?> iVar = this.f3363G;
        Activity e = iVar == null ? null : iVar.mo4077e();
        if (e != null) {
            this.f3375S = false;
            mo3931s0(e, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t1 */
    public void mo3937t1(int i) {
        m4737h().f3411c = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f3397s);
        sb.append(")");
        if (this.f3366J != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3366J));
        }
        if (this.f3368L != null) {
            sb.append(" ");
            sb.append(this.f3368L);
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C1130o mo3939u() {
        C1206d dVar = this.f3380X;
        if (dVar == null) {
            return null;
        }
        return dVar.f3422n;
    }

    /* renamed from: u0 */
    public void mo3940u0(boolean z) {
    }

    /* renamed from: u1 */
    public void mo3941u1(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        C1227i<?> iVar = this.f3363G;
        if (iVar != null) {
            iVar.mo4023p(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* renamed from: v */
    public Object mo3942v() {
        C1206d dVar = this.f3380X;
        if (dVar == null) {
            return null;
        }
        return dVar.f3416h;
    }

    /* renamed from: v0 */
    public boolean mo3943v0(MenuItem menuItem) {
        return false;
    }

    /* renamed from: v1 */
    public void mo3944v1() {
        C1231l lVar = this.f3362F;
        if (lVar == null || lVar.f3522p == null) {
            m4737h().f3424p = false;
        } else if (Looper.myLooper() != this.f3362F.f3522p.mo4079h().getLooper()) {
            this.f3362F.f3522p.mo4079h().postAtFrontOfQueue(new C1204b());
        } else {
            mo3892e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C1130o mo3945w() {
        C1206d dVar = this.f3380X;
        if (dVar == null) {
            return null;
        }
        return dVar.f3423o;
    }

    /* renamed from: w0 */
    public void mo3946w0(Menu menu) {
    }

    /* renamed from: x */
    public final Object mo3947x() {
        C1227i<?> iVar = this.f3363G;
        if (iVar == null) {
            return null;
        }
        return iVar.mo4018k();
    }

    /* renamed from: x0 */
    public void mo3948x0() {
        this.f3375S = true;
    }

    /* renamed from: y */
    public final LayoutInflater mo3949y() {
        LayoutInflater layoutInflater = this.f3385c0;
        return layoutInflater == null ? mo3870S0((Bundle) null) : layoutInflater;
    }

    /* renamed from: y0 */
    public void mo3950y0(boolean z) {
    }

    @Deprecated
    /* renamed from: z */
    public LayoutInflater mo3951z(Bundle bundle) {
        C1227i<?> iVar = this.f3363G;
        if (iVar != null) {
            LayoutInflater l = iVar.mo4019l();
            C1944f.m8156b(l, this.f3364H.mo4144j0());
            return l;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: z0 */
    public void mo3952z0(Menu menu) {
    }
}
