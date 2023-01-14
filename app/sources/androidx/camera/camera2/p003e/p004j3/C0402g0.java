package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.camera.camera2.e.j3.g0 */
public class C0402g0 {

    /* renamed from: a */
    private final Map<CameraCharacteristics.Key<?>, Object> f1522a = new HashMap();

    /* renamed from: b */
    private final C0403a f1523b;

    /* renamed from: androidx.camera.camera2.e.j3.g0$a */
    public interface C0403a {
        /* renamed from: a */
        CameraCharacteristics mo2116a();

        /* renamed from: b */
        Set<String> mo2114b();

        /* renamed from: c */
        <T> T mo2117c(CameraCharacteristics.Key<T> key);
    }

    private C0402g0(CameraCharacteristics cameraCharacteristics) {
        this.f1523b = Build.VERSION.SDK_INT >= 28 ? new C0398e0(cameraCharacteristics) : new C0400f0(cameraCharacteristics);
    }

    /* renamed from: c */
    private boolean m1839c(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    /* renamed from: e */
    public static C0402g0 m1840e(CameraCharacteristics cameraCharacteristics) {
        return new C0402g0(cameraCharacteristics);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo2119a(android.hardware.camera2.CameraCharacteristics.Key<T> r3) {
        /*
            r2 = this;
            boolean r0 = r2.m1839c(r3)
            if (r0 == 0) goto L_0x000d
            androidx.camera.camera2.e.j3.g0$a r0 = r2.f1523b
            java.lang.Object r3 = r0.mo2117c(r3)
            return r3
        L_0x000d:
            monitor-enter(r2)
            java.util.Map<android.hardware.camera2.CameraCharacteristics$Key<?>, java.lang.Object> r0 = r2.f1522a     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0018
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            return r0
        L_0x0018:
            androidx.camera.camera2.e.j3.g0$a r0 = r2.f1523b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.mo2117c(r3)     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0025
            java.util.Map<android.hardware.camera2.CameraCharacteristics$Key<?>, java.lang.Object> r1 = r2.f1522a     // Catch:{ all -> 0x0027 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            return r0
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p003e.p004j3.C0402g0.mo2119a(android.hardware.camera2.CameraCharacteristics$Key):java.lang.Object");
    }

    /* renamed from: b */
    public Set<String> mo2120b() {
        return this.f1523b.mo2114b();
    }

    /* renamed from: d */
    public CameraCharacteristics mo2121d() {
        return this.f1523b.mo2116a();
    }
}
