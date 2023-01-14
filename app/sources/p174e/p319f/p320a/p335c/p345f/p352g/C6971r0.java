package p174e.p319f.p320a.p335c.p345f.p352g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: e.f.a.c.f.g.r0 */
public final class C6971r0 extends C6923o0 implements C7003t0 {
    C6971r0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: f */
    public final Bundle mo20120f(Bundle bundle) {
        Parcel j = mo20044j();
        C6955q0.m26385e(j, bundle);
        Parcel k = mo20045k(1, j);
        Bundle bundle2 = (Bundle) C6955q0.m26381a(k, Bundle.CREATOR);
        k.recycle();
        return bundle2;
    }
}
