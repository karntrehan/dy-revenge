package p174e.p319f.p320a.p382e.p383a.p385b;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: e.f.a.e.a.b.n0 */
public abstract class C9128n0 extends C9112f0 implements C9130o0 {
    /* renamed from: k */
    public static C9130o0 m30392k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof C9130o0 ? (C9130o0) queryLocalInterface : new C9126m0(iBinder);
    }
}
