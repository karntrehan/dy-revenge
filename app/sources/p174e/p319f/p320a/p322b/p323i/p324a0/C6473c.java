package p174e.p319f.p320a.p322b.p323i.p324a0;

import com.google.android.datatransport.runtime.backends.C3379e;
import com.google.android.datatransport.runtime.backends.C3390m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C3421y;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p174e.p319f.p320a.p322b.C6469h;
import p174e.p319f.p320a.p322b.p323i.C6573j;
import p174e.p319f.p320a.p322b.p323i.C6583p;
import p174e.p319f.p320a.p322b.p323i.C6588t;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6501j0;
import p174e.p319f.p320a.p322b.p323i.p326b0.C6547b;

/* renamed from: e.f.a.b.i.a0.c */
public class C6473c implements C6475e {

    /* renamed from: a */
    private static final Logger f18017a = Logger.getLogger(C6588t.class.getName());

    /* renamed from: b */
    private final C3421y f18018b;

    /* renamed from: c */
    private final Executor f18019c;

    /* renamed from: d */
    private final C3379e f18020d;

    /* renamed from: e */
    private final C6501j0 f18021e;

    /* renamed from: f */
    private final C6547b f18022f;

    public C6473c(Executor executor, C3379e eVar, C3421y yVar, C6501j0 j0Var, C6547b bVar) {
        this.f18019c = executor;
        this.f18020d = eVar;
        this.f18018b = yVar;
        this.f18021e = j0Var;
        this.f18022f = bVar;
    }

    /* renamed from: b */
    private /* synthetic */ Object m24876b(C6583p pVar, C6573j jVar) {
        this.f18021e.mo19279c0(pVar, jVar);
        this.f18018b.mo10984a(pVar, 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void mo19249e(C6583p pVar, C6469h hVar, C6573j jVar) {
        try {
            C3390m mVar = this.f18020d.get(pVar.mo19356b());
            if (mVar == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{pVar.mo19356b()});
                f18017a.warning(format);
                hVar.mo14686a(new IllegalArgumentException(format));
                return;
            }
            this.f18022f.mo19302b(new C6472b(this, pVar, mVar.mo10847b(jVar)));
            hVar.mo14686a((Exception) null);
        } catch (Exception e) {
            Logger logger = f18017a;
            logger.warning("Error scheduling event " + e.getMessage());
            hVar.mo14686a(e);
        }
    }

    /* renamed from: a */
    public void mo19247a(C6583p pVar, C6573j jVar, C6469h hVar) {
        this.f18019c.execute(new C6471a(this, pVar, hVar, jVar));
    }

    /* renamed from: c */
    public /* synthetic */ Object mo19248c(C6583p pVar, C6573j jVar) {
        m24876b(pVar, jVar);
        return null;
    }
}
