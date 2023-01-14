package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import p174e.p319f.p320a.p322b.p323i.C6583p;
import p174e.p319f.p320a.p322b.p323i.p324a0.p325j.C6501j0;
import p174e.p319f.p320a.p322b.p323i.p327c0.C6552a;
import p174e.p319f.p320a.p322b.p323i.p328d0.C6563a;
import p174e.p319f.p320a.p322b.p323i.p333y.C6610a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.p */
public class C3406p implements C3421y {

    /* renamed from: a */
    private final Context f9641a;

    /* renamed from: b */
    private final C6501j0 f9642b;

    /* renamed from: c */
    private AlarmManager f9643c;

    /* renamed from: d */
    private final C3412t f9644d;

    /* renamed from: e */
    private final C6552a f9645e;

    C3406p(Context context, C6501j0 j0Var, AlarmManager alarmManager, C6552a aVar, C3412t tVar) {
        this.f9641a = context;
        this.f9642b = j0Var;
        this.f9643c = alarmManager;
        this.f9645e = aVar;
        this.f9644d = tVar;
    }

    public C3406p(Context context, C6501j0 j0Var, C6552a aVar, C3412t tVar) {
        this(context, j0Var, (AlarmManager) context.getSystemService("alarm"), aVar, tVar);
    }

    /* renamed from: a */
    public void mo10984a(C6583p pVar, int i) {
        mo10985b(pVar, i, false);
    }

    /* renamed from: b */
    public void mo10985b(C6583p pVar, int i, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", pVar.mo19356b());
        builder.appendQueryParameter("priority", String.valueOf(C6563a.m25102a(pVar.mo19358d())));
        if (pVar.mo19357c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(pVar.mo19357c(), 0));
        }
        Intent intent = new Intent(this.f9641a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (z || !mo10986c(intent)) {
            long f0 = this.f9642b.mo19280f0(pVar);
            long g = this.f9644d.mo11004g(pVar.mo19358d(), f0, i);
            C6610a.m25243c("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", pVar, Long.valueOf(g), Long.valueOf(f0), Integer.valueOf(i));
            this.f9643c.set(3, this.f9645e.mo19339a() + g, PendingIntent.getBroadcast(this.f9641a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
            return;
        }
        C6610a.m25242b("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo10986c(Intent intent) {
        return PendingIntent.getBroadcast(this.f9641a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912) != null;
    }
}
