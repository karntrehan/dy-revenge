package com.facebook.common.time;

import android.os.SystemClock;
import p174e.p247e.p253d.p257d.C6052d;

@C6052d
public class AwakeTimeSinceBootClock implements C2317b {
    @C6052d
    private static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    private AwakeTimeSinceBootClock() {
    }

    @C6052d
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @C6052d
    public long now() {
        return SystemClock.uptimeMillis();
    }

    @C6052d
    public long nowNanos() {
        return System.nanoTime();
    }
}
