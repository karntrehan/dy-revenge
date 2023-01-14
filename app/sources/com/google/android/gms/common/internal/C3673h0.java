package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.C3531h;

/* renamed from: com.google.android.gms.common.internal.h0 */
final class C3673h0 extends C3676i0 {

    /* renamed from: f */
    final /* synthetic */ Intent f10313f;

    /* renamed from: o */
    final /* synthetic */ C3531h f10314o;

    C3673h0(Intent intent, C3531h hVar, int i) {
        this.f10313f = intent;
        this.f10314o = hVar;
    }

    /* renamed from: a */
    public final void mo11598a() {
        Intent intent = this.f10313f;
        if (intent != null) {
            this.f10314o.startActivityForResult(intent, 2);
        }
    }
}
