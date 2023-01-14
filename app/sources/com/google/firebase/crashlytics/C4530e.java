package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.p138a.C4466a;
import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.p140h.C4544a;
import com.google.firebase.crashlytics.p139h.p140h.C4546c;
import com.google.firebase.crashlytics.p139h.p140h.C4547d;
import com.google.firebase.crashlytics.p139h.p140h.C4548e;
import com.google.firebase.crashlytics.p139h.p140h.C4549f;
import com.google.firebase.crashlytics.p139h.p141i.C4550a;
import com.google.firebase.crashlytics.p139h.p141i.C4551b;
import com.google.firebase.crashlytics.p139h.p141i.C4552c;
import com.google.firebase.p162p.C4925a;
import com.google.firebase.p162p.C4927b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.crashlytics.e */
public class C4530e {

    /* renamed from: a */
    private final C4925a<C4466a> f12857a;

    /* renamed from: b */
    private volatile C4544a f12858b;

    /* renamed from: c */
    private volatile C4551b f12859c;

    /* renamed from: d */
    private final List<C4550a> f12860d;

    public C4530e(C4925a<C4466a> aVar) {
        this(aVar, new C4552c(), new C4549f());
    }

    public C4530e(C4925a<C4466a> aVar, C4551b bVar, C4544a aVar2) {
        this.f12857a = aVar;
        this.f12859c = bVar;
        this.f12860d = new ArrayList();
        this.f12858b = aVar2;
        m17215c();
    }

    /* renamed from: c */
    private void m17215c() {
        this.f12857a.mo14011a(new C4526a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void mo14086e(String str, Bundle bundle) {
        this.f12858b.mo14082a(str, bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void mo14087g(C4550a aVar) {
        synchronized (this) {
            if (this.f12859c instanceof C4552c) {
                this.f12860d.add(aVar);
            }
            this.f12859c.mo14083a(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void mo14088i(C4927b bVar) {
        C4542f.m17259f().mo14104b("AnalyticsConnector now available.");
        C4466a aVar = (C4466a) bVar.get();
        C4548e eVar = new C4548e(aVar);
        C4531f fVar = new C4531f();
        if (m17219j(aVar, fVar) != null) {
            C4542f.m17259f().mo14104b("Registered Firebase Analytics listener.");
            C4547d dVar = new C4547d();
            C4546c cVar = new C4546c(eVar, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (C4550a a : this.f12860d) {
                    dVar.mo14083a(a);
                }
                fVar.mo14089d(dVar);
                fVar.mo14090e(cVar);
                this.f12859c = dVar;
                this.f12858b = cVar;
            }
            return;
        }
        C4542f.m17259f().mo14112k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    /* renamed from: j */
    private static C4466a.C4467a m17219j(C4466a aVar, C4531f fVar) {
        C4466a.C4467a b = aVar.mo14001b("clx", fVar);
        if (b == null) {
            C4542f.m17259f().mo14104b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            b = aVar.mo14001b("crash", fVar);
            if (b != null) {
                C4542f.m17259f().mo14112k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return b;
    }

    /* renamed from: a */
    public C4544a mo14084a() {
        return new C4527b(this);
    }

    /* renamed from: b */
    public C4551b mo14085b() {
        return new C4528c(this);
    }
}
