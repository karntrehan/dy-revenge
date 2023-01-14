package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C3627d;
import com.google.android.gms.common.C3631f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3678j;
import com.google.android.gms.common.internal.p130z.C3730a;

/* renamed from: com.google.android.gms.common.internal.f */
public class C3666f extends C3730a {
    public static final Parcelable.Creator<C3666f> CREATOR = new C3700p1();

    /* renamed from: A */
    private String f10285A;

    /* renamed from: f */
    final int f10286f;

    /* renamed from: o */
    final int f10287o;

    /* renamed from: p */
    int f10288p;

    /* renamed from: q */
    String f10289q;

    /* renamed from: r */
    IBinder f10290r;

    /* renamed from: s */
    Scope[] f10291s;

    /* renamed from: t */
    Bundle f10292t;

    /* renamed from: u */
    Account f10293u;

    /* renamed from: v */
    C3627d[] f10294v;

    /* renamed from: w */
    C3627d[] f10295w;

    /* renamed from: x */
    boolean f10296x;

    /* renamed from: y */
    int f10297y;

    /* renamed from: z */
    boolean f10298z;

    C3666f(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C3627d[] dVarArr, C3627d[] dVarArr2, boolean z, int i4, boolean z2, String str2) {
        this.f10286f = i;
        this.f10287o = i2;
        this.f10288p = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f10289q = "com.google.android.gms";
        } else {
            this.f10289q = str;
        }
        if (i < 2) {
            this.f10293u = iBinder != null ? C3639a.m14135m(C3678j.C3679a.m14296k(iBinder)) : null;
        } else {
            this.f10290r = iBinder;
            this.f10293u = account;
        }
        this.f10291s = scopeArr;
        this.f10292t = bundle;
        this.f10294v = dVarArr;
        this.f10295w = dVarArr2;
        this.f10296x = z;
        this.f10297y = i4;
        this.f10298z = z2;
        this.f10285A = str2;
    }

    public C3666f(int i, String str) {
        this.f10286f = 6;
        this.f10288p = C3631f.f10208a;
        this.f10287o = i;
        this.f10296x = true;
        this.f10285A = str;
    }

    /* renamed from: o */
    public final String mo11592o() {
        return this.f10285A;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C3700p1.m14327a(this, parcel, i);
    }
}
