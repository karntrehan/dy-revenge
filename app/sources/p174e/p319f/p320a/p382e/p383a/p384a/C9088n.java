package p174e.p319f.p320a.p382e.p383a.p384a;

import android.os.RemoteException;
import p174e.p319f.p320a.p382e.p383a.p385b.C9103b;
import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: e.f.a.e.a.a.n */
final class C9088n extends C9103b {

    /* renamed from: o */
    final /* synthetic */ C9165m f24944o;

    /* renamed from: p */
    final /* synthetic */ String f24945p;

    /* renamed from: q */
    final /* synthetic */ C9092r f24946q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9088n(C9092r rVar, C9165m mVar, C9165m mVar2, String str) {
        super(mVar);
        this.f24946q = rVar;
        this.f24944o = mVar2;
        this.f24945p = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13849a() {
        try {
            this.f24946q.f24954c.mo23101c().mo23096v(this.f24946q.f24955d, C9092r.m30291j(), new C9090p(this.f24946q, this.f24944o));
        } catch (RemoteException e) {
            C9092r.f24952a.mo23082c(e, "completeUpdate(%s)", this.f24945p);
            this.f24944o.mo23142d(new RuntimeException(e));
        }
    }
}
