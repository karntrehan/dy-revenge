package p174e.p319f.p320a.p335c.p345f.p347b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e.f.a.c.f.b.a */
public class C6653a implements IInterface {

    /* renamed from: a */
    private final IBinder f18314a;

    /* renamed from: b */
    private final String f18315b = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    protected C6653a(IBinder iBinder, String str) {
        this.f18314a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f18314a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Parcel mo19455j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f18315b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo19456k(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f18314a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
