package p174e.p319f.p320a.p335c.p345f.p351f;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e.f.a.c.f.f.b */
public class C6688b extends Binder implements IInterface {
    protected C6688b(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo11522j(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo11522j(i, parcel, parcel2, i2);
    }
}
