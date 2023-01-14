package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3651c;
import com.google.android.gms.common.internal.C3678j;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.k1 */
final class C3548k1 implements C3651c.C3654c, C3503b2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3469a.C3478f f10016a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3500b<?> f10017b;

    /* renamed from: c */
    private C3678j f10018c = null;

    /* renamed from: d */
    private Set<Scope> f10019d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f10020e = false;

    /* renamed from: f */
    final /* synthetic */ C3521f f10021f;

    public C3548k1(C3521f fVar, C3469a.C3478f fVar2, C3500b<?> bVar) {
        this.f10021f = fVar;
        this.f10016a = fVar2;
        this.f10017b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m13796h() {
        C3678j jVar;
        if (this.f10020e && (jVar = this.f10018c) != null) {
            this.f10016a.mo11188d(jVar, this.f10019d);
        }
    }

    /* renamed from: a */
    public final void mo11308a(C3623b bVar) {
        this.f10021f.f9946t.post(new C3544j1(this, bVar));
    }

    /* renamed from: b */
    public final void mo11266b(C3623b bVar) {
        C3528g1 g1Var = (C3528g1) this.f10021f.f9942p.get(this.f10017b);
        if (g1Var != null) {
            g1Var.mo11334I(bVar);
        }
    }

    /* renamed from: c */
    public final void mo11267c(C3678j jVar, Set<Scope> set) {
        if (jVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo11266b(new C3623b(4));
            return;
        }
        this.f10018c = jVar;
        this.f10019d = set;
        m13796h();
    }
}
