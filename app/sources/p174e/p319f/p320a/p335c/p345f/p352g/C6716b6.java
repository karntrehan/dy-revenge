package p174e.p319f.p320a.p335c.p345f.p352g;

import android.os.Binder;

/* renamed from: e.f.a.c.f.g.b6 */
public final /* synthetic */ class C6716b6 {
    /* renamed from: a */
    public static Object m25455a(C6733c6 c6Var) {
        long clearCallingIdentity;
        try {
            return c6Var.zza();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object zza = c6Var.zza();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zza;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
