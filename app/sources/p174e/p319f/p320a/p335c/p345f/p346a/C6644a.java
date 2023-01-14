package p174e.p319f.p320a.p335c.p345f.p346a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e.f.a.c.f.a.a */
public class C6644a implements IInterface {

    /* renamed from: a */
    private final IBinder f18310a;

    /* renamed from: b */
    private final String f18311b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected C6644a(IBinder iBinder, String str) {
        this.f18310a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f18310a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Parcel mo19450j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f18311b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Parcel mo19451k(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f18310a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
