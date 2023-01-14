package p477h.p478a.p479a.p491h;

import java.util.concurrent.ExecutorService;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p490g.C10558a;

/* renamed from: h.a.a.h.i */
public abstract class C10572i<T> {

    /* renamed from: a */
    private C10558a f28003a;

    /* renamed from: b */
    private boolean f28004b;

    /* renamed from: c */
    private ExecutorService f28005c;

    /* renamed from: h.a.a.h.i$a */
    public static class C10573a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C10558a f28006a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f28007b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public ExecutorService f28008c;

        public C10573a(ExecutorService executorService, boolean z, C10558a aVar) {
            this.f28008c = executorService;
            this.f28007b = z;
            this.f28006a = aVar;
        }
    }

    public C10572i(C10573a aVar) {
        this.f28003a = aVar.f28006a;
        this.f28004b = aVar.f28007b;
        this.f28005c = aVar.f28008c;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void mo26236f(Object obj) {
        try {
            m35846g(obj, this.f28003a);
        } catch (C10497a unused) {
        } catch (Throwable th) {
            this.f28005c.shutdown();
            throw th;
        }
        this.f28005c.shutdown();
    }

    /* renamed from: g */
    private void m35846g(T t, C10558a aVar) {
        try {
            mo26230c(t, aVar);
            aVar.mo26200a();
        } catch (C10497a e) {
            aVar.mo26201b(e);
            throw e;
        } catch (Exception e2) {
            aVar.mo26201b(e2);
            throw new C10497a(e2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo26229a(T t);

    /* renamed from: b */
    public void mo26235b(T t) {
        this.f28003a.mo26202c();
        this.f28003a.mo26208j(C10558a.C10560b.BUSY);
        this.f28003a.mo26205g(mo26213d());
        if (this.f28004b) {
            this.f28003a.mo26209k(mo26229a(t));
            this.f28005c.execute(new C10563b(this, t));
            return;
        }
        m35846g(t, this.f28003a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo26230c(T t, C10558a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C10558a.C10561c mo26213d();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo26237h() {
        if (this.f28003a.mo26204e()) {
            this.f28003a.mo26207i(C10558a.C10559a.CANCELLED);
            this.f28003a.mo26208j(C10558a.C10560b.READY);
            throw new C10497a("Task cancelled", C10497a.C10498a.TASK_CANCELLED_EXCEPTION);
        }
    }
}
