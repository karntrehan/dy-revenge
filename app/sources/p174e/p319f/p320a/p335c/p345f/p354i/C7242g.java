package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p174e.p319f.p320a.p335c.p343d.C6634a;

/* renamed from: e.f.a.c.f.i.g */
public final class C7242g extends C7152a implements IInterface {
    C7242g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    /* renamed from: P0 */
    public final C7509yc[] mo20717P0(C6634a aVar, C7300k kVar) {
        Parcel j = mo20558j();
        C7184c1.m27179b(j, aVar);
        C7184c1.m27178a(j, kVar);
        Parcel k = mo20559k(1, j);
        C7509yc[] ycVarArr = (C7509yc[]) k.createTypedArray(C7509yc.CREATOR);
        k.recycle();
        return ycVarArr;
    }

    /* renamed from: Q0 */
    public final C7509yc[] mo20718Q0(C6634a aVar, C7300k kVar) {
        Parcel j = mo20558j();
        C7184c1.m27179b(j, aVar);
        C7184c1.m27178a(j, kVar);
        Parcel k = mo20559k(2, j);
        C7509yc[] ycVarArr = (C7509yc[]) k.createTypedArray(C7509yc.CREATOR);
        k.recycle();
        return ycVarArr;
    }

    /* renamed from: Y */
    public final void mo20719Y() {
        mo20560m(3, mo20558j());
    }
}
