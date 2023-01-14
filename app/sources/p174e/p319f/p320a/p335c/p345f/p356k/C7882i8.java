package p174e.p319f.p320a.p335c.p345f.p356k;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p174e.p319f.p320a.p335c.p343d.C6634a;

/* renamed from: e.f.a.c.f.k.i8 */
public final class C7882i8 extends C7769a implements IInterface {
    C7882i8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    /* renamed from: P0 */
    public final C7826e4[] mo21397P0(C6634a aVar, C7976pb pbVar) {
        Parcel j = mo21213j();
        C7784b1.m27860b(j, aVar);
        C7784b1.m27859a(j, pbVar);
        Parcel k = mo21214k(1, j);
        C7826e4[] e4VarArr = (C7826e4[]) k.createTypedArray(C7826e4.CREATOR);
        k.recycle();
        return e4VarArr;
    }

    /* renamed from: Q0 */
    public final C7826e4[] mo21398Q0(C6634a aVar, C6634a aVar2, C6634a aVar3, int i, int i2, int i3, int i4, int i5, int i6, C7976pb pbVar) {
        Parcel j = mo21213j();
        C7784b1.m27860b(j, aVar);
        C7784b1.m27860b(j, aVar2);
        C7784b1.m27860b(j, aVar3);
        j.writeInt(i);
        j.writeInt(i2);
        j.writeInt(i3);
        j.writeInt(i4);
        j.writeInt(i5);
        j.writeInt(i6);
        C7784b1.m27859a(j, pbVar);
        Parcel k = mo21214k(4, j);
        C7826e4[] e4VarArr = (C7826e4[]) k.createTypedArray(C7826e4.CREATOR);
        k.recycle();
        return e4VarArr;
    }

    /* renamed from: Y */
    public final void mo21399Y() {
        mo21215m(3, mo21213j());
    }
}
