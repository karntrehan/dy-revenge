package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p174e.p319f.p320a.p335c.p343d.C6634a;
import p174e.p319f.p320a.p335c.p345f.p351f.C6687a;
import p174e.p319f.p320a.p335c.p345f.p351f.C6689c;

/* renamed from: com.google.android.gms.dynamite.r */
public final class C3799r extends C6687a implements IInterface {
    C3799r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: Y */
    public final C6634a mo11752Y(C6634a aVar, String str, int i, C6634a aVar2) {
        Parcel k = mo19480k();
        C6689c.m25352d(k, aVar);
        k.writeString(str);
        k.writeInt(i);
        C6689c.m25352d(k, aVar2);
        Parcel j = mo19479j(3, k);
        C6634a k2 = C6634a.C6635a.m25275k(j.readStrongBinder());
        j.recycle();
        return k2;
    }

    /* renamed from: m */
    public final C6634a mo11753m(C6634a aVar, String str, int i, C6634a aVar2) {
        Parcel k = mo19480k();
        C6689c.m25352d(k, aVar);
        k.writeString(str);
        k.writeInt(i);
        C6689c.m25352d(k, aVar2);
        Parcel j = mo19479j(2, k);
        C6634a k2 = C6634a.C6635a.m25275k(j.readStrongBinder());
        j.recycle();
        return k2;
    }
}
