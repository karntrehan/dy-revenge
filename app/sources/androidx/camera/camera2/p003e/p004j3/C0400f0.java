package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.p003e.p004j3.C0402g0;
import java.util.Collections;
import java.util.Set;

/* renamed from: androidx.camera.camera2.e.j3.f0 */
class C0400f0 implements C0402g0.C0403a {

    /* renamed from: a */
    protected final CameraCharacteristics f1517a;

    C0400f0(CameraCharacteristics cameraCharacteristics) {
        this.f1517a = cameraCharacteristics;
    }

    /* renamed from: a */
    public CameraCharacteristics mo2116a() {
        return this.f1517a;
    }

    /* renamed from: b */
    public Set<String> mo2114b() {
        return Collections.emptySet();
    }

    /* renamed from: c */
    public <T> T mo2117c(CameraCharacteristics.Key<T> key) {
        return this.f1517a.get(key);
    }
}
