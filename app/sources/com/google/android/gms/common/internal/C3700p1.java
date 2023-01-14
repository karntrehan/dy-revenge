package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C3627d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.p130z.C3731b;
import com.google.android.gms.common.internal.p130z.C3733c;

/* renamed from: com.google.android.gms.common.internal.p1 */
public final class C3700p1 implements Parcelable.Creator<C3666f> {
    /* renamed from: a */
    static void m14327a(C3666f fVar, Parcel parcel, int i) {
        int a = C3733c.m14432a(parcel);
        C3733c.m14443l(parcel, 1, fVar.f10286f);
        C3733c.m14443l(parcel, 2, fVar.f10287o);
        C3733c.m14443l(parcel, 3, fVar.f10288p);
        C3733c.m14448q(parcel, 4, fVar.f10289q, false);
        C3733c.m14442k(parcel, 5, fVar.f10290r, false);
        C3733c.m14451t(parcel, 6, fVar.f10291s, i, false);
        C3733c.m14436e(parcel, 7, fVar.f10292t, false);
        C3733c.m14447p(parcel, 8, fVar.f10293u, i, false);
        C3733c.m14451t(parcel, 10, fVar.f10294v, i, false);
        C3733c.m14451t(parcel, 11, fVar.f10295w, i, false);
        C3733c.m14434c(parcel, 12, fVar.f10296x);
        C3733c.m14443l(parcel, 13, fVar.f10297y);
        C3733c.m14434c(parcel, 14, fVar.f10298z);
        C3733c.m14448q(parcel, 15, fVar.mo11592o(), false);
        C3733c.m14433b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int y = C3731b.m14430y(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        C3627d[] dVarArr = null;
        C3627d[] dVarArr2 = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < y) {
            int r = C3731b.m14423r(parcel);
            switch (C3731b.m14416k(r)) {
                case 1:
                    i = C3731b.m14425t(parcel2, r);
                    break;
                case 2:
                    i2 = C3731b.m14425t(parcel2, r);
                    break;
                case 3:
                    i3 = C3731b.m14425t(parcel2, r);
                    break;
                case 4:
                    str = C3731b.m14410e(parcel2, r);
                    break;
                case 5:
                    iBinder = C3731b.m14424s(parcel2, r);
                    break;
                case 6:
                    scopeArr = (Scope[]) C3731b.m14413h(parcel2, r, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C3731b.m14406a(parcel2, r);
                    break;
                case 8:
                    account = (Account) C3731b.m14409d(parcel2, r, Account.CREATOR);
                    break;
                case 10:
                    dVarArr = (C3627d[]) C3731b.m14413h(parcel2, r, C3627d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (C3627d[]) C3731b.m14413h(parcel2, r, C3627d.CREATOR);
                    break;
                case 12:
                    z = C3731b.m14417l(parcel2, r);
                    break;
                case 13:
                    i4 = C3731b.m14425t(parcel2, r);
                    break;
                case 14:
                    z2 = C3731b.m14417l(parcel2, r);
                    break;
                case 15:
                    str2 = C3731b.m14410e(parcel2, r);
                    break;
                default:
                    C3731b.m14429x(parcel2, r);
                    break;
            }
        }
        C3731b.m14415j(parcel2, y);
        return new C3666f(i, i2, i3, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z, i4, z2, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C3666f[i];
    }
}
