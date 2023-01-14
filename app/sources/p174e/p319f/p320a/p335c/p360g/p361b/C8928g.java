package p174e.p319f.p320a.p335c.p360g.p361b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.C3678j;
import p174e.p319f.p320a.p335c.p345f.p350e.C6677a;
import p174e.p319f.p320a.p335c.p345f.p350e.C6679c;

/* renamed from: e.f.a.c.g.b.g */
public final class C8928g extends C6677a implements IInterface {
    C8928g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: P0 */
    public final void mo22736P0(C3678j jVar, int i, boolean z) {
        Parcel j = mo19470j();
        C6679c.m25339d(j, jVar);
        j.writeInt(i);
        C6679c.m25337b(j, z);
        mo19471k(9, j);
    }

    /* renamed from: Q0 */
    public final void mo22737Q0(C8931j jVar, C8927f fVar) {
        Parcel j = mo19470j();
        C6679c.m25338c(j, jVar);
        C6679c.m25339d(j, fVar);
        mo19471k(12, j);
    }

    /* renamed from: Y */
    public final void mo22738Y(int i) {
        Parcel j = mo19470j();
        j.writeInt(i);
        mo19471k(7, j);
    }
}
