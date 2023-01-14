package p174e.p319f.p320a.p335c.p345f.p356k;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: e.f.a.c.f.k.ka */
public abstract class C7910ka extends C7783b0 implements C7911kb {
    /* renamed from: j */
    public static C7911kb m28056j(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
        return queryLocalInterface instanceof C7911kb ? (C7911kb) queryLocalInterface : new C7896j9(iBinder);
    }
}
