package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import p174e.p319f.p320a.p382e.p383a.p385b.C9103b;
import p174e.p319f.p320a.p382e.p383a.p385b.C9130o0;
import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: com.google.android.play.core.assetpacks.e */
final class C4371e extends C9103b {

    /* renamed from: o */
    final /* synthetic */ int f12421o;

    /* renamed from: p */
    final /* synthetic */ String f12422p;

    /* renamed from: q */
    final /* synthetic */ String f12423q;

    /* renamed from: r */
    final /* synthetic */ int f12424r;

    /* renamed from: s */
    final /* synthetic */ C9165m f12425s;

    /* renamed from: t */
    final /* synthetic */ C4411o f12426t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4371e(C4411o oVar, C9165m mVar, int i, String str, String str2, int i2, C9165m mVar2) {
        super(mVar);
        this.f12426t = oVar;
        this.f12421o = i;
        this.f12422p = str;
        this.f12423q = str2;
        this.f12424r = i2;
        this.f12425s = mVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13849a() {
        try {
            ((C9130o0) this.f12426t.f12597e.mo23101c()).mo23105I0(this.f12426t.f12595c, C4411o.m16902q(this.f12421o, this.f12422p, this.f12423q, this.f12424r), C4411o.m16895j(), new C4391j(this.f12426t, this.f12425s, (char[]) null));
        } catch (RemoteException e) {
            C4411o.f12593a.mo23082c(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
