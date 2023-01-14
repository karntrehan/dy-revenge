package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C3486f;
import p027c.p092r.p093a.C2068a;
import p027c.p092r.p094b.C2077b;

/* renamed from: com.google.android.gms.auth.api.signin.internal.y */
final class C3463y implements C2068a.C2069a {

    /* renamed from: a */
    final /* synthetic */ SignInHubActivity f9802a;

    /* synthetic */ C3463y(SignInHubActivity signInHubActivity, C3462x xVar) {
        this.f9802a = signInHubActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6951a(C2077b bVar, Object obj) {
        Void voidR = (Void) obj;
        SignInHubActivity signInHubActivity = this.f9802a;
        signInHubActivity.setResult(signInHubActivity.f9777I, signInHubActivity.f9778J);
        this.f9802a.finish();
    }

    /* renamed from: b */
    public final C2077b mo6952b(int i, Bundle bundle) {
        return new C3445g(this.f9802a, C3486f.m13551h());
    }

    /* renamed from: c */
    public final void mo6953c(C2077b bVar) {
    }
}
