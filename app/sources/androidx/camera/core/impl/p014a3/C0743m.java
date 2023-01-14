package androidx.camera.core.impl.p014a3;

import android.os.Looper;
import androidx.core.util.C1177h;

/* renamed from: androidx.camera.core.impl.a3.m */
public final class C0743m {
    /* renamed from: a */
    public static void m3042a() {
        C1177h.m4586h(m3043b(), "Not in application's main thread");
    }

    /* renamed from: b */
    public static boolean m3043b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
