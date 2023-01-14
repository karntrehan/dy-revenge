package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3697p;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import java.util.List;

@Deprecated
public class Credential extends C3730a implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new C3425b();

    /* renamed from: f */
    private final String f9689f;

    /* renamed from: o */
    private final String f9690o;

    /* renamed from: p */
    private final Uri f9691p;

    /* renamed from: q */
    private final List f9692q;

    /* renamed from: r */
    private final String f9693r;

    /* renamed from: s */
    private final String f9694s;

    /* renamed from: t */
    private final String f9695t;

    /* renamed from: u */
    private final String f9696u;

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    Credential(java.lang.String r4, java.lang.String r5, android.net.Uri r6, java.util.List r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "credential identifier cannot be null"
            java.lang.Object r4 = com.google.android.gms.common.internal.C3705r.m14347l(r4, r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.trim()
            java.lang.String r0 = "credential identifier cannot be empty"
            com.google.android.gms.common.internal.C3705r.m14343h(r4, r0)
            if (r8 == 0) goto L_0x0025
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x001d
            goto L_0x0025
        L_0x001d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Password must not be empty if set"
            r4.<init>(r5)
            throw r4
        L_0x0025:
            if (r9 == 0) goto L_0x0083
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x0030
        L_0x002d:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x0074
        L_0x0030:
            android.net.Uri r0 = android.net.Uri.parse(r9)
            boolean r1 = r0.isAbsolute()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0.isHierarchical()
            if (r1 == 0) goto L_0x002d
            java.lang.String r1 = r0.getScheme()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = r0.getAuthority()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0055
            goto L_0x002d
        L_0x0055:
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "http"
            boolean r1 = r2.equalsIgnoreCase(r1)
            r2 = 1
            if (r1 != 0) goto L_0x0070
            java.lang.String r0 = r0.getScheme()
            java.lang.String r1 = "https"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L_0x0074:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007b
            goto L_0x0083
        L_0x007b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Account type must be a valid Http/Https URI"
            r4.<init>(r5)
            throw r4
        L_0x0083:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0098
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0090
            goto L_0x0098
        L_0x0090:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Password and AccountType are mutually exclusive"
            r4.<init>(r5)
            throw r4
        L_0x0098:
            if (r5 == 0) goto L_0x00a5
            java.lang.String r0 = r5.trim()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00a5
            r5 = 0
        L_0x00a5:
            r3.f9690o = r5
            r3.f9691p = r6
            if (r7 != 0) goto L_0x00b0
            java.util.List r5 = java.util.Collections.emptyList()
            goto L_0x00b4
        L_0x00b0:
            java.util.List r5 = java.util.Collections.unmodifiableList(r7)
        L_0x00b4:
            r3.f9692q = r5
            r3.f9689f = r4
            r3.f9693r = r8
            r3.f9694s = r9
            r3.f9695t = r10
            r3.f9696u = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.credentials.Credential.<init>(java.lang.String, java.lang.String, android.net.Uri, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: C */
    public String mo11026C() {
        return this.f9689f;
    }

    /* renamed from: E */
    public List<IdToken> mo11027E() {
        return this.f9692q;
    }

    /* renamed from: G */
    public String mo11028G() {
        return this.f9690o;
    }

    /* renamed from: H */
    public String mo11029H() {
        return this.f9693r;
    }

    /* renamed from: I */
    public Uri mo11030I() {
        return this.f9691p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f9689f, credential.f9689f) && TextUtils.equals(this.f9690o, credential.f9690o) && C3697p.m14323b(this.f9691p, credential.f9691p) && TextUtils.equals(this.f9693r, credential.f9693r) && TextUtils.equals(this.f9694s, credential.f9694s);
    }

    public int hashCode() {
        return C3697p.m14324c(this.f9689f, this.f9690o, this.f9691p, this.f9693r, this.f9694s);
    }

    /* renamed from: o */
    public String mo11033o() {
        return this.f9694s;
    }

    /* renamed from: p */
    public String mo11034p() {
        return this.f9696u;
    }

    /* renamed from: r */
    public String mo11035r() {
        return this.f9695t;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 1, mo11026C(), false);
        C3733c.m14448q(parcel, 2, mo11028G(), false);
        C3733c.m14447p(parcel, 3, mo11030I(), i, false);
        C3733c.m14452u(parcel, 4, mo11027E(), false);
        C3733c.m14448q(parcel, 5, mo11029H(), false);
        C3733c.m14448q(parcel, 6, mo11033o(), false);
        C3733c.m14448q(parcel, 9, mo11035r(), false);
        C3733c.m14448q(parcel, 10, mo11034p(), false);
        C3733c.m14433b(parcel, a);
    }
}
