package p174e.p319f.p320a.p382e.p383a.p385b;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: e.f.a.e.a.b.i0 */
public abstract class C9118i0 extends C9112f0 implements C9120j0 {
    /* renamed from: k */
    public static C9120j0 m30351k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof C9120j0 ? (C9120j0) queryLocalInterface : new C9116h0(iBinder);
    }
}
