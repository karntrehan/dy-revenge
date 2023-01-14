package p174e.p319f.p320a.p335c.p345f.p357l;

import android.content.Context;
import com.google.android.datatransport.cct.C3328c;
import com.google.firebase.components.C4523z;
import com.google.firebase.p162p.C4927b;
import p174e.p319f.p320a.p322b.C6463b;
import p174e.p319f.p320a.p322b.C6464c;
import p174e.p319f.p320a.p322b.C6467f;
import p174e.p319f.p320a.p322b.C6468g;
import p174e.p319f.p320a.p322b.p323i.C6588t;

/* renamed from: e.f.a.c.f.l.ta */
public final class C8471ta implements C8289ja {

    /* renamed from: a */
    private C4927b<C6467f<byte[]>> f23091a;

    /* renamed from: b */
    private final C4927b<C6467f<byte[]>> f23092b;

    /* renamed from: c */
    private final C8194ea f23093c;

    public C8471ta(Context context, C8194ea eaVar) {
        this.f23093c = eaVar;
        C3328c cVar = C3328c.f9407e;
        C6588t.m25183f(context);
        C6468g g = C6588t.m25181c().mo19393g(cVar);
        if (cVar.mo10840a().contains(C6463b.m24863b("json"))) {
            this.f23091a = new C4523z(new C8435ra(g));
        }
        this.f23092b = new C4523z(new C8453sa(g));
    }

    /* renamed from: b */
    static C6464c<byte[]> m29053b(C8194ea eaVar, C8381oa oaVar) {
        return C6464c.m24866e(oaVar.mo22049b(eaVar.mo21704a(), false));
    }

    /* renamed from: a */
    public final void mo21786a(C8381oa oaVar) {
        C4927b<C6467f<byte[]>> bVar;
        if (this.f23093c.mo21704a() == 0) {
            bVar = this.f23091a;
            if (bVar == null) {
                return;
            }
        } else {
            bVar = this.f23092b;
        }
        bVar.get().mo19243a(m29053b(this.f23093c, oaVar));
    }
}
