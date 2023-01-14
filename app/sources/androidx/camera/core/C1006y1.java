package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.C0795d1;
import androidx.camera.core.impl.C0885t1;
import androidx.camera.core.impl.C0889u1;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.core.util.C1177h;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.y1 */
class C1006y1 implements C0795d1 {

    /* renamed from: a */
    private final C0795d1 f2840a;

    /* renamed from: b */
    private final C0795d1 f2841b;

    /* renamed from: c */
    final Executor f2842c;

    /* renamed from: d */
    private final int f2843d;

    /* renamed from: e */
    private C0889u1 f2844e = null;

    /* renamed from: f */
    private C0927j2 f2845f = null;

    C1006y1(C0795d1 d1Var, int i, C0795d1 d1Var2, Executor executor) {
        this.f2840a = d1Var;
        this.f2841b = d1Var2;
        this.f2842c = executor;
        this.f2843d = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void mo3289h(C0889u1 u1Var) {
        ImageProxy i = u1Var.mo2642i();
        try {
            this.f2842c.execute(new C0706i(this, i));
        } catch (RejectedExecutionException unused) {
            C0949o2.m3690c("CaptureProcessorPipeline", "The executor for post-processing might have been shutting down or terminated!");
            i.close();
        }
    }

    /* renamed from: a */
    public void mo2708a(Surface surface, int i) {
        this.f2841b.mo2708a(surface, i);
    }

    /* renamed from: b */
    public void mo2709b(Size size) {
        C0633d1 d1Var = new C0633d1(ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, this.f2843d));
        this.f2844e = d1Var;
        this.f2840a.mo2708a(d1Var.mo2634b(), 35);
        this.f2840a.mo2709b(size);
        this.f2841b.mo2709b(size);
        this.f2844e.mo2643j(new C0690h(this), C0744a.m3044a());
    }

    /* renamed from: c */
    public void mo2710c(C0885t1 t1Var) {
        C9172b<ImageProxy> a = t1Var.mo3082a(t1Var.mo3083b().get(0).intValue());
        C1177h.m4579a(a.isDone());
        try {
            this.f2845f = a.get().mo2537U();
            this.f2840a.mo2710c(t1Var);
        } catch (InterruptedException | ExecutionException unused) {
            throw new IllegalArgumentException("Can not successfully extract ImageProxy from the ImageProxyBundle.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3287d() {
        C0889u1 u1Var = this.f2844e;
        if (u1Var != null) {
            u1Var.mo2641h();
            this.f2844e.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void m3905e(ImageProxy imageProxy) {
        Size size = new Size(imageProxy.mo2541e(), imageProxy.mo2539c());
        C1177h.m4583e(this.f2845f);
        String next = this.f2845f.mo2693c().mo3115d().iterator().next();
        int intValue = ((Integer) this.f2845f.mo2693c().mo3114c(next)).intValue();
        C0997w2 w2Var = new C0997w2(imageProxy, size, this.f2845f);
        this.f2845f = null;
        C1002x2 x2Var = new C1002x2(Collections.singletonList(Integer.valueOf(intValue)), next);
        x2Var.mo3283c(w2Var);
        this.f2841b.mo2710c(x2Var);
    }
}
