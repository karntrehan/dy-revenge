package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.C0627c2;
import androidx.camera.core.impl.C0889u1;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.v2 */
class C0991v2 implements C0889u1 {

    /* renamed from: a */
    private final Object f2799a = new Object();

    /* renamed from: b */
    private int f2800b = 0;

    /* renamed from: c */
    private boolean f2801c = false;

    /* renamed from: d */
    private final C0889u1 f2802d;

    /* renamed from: e */
    private final Surface f2803e;

    /* renamed from: f */
    private final C0627c2.C0628a f2804f = new C0951p0(this);

    C0991v2(C0889u1 u1Var) {
        this.f2802d = u1Var;
        this.f2803e = u1Var.mo2634b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void mo3268k(ImageProxy imageProxy) {
        synchronized (this.f2799a) {
            int i = this.f2800b - 1;
            this.f2800b = i;
            if (this.f2801c && i == 0) {
                close();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void mo3269m(C0889u1.C0890a aVar, C0889u1 u1Var) {
        aVar.mo2595a(this);
    }

    /* renamed from: o */
    private ImageProxy m3850o(ImageProxy imageProxy) {
        if (imageProxy == null) {
            return null;
        }
        this.f2800b++;
        C1007y2 y2Var = new C1007y2(imageProxy);
        y2Var.mo2623a(this.f2804f);
        return y2Var;
    }

    /* renamed from: b */
    public Surface mo2634b() {
        Surface b;
        synchronized (this.f2799a) {
            b = this.f2802d.mo2634b();
        }
        return b;
    }

    /* renamed from: c */
    public int mo2635c() {
        int c;
        synchronized (this.f2799a) {
            c = this.f2802d.mo2635c();
        }
        return c;
    }

    public void close() {
        synchronized (this.f2799a) {
            Surface surface = this.f2803e;
            if (surface != null) {
                surface.release();
            }
            this.f2802d.close();
        }
    }

    /* renamed from: d */
    public int mo2637d() {
        int d;
        synchronized (this.f2799a) {
            d = this.f2802d.mo2637d();
        }
        return d;
    }

    /* renamed from: e */
    public int mo2638e() {
        int e;
        synchronized (this.f2799a) {
            e = this.f2802d.mo2638e();
        }
        return e;
    }

    /* renamed from: f */
    public int mo2639f() {
        int f;
        synchronized (this.f2799a) {
            f = this.f2802d.mo2639f();
        }
        return f;
    }

    /* renamed from: g */
    public ImageProxy mo2640g() {
        ImageProxy o;
        synchronized (this.f2799a) {
            o = m3850o(this.f2802d.mo2640g());
        }
        return o;
    }

    /* renamed from: h */
    public void mo2641h() {
        synchronized (this.f2799a) {
            this.f2802d.mo2641h();
        }
    }

    /* renamed from: i */
    public ImageProxy mo2642i() {
        ImageProxy o;
        synchronized (this.f2799a) {
            o = m3850o(this.f2802d.mo2642i());
        }
        return o;
    }

    /* renamed from: j */
    public void mo2643j(C0889u1.C0890a aVar, Executor executor) {
        synchronized (this.f2799a) {
            this.f2802d.mo2643j(new C0947o0(this, aVar), executor);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3270n() {
        synchronized (this.f2799a) {
            this.f2801c = true;
            this.f2802d.mo2641h();
            if (this.f2800b == 0) {
                close();
            }
        }
    }
}
