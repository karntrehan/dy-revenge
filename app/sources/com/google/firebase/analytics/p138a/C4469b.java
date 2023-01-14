package com.google.firebase.analytics.p138a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.measurement.p135a.C3800a;
import com.google.firebase.C4824g;
import com.google.firebase.C4825h;
import com.google.firebase.analytics.connector.internal.C4475b;
import com.google.firebase.analytics.connector.internal.C4477d;
import com.google.firebase.analytics.connector.internal.C4479f;
import com.google.firebase.analytics.p138a.C4466a;
import com.google.firebase.p160n.C4907a;
import com.google.firebase.p160n.C4910d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p174e.p319f.p320a.p335c.p345f.p352g.C7037v2;

/* renamed from: com.google.firebase.analytics.a.b */
public class C4469b implements C4466a {

    /* renamed from: a */
    private static volatile C4466a f12750a;

    /* renamed from: b */
    final C3800a f12751b;

    /* renamed from: c */
    final Map f12752c = new ConcurrentHashMap();

    /* renamed from: com.google.firebase.analytics.a.b$a */
    class C4470a implements C4466a.C4467a {

        /* renamed from: a */
        final /* synthetic */ String f12753a;

        C4470a(String str) {
            this.f12753a = str;
        }
    }

    C4469b(C3800a aVar) {
        C3705r.m14346k(aVar);
        this.f12751b = aVar;
    }

    /* renamed from: c */
    public static C4466a m17063c(C4825h hVar, Context context, C4910d dVar) {
        C3705r.m14346k(hVar);
        C3705r.m14346k(context);
        C3705r.m14346k(dVar);
        C3705r.m14346k(context.getApplicationContext());
        if (f12750a == null) {
            synchronized (C4469b.class) {
                if (f12750a == null) {
                    Bundle bundle = new Bundle(1);
                    if (hVar.mo14739v()) {
                        dVar.mo14061a(C4824g.class, C4471c.f12755f, C4472d.f12756a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", hVar.mo14738u());
                    }
                    f12750a = new C4469b(C7037v2.m26770r(context, (String) null, (String) null, (String) null, bundle).mo20305o());
                }
            }
        }
        return f12750a;
    }

    /* renamed from: d */
    static /* synthetic */ void m17064d(C4907a aVar) {
        boolean z = ((C4824g) aVar.mo14909a()).f13581a;
        synchronized (C4469b.class) {
            ((C4469b) C3705r.m14346k(f12750a)).f12751b.mo11786c(z);
        }
    }

    /* renamed from: e */
    private final boolean m17065e(String str) {
        return !str.isEmpty() && this.f12752c.containsKey(str) && this.f12752c.get(str) != null;
    }

    /* renamed from: a */
    public void mo14000a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C4475b.m17087f(str) && C4475b.m17085d(str2, bundle) && C4475b.m17084c(str, str2, bundle)) {
            C4475b.m17083b(str, str2, bundle);
            this.f12751b.mo11784a(str, str2, bundle);
        }
    }

    /* renamed from: b */
    public C4466a.C4467a mo14001b(String str, C4466a.C4468b bVar) {
        C3705r.m14346k(bVar);
        if (!C4475b.m17087f(str) || m17065e(str)) {
            return null;
        }
        C3800a aVar = this.f12751b;
        Object dVar = "fiam".equals(str) ? new C4477d(aVar, bVar) : ("crash".equals(str) || "clx".equals(str)) ? new C4479f(aVar, bVar) : null;
        if (dVar == null) {
            return null;
        }
        this.f12752c.put(str, dVar);
        return new C4470a(str);
    }
}
