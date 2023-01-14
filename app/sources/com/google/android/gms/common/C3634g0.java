package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C3646a2;
import com.google.android.gms.common.internal.p130z.C3730a;
import com.google.android.gms.common.internal.p130z.C3733c;
import p174e.p319f.p320a.p335c.p343d.C6634a;
import p174e.p319f.p320a.p335c.p343d.C6636b;

/* renamed from: com.google.android.gms.common.g0 */
public final class C3634g0 extends C3730a {
    public static final Parcelable.Creator<C3634g0> CREATOR = new C3636h0();

    /* renamed from: f */
    private final String f10211f;

    /* renamed from: o */
    private final C3774w f10212o;

    /* renamed from: p */
    private final boolean f10213p;

    /* renamed from: q */
    private final boolean f10214q;

    C3634g0(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f10211f = str;
        C3775x xVar = null;
        if (iBinder != null) {
            try {
                C6634a b = C3646a2.m14150k(iBinder).mo11526b();
                byte[] bArr = b == null ? null : (byte[]) C6636b.m25277m(b);
                if (bArr != null) {
                    xVar = new C3775x(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f10212o = xVar;
        this.f10213p = z;
        this.f10214q = z2;
    }

    C3634g0(String str, C3774w wVar, boolean z, boolean z2) {
        this.f10211f = str;
        this.f10212o = wVar;
        this.f10213p = z;
        this.f10214q = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14448q(parcel, 1, this.f10211f, false);
        C3774w wVar = this.f10212o;
        if (wVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            wVar = null;
        }
        C3733c.m14442k(parcel, 2, wVar, false);
        C3733c.m14434c(parcel, 3, this.f10213p);
        C3733c.m14434c(parcel, 4, this.f10214q);
        C3733c.m14433b(parcel, a);
    }
}
