package com.reactnative.ivpusic.imagepicker;

import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableNativeArray;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.reactnative.ivpusic.imagepicker.f */
class C5231f {

    /* renamed from: a */
    private Promise f14744a;

    /* renamed from: b */
    private int f14745b;

    /* renamed from: c */
    private boolean f14746c;

    /* renamed from: d */
    private AtomicInteger f14747d;

    /* renamed from: e */
    private WritableArray f14748e;

    /* renamed from: f */
    private boolean f14749f;

    C5231f() {
    }

    /* renamed from: a */
    private synchronized boolean m19548a() {
        if (this.f14749f) {
            Log.w("image-crop-picker", "Skipping result, already sent...");
            return false;
        } else if (this.f14744a != null) {
            return true;
        } else {
            Log.w("image-crop-picker", "Trying to notify success but promise is not set");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo15833b(String str, String str2) {
        if (m19548a()) {
            Log.e("image-crop-picker", "Promise rejected. " + str2);
            this.f14744a.reject(str, str2);
            this.f14749f = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized void mo15834c(String str, Throwable th) {
        if (m19548a()) {
            Log.e("image-crop-picker", "Promise rejected. " + th.getMessage());
            this.f14744a.reject(str, th);
            this.f14749f = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo15835d(com.facebook.react.bridge.WritableMap r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.m19548a()     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r2)
            return
        L_0x0009:
            boolean r0 = r2.f14746c     // Catch:{ all -> 0x002f }
            r1 = 1
            if (r0 == 0) goto L_0x0027
            com.facebook.react.bridge.WritableArray r0 = r2.f14748e     // Catch:{ all -> 0x002f }
            r0.pushMap(r3)     // Catch:{ all -> 0x002f }
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f14747d     // Catch:{ all -> 0x002f }
            int r3 = r3.addAndGet(r1)     // Catch:{ all -> 0x002f }
            int r0 = r2.f14745b     // Catch:{ all -> 0x002f }
            if (r3 != r0) goto L_0x002d
            com.facebook.react.bridge.Promise r3 = r2.f14744a     // Catch:{ all -> 0x002f }
            com.facebook.react.bridge.WritableArray r0 = r2.f14748e     // Catch:{ all -> 0x002f }
            r3.resolve(r0)     // Catch:{ all -> 0x002f }
        L_0x0024:
            r2.f14749f = r1     // Catch:{ all -> 0x002f }
            goto L_0x002d
        L_0x0027:
            com.facebook.react.bridge.Promise r0 = r2.f14744a     // Catch:{ all -> 0x002f }
            r0.resolve(r3)     // Catch:{ all -> 0x002f }
            goto L_0x0024
        L_0x002d:
            monitor-exit(r2)
            return
        L_0x002f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnative.ivpusic.imagepicker.C5231f.mo15835d(com.facebook.react.bridge.WritableMap):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo15836e(int i) {
        this.f14745b = i;
        this.f14747d = new AtomicInteger(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void mo15837f(Promise promise, boolean z) {
        this.f14744a = promise;
        this.f14746c = z;
        this.f14749f = false;
        this.f14745b = 0;
        this.f14747d = new AtomicInteger(0);
        if (z) {
            this.f14748e = new WritableNativeArray();
        }
    }
}
