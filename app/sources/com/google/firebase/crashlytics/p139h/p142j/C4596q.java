package com.google.firebase.crashlytics.p139h.p142j;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.C4825h;
import com.google.firebase.crashlytics.p139h.C4535c;
import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.p140h.C4544a;
import com.google.firebase.crashlytics.p139h.p141i.C4551b;
import com.google.firebase.crashlytics.p139h.p143k.C4618e;
import com.google.firebase.crashlytics.p139h.p143k.C4631i;
import com.google.firebase.crashlytics.p139h.p147n.C4782f;
import com.google.firebase.crashlytics.p139h.p149p.C4800i;
import com.google.firebase.crashlytics.p139h.p150q.C4804a;
import com.google.firebase.crashlytics.p139h.p150q.C4806c;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8969o;

/* renamed from: com.google.firebase.crashlytics.h.j.q */
public class C4596q {

    /* renamed from: a */
    private final Context f13002a;

    /* renamed from: b */
    private final C4825h f13003b;

    /* renamed from: c */
    private final C4607w f13004c;

    /* renamed from: d */
    private final C4564f0 f13005d = new C4564f0();

    /* renamed from: e */
    private final long f13006e = System.currentTimeMillis();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C4601r f13007f;

    /* renamed from: g */
    private C4601r f13008g;

    /* renamed from: h */
    private boolean f13009h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C4584p f13010i;

    /* renamed from: j */
    private final C4554a0 f13011j;

    /* renamed from: k */
    private final C4782f f13012k;

    /* renamed from: l */
    public final C4551b f13013l;

    /* renamed from: m */
    private final C4544a f13014m;

    /* renamed from: n */
    private final ExecutorService f13015n;

    /* renamed from: o */
    private final C4579o f13016o;

    /* renamed from: p */
    private final C4535c f13017p;

    /* renamed from: com.google.firebase.crashlytics.h.j.q$a */
    class C4597a implements Callable<C8963l<Void>> {

        /* renamed from: a */
        final /* synthetic */ C4800i f13018a;

        C4597a(C4800i iVar) {
            this.f13018a = iVar;
        }

        /* renamed from: a */
        public C8963l<Void> call() {
            return C4596q.this.m17478i(this.f13018a);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.h.j.q$b */
    class C4598b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C4800i f13020f;

        C4598b(C4800i iVar) {
            this.f13020f = iVar;
        }

        public void run() {
            C8963l unused = C4596q.this.m17478i(this.f13020f);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.h.j.q$c */
    class C4599c implements Callable<Boolean> {
        C4599c() {
        }

        /* renamed from: a */
        public Boolean call() {
            try {
                boolean d = C4596q.this.f13007f.mo14222d();
                if (!d) {
                    C4542f.m17259f().mo14112k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d);
            } catch (Exception e) {
                C4542f.m17259f().mo14107e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    /* renamed from: com.google.firebase.crashlytics.h.j.q$d */
    class C4600d implements Callable<Boolean> {
        C4600d() {
        }

        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(C4596q.this.f13010i.mo14179t());
        }
    }

    public C4596q(C4825h hVar, C4554a0 a0Var, C4535c cVar, C4607w wVar, C4551b bVar, C4544a aVar, C4782f fVar, ExecutorService executorService) {
        this.f13003b = hVar;
        this.f13004c = wVar;
        this.f13002a = hVar.mo14733j();
        this.f13011j = a0Var;
        this.f13017p = cVar;
        this.f13013l = bVar;
        this.f13014m = aVar;
        this.f13015n = executorService;
        this.f13012k = fVar;
        this.f13016o = new C4579o(executorService);
    }

    /* renamed from: d */
    private void m17477d() {
        boolean z;
        try {
            z = Boolean.TRUE.equals((Boolean) C4570i0.m17344a(this.f13016o.mo14159h(new C4600d())));
        } catch (Exception unused) {
            z = false;
        }
        this.f13009h = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public C8963l<Void> m17478i(C4800i iVar) {
        mo14207q();
        try {
            this.f13013l.mo14083a(new C4555b(this));
            if (!iVar.mo14699b().f13500b.f13507a) {
                C4542f.m17259f().mo14104b("Collection of crash reports disabled in Crashlytics settings.");
                return C8969o.m29866e(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f13010i.mo14165A(iVar)) {
                C4542f.m17259f().mo14112k("Previous sessions could not be finalized.");
            }
            C8963l<Void> R = this.f13010i.mo14174R(iVar.mo14698a());
            mo14206p();
            return R;
        } catch (Exception e) {
            C4542f.m17259f().mo14107e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return C8969o.m29866e(e);
        } finally {
            mo14206p();
        }
    }

    /* renamed from: k */
    private void m17479k(C4800i iVar) {
        String str;
        C4542f fVar;
        Future<?> submit = this.f13015n.submit(new C4598b(iVar));
        C4542f.m17259f().mo14104b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
            return;
        } catch (InterruptedException e) {
            e = e;
            fVar = C4542f.m17259f();
            str = "Crashlytics was interrupted during initialization.";
        } catch (ExecutionException e2) {
            e = e2;
            fVar = C4542f.m17259f();
            str = "Crashlytics encountered a problem during initialization.";
        } catch (TimeoutException e3) {
            e = e3;
            fVar = C4542f.m17259f();
            str = "Crashlytics timed out during initialization.";
        }
        fVar.mo14107e(str, e);
    }

    /* renamed from: l */
    public static String m17480l() {
        return "18.2.12";
    }

    /* renamed from: m */
    static boolean m17481m(String str, boolean z) {
        if (!z) {
            C4542f.m17259f().mo14110i("Configured not to require a build ID.");
            return true;
        } else if (!TextUtils.isEmpty(str)) {
            return true;
        } else {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            return false;
        }
    }

    /* renamed from: e */
    public C8963l<Boolean> mo14199e() {
        return this.f13010i.mo14177n();
    }

    /* renamed from: f */
    public C8963l<Void> mo14200f() {
        return this.f13010i.mo14178s();
    }

    /* renamed from: g */
    public boolean mo14201g() {
        return this.f13009h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo14202h() {
        return this.f13007f.mo14221c();
    }

    /* renamed from: j */
    public C8963l<Void> mo14203j(C4800i iVar) {
        return C4570i0.m17345b(this.f13015n, new C4597a(iVar));
    }

    /* renamed from: n */
    public void mo14204n(String str) {
        this.f13010i.mo14176V(System.currentTimeMillis() - this.f13006e, str);
    }

    /* renamed from: o */
    public void mo14205o(Throwable th) {
        this.f13010i.mo14175U(Thread.currentThread(), th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo14206p() {
        this.f13016o.mo14159h(new C4599c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo14207q() {
        this.f13016o.mo14156b();
        this.f13007f.mo14220a();
        C4542f.m17259f().mo14110i("Initialization marker file was created.");
    }

    /* renamed from: r */
    public boolean mo14208r(C4567h hVar, C4800i iVar) {
        C4800i iVar2 = iVar;
        if (m17481m(hVar.f12911b, C4577n.m17382k(this.f13002a, "com.crashlytics.RequireBuildId", true))) {
            String mVar = new C4576m(this.f13011j).toString();
            try {
                this.f13008g = new C4601r("crash_marker", this.f13012k);
                this.f13007f = new C4601r("initialization_marker", this.f13012k);
                C4631i iVar3 = new C4631i(mVar, this.f13012k, this.f13016o);
                C4618e eVar = new C4618e(this.f13012k);
                C4567h hVar2 = hVar;
                C4618e eVar2 = eVar;
                C4631i iVar4 = iVar3;
                C4566g0 e = C4566g0.m17321e(this.f13002a, this.f13011j, this.f13012k, hVar2, eVar2, iVar4, new C4804a(1024, new C4806c(10)), iVar, this.f13005d);
                Context context = this.f13002a;
                C4579o oVar = this.f13016o;
                C4554a0 a0Var = this.f13011j;
                C4607w wVar = this.f13004c;
                C4782f fVar = this.f13012k;
                C4601r rVar = this.f13008g;
                C4631i iVar5 = iVar3;
                Context context2 = context;
                String str = mVar;
                C4579o oVar2 = oVar;
                C4554a0 a0Var2 = a0Var;
                C4607w wVar2 = wVar;
                C4782f fVar2 = fVar;
                C4601r rVar2 = rVar;
                C4567h hVar3 = hVar;
                this.f13010i = new C4584p(context2, oVar2, a0Var2, wVar2, fVar2, rVar2, hVar3, iVar5, eVar, e, this.f13017p, this.f13014m);
                boolean h = mo14202h();
                m17477d();
                this.f13010i.mo14181y(str, Thread.getDefaultUncaughtExceptionHandler(), iVar2);
                if (!h || !C4577n.m17374c(this.f13002a)) {
                    C4542f.m17259f().mo14104b("Successfully configured exception handler.");
                    return true;
                }
                C4542f.m17259f().mo14104b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                m17479k(iVar2);
                return false;
            } catch (Exception e2) {
                C4542f.m17259f().mo14107e("Crashlytics was not started due to an exception during initialization", e2);
                this.f13010i = null;
                return false;
            }
        } else {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        }
    }

    /* renamed from: s */
    public C8963l<Void> mo14209s() {
        return this.f13010i.mo14171O();
    }

    /* renamed from: t */
    public void mo14210t(Boolean bool) {
        this.f13004c.mo14230g(bool);
    }

    /* renamed from: u */
    public void mo14211u(String str, String str2) {
        this.f13010i.mo14172P(str, str2);
    }

    /* renamed from: v */
    public void mo14212v(String str) {
        this.f13010i.mo14173Q(str);
    }
}
