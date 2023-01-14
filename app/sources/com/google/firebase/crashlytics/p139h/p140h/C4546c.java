package com.google.firebase.crashlytics.p139h.p140h;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.crashlytics.h.h.c */
public class C4546c implements C4545b, C4544a {

    /* renamed from: a */
    private final C4548e f12879a;

    /* renamed from: b */
    private final int f12880b;

    /* renamed from: c */
    private final TimeUnit f12881c;

    /* renamed from: d */
    private final Object f12882d = new Object();

    /* renamed from: e */
    private CountDownLatch f12883e;

    /* renamed from: f */
    private boolean f12884f = false;

    public C4546c(C4548e eVar, int i, TimeUnit timeUnit) {
        this.f12879a = eVar;
        this.f12880b = i;
        this.f12881c = timeUnit;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        com.google.firebase.crashlytics.p139h.C4542f.m17259f().mo14106d("Interrupted while awaiting app exception callback from Analytics listener.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14082a(java.lang.String r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f12882d
            monitor-enter(r0)
            com.google.firebase.crashlytics.h.f r1 = com.google.firebase.crashlytics.p139h.C4542f.m17259f()     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r2.<init>()     // Catch:{ all -> 0x006d }
            java.lang.String r3 = "Logging event "
            r2.append(r3)     // Catch:{ all -> 0x006d }
            r2.append(r6)     // Catch:{ all -> 0x006d }
            java.lang.String r3 = " to Firebase Analytics with params "
            r2.append(r3)     // Catch:{ all -> 0x006d }
            r2.append(r7)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x006d }
            r1.mo14110i(r2)     // Catch:{ all -> 0x006d }
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x006d }
            r2 = 1
            r1.<init>(r2)     // Catch:{ all -> 0x006d }
            r5.f12883e = r1     // Catch:{ all -> 0x006d }
            r1 = 0
            r5.f12884f = r1     // Catch:{ all -> 0x006d }
            com.google.firebase.crashlytics.h.h.e r1 = r5.f12879a     // Catch:{ all -> 0x006d }
            r1.mo14082a(r6, r7)     // Catch:{ all -> 0x006d }
            com.google.firebase.crashlytics.h.f r6 = com.google.firebase.crashlytics.p139h.C4542f.m17259f()     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "Awaiting app exception callback from Analytics..."
            r6.mo14110i(r7)     // Catch:{ all -> 0x006d }
            java.util.concurrent.CountDownLatch r6 = r5.f12883e     // Catch:{ InterruptedException -> 0x005f }
            int r7 = r5.f12880b     // Catch:{ InterruptedException -> 0x005f }
            long r3 = (long) r7     // Catch:{ InterruptedException -> 0x005f }
            java.util.concurrent.TimeUnit r7 = r5.f12881c     // Catch:{ InterruptedException -> 0x005f }
            boolean r6 = r6.await(r3, r7)     // Catch:{ InterruptedException -> 0x005f }
            if (r6 == 0) goto L_0x0055
            r5.f12884f = r2     // Catch:{ InterruptedException -> 0x005f }
            com.google.firebase.crashlytics.h.f r6 = com.google.firebase.crashlytics.p139h.C4542f.m17259f()     // Catch:{ InterruptedException -> 0x005f }
            java.lang.String r7 = "App exception callback received from Analytics listener."
            r6.mo14110i(r7)     // Catch:{ InterruptedException -> 0x005f }
            goto L_0x0068
        L_0x0055:
            com.google.firebase.crashlytics.h.f r6 = com.google.firebase.crashlytics.p139h.C4542f.m17259f()     // Catch:{ InterruptedException -> 0x005f }
            java.lang.String r7 = "Timeout exceeded while awaiting app exception callback from Analytics listener."
            r6.mo14112k(r7)     // Catch:{ InterruptedException -> 0x005f }
            goto L_0x0068
        L_0x005f:
            com.google.firebase.crashlytics.h.f r6 = com.google.firebase.crashlytics.p139h.C4542f.m17259f()     // Catch:{ all -> 0x006d }
            java.lang.String r7 = "Interrupted while awaiting app exception callback from Analytics listener."
            r6.mo14106d(r7)     // Catch:{ all -> 0x006d }
        L_0x0068:
            r6 = 0
            r5.f12883e = r6     // Catch:{ all -> 0x006d }
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            return
        L_0x006d:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.p139h.p140h.C4546c.mo14082a(java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: l */
    public void mo14114l(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f12883e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
