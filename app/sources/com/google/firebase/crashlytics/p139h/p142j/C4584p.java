package com.google.firebase.crashlytics.p139h.p142j;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.google.firebase.crashlytics.p139h.C4535c;
import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.C4543g;
import com.google.firebase.crashlytics.p139h.p140h.C4544a;
import com.google.firebase.crashlytics.p139h.p142j.C4604u;
import com.google.firebase.crashlytics.p139h.p143k.C4618e;
import com.google.firebase.crashlytics.p139h.p143k.C4631i;
import com.google.firebase.crashlytics.p139h.p144l.C4703c0;
import com.google.firebase.crashlytics.p139h.p147n.C4782f;
import com.google.firebase.crashlytics.p139h.p149p.C4792d;
import com.google.firebase.crashlytics.p139h.p149p.C4800i;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p174e.p319f.p320a.p335c.p362h.C8961k;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8965m;
import p174e.p319f.p320a.p335c.p362h.C8969o;

/* renamed from: com.google.firebase.crashlytics.h.j.p */
class C4584p {

    /* renamed from: a */
    static final FilenameFilter f12955a = C4553a.f12887a;

    /* renamed from: b */
    private final Context f12956b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4607w f12957c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4601r f12958d;

    /* renamed from: e */
    private final C4631i f12959e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C4579o f12960f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C4554a0 f12961g;

    /* renamed from: h */
    private final C4782f f12962h;

    /* renamed from: i */
    private final C4567h f12963i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C4618e f12964j;

    /* renamed from: k */
    private final C4535c f12965k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C4544a f12966l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C4566g0 f12967m;

    /* renamed from: n */
    private C4604u f12968n;

    /* renamed from: o */
    private C4800i f12969o = null;

    /* renamed from: p */
    final C8965m<Boolean> f12970p = new C8965m<>();

    /* renamed from: q */
    final C8965m<Boolean> f12971q = new C8965m<>();

    /* renamed from: r */
    final C8965m<Void> f12972r = new C8965m<>();

    /* renamed from: s */
    final AtomicBoolean f12973s = new AtomicBoolean(false);

    /* renamed from: com.google.firebase.crashlytics.h.j.p$a */
    class C4585a implements C4604u.C4605a {
        C4585a() {
        }

        /* renamed from: a */
        public void mo14182a(C4800i iVar, Thread thread, Throwable th) {
            C4584p.this.mo14166G(iVar, thread, th);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.h.j.p$b */
    class C4586b implements Callable<C8963l<Void>> {

        /* renamed from: a */
        final /* synthetic */ long f12975a;

        /* renamed from: b */
        final /* synthetic */ Throwable f12976b;

        /* renamed from: c */
        final /* synthetic */ Thread f12977c;

        /* renamed from: d */
        final /* synthetic */ C4800i f12978d;

        /* renamed from: e */
        final /* synthetic */ boolean f12979e;

        /* renamed from: com.google.firebase.crashlytics.h.j.p$b$a */
        class C4587a implements C8961k<C4792d, Void> {

            /* renamed from: a */
            final /* synthetic */ Executor f12981a;

            /* renamed from: b */
            final /* synthetic */ String f12982b;

            C4587a(Executor executor, String str) {
                this.f12981a = executor;
                this.f12982b = str;
            }

            /* renamed from: b */
            public C8963l<Void> mo14185a(C4792d dVar) {
                String str = null;
                if (dVar == null) {
                    C4542f.m17259f().mo14112k("Received null app settings, cannot send reports at crash time.");
                    return C8969o.m29867f(null);
                }
                C8963l[] lVarArr = new C8963l[2];
                lVarArr[0] = C4584p.this.m17419M();
                C4566g0 g = C4584p.this.f12967m;
                Executor executor = this.f12981a;
                if (C4586b.this.f12979e) {
                    str = this.f12982b;
                }
                lVarArr[1] = g.mo14141v(executor, str);
                return C8969o.m29869h(lVarArr);
            }
        }

        C4586b(long j, Throwable th, Thread thread, C4800i iVar, boolean z) {
            this.f12975a = j;
            this.f12976b = th;
            this.f12977c = thread;
            this.f12978d = iVar;
            this.f12979e = z;
        }

        /* renamed from: a */
        public C8963l<Void> call() {
            long a = C4584p.m17416F(this.f12975a);
            String b = C4584p.this.m17413C();
            if (b == null) {
                C4542f.m17259f().mo14106d("Tried to write a fatal exception while no session was open.");
                return C8969o.m29867f(null);
            }
            C4584p.this.f12958d.mo14220a();
            C4584p.this.f12967m.mo14136q(this.f12976b, this.f12977c, b, a);
            C4584p.this.m17441x(this.f12975a);
            C4584p.this.mo14180u(this.f12978d);
            C4584p.this.m17440w(new C4576m(C4584p.this.f12961g).toString());
            if (!C4584p.this.f12957c.mo14229d()) {
                return C8969o.m29867f(null);
            }
            Executor c = C4584p.this.f12960f.mo14157c();
            return this.f12978d.mo14698a().mo22781q(c, new C4587a(c, b));
        }
    }

    /* renamed from: com.google.firebase.crashlytics.h.j.p$c */
    class C4588c implements C8961k<Void, Boolean> {
        C4588c() {
        }

        /* renamed from: b */
        public C8963l<Boolean> mo14185a(Void voidR) {
            return C8969o.m29867f(Boolean.TRUE);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.h.j.p$d */
    class C4589d implements C8961k<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ C8963l f12985a;

        /* renamed from: com.google.firebase.crashlytics.h.j.p$d$a */
        class C4590a implements Callable<C8963l<Void>> {

            /* renamed from: a */
            final /* synthetic */ Boolean f12987a;

            /* renamed from: com.google.firebase.crashlytics.h.j.p$d$a$a */
            class C4591a implements C8961k<C4792d, Void> {

                /* renamed from: a */
                final /* synthetic */ Executor f12989a;

                C4591a(Executor executor) {
                    this.f12989a = executor;
                }

                /* renamed from: b */
                public C8963l<Void> mo14185a(C4792d dVar) {
                    if (dVar == null) {
                        C4542f.m17259f().mo14112k("Received null app settings at app startup. Cannot send cached reports");
                    } else {
                        C8963l unused = C4584p.this.m17419M();
                        C4584p.this.f12967m.mo14140u(this.f12989a);
                        C4584p.this.f12972r.mo22786e(null);
                    }
                    return C8969o.m29867f(null);
                }
            }

            C4590a(Boolean bool) {
                this.f12987a = bool;
            }

            /* renamed from: a */
            public C8963l<Void> call() {
                if (!this.f12987a.booleanValue()) {
                    C4542f.m17259f().mo14110i("Deleting cached crash reports...");
                    C4584p.m17438r(C4584p.this.mo14169K());
                    C4584p.this.f12967m.mo14139t();
                    C4584p.this.f12972r.mo22786e(null);
                    return C8969o.m29867f(null);
                }
                C4542f.m17259f().mo14104b("Sending cached crash reports...");
                C4584p.this.f12957c.mo14228c(this.f12987a.booleanValue());
                Executor c = C4584p.this.f12960f.mo14157c();
                return C4589d.this.f12985a.mo22781q(c, new C4591a(c));
            }
        }

        C4589d(C8963l lVar) {
            this.f12985a = lVar;
        }

        /* renamed from: b */
        public C8963l<Void> mo14185a(Boolean bool) {
            return C4584p.this.f12960f.mo14160i(new C4590a(bool));
        }
    }

    /* renamed from: com.google.firebase.crashlytics.h.j.p$e */
    class C4592e implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ long f12991a;

        /* renamed from: b */
        final /* synthetic */ String f12992b;

        C4592e(long j, String str) {
            this.f12991a = j;
            this.f12992b = str;
        }

        /* renamed from: a */
        public Void call() {
            if (C4584p.this.mo14168I()) {
                return null;
            }
            C4584p.this.f12964j.mo14251g(this.f12991a, this.f12992b);
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.h.j.p$f */
    class C4593f implements Runnable {

        /* renamed from: f */
        final /* synthetic */ long f12994f;

        /* renamed from: o */
        final /* synthetic */ Throwable f12995o;

        /* renamed from: p */
        final /* synthetic */ Thread f12996p;

        C4593f(long j, Throwable th, Thread thread) {
            this.f12994f = j;
            this.f12995o = th;
            this.f12996p = thread;
        }

        public void run() {
            if (!C4584p.this.mo14168I()) {
                long a = C4584p.m17416F(this.f12994f);
                String b = C4584p.this.m17413C();
                if (b == null) {
                    C4542f.m17259f().mo14112k("Tried to write a non-fatal exception while no session was open.");
                } else {
                    C4584p.this.f12967m.mo14137r(this.f12995o, this.f12996p, b, a);
                }
            }
        }
    }

    /* renamed from: com.google.firebase.crashlytics.h.j.p$g */
    class C4594g implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ String f12998a;

        C4594g(String str) {
            this.f12998a = str;
        }

        /* renamed from: a */
        public Void call() {
            C4584p.this.m17440w(this.f12998a);
            return null;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.h.j.p$h */
    class C4595h implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ long f13000a;

        C4595h(long j) {
            this.f13000a = j;
        }

        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f13000a);
            C4584p.this.f12966l.mo14082a("_ae", bundle);
            return null;
        }
    }

    C4584p(Context context, C4579o oVar, C4554a0 a0Var, C4607w wVar, C4782f fVar, C4601r rVar, C4567h hVar, C4631i iVar, C4618e eVar, C4566g0 g0Var, C4535c cVar, C4544a aVar) {
        this.f12956b = context;
        this.f12960f = oVar;
        this.f12961g = a0Var;
        this.f12957c = wVar;
        this.f12962h = fVar;
        this.f12958d = rVar;
        this.f12963i = hVar;
        this.f12959e = iVar;
        this.f12964j = eVar;
        this.f12965k = cVar;
        this.f12966l = aVar;
        this.f12967m = g0Var;
    }

    /* renamed from: B */
    private static boolean m17412B() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public String m17413C() {
        SortedSet<String> m = this.f12967m.mo14134m();
        if (!m.isEmpty()) {
            return m.first();
        }
        return null;
    }

    /* renamed from: D */
    private static long m17414D() {
        return m17416F(System.currentTimeMillis());
    }

    /* renamed from: E */
    static List<C4560d0> m17415E(C4543g gVar, String str, C4782f fVar, byte[] bArr) {
        File o = fVar.mo14683o(str, "user-data");
        File o2 = fVar.mo14683o(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C4575l("logs_file", "logs", bArr));
        arrayList.add(new C4613z("crash_meta_file", "metadata", gVar.mo14101f()));
        arrayList.add(new C4613z("session_meta_file", "session", gVar.mo14100e()));
        arrayList.add(new C4613z("app_meta_file", "app", gVar.mo14096a()));
        arrayList.add(new C4613z("device_meta_file", "device", gVar.mo14098c()));
        arrayList.add(new C4613z("os_meta_file", "os", gVar.mo14097b()));
        arrayList.add(new C4613z("minidump_file", "minidump", gVar.mo14099d()));
        arrayList.add(new C4613z("user_meta_file", "user", o));
        arrayList.add(new C4613z("keys_file", "keys", o2));
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static long m17416F(long j) {
        return j / 1000;
    }

    /* renamed from: L */
    private C8963l<Void> m17418L(long j) {
        if (m17412B()) {
            C4542f.m17259f().mo14112k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return C8969o.m29867f(null);
        }
        C4542f.m17259f().mo14104b("Logging app exception event to Firebase Analytics");
        return C8969o.m29864c(new ScheduledThreadPoolExecutor(1), new C4595h(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public C8963l<Void> m17419M() {
        ArrayList arrayList = new ArrayList();
        for (File next : mo14169K()) {
            try {
                arrayList.add(m17418L(Long.parseLong(next.getName().substring(3))));
            } catch (NumberFormatException unused) {
                C4542f f = C4542f.m17259f();
                f.mo14112k("Could not parse app exception timestamp from file " + next.getName());
            }
            next.delete();
        }
        return C8969o.m29868g(arrayList);
    }

    /* renamed from: S */
    private C8963l<Boolean> m17420S() {
        if (this.f12957c.mo14229d()) {
            C4542f.m17259f().mo14104b("Automatic data collection is enabled. Allowing upload.");
            this.f12970p.mo22786e(Boolean.FALSE);
            return C8969o.m29867f(Boolean.TRUE);
        }
        C4542f.m17259f().mo14104b("Automatic data collection is disabled.");
        C4542f.m17259f().mo14110i("Notifying that unsent reports are available.");
        this.f12970p.mo22786e(Boolean.TRUE);
        C8963l<TContinuationResult> p = this.f12957c.mo14231i().mo22780p(new C4588c());
        C4542f.m17259f().mo14104b("Waiting for send/deleteUnsentReports to be called.");
        return C4570i0.m17349f(p, this.f12971q.mo22782a());
    }

    /* renamed from: T */
    private void m17421T(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            List historicalProcessExitReasons = ((ActivityManager) this.f12956b.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.f12967m.mo14138s(str, historicalProcessExitReasons, new C4618e(this.f12962h, str), C4631i.m17634i(str, this.f12962h, this.f12960f));
                return;
            }
            C4542f f = C4542f.m17259f();
            f.mo14110i("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        C4542f f2 = C4542f.m17259f();
        f2.mo14110i("ANR feature enabled, but device is API " + i);
    }

    /* renamed from: o */
    private static C4703c0.C4704a m17435o(C4554a0 a0Var, C4567h hVar) {
        return C4703c0.C4704a.m17979b(a0Var.mo14118f(), hVar.f12914e, hVar.f12915f, a0Var.mo14117a(), C4608x.m17545e(hVar.f12912c).mo14233g(), hVar.f12916g);
    }

    /* renamed from: p */
    private static C4703c0.C4705b m17436p() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return C4703c0.C4705b.m17986c(C4577n.m17383l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), C4577n.m17390s(), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), C4577n.m17396y(), C4577n.m17384m(), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: q */
    private static C4703c0.C4706c m17437q() {
        return C4703c0.C4706c.m17996a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, C4577n.m17397z());
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static void m17438r(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17439v(boolean r4, com.google.firebase.crashlytics.p139h.p149p.C4800i r5) {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            com.google.firebase.crashlytics.h.j.g0 r1 = r3.f12967m
            java.util.SortedSet r1 = r1.mo14134m()
            r0.<init>(r1)
            int r1 = r0.size()
            if (r1 > r4) goto L_0x001b
            com.google.firebase.crashlytics.h.f r4 = com.google.firebase.crashlytics.p139h.C4542f.m17259f()
            java.lang.String r5 = "No open sessions to be closed."
            r4.mo14110i(r5)
            return
        L_0x001b:
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            com.google.firebase.crashlytics.h.p.d r5 = r5.mo14699b()
            com.google.firebase.crashlytics.h.p.d$a r5 = r5.f13500b
            boolean r5 = r5.f13508b
            if (r5 == 0) goto L_0x002f
            r3.m17421T(r1)
            goto L_0x0038
        L_0x002f:
            com.google.firebase.crashlytics.h.f r5 = com.google.firebase.crashlytics.p139h.C4542f.m17259f()
            java.lang.String r2 = "ANR feature disabled."
            r5.mo14110i(r2)
        L_0x0038:
            com.google.firebase.crashlytics.h.c r5 = r3.f12965k
            boolean r5 = r5.mo14094d(r1)
            if (r5 == 0) goto L_0x0043
            r3.m17442z(r1)
        L_0x0043:
            r5 = 0
            if (r4 == 0) goto L_0x004e
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
        L_0x004e:
            com.google.firebase.crashlytics.h.j.g0 r4 = r3.f12967m
            long r0 = m17414D()
            r4.mo14132g(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.p139h.p142j.C4584p.m17439v(boolean, com.google.firebase.crashlytics.h.p.i):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m17440w(String str) {
        long D = m17414D();
        C4542f f = C4542f.m17259f();
        f.mo14104b("Opening a new session with ID " + str);
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{C4596q.m17480l()});
        C4703c0.C4704a o = m17435o(this.f12961g, this.f12963i);
        C4703c0.C4706c q = m17437q();
        C4703c0.C4705b p = m17436p();
        this.f12965k.mo14093c(str, format, D, C4703c0.m17975b(o, q, p));
        this.f12964j.mo14249e(str);
        this.f12967m.mo14135n(str, D);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m17441x(long j) {
        try {
            C4782f fVar = this.f12962h;
            if (!fVar.mo14674e(".ae" + j).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            C4542f.m17259f().mo14113l("Could not create app exception marker file.", e);
        }
    }

    /* renamed from: z */
    private void m17442z(String str) {
        C4542f f = C4542f.m17259f();
        f.mo14110i("Finalizing native report for session " + str);
        C4543g a = this.f12965k.mo14091a(str);
        File d = a.mo14099d();
        if (d == null || !d.exists()) {
            C4542f f2 = C4542f.m17259f();
            f2.mo14112k("No minidump data found for session " + str);
            return;
        }
        long lastModified = d.lastModified();
        C4618e eVar = new C4618e(this.f12962h, str);
        File i = this.f12962h.mo14678i(str);
        if (!i.isDirectory()) {
            C4542f.m17259f().mo14112k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        m17441x(lastModified);
        List<C4560d0> E = m17415E(a, str, this.f12962h, eVar.mo14247b());
        C4562e0.m17311b(i, E);
        C4542f.m17259f().mo14104b("CrashlyticsController#finalizePreviousNativeSession");
        this.f12967m.mo14131f(str, E);
        eVar.mo14246a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo14165A(C4800i iVar) {
        this.f12960f.mo14156b();
        if (mo14168I()) {
            C4542f.m17259f().mo14112k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        C4542f.m17259f().mo14110i("Finalizing previously open sessions.");
        try {
            m17439v(true, iVar);
            C4542f.m17259f().mo14110i("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            C4542f.m17259f().mo14107e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo14166G(C4800i iVar, Thread thread, Throwable th) {
        mo14167H(iVar, thread, th, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public synchronized void mo14167H(C4800i iVar, Thread thread, Throwable th, boolean z) {
        C4542f f = C4542f.m17259f();
        f.mo14104b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            C4570i0.m17344a(this.f12960f.mo14160i(new C4586b(System.currentTimeMillis(), th, thread, iVar, z)));
        } catch (TimeoutException unused) {
            C4542f.m17259f().mo14106d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e) {
            C4542f.m17259f().mo14107e("Error handling uncaught exception", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo14168I() {
        C4604u uVar = this.f12968n;
        return uVar != null && uVar.mo14226a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public List<File> mo14169K() {
        return this.f12962h.mo14675f(f12955a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo14170N(String str) {
        this.f12960f.mo14159h(new C4594g(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public C8963l<Void> mo14171O() {
        this.f12971q.mo22786e(Boolean.TRUE);
        return this.f12972r.mo22782a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo14172P(String str, String str2) {
        try {
            this.f12959e.mo14276l(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.f12956b;
            if (context == null || !C4577n.m17394w(context)) {
                C4542f.m17259f().mo14106d("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo14173Q(String str) {
        this.f12959e.mo14277m(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public C8963l<Void> mo14174R(C8963l<C4792d> lVar) {
        if (!this.f12967m.mo14133j()) {
            C4542f.m17259f().mo14110i("No crash reports are available to be sent.");
            this.f12970p.mo22786e(Boolean.FALSE);
            return C8969o.m29867f(null);
        }
        C4542f.m17259f().mo14110i("Crash reports are available to be sent.");
        return m17420S().mo22780p(new C4589d(lVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo14175U(Thread thread, Throwable th) {
        this.f12960f.mo14158g(new C4593f(System.currentTimeMillis(), th, thread));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo14176V(long j, String str) {
        this.f12960f.mo14159h(new C4592e(j, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C8963l<Boolean> mo14177n() {
        if (this.f12973s.compareAndSet(false, true)) {
            return this.f12970p.mo22782a();
        }
        C4542f.m17259f().mo14112k("checkForUnsentReports should only be called once per execution.");
        return C8969o.m29867f(Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C8963l<Void> mo14178s() {
        this.f12971q.mo22786e(Boolean.FALSE);
        return this.f12972r.mo22782a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo14179t() {
        if (!this.f12958d.mo14221c()) {
            String C = m17413C();
            return C != null && this.f12965k.mo14094d(C);
        }
        C4542f.m17259f().mo14110i("Found previous crash marker.");
        this.f12958d.mo14222d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo14180u(C4800i iVar) {
        m17439v(false, iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo14181y(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C4800i iVar) {
        this.f12969o = iVar;
        mo14170N(str);
        C4604u uVar = new C4604u(new C4585a(), iVar, uncaughtExceptionHandler, this.f12965k);
        this.f12968n = uVar;
        Thread.setDefaultUncaughtExceptionHandler(uVar);
    }
}
