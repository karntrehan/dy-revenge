package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.ka */
final class C3947ka implements C4093wa {

    /* renamed from: a */
    final /* synthetic */ C4009pa f10866a;

    C3947ka(C4009pa paVar) {
        this.f10866a = paVar;
    }

    /* renamed from: a */
    public final void mo11940a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            C4009pa paVar = this.f10866a;
            if (paVar.f11166m != null) {
                paVar.f11166m.mo11935b().mo12544r().mo12477b("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.f10866a.mo11934a().mo12110z(new C3921ia(this, str, "_err", bundle));
    }
}
