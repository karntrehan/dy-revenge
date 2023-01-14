package com.google.firebase.crashlytics.p139h.p142j;

import android.os.Process;

/* renamed from: com.google.firebase.crashlytics.h.j.j */
public abstract class C4573j implements Runnable {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14151a();

    public final void run() {
        Process.setThreadPriority(10);
        mo14151a();
    }
}
