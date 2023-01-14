package p174e.p319f.p320a.p335c.p345f.p356k;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p174e.p319f.p320a.p335c.p343d.C6634a;

/* renamed from: e.f.a.c.f.k.gb */
public final class C7859gb extends C7769a implements IInterface {
    C7859gb(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.face.aidls.IFaceDetector");
    }

    /* renamed from: P0 */
    public final void mo21366P0() {
        mo21215m(2, mo21213j());
    }

    /* renamed from: Y */
    public final List<C7833eb> mo21367Y(C6634a aVar, C8092ya yaVar) {
        Parcel j = mo21213j();
        C7784b1.m27860b(j, aVar);
        C7784b1.m27859a(j, yaVar);
        Parcel k = mo21214k(3, j);
        ArrayList<C7833eb> createTypedArrayList = k.createTypedArrayList(C7833eb.CREATOR);
        k.recycle();
        return createTypedArrayList;
    }

    /* renamed from: c */
    public final void mo21368c() {
        mo21215m(1, mo21213j());
    }
}
