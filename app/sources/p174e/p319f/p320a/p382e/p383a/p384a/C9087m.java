package p174e.p319f.p320a.p382e.p383a.p384a;

import android.os.RemoteException;
import p174e.p319f.p320a.p382e.p383a.p385b.C9103b;
import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: e.f.a.e.a.a.m */
final class C9087m extends C9103b {

    /* renamed from: o */
    final /* synthetic */ String f24941o;

    /* renamed from: p */
    final /* synthetic */ C9165m f24942p;

    /* renamed from: q */
    final /* synthetic */ C9092r f24943q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9087m(C9092r rVar, C9165m mVar, String str, C9165m mVar2) {
        super(mVar);
        this.f24943q = rVar;
        this.f24941o = str;
        this.f24942p = mVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13849a() {
        try {
            this.f24943q.f24954c.mo23101c().mo23095I(this.f24943q.f24955d, C9092r.m30285d(this.f24943q, this.f24941o), new C9091q(this.f24943q, this.f24942p, this.f24941o));
        } catch (RemoteException e) {
            C9092r.f24952a.mo23082c(e, "requestUpdateInfo(%s)", this.f24941o);
            this.f24942p.mo23142d(new RuntimeException(e));
        }
    }
}
