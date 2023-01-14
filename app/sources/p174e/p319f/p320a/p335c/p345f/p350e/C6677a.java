package p174e.p319f.p320a.p335c.p345f.p350e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e.f.a.c.f.e.a */
public class C6677a implements IInterface {

    /* renamed from: a */
    private final IBinder f18333a;

    /* renamed from: b */
    private final String f18334b;

    protected C6677a(IBinder iBinder, String str) {
        this.f18333a = iBinder;
        this.f18334b = str;
    }

    public final IBinder asBinder() {
        return this.f18333a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Parcel mo19470j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f18334b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo19471k(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f18333a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo19472m(int i, Parcel parcel) {
        try {
            this.f18333a.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
