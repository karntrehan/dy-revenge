package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.C3705r;
import com.google.firebase.C4825h;
import com.google.firebase.installations.C4840g;
import com.google.firebase.installations.p151l.C4846a;
import com.google.firebase.installations.p152m.C4850b;
import com.google.firebase.installations.p152m.C4851c;
import com.google.firebase.installations.p152m.C4853d;
import com.google.firebase.installations.p153n.C4861c;
import com.google.firebase.installations.p153n.C4862d;
import com.google.firebase.installations.p153n.C4866f;
import com.google.firebase.p161o.C4921j;
import com.google.firebase.p162p.C4927b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8965m;
import p174e.p319f.p320a.p335c.p362h.C8969o;

/* renamed from: com.google.firebase.installations.e */
public class C4836e implements C4839f {

    /* renamed from: a */
    private static final Object f13605a = new Object();

    /* renamed from: b */
    private static final ThreadFactory f13606b = new C4837a();

    /* renamed from: c */
    private final C4825h f13607c;

    /* renamed from: d */
    private final C4861c f13608d;

    /* renamed from: e */
    private final C4851c f13609e;

    /* renamed from: f */
    private final C4845k f13610f;

    /* renamed from: g */
    private final C4850b f13611g;

    /* renamed from: h */
    private final C4843i f13612h;

    /* renamed from: i */
    private final Object f13613i;

    /* renamed from: j */
    private final ExecutorService f13614j;

    /* renamed from: k */
    private final ExecutorService f13615k;

    /* renamed from: l */
    private String f13616l;

    /* renamed from: m */
    private Set<C4846a> f13617m;

    /* renamed from: n */
    private final List<C4844j> f13618n;

    /* renamed from: com.google.firebase.installations.e$a */
    class C4837a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f13619a = new AtomicInteger(1);

        C4837a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f13619a.getAndIncrement())}));
        }
    }

    /* renamed from: com.google.firebase.installations.e$b */
    static /* synthetic */ class C4838b {

        /* renamed from: a */
        static final /* synthetic */ int[] f13620a;

        /* renamed from: b */
        static final /* synthetic */ int[] f13621b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.google.firebase.installations.n.f$b[] r0 = com.google.firebase.installations.p153n.C4866f.C4868b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13621b = r0
                r1 = 1
                com.google.firebase.installations.n.f$b r2 = com.google.firebase.installations.p153n.C4866f.C4868b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f13621b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.installations.n.f$b r3 = com.google.firebase.installations.p153n.C4866f.C4868b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f13621b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.installations.n.f$b r3 = com.google.firebase.installations.p153n.C4866f.C4868b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.installations.n.d$b[] r2 = com.google.firebase.installations.p153n.C4862d.C4864b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f13620a = r2
                com.google.firebase.installations.n.d$b r3 = com.google.firebase.installations.p153n.C4862d.C4864b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f13620a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.installations.n.d$b r2 = com.google.firebase.installations.p153n.C4862d.C4864b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C4836e.C4838b.<clinit>():void");
        }
    }

    C4836e(C4825h hVar, C4927b<C4921j> bVar) {
        this(new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f13606b), hVar, new C4861c(hVar.mo14733j(), bVar), new C4851c(hVar), C4845k.m18504c(), new C4850b(hVar), new C4843i());
    }

    C4836e(ExecutorService executorService, C4825h hVar, C4861c cVar, C4851c cVar2, C4845k kVar, C4850b bVar, C4843i iVar) {
        this.f13613i = new Object();
        this.f13617m = new HashSet();
        this.f13618n = new ArrayList();
        this.f13607c = hVar;
        this.f13608d = cVar;
        this.f13609e = cVar2;
        this.f13610f = kVar;
        this.f13611g = bVar;
        this.f13612h = iVar;
        this.f13614j = executorService;
        this.f13615k = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f13606b);
    }

    /* renamed from: b */
    private C8963l<String> m18470b() {
        C8965m mVar = new C8965m();
        m18471c(new C4842h(mVar));
        return mVar.mo22782a();
    }

    /* renamed from: c */
    private void m18471c(C4844j jVar) {
        synchronized (this.f13613i) {
            this.f13618n.add(jVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m18481p(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.m.d r0 = r2.m18478l()
            boolean r1 = r0.mo14787i()     // Catch:{ g -> 0x005c }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.mo14790l()     // Catch:{ g -> 0x005c }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.k r3 = r2.f13610f     // Catch:{ g -> 0x005c }
            boolean r3 = r3.mo14762f(r0)     // Catch:{ g -> 0x005c }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            com.google.firebase.installations.m.d r3 = r2.m18474f(r0)     // Catch:{ g -> 0x005c }
            goto L_0x0026
        L_0x0022:
            com.google.firebase.installations.m.d r3 = r2.m18485v(r0)     // Catch:{ g -> 0x005c }
        L_0x0026:
            r2.m18480o(r3)
            r2.m18489z(r0, r3)
            boolean r0 = r3.mo14789k()
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r3.mo14766d()
            r2.m18488y(r0)
        L_0x0039:
            boolean r0 = r3.mo14787i()
            if (r0 == 0) goto L_0x004a
            com.google.firebase.installations.g r3 = new com.google.firebase.installations.g
            com.google.firebase.installations.g$a r0 = com.google.firebase.installations.C4840g.C4841a.BAD_CONFIG
            r3.<init>(r0)
        L_0x0046:
            r2.m18486w(r3)
            goto L_0x005b
        L_0x004a:
            boolean r0 = r3.mo14788j()
            if (r0 == 0) goto L_0x0058
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            goto L_0x0046
        L_0x0058:
            r2.m18487x(r3)
        L_0x005b:
            return
        L_0x005c:
            r3 = move-exception
            r2.m18486w(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C4836e.m18481p(boolean):void");
    }

    /* renamed from: e */
    private final void m18473e(boolean z) {
        C4853d m = m18479m();
        if (z) {
            m = m.mo14793p();
        }
        m18487x(m);
        this.f13615k.execute(new C4832a(this, z));
    }

    /* renamed from: f */
    private C4853d m18474f(C4853d dVar) {
        C4866f e = this.f13608d.mo14823e(mo14750g(), dVar.mo14766d(), mo14752n(), dVar.mo14769f());
        int i = C4838b.f13621b[e.mo14812b().ordinal()];
        if (i == 1) {
            return dVar.mo14792o(e.mo14813c(), e.mo14814d(), this.f13610f.mo14760b());
        } else if (i == 2) {
            return dVar.mo14794q("BAD CONFIG");
        } else {
            if (i == 3) {
                m18488y((String) null);
                return dVar.mo14795r();
            }
            throw new C4840g("Firebase Installations Service is unavailable. Please try again later.", C4840g.C4841a.UNAVAILABLE);
        }
    }

    /* renamed from: i */
    private synchronized String m18475i() {
        return this.f13616l;
    }

    /* renamed from: j */
    public static C4836e m18476j() {
        return m18477k(C4825h.m18437l());
    }

    /* renamed from: k */
    public static C4836e m18477k(C4825h hVar) {
        C3705r.m14337b(hVar != null, "Null is not a valid value of FirebaseApp.");
        return (C4836e) hVar.mo14731h(C4839f.class);
    }

    /* renamed from: l */
    private C4853d m18478l() {
        C4853d d;
        synchronized (f13605a) {
            C4835d a = C4835d.m18468a(this.f13607c.mo14733j(), "generatefid.lock");
            try {
                d = this.f13609e.mo14786d();
                if (a != null) {
                    a.mo14748b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo14748b();
                }
                throw th;
            }
        }
        return d;
    }

    /* renamed from: m */
    private C4853d m18479m() {
        C4853d d;
        synchronized (f13605a) {
            C4835d a = C4835d.m18468a(this.f13607c.mo14733j(), "generatefid.lock");
            try {
                d = this.f13609e.mo14786d();
                if (d.mo14788j()) {
                    d = this.f13609e.mo14785b(d.mo14797t(m18484u(d)));
                }
                if (a != null) {
                    a.mo14748b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo14748b();
                }
                throw th;
            }
        }
        return d;
    }

    /* renamed from: o */
    private void m18480o(C4853d dVar) {
        synchronized (f13605a) {
            C4835d a = C4835d.m18468a(this.f13607c.mo14733j(), "generatefid.lock");
            try {
                this.f13609e.mo14785b(dVar);
                if (a != null) {
                    a.mo14748b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo14748b();
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void mo14754s() {
        m18473e(false);
    }

    /* renamed from: t */
    private void m18483t() {
        C3705r.m14343h(mo14751h(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C3705r.m14343h(mo14752n(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C3705r.m14343h(mo14750g(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C3705r.m14337b(C4845k.m18507h(mo14751h()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C3705r.m14337b(C4845k.m18506g(mo14750g()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: u */
    private String m18484u(C4853d dVar) {
        if ((!this.f13607c.mo14734n().equals("CHIME_ANDROID_SDK") && !this.f13607c.mo14739v()) || !dVar.mo14791m()) {
            return this.f13612h.mo14758a();
        }
        String f = this.f13611g.mo14783f();
        return TextUtils.isEmpty(f) ? this.f13612h.mo14758a() : f;
    }

    /* renamed from: v */
    private C4853d m18485v(C4853d dVar) {
        C4862d d = this.f13608d.mo14822d(mo14750g(), dVar.mo14766d(), mo14752n(), mo14751h(), (dVar.mo14766d() == null || dVar.mo14766d().length() != 11) ? null : this.f13611g.mo14784i());
        int i = C4838b.f13620a[d.mo14801e().ordinal()];
        if (i == 1) {
            return dVar.mo14796s(d.mo14799c(), d.mo14800d(), this.f13610f.mo14760b(), d.mo14798b().mo14813c(), d.mo14798b().mo14814d());
        } else if (i == 2) {
            return dVar.mo14794q("BAD CONFIG");
        } else {
            throw new C4840g("Firebase Installations Service is unavailable. Please try again later.", C4840g.C4841a.UNAVAILABLE);
        }
    }

    /* renamed from: w */
    private void m18486w(Exception exc) {
        synchronized (this.f13613i) {
            Iterator<C4844j> it = this.f13618n.iterator();
            while (it.hasNext()) {
                if (it.next().mo14756a(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: x */
    private void m18487x(C4853d dVar) {
        synchronized (this.f13613i) {
            Iterator<C4844j> it = this.f13618n.iterator();
            while (it.hasNext()) {
                if (it.next().mo14757b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: y */
    private synchronized void m18488y(String str) {
        this.f13616l = str;
    }

    /* renamed from: z */
    private synchronized void m18489z(C4853d dVar, C4853d dVar2) {
        if (this.f13617m.size() != 0 && !dVar.mo14766d().equals(dVar2.mo14766d())) {
            for (C4846a a : this.f13617m) {
                a.mo14763a(dVar2.mo14766d());
            }
        }
    }

    /* renamed from: a */
    public C8963l<String> mo14749a() {
        m18483t();
        String i = m18475i();
        if (i != null) {
            return C8969o.m29867f(i);
        }
        C8963l<String> b = m18470b();
        this.f13614j.execute(new C4833b(this));
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo14750g() {
        return this.f13607c.mo14735o().mo14827b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo14751h() {
        return this.f13607c.mo14735o().mo14828c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public String mo14752n() {
        return this.f13607c.mo14735o().mo14833g();
    }
}
