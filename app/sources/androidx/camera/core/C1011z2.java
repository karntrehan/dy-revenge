package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.C0820i1;
import androidx.camera.core.impl.C0899w0;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.core.util.C1170a;
import androidx.core.util.C1177h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.z2 */
public final class C1011z2 {

    /* renamed from: a */
    private final Size f2850a;

    /* renamed from: b */
    private final boolean f2851b;

    /* renamed from: c */
    private final C0899w0 f2852c;

    /* renamed from: d */
    final C9172b<Surface> f2853d;

    /* renamed from: e */
    private final C1814b.C1815a<Surface> f2854e;

    /* renamed from: f */
    private final C9172b<Void> f2855f;

    /* renamed from: g */
    private final C1814b.C1815a<Void> f2856g;

    /* renamed from: h */
    private final C0820i1 f2857h;

    /* renamed from: i */
    private C1018g f2858i;

    /* renamed from: j */
    private C1019h f2859j;

    /* renamed from: k */
    private Executor f2860k;

    /* renamed from: androidx.camera.core.z2$a */
    class C1012a implements C0765d<Void> {

        /* renamed from: a */
        final /* synthetic */ C1814b.C1815a f2861a;

        /* renamed from: b */
        final /* synthetic */ C9172b f2862b;

        C1012a(C1814b.C1815a aVar, C9172b bVar) {
            this.f2861a = aVar;
            this.f2862b = bVar;
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            C1177h.m4585g(th instanceof C1016e ? this.f2862b.cancel(false) : this.f2861a.mo6308c(null));
        }

        /* renamed from: c */
        public void mo1980a(Void voidR) {
            C1177h.m4585g(this.f2861a.mo6308c(null));
        }
    }

    /* renamed from: androidx.camera.core.z2$b */
    class C1013b extends C0820i1 {
        C1013b(Size size, int i) {
            super(size, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public C9172b<Surface> mo3011n() {
            return C1011z2.this.f2853d;
        }
    }

    /* renamed from: androidx.camera.core.z2$c */
    class C1014c implements C0765d<Surface> {

        /* renamed from: a */
        final /* synthetic */ C9172b f2865a;

        /* renamed from: b */
        final /* synthetic */ C1814b.C1815a f2866b;

        /* renamed from: c */
        final /* synthetic */ String f2867c;

        C1014c(C9172b bVar, C1814b.C1815a aVar, String str) {
            this.f2865a = bVar;
            this.f2866b = aVar;
            this.f2867c = str;
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            if (th instanceof CancellationException) {
                C1814b.C1815a aVar = this.f2866b;
                C1177h.m4585g(aVar.mo6310f(new C1016e(this.f2867c + " cancelled.", th)));
                return;
            }
            this.f2866b.mo6308c(null);
        }

        /* renamed from: c */
        public void mo1980a(Surface surface) {
            C0768f.m3084j(this.f2865a, this.f2866b);
        }
    }

    /* renamed from: androidx.camera.core.z2$d */
    class C1015d implements C0765d<Void> {

        /* renamed from: a */
        final /* synthetic */ C1170a f2869a;

        /* renamed from: b */
        final /* synthetic */ Surface f2870b;

        C1015d(C1170a aVar, Surface surface) {
            this.f2869a = aVar;
            this.f2870b = surface;
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            C1177h.m4586h(th instanceof C1016e, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
            this.f2869a.mo2687a(C1017f.m3944c(1, this.f2870b));
        }

        /* renamed from: c */
        public void mo1980a(Void voidR) {
            this.f2869a.mo2687a(C1017f.m3944c(0, this.f2870b));
        }
    }

    /* renamed from: androidx.camera.core.z2$e */
    private static final class C1016e extends RuntimeException {
        C1016e(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: androidx.camera.core.z2$f */
    public static abstract class C1017f {
        C1017f() {
        }

        /* renamed from: c */
        static C1017f m3944c(int i, Surface surface) {
            return new C0708i1(i, surface);
        }

        /* renamed from: a */
        public abstract int mo2789a();

        /* renamed from: b */
        public abstract Surface mo2790b();
    }

    /* renamed from: androidx.camera.core.z2$g */
    public static abstract class C1018g {
        C1018g() {
        }

        /* renamed from: d */
        public static C1018g m3947d(Rect rect, int i, int i2) {
            return new C0926j1(rect, i, i2);
        }

        /* renamed from: a */
        public abstract Rect mo3179a();

        /* renamed from: b */
        public abstract int mo3180b();

        /* renamed from: c */
        public abstract int mo3181c();
    }

    /* renamed from: androidx.camera.core.z2$h */
    public interface C1019h {
        /* renamed from: a */
        void mo3305a(C1018g gVar);
    }

    public C1011z2(Size size, C0899w0 w0Var, boolean z) {
        this.f2850a = size;
        this.f2852c = w0Var;
        this.f2851b = z;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference((Object) null);
        C9172b a = C1814b.m7736a(new C0993w0(atomicReference, str));
        C1814b.C1815a<Void> aVar = (C1814b.C1815a) C1177h.m4583e((C1814b.C1815a) atomicReference.get());
        this.f2856g = aVar;
        AtomicReference atomicReference2 = new AtomicReference((Object) null);
        C9172b<Void> a2 = C1814b.m7736a(new C0999x0(atomicReference2, str));
        this.f2855f = a2;
        C0768f.m3075a(a2, new C1012a(aVar, a), C0744a.m3044a());
        AtomicReference atomicReference3 = new AtomicReference((Object) null);
        C9172b<Surface> a3 = C1814b.m7736a(new C0988v0(atomicReference3, str));
        this.f2853d = a3;
        this.f2854e = (C1814b.C1815a) C1177h.m4583e((C1814b.C1815a) atomicReference3.get());
        C1013b bVar = new C1013b(size, 34);
        this.f2857h = bVar;
        C9172b<Void> g = bVar.mo3007g();
        C0768f.m3075a(a3, new C1014c(g, (C1814b.C1815a) C1177h.m4583e((C1814b.C1815a) atomicReference2.get()), str), C0744a.m3044a());
        g.mo2919e(new C0983u0(this), C0744a.m3044a());
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void mo3297j() {
        this.f2853d.cancel(true);
    }

    @SuppressLint({"PairedRegistration"})
    /* renamed from: a */
    public void mo3292a(Executor executor, Runnable runnable) {
        this.f2856g.mo6306a(runnable, executor);
    }

    /* renamed from: b */
    public C0899w0 mo3293b() {
        return this.f2852c;
    }

    /* renamed from: c */
    public C0820i1 mo3294c() {
        return this.f2857h;
    }

    /* renamed from: d */
    public Size mo3295d() {
        return this.f2850a;
    }

    /* renamed from: e */
    public boolean mo3296e() {
        return this.f2851b;
    }

    /* renamed from: o */
    public void mo3298o(Surface surface, Executor executor, C1170a<C1017f> aVar) {
        if (this.f2854e.mo6308c(surface) || this.f2853d.isCancelled()) {
            C0768f.m3075a(this.f2855f, new C1015d(aVar, surface), executor);
            return;
        }
        C1177h.m4585g(this.f2853d.isDone());
        try {
            this.f2853d.get();
            executor.execute(new C0956q0(aVar, surface));
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new C0960r0(aVar, surface));
        }
    }

    /* renamed from: p */
    public void mo3299p(Executor executor, C1019h hVar) {
        this.f2859j = hVar;
        this.f2860k = executor;
        C1018g gVar = this.f2858i;
        if (gVar != null) {
            executor.execute(new C0964s0(hVar, gVar));
        }
    }

    /* renamed from: q */
    public void mo3300q(C1018g gVar) {
        this.f2858i = gVar;
        C1019h hVar = this.f2859j;
        if (hVar != null) {
            this.f2860k.execute(new C0973t0(hVar, gVar));
        }
    }

    /* renamed from: r */
    public boolean mo3301r() {
        return this.f2854e.mo6310f(new C0820i1.C0822b("Surface request will not complete."));
    }
}
