package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p174e.p319f.p320a.p335c.p345f.p348c.C6664a;
import p174e.p319f.p320a.p335c.p345f.p348c.C6668e;

/* renamed from: com.google.android.gms.auth.api.signin.internal.u */
public final class C3459u extends C6664a implements IInterface {
    C3459u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: Y */
    public final void mo11147Y(C3458t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel j = mo19463j();
        C6668e.m25316d(j, tVar);
        C6668e.m25315c(j, googleSignInOptions);
        mo19464k(102, j);
    }

    /* renamed from: m */
    public final void mo11148m(C3458t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel j = mo19463j();
        C6668e.m25316d(j, tVar);
        C6668e.m25315c(j, googleSignInOptions);
        mo19464k(103, j);
    }
}
