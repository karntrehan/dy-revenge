package p174e.p319f.p320a.p382e.p383a.p384a;

import android.os.Bundle;
import com.google.android.play.core.install.C4461a;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;
import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: e.f.a.e.a.a.p */
final class C9090p extends C9089o<Void> {
    C9090p(C9092r rVar, C9165m<Void> mVar) {
        super(rVar, new C9101a("OnCompleteUpdateCallback"), mVar);
    }

    /* renamed from: P */
    public final void mo23065P(Bundle bundle) {
        super.mo23065P(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f24948b.mo23142d(new C4461a(bundle.getInt("error.code", -2)));
        } else {
            this.f24948b.mo23143e(null);
        }
    }
}
