package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import java.util.List;
import p174e.p319f.p320a.p382e.p383a.p385b.C9103b;
import p174e.p319f.p320a.p382e.p383a.p385b.C9130o0;
import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: com.google.android.play.core.assetpacks.u2 */
final class C4438u2 extends C9103b {

    /* renamed from: o */
    final /* synthetic */ List f12665o;

    /* renamed from: p */
    final /* synthetic */ C9165m f12666p;

    /* renamed from: q */
    final /* synthetic */ C4411o f12667q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4438u2(C4411o oVar, C9165m mVar, List list, C9165m mVar2) {
        super(mVar);
        this.f12667q = oVar;
        this.f12665o = list;
        this.f12666p = mVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13849a() {
        try {
            ((C9130o0) this.f12667q.f12597e.mo23101c()).mo23109s(this.f12667q.f12595c, C4411o.m16896k(this.f12665o), C4411o.m16895j(), new C4391j(this.f12667q, this.f12666p, (byte[]) null));
        } catch (RemoteException e) {
            C4411o.f12593a.mo23082c(e, "cancelDownloads(%s)", this.f12665o);
        }
    }
}
