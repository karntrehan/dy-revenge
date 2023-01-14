package androidx.camera.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.C0783b0;
import androidx.camera.core.impl.C0795d1;
import androidx.camera.core.impl.C0800e1;
import androidx.camera.core.impl.C0820i1;
import androidx.camera.core.impl.C0859p2;
import androidx.camera.core.impl.C0889u1;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import java.util.concurrent.ScheduledExecutorService;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.u2 */
final class C0985u2 extends C0820i1 {

    /* renamed from: m */
    final Object f2761m = new Object();

    /* renamed from: n */
    private final C0889u1.C0890a f2762n;

    /* renamed from: o */
    boolean f2763o;

    /* renamed from: p */
    private final Size f2764p;

    /* renamed from: q */
    final C0953p2 f2765q;

    /* renamed from: r */
    final Surface f2766r;

    /* renamed from: s */
    private final Handler f2767s;

    /* renamed from: t */
    final C0800e1 f2768t;

    /* renamed from: u */
    final C0795d1 f2769u;

    /* renamed from: v */
    private final C0783b0 f2770v;

    /* renamed from: w */
    private final C0820i1 f2771w;

    /* renamed from: x */
    private String f2772x;

    /* renamed from: androidx.camera.core.u2$a */
    class C0986a implements C0765d<Surface> {
        C0986a() {
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            C0949o2.m3691d("ProcessingSurfaceTextur", "Failed to extract Listenable<Surface>.", th);
        }

        /* renamed from: c */
        public void mo1980a(Surface surface) {
            synchronized (C0985u2.this.f2761m) {
                C0985u2.this.f2769u.mo2708a(surface, 1);
            }
        }
    }

    C0985u2(int i, int i2, int i3, Handler handler, C0800e1 e1Var, C0795d1 d1Var, C0820i1 i1Var, String str) {
        super(new Size(i, i2), i3);
        C0942n0 n0Var = new C0942n0(this);
        this.f2762n = n0Var;
        this.f2763o = false;
        Size size = new Size(i, i2);
        this.f2764p = size;
        if (handler != null) {
            this.f2767s = handler;
        } else {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                this.f2767s = new Handler(myLooper);
            } else {
                throw new IllegalStateException("Creating a ProcessingSurface requires a non-null Handler, or be created  on a thread with a Looper.");
            }
        }
        ScheduledExecutorService f = C0744a.m3049f(this.f2767s);
        C0953p2 p2Var = new C0953p2(i, i2, i3, 2);
        this.f2765q = p2Var;
        p2Var.mo2643j(n0Var, f);
        this.f2766r = p2Var.mo2634b();
        this.f2770v = p2Var.mo3194n();
        this.f2769u = d1Var;
        d1Var.mo2709b(size);
        this.f2768t = e1Var;
        this.f2771w = i1Var;
        this.f2772x = str;
        C0768f.m3075a(i1Var.mo3006f(), new C0986a(), C0744a.m3044a());
        mo3007g().mo2919e(new C0937m0(this), C0744a.m3044a());
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void mo3258t(C0889u1 u1Var) {
        synchronized (this.f2761m) {
            mo3257q(u1Var);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m3823u() {
        synchronized (this.f2761m) {
            if (!this.f2763o) {
                this.f2765q.close();
                this.f2766r.release();
                this.f2771w.mo3001a();
                this.f2763o = true;
            }
        }
    }

    /* renamed from: n */
    public C9172b<Surface> mo3011n() {
        C9172b<Surface> g;
        synchronized (this.f2761m) {
            g = C0768f.m3081g(this.f2766r);
        }
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0783b0 mo3256p() {
        C0783b0 b0Var;
        synchronized (this.f2761m) {
            if (!this.f2763o) {
                b0Var = this.f2770v;
            } else {
                throw new IllegalStateException("ProcessingSurface already released!");
            }
        }
        return b0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo3257q(C0889u1 u1Var) {
        if (!this.f2763o) {
            ImageProxy imageProxy = null;
            try {
                imageProxy = u1Var.mo2642i();
            } catch (IllegalStateException e) {
                C0949o2.m3691d("ProcessingSurfaceTextur", "Failed to acquire next image.", e);
            }
            if (imageProxy != null) {
                C0927j2 U = imageProxy.mo2537U();
                if (U == null) {
                    imageProxy.close();
                    return;
                }
                Integer num = (Integer) U.mo2693c().mo3114c(this.f2772x);
                if (num == null) {
                    imageProxy.close();
                } else if (this.f2768t.mo2980a() != num.intValue()) {
                    C0949o2.m3698k("ProcessingSurfaceTextur", "ImageProxyBundle does not contain this id: " + num);
                    imageProxy.close();
                } else {
                    C0859p2 p2Var = new C0859p2(imageProxy, this.f2772x);
                    this.f2769u.mo2710c(p2Var);
                    p2Var.mo3084c();
                }
            }
        }
    }
}
