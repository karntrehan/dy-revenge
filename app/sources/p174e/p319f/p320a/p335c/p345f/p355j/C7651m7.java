package p174e.p319f.p320a.p335c.p345f.p355j;

import android.content.Context;
import com.google.android.datatransport.cct.C3328c;
import com.google.firebase.components.C4523z;
import com.google.firebase.p162p.C4927b;
import p174e.p319f.p320a.p322b.C6463b;
import p174e.p319f.p320a.p322b.C6464c;
import p174e.p319f.p320a.p322b.C6467f;
import p174e.p319f.p320a.p322b.C6468g;
import p174e.p319f.p320a.p322b.p323i.C6588t;

/* renamed from: e.f.a.c.f.j.m7 */
public final class C7651m7 implements C7572e7 {

    /* renamed from: a */
    private C4927b<C6467f<byte[]>> f20609a;

    /* renamed from: b */
    private final C4927b<C6467f<byte[]>> f20610b;

    /* renamed from: c */
    private final C7767z6 f20611c;

    public C7651m7(Context context, C7767z6 z6Var) {
        this.f20611c = z6Var;
        C3328c cVar = C3328c.f9407e;
        C6588t.m25183f(context);
        C6468g g = C6588t.m25181c().mo19393g(cVar);
        if (cVar.mo10840a().contains(C6463b.m24863b("json"))) {
            this.f20609a = new C4523z(new C7632k7(g));
        }
        this.f20610b = new C4523z(new C7642l7(g));
    }

    /* renamed from: b */
    static C6464c<byte[]> m27699b(C7767z6 z6Var, C7592g7 g7Var) {
        return C6464c.m24866e(g7Var.mo21091b(z6Var.mo21189a(), false));
    }

    /* renamed from: a */
    public final void mo21043a(C7592g7 g7Var) {
        C4927b<C6467f<byte[]>> bVar;
        if (this.f20611c.mo21189a() == 0) {
            bVar = this.f20609a;
            if (bVar == null) {
                return;
            }
        } else {
            bVar = this.f20610b;
        }
        bVar.get().mo19243a(m27699b(this.f20611c, g7Var));
    }
}
