package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.C3439a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.p130z.C3731b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.i */
public final class C3438i implements Parcelable.Creator<GoogleSignInOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y = C3731b.m14430y(parcel);
        ArrayList<Scope> arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList<C3439a> arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 1:
                    i = C3731b.m14425t(parcel, r);
                    break;
                case 2:
                    arrayList = C3731b.m14414i(parcel, r, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C3731b.m14409d(parcel, r, Account.CREATOR);
                    break;
                case 4:
                    z = C3731b.m14417l(parcel, r);
                    break;
                case 5:
                    z2 = C3731b.m14417l(parcel, r);
                    break;
                case 6:
                    z3 = C3731b.m14417l(parcel, r);
                    break;
                case 7:
                    str = C3731b.m14410e(parcel, r);
                    break;
                case 8:
                    str2 = C3731b.m14410e(parcel, r);
                    break;
                case 9:
                    arrayList2 = C3731b.m14414i(parcel, r, C3439a.CREATOR);
                    break;
                case 10:
                    str3 = C3731b.m14410e(parcel, r);
                    break;
                default:
                    C3731b.m14429x(parcel, r);
                    break;
            }
        }
        C3731b.m14415j(parcel, y);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
