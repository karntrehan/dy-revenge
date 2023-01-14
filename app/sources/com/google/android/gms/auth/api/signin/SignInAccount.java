package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

public class SignInAccount extends C3730a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C3466l();
    @Deprecated

    /* renamed from: f */
    String f9763f;

    /* renamed from: o */
    private GoogleSignInAccount f9764o;
    @Deprecated

    /* renamed from: p */
    String f9765p;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f9764o = googleSignInAccount;
        this.f9763f = C3705r.m14343h(str, "8.3 and 8.4 SDKs require non-null email");
        this.f9765p = C3705r.m14343h(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    /* renamed from: o */
    public final GoogleSignInAccount mo11097o() {
        return this.f9764o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 4, this.f9763f, false);
        C3733c.m14447p(parcel, 7, this.f9764o, i, false);
        C3733c.m14448q(parcel, 8, this.f9765p, false);
        C3733c.m14433b(parcel, a);
    }
}
