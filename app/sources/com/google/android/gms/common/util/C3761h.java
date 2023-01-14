package com.google.android.gms.common.util;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.h */
public class C3761h implements C3758e {

    /* renamed from: a */
    private static final C3761h f10444a = new C3761h();

    private C3761h() {
    }

    /* renamed from: c */
    public static C3758e m14511c() {
        return f10444a;
    }

    /* renamed from: a */
    public final long mo11730a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public final long mo11731b() {
        return SystemClock.elapsedRealtime();
    }

    public final long nanoTime() {
        return System.nanoTime();
    }
}
