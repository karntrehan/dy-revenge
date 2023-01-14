package p174e.p319f.p320a.p335c.p345f.p352g;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: e.f.a.c.f.g.k1 */
public abstract class C6860k1 extends C6939p0 implements C6876l1 {
    public C6860k1() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo12237j(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            long readLong = parcel.readLong();
            C6955q0.m26383c(parcel);
            mo19849n(parcel.readString(), parcel.readString(), (Bundle) C6955q0.m26381a(parcel, Bundle.CREATOR), readLong);
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int b = mo19848b();
            parcel2.writeNoException();
            parcel2.writeInt(b);
        }
        return true;
    }
}
