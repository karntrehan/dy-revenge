package p174e.p319f.p320a.p335c.p345f.p358m;

import android.content.Context;
import com.google.android.datatransport.cct.C3328c;
import com.google.firebase.components.C4523z;
import com.google.firebase.p162p.C4927b;
import p174e.p319f.p320a.p322b.C6463b;
import p174e.p319f.p320a.p322b.C6464c;
import p174e.p319f.p320a.p322b.C6467f;
import p174e.p319f.p320a.p322b.C6468g;
import p174e.p319f.p320a.p322b.p323i.C6588t;

/* renamed from: e.f.a.c.f.m.pa */
public final class C8792pa implements C8662fa {

    /* renamed from: a */
    private C4927b<C6467f<byte[]>> f24010a;

    /* renamed from: b */
    private final C4927b<C6467f<byte[]>> f24011b;

    /* renamed from: c */
    private final C8597aa f24012c;

    public C8792pa(Context context, C8597aa aaVar) {
        this.f24012c = aaVar;
        C3328c cVar = C3328c.f9407e;
        C6588t.m25183f(context);
        C6468g g = C6588t.m25181c().mo19393g(cVar);
        if (cVar.mo10840a().contains(C6463b.m24863b("json"))) {
            this.f24010a = new C4523z(new C8766na(g));
        }
        this.f24011b = new C4523z(new C8779oa(g));
    }

    /* renamed from: b */
    static C6464c<byte[]> m29612b(C8597aa aaVar, C8714ja jaVar) {
        int a = aaVar.mo22309a();
        int a2 = jaVar.mo22495a();
        byte[] c = jaVar.mo22497c(a, false);
        return a2 != 0 ? C6464c.m24865d(c) : C6464c.m24866e(c);
    }

    /* renamed from: a */
    public final void mo22318a(C8714ja jaVar) {
        C4927b<C6467f<byte[]>> bVar;
        if (this.f24012c.mo22309a() == 0) {
            bVar = this.f24010a;
            if (bVar == null) {
                return;
            }
        } else {
            bVar = this.f24011b;
        }
        bVar.get().mo19243a(m29612b(this.f24012c, jaVar));
    }
}
