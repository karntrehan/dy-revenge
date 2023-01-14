package p174e.p319f.p320a.p382e.p383a.p389f;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p174e.p319f.p320a.p382e.p383a.p385b.C9125m;

/* renamed from: e.f.a.e.a.f.f */
public final class C9158f {
    /* renamed from: a */
    public static <ResultT> C9156d<ResultT> m30457a(ResultT resultt) {
        C9169q qVar = new C9169q();
        qVar.mo23146i(resultt);
        return qVar;
    }

    /* renamed from: b */
    public static <ResultT> ResultT m30458b(C9156d<ResultT> dVar) {
        C9125m.m30377c(dVar, "Task must not be null");
        if (dVar.mo23132g()) {
            return m30460d(dVar);
        }
        C9170r rVar = new C9170r((byte[]) null);
        m30461e(dVar, rVar);
        rVar.mo23150c();
        return m30460d(dVar);
    }

    /* renamed from: c */
    public static <ResultT> C9156d<ResultT> m30459c(Exception exc) {
        C9169q qVar = new C9169q();
        qVar.mo23148k(exc);
        return qVar;
    }

    /* renamed from: d */
    private static <ResultT> ResultT m30460d(C9156d<ResultT> dVar) {
        if (dVar.mo23133h()) {
            return dVar.mo23131f();
        }
        throw new ExecutionException(dVar.mo23130e());
    }

    /* renamed from: e */
    private static void m30461e(C9156d<?> dVar, C9170r rVar) {
        Executor executor = C9157e.f25035b;
        dVar.mo23129d(executor, rVar);
        dVar.mo23127b(executor, rVar);
    }
}
