package p174e.p319f.p320a.p335c.p345f.p357l;

import android.os.Parcel;
import java.util.List;
import p174e.p319f.p320a.p335c.p343d.C6634a;

/* renamed from: e.f.a.c.f.l.db */
public abstract class C8176db extends C8127b0 implements C8195eb {
    public C8176db() {
        super("com.google.mlkit.vision.face.aidls.IFaceDetector");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo21670j(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo12563a();
        } else if (i == 2) {
            mo12564c();
        } else if (i != 3) {
            return false;
        } else {
            List<C8138bb> y = mo12565y(C6634a.C6635a.m25275k(parcel.readStrongBinder()), (C8507va) C8147c1.m28378a(parcel, C8507va.CREATOR));
            parcel2.writeNoException();
            parcel2.writeTypedList(y);
            return true;
        }
        parcel2.writeNoException();
        return true;
    }
}
