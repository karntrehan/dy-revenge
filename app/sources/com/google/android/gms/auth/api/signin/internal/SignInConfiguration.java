package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

public final class SignInConfiguration extends C3730a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C3461w();

    /* renamed from: f */
    private final String f9771f;

    /* renamed from: o */
    private GoogleSignInOptions f9772o;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f9771f = C3705r.m14342g(str);
        this.f9772o = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f9771f.equals(signInConfiguration.f9771f)) {
            GoogleSignInOptions googleSignInOptions = this.f9772o;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f9772o;
            if (googleSignInOptions != null) {
                return googleSignInOptions.equals(googleSignInOptions2);
            }
            if (googleSignInOptions2 == null) {
                return true;
            }
        }
    }

    public final int hashCode() {
        return new C3440b().mo11116a(this.f9771f).mo11116a(this.f9772o).mo11117b();
    }

    /* renamed from: o */
    public final GoogleSignInOptions mo11111o() {
        return this.f9772o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 2, this.f9771f, false);
        C3733c.m14447p(parcel, 5, this.f9772o, i, false);
        C3733c.m14433b(parcel, a);
    }
}
