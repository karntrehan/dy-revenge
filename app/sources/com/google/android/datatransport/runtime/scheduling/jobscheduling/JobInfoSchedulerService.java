package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p174e.p319f.p320a.p322b.p323i.C6583p;
import p174e.p319f.p320a.p322b.p323i.C6588t;
import p174e.p319f.p320a.p322b.p323i.p328d0.C6563a;

public class JobInfoSchedulerService extends JobService {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void mo10976b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C6588t.m25183f(getApplicationContext());
        C6583p.C6584a d = C6583p.m25165a().mo19362b(string).mo19364d(C6563a.m25103b(i));
        if (string2 != null) {
            d.mo19363c(Base64.decode(string2, 0));
        }
        C6588t.m25181c().mo19392e().mo11020v(d.mo19361a(), i2, new C3393c(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
