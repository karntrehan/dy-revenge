package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.Map;
import p174e.p319f.p320a.p382e.p383a.p385b.C9103b;
import p174e.p319f.p320a.p382e.p383a.p385b.C9130o0;
import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: com.google.android.play.core.assetpacks.v2 */
final class C4442v2 extends C9103b {

    /* renamed from: o */
    final /* synthetic */ Map f12682o;

    /* renamed from: p */
    final /* synthetic */ C9165m f12683p;

    /* renamed from: q */
    final /* synthetic */ C4411o f12684q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4442v2(C4411o oVar, C9165m mVar, Map map, C9165m mVar2) {
        super(mVar);
        this.f12684q = oVar;
        this.f12682o = map;
        this.f12683p = mVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13849a() {
        try {
            ((C9130o0) this.f12684q.f12597e.mo23101c()).mo23104G0(this.f12684q.f12595c, C4411o.m16898m(this.f12682o), new C4399l(this.f12684q, this.f12683p));
        } catch (RemoteException e) {
            C4411o.f12593a.mo23082c(e, "syncPacks", new Object[0]);
            this.f12683p.mo23142d(new RuntimeException(e));
        }
    }
}
