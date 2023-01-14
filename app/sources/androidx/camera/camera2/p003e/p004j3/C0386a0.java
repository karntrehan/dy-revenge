package androidx.camera.camera2.p003e.p004j3;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: androidx.camera.camera2.e.j3.a0 */
public class C0386a0 extends Exception {

    /* renamed from: f */
    static final Set<Integer> f1485f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{4, 5, 1, 2, 3})));

    /* renamed from: o */
    static final Set<Integer> f1486o = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{10001, 10002})));

    /* renamed from: p */
    private final int f1487p;

    /* renamed from: q */
    private final CameraAccessException f1488q;

    public C0386a0(int i, String str, Throwable th) {
        super(m1789a(i, str), th);
        this.f1487p = i;
        this.f1488q = f1485f.contains(Integer.valueOf(i)) ? new CameraAccessException(i, str, th) : null;
    }

    public C0386a0(int i, Throwable th) {
        super(m1790b(i), th);
        this.f1487p = i;
        this.f1488q = f1485f.contains(Integer.valueOf(i)) ? new CameraAccessException(i, (String) null, th) : null;
    }

    private C0386a0(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f1487p = cameraAccessException.getReason();
        this.f1488q = cameraAccessException;
    }

    /* renamed from: a */
    private static String m1789a(int i, String str) {
        return String.format("%s (%d): %s", new Object[]{m1791c(i), Integer.valueOf(i), str});
    }

    /* renamed from: b */
    private static String m1790b(int i) {
        if (i == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i == 4) {
            return "The camera device is in use already";
        }
        if (i == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    /* renamed from: c */
    private static String m1791c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 1000 ? i != 10001 ? i != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR" : "CAMERA_UNAVAILABLE_DO_NOT_DISTURB" : "CAMERA_DEPRECATED_HAL" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE" : "CAMERA_ERROR" : "CAMERA_DISCONNECTED" : "CAMERA_DISABLED";
    }

    /* renamed from: e */
    public static C0386a0 m1792e(CameraAccessException cameraAccessException) {
        Objects.requireNonNull(cameraAccessException, "cameraAccessException should not be null");
        return new C0386a0(cameraAccessException);
    }

    /* renamed from: d */
    public final int mo2075d() {
        return this.f1487p;
    }
}
