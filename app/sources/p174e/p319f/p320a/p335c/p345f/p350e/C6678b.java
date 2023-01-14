package p174e.p319f.p320a.p335c.p345f.p350e;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e.f.a.c.f.e.b */
public class C6678b extends Binder implements IInterface {
    protected C6678b(String str) {
        attachInterface(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public boolean mo19473P0(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo19473P0(i, parcel, parcel2, i2);
    }
}
