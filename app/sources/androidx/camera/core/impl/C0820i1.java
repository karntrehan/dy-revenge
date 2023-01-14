package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import java.util.concurrent.atomic.AtomicInteger;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.impl.i1 */
public abstract class C0820i1 {

    /* renamed from: a */
    public static final Size f2434a = new Size(0, 0);

    /* renamed from: b */
    private static final boolean f2435b = C0949o2.m3693f("DeferrableSurface");

    /* renamed from: c */
    private static final AtomicInteger f2436c = new AtomicInteger(0);

    /* renamed from: d */
    private static final AtomicInteger f2437d = new AtomicInteger(0);

    /* renamed from: e */
    private final Object f2438e;

    /* renamed from: f */
    private int f2439f;

    /* renamed from: g */
    private boolean f2440g;

    /* renamed from: h */
    private C1814b.C1815a<Void> f2441h;

    /* renamed from: i */
    private final C9172b<Void> f2442i;

    /* renamed from: j */
    private final Size f2443j;

    /* renamed from: k */
    private final int f2444k;

    /* renamed from: l */
    Class<?> f2445l;

    /* renamed from: androidx.camera.core.impl.i1$a */
    public static final class C0821a extends Exception {

        /* renamed from: f */
        C0820i1 f2446f;

        public C0821a(String str, C0820i1 i1Var) {
            super(str);
            this.f2446f = i1Var;
        }

        /* renamed from: a */
        public C0820i1 mo3013a() {
            return this.f2446f;
        }
    }

    /* renamed from: androidx.camera.core.impl.i1$b */
    public static final class C0822b extends Exception {
        public C0822b(String str) {
            super(str);
        }
    }

    public C0820i1() {
        this(f2434a, 0);
    }

    public C0820i1(Size size, int i) {
        this.f2438e = new Object();
        this.f2439f = 0;
        this.f2440g = false;
        this.f2443j = size;
        this.f2444k = i;
        C9172b<Void> a = C1814b.m7736a(new C0792d(this));
        this.f2442i = a;
        if (C0949o2.m3693f("DeferrableSurface")) {
            m3222m("Surface created", f2437d.incrementAndGet(), f2436c.get());
            a.mo2919e(new C0786c(this, Log.getStackTraceString(new Exception())), C0744a.m3044a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object mo3009j(C1814b.C1815a aVar) {
        synchronized (this.f2438e) {
            this.f2441h = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void mo3010l(String str) {
        try {
            this.f2442i.get();
            m3222m("Surface terminated", f2437d.decrementAndGet(), f2436c.get());
        } catch (Exception e) {
            C0949o2.m3690c("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f2438e) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", new Object[]{this, Boolean.valueOf(this.f2440g), Integer.valueOf(this.f2439f)}), e);
            }
        }
    }

    /* renamed from: m */
    private void m3222m(String str, int i, int i2) {
        if (!f2435b && C0949o2.m3693f("DeferrableSurface")) {
            C0949o2.m3688a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        C0949o2.m3688a("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    /* renamed from: a */
    public final void mo3001a() {
        C1814b.C1815a<Void> aVar;
        synchronized (this.f2438e) {
            if (!this.f2440g) {
                this.f2440g = true;
                if (this.f2439f == 0) {
                    aVar = this.f2441h;
                    this.f2441h = null;
                } else {
                    aVar = null;
                }
                if (C0949o2.m3693f("DeferrableSurface")) {
                    C0949o2.m3688a("DeferrableSurface", "surface closed,  useCount=" + this.f2439f + " closed=true " + this);
                }
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.mo6308c(null);
        }
    }

    /* renamed from: b */
    public void mo3002b() {
        C1814b.C1815a<Void> aVar;
        synchronized (this.f2438e) {
            int i = this.f2439f;
            if (i != 0) {
                int i2 = i - 1;
                this.f2439f = i2;
                if (i2 != 0 || !this.f2440g) {
                    aVar = null;
                } else {
                    aVar = this.f2441h;
                    this.f2441h = null;
                }
                if (C0949o2.m3693f("DeferrableSurface")) {
                    C0949o2.m3688a("DeferrableSurface", "use count-1,  useCount=" + this.f2439f + " closed=" + this.f2440g + " " + this);
                    if (this.f2439f == 0) {
                        m3222m("Surface no longer in use", f2437d.get(), f2436c.decrementAndGet());
                    }
                }
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
        if (aVar != null) {
            aVar.mo6308c(null);
        }
    }

    /* renamed from: c */
    public Class<?> mo3003c() {
        return this.f2445l;
    }

    /* renamed from: d */
    public Size mo3004d() {
        return this.f2443j;
    }

    /* renamed from: e */
    public int mo3005e() {
        return this.f2444k;
    }

    /* renamed from: f */
    public final C9172b<Surface> mo3006f() {
        synchronized (this.f2438e) {
            if (this.f2440g) {
                C9172b<Surface> e = C0768f.m3079e(new C0821a("DeferrableSurface already closed.", this));
                return e;
            }
            C9172b<Surface> n = mo3011n();
            return n;
        }
    }

    /* renamed from: g */
    public C9172b<Void> mo3007g() {
        return C0768f.m3083i(this.f2442i);
    }

    /* renamed from: h */
    public void mo3008h() {
        synchronized (this.f2438e) {
            int i = this.f2439f;
            if (i == 0) {
                if (this.f2440g) {
                    throw new C0821a("Cannot begin use on a closed surface.", this);
                }
            }
            this.f2439f = i + 1;
            if (C0949o2.m3693f("DeferrableSurface")) {
                if (this.f2439f == 1) {
                    m3222m("New surface in use", f2437d.get(), f2436c.incrementAndGet());
                }
                C0949o2.m3688a("DeferrableSurface", "use count+1, useCount=" + this.f2439f + " " + this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract C9172b<Surface> mo3011n();

    /* renamed from: o */
    public void mo3012o(Class<?> cls) {
        this.f2445l = cls;
    }
}
