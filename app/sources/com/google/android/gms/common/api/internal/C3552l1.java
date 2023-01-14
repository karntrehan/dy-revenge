package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C3469a;
import com.google.android.gms.common.api.C3469a.C3473d;
import com.google.android.gms.common.api.C3483e;
import com.google.android.gms.common.api.C3612k;

/* renamed from: com.google.android.gms.common.api.internal.l1 */
public final class C3552l1<O extends C3469a.C3473d> extends C3607z {

    /* renamed from: c */
    private final C3483e<O> f10025c;

    public C3552l1(C3483e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f10025c = eVar;
    }

    /* renamed from: g */
    public final <A extends C3469a.C3471b, T extends C3511d<? extends C3612k, A>> T mo11219g(T t) {
        return this.f10025c.mo11205e(t);
    }

    /* renamed from: j */
    public final Context mo11221j() {
        return this.f10025c.mo11208h();
    }

    /* renamed from: k */
    public final Looper mo11222k() {
        return this.f10025c.mo11210j();
    }

    /* renamed from: p */
    public final void mo11227p(C3540i2 i2Var) {
    }
}
