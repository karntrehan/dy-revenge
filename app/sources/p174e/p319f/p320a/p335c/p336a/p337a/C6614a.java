package p174e.p319f.p320a.p335c.p336a.p337a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C3467a;
import com.google.android.gms.common.C3631f;
import com.google.android.gms.common.C3633g;
import com.google.android.gms.common.C3637i;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.p132m.C3743a;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p335c.p345f.p346a.C6648e;
import p174e.p319f.p320a.p335c.p345f.p346a.C6649f;

/* renamed from: e.f.a.c.a.a.a */
public class C6614a {

    /* renamed from: a */
    C3467a f18264a;

    /* renamed from: b */
    C6649f f18265b;

    /* renamed from: c */
    boolean f18266c;

    /* renamed from: d */
    final Object f18267d = new Object();

    /* renamed from: e */
    C6617c f18268e;

    /* renamed from: f */
    private final Context f18269f;

    /* renamed from: g */
    final long f18270g;

    /* renamed from: e.f.a.c.a.a.a$a */
    public static final class C6615a {

        /* renamed from: a */
        private final String f18271a;

        /* renamed from: b */
        private final boolean f18272b;

        @Deprecated
        public C6615a(String str, boolean z) {
            this.f18271a = str;
            this.f18272b = z;
        }

        /* renamed from: a */
        public String mo19434a() {
            return this.f18271a;
        }

        /* renamed from: b */
        public boolean mo19435b() {
            return this.f18272b;
        }

        public String toString() {
            String str = this.f18271a;
            boolean z = this.f18272b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public C6614a(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        C3705r.m14346k(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f18269f = context;
        this.f18266c = false;
        this.f18270g = j;
    }

    /* renamed from: a */
    public static C6615a m25250a(Context context) {
        C6614a aVar = new C6614a(context, -1, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.mo19431d(false);
            C6615a f = aVar.m25252f(-1);
            aVar.mo19432e(f, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, HttpUrl.FRAGMENT_ENCODE_SET, (Throwable) null);
            aVar.mo19430c();
            return f;
        } catch (Throwable th) {
            aVar.mo19430c();
            throw th;
        }
    }

    /* renamed from: b */
    public static void m25251b(boolean z) {
    }

    /* renamed from: f */
    private final C6615a m25252f(int i) {
        C6615a aVar;
        C3705r.m14345j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f18266c) {
                synchronized (this.f18267d) {
                    C6617c cVar = this.f18268e;
                    if (cVar == null || !cVar.f18277q) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    mo19431d(false);
                    if (!this.f18266c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C3705r.m14346k(this.f18264a);
            C3705r.m14346k(this.f18265b);
            aVar = new C6615a(this.f18265b.mo19453a(), this.f18265b.mo19452B(true));
        }
        m25253g();
        return aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m25253g() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f18267d
            monitor-enter(r0)
            e.f.a.c.a.a.c r1 = r6.f18268e     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.f18276p     // Catch:{ all -> 0x0022 }
            r1.countDown()     // Catch:{ all -> 0x0022 }
            e.f.a.c.a.a.c r1 = r6.f18268e     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r6.f18270g     // Catch:{ all -> 0x0022 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0020
            e.f.a.c.a.a.c r3 = new e.f.a.c.a.a.c     // Catch:{ all -> 0x0022 }
            r3.<init>(r6, r1)     // Catch:{ all -> 0x0022 }
            r6.f18268e = r3     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p336a.p337a.C6614a.m25253g():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19430c() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C3705r.m14345j(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f18269f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.common.a r0 = r3.f18264a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f18266c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.common.m.a r0 = com.google.android.gms.common.p132m.C3743a.m14478b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f18269f     // Catch:{ all -> 0x001f }
            com.google.android.gms.common.a r2 = r3.f18264a     // Catch:{ all -> 0x001f }
            r0.mo11714c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f18266c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f18265b = r0     // Catch:{ all -> 0x0033 }
            r3.f18264a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p336a.p337a.C6614a.mo19430c():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo19431d(boolean z) {
        C3705r.m14345j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f18266c) {
                mo19430c();
            }
            Context context = this.f18269f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int j = C3631f.m14110h().mo11485j(context, C3637i.f10216a);
                if (j != 0) {
                    if (j != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                C3467a aVar = new C3467a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (C3743a.m14478b().mo11713a(context, intent, aVar, 1)) {
                    this.f18264a = aVar;
                    this.f18265b = C6648e.m25287j(aVar.mo11154a(10000, TimeUnit.MILLISECONDS));
                    this.f18266c = true;
                    if (z) {
                        m25253g();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new C3633g(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo19432e(C6615a aVar, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", str2);
        if (aVar != null) {
            if (true != aVar.mo19435b()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
            String a = aVar.mo19434a();
            if (a != null) {
                hashMap.put("ad_id_size", Integer.toString(a.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C6616b(this, hashMap).start();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        mo19430c();
        super.finalize();
    }
}
