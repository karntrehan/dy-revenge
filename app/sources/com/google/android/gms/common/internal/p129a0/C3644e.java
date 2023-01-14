package com.google.android.gms.common.internal.p129a0;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C3627d;
import com.google.android.gms.common.api.internal.C3516e;
import com.google.android.gms.common.api.internal.C3550l;
import com.google.android.gms.common.internal.C3659d;
import com.google.android.gms.common.internal.C3669g;
import com.google.android.gms.common.internal.C3726y;
import p174e.p319f.p320a.p335c.p345f.p350e.C6680d;

/* renamed from: com.google.android.gms.common.internal.a0.e */
public final class C3644e extends C3669g<C3640a> {

    /* renamed from: I */
    private final C3726y f10226I;

    public C3644e(Context context, Looper looper, C3659d dVar, C3726y yVar, C3516e eVar, C3550l lVar) {
        super(context, looper, 270, dVar, eVar, lVar);
        this.f10226I = yVar;
    }

    /* renamed from: A */
    public final C3627d[] mo11516A() {
        return C6680d.f18337b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final Bundle mo11517F() {
        return this.f10226I.mo11698c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo11133J() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo11134K() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final boolean mo11518N() {
        return true;
    }

    /* renamed from: n */
    public final int mo11136n() {
        return 203400000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final /* synthetic */ IInterface mo11139x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C3640a ? (C3640a) queryLocalInterface : new C3640a(iBinder);
    }
}
