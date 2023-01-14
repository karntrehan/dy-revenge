package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import p174e.p319f.p320a.p335c.p345f.p351f.C6688b;
import p174e.p319f.p320a.p335c.p345f.p351f.C6689c;

/* renamed from: com.google.android.gms.common.internal.y0 */
public abstract class C3728y0 extends C6688b implements C3685l {
    public C3728y0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo11522j(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo11616e0(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C6689c.m25349a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            mo11615N(parcel.readInt(), (Bundle) C6689c.m25349a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo11617l0(parcel.readInt(), parcel.readStrongBinder(), (C3690m1) C6689c.m25349a(parcel, C3690m1.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
