package p174e.p319f.p320a.p335c.p345f.p346a;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: e.f.a.c.f.a.d */
public final class C6647d extends C6644a implements C6649f {
    C6647d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: B */
    public final boolean mo19452B(boolean z) {
        Parcel j = mo19450j();
        C6646c.m25283a(j, true);
        Parcel k = mo19451k(2, j);
        boolean b = C6646c.m25284b(k);
        k.recycle();
        return b;
    }

    /* renamed from: a */
    public final String mo19453a() {
        Parcel k = mo19451k(1, mo19450j());
        String readString = k.readString();
        k.recycle();
        return readString;
    }
}
