package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.common.internal.z0 */
final class C3736z0 implements C3688m {

    /* renamed from: a */
    private final IBinder f10417a;

    C3736z0(IBinder iBinder) {
        this.f10417a = iBinder;
    }

    /* renamed from: E */
    public final void mo11624E(C3685l lVar, C3666f fVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
            if (fVar != null) {
                obtain.writeInt(1);
                C3700p1.m14327a(fVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f10417a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f10417a;
    }
}
