package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p174e.p319f.p320a.p335c.p345f.p350e.C6686j;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.google.android.gms.common.o */
final class C3747o extends C6686j {

    /* renamed from: a */
    private final Context f10438a;

    /* renamed from: b */
    final /* synthetic */ C3629e f10439b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3747o(C3629e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f10439b = eVar;
        this.f10438a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = this.f10439b.mo11484i(this.f10438a);
        if (this.f10439b.mo11486m(i2)) {
            this.f10439b.mo11492t(this.f10438a, i2);
        }
    }
}
