package p174e.p247e.p294k.p300d;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p173d.C5368f;
import p174e.p247e.p248a.C5992a;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p249b.p250a.C6005j;
import p174e.p247e.p249b.p251b.C6030i;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p253d.p260g.C6082g;
import p174e.p247e.p253d.p260g.C6084h;
import p174e.p247e.p253d.p260g.C6087k;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p294k.p307k.C6369d;
import p174e.p247e.p294k.p308l.C6375a;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: e.e.k.d.e */
public class C6277e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Class<?> f17375a = C6277e.class;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6030i f17376b;

    /* renamed from: c */
    private final C6084h f17377c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C6087k f17378d;

    /* renamed from: e */
    private final Executor f17379e;

    /* renamed from: f */
    private final Executor f17380f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C6310x f17381g = C6310x.m23895d();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C6297o f17382h;

    /* renamed from: e.e.k.d.e$a */
    class C6278a implements Callable<C6369d> {

        /* renamed from: a */
        final /* synthetic */ Object f17383a;

        /* renamed from: b */
        final /* synthetic */ AtomicBoolean f17384b;

        /* renamed from: c */
        final /* synthetic */ C5999d f17385c;

        C6278a(Object obj, AtomicBoolean atomicBoolean, C5999d dVar) {
            this.f17383a = obj;
            this.f17384b = atomicBoolean;
            this.f17385c = dVar;
        }

        /* renamed from: a */
        public C6369d call() {
            C6088a A0;
            Object e = C6375a.m24353e(this.f17383a, (String) null);
            try {
                if (!this.f17384b.get()) {
                    C6369d c = C6277e.this.f17381g.mo18661c(this.f17385c);
                    if (c != null) {
                        C6071a.m22888v(C6277e.f17375a, "Found image for %s in staging area", this.f17385c.mo17920c());
                        C6277e.this.f17382h.mo18644m(this.f17385c);
                    } else {
                        C6071a.m22888v(C6277e.f17375a, "Did not find image for %s in staging area", this.f17385c.mo17920c());
                        C6277e.this.f17382h.mo18639h(this.f17385c);
                        try {
                            C6082g e2 = C6277e.this.m23769q(this.f17385c);
                            if (e2 == null) {
                                C6375a.m24354f(e);
                                return null;
                            }
                            A0 = C6088a.m22940A0(e2);
                            C6369d dVar = new C6369d((C6088a<C6082g>) A0);
                            C6088a.m22949v0(A0);
                            c = dVar;
                        } catch (Exception unused) {
                            C6375a.m24354f(e);
                            return null;
                        } catch (Throwable th) {
                            C6088a.m22949v0(A0);
                            throw th;
                        }
                    }
                    if (Thread.interrupted()) {
                        C6071a.m22887u(C6277e.f17375a, "Host thread was interrupted, decreasing reference count");
                        c.close();
                        throw new InterruptedException();
                    }
                    C6375a.m24354f(e);
                    return c;
                }
                throw new CancellationException();
            } catch (Throwable th2) {
                C6375a.m24354f(e);
                throw th2;
            }
        }
    }

    /* renamed from: e.e.k.d.e$b */
    class C6279b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Object f17387f;

        /* renamed from: o */
        final /* synthetic */ C5999d f17388o;

        /* renamed from: p */
        final /* synthetic */ C6369d f17389p;

        C6279b(Object obj, C5999d dVar, C6369d dVar2) {
            this.f17387f = obj;
            this.f17388o = dVar;
            this.f17389p = dVar2;
        }

        public void run() {
            Object e = C6375a.m24353e(this.f17387f, (String) null);
            try {
                C6277e.this.m23770s(this.f17388o, this.f17389p);
                C6277e.this.f17381g.mo18664h(this.f17388o, this.f17389p);
                C6369d.m24309h(this.f17389p);
                C6375a.m24354f(e);
            } catch (Throwable th) {
                C6277e.this.f17381g.mo18664h(this.f17388o, this.f17389p);
                C6369d.m24309h(this.f17389p);
                C6375a.m24354f(e);
                throw th;
            }
        }
    }

    /* renamed from: e.e.k.d.e$c */
    class C6280c implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Object f17391a;

        /* renamed from: b */
        final /* synthetic */ C5999d f17392b;

        C6280c(Object obj, C5999d dVar) {
            this.f17391a = obj;
            this.f17392b = dVar;
        }

        /* renamed from: a */
        public Void call() {
            Object e = C6375a.m24353e(this.f17391a, (String) null);
            try {
                C6277e.this.f17381g.mo18663g(this.f17392b);
                C6277e.this.f17376b.mo17977e(this.f17392b);
                C6375a.m24354f(e);
                return null;
            } catch (Throwable th) {
                C6375a.m24354f(e);
                throw th;
            }
        }
    }

    /* renamed from: e.e.k.d.e$d */
    class C6281d implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Object f17394a;

        C6281d(Object obj) {
            this.f17394a = obj;
        }

        /* renamed from: a */
        public Void call() {
            Object e = C6375a.m24353e(this.f17394a, (String) null);
            try {
                C6277e.this.f17381g.mo18659a();
                C6277e.this.f17376b.mo17973a();
                C6375a.m24354f(e);
                return null;
            } catch (Throwable th) {
                C6375a.m24354f(e);
                throw th;
            }
        }
    }

    /* renamed from: e.e.k.d.e$e */
    class C6282e implements C6005j {

        /* renamed from: a */
        final /* synthetic */ C6369d f17396a;

        C6282e(C6369d dVar) {
            this.f17396a = dVar;
        }

        /* renamed from: a */
        public void mo17928a(OutputStream outputStream) {
            InputStream X = this.f17396a.mo18892X();
            C6062k.m22839g(X);
            C6277e.this.f17378d.mo18076a(X, outputStream);
        }
    }

    public C6277e(C6030i iVar, C6084h hVar, C6087k kVar, Executor executor, Executor executor2, C6297o oVar) {
        this.f17376b = iVar;
        this.f17377c = hVar;
        this.f17378d = kVar;
        this.f17379e = executor;
        this.f17380f = executor2;
        this.f17382h = oVar;
    }

    /* renamed from: i */
    private boolean m23766i(C5999d dVar) {
        C6369d c = this.f17381g.mo18661c(dVar);
        if (c != null) {
            c.close();
            C6071a.m22888v(f17375a, "Found image for %s in staging area", dVar.mo17920c());
            this.f17382h.mo18644m(dVar);
            return true;
        }
        C6071a.m22888v(f17375a, "Did not find image for %s in staging area", dVar.mo17920c());
        this.f17382h.mo18639h(dVar);
        try {
            return this.f17376b.mo17978f(dVar);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: m */
    private C5368f<C6369d> m23767m(C5999d dVar, C6369d dVar2) {
        C6071a.m22888v(f17375a, "Found image for %s in staging area", dVar.mo17920c());
        this.f17382h.mo18644m(dVar);
        return C5368f.m19844h(dVar2);
    }

    /* renamed from: o */
    private C5368f<C6369d> m23768o(C5999d dVar, AtomicBoolean atomicBoolean) {
        try {
            return C5368f.m19840b(new C6278a(C6375a.m24352d("BufferedDiskCache_getAsync"), atomicBoolean, dVar), this.f17379e);
        } catch (Exception e) {
            C6071a.m22858F(f17375a, e, "Failed to schedule disk-cache read for %s", dVar.mo17920c());
            return C5368f.m19843g(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public C6082g m23769q(C5999d dVar) {
        InputStream a;
        try {
            Class<?> cls = f17375a;
            C6071a.m22888v(cls, "Disk cache read for %s", dVar.mo17920c());
            C5992a c = this.f17376b.mo17975c(dVar);
            if (c == null) {
                C6071a.m22888v(cls, "Disk cache miss for %s", dVar.mo17920c());
                this.f17382h.mo18640i(dVar);
                return null;
            }
            C6071a.m22888v(cls, "Found entry in disk cache for %s", dVar.mo17920c());
            this.f17382h.mo18636e(dVar);
            a = c.mo17904a();
            C6082g d = this.f17377c.mo8166d(a, (int) c.size());
            a.close();
            C6071a.m22888v(cls, "Successful read from disk cache for %s", dVar.mo17920c());
            return d;
        } catch (IOException e) {
            C6071a.m22858F(f17375a, e, "Exception reading from cache for %s", dVar.mo17920c());
            this.f17382h.mo18645n(dVar);
            throw e;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m23770s(C5999d dVar, C6369d dVar2) {
        Class<?> cls = f17375a;
        C6071a.m22888v(cls, "About to write to disk-cache for key %s", dVar.mo17920c());
        try {
            this.f17376b.mo17979g(dVar, new C6282e(dVar2));
            this.f17382h.mo18642k(dVar);
            C6071a.m22888v(cls, "Successful disk-cache write for key %s", dVar.mo17920c());
        } catch (IOException e) {
            C6071a.m22858F(f17375a, e, "Failed to write to disk-cache for key %s", dVar.mo17920c());
        }
    }

    /* renamed from: h */
    public void mo18593h(C5999d dVar) {
        C6062k.m22839g(dVar);
        this.f17376b.mo17974b(dVar);
    }

    /* renamed from: j */
    public C5368f<Void> mo18594j() {
        this.f17381g.mo18659a();
        try {
            return C5368f.m19840b(new C6281d(C6375a.m24352d("BufferedDiskCache_clearAll")), this.f17380f);
        } catch (Exception e) {
            C6071a.m22858F(f17375a, e, "Failed to schedule disk-cache clear", new Object[0]);
            return C5368f.m19843g(e);
        }
    }

    /* renamed from: k */
    public boolean mo18595k(C5999d dVar) {
        return this.f17381g.mo18660b(dVar) || this.f17376b.mo17976d(dVar);
    }

    /* renamed from: l */
    public boolean mo18596l(C5999d dVar) {
        if (mo18595k(dVar)) {
            return true;
        }
        return m23766i(dVar);
    }

    /* renamed from: n */
    public C5368f<C6369d> mo18597n(C5999d dVar, AtomicBoolean atomicBoolean) {
        try {
            if (C6394b.m24481d()) {
                C6394b.m24478a("BufferedDiskCache#get");
            }
            C6369d c = this.f17381g.mo18661c(dVar);
            if (c != null) {
                return m23767m(dVar, c);
            }
            C5368f<C6369d> o = m23768o(dVar, atomicBoolean);
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
            return o;
        } finally {
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
    }

    /* renamed from: p */
    public void mo18598p(C5999d dVar, C6369d dVar2) {
        C6369d b;
        try {
            if (C6394b.m24481d()) {
                C6394b.m24478a("BufferedDiskCache#put");
            }
            C6062k.m22839g(dVar);
            C6062k.m22834b(Boolean.valueOf(C6369d.m24312z0(dVar2)));
            this.f17381g.mo18662f(dVar, dVar2);
            b = C6369d.m24308b(dVar2);
            this.f17380f.execute(new C6279b(C6375a.m24352d("BufferedDiskCache_putAsync"), dVar, b));
        } catch (Exception e) {
            C6071a.m22858F(f17375a, e, "Failed to schedule disk-cache write for %s", dVar.mo17920c());
            this.f17381g.mo18664h(dVar, dVar2);
            C6369d.m24309h(b);
        } catch (Throwable th) {
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
            throw th;
        }
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
    }

    /* renamed from: r */
    public C5368f<Void> mo18599r(C5999d dVar) {
        C6062k.m22839g(dVar);
        this.f17381g.mo18663g(dVar);
        try {
            return C5368f.m19840b(new C6280c(C6375a.m24352d("BufferedDiskCache_remove"), dVar), this.f17380f);
        } catch (Exception e) {
            C6071a.m22858F(f17375a, e, "Failed to schedule disk-cache remove for %s", dVar.mo17920c());
            return C5368f.m19843g(e);
        }
    }
}
