package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.g0 */
final class C3670g0 extends C3676i0 {

    /* renamed from: f */
    final /* synthetic */ Intent f10304f;

    /* renamed from: o */
    final /* synthetic */ Activity f10305o;

    /* renamed from: p */
    final /* synthetic */ int f10306p;

    C3670g0(Intent intent, Activity activity, int i) {
        this.f10304f = intent;
        this.f10305o = activity;
        this.f10306p = i;
    }

    /* renamed from: a */
    public final void mo11598a() {
        Intent intent = this.f10304f;
        if (intent != null) {
            this.f10305o.startActivityForResult(intent, this.f10306p);
        }
    }
}
