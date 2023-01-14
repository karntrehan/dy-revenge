package kotlinx.coroutines.p505k2;

import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.C10815o;
import p174e.p319f.p390b.p391a.p392a.C9172b;
import p174e.p319f.p390b.p391a.p392a.C9173c;
import p174e.p319f.p390b.p391a.p392a.C9174d;
import p455g.C10323s;
import p455g.p462v.C10376d;
import p455g.p462v.p464k.p465a.C10403h;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10458m;

/* renamed from: kotlinx.coroutines.k2.a */
public final class C10780a {

    /* renamed from: kotlinx.coroutines.k2.a$a */
    static final class C10781a extends C10458m implements C10430l<Throwable, C10323s> {

        /* renamed from: f */
        final /* synthetic */ C9172b<T> f28284f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10781a(C9172b<T> bVar) {
            super(1);
            this.f28284f = bVar;
        }

        /* renamed from: a */
        public final void mo26764a(Throwable th) {
            this.f28284f.cancel(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo26764a((Throwable) obj);
            return C10323s.f27547a;
        }
    }

    /* renamed from: b */
    public static final <T> Object m36633b(C9172b<T> bVar, C10376d<? super T> dVar) {
        try {
            if (bVar.isDone()) {
                return C9174d.m30496a(bVar);
            }
            C10815o oVar = new C10815o(C10392c.m35241b(dVar), 1);
            oVar.mo26815B();
            bVar.mo2919e(new C10782b(bVar, oVar), C9173c.m30495a());
            oVar.mo26802e(new C10781a(bVar));
            Object y = oVar.mo26825y();
            if (y == C10395d.m35244c()) {
                C10403h.m35274c(dVar);
            }
            return y;
        } catch (ExecutionException e) {
            throw m36634c(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final Throwable m36634c(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        C10457l.m35317b(cause);
        return cause;
    }
}
