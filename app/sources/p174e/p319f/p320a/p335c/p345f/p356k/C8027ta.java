package p174e.p319f.p320a.p335c.p345f.p356k;

import android.content.Context;
import com.google.android.datatransport.cct.C3328c;
import com.google.firebase.components.C4523z;
import com.google.firebase.p162p.C4927b;
import p174e.p319f.p320a.p322b.C6463b;
import p174e.p319f.p320a.p322b.C6464c;
import p174e.p319f.p320a.p322b.C6467f;
import p174e.p319f.p320a.p322b.C6468g;
import p174e.p319f.p320a.p322b.p323i.C6588t;

/* renamed from: e.f.a.c.f.k.ta */
public final class C8027ta implements C7897ja {

    /* renamed from: a */
    private C4927b<C6467f<byte[]>> f21807a;

    /* renamed from: b */
    private final C4927b<C6467f<byte[]>> f21808b;

    /* renamed from: c */
    private final C7819da f21809c;

    public C8027ta(Context context, C7819da daVar) {
        this.f21809c = daVar;
        C3328c cVar = C3328c.f9407e;
        C6588t.m25183f(context);
        C6468g g = C6588t.m25181c().mo19393g(cVar);
        if (cVar.mo10840a().contains(C6463b.m24863b("json"))) {
            this.f21807a = new C4523z(new C8001ra(g));
        }
        this.f21808b = new C4523z(new C8014sa(g));
    }

    /* renamed from: b */
    static C6464c<byte[]> m28217b(C7819da daVar, C7962oa oaVar) {
        int a = daVar.mo21231a();
        int a2 = oaVar.mo21510a();
        byte[] c = oaVar.mo21512c(a, false);
        return a2 != 0 ? C6464c.m24865d(c) : C6464c.m24866e(c);
    }

    /* renamed from: a */
    public final void mo21320a(C7962oa oaVar) {
        C4927b<C6467f<byte[]>> bVar;
        if (this.f21809c.mo21231a() == 0) {
            bVar = this.f21807a;
            if (bVar == null) {
                return;
            }
        } else {
            bVar = this.f21808b;
        }
        bVar.get().mo19243a(m28217b(this.f21809c, oaVar));
    }
}
