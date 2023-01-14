package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p174e.p319f.p320a.p335c.p345f.p348c.C6665b;
import p174e.p319f.p320a.p335c.p345f.p348c.C6668e;

/* renamed from: com.google.android.gms.auth.api.signin.internal.s */
public abstract class C3457s extends C6665b implements C3458t {
    public C3457s() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo11144j(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 101:
                C6668e.m25314b(parcel);
                mo11129c0((GoogleSignInAccount) C6668e.m25313a(parcel, GoogleSignInAccount.CREATOR), (Status) C6668e.m25313a(parcel, Status.CREATOR));
                break;
            case 102:
                C6668e.m25314b(parcel);
                mo11130q0((Status) C6668e.m25313a(parcel, Status.CREATOR));
                break;
            case 103:
                C6668e.m25314b(parcel);
                mo11128Z((Status) C6668e.m25313a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
