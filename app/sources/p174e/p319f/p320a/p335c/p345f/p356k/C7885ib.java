package p174e.p319f.p320a.p335c.p345f.p356k;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: e.f.a.c.f.k.ib */
public abstract class C7885ib extends C7783b0 implements C7898jb {
    /* renamed from: j */
    public static C7898jb m28038j(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
        return queryLocalInterface instanceof C7898jb ? (C7898jb) queryLocalInterface : new C7872hb(iBinder);
    }
}
