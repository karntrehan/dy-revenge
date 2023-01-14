package com.facebook.common.time;

import android.os.SystemClock;
import p174e.p247e.p253d.p257d.C6052d;

@C6052d
public class RealtimeSinceBootClock implements C2317b {

    /* renamed from: a */
    private static final RealtimeSinceBootClock f6844a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @C6052d
    public static RealtimeSinceBootClock get() {
        return f6844a;
    }

    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
