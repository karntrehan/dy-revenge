package com.google.firebase.crashlytics.p139h.p142j;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p174e.p319f.p320a.p335c.p362h.C8945c;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8969o;

/* renamed from: com.google.firebase.crashlytics.h.j.o */
public class C4579o {

    /* renamed from: a */
    private final Executor f12945a;

    /* renamed from: b */
    private C8963l<Void> f12946b = C8969o.m29867f(null);

    /* renamed from: c */
    private final Object f12947c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ThreadLocal<Boolean> f12948d = new ThreadLocal<>();

    /* renamed from: com.google.firebase.crashlytics.h.j.o$a */
    class C4580a implements Runnable {
        C4580a() {
        }

        public void run() {
            C4579o.this.f12948d.set(Boolean.TRUE);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.h.j.o$b */
    class C4581b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Runnable f12950a;

        C4581b(Runnable runnable) {
            this.f12950a = runnable;
        }

        /* renamed from: a */
        public Void call() {
            this.f12950a.run();
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.h.j.o$c */
    class C4582c implements C8945c<Void, T> {

        /* renamed from: a */
        final /* synthetic */ Callable f12952a;

        C4582c(Callable callable) {
            this.f12952a = callable;
        }

        /* renamed from: a */
        public T mo14079a(C8963l<Void> lVar) {
            return this.f12952a.call();
        }
    }

    /* renamed from: com.google.firebase.crashlytics.h.j.o$d */
    class C4583d implements C8945c<T, Void> {
        C4583d() {
        }

        /* renamed from: b */
        public Void mo14079a(C8963l<T> lVar) {
            return null;
        }
    }

    public C4579o(Executor executor) {
        this.f12945a = executor;
        executor.execute(new C4580a());
    }

    /* renamed from: d */
    private <T> C8963l<Void> m17400d(C8963l<T> lVar) {
        return lVar.mo22773i(this.f12945a, new C4583d());
    }

    /* renamed from: e */
    private boolean m17401e() {
        return Boolean.TRUE.equals(this.f12948d.get());
    }

    /* renamed from: f */
    private <T> C8945c<Void, T> m17402f(Callable<T> callable) {
        return new C4582c(callable);
    }

    /* renamed from: b */
    public void mo14156b() {
        if (!m17401e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: c */
    public Executor mo14157c() {
        return this.f12945a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C8963l<Void> mo14158g(Runnable runnable) {
        return mo14159h(new C4581b(runnable));
    }

    /* renamed from: h */
    public <T> C8963l<T> mo14159h(Callable<T> callable) {
        C8963l<TContinuationResult> i;
        synchronized (this.f12947c) {
            i = this.f12946b.mo22773i(this.f12945a, m17402f(callable));
            this.f12946b = m17400d(i);
        }
        return i;
    }

    /* renamed from: i */
    public <T> C8963l<T> mo14160i(Callable<C8963l<T>> callable) {
        C8963l<TContinuationResult> j;
        synchronized (this.f12947c) {
            j = this.f12946b.mo22774j(this.f12945a, m17402f(callable));
            this.f12946b = m17400d(j);
        }
        return j;
    }
}
