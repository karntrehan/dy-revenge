package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3697p;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: com.google.android.gms.common.b */
public final class C3623b extends C3730a {
    public static final Parcelable.Creator<C3623b> CREATOR = new C3748p();

    /* renamed from: f */
    public static final C3623b f10185f = new C3623b(0);

    /* renamed from: o */
    final int f10186o;

    /* renamed from: p */
    private final int f10187p;

    /* renamed from: q */
    private final PendingIntent f10188q;

    /* renamed from: r */
    private final String f10189r;

    public C3623b(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    C3623b(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f10186o = i;
        this.f10187p = i2;
        this.f10188q = pendingIntent;
        this.f10189r = str;
    }

    public C3623b(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public C3623b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    /* renamed from: H */
    static String m14075H(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    /* renamed from: C */
    public boolean mo11457C() {
        return (this.f10187p == 0 || this.f10188q == null) ? false : true;
    }

    /* renamed from: E */
    public boolean mo11458E() {
        return this.f10187p == 0;
    }

    /* renamed from: G */
    public void mo11459G(Activity activity, int i) {
        if (mo11457C()) {
            PendingIntent pendingIntent = this.f10188q;
            C3705r.m14346k(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3623b)) {
            return false;
        }
        C3623b bVar = (C3623b) obj;
        return this.f10187p == bVar.f10187p && C3697p.m14323b(this.f10188q, bVar.f10188q) && C3697p.m14323b(this.f10189r, bVar.f10189r);
    }

    public int hashCode() {
        return C3697p.m14324c(Integer.valueOf(this.f10187p), this.f10188q, this.f10189r);
    }

    /* renamed from: o */
    public int mo11462o() {
        return this.f10187p;
    }

    /* renamed from: p */
    public String mo11463p() {
        return this.f10189r;
    }

    /* renamed from: r */
    public PendingIntent mo11464r() {
        return this.f10188q;
    }

    public String toString() {
        C3697p.C3698a d = C3697p.m14325d(this);
        d.mo11646a("statusCode", m14075H(this.f10187p));
        d.mo11646a("resolution", this.f10188q);
        d.mo11646a("message", this.f10189r);
        return d.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, this.f10186o);
        C3733c.m14443l(parcel, 2, mo11462o());
        C3733c.m14447p(parcel, 3, mo11464r(), i, false);
        C3733c.m14448q(parcel, 4, mo11463p(), false);
        C3733c.m14433b(parcel, a);
    }
}
