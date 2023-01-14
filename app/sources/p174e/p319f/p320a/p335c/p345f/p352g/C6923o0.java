package p174e.p319f.p320a.p335c.p345f.p352g;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e.f.a.c.f.g.o0 */
public class C6923o0 implements IInterface {

    /* renamed from: a */
    private final IBinder f18728a;

    /* renamed from: b */
    private final String f18729b;

    protected C6923o0(IBinder iBinder, String str) {
        this.f18728a = iBinder;
        this.f18729b = str;
    }

    public final IBinder asBinder() {
        return this.f18728a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Parcel mo20044j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f18729b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Parcel mo20045k(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f18728a.transact(i, parcel, parcel, 0);
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
    public final void mo20046m(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f18728a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
