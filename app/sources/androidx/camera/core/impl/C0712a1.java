package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C0965s1;

/* renamed from: androidx.camera.core.impl.a1 */
public final class C0712a1 {

    /* renamed from: androidx.camera.core.impl.a1$a */
    public static class C0713a extends Exception {
        public C0713a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: a */
    public static void m2953a(Context context, C0904x0 x0Var, C0965s1 s1Var) {
        Integer num;
        if (s1Var != null) {
            try {
                num = s1Var.mo3215d();
                if (num == null) {
                    C0949o2.m3698k("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e) {
                C0949o2.m3691d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e);
                return;
            }
        } else {
            num = null;
        }
        C0949o2.m3688a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + num);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (s1Var == null || num.intValue() == 1)) {
                C0965s1.f2707b.mo3216e(x0Var.mo3145a());
            }
            if (!packageManager.hasSystemFeature("android.hardware.camera.front")) {
                return;
            }
            if (s1Var == null || num.intValue() == 0) {
                C0965s1.f2706a.mo3216e(x0Var.mo3145a());
            }
        } catch (IllegalArgumentException e2) {
            C0949o2.m3690c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + x0Var.mo3145a());
            throw new C0713a("Expected camera missing from device.", e2);
        }
    }
}
