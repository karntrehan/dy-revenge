package p174e.p319f.p320a.p335c.p345f.p358m;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: e.f.a.c.f.m.ya */
public abstract class C8907ya extends C8600b0 implements C8919za {
    /* renamed from: j */
    public static C8919za m29770j(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
        return queryLocalInterface instanceof C8919za ? (C8919za) queryLocalInterface : new C8895xa(iBinder);
    }
}
