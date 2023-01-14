package androidx.camera.camera2.p003e;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.camera2.p003e.C0542u1;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import androidx.camera.core.C0640d3;
import androidx.camera.core.C0938m1;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.camera.core.p009e3.C0653f;
import androidx.lifecycle.C1300m;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.camera2.e.h3 */
final class C0371h3 {

    /* renamed from: a */
    private final C0542u1 f1459a;

    /* renamed from: b */
    private final Executor f1460b;

    /* renamed from: c */
    private final C0380i3 f1461c;

    /* renamed from: d */
    private final C1300m<C0640d3> f1462d;

    /* renamed from: e */
    final C0373b f1463e;

    /* renamed from: f */
    private boolean f1464f = false;

    /* renamed from: g */
    private C0542u1.C0545c f1465g = new C0372a();

    /* renamed from: androidx.camera.camera2.e.h3$a */
    class C0372a implements C0542u1.C0545c {
        C0372a() {
        }

        /* renamed from: a */
        public boolean mo1922a(TotalCaptureResult totalCaptureResult) {
            C0371h3.this.f1463e.mo2051a(totalCaptureResult);
            return false;
        }
    }

    /* renamed from: androidx.camera.camera2.e.h3$b */
    interface C0373b {
        /* renamed from: a */
        void mo2051a(TotalCaptureResult totalCaptureResult);

        /* renamed from: b */
        void mo2052b(C0304b.C0305a aVar);

        /* renamed from: c */
        void mo2053c(float f, C1814b.C1815a<Void> aVar);

        /* renamed from: d */
        float mo2054d();

        /* renamed from: e */
        float mo2055e();

        /* renamed from: f */
        Rect mo2056f();

        /* renamed from: g */
        void mo2057g();
    }

    C0371h3(C0542u1 u1Var, C0402g0 g0Var, Executor executor) {
        this.f1459a = u1Var;
        this.f1460b = executor;
        C0373b b = m1755b(g0Var);
        this.f1463e = b;
        C0380i3 i3Var = new C0380i3(b.mo2054d(), b.mo2055e());
        this.f1461c = i3Var;
        i3Var.mo2072f(1.0f);
        this.f1462d = new C1300m<>(C0653f.m2760e(i3Var));
        u1Var.mo2336j(this.f1465g);
    }

    /* renamed from: b */
    private static C0373b m1755b(C0402g0 g0Var) {
        return m1757f(g0Var) ? new C0516p1(g0Var) : new C0535s2(g0Var);
    }

    /* renamed from: d */
    static C0640d3 m1756d(C0402g0 g0Var) {
        C0373b b = m1755b(g0Var);
        C0380i3 i3Var = new C0380i3(b.mo2054d(), b.mo2055e());
        i3Var.mo2072f(1.0f);
        return C0653f.m2760e(i3Var);
    }

    /* renamed from: f */
    private static boolean m1757f(C0402g0 g0Var) {
        return Build.VERSION.SDK_INT >= 30 && g0Var.mo2119a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE) != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object mo2048j(C0640d3 d3Var, C1814b.C1815a aVar) {
        this.f1460b.execute(new C0508n1(this, aVar, d3Var));
        return "setZoomRatio";
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m1758g(C1814b.C1815a<Void> aVar, C0640d3 d3Var) {
        C0640d3 e;
        if (!this.f1464f) {
            synchronized (this.f1461c) {
                this.f1461c.mo2072f(1.0f);
                e = C0653f.m2760e(this.f1461c);
            }
            m1761n(e);
            aVar.mo6310f(new C0938m1.C0939a("Camera is not active."));
            return;
        }
        m1761n(d3Var);
        this.f1463e.mo2053c(d3Var.mo2070c(), aVar);
        this.f1459a.mo2333g0();
    }

    /* renamed from: n */
    private void m1761n(C0640d3 d3Var) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f1462d.mo4316n(d3Var);
        } else {
            this.f1462d.mo4314l(d3Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2044a(C0304b.C0305a aVar) {
        this.f1463e.mo2052b(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Rect mo2045c() {
        return this.f1463e.mo2056f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public LiveData<C0640d3> mo2046e() {
        return this.f1462d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2049k(boolean z) {
        C0640d3 e;
        if (this.f1464f != z) {
            this.f1464f = z;
            if (!z) {
                synchronized (this.f1461c) {
                    this.f1461c.mo2072f(1.0f);
                    e = C0653f.m2760e(this.f1461c);
                }
                m1761n(e);
                this.f1463e.mo2057g();
                this.f1459a.mo2333g0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C9172b<Void> mo2050l(float f) {
        C0640d3 e;
        synchronized (this.f1461c) {
            try {
                this.f1461c.mo2072f(f);
                e = C0653f.m2760e(this.f1461c);
            } catch (IllegalArgumentException e2) {
                return C0768f.m3079e(e2);
            }
        }
        m1761n(e);
        return C1814b.m7736a(new C0512o1(this, e));
    }
}
