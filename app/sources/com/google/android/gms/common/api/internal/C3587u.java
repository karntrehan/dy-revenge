package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3490g;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.u */
final class C3587u implements C3490g.C3491a {

    /* renamed from: a */
    final /* synthetic */ BasePendingResult f10106a;

    /* renamed from: b */
    final /* synthetic */ C3595w f10107b;

    C3587u(C3595w wVar, BasePendingResult basePendingResult) {
        this.f10107b = wVar;
        this.f10106a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo11236a(Status status) {
        this.f10107b.f10143a.remove(this.f10106a);
    }
}
