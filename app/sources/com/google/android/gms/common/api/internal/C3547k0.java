package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
import p174e.p319f.p320a.p335c.p360g.p361b.C8925d;
import p174e.p319f.p320a.p335c.p360g.p361b.C8933l;

/* renamed from: com.google.android.gms.common.api.internal.k0 */
final class C3547k0 extends C8925d {

    /* renamed from: a */
    private final WeakReference<C3567p0> f10015a;

    C3547k0(C3567p0 p0Var) {
        this.f10015a = new WeakReference<>(p0Var);
    }

    /* renamed from: G */
    public final void mo11291G(C8933l lVar) {
        C3567p0 p0Var = (C3567p0) this.f10015a.get();
        if (p0Var != null) {
            p0Var.f10036a.mo11443p(new C3543j0(this, p0Var, p0Var, lVar));
        }
    }
}
