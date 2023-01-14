package androidx.camera.core.impl.p014a3;

import androidx.camera.core.C0949o2;

/* renamed from: androidx.camera.core.impl.a3.b */
public final class C0716b {
    /* renamed from: a */
    public static int m2965a(int i, int i2, boolean z) {
        int i3 = (z ? (i2 - i) + 360 : i2 + i) % 360;
        if (C0949o2.m3693f("CameraOrientationUtil")) {
            C0949o2.m3688a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i3)}));
        }
        return i3;
    }

    /* renamed from: b */
    public static int m2966b(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i);
    }
}
