package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p174e.p319f.p320a.p322b.p323i.C6583p;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6501j0;
import p174e.p319f.p320a.p322b.p323i.p328d0.C6563a;
import p174e.p319f.p320a.p322b.p323i.p333y.C6610a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.s */
public class C3411s implements C3421y {

    /* renamed from: a */
    private final Context f9654a;

    /* renamed from: b */
    private final C6501j0 f9655b;

    /* renamed from: c */
    private final C3412t f9656c;

    public C3411s(Context context, C6501j0 j0Var, C3412t tVar) {
        this.f9654a = context;
        this.f9655b = j0Var;
        this.f9656c = tVar;
    }

    /* renamed from: d */
    private boolean m13292d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo10984a(C6583p pVar, int i) {
        mo10985b(pVar, i, false);
    }

    /* renamed from: b */
    public void mo10985b(C6583p pVar, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f9654a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f9654a.getSystemService("jobscheduler");
        int c = mo11002c(pVar);
        if (z || !m13292d(jobScheduler, c, i)) {
            long f0 = this.f9655b.mo19280f0(pVar);
            JobInfo.Builder c2 = this.f9656c.mo11003c(new JobInfo.Builder(c, componentName), pVar.mo19358d(), f0, i);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", pVar.mo19356b());
            persistableBundle.putInt("priority", C6563a.m25102a(pVar.mo19358d()));
            if (pVar.mo19357c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(pVar.mo19357c(), 0));
            }
            c2.setExtras(persistableBundle);
            C6610a.m25243c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(c), Long.valueOf(this.f9656c.mo11004g(pVar.mo19358d(), f0, i)), Long.valueOf(f0), Integer.valueOf(i));
            jobScheduler.schedule(c2.build());
            return;
        }
        C6610a.m25242b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo11002c(C6583p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f9654a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(pVar.mo19356b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C6563a.m25102a(pVar.mo19358d())).array());
        if (pVar.mo19357c() != null) {
            adler32.update(pVar.mo19357c());
        }
        return (int) adler32.getValue();
    }
}
