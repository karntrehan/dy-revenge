package androidx.camera.camera2.p003e;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.camera2.e.i2 */
public final class C0377i2 {

    /* renamed from: androidx.camera.camera2.e.i2$a */
    private static final class C0378a extends CameraDevice.StateCallback {

        /* renamed from: a */
        private final List<CameraDevice.StateCallback> f1470a = new ArrayList();

        C0378a(List<CameraDevice.StateCallback> list) {
            for (CameraDevice.StateCallback next : list) {
                if (!(next instanceof C0379b)) {
                    this.f1470a.add(next);
                }
            }
        }

        public void onClosed(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback onClosed : this.f1470a) {
                onClosed.onClosed(cameraDevice);
            }
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback onDisconnected : this.f1470a) {
                onDisconnected.onDisconnected(cameraDevice);
            }
        }

        public void onError(CameraDevice cameraDevice, int i) {
            for (CameraDevice.StateCallback onError : this.f1470a) {
                onError.onError(cameraDevice, i);
            }
        }

        public void onOpened(CameraDevice cameraDevice) {
            for (CameraDevice.StateCallback onOpened : this.f1470a) {
                onOpened.onOpened(cameraDevice);
            }
        }
    }

    /* renamed from: androidx.camera.camera2.e.i2$b */
    static final class C0379b extends CameraDevice.StateCallback {
        C0379b() {
        }

        public void onClosed(CameraDevice cameraDevice) {
        }

        public void onDisconnected(CameraDevice cameraDevice) {
        }

        public void onError(CameraDevice cameraDevice, int i) {
        }

        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    /* renamed from: a */
    public static CameraDevice.StateCallback m1778a(List<CameraDevice.StateCallback> list) {
        return list.isEmpty() ? m1779b() : list.size() == 1 ? list.get(0) : new C0378a(list);
    }

    /* renamed from: b */
    public static CameraDevice.StateCallback m1779b() {
        return new C0379b();
    }
}
