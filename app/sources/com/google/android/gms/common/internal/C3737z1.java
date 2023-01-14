package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import p174e.p319f.p320a.p335c.p343d.C6634a;
import p174e.p319f.p320a.p335c.p345f.p351f.C6687a;

/* renamed from: com.google.android.gms.common.internal.z1 */
public final class C3737z1 extends C6687a implements C3650b2 {
    C3737z1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public final int mo11525a() {
        Parcel j = mo19479j(2, mo19480k());
        int readInt = j.readInt();
        j.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final C6634a mo11526b() {
        Parcel j = mo19479j(1, mo19480k());
        C6634a k = C6634a.C6635a.m25275k(j.readStrongBinder());
        j.recycle();
        return k;
    }
}
