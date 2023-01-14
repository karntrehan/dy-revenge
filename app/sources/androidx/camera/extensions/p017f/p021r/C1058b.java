package androidx.camera.extensions.p017f.p021r;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.p008f.C0599k;
import androidx.camera.core.impl.C0806f2;
import androidx.camera.core.impl.C0809g1;
import androidx.camera.core.impl.C0836l2;
import androidx.camera.core.impl.C0850n2;
import androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl;
import androidx.camera.extensions.impl.advanced.Camera2SessionConfigImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceImpl;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.camera.extensions.f.r.b */
public class C1058b extends C1076l {

    /* renamed from: f */
    private final SessionProcessorImpl f2950f;

    /* renamed from: g */
    private final Context f2951g;

    /* renamed from: androidx.camera.extensions.f.r.b$a */
    private static class C1059a implements OutputSurfaceImpl {

        /* renamed from: a */
        private final C0806f2 f2952a;

        C1059a(C0806f2 f2Var) {
            this.f2952a = f2Var;
        }
    }

    /* renamed from: androidx.camera.extensions.f.r.b$b */
    private class C1060b implements RequestProcessorImpl {

        /* renamed from: a */
        private final C0836l2 f2953a;

        C1060b(C0836l2 l2Var) {
            this.f2953a = l2Var;
        }
    }

    /* renamed from: androidx.camera.extensions.f.r.b$c */
    private static class C1061c implements SessionProcessorImpl.CaptureCallback {

        /* renamed from: a */
        private final C0850n2.C0851a f2955a;

        C1061c(C0850n2.C0851a aVar) {
            this.f2955a = aVar;
        }
    }

    public C1058b(SessionProcessorImpl sessionProcessorImpl, Context context) {
        this.f2950f = sessionProcessorImpl;
        this.f2951g = context;
    }

    /* renamed from: k */
    private C1071h m4078k(Camera2SessionConfigImpl camera2SessionConfigImpl) {
        C1072i iVar = new C1072i();
        for (Camera2OutputConfigImpl b : camera2SessionConfigImpl.getOutputConfigs()) {
            iVar.mo3377a(C1066g.m4093b(b).mo3369a());
        }
        for (CaptureRequest.Key key : camera2SessionConfigImpl.getSessionParameters().keySet()) {
            iVar.mo3378b(key, camera2SessionConfigImpl.getSessionParameters().get(key));
        }
        iVar.mo3380d(camera2SessionConfigImpl.getSessionTemplateId());
        return iVar.mo3379c();
    }

    /* renamed from: a */
    public void mo3073a(C0836l2 l2Var) {
        this.f2950f.onCaptureSessionStart(new C1060b(l2Var));
    }

    /* renamed from: c */
    public void mo3075c(C0809g1 g1Var) {
        HashMap hashMap = new HashMap();
        C0599k a = C0599k.C0600a.m2485d(g1Var).mo2535a();
        for (C0809g1.C0810a next : a.mo2496c()) {
            hashMap.put((CaptureRequest.Key) next.mo2987d(), a.mo2494a(next));
        }
        this.f2950f.setParameters(hashMap);
    }

    /* renamed from: d */
    public int mo3076d(C0850n2.C0851a aVar) {
        return this.f2950f.startCapture(new C1061c(aVar));
    }

    /* renamed from: e */
    public void mo3077e() {
        this.f2950f.onCaptureSessionEnd();
    }

    /* renamed from: g */
    public int mo3079g(C0850n2.C0851a aVar) {
        return this.f2950f.startRepeating(new C1061c(aVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo3351h() {
        this.f2950f.deInitSession();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C1071h mo3352i(String str, Map<String, CameraCharacteristics> map, C0806f2 f2Var, C0806f2 f2Var2, C0806f2 f2Var3) {
        return m4078k(this.f2950f.initSession(str, map, this.f2951g, new C1059a(f2Var), new C1059a(f2Var2), f2Var3 == null ? null : new C1059a(f2Var3)));
    }
}
