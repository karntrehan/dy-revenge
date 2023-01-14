package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.C3637i;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.p132m.C3743a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p174e.p319f.p320a.p335c.p345f.p352g.C6828i1;

/* renamed from: com.google.android.gms.measurement.internal.g9 */
public final class C3894g9 extends C3876f4 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3881f9 f10697c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4002p3 f10698d;

    /* renamed from: e */
    private volatile Boolean f10699e;

    /* renamed from: f */
    private final C4010q f10700f;

    /* renamed from: g */
    private final C4116y9 f10701g;

    /* renamed from: h */
    private final List f10702h = new ArrayList();

    /* renamed from: i */
    private final C4010q f10703i;

    protected C3894g9(C3955l5 l5Var) {
        super(l5Var);
        this.f10701g = new C4116y9(l5Var.mo11936c());
        this.f10697c = new C3881f9(this);
        this.f10700f = new C4019q8(this, l5Var);
        this.f10703i = new C4043s8(this, l5Var);
    }

    /* renamed from: C */
    private final C3844cb m14777C(boolean z) {
        Pair a;
        this.f10651a.mo11937d();
        C4014q3 B = this.f10651a.mo12150B();
        String str = null;
        if (z) {
            C4122z3 b = this.f10651a.mo11935b();
            if (!(b.f10651a.mo12154F().f11109e == null || (a = b.f10651a.mo12154F().f11109e.mo12232a()) == null || a == C4003p4.f11107c)) {
                str = String.valueOf(a.second) + ":" + ((String) a.first);
            }
        }
        return B.mo12317q(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m14778D() {
        mo11931h();
        this.f10651a.mo11935b().mo12548v().mo12477b("Processing queued up service tasks", Integer.valueOf(this.f10702h.size()));
        for (Runnable run : this.f10702h) {
            try {
                run.run();
            } catch (RuntimeException e) {
                this.f10651a.mo11935b().mo12544r().mo12477b("Task exception while flushing queue", e);
            }
        }
        this.f10702h.clear();
        this.f10703i.mo12311b();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m14779E() {
        mo11931h();
        this.f10701g.mo12537b();
        C4010q qVar = this.f10700f;
        this.f10651a.mo12181z();
        qVar.mo12313d(((Long) C3966m3.f10970K.mo12145a((Object) null)).longValue());
    }

    /* renamed from: F */
    private final void m14780F(Runnable runnable) {
        mo11931h();
        if (mo12006z()) {
            runnable.run();
            return;
        }
        int size = this.f10702h.size();
        this.f10651a.mo12181z();
        if (((long) size) >= 1000) {
            this.f10651a.mo11935b().mo12544r().mo12476a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f10702h.add(runnable);
        this.f10703i.mo12313d(60000);
        mo11987P();
    }

    /* renamed from: G */
    private final boolean m14781G() {
        this.f10651a.mo11937d();
        return true;
    }

    /* renamed from: M */
    static /* bridge */ /* synthetic */ void m14786M(C3894g9 g9Var, ComponentName componentName) {
        g9Var.mo11931h();
        if (g9Var.f10698d != null) {
            g9Var.f10698d = null;
            g9Var.f10651a.mo11935b().mo12548v().mo12477b("Disconnected from device MeasurementService", componentName);
            g9Var.mo11931h();
            g9Var.mo11987P();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final boolean mo11983A() {
        mo11931h();
        mo11949i();
        return !mo11984B() || this.f10651a.mo12161N().mo12514o0() >= ((Integer) C3966m3.f11001h0.mo12145a((Object) null)).intValue();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0123  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo11984B() {
        /*
            r6 = this;
            r6.mo11931h()
            r6.mo11949i()
            java.lang.Boolean r0 = r6.f10699e
            if (r0 != 0) goto L_0x0143
            r6.mo11931h()
            r6.mo11949i()
            com.google.android.gms.measurement.internal.l5 r0 = r6.f10651a
            com.google.android.gms.measurement.internal.p4 r0 = r0.mo12154F()
            r0.mo11931h()
            android.content.SharedPreferences r1 = r0.mo12255o()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0034
        L_0x0028:
            android.content.SharedPreferences r0 = r0.mo12255o()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x013d
        L_0x003f:
            com.google.android.gms.measurement.internal.l5 r4 = r6.f10651a
            r4.mo11937d()
            com.google.android.gms.measurement.internal.l5 r4 = r6.f10651a
            com.google.android.gms.measurement.internal.q3 r4 = r4.mo12150B()
            int r4 = r4.mo12315o()
            if (r4 != r1) goto L_0x0053
        L_0x0050:
            r3 = 1
            goto L_0x0105
        L_0x0053:
            com.google.android.gms.measurement.internal.l5 r4 = r6.f10651a
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo11935b()
            com.google.android.gms.measurement.internal.x3 r4 = r4.mo12548v()
            java.lang.String r5 = "Checking service availability"
            r4.mo12476a(r5)
            com.google.android.gms.measurement.internal.l5 r4 = r6.f10651a
            com.google.android.gms.measurement.internal.xa r4 = r4.mo12161N()
            r5 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r4.mo12516p0(r5)
            if (r4 == 0) goto L_0x00f4
            if (r4 == r1) goto L_0x00e4
            r5 = 2
            if (r4 == r5) goto L_0x00c0
            r0 = 3
            if (r4 == r0) goto L_0x00af
            r0 = 9
            if (r4 == r0) goto L_0x00a2
            r0 = 18
            if (r4 == r0) goto L_0x0095
            com.google.android.gms.measurement.internal.l5 r0 = r6.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12549w()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = "Unexpected service status"
            r0.mo12477b(r4, r1)
            goto L_0x00be
        L_0x0095:
            com.google.android.gms.measurement.internal.l5 r0 = r6.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12549w()
            java.lang.String r3 = "Service updating"
            goto L_0x0100
        L_0x00a2:
            com.google.android.gms.measurement.internal.l5 r0 = r6.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12549w()
            java.lang.String r1 = "Service invalid"
            goto L_0x00bb
        L_0x00af:
            com.google.android.gms.measurement.internal.l5 r0 = r6.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12549w()
            java.lang.String r1 = "Service disabled"
        L_0x00bb:
            r0.mo12476a(r1)
        L_0x00be:
            r1 = 0
            goto L_0x0105
        L_0x00c0:
            com.google.android.gms.measurement.internal.l5 r4 = r6.f10651a
            com.google.android.gms.measurement.internal.z3 r4 = r4.mo11935b()
            com.google.android.gms.measurement.internal.x3 r4 = r4.mo12543q()
            java.lang.String r5 = "Service container out of date"
            r4.mo12476a(r5)
            com.google.android.gms.measurement.internal.l5 r4 = r6.f10651a
            com.google.android.gms.measurement.internal.xa r4 = r4.mo12161N()
            int r4 = r4.mo12514o0()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00de
            goto L_0x0105
        L_0x00de:
            if (r0 != 0) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            r1 = 0
        L_0x00e2:
            r3 = r1
            goto L_0x00be
        L_0x00e4:
            com.google.android.gms.measurement.internal.l5 r0 = r6.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12548v()
            java.lang.String r4 = "Service missing"
            r0.mo12476a(r4)
            goto L_0x0105
        L_0x00f4:
            com.google.android.gms.measurement.internal.l5 r0 = r6.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12548v()
            java.lang.String r3 = "Service available"
        L_0x0100:
            r0.mo12476a(r3)
            goto L_0x0050
        L_0x0105:
            if (r3 != 0) goto L_0x0123
            com.google.android.gms.measurement.internal.l5 r0 = r6.f10651a
            com.google.android.gms.measurement.internal.h r0 = r0.mo12181z()
            boolean r0 = r0.mo12015G()
            if (r0 == 0) goto L_0x0123
            com.google.android.gms.measurement.internal.l5 r0 = r6.f10651a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo11935b()
            com.google.android.gms.measurement.internal.x3 r0 = r0.mo12544r()
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.mo12476a(r1)
            goto L_0x013c
        L_0x0123:
            if (r1 == 0) goto L_0x013c
            com.google.android.gms.measurement.internal.l5 r0 = r6.f10651a
            com.google.android.gms.measurement.internal.p4 r0 = r0.mo12154F()
            r0.mo11931h()
            android.content.SharedPreferences r0 = r0.mo12255o()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x013c:
            r1 = r3
        L_0x013d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.f10699e = r0
        L_0x0143:
            java.lang.Boolean r0 = r6.f10699e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3894g9.mo11984B():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final Boolean mo11985J() {
        return this.f10699e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void mo11986O() {
        mo11931h();
        mo11949i();
        C3844cb C = m14777C(true);
        this.f10651a.mo12151C().mo12408r();
        m14780F(new C3983n8(this, C));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo11987P() {
        mo11931h();
        mo11949i();
        if (!mo12006z()) {
            if (mo11984B()) {
                this.f10697c.mo11966c();
            } else if (!this.f10651a.mo12181z().mo12015G()) {
                this.f10651a.mo11937d();
                List<ResolveInfo> queryIntentServices = this.f10651a.mo11938f().getPackageManager().queryIntentServices(new Intent().setClassName(this.f10651a.mo11938f(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    this.f10651a.mo11935b().mo12544r().mo12476a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context f = this.f10651a.mo11938f();
                this.f10651a.mo11937d();
                intent.setComponent(new ComponentName(f, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f10697c.mo11965b(intent);
            }
        }
    }

    /* renamed from: Q */
    public final void mo11988Q() {
        mo11931h();
        mo11949i();
        this.f10697c.mo11967d();
        try {
            C3743a.m14478b().mo11714c(this.f10651a.mo11938f(), this.f10697c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f10698d = null;
    }

    /* renamed from: R */
    public final void mo11989R(C6828i1 i1Var) {
        mo11931h();
        mo11949i();
        m14780F(new C3971m8(this, m14777C(false), i1Var));
    }

    /* renamed from: S */
    public final void mo11990S(AtomicReference atomicReference) {
        mo11931h();
        mo11949i();
        m14780F(new C3958l8(this, atomicReference, m14777C(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final void mo11991T(C6828i1 i1Var, String str, String str2) {
        mo11931h();
        mo11949i();
        m14780F(new C4115y8(this, str, str2, m14777C(false), i1Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final void mo11992U(AtomicReference atomicReference, String str, String str2, String str3) {
        mo11931h();
        mo11949i();
        m14780F(new C4103x8(this, atomicReference, (String) null, str2, str3, m14777C(false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo11993V(C6828i1 i1Var, String str, String str2, boolean z) {
        mo11931h();
        mo11949i();
        m14780F(new C3906h8(this, str, str2, m14777C(false), z, i1Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo11994W(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        mo11931h();
        mo11949i();
        m14780F(new C4127z8(this, atomicReference, (String) null, str2, str3, m14777C(false), z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo11954n() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo11995o(C4094x xVar, String str) {
        C3705r.m14346k(xVar);
        mo11931h();
        mo11949i();
        m14781G();
        m14780F(new C4079v8(this, true, m14777C(true), this.f10651a.mo12151C().mo12412v(xVar), xVar, str));
    }

    /* renamed from: p */
    public final void mo11996p(C6828i1 i1Var, C4094x xVar, String str) {
        mo11931h();
        mo11949i();
        if (this.f10651a.mo12161N().mo12516p0(C3637i.f10216a) != 0) {
            this.f10651a.mo11935b().mo12549w().mo12476a("Not bundling data. Service unavailable or out of date");
            this.f10651a.mo12161N().mo12490G(i1Var, new byte[0]);
            return;
        }
        m14780F(new C4031r8(this, xVar, str, i1Var));
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo11997q() {
        mo11931h();
        mo11949i();
        C3844cb C = m14777C(false);
        m14781G();
        this.f10651a.mo12151C().mo12407q();
        m14780F(new C3945k8(this, C));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo11998r(C4002p3 p3Var, C3730a aVar, C3844cb cbVar) {
        int i;
        int i2;
        C4098x3 r;
        String str;
        mo11931h();
        mo11949i();
        m14781G();
        this.f10651a.mo12181z();
        int i3 = 0;
        int i4 = 100;
        while (i3 < 1001 && i4 == 100) {
            ArrayList arrayList = new ArrayList();
            List p = this.f10651a.mo12151C().mo12406p(100);
            if (p != null) {
                arrayList.addAll(p);
                i = p.size();
            } else {
                i = 0;
            }
            if (aVar != null && i < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            for (i2 = 0; i2 < size; i2++) {
                C3730a aVar2 = (C3730a) arrayList.get(i2);
                if (aVar2 instanceof C4094x) {
                    try {
                        p3Var.mo11910V((C4094x) aVar2, cbVar);
                    } catch (RemoteException e) {
                        e = e;
                        r = this.f10651a.mo11935b().mo12544r();
                        str = "Failed to send event to the service";
                    }
                } else if (aVar2 instanceof C4045sa) {
                    try {
                        p3Var.mo11923z0((C4045sa) aVar2, cbVar);
                    } catch (RemoteException e2) {
                        e = e2;
                        r = this.f10651a.mo11935b().mo12544r();
                        str = "Failed to send user property to the service";
                    }
                } else if (aVar2 instanceof C3845d) {
                    try {
                        p3Var.mo11905F0((C3845d) aVar2, cbVar);
                    } catch (RemoteException e3) {
                        e = e3;
                        r = this.f10651a.mo11935b().mo12544r();
                        str = "Failed to send conditional user property to the service";
                    }
                } else {
                    this.f10651a.mo11935b().mo12544r().mo12476a("Discarding data. Unrecognized parcel type.");
                }
            }
            i3++;
            i4 = i;
        }
        return;
        r.mo12477b(str, e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo11999s(C3845d dVar) {
        C3705r.m14346k(dVar);
        mo11931h();
        mo11949i();
        this.f10651a.mo11937d();
        m14780F(new C4091w8(this, true, m14777C(true), this.f10651a.mo12151C().mo12411u(dVar), new C3845d(dVar), dVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo12000t(boolean z) {
        mo11931h();
        mo11949i();
        if (z) {
            m14781G();
            this.f10651a.mo12151C().mo12407q();
        }
        if (mo11983A()) {
            m14780F(new C4067u8(this, m14777C(false)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo12001u(C4114y7 y7Var) {
        mo11931h();
        mo11949i();
        m14780F(new C3995o8(this, y7Var));
    }

    /* renamed from: v */
    public final void mo12002v(Bundle bundle) {
        mo11931h();
        mo11949i();
        m14780F(new C4007p8(this, m14777C(false), bundle));
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo12003w() {
        mo11931h();
        mo11949i();
        m14780F(new C4055t8(this, m14777C(true)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo12004x(C4002p3 p3Var) {
        mo11931h();
        C3705r.m14346k(p3Var);
        this.f10698d = p3Var;
        m14779E();
        m14778D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo12005y(C4045sa saVar) {
        mo11931h();
        mo11949i();
        m14781G();
        m14780F(new C3932j8(this, m14777C(true), this.f10651a.mo12151C().mo12413w(saVar), saVar));
    }

    /* renamed from: z */
    public final boolean mo12006z() {
        mo11931h();
        mo11949i();
        return this.f10698d != null;
    }
}
