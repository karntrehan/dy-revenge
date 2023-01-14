package p174e.p319f.p320a.p335c.p345f.p357l;

import android.os.Binder;

/* renamed from: e.f.a.c.f.l.la */
public final /* synthetic */ class C8327la {
    /* renamed from: a */
    public static <V> V m28735a(C8328lb<V> lbVar) {
        long clearCallingIdentity;
        try {
            return lbVar.zza();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zza = lbVar.zza();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zza;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
