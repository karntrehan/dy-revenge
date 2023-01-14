package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C3646a2;
import com.google.android.gms.common.internal.C3650b2;
import com.google.android.gms.common.internal.C3705r;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p174e.p319f.p320a.p335c.p343d.C6634a;
import p174e.p319f.p320a.p335c.p343d.C6636b;

/* renamed from: com.google.android.gms.common.w */
abstract class C3774w extends C3646a2 {

    /* renamed from: a */
    private final int f10458a;

    protected C3774w(byte[] bArr) {
        C3705r.m14336a(bArr.length == 25);
        this.f10458a = Arrays.hashCode(bArr);
    }

    /* renamed from: m */
    protected static byte[] m14541m(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public abstract byte[] mo11735Y();

    /* renamed from: a */
    public final int mo11525a() {
        return this.f10458a;
    }

    /* renamed from: b */
    public final C6634a mo11526b() {
        return C6636b.m25276Y(mo11735Y());
    }

    public final boolean equals(Object obj) {
        C6634a b;
        if (obj != null && (obj instanceof C3650b2)) {
            try {
                C3650b2 b2Var = (C3650b2) obj;
                if (b2Var.mo11525a() != this.f10458a || (b = b2Var.mo11526b()) == null) {
                    return false;
                }
                return Arrays.equals(mo11735Y(), (byte[]) C6636b.m25277m(b));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10458a;
    }
}
