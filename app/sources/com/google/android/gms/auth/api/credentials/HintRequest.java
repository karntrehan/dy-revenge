package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import com.reactnativecommunity.webview.RNCWebViewManager;

@Deprecated
public final class HintRequest extends C3730a implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new C3427d();

    /* renamed from: f */
    final int f9704f;

    /* renamed from: o */
    private final CredentialPickerConfig f9705o;

    /* renamed from: p */
    private final boolean f9706p;

    /* renamed from: q */
    private final boolean f9707q;

    /* renamed from: r */
    private final String[] f9708r;

    /* renamed from: s */
    private final boolean f9709s;

    /* renamed from: t */
    private final String f9710t;

    /* renamed from: u */
    private final String f9711u;

    /* renamed from: com.google.android.gms.auth.api.credentials.HintRequest$a */
    public static final class C3423a {

        /* renamed from: a */
        private boolean f9712a;

        /* renamed from: b */
        private boolean f9713b;

        /* renamed from: c */
        private String[] f9714c;

        /* renamed from: d */
        private CredentialPickerConfig f9715d = new CredentialPickerConfig.C3422a().mo11041a();

        /* renamed from: e */
        private boolean f9716e = false;

        /* renamed from: f */
        private String f9717f;

        /* renamed from: g */
        private String f9718g;

        /* renamed from: a */
        public HintRequest mo11049a() {
            if (this.f9714c == null) {
                this.f9714c = new String[0];
            }
            if (this.f9712a || this.f9713b || this.f9714c.length != 0) {
                return new HintRequest(2, this.f9715d, this.f9712a, this.f9713b, this.f9714c, this.f9716e, this.f9717f, this.f9718g);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        /* renamed from: b */
        public C3423a mo11050b(boolean z) {
            this.f9713b = z;
            return this;
        }
    }

    HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.f9704f = i;
        this.f9705o = (CredentialPickerConfig) C3705r.m14346k(credentialPickerConfig);
        this.f9706p = z;
        this.f9707q = z2;
        this.f9708r = (String[]) C3705r.m14346k(strArr);
        if (i < 2) {
            this.f9709s = true;
            this.f9710t = null;
            this.f9711u = null;
            return;
        }
        this.f9709s = z3;
        this.f9710t = str;
        this.f9711u = str2;
    }

    /* renamed from: C */
    public String mo11042C() {
        return this.f9710t;
    }

    /* renamed from: E */
    public boolean mo11043E() {
        return this.f9706p;
    }

    /* renamed from: G */
    public boolean mo11044G() {
        return this.f9709s;
    }

    /* renamed from: o */
    public String[] mo11045o() {
        return this.f9708r;
    }

    /* renamed from: p */
    public CredentialPickerConfig mo11046p() {
        return this.f9705o;
    }

    /* renamed from: r */
    public String mo11047r() {
        return this.f9711u;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14447p(parcel, 1, mo11046p(), i, false);
        C3733c.m14434c(parcel, 2, mo11043E());
        C3733c.m14434c(parcel, 3, this.f9707q);
        C3733c.m14449r(parcel, 4, mo11045o(), false);
        C3733c.m14434c(parcel, 5, mo11044G());
        C3733c.m14448q(parcel, 6, mo11042C(), false);
        C3733c.m14448q(parcel, 7, mo11047r(), false);
        C3733c.m14443l(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f9704f);
        C3733c.m14433b(parcel, a);
    }
}
