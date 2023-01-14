package androidx.fragment.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1286d;
import androidx.lifecycle.C1312t;
import p027c.p086o.C2061b;

/* renamed from: androidx.fragment.app.q */
class C1249q {

    /* renamed from: a */
    private final C1229k f3573a;

    /* renamed from: b */
    private final Fragment f3574b;

    /* renamed from: c */
    private int f3575c = -1;

    /* renamed from: androidx.fragment.app.q$a */
    static /* synthetic */ class C1250a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3576a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.lifecycle.d$b[] r0 = androidx.lifecycle.C1286d.C1288b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3576a = r0
                androidx.lifecycle.d$b r1 = androidx.lifecycle.C1286d.C1288b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3576a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.d$b r1 = androidx.lifecycle.C1286d.C1288b.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3576a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.d$b r1 = androidx.lifecycle.C1286d.C1288b.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1249q.C1250a.<clinit>():void");
        }
    }

    C1249q(C1229k kVar, Fragment fragment) {
        this.f3573a = kVar;
        this.f3574b = fragment;
    }

    C1249q(C1229k kVar, Fragment fragment, C1247p pVar) {
        this.f3573a = kVar;
        this.f3574b = fragment;
        fragment.f3395q = null;
        fragment.f3361E = 0;
        fragment.f3358B = false;
        fragment.f3403y = false;
        Fragment fragment2 = fragment.f3399u;
        fragment.f3400v = fragment2 != null ? fragment2.f3397s : null;
        fragment.f3399u = null;
        Bundle bundle = pVar.f3572z;
        fragment.f3394p = bundle == null ? new Bundle() : bundle;
    }

    C1249q(C1229k kVar, ClassLoader classLoader, C1226h hVar, C1247p pVar) {
        this.f3573a = kVar;
        Fragment a = hVar.mo4076a(classLoader, pVar.f3560f);
        this.f3574b = a;
        Bundle bundle = pVar.f3569w;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.mo3917n1(pVar.f3569w);
        a.f3397s = pVar.f3561o;
        a.f3357A = pVar.f3562p;
        a.f3359C = true;
        a.f3366J = pVar.f3563q;
        a.f3367K = pVar.f3564r;
        a.f3368L = pVar.f3565s;
        a.f3371O = pVar.f3566t;
        a.f3404z = pVar.f3567u;
        a.f3370N = pVar.f3568v;
        a.f3369M = pVar.f3570x;
        a.f3387e0 = C1286d.C1288b.values()[pVar.f3571y];
        Bundle bundle2 = pVar.f3572z;
        a.f3394p = bundle2 == null ? new Bundle() : bundle2;
        if (C1231l.m5013s0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a);
        }
    }

    /* renamed from: n */
    private Bundle m5117n() {
        Bundle bundle = new Bundle();
        this.f3574b.mo3889c1(bundle);
        this.f3573a.mo4091j(this.f3574b, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3574b.f3377U != null) {
            mo4218p();
        }
        if (this.f3574b.f3395q != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3574b.f3395q);
        }
        if (!this.f3574b.f3379W) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3574b.f3379W);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4204a() {
        if (C1231l.m5013s0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3574b);
        }
        Fragment fragment = this.f3574b;
        fragment.mo3852I0(fragment.f3394p);
        C1229k kVar = this.f3573a;
        Fragment fragment2 = this.f3574b;
        kVar.mo4082a(fragment2, fragment2.f3394p, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4205b(C1227i<?> iVar, C1231l lVar, Fragment fragment) {
        Fragment fragment2 = this.f3574b;
        fragment2.f3363G = iVar;
        fragment2.f3365I = fragment;
        fragment2.f3362F = lVar;
        this.f3573a.mo4088g(fragment2, iVar.mo4078f(), false);
        this.f3574b.mo3854J0();
        Fragment fragment3 = this.f3574b;
        Fragment fragment4 = fragment3.f3365I;
        if (fragment4 == null) {
            iVar.mo4017i(fragment3);
        } else {
            fragment4.mo3896f0(fragment3);
        }
        this.f3573a.mo4083b(this.f3574b, iVar.mo4078f(), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo4206c() {
        int i = this.f3575c;
        Fragment fragment = this.f3574b;
        if (fragment.f3357A) {
            i = fragment.f3358B ? Math.max(i, 1) : i < 2 ? Math.min(i, fragment.f3393o) : Math.min(i, 1);
        }
        if (!this.f3574b.f3403y) {
            i = Math.min(i, 1);
        }
        Fragment fragment2 = this.f3574b;
        if (fragment2.f3404z) {
            i = fragment2.mo3873U() ? Math.min(i, 1) : Math.min(i, -1);
        }
        Fragment fragment3 = this.f3574b;
        if (fragment3.f3378V && fragment3.f3393o < 3) {
            i = Math.min(i, 2);
        }
        int i2 = C1250a.f3576a[this.f3574b.f3387e0.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? Math.min(i, -1) : Math.min(i, 1) : Math.min(i, 3) : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4207d() {
        if (C1231l.m5013s0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3574b);
        }
        Fragment fragment = this.f3574b;
        if (!fragment.f3386d0) {
            this.f3573a.mo4089h(fragment, fragment.f3394p, false);
            Fragment fragment2 = this.f3574b;
            fragment2.mo3860M0(fragment2.f3394p);
            C1229k kVar = this.f3573a;
            Fragment fragment3 = this.f3574b;
            kVar.mo4084c(fragment3, fragment3.f3394p, false);
            return;
        }
        fragment.mo3905j1(fragment.f3394p);
        this.f3574b.f3393o = 1;
    }

    /* JADX WARNING: type inference failed for: r5v15, types: [android.view.View] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4208e(androidx.fragment.app.C1223e r5) {
        /*
            r4 = this;
            androidx.fragment.app.Fragment r0 = r4.f3574b
            boolean r0 = r0.f3357A
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 3
            boolean r0 = androidx.fragment.app.C1231l.m5013s0(r0)
            if (r0 == 0) goto L_0x0026
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATE_VIEW: "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.f3574b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L_0x0026:
            r0 = 0
            androidx.fragment.app.Fragment r1 = r4.f3574b
            android.view.ViewGroup r2 = r1.f3376T
            if (r2 == 0) goto L_0x0030
            r0 = r2
            goto L_0x00a5
        L_0x0030:
            int r1 = r1.f3367K
            if (r1 == 0) goto L_0x00a5
            r0 = -1
            if (r1 == r0) goto L_0x0087
            android.view.View r5 = r5.mo3955c(r1)
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x00a5
            androidx.fragment.app.Fragment r5 = r4.f3574b
            boolean r1 = r5.f3359C
            if (r1 == 0) goto L_0x0047
            goto L_0x00a5
        L_0x0047:
            android.content.res.Resources r5 = r5.mo3846F()     // Catch:{ NotFoundException -> 0x0054 }
            androidx.fragment.app.Fragment r0 = r4.f3574b     // Catch:{ NotFoundException -> 0x0054 }
            int r0 = r0.f3367K     // Catch:{ NotFoundException -> 0x0054 }
            java.lang.String r5 = r5.getResourceName(r0)     // Catch:{ NotFoundException -> 0x0054 }
            goto L_0x0056
        L_0x0054:
            java.lang.String r5 = "unknown"
        L_0x0056:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No view found for id 0x"
            r1.append(r2)
            androidx.fragment.app.Fragment r2 = r4.f3574b
            int r2 = r2.f3367K
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ") for fragment "
            r1.append(r5)
            androidx.fragment.app.Fragment r5 = r4.f3574b
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x0087:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot create fragment "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.f3574b
            r0.append(r1)
            java.lang.String r1 = " for a container view with no id"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x00a5:
            androidx.fragment.app.Fragment r5 = r4.f3574b
            r5.f3376T = r0
            android.os.Bundle r1 = r5.f3394p
            android.view.LayoutInflater r1 = r5.mo3870S0(r1)
            androidx.fragment.app.Fragment r2 = r4.f3574b
            android.os.Bundle r2 = r2.f3394p
            r5.mo3863O0(r1, r0, r2)
            androidx.fragment.app.Fragment r5 = r4.f3574b
            android.view.View r5 = r5.f3377U
            if (r5 == 0) goto L_0x010d
            r1 = 0
            r5.setSaveFromParentEnabled(r1)
            androidx.fragment.app.Fragment r5 = r4.f3574b
            android.view.View r2 = r5.f3377U
            int r3 = p027c.p086o.C2061b.fragment_container_view_tag
            r2.setTag(r3, r5)
            if (r0 == 0) goto L_0x00d2
            androidx.fragment.app.Fragment r5 = r4.f3574b
            android.view.View r5 = r5.f3377U
            r0.addView(r5)
        L_0x00d2:
            androidx.fragment.app.Fragment r5 = r4.f3574b
            boolean r0 = r5.f3369M
            if (r0 == 0) goto L_0x00df
            android.view.View r5 = r5.f3377U
            r0 = 8
            r5.setVisibility(r0)
        L_0x00df:
            androidx.fragment.app.Fragment r5 = r4.f3574b
            android.view.View r5 = r5.f3377U
            p027c.p064i.p072j.C1988t.m8388j0(r5)
            androidx.fragment.app.Fragment r5 = r4.f3574b
            android.view.View r0 = r5.f3377U
            android.os.Bundle r2 = r5.f3394p
            r5.mo3848G0(r0, r2)
            androidx.fragment.app.k r5 = r4.f3573a
            androidx.fragment.app.Fragment r0 = r4.f3574b
            android.view.View r2 = r0.f3377U
            android.os.Bundle r3 = r0.f3394p
            r5.mo4094m(r0, r2, r3, r1)
            androidx.fragment.app.Fragment r5 = r4.f3574b
            android.view.View r0 = r5.f3377U
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x010b
            androidx.fragment.app.Fragment r0 = r4.f3574b
            android.view.ViewGroup r0 = r0.f3376T
            if (r0 == 0) goto L_0x010b
            r1 = 1
        L_0x010b:
            r5.f3382Z = r1
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1249q.mo4208e(androidx.fragment.app.e):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4209f(C1227i<?> iVar, C1245o oVar) {
        if (C1231l.m5013s0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3574b);
        }
        Fragment fragment = this.f3574b;
        boolean z = true;
        boolean z2 = fragment.f3404z && !fragment.mo3873U();
        if (z2 || oVar.mo4194n(this.f3574b)) {
            if (iVar instanceof C1312t) {
                z = oVar.mo4192l();
            } else if (iVar.mo4078f() instanceof Activity) {
                z = true ^ ((Activity) iVar.mo4078f()).isChangingConfigurations();
            }
            if (z2 || z) {
                oVar.mo4186f(this.f3574b);
            }
            this.f3574b.mo3865P0();
            this.f3573a.mo4085d(this.f3574b, false);
            return;
        }
        this.f3574b.f3393o = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4210g(C1245o oVar) {
        if (C1231l.m5013s0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3574b);
        }
        this.f3574b.mo3868R0();
        boolean z = false;
        this.f3573a.mo4086e(this.f3574b, false);
        Fragment fragment = this.f3574b;
        fragment.f3393o = -1;
        fragment.f3363G = null;
        fragment.f3365I = null;
        fragment.f3362F = null;
        if (fragment.f3404z && !fragment.mo3873U()) {
            z = true;
        }
        if (z || oVar.mo4194n(this.f3574b)) {
            if (C1231l.m5013s0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f3574b);
            }
            this.f3574b.mo3864P();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4211h() {
        Fragment fragment = this.f3574b;
        if (fragment.f3357A && fragment.f3358B && !fragment.f3360D) {
            if (C1231l.m5013s0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3574b);
            }
            Fragment fragment2 = this.f3574b;
            fragment2.mo3863O0(fragment2.mo3870S0(fragment2.f3394p), (ViewGroup) null, this.f3574b.f3394p);
            View view = this.f3574b.f3377U;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3574b;
                fragment3.f3377U.setTag(C2061b.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f3574b;
                if (fragment4.f3369M) {
                    fragment4.f3377U.setVisibility(8);
                }
                Fragment fragment5 = this.f3574b;
                fragment5.mo3848G0(fragment5.f3377U, fragment5.f3394p);
                C1229k kVar = this.f3573a;
                Fragment fragment6 = this.f3574b;
                kVar.mo4094m(fragment6, fragment6.f3377U, fragment6.f3394p, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment mo4212i() {
        return this.f3574b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4213j() {
        if (C1231l.m5013s0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3574b);
        }
        this.f3574b.mo3880X0();
        this.f3573a.mo4087f(this.f3574b, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4214k(ClassLoader classLoader) {
        Bundle bundle = this.f3574b.f3394p;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f3574b;
            fragment.f3395q = fragment.f3394p.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f3574b;
            fragment2.f3400v = fragment2.f3394p.getString("android:target_state");
            Fragment fragment3 = this.f3574b;
            if (fragment3.f3400v != null) {
                fragment3.f3401w = fragment3.f3394p.getInt("android:target_req_state", 0);
            }
            Fragment fragment4 = this.f3574b;
            Boolean bool = fragment4.f3396r;
            if (bool != null) {
                fragment4.f3379W = bool.booleanValue();
                this.f3574b.f3396r = null;
            } else {
                fragment4.f3379W = fragment4.f3394p.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment5 = this.f3574b;
            if (!fragment5.f3379W) {
                fragment5.f3378V = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo4215l() {
        if (C1231l.m5013s0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this.f3574b);
        }
        Fragment fragment = this.f3574b;
        if (fragment.f3377U != null) {
            fragment.mo3908k1(fragment.f3394p);
        }
        this.f3574b.f3394p = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo4216m() {
        if (C1231l.m5013s0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3574b);
        }
        this.f3574b.mo3887b1();
        this.f3573a.mo4090i(this.f3574b, false);
        Fragment fragment = this.f3574b;
        fragment.f3394p = null;
        fragment.f3395q = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C1247p mo4217o() {
        C1247p pVar = new C1247p(this.f3574b);
        Fragment fragment = this.f3574b;
        if (fragment.f3393o <= -1 || pVar.f3572z != null) {
            pVar.f3572z = fragment.f3394p;
        } else {
            Bundle n = m5117n();
            pVar.f3572z = n;
            if (this.f3574b.f3400v != null) {
                if (n == null) {
                    pVar.f3572z = new Bundle();
                }
                pVar.f3572z.putString("android:target_state", this.f3574b.f3400v);
                int i = this.f3574b.f3401w;
                if (i != 0) {
                    pVar.f3572z.putInt("android:target_req_state", i);
                }
            }
        }
        return pVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4218p() {
        if (this.f3574b.f3377U != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f3574b.f3377U.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f3574b.f3395q = sparseArray;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4219q(int i) {
        this.f3575c = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo4220r() {
        if (C1231l.m5013s0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3574b);
        }
        this.f3574b.mo3891d1();
        this.f3573a.mo4092k(this.f3574b, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4221s() {
        if (C1231l.m5013s0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3574b);
        }
        this.f3574b.mo3893e1();
        this.f3573a.mo4093l(this.f3574b, false);
    }
}
