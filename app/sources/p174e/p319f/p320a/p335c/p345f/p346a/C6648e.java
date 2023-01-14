package p174e.p319f.p320a.p335c.p345f.p346a;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: e.f.a.c.f.a.e */
public abstract class C6648e extends C6645b implements C6649f {
    /* renamed from: j */
    public static C6649f m25287j(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof C6649f ? (C6649f) queryLocalInterface : new C6647d(iBinder);
    }
}
