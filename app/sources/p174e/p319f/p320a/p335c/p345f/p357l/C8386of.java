package p174e.p319f.p320a.p335c.p345f.p357l;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import androidx.core.content.C1143c;

/* renamed from: e.f.a.c.f.l.of */
final class C8386of implements C8347mc {

    /* renamed from: a */
    private static C8386of f22885a;

    /* renamed from: b */
    private final Context f22886b;

    /* renamed from: c */
    private final ContentObserver f22887c;

    private C8386of() {
        this.f22886b = null;
        this.f22887c = null;
    }

    private C8386of(Context context) {
        this.f22886b = context;
        C8367ne neVar = new C8367ne(this, (Handler) null);
        this.f22887c = neVar;
        context.getContentResolver().registerContentObserver(C8187e3.f22218a, true, neVar);
    }

    /* renamed from: b */
    static C8386of m28912b(Context context) {
        C8386of ofVar;
        synchronized (C8386of.class) {
            if (f22885a == null) {
                f22885a = C1143c.m4441b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C8386of(context) : new C8386of();
            }
            ofVar = f22885a;
        }
        return ofVar;
    }

    /* renamed from: e */
    static synchronized void m28913e() {
        Context context;
        synchronized (C8386of.class) {
            C8386of ofVar = f22885a;
            if (!(ofVar == null || (context = ofVar.f22886b) == null || ofVar.f22887c == null)) {
                context.getContentResolver().unregisterContentObserver(f22885a.f22887c);
            }
            f22885a = null;
        }
    }

    /* renamed from: c */
    public final String mo21701a(String str) {
        if (this.f22886b == null) {
            return null;
        }
        try {
            return (String) C8327la.m28735a(new C8348md(this, str));
        } catch (IllegalStateException | SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    /* renamed from: d */
    public final /* synthetic */ String mo22060d(String str) {
        return C8187e3.m28453a(this.f22886b.getContentResolver(), str, (String) null);
    }
}
