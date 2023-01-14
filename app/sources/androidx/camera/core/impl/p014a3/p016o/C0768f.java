package androidx.camera.core.impl.p014a3.p016o;

import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0774g;
import androidx.core.util.C1177h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import p027c.p036b.p037a.p040c.C1493a;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.impl.a3.o.f */
public final class C0768f {

    /* renamed from: a */
    private static final C1493a<?, ?> f2331a = new C0770b();

    /* renamed from: androidx.camera.core.impl.a3.o.f$a */
    class C0769a implements C0762b<I, O> {

        /* renamed from: a */
        final /* synthetic */ C1493a f2332a;

        C0769a(C1493a aVar) {
            this.f2332a = aVar;
        }

        public C9172b<O> apply(I i) {
            return C0768f.m3081g(this.f2332a.apply(i));
        }
    }

    /* renamed from: androidx.camera.core.impl.a3.o.f$b */
    class C0770b implements C1493a<Object, Object> {
        C0770b() {
        }

        public Object apply(Object obj) {
            return obj;
        }
    }

    /* renamed from: androidx.camera.core.impl.a3.o.f$c */
    class C0771c implements C0765d<I> {

        /* renamed from: a */
        final /* synthetic */ C1814b.C1815a f2333a;

        /* renamed from: b */
        final /* synthetic */ C1493a f2334b;

        C0771c(C1814b.C1815a aVar, C1493a aVar2) {
            this.f2333a = aVar;
            this.f2334b = aVar2;
        }

        /* renamed from: a */
        public void mo1980a(I i) {
            try {
                this.f2333a.mo6308c(this.f2334b.apply(i));
            } catch (Throwable th) {
                this.f2333a.mo6310f(th);
            }
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            this.f2333a.mo6310f(th);
        }
    }

    /* renamed from: androidx.camera.core.impl.a3.o.f$d */
    class C0772d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C9172b f2335f;

        C0772d(C9172b bVar) {
            this.f2335f = bVar;
        }

        public void run() {
            this.f2335f.cancel(true);
        }
    }

    /* renamed from: androidx.camera.core.impl.a3.o.f$e */
    private static final class C0773e<V> implements Runnable {

        /* renamed from: f */
        final Future<V> f2336f;

        /* renamed from: o */
        final C0765d<? super V> f2337o;

        C0773e(Future<V> future, C0765d<? super V> dVar) {
            this.f2336f = future;
            this.f2337o = dVar;
        }

        public void run() {
            try {
                this.f2337o.mo1980a(C0768f.m3077c(this.f2336f));
            } catch (ExecutionException e) {
                this.f2337o.mo1981b(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f2337o.mo1981b(e2);
            }
        }

        public String toString() {
            return C0773e.class.getSimpleName() + "," + this.f2337o;
        }
    }

    /* renamed from: a */
    public static <V> void m3075a(C9172b<V> bVar, C0765d<? super V> dVar, Executor executor) {
        C1177h.m4583e(dVar);
        bVar.mo2919e(new C0773e(bVar, dVar), executor);
    }

    /* renamed from: b */
    public static <V> C9172b<List<V>> m3076b(Collection<? extends C9172b<? extends V>> collection) {
        return new C0778h(new ArrayList(collection), true, C0744a.m3044a());
    }

    /* renamed from: c */
    public static <V> V m3077c(Future<V> future) {
        boolean isDone = future.isDone();
        C1177h.m4586h(isDone, "Future was expected to be done, " + future);
        return m3078d(future);
    }

    /* renamed from: d */
    public static <V> V m3078d(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: e */
    public static <V> C9172b<V> m3079e(Throwable th) {
        return new C0774g.C0775a(th);
    }

    /* renamed from: f */
    public static <V> ScheduledFuture<V> m3080f(Throwable th) {
        return new C0774g.C0776b(th);
    }

    /* renamed from: g */
    public static <V> C9172b<V> m3081g(V v) {
        return v == null ? C0774g.m3092g() : new C0774g.C0777c(v);
    }

    /* renamed from: i */
    public static <V> C9172b<V> m3083i(C9172b<V> bVar) {
        C1177h.m4583e(bVar);
        return bVar.isDone() ? bVar : C1814b.m7736a(new C0761a(bVar));
    }

    /* renamed from: j */
    public static <V> void m3084j(C9172b<V> bVar, C1814b.C1815a<V> aVar) {
        m3085k(bVar, f2331a, aVar, C0744a.m3044a());
    }

    /* renamed from: k */
    public static <I, O> void m3085k(C9172b<I> bVar, C1493a<? super I, ? extends O> aVar, C1814b.C1815a<O> aVar2, Executor executor) {
        m3086l(true, bVar, aVar, aVar2, executor);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static <I, O> void m3086l(boolean z, C9172b<I> bVar, C1493a<? super I, ? extends O> aVar, C1814b.C1815a<O> aVar2, Executor executor) {
        C1177h.m4583e(bVar);
        C1177h.m4583e(aVar);
        C1177h.m4583e(aVar2);
        C1177h.m4583e(executor);
        m3075a(bVar, new C0771c(aVar2, aVar), executor);
        if (z) {
            aVar2.mo6306a(new C0772d(bVar), C0744a.m3044a());
        }
    }

    /* renamed from: m */
    public static <V> C9172b<List<V>> m3087m(Collection<? extends C9172b<? extends V>> collection) {
        return new C0778h(new ArrayList(collection), false, C0744a.m3044a());
    }

    /* renamed from: n */
    public static <I, O> C9172b<O> m3088n(C9172b<I> bVar, C1493a<? super I, ? extends O> aVar, Executor executor) {
        C1177h.m4583e(aVar);
        return m3089o(bVar, new C0769a(aVar), executor);
    }

    /* renamed from: o */
    public static <I, O> C9172b<O> m3089o(C9172b<I> bVar, C0762b<? super I, ? extends O> bVar2, Executor executor) {
        C0763c cVar = new C0763c(bVar2, bVar);
        bVar.mo2919e(cVar, executor);
        return cVar;
    }
}
