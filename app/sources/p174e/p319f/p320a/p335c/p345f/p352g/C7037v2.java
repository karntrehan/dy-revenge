package p174e.p319f.p320a.p335c.p345f.p352g;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.util.C3758e;
import com.google.android.gms.common.util.C3761h;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.C3851d5;
import com.google.android.gms.measurement.internal.C4102x7;
import com.google.android.gms.measurement.p135a.C3800a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: e.f.a.c.f.g.v2 */
public final class C7037v2 {

    /* renamed from: a */
    private static volatile C7037v2 f18998a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f18999b;

    /* renamed from: c */
    protected final C3758e f19000c;

    /* renamed from: d */
    protected final ExecutorService f19001d;

    /* renamed from: e */
    private final C3800a f19002e;

    /* renamed from: f */
    private final List f19003f;

    /* renamed from: g */
    private int f19004g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f19005h;

    /* renamed from: i */
    private final String f19006i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public volatile C6779f1 f19007j;

    protected C7037v2(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f18999b = (str == null || !m26768l(str2, str3)) ? "FA" : str;
        this.f19000c = C3761h.m14511c();
        C7099z0.m27056a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C6780f2(this));
        boolean z = true;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f19001d = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f19002e = new C3800a(this);
        this.f19003f = new ArrayList();
        try {
            if (C4102x7.m15387b(context, "google_app_id", C3851d5.m14684a(context)) != null && !m26764h()) {
                this.f19006i = null;
                this.f19005h = true;
                Log.w(this.f18999b, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!m26768l(str2, str3)) {
            this.f19006i = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 != null ? false : z)) {
                    Log.w(this.f18999b, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f18999b, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        } else {
            this.f19006i = str2;
        }
        m26767k(new C7020u1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f18999b, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C7021u2(this));
        }
    }

    /* renamed from: h */
    protected static final boolean m26764h() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m26765i(Exception exc, boolean z, boolean z2) {
        this.f19005h |= z;
        if (z) {
            Log.w(this.f18999b, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            mo20298a(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.f18999b, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: j */
    private final void m26766j(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m26767k(new C6845j2(this, l, str, str2, bundle, z, z2));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m26767k(C6861k2 k2Var) {
        this.f19001d.execute(k2Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final boolean m26768l(String str, String str2) {
        return (str2 == null || str == null || m26764h()) ? false : true;
    }

    /* renamed from: r */
    public static C7037v2 m26770r(Context context, String str, String str2, String str3, Bundle bundle) {
        C3705r.m14346k(context);
        if (f18998a == null) {
            synchronized (C7037v2.class) {
                if (f18998a == null) {
                    f18998a = new C7037v2(context, str, str2, str3, bundle);
                }
            }
        }
        return f18998a;
    }

    /* renamed from: C */
    public final void mo20294C(String str) {
        m26767k(new C7036v1(this, str));
    }

    /* renamed from: D */
    public final void mo20295D(String str, String str2, Bundle bundle) {
        m26767k(new C6972r1(this, str, str2, bundle));
    }

    /* renamed from: E */
    public final void mo20296E(String str) {
        m26767k(new C7052w1(this, str));
    }

    /* renamed from: F */
    public final void mo20297F(String str, String str2, Bundle bundle) {
        m26766j(str, str2, bundle, true, true, (Long) null);
    }

    /* renamed from: a */
    public final void mo20298a(int i, String str, Object obj, Object obj2, Object obj3) {
        m26767k(new C6763e2(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r4.f19007j == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.f19007j.registerOnMeasurementEventListener(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        android.util.Log.w(r4.f18999b, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        m26767k(new p174e.p319f.p320a.p335c.p345f.p352g.C6829i2(r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20299b(com.google.android.gms.measurement.internal.C3981n6 r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.C3705r.m14346k(r5)
            java.util.List r0 = r4.f19003f
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List r2 = r4.f19003f     // Catch:{ all -> 0x0055 }
            int r2 = r2.size()     // Catch:{ all -> 0x0055 }
            if (r1 >= r2) goto L_0x002b
            java.util.List r2 = r4.f19003f     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0055 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x0055 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0028
            java.lang.String r5 = r4.f18999b     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = "OnEventListener already registered."
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return
        L_0x0028:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x002b:
            e.f.a.c.f.g.l2 r1 = new e.f.a.c.f.g.l2     // Catch:{ all -> 0x0055 }
            r1.<init>(r5)     // Catch:{ all -> 0x0055 }
            java.util.List r2 = r4.f19003f     // Catch:{ all -> 0x0055 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x0055 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0055 }
            r2.add(r3)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            e.f.a.c.f.g.f1 r5 = r4.f19007j
            if (r5 == 0) goto L_0x004c
            e.f.a.c.f.g.f1 r5 = r4.f19007j     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0045 }
            r5.registerOnMeasurementEventListener(r1)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0045 }
            return
        L_0x0045:
            java.lang.String r5 = r4.f18999b
            java.lang.String r0 = "Failed to register event listener on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r5, r0)
        L_0x004c:
            e.f.a.c.f.g.i2 r5 = new e.f.a.c.f.g.i2
            r5.<init>(r4, r1)
            r4.m26767k(r5)
            return
        L_0x0055:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C7037v2.mo20299b(com.google.android.gms.measurement.internal.n6):void");
    }

    /* renamed from: c */
    public final void mo20300c(Bundle bundle) {
        m26767k(new C6956q1(this, bundle));
    }

    /* renamed from: d */
    public final void mo20301d(Activity activity, String str, String str2) {
        m26767k(new C7004t1(this, activity, str, str2));
    }

    /* renamed from: e */
    public final void mo20302e(boolean z) {
        m26767k(new C6813h2(this, z));
    }

    /* renamed from: m */
    public final int mo20303m(String str) {
        C6711b1 b1Var = new C6711b1();
        m26767k(new C6797g2(this, str, b1Var));
        Integer num = (Integer) C6711b1.m25446Y(b1Var.mo19556k(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: n */
    public final long mo20304n() {
        C6711b1 b1Var = new C6711b1();
        m26767k(new C6695a2(this, b1Var));
        Long l = (Long) C6711b1.m25446Y(b1Var.mo19556k(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f19000c.mo11730a()).nextLong();
        int i = this.f19004g + 1;
        this.f19004g = i;
        return nextLong + ((long) i);
    }

    /* renamed from: o */
    public final C3800a mo20305o() {
        return this.f19002e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C6779f1 mo20306q(Context context, boolean z) {
        try {
            return C6762e1.asInterface(DynamiteModule.m14550d(context, DynamiteModule.f10466d, ModuleDescriptor.MODULE_ID).mo11738c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.C3778a e) {
            m26765i(e, true, false);
            return null;
        }
    }

    /* renamed from: t */
    public final String mo20307t() {
        C6711b1 b1Var = new C6711b1();
        m26767k(new C7100z1(this, b1Var));
        return b1Var.mo19557m(50);
    }

    /* renamed from: u */
    public final String mo20308u() {
        C6711b1 b1Var = new C6711b1();
        m26767k(new C6729c2(this, b1Var));
        return b1Var.mo19557m(500);
    }

    /* renamed from: v */
    public final String mo20309v() {
        C6711b1 b1Var = new C6711b1();
        m26767k(new C6712b2(this, b1Var));
        return b1Var.mo19557m(500);
    }

    /* renamed from: w */
    public final String mo20310w() {
        C6711b1 b1Var = new C6711b1();
        m26767k(new C7084y1(this, b1Var));
        return b1Var.mo19557m(500);
    }

    /* renamed from: x */
    public final List mo20311x(String str, String str2) {
        C6711b1 b1Var = new C6711b1();
        m26767k(new C6988s1(this, str, str2, b1Var));
        List list = (List) C6711b1.m25446Y(b1Var.mo19556k(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: y */
    public final Map mo20312y(String str, String str2, boolean z) {
        C6711b1 b1Var = new C6711b1();
        m26767k(new C6746d2(this, str, str2, z, b1Var));
        Bundle k = b1Var.mo19556k(5000);
        if (k == null || k.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(k.size());
        for (String str3 : k.keySet()) {
            Object obj = k.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }
}
