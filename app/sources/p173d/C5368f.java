package p173d;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: d.f */
public class C5368f<TResult> {

    /* renamed from: a */
    public static final ExecutorService f14999a = C5362b.m19833a();

    /* renamed from: b */
    private static final Executor f15000b = C5362b.m19834b();

    /* renamed from: c */
    public static final Executor f15001c = C5359a.m19832c();

    /* renamed from: d */
    private static volatile C5372d f15002d;

    /* renamed from: e */
    private static C5368f<?> f15003e = new C5368f<>((Object) null);

    /* renamed from: f */
    private static C5368f<Boolean> f15004f = new C5368f<>(Boolean.TRUE);

    /* renamed from: g */
    private static C5368f<Boolean> f15005g = new C5368f<>(Boolean.FALSE);

    /* renamed from: h */
    private static C5368f<?> f15006h = new C5368f<>(true);

    /* renamed from: i */
    private final Object f15007i = new Object();

    /* renamed from: j */
    private boolean f15008j;

    /* renamed from: k */
    private boolean f15009k;

    /* renamed from: l */
    private TResult f15010l;

    /* renamed from: m */
    private Exception f15011m;

    /* renamed from: n */
    private boolean f15012n;

    /* renamed from: o */
    private C5374h f15013o;

    /* renamed from: p */
    private List<C5366d<TResult, Void>> f15014p = new ArrayList();

    /* renamed from: d.f$a */
    class C5369a implements C5366d<TResult, Void> {

        /* renamed from: a */
        final /* synthetic */ C5373g f15015a;

        /* renamed from: b */
        final /* synthetic */ C5366d f15016b;

        /* renamed from: c */
        final /* synthetic */ Executor f15017c;

        /* renamed from: d */
        final /* synthetic */ C5365c f15018d;

        C5369a(C5373g gVar, C5366d dVar, Executor executor, C5365c cVar) {
            this.f15015a = gVar;
            this.f15016b = dVar;
            this.f15017c = executor;
        }

        /* renamed from: b */
        public Void mo8306a(C5368f<TResult> fVar) {
            C5368f.m19842d(this.f15015a, this.f15016b, fVar, this.f15017c, this.f15018d);
            return null;
        }
    }

    /* renamed from: d.f$b */
    static class C5370b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C5365c f15020f;

        /* renamed from: o */
        final /* synthetic */ C5373g f15021o;

        /* renamed from: p */
        final /* synthetic */ C5366d f15022p;

        /* renamed from: q */
        final /* synthetic */ C5368f f15023q;

        C5370b(C5365c cVar, C5373g gVar, C5366d dVar, C5368f fVar) {
            this.f15021o = gVar;
            this.f15022p = dVar;
            this.f15023q = fVar;
        }

        public void run() {
            if (this.f15020f == null) {
                try {
                    this.f15021o.mo16180d(this.f15022p.mo8306a(this.f15023q));
                } catch (CancellationException unused) {
                    this.f15021o.mo16178b();
                } catch (Exception e) {
                    this.f15021o.mo16179c(e);
                }
            } else {
                throw null;
            }
        }
    }

    /* renamed from: d.f$c */
    static class C5371c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C5365c f15024f;

        /* renamed from: o */
        final /* synthetic */ C5373g f15025o;

        /* renamed from: p */
        final /* synthetic */ Callable f15026p;

        C5371c(C5365c cVar, C5373g gVar, Callable callable) {
            this.f15025o = gVar;
            this.f15026p = callable;
        }

        public void run() {
            if (this.f15024f == null) {
                try {
                    this.f15025o.mo16180d(this.f15026p.call());
                } catch (CancellationException unused) {
                    this.f15025o.mo16178b();
                } catch (Exception e) {
                    this.f15025o.mo16179c(e);
                }
            } else {
                throw null;
            }
        }
    }

    /* renamed from: d.f$d */
    public interface C5372d {
        /* renamed from: a */
        void mo16176a(C5368f<?> fVar, C5375i iVar);
    }

    C5368f() {
    }

    private C5368f(TResult tresult) {
        mo16172r(tresult);
    }

    private C5368f(boolean z) {
        if (z) {
            mo16170p();
        } else {
            mo16172r((Object) null);
        }
    }

    /* renamed from: b */
    public static <TResult> C5368f<TResult> m19840b(Callable<TResult> callable, Executor executor) {
        return m19841c(callable, executor, (C5365c) null);
    }

    /* renamed from: c */
    public static <TResult> C5368f<TResult> m19841c(Callable<TResult> callable, Executor executor, C5365c cVar) {
        C5373g gVar = new C5373g();
        try {
            executor.execute(new C5371c(cVar, gVar, callable));
        } catch (Exception e) {
            gVar.mo16179c(new C5367e(e));
        }
        return gVar.mo16177a();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static <TContinuationResult, TResult> void m19842d(C5373g<TContinuationResult> gVar, C5366d<TResult, TContinuationResult> dVar, C5368f<TResult> fVar, Executor executor, C5365c cVar) {
        try {
            executor.execute(new C5370b(cVar, gVar, dVar, fVar));
        } catch (Exception e) {
            gVar.mo16179c(new C5367e(e));
        }
    }

    /* renamed from: g */
    public static <TResult> C5368f<TResult> m19843g(Exception exc) {
        C5373g gVar = new C5373g();
        gVar.mo16179c(exc);
        return gVar.mo16177a();
    }

    /* renamed from: h */
    public static <TResult> C5368f<TResult> m19844h(TResult tresult) {
        if (tresult == null) {
            return f15003e;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? f15004f : f15005g;
        }
        C5373g gVar = new C5373g();
        gVar.mo16180d(tresult);
        return gVar.mo16177a();
    }

    /* renamed from: k */
    public static C5372d m19845k() {
        return f15002d;
    }

    /* renamed from: o */
    private void m19846o() {
        synchronized (this.f15007i) {
            for (C5366d a : this.f15014p) {
                try {
                    a.mo8306a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f15014p = null;
        }
    }

    /* renamed from: e */
    public <TContinuationResult> C5368f<TContinuationResult> mo16163e(C5366d<TResult, TContinuationResult> dVar) {
        return mo16164f(dVar, f15000b, (C5365c) null);
    }

    /* renamed from: f */
    public <TContinuationResult> C5368f<TContinuationResult> mo16164f(C5366d<TResult, TContinuationResult> dVar, Executor executor, C5365c cVar) {
        boolean m;
        C5373g gVar = new C5373g();
        synchronized (this.f15007i) {
            m = mo16168m();
            if (!m) {
                this.f15014p.add(new C5369a(gVar, dVar, executor, cVar));
            }
        }
        if (m) {
            m19842d(gVar, dVar, this, executor, cVar);
        }
        return gVar.mo16177a();
    }

    /* renamed from: i */
    public Exception mo16165i() {
        Exception exc;
        synchronized (this.f15007i) {
            if (this.f15011m != null) {
                this.f15012n = true;
                C5374h hVar = this.f15013o;
                if (hVar != null) {
                    hVar.mo16184a();
                    this.f15013o = null;
                }
            }
            exc = this.f15011m;
        }
        return exc;
    }

    /* renamed from: j */
    public TResult mo16166j() {
        TResult tresult;
        synchronized (this.f15007i) {
            tresult = this.f15010l;
        }
        return tresult;
    }

    /* renamed from: l */
    public boolean mo16167l() {
        boolean z;
        synchronized (this.f15007i) {
            z = this.f15009k;
        }
        return z;
    }

    /* renamed from: m */
    public boolean mo16168m() {
        boolean z;
        synchronized (this.f15007i) {
            z = this.f15008j;
        }
        return z;
    }

    /* renamed from: n */
    public boolean mo16169n() {
        boolean z;
        synchronized (this.f15007i) {
            z = mo16165i() != null;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo16170p() {
        synchronized (this.f15007i) {
            if (this.f15008j) {
                return false;
            }
            this.f15008j = true;
            this.f15009k = true;
            this.f15007i.notifyAll();
            m19846o();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        return true;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo16171q(java.lang.Exception r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f15007i
            monitor-enter(r0)
            boolean r1 = r3.f15008j     // Catch:{ all -> 0x002c }
            r2 = 0
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r2
        L_0x000a:
            r1 = 1
            r3.f15008j = r1     // Catch:{ all -> 0x002c }
            r3.f15011m = r4     // Catch:{ all -> 0x002c }
            r3.f15012n = r2     // Catch:{ all -> 0x002c }
            java.lang.Object r4 = r3.f15007i     // Catch:{ all -> 0x002c }
            r4.notifyAll()     // Catch:{ all -> 0x002c }
            r3.m19846o()     // Catch:{ all -> 0x002c }
            boolean r4 = r3.f15012n     // Catch:{ all -> 0x002c }
            if (r4 != 0) goto L_0x002a
            d.f$d r4 = m19845k()     // Catch:{ all -> 0x002c }
            if (r4 == 0) goto L_0x002a
            d.h r4 = new d.h     // Catch:{ all -> 0x002c }
            r4.<init>(r3)     // Catch:{ all -> 0x002c }
            r3.f15013o = r4     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r1
        L_0x002c:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p173d.C5368f.mo16171q(java.lang.Exception):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo16172r(TResult tresult) {
        synchronized (this.f15007i) {
            if (this.f15008j) {
                return false;
            }
            this.f15008j = true;
            this.f15010l = tresult;
            this.f15007i.notifyAll();
            m19846o();
            return true;
        }
    }
}
