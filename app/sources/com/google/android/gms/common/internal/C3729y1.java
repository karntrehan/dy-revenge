package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import p174e.p319f.p320a.p335c.p345f.p351f.C6687a;
import p174e.p319f.p320a.p335c.p345f.p351f.C6689c;

/* renamed from: com.google.android.gms.common.internal.y1 */
public final class C3729y1 extends C6687a implements C3678j {
    C3729y1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account zzb() {
        Parcel j = mo19479j(2, mo19480k());
        Account account = (Account) C6689c.m25349a(j, Account.CREATOR);
        j.recycle();
        return account;
    }
}
