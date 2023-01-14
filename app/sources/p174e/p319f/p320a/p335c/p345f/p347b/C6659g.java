package p174e.p319f.p320a.p335c.p345f.p347b;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: e.f.a.c.f.b.g */
public abstract class C6659g extends C6656d implements C6660h {
    public C6659g() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo19458j(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo19461C0((Status) C6657e.m25296a(parcel, Status.CREATOR));
        return true;
    }
}
