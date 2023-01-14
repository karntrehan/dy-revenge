package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.e7 */
final class C3866e7 implements C4093wa {

    /* renamed from: a */
    final /* synthetic */ C4030r7 f10652a;

    C3866e7(C4030r7 r7Var) {
        this.f10652a = r7Var;
    }

    /* renamed from: a */
    public final void mo11940a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f10652a.mo12380t("auto", "_err", bundle, str);
        } else {
            this.f10652a.mo12378r("auto", "_err", bundle);
        }
    }
}
