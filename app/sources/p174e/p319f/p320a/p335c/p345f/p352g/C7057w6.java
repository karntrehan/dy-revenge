package p174e.p319f.p320a.p335c.p345f.p352g;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import p027c.p060f.C1788a;

/* renamed from: e.f.a.c.f.g.w6 */
public final class C7057w6 implements C6750d6 {

    /* renamed from: a */
    private static final Map f19034a = new C1788a();

    /* renamed from: b */
    private final SharedPreferences f19035b;

    /* renamed from: b */
    static C7057w6 m26969b(Context context, String str, Runnable runnable) {
        C7057w6 w6Var;
        if (!C7024u5.m26734a()) {
            synchronized (C7057w6.class) {
                w6Var = (C7057w6) f19034a.get((Object) null);
                if (w6Var == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return w6Var;
        }
        throw null;
    }

    /* renamed from: c */
    static synchronized void m26970c() {
        synchronized (C7057w6.class) {
            Map map = f19034a;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = ((C7057w6) it.next()).f19035b;
                throw null;
            }
        }
    }

    /* renamed from: a */
    public final Object mo19678a(String str) {
        throw null;
    }
}
