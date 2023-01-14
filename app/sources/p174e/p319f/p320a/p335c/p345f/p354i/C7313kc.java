package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p174e.p319f.p320a.p335c.p343d.C6634a;

/* renamed from: e.f.a.c.f.i.kc */
public final class C7313kc extends C7152a implements IInterface {
    C7313kc(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    /* renamed from: P0 */
    public final void mo20794P0() {
        mo20560m(2, mo20558j());
    }

    /* renamed from: Y */
    public final List<C7165ac> mo20795Y(C6634a aVar, C7453uc ucVar) {
        Parcel j = mo20558j();
        C7184c1.m27179b(j, aVar);
        C7184c1.m27178a(j, ucVar);
        Parcel k = mo20559k(3, j);
        ArrayList<C7165ac> createTypedArrayList = k.createTypedArrayList(C7165ac.CREATOR);
        k.recycle();
        return createTypedArrayList;
    }

    /* renamed from: c */
    public final void mo20796c() {
        mo20560m(1, mo20558j());
    }
}
