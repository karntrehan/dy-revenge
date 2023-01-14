package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import p174e.p319f.p320a.p335c.p345f.p348c.C6665b;

/* renamed from: com.google.android.gms.auth.api.signin.internal.q */
public abstract class C3455q extends C6665b implements C3456r {
    public C3455q() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo11144j(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo11145F();
        } else if (i != 2) {
            return false;
        } else {
            mo11146t();
        }
        return true;
    }
}
