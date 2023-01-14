package p174e.p319f.p320a.p335c.p345f.p353h;

import android.content.Context;
import com.google.android.datatransport.cct.C3328c;
import com.google.firebase.components.C4523z;
import com.google.firebase.p162p.C4927b;
import p174e.p319f.p320a.p322b.C6463b;
import p174e.p319f.p320a.p322b.C6467f;
import p174e.p319f.p320a.p322b.C6468g;
import p174e.p319f.p320a.p322b.p323i.C6588t;

/* renamed from: e.f.a.c.f.h.b0 */
public final class C7117b0 implements C7147v {

    /* renamed from: a */
    private C4927b<C6467f<byte[]>> f19090a;

    /* renamed from: b */
    private final C4927b<C6467f<byte[]>> f19091b;

    /* renamed from: c */
    private final C7143r f19092c;

    public C7117b0(Context context, C7143r rVar) {
        this.f19092c = rVar;
        C3328c cVar = C3328c.f9407e;
        C6588t.m25183f(context);
        C6468g g = C6588t.m25181c().mo19393g(cVar);
        if (cVar.mo10840a().contains(C6463b.m24863b("json"))) {
            this.f19090a = new C4523z(new C7151z(g));
        }
        this.f19091b = new C4523z(new C7115a0(g));
    }
}
