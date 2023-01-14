package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p174e.p319f.p320a.p335c.p345f.p350e.C6686j;

/* renamed from: com.google.android.gms.common.api.internal.s0 */
final class C3580s0 extends C6686j {

    /* renamed from: a */
    final /* synthetic */ C3588u0 f10077a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3580s0(C3588u0 u0Var, Looper looper) {
        super(looper);
        this.f10077a = u0Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C3588u0.m13961w(this.f10077a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GoogleApiClientImpl", sb.toString());
        } else {
            C3588u0.m13960v(this.f10077a);
        }
    }
}
