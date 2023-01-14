package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C3486f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p174e.p319f.p320a.p335c.p345f.p350e.C6686j;

/* renamed from: com.google.android.gms.common.internal.m0 */
public final class C3689m0 implements Handler.Callback {

    /* renamed from: a */
    private final C3686l0 f10329a;

    /* renamed from: b */
    private final ArrayList<C3486f.C3488b> f10330b = new ArrayList<>();

    /* renamed from: c */
    final ArrayList<C3486f.C3488b> f10331c = new ArrayList<>();

    /* renamed from: d */
    private final ArrayList<C3486f.C3489c> f10332d = new ArrayList<>();

    /* renamed from: e */
    private volatile boolean f10333e = false;

    /* renamed from: f */
    private final AtomicInteger f10334f = new AtomicInteger(0);

    /* renamed from: g */
    private boolean f10335g = false;

    /* renamed from: h */
    private final Handler f10336h;

    /* renamed from: i */
    private final Object f10337i = new Object();

    public C3689m0(Looper looper, C3686l0 l0Var) {
        this.f10329a = l0Var;
        this.f10336h = new C6686j(looper, this);
    }

    /* renamed from: a */
    public final void mo11625a() {
        this.f10333e = false;
        this.f10334f.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo11626b() {
        this.f10333e = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11627c(com.google.android.gms.common.C3623b r6) {
        /*
            r5 = this;
            android.os.Handler r0 = r5.f10336h
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.C3705r.m14340e(r0, r1)
            android.os.Handler r0 = r5.f10336h
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r5.f10337i
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x004a }
            java.util.ArrayList<com.google.android.gms.common.api.f$c> r2 = r5.f10332d     // Catch:{ all -> 0x004a }
            r1.<init>(r2)     // Catch:{ all -> 0x004a }
            java.util.concurrent.atomic.AtomicInteger r2 = r5.f10334f     // Catch:{ all -> 0x004a }
            int r2 = r2.get()     // Catch:{ all -> 0x004a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004a }
        L_0x0021:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0048
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x004a }
            com.google.android.gms.common.api.f$c r3 = (com.google.android.gms.common.api.C3486f.C3489c) r3     // Catch:{ all -> 0x004a }
            boolean r4 = r5.f10333e     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicInteger r4 = r5.f10334f     // Catch:{ all -> 0x004a }
            int r4 = r4.get()     // Catch:{ all -> 0x004a }
            if (r4 == r2) goto L_0x003a
            goto L_0x0046
        L_0x003a:
            java.util.ArrayList<com.google.android.gms.common.api.f$c> r4 = r5.f10332d     // Catch:{ all -> 0x004a }
            boolean r4 = r4.contains(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0021
            r3.mo11295k(r6)     // Catch:{ all -> 0x004a }
            goto L_0x0021
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3689m0.mo11627c(com.google.android.gms.common.b):void");
    }

    /* renamed from: d */
    public final void mo11628d(Bundle bundle) {
        C3705r.m14340e(this.f10336h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f10337i) {
            C3705r.m14349n(!this.f10335g);
            this.f10336h.removeMessages(1);
            this.f10335g = true;
            C3705r.m14349n(this.f10331c.isEmpty());
            ArrayList arrayList = new ArrayList(this.f10330b);
            int i = this.f10334f.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3486f.C3488b bVar = (C3486f.C3488b) it.next();
                if (!this.f10333e || !this.f10329a.mo11412a()) {
                    break;
                } else if (this.f10334f.get() != i) {
                    break;
                } else if (!this.f10331c.contains(bVar)) {
                    bVar.mo11296m(bundle);
                }
            }
            this.f10331c.clear();
            this.f10335g = false;
        }
    }

    /* renamed from: e */
    public final void mo11629e(int i) {
        C3705r.m14340e(this.f10336h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f10336h.removeMessages(1);
        synchronized (this.f10337i) {
            this.f10335g = true;
            ArrayList arrayList = new ArrayList(this.f10330b);
            int i2 = this.f10334f.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3486f.C3488b bVar = (C3486f.C3488b) it.next();
                if (!this.f10333e) {
                    break;
                } else if (this.f10334f.get() != i2) {
                    break;
                } else if (this.f10330b.contains(bVar)) {
                    bVar.mo11294j(i);
                }
            }
            this.f10331c.clear();
            this.f10335g = false;
        }
    }

    /* renamed from: f */
    public final void mo11630f(C3486f.C3488b bVar) {
        C3705r.m14346k(bVar);
        synchronized (this.f10337i) {
            if (this.f10330b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f10330b.add(bVar);
            }
        }
        if (this.f10329a.mo11412a()) {
            Handler handler = this.f10336h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    /* renamed from: g */
    public final void mo11631g(C3486f.C3489c cVar) {
        C3705r.m14346k(cVar);
        synchronized (this.f10337i) {
            if (this.f10332d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f10332d.add(cVar);
            }
        }
    }

    /* renamed from: h */
    public final void mo11632h(C3486f.C3489c cVar) {
        C3705r.m14346k(cVar);
        synchronized (this.f10337i) {
            if (!this.f10332d.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C3486f.C3488b bVar = (C3486f.C3488b) message.obj;
            synchronized (this.f10337i) {
                if (this.f10333e && this.f10329a.mo11412a() && this.f10330b.contains(bVar)) {
                    bVar.mo11296m((Bundle) null);
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
