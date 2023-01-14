package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p174e.p319f.p320a.p382e.p383a.p385b.C9103b;
import p174e.p319f.p320a.p382e.p383a.p385b.C9130o0;
import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: com.google.android.play.core.assetpacks.f */
final class C4375f extends C9103b {

    /* renamed from: o */
    final /* synthetic */ int f12434o;

    /* renamed from: p */
    final /* synthetic */ String f12435p;

    /* renamed from: q */
    final /* synthetic */ C9165m f12436q;

    /* renamed from: r */
    final /* synthetic */ int f12437r;

    /* renamed from: s */
    final /* synthetic */ C4411o f12438s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4375f(C4411o oVar, C9165m mVar, int i, String str, C9165m mVar2, int i2) {
        super(mVar);
        this.f12438s = oVar;
        this.f12434o = i;
        this.f12435p = str;
        this.f12436q = mVar2;
        this.f12437r = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13849a() {
        try {
            ((C9130o0) this.f12438s.f12597e.mo23101c()).mo23108r(this.f12438s.f12595c, C4411o.m16893h(this.f12434o, this.f12435p), C4411o.m16895j(), new C4407n(this.f12438s, this.f12436q, this.f12434o, this.f12435p, this.f12437r));
        } catch (RemoteException e) {
            C4411o.f12593a.mo23082c(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
