package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import p174e.p319f.p320a.p335c.p345f.p352g.C7019u0;
import p174e.p319f.p320a.p335c.p345f.p352g.C7035v0;

/* renamed from: com.google.android.gms.measurement.internal.aa */
public final class C3817aa extends C3843ca {

    /* renamed from: d */
    private final AlarmManager f10521d = ((AlarmManager) this.f10651a.mo11938f().getSystemService("alarm"));

    /* renamed from: e */
    private C4010q f10522e;

    /* renamed from: f */
    private Integer f10523f;

    protected C3817aa(C4009pa paVar) {
        super(paVar);
    }

    /* renamed from: o */
    private final int m14625o() {
        if (this.f10523f == null) {
            this.f10523f = Integer.valueOf("measurement".concat(String.valueOf(this.f10651a.mo11938f().getPackageName())).hashCode());
        }
        return this.f10523f.intValue();
    }

    /* renamed from: p */
    private final PendingIntent m14626p() {
        Context f = this.f10651a.mo11938f();
        return PendingIntent.getBroadcast(f, 0, new Intent().setClassName(f, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C7019u0.f18977a);
    }

    /* renamed from: q */
    private final C4010q m14627q() {
        if (this.f10522e == null) {
            this.f10522e = new C4128z9(this, this.f10552b.mo12282c0());
        }
        return this.f10522e;
    }

    @TargetApi(24)
    /* renamed from: r */
    private final void m14628r() {
        JobScheduler jobScheduler = (JobScheduler) this.f10651a.mo11938f().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m14625o());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo11853l() {
        AlarmManager alarmManager = this.f10521d;
        if (alarmManager != null) {
            alarmManager.cancel(m14626p());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m14628r();
        return false;
    }

    /* renamed from: m */
    public final void mo11854m() {
        mo11893i();
        this.f10651a.mo11935b().mo12548v().mo12476a("Unscheduling upload");
        AlarmManager alarmManager = this.f10521d;
        if (alarmManager != null) {
            alarmManager.cancel(m14626p());
        }
        m14627q().mo12311b();
        if (Build.VERSION.SDK_INT >= 24) {
            m14628r();
        }
    }

    /* renamed from: n */
    public final void mo11855n(long j) {
        mo11893i();
        this.f10651a.mo11937d();
        Context f = this.f10651a.mo11938f();
        if (!C4105xa.m15396Y(f)) {
            this.f10651a.mo11935b().mo12543q().mo12476a("Receiver not registered/enabled");
        }
        if (!C4105xa.m15397Z(f, false)) {
            this.f10651a.mo11935b().mo12543q().mo12476a("Service not registered/enabled");
        }
        mo11854m();
        this.f10651a.mo11935b().mo12548v().mo12477b("Scheduling upload, millis", Long.valueOf(j));
        long b = this.f10651a.mo11936c().mo11731b() + j;
        this.f10651a.mo12181z();
        if (j < Math.max(0, ((Long) C3966m3.f11034y.mo12145a((Object) null)).longValue()) && !m14627q().mo12314e()) {
            m14627q().mo12313d(j);
        }
        this.f10651a.mo11937d();
        if (Build.VERSION.SDK_INT >= 24) {
            Context f2 = this.f10651a.mo11938f();
            ComponentName componentName = new ComponentName(f2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int o = m14625o();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            C7035v0.m26758a(f2, new JobInfo.Builder(o, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.f10521d;
        if (alarmManager != null) {
            this.f10651a.mo12181z();
            alarmManager.setInexactRepeating(2, b, Math.max(((Long) C3966m3.f11024t.mo12145a((Object) null)).longValue(), j), m14626p());
        }
    }
}
