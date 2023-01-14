package p174e.p319f.p320a.p382e.p383a.p384a;

import android.os.Bundle;
import com.google.android.play.core.install.C4461a;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;
import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: e.f.a.e.a.a.q */
final class C9091q extends C9089o<C9074a> {

    /* renamed from: d */
    private final String f24950d;

    /* renamed from: e */
    final /* synthetic */ C9092r f24951e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9091q(C9092r rVar, C9165m<C9074a> mVar, String str) {
        super(rVar, new C9101a("OnRequestInstallCallback"), mVar);
        this.f24951e = rVar;
        this.f24950d = str;
    }

    /* renamed from: W */
    public final void mo23066W(Bundle bundle) {
        super.mo23066W(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f24948b.mo23142d(new C4461a(bundle.getInt("error.code", -2)));
        } else {
            this.f24948b.mo23143e(C9092r.m30289h(this.f24951e, bundle, this.f24950d));
        }
    }
}
