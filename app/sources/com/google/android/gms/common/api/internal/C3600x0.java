package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p174e.p319f.p320a.p335c.p345f.p350e.C6686j;

/* renamed from: com.google.android.gms.common.api.internal.x0 */
final class C3600x0 extends C6686j {

    /* renamed from: a */
    final /* synthetic */ C3604y0 f10151a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3600x0(C3604y0 y0Var, Looper looper) {
        super(looper);
        this.f10151a = y0Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((C3596w0) message.obj).mo11434b(this.f10151a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GACStateManager", sb.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
