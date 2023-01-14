package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C3486f;
import com.google.android.gms.common.api.C3490g;
import com.google.android.gms.common.api.C3492h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3521f;
import com.google.android.gms.common.p131l.C3742a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.o */
public final class C3453o {

    /* renamed from: a */
    private static final C3742a f9796a = new C3742a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m13461a(Context context, GoogleSignInOptions googleSignInOptions) {
        f9796a.mo11709a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: b */
    public static C3490g m13462b(C3486f fVar, Context context, boolean z) {
        f9796a.mo11709a("Revoking access", new Object[0]);
        String e = C3441c.m13432b(context).mo11122e();
        m13464d(context);
        return z ? C3444f.m13444a(e) : fVar.mo11219g(new C3451m(fVar));
    }

    /* renamed from: c */
    public static C3490g m13463c(C3486f fVar, Context context, boolean z) {
        f9796a.mo11709a("Signing out", new Object[0]);
        m13464d(context);
        return z ? C3492h.m13575b(Status.f9819f, fVar) : fVar.mo11219g(new C3449k(fVar));
    }

    /* renamed from: d */
    private static void m13464d(Context context) {
        C3454p.m13465a(context).mo11142b();
        for (C3486f m : C3486f.m13551h()) {
            m.mo11224m();
        }
        C3521f.m13656a();
    }
}
