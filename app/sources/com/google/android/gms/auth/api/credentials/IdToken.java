package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3697p;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

@Deprecated
public final class IdToken extends C3730a implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new C3428e();

    /* renamed from: f */
    private final String f9719f;

    /* renamed from: o */
    private final String f9720o;

    public IdToken(String str, String str2) {
        C3705r.m14337b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        C3705r.m14337b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f9719f = str;
        this.f9720o = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return C3697p.m14323b(this.f9719f, idToken.f9719f) && C3697p.m14323b(this.f9720o, idToken.f9720o);
    }

    /* renamed from: o */
    public String mo11052o() {
        return this.f9719f;
    }

    /* renamed from: p */
    public String mo11053p() {
        return this.f9720o;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 1, mo11052o(), false);
        C3733c.m14448q(parcel, 2, mo11053p(), false);
        C3733c.m14433b(parcel, a);
    }
}
