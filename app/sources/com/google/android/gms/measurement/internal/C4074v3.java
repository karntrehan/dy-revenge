package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C3637i;
import com.google.android.gms.common.internal.C3651c;

/* renamed from: com.google.android.gms.measurement.internal.v3 */
public final class C4074v3 extends C3651c {
    public C4074v3(Context context, Looper looper, C3651c.C3652a aVar, C3651c.C3653b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo11133J() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final String mo11134K() {
        return "com.google.android.gms.measurement.START";
    }

    /* renamed from: n */
    public final int mo11136n() {
        return C3637i.f10216a;
    }

    /* renamed from: x */
    public final /* synthetic */ IInterface mo11139x(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof C4002p3 ? (C4002p3) queryLocalInterface : new C3978n3(iBinder);
    }
}
