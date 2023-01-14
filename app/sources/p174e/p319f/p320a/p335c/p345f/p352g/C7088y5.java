package p174e.p319f.p320a.p335c.p345f.p352g;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p027c.p060f.C1788a;

/* renamed from: e.f.a.c.f.g.y5 */
public final class C7088y5 implements C6750d6 {

    /* renamed from: a */
    private static final Map f19054a = new C1788a();

    /* renamed from: b */
    public static final String[] f19055b = {"key", "value"};

    /* renamed from: c */
    private final ContentResolver f19056c;

    /* renamed from: d */
    private final Uri f19057d;

    /* renamed from: e */
    private final Runnable f19058e;

    /* renamed from: f */
    private final ContentObserver f19059f;

    /* renamed from: g */
    private final Object f19060g = new Object();

    /* renamed from: h */
    private volatile Map f19061h;

    /* renamed from: i */
    private final List f19062i = new ArrayList();

    private C7088y5(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C7072x5 x5Var = new C7072x5(this, (Handler) null);
        this.f19059f = x5Var;
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f19056c = contentResolver;
        this.f19057d = uri;
        this.f19058e = runnable;
        contentResolver.registerContentObserver(uri, false, x5Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p174e.p319f.p320a.p335c.p345f.p352g.C7088y5 m27037b(android.content.ContentResolver r4, android.net.Uri r5, java.lang.Runnable r6) {
        /*
            java.lang.Class<e.f.a.c.f.g.y5> r0 = p174e.p319f.p320a.p335c.p345f.p352g.C7088y5.class
            monitor-enter(r0)
            java.util.Map r1 = f19054a     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0018 }
            e.f.a.c.f.g.y5 r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C7088y5) r2     // Catch:{ all -> 0x0018 }
            if (r2 != 0) goto L_0x0016
            e.f.a.c.f.g.y5 r3 = new e.f.a.c.f.g.y5     // Catch:{ SecurityException -> 0x0016 }
            r3.<init>(r4, r5, r6)     // Catch:{ SecurityException -> 0x0016 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0015 }
        L_0x0015:
            r2 = r3
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x0018:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C7088y5.m27037b(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):e.f.a.c.f.g.y5");
    }

    /* renamed from: e */
    static synchronized void m27038e() {
        synchronized (C7088y5.class) {
            for (C7088y5 y5Var : f19054a.values()) {
                y5Var.f19056c.unregisterContentObserver(y5Var.f19059f);
            }
            f19054a.clear();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo19678a(String str) {
        return (String) mo20451c().get(str);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final Map mo20451c() {
        Map map;
        Map map2 = this.f19061h;
        if (map2 == null) {
            synchronized (this.f19060g) {
                map2 = this.f19061h;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) C6716b6.m25455a(new C7056w5(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        try {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.f19061h = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Map mo20452d() {
        Cursor query = this.f19056c.query(this.f19057d, f19055b, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map aVar = count <= 256 ? new C1788a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                aVar.put(query.getString(0), query.getString(1));
            }
            query.close();
            return aVar;
        } finally {
            query.close();
        }
    }

    /* renamed from: f */
    public final void mo20453f() {
        synchronized (this.f19060g) {
            this.f19061h = null;
            this.f19058e.run();
        }
        synchronized (this) {
            for (C7104z5 zza : this.f19062i) {
                zza.zza();
            }
        }
    }
}
