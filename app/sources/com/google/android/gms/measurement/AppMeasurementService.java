package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C3984n9;
import com.google.android.gms.measurement.internal.C3996o9;
import p027c.p090q.p091a.C2067a;

public final class AppMeasurementService extends Service implements C3984n9 {

    /* renamed from: f */
    private C3996o9 f10491f;

    /* renamed from: d */
    private final C3996o9 m14589d() {
        if (this.f10491f == null) {
            this.f10491f = new C3996o9(this);
        }
        return this.f10491f;
    }

    /* renamed from: a */
    public final boolean mo11767a(int i) {
        return stopSelfResult(i);
    }

    /* renamed from: b */
    public final void mo11768b(Intent intent) {
        C2067a.m8876b(intent);
    }

    /* renamed from: c */
    public final void mo11769c(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    public IBinder onBind(Intent intent) {
        return m14589d().mo12245b(intent);
    }

    public void onCreate() {
        super.onCreate();
        m14589d().mo12248e();
    }

    public void onDestroy() {
        m14589d().mo12249f();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        m14589d().mo12250g(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        m14589d().mo12244a(intent, i, i2);
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        m14589d().mo12253j(intent);
        return true;
    }
}
