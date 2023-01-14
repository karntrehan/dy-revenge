package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.C3705r;
import p174e.p319f.p320a.p335c.p345f.p352g.C6924o1;

/* renamed from: com.google.android.gms.measurement.internal.o9 */
public final class C3996o9 {

    /* renamed from: a */
    private final Context f11099a;

    public C3996o9(Context context) {
        C3705r.m14346k(context);
        this.f11099a = context;
    }

    /* renamed from: k */
    private final C4122z3 m15108k() {
        return C3955l5.m14977H(this.f11099a, (C6924o1) null, (Long) null).mo11935b();
    }

    /* renamed from: a */
    public final int mo12244a(Intent intent, int i, int i2) {
        C3955l5 H = C3955l5.m14977H(this.f11099a, (C6924o1) null, (Long) null);
        C4122z3 b = H.mo11935b();
        if (intent == null) {
            b.mo12549w().mo12476a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        H.mo11937d();
        b.mo12548v().mo12478c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            mo12251h(new C3959l9(this, i2, b, intent));
        }
        return 2;
    }

    /* renamed from: b */
    public final IBinder mo12245b(Intent intent) {
        if (intent == null) {
            m15108k().mo12544r().mo12476a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C3852d6(C4009pa.m15161f0(this.f11099a), (String) null);
        }
        m15108k().mo12549w().mo12477b("onBind received unknown action", action);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo12246c(int i, C4122z3 z3Var, Intent intent) {
        if (((C3984n9) this.f11099a).mo11767a(i)) {
            z3Var.mo12548v().mo12477b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m15108k().mo12548v().mo12476a("Completed wakeful intent.");
            ((C3984n9) this.f11099a).mo11768b(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo12247d(C4122z3 z3Var, JobParameters jobParameters) {
        z3Var.mo12548v().mo12476a("AppMeasurementJobService processed last upload request.");
        ((C3984n9) this.f11099a).mo11769c(jobParameters, false);
    }

    /* renamed from: e */
    public final void mo12248e() {
        C3955l5 H = C3955l5.m14977H(this.f11099a, (C6924o1) null, (Long) null);
        C4122z3 b = H.mo11935b();
        H.mo11937d();
        b.mo12548v().mo12476a("Local AppMeasurementService is starting up");
    }

    /* renamed from: f */
    public final void mo12249f() {
        C3955l5 H = C3955l5.m14977H(this.f11099a, (C6924o1) null, (Long) null);
        C4122z3 b = H.mo11935b();
        H.mo11937d();
        b.mo12548v().mo12476a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: g */
    public final void mo12250g(Intent intent) {
        if (intent == null) {
            m15108k().mo12544r().mo12476a("onRebind called with null intent");
            return;
        }
        m15108k().mo12548v().mo12477b("onRebind called. action", intent.getAction());
    }

    /* renamed from: h */
    public final void mo12251h(Runnable runnable) {
        C4009pa f0 = C4009pa.m15161f0(this.f11099a);
        f0.mo11934a().mo12110z(new C3972m9(this, f0, runnable));
    }

    @TargetApi(24)
    /* renamed from: i */
    public final boolean mo12252i(JobParameters jobParameters) {
        C3955l5 H = C3955l5.m14977H(this.f11099a, (C6924o1) null, (Long) null);
        C4122z3 b = H.mo11935b();
        String string = jobParameters.getExtras().getString("action");
        H.mo11937d();
        b.mo12548v().mo12477b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        mo12251h(new C3946k9(this, b, jobParameters));
        return true;
    }

    /* renamed from: j */
    public final boolean mo12253j(Intent intent) {
        if (intent == null) {
            m15108k().mo12544r().mo12476a("onUnbind called with null intent");
            return true;
        }
        m15108k().mo12548v().mo12477b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
