package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.t2 */
final class C3586t2 extends C3556m1 {

    /* renamed from: a */
    final /* synthetic */ Dialog f10104a;

    /* renamed from: b */
    final /* synthetic */ C3590u2 f10105b;

    C3586t2(C3590u2 u2Var, Dialog dialog) {
        this.f10105b = u2Var;
        this.f10104a = dialog;
    }

    /* renamed from: a */
    public final void mo11384a() {
        this.f10105b.f10134o.m13991o();
        if (this.f10104a.isShowing()) {
            this.f10104a.dismiss();
        }
    }
}
