package p174e.p319f.p320a.p335c.p345f.p358m;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e.f.a.c.f.m.a */
public class C8586a implements IInterface {

    /* renamed from: a */
    private final IBinder f23366a;

    /* renamed from: b */
    private final String f23367b;

    protected C8586a(IBinder iBinder, String str) {
        this.f23366a = iBinder;
        this.f23367b = str;
    }

    public final IBinder asBinder() {
        return this.f23366a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Parcel mo22300j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f23367b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Parcel mo22301k(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f23366a.transact(i, parcel, parcel, 0);
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
    public final void mo22302m(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f23366a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
