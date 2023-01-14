package p174e.p319f.p320a.p335c.p345f.p348c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e.f.a.c.f.c.a */
public class C6664a implements IInterface {

    /* renamed from: a */
    private final IBinder f18324a;

    /* renamed from: b */
    private final String f18325b;

    protected C6664a(IBinder iBinder, String str) {
        this.f18324a = iBinder;
        this.f18325b = str;
    }

    public final IBinder asBinder() {
        return this.f18324a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Parcel mo19463j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f18325b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo19464k(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f18324a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
