package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3705r;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.ha */
final class C3908ha implements Callable {

    /* renamed from: a */
    final /* synthetic */ C3844cb f10768a;

    /* renamed from: b */
    final /* synthetic */ C4009pa f10769b;

    C3908ha(C4009pa paVar, C3844cb cbVar) {
        this.f10769b = paVar;
        this.f10768a = cbVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C3923j V = this.f10769b.mo12276V((String) C3705r.m14346k(this.f10768a.f10593f));
        C3910i iVar = C3910i.ANALYTICS_STORAGE;
        if (V.mo12123i(iVar) && C3923j.m14935b(this.f10768a.f10590I).mo12123i(iVar)) {
            return this.f10769b.mo12273S(this.f10768a).mo12071e0();
        }
        this.f10769b.mo11935b().mo12548v().mo12476a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
