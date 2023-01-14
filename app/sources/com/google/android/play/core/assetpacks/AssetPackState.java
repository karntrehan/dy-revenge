package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import p174e.p319f.p320a.p382e.p383a.p385b.C9108d0;

public abstract class AssetPackState {
    /* renamed from: b */
    public static AssetPackState m16742b(String str, int i, int i2, long j, long j2, double d, int i3) {
        return new C4452z(str, i, i2, j, j2, (int) Math.rint(100.0d * d), i3);
    }

    /* renamed from: d */
    static AssetPackState m16743d(Bundle bundle, String str, C4412o0 o0Var, C4431t tVar) {
        Bundle bundle2 = bundle;
        String str2 = str;
        int a = tVar.mo13917a(bundle2.getInt(C9108d0.m30336a("status", str2)), str2);
        int i = bundle2.getInt(C9108d0.m30336a("error_code", str2));
        long j = bundle2.getLong(C9108d0.m30336a("bytes_downloaded", str2));
        long j2 = bundle2.getLong(C9108d0.m30336a("total_bytes_to_download", str2));
        double b = o0Var.mo13902b(str2);
        long j3 = bundle2.getLong(C9108d0.m30336a("pack_version", str2));
        long j4 = bundle2.getLong(C9108d0.m30336a("pack_base_version", str2));
        return m16742b(str, a, i, j, j2, b, (a != 4 || j4 == 0 || j4 == j3) ? 1 : 2);
    }

    /* renamed from: a */
    public abstract int mo13791a();

    /* renamed from: c */
    public abstract long mo13792c();

    /* renamed from: e */
    public abstract int mo13793e();

    /* renamed from: f */
    public abstract String mo13794f();

    /* renamed from: g */
    public abstract int mo13795g();

    /* renamed from: h */
    public abstract long mo13796h();

    /* renamed from: i */
    public abstract int mo13797i();
}
