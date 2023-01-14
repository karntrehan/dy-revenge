package p174e.p319f.p320a.p335c.p345f.p352g;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import androidx.core.content.C1143c;

/* renamed from: e.f.a.c.f.g.g6 */
final class C6801g6 implements C6750d6 {

    /* renamed from: a */
    private static C6801g6 f18505a;

    /* renamed from: b */
    private final Context f18506b;

    /* renamed from: c */
    private final ContentObserver f18507c;

    private C6801g6() {
        this.f18506b = null;
        this.f18507c = null;
    }

    private C6801g6(Context context) {
        this.f18506b = context;
        C6784f6 f6Var = new C6784f6(this, (Handler) null);
        this.f18507c = f6Var;
        context.getContentResolver().registerContentObserver(C6992s5.f18870a, true, f6Var);
    }

    /* renamed from: b */
    static C6801g6 m25747b(Context context) {
        C6801g6 g6Var;
        synchronized (C6801g6.class) {
            if (f18505a == null) {
                f18505a = C1143c.m4441b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C6801g6(context) : new C6801g6();
            }
            g6Var = f18505a;
        }
        return g6Var;
    }

    /* renamed from: e */
    static synchronized void m25748e() {
        Context context;
        synchronized (C6801g6.class) {
            C6801g6 g6Var = f18505a;
            if (!(g6Var == null || (context = g6Var.f18506b) == null || g6Var.f18507c == null)) {
                context.getContentResolver().unregisterContentObserver(f18505a.f18507c);
            }
            f18505a = null;
        }
    }

    /* renamed from: c */
    public final String mo19678a(String str) {
        if (this.f18506b == null) {
            return null;
        }
        try {
            return (String) C6716b6.m25455a(new C6767e6(this, str));
        } catch (IllegalStateException | NullPointerException | SecurityException e) {
            Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ String mo19800d(String str) {
        return C6992s5.m26479a(this.f18506b.getContentResolver(), str, (String) null);
    }
}
