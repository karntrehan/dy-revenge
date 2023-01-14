package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.z0 */
public abstract class C0921z0 {
    /* renamed from: a */
    public static C0921z0 m3619a(Executor executor, Handler handler) {
        return new C0874s(executor, handler);
    }

    /* renamed from: b */
    public abstract Executor mo3096b();

    /* renamed from: c */
    public abstract Handler mo3097c();
}
