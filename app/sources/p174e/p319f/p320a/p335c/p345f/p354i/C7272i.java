package p174e.p319f.p320a.p335c.p345f.p354i;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: e.f.a.c.f.i.i */
public abstract class C7272i extends C7168b0 implements C7286j {
    /* renamed from: j */
    public static C7286j m27311j(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        return queryLocalInterface instanceof C7286j ? (C7286j) queryLocalInterface : new C7257h(iBinder);
    }
}
