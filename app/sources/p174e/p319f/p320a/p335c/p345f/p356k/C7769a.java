package p174e.p319f.p320a.p335c.p345f.p356k;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e.f.a.c.f.k.a */
public class C7769a implements IInterface {

    /* renamed from: a */
    private final IBinder f21031a;

    /* renamed from: b */
    private final String f21032b;

    protected C7769a(IBinder iBinder, String str) {
        this.f21031a = iBinder;
        this.f21032b = str;
    }

    public final IBinder asBinder() {
        return this.f21031a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Parcel mo21213j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f21032b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Parcel mo21214k(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f21031a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo21215m(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f21031a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
