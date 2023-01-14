package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p174e.p319f.p320a.p382e.p383a.p385b.C9103b;
import p174e.p319f.p320a.p382e.p383a.p385b.C9130o0;
import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: com.google.android.play.core.assetpacks.g */
final class C4379g extends C9103b {

    /* renamed from: o */
    final /* synthetic */ int f12444o;

    /* renamed from: p */
    final /* synthetic */ C9165m f12445p;

    /* renamed from: q */
    final /* synthetic */ C4411o f12446q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4379g(C4411o oVar, C9165m mVar, int i, C9165m mVar2) {
        super(mVar);
        this.f12446q = oVar;
        this.f12444o = i;
        this.f12445p = mVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13849a() {
        try {
            ((C9130o0) this.f12446q.f12597e.mo23101c()).mo23103C(this.f12446q.f12595c, C4411o.m16894i(this.f12444o), C4411o.m16895j(), new C4391j(this.f12446q, this.f12445p, (int[]) null));
        } catch (RemoteException e) {
            C4411o.f12593a.mo23082c(e, "notifySessionFailed", new Object[0]);
        }
    }
}
