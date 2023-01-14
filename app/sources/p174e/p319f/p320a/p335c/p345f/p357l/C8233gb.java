package p174e.p319f.p320a.p335c.p345f.p357l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p174e.p319f.p320a.p335c.p343d.C6634a;

/* renamed from: e.f.a.c.f.l.gb */
public abstract class C8233gb extends C8127b0 implements C8252hb {
    public C8233gb() {
        super("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
    }

    public static C8252hb asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
        return queryLocalInterface instanceof C8252hb ? (C8252hb) queryLocalInterface : new C8214fb(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo21670j(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        C8195eb newFaceDetector = newFaceDetector(C6634a.C6635a.m25275k(parcel.readStrongBinder()), (C8579za) C8147c1.m28378a(parcel, C8579za.CREATOR));
        parcel2.writeNoException();
        C8147c1.m28379b(parcel2, newFaceDetector);
        return true;
    }
}
