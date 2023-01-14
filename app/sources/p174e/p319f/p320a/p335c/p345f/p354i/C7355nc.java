package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: e.f.a.c.f.i.nc */
public abstract class C7355nc extends C7168b0 implements C7369oc {
    /* renamed from: j */
    public static C7369oc m27382j(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        return queryLocalInterface instanceof C7369oc ? (C7369oc) queryLocalInterface : new C7341mc(iBinder);
    }
}
