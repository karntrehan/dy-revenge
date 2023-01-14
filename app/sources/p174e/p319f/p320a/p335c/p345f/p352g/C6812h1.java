package p174e.p319f.p320a.p335c.p345f.p352g;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: e.f.a.c.f.g.h1 */
public abstract class C6812h1 extends C6939p0 implements C6828i1 {
    public C6812h1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo12237j(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        C6955q0.m26383c(parcel);
        mo19555f((Bundle) C6955q0.m26381a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
