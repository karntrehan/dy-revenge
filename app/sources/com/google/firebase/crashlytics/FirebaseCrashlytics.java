package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.C4825h;
import com.google.firebase.analytics.p138a.C4466a;
import com.google.firebase.crashlytics.p139h.C4535c;
import com.google.firebase.crashlytics.p139h.C4536d;
import com.google.firebase.crashlytics.p139h.C4539e;
import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.p142j.C4554a0;
import com.google.firebase.crashlytics.p139h.p142j.C4567h;
import com.google.firebase.crashlytics.p139h.p142j.C4577n;
import com.google.firebase.crashlytics.p139h.p142j.C4596q;
import com.google.firebase.crashlytics.p139h.p142j.C4607w;
import com.google.firebase.crashlytics.p139h.p142j.C4609y;
import com.google.firebase.crashlytics.p139h.p146m.C4775b;
import com.google.firebase.crashlytics.p139h.p147n.C4782f;
import com.google.firebase.crashlytics.p139h.p149p.C4796f;
import com.google.firebase.installations.C4839f;
import com.google.firebase.p162p.C4925a;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p174e.p319f.p320a.p335c.p362h.C8945c;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8969o;

public class FirebaseCrashlytics {

    /* renamed from: a */
    final C4596q f12849a;

    /* renamed from: com.google.firebase.crashlytics.FirebaseCrashlytics$a */
    class C4524a implements C8945c<Void, Object> {
        C4524a() {
        }

        /* renamed from: a */
        public Object mo14079a(C8963l<Void> lVar) {
            if (lVar.mo22779o()) {
                return null;
            }
            C4542f.m17259f().mo14107e("Error fetching settings.", lVar.mo22775k());
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.FirebaseCrashlytics$b */
    class C4525b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ boolean f12850a;

        /* renamed from: b */
        final /* synthetic */ C4596q f12851b;

        /* renamed from: c */
        final /* synthetic */ C4796f f12852c;

        C4525b(boolean z, C4596q qVar, C4796f fVar) {
            this.f12850a = z;
            this.f12851b = qVar;
            this.f12852c = fVar;
        }

        /* renamed from: a */
        public Void call() {
            if (!this.f12850a) {
                return null;
            }
            this.f12851b.mo14203j(this.f12852c);
            return null;
        }
    }

    private FirebaseCrashlytics(C4596q qVar) {
        this.f12849a = qVar;
    }

    /* renamed from: a */
    static FirebaseCrashlytics m17208a(C4825h hVar, C4839f fVar, C4925a<C4535c> aVar, C4925a<C4466a> aVar2) {
        Context j = hVar.mo14733j();
        String packageName = j.getPackageName();
        C4542f f = C4542f.m17259f();
        f.mo14108g("Initializing Firebase Crashlytics " + C4596q.m17480l() + " for " + packageName);
        C4782f fVar2 = new C4782f(j);
        C4607w wVar = new C4607w(hVar);
        C4554a0 a0Var = new C4554a0(j, packageName, fVar, wVar);
        C4536d dVar = new C4536d(aVar);
        C4530e eVar = new C4530e(aVar2);
        C4825h hVar2 = hVar;
        C4554a0 a0Var2 = a0Var;
        C4607w wVar2 = wVar;
        C4596q qVar = new C4596q(hVar2, a0Var2, dVar, wVar2, eVar.mo14085b(), eVar.mo14084a(), fVar2, C4609y.m17549c("Crashlytics Exception Handler"));
        String c = hVar.mo14735o().mo14828c();
        String n = C4577n.m17385n(j);
        C4542f f2 = C4542f.m17259f();
        f2.mo14104b("Mapping file ID is: " + n);
        try {
            C4567h a = C4567h.m17339a(j, a0Var, c, n, new C4539e(j));
            C4542f f3 = C4542f.m17259f();
            f3.mo14110i("Installer package name is: " + a.f12912c);
            ExecutorService c2 = C4609y.m17549c("com.google.firebase.crashlytics.startup");
            C4796f l = C4796f.m18341l(j, c, a0Var, new C4775b(), a.f12914e, a.f12915f, fVar2, wVar);
            l.mo14702p(c2).mo22773i(c2, new C4524a());
            C8969o.m29864c(c2, new C4525b(qVar.mo14208r(a, l), qVar, l));
            return new FirebaseCrashlytics(qVar);
        } catch (PackageManager.NameNotFoundException e) {
            C4542f.m17259f().mo14107e("Error retrieving app package info.", e);
            return null;
        }
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) C4825h.m18437l().mo14731h(FirebaseCrashlytics.class);
        Objects.requireNonNull(firebaseCrashlytics, "FirebaseCrashlytics component is not present.");
        return firebaseCrashlytics;
    }

    public C8963l<Boolean> checkForUnsentReports() {
        return this.f12849a.mo14199e();
    }

    public void deleteUnsentReports() {
        this.f12849a.mo14200f();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f12849a.mo14201g();
    }

    public void log(String str) {
        this.f12849a.mo14204n(str);
    }

    public void recordException(Throwable th) {
        if (th == null) {
            C4542f.m17259f().mo14112k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f12849a.mo14205o(th);
        }
    }

    public void sendUnsentReports() {
        this.f12849a.mo14209s();
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.f12849a.mo14210t(bool);
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.f12849a.mo14210t(Boolean.valueOf(z));
    }

    public void setCustomKey(String str, double d) {
        this.f12849a.mo14211u(str, Double.toString(d));
    }

    public void setCustomKey(String str, float f) {
        this.f12849a.mo14211u(str, Float.toString(f));
    }

    public void setCustomKey(String str, int i) {
        this.f12849a.mo14211u(str, Integer.toString(i));
    }

    public void setCustomKey(String str, long j) {
        this.f12849a.mo14211u(str, Long.toString(j));
    }

    public void setCustomKey(String str, String str2) {
        this.f12849a.mo14211u(str, str2);
    }

    public void setCustomKey(String str, boolean z) {
        this.f12849a.mo14211u(str, Boolean.toString(z));
    }

    public void setCustomKeys(C4532g gVar) {
        throw null;
    }

    public void setUserId(String str) {
        this.f12849a.mo14212v(str);
    }
}
