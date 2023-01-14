package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p174e.p319f.p320a.p322b.p323i.C6583p;
import p174e.p319f.p320a.p322b.p323i.C6588t;
import p174e.p319f.p320a.p322b.p323i.p328d0.C6563a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    static /* synthetic */ void m13277a() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C6588t.m25183f(context);
        C6583p.C6584a d = C6583p.m25165a().mo19362b(queryParameter).mo19364d(C6563a.m25103b(intValue));
        if (queryParameter2 != null) {
            d.mo19363c(Base64.decode(queryParameter2, 0));
        }
        C6588t.m25181c().mo19392e().mo11020v(d.mo19361a(), i, C3391a.f9611f);
    }
}
