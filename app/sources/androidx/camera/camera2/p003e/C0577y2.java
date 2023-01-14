package androidx.camera.camera2.p003e;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import androidx.camera.core.C0608a3;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C0965s1;
import androidx.camera.core.impl.C0714a2;
import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0820i1;
import androidx.camera.core.impl.C0828j2;
import androidx.camera.core.impl.C0840m2;
import androidx.camera.core.impl.C0858p1;
import androidx.camera.core.impl.C0894v1;
import androidx.camera.core.impl.C0902w2;
import androidx.camera.core.impl.C0908x2;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.camera.core.p009e3.C0655h;
import androidx.camera.core.p009e3.C0659l;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* renamed from: androidx.camera.camera2.e.y2 */
class C0577y2 {

    /* renamed from: a */
    private C0820i1 f1897a;

    /* renamed from: b */
    private final C0840m2 f1898b;

    /* renamed from: androidx.camera.camera2.e.y2$a */
    class C0578a implements C0765d<Void> {

        /* renamed from: a */
        final /* synthetic */ Surface f1899a;

        /* renamed from: b */
        final /* synthetic */ SurfaceTexture f1900b;

        C0578a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f1899a = surface;
            this.f1900b = surfaceTexture;
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }

        /* renamed from: c */
        public void mo1980a(Void voidR) {
            this.f1899a.release();
            this.f1900b.release();
        }
    }

    /* renamed from: androidx.camera.camera2.e.y2$b */
    private static class C0579b implements C0908x2<C0608a3> {

        /* renamed from: w */
        private final C0809g1 f1902w;

        C0579b() {
            C0714a2 J = C0714a2.m2954J();
            J.mo2814q(C0908x2.f2603n, new C0348e2());
            this.f1902w = J;
        }

        /* renamed from: B */
        public /* synthetic */ C0965s1 mo2491B(C0965s1 s1Var) {
            return C0902w2.m3558a(this, s1Var);
        }

        /* renamed from: C */
        public /* synthetic */ C0608a3.C0610b mo2492C(C0608a3.C0610b bVar) {
            return C0659l.m2769a(this, bVar);
        }

        /* renamed from: D */
        public /* synthetic */ C0840m2.C0844d mo2493D(C0840m2.C0844d dVar) {
            return C0902w2.m3562e(this, dVar);
        }

        /* renamed from: a */
        public /* synthetic */ Object mo2494a(C0809g1.C0810a aVar) {
            return C0828j2.m3254f(this, aVar);
        }

        /* renamed from: b */
        public /* synthetic */ boolean mo2495b(C0809g1.C0810a aVar) {
            return C0828j2.m3249a(this, aVar);
        }

        /* renamed from: c */
        public /* synthetic */ Set mo2496c() {
            return C0828j2.m3253e(this);
        }

        /* renamed from: d */
        public /* synthetic */ Object mo2497d(C0809g1.C0810a aVar, Object obj) {
            return C0828j2.m3255g(this, aVar, obj);
        }

        /* renamed from: e */
        public /* synthetic */ C0809g1.C0812c mo2498e(C0809g1.C0810a aVar) {
            return C0828j2.m3251c(this, aVar);
        }

        /* renamed from: i */
        public C0809g1 mo2499i() {
            return this.f1902w;
        }

        /* renamed from: j */
        public /* synthetic */ int mo2500j() {
            return C0858p1.m3396a(this);
        }

        /* renamed from: k */
        public /* synthetic */ C0840m2 mo2501k(C0840m2 m2Var) {
            return C0902w2.m3561d(this, m2Var);
        }

        /* renamed from: m */
        public /* synthetic */ void mo2502m(String str, C0809g1.C0811b bVar) {
            C0828j2.m3250b(this, str, bVar);
        }

        /* renamed from: n */
        public /* synthetic */ Object mo2503n(C0809g1.C0810a aVar, C0809g1.C0812c cVar) {
            return C0828j2.m3256h(this, aVar, cVar);
        }

        /* renamed from: o */
        public /* synthetic */ C0788c1.C0790b mo2504o(C0788c1.C0790b bVar) {
            return C0902w2.m3559b(this, bVar);
        }

        /* renamed from: r */
        public /* synthetic */ C0788c1 mo2505r(C0788c1 c1Var) {
            return C0902w2.m3560c(this, c1Var);
        }

        /* renamed from: t */
        public /* synthetic */ String mo2506t(String str) {
            return C0655h.m2765a(this, str);
        }

        /* renamed from: v */
        public /* synthetic */ Set mo2507v(C0809g1.C0810a aVar) {
            return C0828j2.m3252d(this, aVar);
        }

        /* renamed from: x */
        public /* synthetic */ int mo2508x(int i) {
            return C0902w2.m3563f(this, i);
        }
    }

    C0577y2(C0402g0 g0Var) {
        C0579b bVar = new C0579b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size b = m2393b(g0Var);
        C0949o2.m3688a("MeteringRepeating", "MerteringSession SurfaceTexture size: " + b);
        surfaceTexture.setDefaultBufferSize(b.getWidth(), b.getHeight());
        Surface surface = new Surface(surfaceTexture);
        C0840m2.C0842b o = C0840m2.C0842b.m3318o(bVar);
        o.mo3052r(1);
        C0894v1 v1Var = new C0894v1(surface);
        this.f1897a = v1Var;
        C0768f.m3075a(v1Var.mo3007g(), new C0578a(surface, surfaceTexture), C0744a.m3044a());
        o.mo3046k(this.f1897a);
        this.f1898b = o.mo3048m();
    }

    /* renamed from: b */
    private Size m2393b(C0402g0 g0Var) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) g0Var.mo2119a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            C0949o2.m3690c("MeteringRepeating", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            return new Size(0, 0);
        }
        Size[] outputSizes = Build.VERSION.SDK_INT < 23 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(34);
        if (outputSizes != null) {
            return (Size) Collections.min(Arrays.asList(outputSizes), C0568x0.f1873f);
        }
        C0949o2.m3690c("MeteringRepeating", "Can not get output size list.");
        return new Size(0, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2487a() {
        C0949o2.m3688a("MeteringRepeating", "MeteringRepeating clear!");
        C0820i1 i1Var = this.f1897a;
        if (i1Var != null) {
            i1Var.mo3001a();
        }
        this.f1897a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo2488c() {
        return "MeteringRepeating";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0840m2 mo2489d() {
        return this.f1898b;
    }
}
