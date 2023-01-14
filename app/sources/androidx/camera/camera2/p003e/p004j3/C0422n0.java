package androidx.camera.camera2.p003e.p004j3;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import androidx.camera.camera2.p003e.p004j3.C0418m0;

/* renamed from: androidx.camera.camera2.e.j3.n0 */
public final /* synthetic */ class C0422n0 {
    /* renamed from: a */
    public static C0418m0.C0420b m1888a(Context context, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        return i >= 29 ? new C0426p0(context) : i >= 28 ? C0424o0.m1889g(context) : C0428q0.m1899f(context, handler);
    }
}
