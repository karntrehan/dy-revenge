package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C3984n9;
import com.google.android.gms.measurement.internal.C3996o9;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements C3984n9 {

    /* renamed from: f */
    private C3996o9 f10489f;

    /* renamed from: d */
    private final C3996o9 m14584d() {
        if (this.f10489f == null) {
            this.f10489f = new C3996o9(this);
        }
        return this.f10489f;
    }

    /* renamed from: a */
    public final boolean mo11767a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo11768b(Intent intent) {
    }

    @TargetApi(24)
    /* renamed from: c */
    public final void mo11769c(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    public void onCreate() {
        super.onCreate();
        m14584d().mo12248e();
    }

    public void onDestroy() {
        m14584d().mo12249f();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        m14584d().mo12250g(intent);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        m14584d().mo12252i(jobParameters);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public boolean onUnbind(Intent intent) {
        m14584d().mo12253j(intent);
        return true;
    }
}
