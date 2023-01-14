package p174e.p319f.p320a.p335c.p345f.p351f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e.f.a.c.f.f.a */
public class C6687a implements IInterface {

    /* renamed from: a */
    private final IBinder f18341a;

    /* renamed from: b */
    private final String f18342b;

    protected C6687a(IBinder iBinder, String str) {
        this.f18341a = iBinder;
        this.f18342b = str;
    }

    public final IBinder asBinder() {
        return this.f18341a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Parcel mo19479j(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f18341a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Parcel mo19480k() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f18342b);
        return obtain;
    }
}
