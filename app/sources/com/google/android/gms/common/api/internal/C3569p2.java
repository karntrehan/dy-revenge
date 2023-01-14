package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.api.C3486f;

/* renamed from: com.google.android.gms.common.api.internal.p2 */
final class C3569p2 implements C3486f.C3489c {

    /* renamed from: a */
    public final int f10057a;

    /* renamed from: b */
    public final C3486f f10058b;

    /* renamed from: c */
    public final C3486f.C3489c f10059c;

    /* renamed from: d */
    final /* synthetic */ C3573q2 f10060d;

    public C3569p2(C3573q2 q2Var, int i, C3486f fVar, C3486f.C3489c cVar) {
        this.f10060d = q2Var;
        this.f10057a = i;
        this.f10058b = fVar;
        this.f10059c = cVar;
    }

    /* renamed from: k */
    public final void mo11295k(C3623b bVar) {
        String valueOf = String.valueOf(bVar);
        valueOf.length();
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(valueOf));
        this.f10060d.mo11428s(bVar, this.f10057a);
    }
}
