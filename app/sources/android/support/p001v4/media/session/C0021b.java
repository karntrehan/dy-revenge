package android.support.p001v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.media.session.b */
public interface C0021b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    public static abstract class C0022a extends Binder implements C0021b {

        /* renamed from: android.support.v4.media.session.b$a$a */
        private static class C0023a implements C0021b {

            /* renamed from: a */
            private IBinder f63a;

            C0023a(IBinder iBinder) {
                this.f63a = iBinder;
            }

            public IBinder asBinder() {
                return this.f63a;
            }

            /* renamed from: o */
            public void mo100o(C0019a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f63a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: j */
        public static C0021b m87j(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0021b)) ? new C0023a(iBinder) : (C0021b) queryLocalInterface;
        }
    }

    /* renamed from: o */
    void mo100o(C0019a aVar);
}
