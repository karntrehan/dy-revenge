package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.C3486f;
import com.google.android.gms.common.internal.C3705r;

/* renamed from: com.google.android.gms.common.api.internal.z2 */
public final class C3610z2 implements C3486f.C3488b, C3486f.C3489c {

    /* renamed from: a */
    public final C3469a<?> f10176a;

    /* renamed from: b */
    private final boolean f10177b;

    /* renamed from: c */
    private C3499a3 f10178c;

    public C3610z2(C3469a<?> aVar, boolean z) {
        this.f10176a = aVar;
        this.f10177b = z;
    }

    /* renamed from: b */
    private final C3499a3 m14048b() {
        C3705r.m14347l(this.f10178c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f10178c;
    }

    /* renamed from: a */
    public final void mo11447a(C3499a3 a3Var) {
        this.f10178c = a3Var;
    }

    /* renamed from: j */
    public final void mo11294j(int i) {
        m14048b().mo11294j(i);
    }

    /* renamed from: k */
    public final void mo11295k(C3623b bVar) {
        m14048b().mo11261Y(bVar, this.f10176a, this.f10177b);
    }

    /* renamed from: m */
    public final void mo11296m(Bundle bundle) {
        m14048b().mo11296m(bundle);
    }
}
