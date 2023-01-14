package p174e.p319f.p320a.p382e.p383a.p385b;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: e.f.a.e.a.b.k0 */
public abstract class C9122k0 extends C9112f0 implements C9124l0 {
    public C9122k0() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo23093j(int i, Parcel parcel) {
        if (i == 2) {
            mo23066W((Bundle) C9114g0.m30344a(parcel, Bundle.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            mo23065P((Bundle) C9114g0.m30344a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
