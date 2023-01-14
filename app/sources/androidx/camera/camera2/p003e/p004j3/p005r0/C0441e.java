package androidx.camera.camera2.p003e.p004j3.p005r0;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.C1177h;

/* renamed from: androidx.camera.camera2.e.j3.r0.e */
class C0441e extends C0439d {
    C0441e(Surface surface) {
        super((Object) new OutputConfiguration(surface));
    }

    C0441e(Object obj) {
        super(obj);
    }

    /* renamed from: g */
    static C0441e m1927g(OutputConfiguration outputConfiguration) {
        return new C0441e((Object) outputConfiguration);
    }

    /* renamed from: c */
    public String mo2176c() {
        return null;
    }

    /* renamed from: d */
    public void mo2177d(String str) {
        ((OutputConfiguration) mo2178e()).setPhysicalCameraId(str);
    }

    /* renamed from: e */
    public Object mo2178e() {
        C1177h.m4579a(this.f1572a instanceof OutputConfiguration);
        return this.f1572a;
    }
}
