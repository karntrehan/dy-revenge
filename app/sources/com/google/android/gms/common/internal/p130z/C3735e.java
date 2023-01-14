package com.google.android.gms.common.internal.p130z;

import android.content.Intent;
import android.os.Parcel;

/* renamed from: com.google.android.gms.common.internal.z.e */
public final class C3735e {
    /* renamed from: a */
    public static <T extends C3734d> byte[] m14457a(T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* renamed from: b */
    public static <T extends C3734d> void m14458b(T t, Intent intent, String str) {
        intent.putExtra(str, m14457a(t));
    }
}
