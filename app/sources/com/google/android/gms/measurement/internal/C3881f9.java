package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.internal.C3651c;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.p132m.C3743a;

/* renamed from: com.google.android.gms.measurement.internal.f9 */
public final class C3881f9 implements ServiceConnection, C3651c.C3652a, C3651c.C3653b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile boolean f10674a;

    /* renamed from: b */
    private volatile C4074v3 f10675b;

    /* renamed from: c */
    final /* synthetic */ C3894g9 f10676c;

    protected C3881f9(C3894g9 g9Var) {
        this.f10676c = g9Var;
    }

    /* renamed from: b */
    public final void mo11965b(Intent intent) {
        this.f10676c.mo11931h();
        Context f = this.f10676c.f10651a.mo11938f();
        C3743a b = C3743a.m14478b();
        synchronized (this) {
            if (this.f10674a) {
                this.f10676c.f10651a.mo11935b().mo12548v().mo12476a("Connection attempt already in progress");
                return;
            }
            this.f10676c.f10651a.mo11935b().mo12548v().mo12476a("Using local app measurement service");
            this.f10674a = true;
            b.mo11713a(f, intent, this.f10676c.f10697c, 129);
        }
    }

    /* renamed from: c */
    public final void mo11966c() {
        this.f10676c.mo11931h();
        Context f = this.f10676c.f10651a.mo11938f();
        synchronized (this) {
            if (this.f10674a) {
                this.f10676c.f10651a.mo11935b().mo12548v().mo12476a("Connection attempt already in progress");
            } else if (this.f10675b == null || (!this.f10675b.mo11550f() && !this.f10675b.mo11546a())) {
                this.f10675b = new C4074v3(f, Looper.getMainLooper(), this, this);
                this.f10676c.f10651a.mo11935b().mo12548v().mo12476a("Connecting to remote service");
                this.f10674a = true;
                C3705r.m14346k(this.f10675b);
                this.f10675b.mo11561v();
            } else {
                this.f10676c.f10651a.mo11935b().mo12548v().mo12476a("Already awaiting connection attempt");
            }
        }
    }

    /* renamed from: d */
    public final void mo11967d() {
        if (this.f10675b != null && (this.f10675b.mo11546a() || this.f10675b.mo11550f())) {
            this.f10675b.mo11553i();
        }
        this.f10675b = null;
    }

    /* renamed from: j */
    public final void mo11565j(int i) {
        C3705r.m14341f("MeasurementServiceConnection.onConnectionSuspended");
        this.f10676c.f10651a.mo11935b().mo12543q().mo12476a("Service connection suspended");
        this.f10676c.f10651a.mo11934a().mo12110z(new C3855d9(this));
    }

    /* renamed from: k */
    public final void mo11567k(C3623b bVar) {
        C3705r.m14341f("MeasurementServiceConnection.onConnectionFailed");
        C4122z3 E = this.f10676c.f10651a.mo12153E();
        if (E != null) {
            E.mo12549w().mo12477b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f10674a = false;
            this.f10675b = null;
        }
        this.f10676c.f10651a.mo11934a().mo12110z(new C3868e9(this));
    }

    /* renamed from: m */
    public final void mo11566m(Bundle bundle) {
        C3705r.m14341f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C3705r.m14346k(this.f10675b);
                this.f10676c.f10651a.mo11934a().mo12110z(new C3842c9(this, (C4002p3) this.f10675b.mo11533I()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f10675b = null;
                this.f10674a = false;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f10676c.f10651a.mo11935b().mo12544r().mo12476a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0065 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C3705r.m14341f(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001e
            r3.f10674a = r4     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.g9 r4 = r3.f10676c     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.l5 r4 = r4.f10651a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo11935b()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.x3 r4 = r4.mo12544r()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo12476a(r5)     // Catch:{ all -> 0x0063 }
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x001e:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0051
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0065 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.C4002p3     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.measurement.internal.p3 r1 = (com.google.android.gms.measurement.internal.C4002p3) r1     // Catch:{ RemoteException -> 0x0065 }
        L_0x0037:
            r0 = r1
            goto L_0x003f
        L_0x0039:
            com.google.android.gms.measurement.internal.n3 r1 = new com.google.android.gms.measurement.internal.n3     // Catch:{ RemoteException -> 0x0065 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0037
        L_0x003f:
            com.google.android.gms.measurement.internal.g9 r5 = r3.f10676c     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.l5 r5 = r5.f10651a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo11935b()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12548v()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo12476a(r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0051:
            com.google.android.gms.measurement.internal.g9 r5 = r3.f10676c     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.l5 r5 = r5.f10651a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo11935b()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12544r()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo12477b(r2, r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0063:
            r4 = move-exception
            goto L_0x00a2
        L_0x0065:
            com.google.android.gms.measurement.internal.g9 r5 = r3.f10676c     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.l5 r5 = r5.f10651a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.z3 r5 = r5.mo11935b()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.x3 r5 = r5.mo12544r()     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo12476a(r1)     // Catch:{ all -> 0x0063 }
        L_0x0076:
            if (r0 != 0) goto L_0x0090
            r3.f10674a = r4     // Catch:{ all -> 0x0063 }
            com.google.android.gms.common.m.a r4 = com.google.android.gms.common.p132m.C3743a.m14478b()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.g9 r5 = r3.f10676c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.l5 r5 = r5.f10651a     // Catch:{ IllegalArgumentException -> 0x00a0 }
            android.content.Context r5 = r5.mo11938f()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.g9 r0 = r3.f10676c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.f9 r0 = r0.f10697c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            r4.mo11714c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x00a0 }
            goto L_0x00a0
        L_0x0090:
            com.google.android.gms.measurement.internal.g9 r4 = r3.f10676c     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.l5 r4 = r4.f10651a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.i5 r4 = r4.mo11934a()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.a9 r5 = new com.google.android.gms.measurement.internal.a9     // Catch:{ all -> 0x0063 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0063 }
            r4.mo12110z(r5)     // Catch:{ all -> 0x0063 }
        L_0x00a0:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3881f9.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C3705r.m14341f("MeasurementServiceConnection.onServiceDisconnected");
        this.f10676c.f10651a.mo11935b().mo12543q().mo12476a("Service disconnected");
        this.f10676c.f10651a.mo11934a().mo12110z(new C3829b9(this, componentName));
    }
}
