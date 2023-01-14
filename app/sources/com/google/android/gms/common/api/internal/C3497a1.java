package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.api.internal.a1 */
public final /* synthetic */ class C3497a1 implements Executor {

    /* renamed from: f */
    public final /* synthetic */ Handler f9890f;

    public /* synthetic */ C3497a1(Handler handler) {
        this.f9890f = handler;
    }

    public final void execute(Runnable runnable) {
        this.f9890f.post(runnable);
    }
}
