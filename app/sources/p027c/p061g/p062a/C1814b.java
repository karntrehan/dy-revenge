package p027c.p061g.p062a;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: c.g.a.b */
public final class C1814b {

    /* renamed from: c.g.a.b$a */
    public static final class C1815a<T> {

        /* renamed from: a */
        Object f5390a;

        /* renamed from: b */
        C1818d<T> f5391b;

        /* renamed from: c */
        private C1820c<Void> f5392c = C1820c.m7749s();

        /* renamed from: d */
        private boolean f5393d;

        C1815a() {
        }

        /* renamed from: e */
        private void m7737e() {
            this.f5390a = null;
            this.f5391b = null;
            this.f5392c = null;
        }

        /* renamed from: a */
        public void mo6306a(Runnable runnable, Executor executor) {
            C1820c<Void> cVar = this.f5392c;
            if (cVar != null) {
                cVar.mo2919e(runnable, executor);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6307b() {
            this.f5390a = null;
            this.f5391b = null;
            this.f5392c.mo6294p(null);
        }

        /* renamed from: c */
        public boolean mo6308c(T t) {
            boolean z = true;
            this.f5393d = true;
            C1818d<T> dVar = this.f5391b;
            if (dVar == null || !dVar.mo6314b(t)) {
                z = false;
            }
            if (z) {
                m7737e();
            }
            return z;
        }

        /* renamed from: d */
        public boolean mo6309d() {
            boolean z = true;
            this.f5393d = true;
            C1818d<T> dVar = this.f5391b;
            if (dVar == null || !dVar.mo6313a(true)) {
                z = false;
            }
            if (z) {
                m7737e();
            }
            return z;
        }

        /* renamed from: f */
        public boolean mo6310f(Throwable th) {
            boolean z = true;
            this.f5393d = true;
            C1818d<T> dVar = this.f5391b;
            if (dVar == null || !dVar.mo6315c(th)) {
                z = false;
            }
            if (z) {
                m7737e();
            }
            return z;
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            C1820c<Void> cVar;
            C1818d<T> dVar = this.f5391b;
            if (dVar != null && !dVar.isDone()) {
                dVar.mo6315c(new C1816b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f5390a));
            }
            if (!this.f5393d && (cVar = this.f5392c) != null) {
                cVar.mo6294p(null);
            }
        }
    }

    /* renamed from: c.g.a.b$b */
    static final class C1816b extends Throwable {
        C1816b(String str) {
            super(str);
        }

        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: c.g.a.b$c */
    public interface C1817c<T> {
        /* renamed from: a */
        Object mo1960a(C1815a<T> aVar);
    }

    /* renamed from: c.g.a.b$d */
    private static final class C1818d<T> implements C9172b<T> {

        /* renamed from: f */
        final WeakReference<C1815a<T>> f5394f;

        /* renamed from: o */
        private final C1803a<T> f5395o = new C1819a();

        /* renamed from: c.g.a.b$d$a */
        class C1819a extends C1803a<T> {
            C1819a() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: m */
            public String mo6293m() {
                C1815a aVar = (C1815a) C1818d.this.f5394f.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f5390a + "]";
            }
        }

        C1818d(C1815a<T> aVar) {
            this.f5394f = new WeakReference<>(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6313a(boolean z) {
            return this.f5395o.cancel(z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo6314b(T t) {
            return this.f5395o.mo6294p(t);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo6315c(Throwable th) {
            return this.f5395o.mo6295q(th);
        }

        public boolean cancel(boolean z) {
            C1815a aVar = (C1815a) this.f5394f.get();
            boolean cancel = this.f5395o.cancel(z);
            if (cancel && aVar != null) {
                aVar.mo6307b();
            }
            return cancel;
        }

        /* renamed from: e */
        public void mo2919e(Runnable runnable, Executor executor) {
            this.f5395o.mo2919e(runnable, executor);
        }

        public T get() {
            return this.f5395o.get();
        }

        public T get(long j, TimeUnit timeUnit) {
            return this.f5395o.get(j, timeUnit);
        }

        public boolean isCancelled() {
            return this.f5395o.isCancelled();
        }

        public boolean isDone() {
            return this.f5395o.isDone();
        }

        public String toString() {
            return this.f5395o.toString();
        }
    }

    /* renamed from: a */
    public static <T> C9172b<T> m7736a(C1817c<T> cVar) {
        C1815a aVar = new C1815a();
        C1818d<T> dVar = new C1818d<>(aVar);
        aVar.f5391b = dVar;
        aVar.f5390a = cVar.getClass();
        try {
            Object a = cVar.mo1960a(aVar);
            if (a != null) {
                aVar.f5390a = a;
            }
        } catch (Exception e) {
            dVar.mo6315c(e);
        }
        return dVar;
    }
}
