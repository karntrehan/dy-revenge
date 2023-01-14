package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.C3486f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3659d;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.C3718v0;
import java.util.Set;
import p174e.p319f.p320a.p335c.p360g.C8921a;
import p174e.p319f.p320a.p335c.p360g.C8938f;
import p174e.p319f.p320a.p335c.p360g.C8939g;
import p174e.p319f.p320a.p335c.p360g.p361b.C8925d;
import p174e.p319f.p320a.p335c.p360g.p361b.C8933l;

/* renamed from: com.google.android.gms.common.api.internal.c2 */
public final class C3509c2 extends C8925d implements C3486f.C3488b, C3486f.C3489c {

    /* renamed from: a */
    private static final C3469a.C3470a<? extends C8939g, C8921a> f9908a = C8938f.f24340c;

    /* renamed from: b */
    private final Context f9909b;

    /* renamed from: c */
    private final Handler f9910c;

    /* renamed from: d */
    private final C3469a.C3470a<? extends C8939g, C8921a> f9911d;

    /* renamed from: e */
    private final Set<Scope> f9912e;

    /* renamed from: f */
    private final C3659d f9913f;

    /* renamed from: g */
    private C8939g f9914g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C3503b2 f9915h;

    public C3509c2(Context context, Handler handler, C3659d dVar) {
        C3469a.C3470a<? extends C8939g, C8921a> aVar = f9908a;
        this.f9909b = context;
        this.f9910c = handler;
        this.f9913f = (C3659d) C3705r.m14347l(dVar, "ClientSettings must not be null");
        this.f9912e = dVar.mo11574g();
        this.f9911d = aVar;
    }

    /* renamed from: R0 */
    static /* bridge */ /* synthetic */ void m13630R0(C3509c2 c2Var, C8933l lVar) {
        C3623b o = lVar.mo22745o();
        if (o.mo11458E()) {
            C3718v0 v0Var = (C3718v0) C3705r.m14346k(lVar.mo22746p());
            o = v0Var.mo11688o();
            if (!o.mo11458E()) {
                String valueOf = String.valueOf(o);
                valueOf.length();
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
            } else {
                c2Var.f9915h.mo11267c(v0Var.mo11689p(), c2Var.f9912e);
                c2Var.f9914g.mo11193i();
            }
        }
        c2Var.f9915h.mo11266b(o);
        c2Var.f9914g.mo11193i();
    }

    /* renamed from: G */
    public final void mo11291G(C8933l lVar) {
        this.f9910c.post(new C3498a2(this, lVar));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, e.f.a.c.g.g] */
    /* renamed from: S0 */
    public final void mo11292S0(C3503b2 b2Var) {
        C8939g gVar = this.f9914g;
        if (gVar != null) {
            gVar.mo11193i();
        }
        this.f9913f.mo11579l(Integer.valueOf(System.identityHashCode(this)));
        C3469a.C3470a aVar = this.f9911d;
        Context context = this.f9909b;
        Looper looper = this.f9910c.getLooper();
        C3659d dVar = this.f9913f;
        this.f9914g = aVar.mo11180c(context, looper, dVar, dVar.mo11575h(), this, this);
        this.f9915h = b2Var;
        Set<Scope> set = this.f9912e;
        if (set == null || set.isEmpty()) {
            this.f9910c.post(new C3609z1(this));
        } else {
            this.f9914g.mo22732u();
        }
    }

    /* renamed from: T0 */
    public final void mo11293T0() {
        C8939g gVar = this.f9914g;
        if (gVar != null) {
            gVar.mo11193i();
        }
    }

    /* renamed from: j */
    public final void mo11294j(int i) {
        this.f9914g.mo11193i();
    }

    /* renamed from: k */
    public final void mo11295k(C3623b bVar) {
        this.f9915h.mo11266b(bVar);
    }

    /* renamed from: m */
    public final void mo11296m(Bundle bundle) {
        this.f9914g.mo22729m(this);
    }
}
