package androidx.camera.core;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.camera.core.d */
public final /* synthetic */ class C0631d implements RejectedExecutionHandler {

    /* renamed from: a */
    public static final /* synthetic */ C0631d f2054a = new C0631d();

    private /* synthetic */ C0631d() {
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        C0949o2.m3690c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }
}
