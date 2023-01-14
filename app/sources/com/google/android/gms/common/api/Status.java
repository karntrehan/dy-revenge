package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C3623b;
import com.google.android.gms.common.internal.C3697p;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import com.reactnativecommunity.webview.RNCWebViewManager;

public final class Status extends C3730a implements C3612k, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C3622u();

    /* renamed from: f */
    public static final Status f9819f = new Status(0);

    /* renamed from: o */
    public static final Status f9820o = new Status(14);

    /* renamed from: p */
    public static final Status f9821p = new Status(8);

    /* renamed from: q */
    public static final Status f9822q = new Status(15);

    /* renamed from: r */
    public static final Status f9823r = new Status(16);

    /* renamed from: s */
    public static final Status f9824s = new Status(18);

    /* renamed from: t */
    public static final Status f9825t = new Status(17);

    /* renamed from: u */
    final int f9826u;

    /* renamed from: v */
    private final int f9827v;

    /* renamed from: w */
    private final String f9828w;

    /* renamed from: x */
    private final PendingIntent f9829x;

    /* renamed from: y */
    private final C3623b f9830y;

    public Status(int i) {
        this(i, (String) null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this(i, i2, str, pendingIntent, (C3623b) null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent, C3623b bVar) {
        this.f9826u = i;
        this.f9827v = i2;
        this.f9828w = str;
        this.f9829x = pendingIntent;
        this.f9830y = bVar;
    }

    public Status(int i, String str) {
        this(1, i, str, (PendingIntent) null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public Status(C3623b bVar, String str) {
        this(bVar, str, 17);
    }

    @Deprecated
    public Status(C3623b bVar, String str, int i) {
        this(1, i, str, bVar.mo11464r(), bVar);
    }

    /* renamed from: C */
    public boolean mo11166C() {
        return this.f9829x != null;
    }

    /* renamed from: E */
    public boolean mo11167E() {
        return this.f9827v <= 0;
    }

    /* renamed from: G */
    public final String mo11168G() {
        String str = this.f9828w;
        return str != null ? str : C3482d.m13534a(this.f9827v);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f9826u == status.f9826u && this.f9827v == status.f9827v && C3697p.m14323b(this.f9828w, status.f9828w) && C3697p.m14323b(this.f9829x, status.f9829x) && C3697p.m14323b(this.f9830y, status.f9830y);
    }

    public int hashCode() {
        return C3697p.m14324c(Integer.valueOf(this.f9826u), Integer.valueOf(this.f9827v), this.f9828w, this.f9829x, this.f9830y);
    }

    /* renamed from: k */
    public Status mo11102k() {
        return this;
    }

    /* renamed from: o */
    public C3623b mo11171o() {
        return this.f9830y;
    }

    /* renamed from: p */
    public int mo11172p() {
        return this.f9827v;
    }

    /* renamed from: r */
    public String mo11173r() {
        return this.f9828w;
    }

    public String toString() {
        C3697p.C3698a d = C3697p.m14325d(this);
        d.mo11646a("statusCode", mo11168G());
        d.mo11646a("resolution", this.f9829x);
        return d.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, mo11172p());
        C3733c.m14448q(parcel, 2, mo11173r(), false);
        C3733c.m14447p(parcel, 3, this.f9829x, i, false);
        C3733c.m14447p(parcel, 4, mo11171o(), i, false);
        C3733c.m14443l(parcel, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f9826u);
        C3733c.m14433b(parcel, a);
    }
}
