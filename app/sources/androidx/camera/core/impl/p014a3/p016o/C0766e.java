package androidx.camera.core.impl.p014a3.p016o;

import androidx.core.util.C1177h;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p027c.p036b.p037a.p040c.C1493a;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.impl.a3.o.e */
public class C0766e<V> implements C9172b<V> {

    /* renamed from: f */
    private final C9172b<V> f2328f;

    /* renamed from: o */
    C1814b.C1815a<V> f2329o;

    /* renamed from: androidx.camera.core.impl.a3.o.e$a */
    class C0767a implements C1814b.C1817c<V> {
        C0767a() {
        }

        /* renamed from: a */
        public Object mo1960a(C1814b.C1815a<V> aVar) {
            C1177h.m4586h(C0766e.this.f2329o == null, "The result can only set once!");
            C0766e.this.f2329o = aVar;
            return "FutureChain[" + C0766e.this + "]";
        }
    }

    C0766e() {
        this.f2328f = C1814b.m7736a(new C0767a());
    }

    C0766e(C9172b<V> bVar) {
        this.f2328f = (C9172b) C1177h.m4583e(bVar);
    }

    /* renamed from: a */
    public static <V> C0766e<V> m3068a(C9172b<V> bVar) {
        return bVar instanceof C0766e ? (C0766e) bVar : new C0766e<>(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2916b(V v) {
        C1814b.C1815a<V> aVar = this.f2329o;
        if (aVar != null) {
            return aVar.mo6308c(v);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo2917c(Throwable th) {
        C1814b.C1815a<V> aVar = this.f2329o;
        if (aVar != null) {
            return aVar.mo6310f(th);
        }
        return false;
    }

    public boolean cancel(boolean z) {
        return this.f2328f.cancel(z);
    }

    /* renamed from: d */
    public final <T> C0766e<T> mo2918d(C1493a<? super V, T> aVar, Executor executor) {
        return (C0766e) C0768f.m3088n(this, aVar, executor);
    }

    /* renamed from: e */
    public void mo2919e(Runnable runnable, Executor executor) {
        this.f2328f.mo2919e(runnable, executor);
    }

    /* renamed from: f */
    public final <T> C0766e<T> mo2920f(C0762b<? super V, T> bVar, Executor executor) {
        return (C0766e) C0768f.m3089o(this, bVar, executor);
    }

    public V get() {
        return this.f2328f.get();
    }

    public V get(long j, TimeUnit timeUnit) {
        return this.f2328f.get(j, timeUnit);
    }

    public boolean isCancelled() {
        return this.f2328f.isCancelled();
    }

    public boolean isDone() {
        return this.f2328f.isDone();
    }
}
