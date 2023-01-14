package com.google.android.gms.common.util.p134p;

import android.os.Process;

/* renamed from: com.google.android.gms.common.util.p.b */
final class C3770b implements Runnable {

    /* renamed from: f */
    private final Runnable f10457f;

    public C3770b(Runnable runnable, int i) {
        this.f10457f = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f10457f.run();
    }
}
