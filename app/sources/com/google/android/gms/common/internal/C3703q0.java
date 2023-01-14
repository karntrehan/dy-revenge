package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C3490g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3701q;
import java.util.concurrent.TimeUnit;
import p174e.p319f.p320a.p335c.p362h.C8965m;

/* renamed from: com.google.android.gms.common.internal.q0 */
final class C3703q0 implements C3490g.C3491a {

    /* renamed from: a */
    final /* synthetic */ C3490g f10359a;

    /* renamed from: b */
    final /* synthetic */ C8965m f10360b;

    /* renamed from: c */
    final /* synthetic */ C3701q.C3702a f10361c;

    /* renamed from: d */
    final /* synthetic */ C3709s0 f10362d;

    C3703q0(C3490g gVar, C8965m mVar, C3701q.C3702a aVar, C3709s0 s0Var) {
        this.f10359a = gVar;
        this.f10360b = mVar;
        this.f10361c = aVar;
        this.f10362d = s0Var;
    }

    /* renamed from: a */
    public final void mo11236a(Status status) {
        if (status.mo11167E()) {
            this.f10360b.mo22784c(this.f10361c.mo11151a(this.f10359a.mo11235b(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f10360b.mo22783b(C3647b.m14152a(status));
    }
}
