package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p174e.p319f.p320a.p335c.p343d.C6634a;
import p174e.p319f.p320a.p335c.p345f.p351f.C6688b;
import p174e.p319f.p320a.p335c.p345f.p351f.C6689c;

/* renamed from: com.google.android.gms.common.internal.a2 */
public abstract class C3646a2 extends C6688b implements C3650b2 {
    public C3646a2() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: k */
    public static C3650b2 m14150k(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof C3650b2 ? (C3650b2) queryLocalInterface : new C3737z1(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo11522j(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C6634a b = mo11526b();
            parcel2.writeNoException();
            C6689c.m25352d(parcel2, b);
        } else if (i != 2) {
            return false;
        } else {
            int a = mo11525a();
            parcel2.writeNoException();
            parcel2.writeInt(a);
        }
        return true;
    }
}
