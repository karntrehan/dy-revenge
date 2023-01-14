package p174e.p319f.p320a.p335c.p345f.p358m;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p174e.p319f.p320a.p335c.p343d.C6634a;

/* renamed from: e.f.a.c.f.m.g6 */
public final class C8671g6 extends C8586a implements IInterface {
    C8671g6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
    }

    /* renamed from: P0 */
    public final C8727ka[] mo22418P0(C6634a aVar, C8615c2 c2Var) {
        Parcel j = mo22300j();
        C8601b1.m29385c(j, aVar);
        C8601b1.m29384b(j, c2Var);
        Parcel k = mo22301k(1, j);
        C8727ka[] kaVarArr = (C8727ka[]) k.createTypedArray(C8727ka.CREATOR);
        k.recycle();
        return kaVarArr;
    }

    /* renamed from: Y */
    public final void mo22419Y() {
        mo22302m(2, mo22300j());
    }
}
