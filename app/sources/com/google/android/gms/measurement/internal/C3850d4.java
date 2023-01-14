package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3705r;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.d4 */
final class C3850d4 implements Runnable {

    /* renamed from: f */
    private final C3824b4 f10623f;

    /* renamed from: o */
    private final int f10624o;

    /* renamed from: p */
    private final Throwable f10625p;

    /* renamed from: q */
    private final byte[] f10626q;

    /* renamed from: r */
    private final String f10627r;

    /* renamed from: s */
    private final Map f10628s;

    /* synthetic */ C3850d4(String str, C3824b4 b4Var, int i, Throwable th, byte[] bArr, Map map, C3837c4 c4Var) {
        C3705r.m14346k(b4Var);
        this.f10623f = b4Var;
        this.f10624o = i;
        this.f10625p = th;
        this.f10626q = bArr;
        this.f10627r = str;
        this.f10628s = map;
    }

    public final void run() {
        this.f10623f.mo11859a(this.f10627r, this.f10624o, this.f10625p, this.f10626q, this.f10628s);
    }
}
