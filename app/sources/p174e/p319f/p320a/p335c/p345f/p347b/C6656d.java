package p174e.p319f.p320a.p335c.p345f.p347b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e.f.a.c.f.b.d */
public class C6656d extends Binder implements IInterface {
    protected C6656d(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo19458j(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo19458j(i, parcel, parcel2, i2);
    }
}
