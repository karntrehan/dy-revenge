package p174e.p319f.p320a.p382e.p383a.p385b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: e.f.a.e.a.b.h0 */
public final class C9116h0 extends C9110e0 implements C9120j0 {
    C9116h0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* renamed from: I */
    public final void mo23095I(String str, Bundle bundle, C9124l0 l0Var) {
        Parcel j = mo23089j();
        j.writeString(str);
        C9114g0.m30345b(j, bundle);
        C9114g0.m30346c(j, l0Var);
        mo23090k(2, j);
    }

    /* renamed from: v */
    public final void mo23096v(String str, Bundle bundle, C9124l0 l0Var) {
        Parcel j = mo23089j();
        j.writeString(str);
        C9114g0.m30345b(j, bundle);
        C9114g0.m30346c(j, l0Var);
        mo23090k(3, j);
    }
}
