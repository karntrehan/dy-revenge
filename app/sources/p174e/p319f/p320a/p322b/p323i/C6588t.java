package p174e.p319f.p320a.p322b.p323i;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3417u;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3419w;
import java.util.Collections;
import java.util.Set;
import p174e.p319f.p320a.p322b.C6463b;
import p174e.p319f.p320a.p322b.C6468g;
import p174e.p319f.p320a.p322b.C6469h;
import p174e.p319f.p320a.p322b.p323i.p324a0.C6475e;
import p174e.p319f.p320a.p322b.p323i.p327c0.C6552a;

/* renamed from: e.f.a.b.i.t */
public class C6588t implements C6587s {

    /* renamed from: a */
    private static volatile C6589u f18208a;

    /* renamed from: b */
    private final C6552a f18209b;

    /* renamed from: c */
    private final C6552a f18210c;

    /* renamed from: d */
    private final C6475e f18211d;

    /* renamed from: e */
    private final C3417u f18212e;

    C6588t(C6552a aVar, C6552a aVar2, C6475e eVar, C3417u uVar, C3419w wVar) {
        this.f18209b = aVar;
        this.f18210c = aVar2;
        this.f18211d = eVar;
        this.f18212e = uVar;
        wVar.mo11022a();
    }

    /* renamed from: b */
    private C6573j m25180b(C6581o oVar) {
        return C6573j.m25122a().mo19336i(this.f18209b.mo19339a()).mo19338k(this.f18210c.mo19339a()).mo19337j(oVar.mo19347g()).mo19335h(new C6572i(oVar.mo19342b(), oVar.mo19387d())).mo19334g(oVar.mo19343c().mo19233a()).mo19331d();
    }

    /* renamed from: c */
    public static C6588t m25181c() {
        C6589u uVar = f18208a;
        if (uVar != null) {
            return uVar.mo19366b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set<C6463b> m25182d(C6570g gVar) {
        return gVar instanceof C6571h ? Collections.unmodifiableSet(((C6571h) gVar).mo10840a()) : Collections.singleton(C6463b.m24863b("proto"));
    }

    /* renamed from: f */
    public static void m25183f(Context context) {
        if (f18208a == null) {
            synchronized (C6588t.class) {
                if (f18208a == null) {
                    f18208a = C6567f.m25111h().mo19367a(context).mo19368b();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19391a(C6581o oVar, C6469h hVar) {
        this.f18211d.mo19247a(oVar.mo19346f().mo19389f(oVar.mo19343c().mo19235c()), m25180b(oVar), hVar);
    }

    /* renamed from: e */
    public C3417u mo19392e() {
        return this.f18212e;
    }

    /* renamed from: g */
    public C6468g mo19393g(C6570g gVar) {
        return new C6585q(m25182d(gVar), C6583p.m25165a().mo19362b(gVar.getName()).mo19363c(gVar.mo10841b()).mo19361a(), this);
    }
}
