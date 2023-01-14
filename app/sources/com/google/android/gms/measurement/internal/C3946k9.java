package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.k9 */
public final /* synthetic */ class C3946k9 implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ C3996o9 f10863f;

    /* renamed from: o */
    public final /* synthetic */ C4122z3 f10864o;

    /* renamed from: p */
    public final /* synthetic */ JobParameters f10865p;

    public /* synthetic */ C3946k9(C3996o9 o9Var, C4122z3 z3Var, JobParameters jobParameters) {
        this.f10863f = o9Var;
        this.f10864o = z3Var;
        this.f10865p = jobParameters;
    }

    public final void run() {
        this.f10863f.mo12247d(this.f10864o, this.f10865p);
    }
}
