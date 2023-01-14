package p174e.p319f.p320a.p335c.p345f.p358m;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: e.f.a.c.f.m.i8 */
public abstract class C8699i8 extends C8600b0 implements C8713j9 {
    /* renamed from: j */
    public static C8713j9 m29517j(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
        return queryLocalInterface instanceof C8713j9 ? (C8713j9) queryLocalInterface : new C8685h7(iBinder);
    }
}
