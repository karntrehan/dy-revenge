package p174e.p319f.p320a.p335c.p345f.p357l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import p027c.p060f.C1788a;

/* renamed from: e.f.a.c.f.l.c */
public final class C8145c implements C8347mc {

    /* renamed from: a */
    private static final Map<String, C8145c> f22139a = new C1788a();

    /* renamed from: b */
    private final SharedPreferences f22140b;

    /* renamed from: b */
    static C8145c m28371b(Context context, String str) {
        C8145c cVar;
        if (!C8207f4.m28493a()) {
            synchronized (C8145c.class) {
                cVar = f22139a.get((Object) null);
                if (cVar == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return cVar;
        }
        throw null;
    }

    /* renamed from: c */
    static synchronized void m28372c() {
        synchronized (C8145c.class) {
            Map<String, C8145c> map = f22139a;
            Iterator<C8145c> it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = it.next().f22140b;
                throw null;
            }
        }
    }

    /* renamed from: a */
    public final Object mo21701a(String str) {
        throw null;
    }
}
