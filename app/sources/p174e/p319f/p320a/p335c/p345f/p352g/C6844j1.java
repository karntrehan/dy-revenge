package p174e.p319f.p320a.p335c.p345f.p352g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: e.f.a.c.f.g.j1 */
public final class C6844j1 extends C6923o0 implements C6876l1 {
    C6844j1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: b */
    public final int mo19848b() {
        Parcel k = mo20045k(2, mo20044j());
        int readInt = k.readInt();
        k.recycle();
        return readInt;
    }

    /* renamed from: n */
    public final void mo19849n(String str, String str2, Bundle bundle, long j) {
        Parcel j2 = mo20044j();
        j2.writeString(str);
        j2.writeString(str2);
        C6955q0.m26385e(j2, bundle);
        j2.writeLong(j);
        mo20046m(1, j2);
    }
}
