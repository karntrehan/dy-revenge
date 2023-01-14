package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.api.C3486f;
import com.google.android.gms.common.internal.C3659d;
import com.google.android.gms.common.internal.C3705r;
import p174e.p319f.p320a.p335c.p360g.C8939g;

/* renamed from: com.google.android.gms.common.api.internal.m0 */
final class C3555m0 implements C3486f.C3488b, C3486f.C3489c {

    /* renamed from: a */
    final /* synthetic */ C3567p0 f10027a;

    /* synthetic */ C3555m0(C3567p0 p0Var, C3551l0 l0Var) {
        this.f10027a = p0Var;
    }

    /* renamed from: j */
    public final void mo11294j(int i) {
    }

    /* renamed from: k */
    public final void mo11295k(C3623b bVar) {
        this.f10027a.f10037b.lock();
        try {
            if (this.f10027a.m13856p(bVar)) {
                this.f10027a.m13848h();
                this.f10027a.m13853m();
            } else {
                this.f10027a.m13851k(bVar);
            }
        } finally {
            this.f10027a.f10037b.unlock();
        }
    }

    /* renamed from: m */
    public final void mo11296m(Bundle bundle) {
        C3659d dVar = (C3659d) C3705r.m14346k(this.f10027a.f10053r);
        ((C8939g) C3705r.m14346k(this.f10027a.f10046k)).mo22729m(new C3547k0(this.f10027a));
    }
}
