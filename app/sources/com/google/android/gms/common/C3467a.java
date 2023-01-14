package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C3705r;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.common.a */
public class C3467a implements ServiceConnection {

    /* renamed from: a */
    boolean f9807a = false;

    /* renamed from: b */
    private final BlockingQueue<IBinder> f9808b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder mo11154a(long j, TimeUnit timeUnit) {
        C3705r.m14345j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f9807a) {
            this.f9807a = true;
            IBinder poll = this.f9808b.poll(j, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f9808b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
