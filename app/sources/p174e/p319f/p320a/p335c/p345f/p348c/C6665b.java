package p174e.p319f.p320a.p335c.p345f.p348c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e.f.a.c.f.c.b */
public class C6665b extends Binder implements IInterface {
    protected C6665b(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo11144j(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo11144j(i, parcel, parcel2, i2);
    }
}
