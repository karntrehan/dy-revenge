package p174e.p319f.p320a.p382e.p383a.p385b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: e.f.a.e.a.b.m0 */
public final class C9126m0 extends C9110e0 implements C9130o0 {
    C9126m0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    /* renamed from: C */
    public final void mo23103C(String str, Bundle bundle, Bundle bundle2, C9134q0 q0Var) {
        Parcel j = mo23089j();
        j.writeString(str);
        C9114g0.m30345b(j, bundle);
        C9114g0.m30345b(j, bundle2);
        C9114g0.m30346c(j, q0Var);
        mo23090k(9, j);
    }

    /* renamed from: G0 */
    public final void mo23104G0(String str, Bundle bundle, C9134q0 q0Var) {
        Parcel j = mo23089j();
        j.writeString(str);
        C9114g0.m30345b(j, bundle);
        C9114g0.m30346c(j, q0Var);
        mo23090k(5, j);
    }

    /* renamed from: I0 */
    public final void mo23105I0(String str, Bundle bundle, Bundle bundle2, C9134q0 q0Var) {
        Parcel j = mo23089j();
        j.writeString(str);
        C9114g0.m30345b(j, bundle);
        C9114g0.m30345b(j, bundle2);
        C9114g0.m30346c(j, q0Var);
        mo23090k(6, j);
    }

    /* renamed from: Q */
    public final void mo23106Q(String str, Bundle bundle, C9134q0 q0Var) {
        Parcel j = mo23089j();
        j.writeString(str);
        C9114g0.m30345b(j, bundle);
        C9114g0.m30346c(j, q0Var);
        mo23090k(10, j);
    }

    /* renamed from: R */
    public final void mo23107R(String str, Bundle bundle, Bundle bundle2, C9134q0 q0Var) {
        Parcel j = mo23089j();
        j.writeString(str);
        C9114g0.m30345b(j, bundle);
        C9114g0.m30345b(j, bundle2);
        C9114g0.m30346c(j, q0Var);
        mo23090k(11, j);
    }

    /* renamed from: r */
    public final void mo23108r(String str, Bundle bundle, Bundle bundle2, C9134q0 q0Var) {
        Parcel j = mo23089j();
        j.writeString(str);
        C9114g0.m30345b(j, bundle);
        C9114g0.m30345b(j, bundle2);
        C9114g0.m30346c(j, q0Var);
        mo23090k(7, j);
    }

    /* renamed from: s */
    public final void mo23109s(String str, List<Bundle> list, Bundle bundle, C9134q0 q0Var) {
        Parcel j = mo23089j();
        j.writeString(str);
        j.writeTypedList(list);
        C9114g0.m30345b(j, bundle);
        C9114g0.m30346c(j, q0Var);
        mo23090k(14, j);
    }
}
