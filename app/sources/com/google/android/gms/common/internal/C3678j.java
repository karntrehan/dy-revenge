package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import p174e.p319f.p320a.p335c.p345f.p351f.C6688b;

/* renamed from: com.google.android.gms.common.internal.j */
public interface C3678j extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.j$a */
    public static abstract class C3679a extends C6688b implements C3678j {
        /* renamed from: k */
        public static C3678j m14296k(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof C3678j ? (C3678j) queryLocalInterface : new C3729y1(iBinder);
        }
    }

    Account zzb();
}
