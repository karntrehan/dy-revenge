package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p174e.p319f.p320a.p335c.p343d.C6634a;
import p174e.p319f.p320a.p335c.p345f.p351f.C6687a;
import p174e.p319f.p320a.p335c.p345f.p351f.C6689c;

/* renamed from: com.google.android.gms.dynamite.q */
public final class C3798q extends C6687a implements IInterface {
    C3798q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: P0 */
    public final int mo11745P0(C6634a aVar, String str, boolean z) {
        Parcel k = mo19480k();
        C6689c.m25352d(k, aVar);
        k.writeString(str);
        C6689c.m25350b(k, z);
        Parcel j = mo19479j(5, k);
        int readInt = j.readInt();
        j.recycle();
        return readInt;
    }

    /* renamed from: Q0 */
    public final C6634a mo11746Q0(C6634a aVar, String str, int i) {
        Parcel k = mo19480k();
        C6689c.m25352d(k, aVar);
        k.writeString(str);
        k.writeInt(i);
        Parcel j = mo19479j(2, k);
        C6634a k2 = C6634a.C6635a.m25275k(j.readStrongBinder());
        j.recycle();
        return k2;
    }

    /* renamed from: R0 */
    public final C6634a mo11747R0(C6634a aVar, String str, int i, C6634a aVar2) {
        Parcel k = mo19480k();
        C6689c.m25352d(k, aVar);
        k.writeString(str);
        k.writeInt(i);
        C6689c.m25352d(k, aVar2);
        Parcel j = mo19479j(8, k);
        C6634a k2 = C6634a.C6635a.m25275k(j.readStrongBinder());
        j.recycle();
        return k2;
    }

    /* renamed from: S0 */
    public final C6634a mo11748S0(C6634a aVar, String str, int i) {
        Parcel k = mo19480k();
        C6689c.m25352d(k, aVar);
        k.writeString(str);
        k.writeInt(i);
        Parcel j = mo19479j(4, k);
        C6634a k2 = C6634a.C6635a.m25275k(j.readStrongBinder());
        j.recycle();
        return k2;
    }

    /* renamed from: T0 */
    public final C6634a mo11749T0(C6634a aVar, String str, boolean z, long j) {
        Parcel k = mo19480k();
        C6689c.m25352d(k, aVar);
        k.writeString(str);
        C6689c.m25350b(k, z);
        k.writeLong(j);
        Parcel j2 = mo19479j(7, k);
        C6634a k2 = C6634a.C6635a.m25275k(j2.readStrongBinder());
        j2.recycle();
        return k2;
    }

    /* renamed from: Y */
    public final int mo11750Y(C6634a aVar, String str, boolean z) {
        Parcel k = mo19480k();
        C6689c.m25352d(k, aVar);
        k.writeString(str);
        C6689c.m25350b(k, z);
        Parcel j = mo19479j(3, k);
        int readInt = j.readInt();
        j.recycle();
        return readInt;
    }

    /* renamed from: m */
    public final int mo11751m() {
        Parcel j = mo19479j(6, mo19480k());
        int readInt = j.readInt();
        j.recycle();
        return readInt;
    }
}
