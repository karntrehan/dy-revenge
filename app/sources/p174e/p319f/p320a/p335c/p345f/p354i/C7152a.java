package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e.f.a.c.f.i.a */
public class C7152a implements IInterface {

    /* renamed from: a */
    private final IBinder f19132a;

    /* renamed from: b */
    private final String f19133b;

    protected C7152a(IBinder iBinder, String str) {
        this.f19132a = iBinder;
        this.f19133b = str;
    }

    public final IBinder asBinder() {
        return this.f19132a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Parcel mo20558j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f19133b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Parcel mo20559k(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f19132a.transact(i, parcel, parcel, 0);
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
    public final void mo20560m(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f19132a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
