package p174e.p319f.p320a.p382e.p383a.p385b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e.f.a.e.a.b.e0 */
public class C9110e0 implements IInterface {

    /* renamed from: a */
    private final IBinder f24997a;

    /* renamed from: b */
    private final String f24998b;

    protected C9110e0(IBinder iBinder, String str) {
        this.f24997a = iBinder;
        this.f24998b = str;
    }

    public final IBinder asBinder() {
        return this.f24997a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Parcel mo23089j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f24998b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo23090k(int i, Parcel parcel) {
        try {
            this.f24997a.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
