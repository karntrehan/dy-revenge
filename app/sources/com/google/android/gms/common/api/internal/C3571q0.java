package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.C3612k;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.q0 */
public final class C3571q0 implements C3592v0 {

    /* renamed from: a */
    private final C3604y0 f10061a;

    public C3571q0(C3604y0 y0Var) {
        this.f10061a = y0Var;
    }

    /* renamed from: a */
    public final void mo11282a(Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo11283b() {
        this.f10061a.mo11441n();
    }

    /* renamed from: c */
    public final void mo11284c(C3623b bVar, C3469a<?> aVar, boolean z) {
    }

    /* renamed from: d */
    public final void mo11285d(int i) {
    }

    /* renamed from: e */
    public final void mo11286e() {
        for (C3469a.C3478f i : this.f10061a.f10161f.values()) {
            i.mo11193i();
        }
        this.f10061a.f10169n.f10122p = Collections.emptySet();
    }

    /* renamed from: f */
    public final boolean mo11287f() {
        return true;
    }

    /* renamed from: g */
    public final <A extends C3469a.C3471b, T extends C3511d<? extends C3612k, A>> T mo11288g(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
