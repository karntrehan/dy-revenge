package p174e.p319f.p320a.p335c.p362h;

import com.google.android.gms.common.internal.C3705r;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: e.f.a.c.h.o */
public final class C8969o {
    /* renamed from: a */
    public static <TResult> TResult m29862a(C8963l<TResult> lVar) {
        C3705r.m14344i();
        C3705r.m14347l(lVar, "Task must not be null");
        if (lVar.mo22778n()) {
            return m29870i(lVar);
        }
        C8974r rVar = new C8974r((C8973q) null);
        m29871j(lVar, rVar);
        rVar.mo22795d();
        return m29870i(lVar);
    }

    /* renamed from: b */
    public static <TResult> TResult m29863b(C8963l<TResult> lVar, long j, TimeUnit timeUnit) {
        C3705r.m14344i();
        C3705r.m14347l(lVar, "Task must not be null");
        C3705r.m14347l(timeUnit, "TimeUnit must not be null");
        if (lVar.mo22778n()) {
            return m29870i(lVar);
        }
        C8974r rVar = new C8974r((C8973q) null);
        m29871j(lVar, rVar);
        if (rVar.mo22796e(j, timeUnit)) {
            return m29870i(lVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    /* renamed from: c */
    public static <TResult> C8963l<TResult> m29864c(Executor executor, Callable<TResult> callable) {
        C3705r.m14347l(executor, "Executor must not be null");
        C3705r.m14347l(callable, "Callback must not be null");
        C8970o0 o0Var = new C8970o0();
        executor.execute(new C8972p0(o0Var, callable));
        return o0Var;
    }

    /* renamed from: d */
    public static <TResult> C8963l<TResult> m29865d() {
        C8970o0 o0Var = new C8970o0();
        o0Var.mo22791t();
        return o0Var;
    }

    /* renamed from: e */
    public static <TResult> C8963l<TResult> m29866e(Exception exc) {
        C8970o0 o0Var = new C8970o0();
        o0Var.mo22789r(exc);
        return o0Var;
    }

    /* renamed from: f */
    public static <TResult> C8963l<TResult> m29867f(TResult tresult) {
        C8970o0 o0Var = new C8970o0();
        o0Var.mo22790s(tresult);
        return o0Var;
    }

    /* renamed from: g */
    public static C8963l<Void> m29868g(Collection<? extends C8963l<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return m29867f((Object) null);
        }
        for (C8963l requireNonNull : collection) {
            Objects.requireNonNull(requireNonNull, "null tasks are not accepted");
        }
        C8970o0 o0Var = new C8970o0();
        C8976t tVar = new C8976t(collection.size(), o0Var);
        for (C8963l j : collection) {
            m29871j(j, tVar);
        }
        return o0Var;
    }

    /* renamed from: h */
    public static C8963l<Void> m29869h(C8963l<?>... lVarArr) {
        return (lVarArr == null || lVarArr.length == 0) ? m29867f((Object) null) : m29868g(Arrays.asList(lVarArr));
    }

    /* renamed from: i */
    private static <TResult> TResult m29870i(C8963l<TResult> lVar) {
        if (lVar.mo22779o()) {
            return lVar.mo22776l();
        }
        if (lVar.mo22777m()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(lVar.mo22775k());
    }

    /* renamed from: j */
    private static <T> void m29871j(C8963l<T> lVar, C8975s<? super T> sVar) {
        Executor executor = C8967n.f24376b;
        lVar.mo22771g(executor, sVar);
        lVar.mo22769e(executor, sVar);
        lVar.mo22765a(executor, sVar);
    }
}
