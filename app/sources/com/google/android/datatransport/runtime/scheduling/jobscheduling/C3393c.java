package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.c */
public final /* synthetic */ class C3393c implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ JobInfoSchedulerService f9613f;

    /* renamed from: o */
    public final /* synthetic */ JobParameters f9614o;

    public /* synthetic */ C3393c(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f9613f = jobInfoSchedulerService;
        this.f9614o = jobParameters;
    }

    public final void run() {
        this.f9613f.mo10976b(this.f9614o);
    }
}
