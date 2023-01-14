package p174e.p319f.p320a.p335c.p345f.p354i;

import android.content.Context;
import com.google.android.datatransport.cct.C3328c;
import com.google.firebase.components.C4523z;
import com.google.firebase.p162p.C4927b;
import p174e.p319f.p320a.p322b.C6463b;
import p174e.p319f.p320a.p322b.C6464c;
import p174e.p319f.p320a.p322b.C6467f;
import p174e.p319f.p320a.p322b.C6468g;
import p174e.p319f.p320a.p322b.p323i.C6588t;

/* renamed from: e.f.a.c.f.i.hb */
public final class C7269hb implements C7507ya {

    /* renamed from: a */
    private C4927b<C6467f<byte[]>> f19376a;

    /* renamed from: b */
    private final C4927b<C6467f<byte[]>> f19377b;

    /* renamed from: c */
    private final C7423sa f19378c;

    public C7269hb(Context context, C7423sa saVar) {
        this.f19378c = saVar;
        C3328c cVar = C3328c.f9407e;
        C6588t.m25183f(context);
        C6468g g = C6588t.m25181c().mo19393g(cVar);
        if (cVar.mo10840a().contains(C6463b.m24863b("json"))) {
            this.f19376a = new C4523z(new C7239fb(g));
        }
        this.f19377b = new C4523z(new C7254gb(g));
    }

    /* renamed from: b */
    static C6464c<byte[]> m27309b(C7423sa saVar, C7194cb cbVar) {
        int a = saVar.mo20864a();
        int a2 = cbVar.mo20608a();
        byte[] c = cbVar.mo20610c(a, false);
        return a2 != 0 ? C6464c.m24865d(c) : C6464c.m24866e(c);
    }

    /* renamed from: a */
    public final void mo20753a(C7194cb cbVar) {
        C4927b<C6467f<byte[]>> bVar;
        if (this.f19378c.mo20864a() == 0) {
            bVar = this.f19376a;
            if (bVar == null) {
                return;
            }
        } else {
            bVar = this.f19377b;
        }
        bVar.get().mo19243a(m27309b(this.f19378c, cbVar));
    }
}
