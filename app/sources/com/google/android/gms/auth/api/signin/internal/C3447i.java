package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C3637i;
import com.google.android.gms.common.api.C3486f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3659d;
import com.google.android.gms.common.internal.C3669g;
import p174e.p319f.p320a.p335c.p345f.p348c.C6666c;

/* renamed from: com.google.android.gms.auth.api.signin.internal.i */
public final class C3447i extends C3669g {

    /* renamed from: I */
    private final GoogleSignInOptions f9793I;

    public C3447i(Context context, Looper looper, C3659d dVar, GoogleSignInOptions googleSignInOptions, C3486f.C3488b bVar, C3486f.C3489c cVar) {
        super(context, looper, 91, dVar, bVar, cVar);
        GoogleSignInOptions.C3429a aVar;
        if (googleSignInOptions == null) {
            aVar = new GoogleSignInOptions.C3429a();
        }
        aVar.mo11095e(C6666c.m25312a());
        if (!dVar.mo11571d().isEmpty()) {
            for (Scope d : dVar.mo11571d()) {
                aVar.mo11094d(d, new Scope[0]);
            }
        }
        this.f9793I = aVar.mo11091a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo11133J() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo11134K() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* renamed from: b */
    public final boolean mo11135b() {
        return true;
    }

    /* renamed from: n */
    public final int mo11136n() {
        return C3637i.f10216a;
    }

    /* renamed from: r0 */
    public final GoogleSignInOptions mo11137r0() {
        return this.f9793I;
    }

    /* renamed from: s */
    public final Intent mo11138s() {
        return C3453o.m13461a(mo11529D(), this.f9793I);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo11139x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof C3459u ? (C3459u) queryLocalInterface : new C3459u(iBinder);
    }
}
