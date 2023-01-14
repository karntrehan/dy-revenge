package p174e.p319f.p320a.p335c.p345f.p357l;

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

/* renamed from: e.f.a.c.f.l.j8 */
public final class C8287j8 implements C8347mc {

    /* renamed from: a */
    private static final Map<Uri, C8287j8> f22669a = new C1788a();

    /* renamed from: b */
    public static final String[] f22670b = {"key", "value"};

    /* renamed from: c */
    private final ContentResolver f22671c;

    /* renamed from: d */
    private final Uri f22672d;

    /* renamed from: e */
    private final ContentObserver f22673e;

    /* renamed from: f */
    private final Object f22674f = new Object();

    /* renamed from: g */
    private volatile Map<String, String> f22675g;

    /* renamed from: h */
    private final List<C8307k9> f22676h = new ArrayList();

    private C8287j8(ContentResolver contentResolver, Uri uri) {
        C8267i7 i7Var = new C8267i7(this, (Handler) null);
        this.f22673e = i7Var;
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f22671c = contentResolver;
        this.f22672d = uri;
        contentResolver.registerContentObserver(uri, false, i7Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p174e.p319f.p320a.p335c.p345f.p357l.C8287j8 m28616b(android.content.ContentResolver r4, android.net.Uri r5) {
        /*
            java.lang.Class<e.f.a.c.f.l.j8> r0 = p174e.p319f.p320a.p335c.p345f.p357l.C8287j8.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, e.f.a.c.f.l.j8> r1 = f22669a     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0018 }
            e.f.a.c.f.l.j8 r2 = (p174e.p319f.p320a.p335c.p345f.p357l.C8287j8) r2     // Catch:{ all -> 0x0018 }
            if (r2 != 0) goto L_0x0016
            e.f.a.c.f.l.j8 r3 = new e.f.a.c.f.l.j8     // Catch:{ SecurityException -> 0x0016 }
            r3.<init>(r4, r5)     // Catch:{ SecurityException -> 0x0016 }
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
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p357l.C8287j8.m28616b(android.content.ContentResolver, android.net.Uri):e.f.a.c.f.l.j8");
    }

    /* renamed from: d */
    static synchronized void m28617d() {
        synchronized (C8287j8.class) {
            for (C8287j8 next : f22669a.values()) {
                next.f22671c.unregisterContentObserver(next.f22673e);
            }
            f22669a.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo21701a(String str) {
        Map<String, String> map;
        Map<String, String> map2 = this.f22675g;
        if (map2 == null) {
            synchronized (this.f22674f) {
                map2 = this.f22675g;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) C8327la.m28735a(new C8247h6(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        try {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.f22675g = map;
                    map2 = map;
                }
            }
        }
        if (map2 == null) {
            map2 = Collections.emptyMap();
        }
        return map2.get(str);
    }

    /* renamed from: c */
    public final /* synthetic */ Map mo21887c() {
        Cursor query = this.f22671c.query(this.f22672d, f22670b, (String) null, (String[]) null, (String) null);
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

    /* renamed from: e */
    public final void mo21888e() {
        synchronized (this.f22674f) {
            this.f22675g = null;
            C8126b.m28323d();
        }
        synchronized (this) {
            for (C8307k9 zza : this.f22676h) {
                zza.zza();
            }
        }
    }
}
