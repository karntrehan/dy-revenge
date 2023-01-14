package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import com.reactnativecommunity.webview.RNCWebViewManager;

@Deprecated
public final class CredentialPickerConfig extends C3730a implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new C3426c();

    /* renamed from: f */
    final int f9697f;

    /* renamed from: o */
    private final boolean f9698o;

    /* renamed from: p */
    private final boolean f9699p;

    /* renamed from: q */
    private final int f9700q;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    public static class C3422a {

        /* renamed from: a */
        private boolean f9701a = false;

        /* renamed from: b */
        private boolean f9702b = true;

        /* renamed from: c */
        private int f9703c = 1;

        /* renamed from: a */
        public CredentialPickerConfig mo11041a() {
            return new CredentialPickerConfig(2, this.f9701a, this.f9702b, false, this.f9703c);
        }
    }

    CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.f9697f = i;
        this.f9698o = z;
        this.f9699p = z2;
        if (i < 2) {
            this.f9700q = true == z3 ? 3 : 1;
        } else {
            this.f9700q = i2;
        }
    }

    @Deprecated
    /* renamed from: o */
    public boolean mo11037o() {
        return this.f9700q == 3;
    }

    /* renamed from: p */
    public boolean mo11038p() {
        return this.f9698o;
    }

    /* renamed from: r */
    public boolean mo11039r() {
        return this.f9699p;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14434c(parcel, 1, mo11038p());
        C3733c.m14434c(parcel, 2, mo11039r());
        C3733c.m14434c(parcel, 3, mo11037o());
        C3733c.m14443l(parcel, 4, this.f9700q);
        C3733c.m14443l(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f9697f);
        C3733c.m14433b(parcel, a);
    }
}
