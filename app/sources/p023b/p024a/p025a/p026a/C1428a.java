package p023b.p024a.p025a.p026a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: b.a.a.a.a */
public interface C1428a extends IInterface {

    /* renamed from: b.a.a.a.a$a */
    public static abstract class C1429a extends Binder implements C1428a {

        /* renamed from: b.a.a.a.a$a$a */
        private static class C1430a implements C1428a {

            /* renamed from: a */
            private IBinder f4177a;

            C1430a(IBinder iBinder) {
                this.f4177a = iBinder;
            }

            public IBinder asBinder() {
                return this.f4177a;
            }
        }

        public C1429a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: j */
        public static C1428a m6438j(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C1428a)) ? new C1430a(iBinder) : (C1428a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                mo5310N0(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    /* renamed from: N0 */
    void mo5310N0(int i, Bundle bundle);
}
