package p174e.p319f.p320a.p335c.p360g.p361b;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.api.Status;
import p174e.p319f.p320a.p335c.p345f.p350e.C6678b;
import p174e.p319f.p320a.p335c.p345f.p350e.C6679c;

/* renamed from: e.f.a.c.g.b.e */
public abstract class C8926e extends C6678b implements C8927f {
    public C8926e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public final boolean mo19473P0(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                C3623b bVar = (C3623b) C6679c.m25336a(parcel, C3623b.CREATOR);
                C8923b bVar2 = (C8923b) C6679c.m25336a(parcel, C8923b.CREATOR);
                break;
            case 4:
            case 6:
                Status status = (Status) C6679c.m25336a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status2 = (Status) C6679c.m25336a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C6679c.m25336a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo11291G((C8933l) C6679c.m25336a(parcel, C8933l.CREATOR));
                break;
            case 9:
                C8929h hVar = (C8929h) C6679c.m25336a(parcel, C8929h.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
