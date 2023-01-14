package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.C3430a;
import com.google.android.gms.auth.api.signin.C3432c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.C3768o;

/* renamed from: com.google.android.gms.auth.api.signin.internal.v */
public final class C3460v extends C3455q {

    /* renamed from: a */
    private final Context f9801a;

    public C3460v(Context context) {
        this.f9801a = context;
    }

    /* renamed from: k */
    private final void m13478k() {
        if (!C3768o.m14536a(this.f9801a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            throw new SecurityException("Calling UID " + callingUid + " is not Google Play services.");
        }
    }

    /* renamed from: F */
    public final void mo11145F() {
        m13478k();
        C3441c b = C3441c.m13432b(this.f9801a);
        GoogleSignInAccount c = b.mo11120c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f9735f;
        if (c != null) {
            googleSignInOptions = b.mo11121d();
        }
        C3432c a = C3430a.m13416a(this.f9801a, googleSignInOptions);
        if (c != null) {
            a.mo11099p();
        } else {
            a.mo11100q();
        }
    }

    /* renamed from: t */
    public final void mo11146t() {
        m13478k();
        C3454p.m13465a(this.f9801a).mo11142b();
    }
}
