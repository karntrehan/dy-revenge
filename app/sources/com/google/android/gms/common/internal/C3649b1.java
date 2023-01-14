package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import p174e.p319f.p320a.p335c.p345f.p351f.C6688b;

/* renamed from: com.google.android.gms.common.internal.b1 */
public abstract class C3649b1 extends C6688b implements C3658c1 {
    /* renamed from: k */
    public static C3658c1 m14153k(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof C3658c1 ? (C3658c1) queryLocalInterface : new C3645a1(iBinder);
    }
}
