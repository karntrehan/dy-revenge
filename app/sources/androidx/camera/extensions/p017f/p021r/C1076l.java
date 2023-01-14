package androidx.camera.extensions.p017f.p021r;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.media.ImageReader;
import android.os.HandlerThread;
import androidx.camera.camera2.p002d.C0304b;
import androidx.camera.camera2.p008f.C0597i;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C0957q1;
import androidx.camera.core.impl.C0806f2;
import androidx.camera.core.impl.C0820i1;
import androidx.camera.core.impl.C0840m2;
import androidx.camera.core.impl.C0850n2;
import androidx.camera.core.impl.C0855o2;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.camera.extensions.f.r.l */
abstract class C1076l implements C0850n2 {

    /* renamed from: a */
    private Map<Integer, ImageReader> f2977a = new HashMap();

    /* renamed from: b */
    private HandlerThread f2978b;

    /* renamed from: c */
    private List<C0820i1> f2979c = new ArrayList();

    /* renamed from: d */
    private final Object f2980d = new Object();

    /* renamed from: e */
    private String f2981e;

    C1076l() {
    }

    /* renamed from: b */
    public final C0840m2 mo3074b(C0957q1 q1Var, C0806f2 f2Var, C0806f2 f2Var2, C0806f2 f2Var3) {
        C0855o2 o2Var;
        List<C0820i1> list;
        C0597i b = C0597i.m2471b(q1Var);
        C1071h i = mo3352i(b.mo2533e(), b.mo2532d(), f2Var, f2Var2, f2Var3);
        synchronized (this.f2980d) {
            for (C1065f next : i.mo3376c()) {
                if (next instanceof C1077m) {
                    o2Var = new C0855o2(((C1077m) next).mo3364b(), next.mo3368a());
                    list = this.f2979c;
                } else if (next instanceof C1074j) {
                    C1074j jVar = (C1074j) next;
                    ImageReader newInstance = ImageReader.newInstance(jVar.mo3356h().getWidth(), jVar.mo3356h().getHeight(), jVar.mo3353d(), jVar.mo3355f());
                    this.f2977a.put(Integer.valueOf(next.mo3368a()), newInstance);
                    o2Var = new C0855o2(newInstance.getSurface(), next.mo3368a());
                    o2Var.mo3007g().mo2919e(new C1057a(newInstance), C0744a.m3044a());
                    list = this.f2979c;
                } else if (next instanceof C1075k) {
                    throw new UnsupportedOperationException("MultiResolutionImageReader not supported");
                }
                list.add(o2Var);
            }
        }
        C0840m2.C0842b bVar = new C0840m2.C0842b();
        synchronized (this.f2980d) {
            for (C0820i1 k : this.f2979c) {
                bVar.mo3046k(k);
            }
        }
        C0304b.C0305a aVar = new C0304b.C0305a();
        for (CaptureRequest.Key next2 : i.mo3374a().keySet()) {
            aVar.mo1889e(next2, i.mo3374a().get(next2));
        }
        bVar.mo3051q(aVar.mo1886a());
        bVar.mo3052r(i.mo3375b());
        HandlerThread handlerThread = new HandlerThread("CameraX-extensions_image_reader");
        this.f2978b = handlerThread;
        handlerThread.start();
        this.f2981e = b.mo2533e();
        C0949o2.m3688a("SessionProcessorBase", "initSession: cameraId=" + this.f2981e);
        return bVar.mo3048m();
    }

    /* renamed from: f */
    public final void mo3078f() {
        C0949o2.m3690c("SessionProcessorBase", "deInitSession: cameraId=" + this.f2981e);
        mo3351h();
        synchronized (this.f2980d) {
            for (C0820i1 a : this.f2979c) {
                a.mo3001a();
            }
            this.f2979c.clear();
            this.f2977a.clear();
        }
        HandlerThread handlerThread = this.f2978b;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f2978b = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo3351h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C1071h mo3352i(String str, Map<String, CameraCharacteristics> map, C0806f2 f2Var, C0806f2 f2Var2, C0806f2 f2Var3);
}
