package p174e.p319f.p320a.p335c.p345f.p352g;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: e.f.a.c.f.g.s0 */
public abstract class C6987s0 extends C6939p0 implements C7003t0 {
    /* renamed from: k */
    public static C7003t0 m26464k(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof C7003t0 ? (C7003t0) queryLocalInterface : new C6971r0(iBinder);
    }
}
