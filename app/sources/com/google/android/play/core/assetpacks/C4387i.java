package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p174e.p319f.p320a.p382e.p383a.p385b.C9103b;
import p174e.p319f.p320a.p382e.p383a.p385b.C9130o0;
import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: com.google.android.play.core.assetpacks.i */
final class C4387i extends C9103b {

    /* renamed from: o */
    final /* synthetic */ C9165m f12496o;

    /* renamed from: p */
    final /* synthetic */ C4411o f12497p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4387i(C4411o oVar, C9165m mVar, C9165m mVar2) {
        super(mVar);
        this.f12497p = oVar;
        this.f12496o = mVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13849a() {
        try {
            ((C9130o0) this.f12497p.f12598f.mo23101c()).mo23106Q(this.f12497p.f12595c, C4411o.m16895j(), new C4403m(this.f12497p, this.f12496o));
        } catch (RemoteException e) {
            C4411o.f12593a.mo23082c(e, "keepAlive", new Object[0]);
        }
    }
}
