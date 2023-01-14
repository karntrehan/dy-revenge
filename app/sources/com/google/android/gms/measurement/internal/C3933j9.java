package com.google.android.gms.measurement.internal;

import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p335c.p336a.p337a.C6614a;

/* renamed from: com.google.android.gms.measurement.internal.j9 */
public final class C3933j9 extends C3843ca {

    /* renamed from: d */
    private final Map f10833d = new HashMap();

    /* renamed from: e */
    public final C3954l4 f10834e;

    /* renamed from: f */
    public final C3954l4 f10835f;

    /* renamed from: g */
    public final C3954l4 f10836g;

    /* renamed from: h */
    public final C3954l4 f10837h;

    /* renamed from: i */
    public final C3954l4 f10838i;

    C3933j9(C4009pa paVar) {
        super(paVar);
        C4003p4 F = this.f10651a.mo12154F();
        F.getClass();
        this.f10834e = new C3954l4(F, "last_delete_stale", 0);
        C4003p4 F2 = this.f10651a.mo12154F();
        F2.getClass();
        this.f10835f = new C3954l4(F2, "backoff", 0);
        C4003p4 F3 = this.f10651a.mo12154F();
        F3.getClass();
        this.f10836g = new C3954l4(F3, "last_upload", 0);
        C4003p4 F4 = this.f10651a.mo12154F();
        F4.getClass();
        this.f10837h = new C3954l4(F4, "last_upload_attempt", 0);
        C4003p4 F5 = this.f10651a.mo12154F();
        F5.getClass();
        this.f10838i = new C3954l4(F5, "midnight_offset", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo11853l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: m */
    public final Pair mo12131m(String str) {
        C3907h9 h9Var;
        mo11931h();
        long b = this.f10651a.mo11936c().mo11731b();
        C3907h9 h9Var2 = (C3907h9) this.f10833d.get(str);
        if (h9Var2 != null && b < h9Var2.f10767c) {
            return new Pair(h9Var2.f10765a, Boolean.valueOf(h9Var2.f10766b));
        }
        C6614a.m25251b(true);
        long r = b + this.f10651a.mo12181z().mo12024r(str, C3966m3.f10990c);
        try {
            C6614a.C6615a a = C6614a.m25250a(this.f10651a.mo11938f());
            if (a == null) {
                return new Pair(HttpUrl.FRAGMENT_ENCODE_SET, Boolean.FALSE);
            }
            String a2 = a.mo19434a();
            h9Var = a2 != null ? new C3907h9(a2, a.mo19435b(), r) : new C3907h9(HttpUrl.FRAGMENT_ENCODE_SET, a.mo19435b(), r);
            this.f10833d.put(str, h9Var);
            C6614a.m25251b(false);
            return new Pair(h9Var.f10765a, Boolean.valueOf(h9Var.f10766b));
        } catch (Exception e) {
            this.f10651a.mo11935b().mo12543q().mo12477b("Unable to get advertising id", e);
            h9Var = new C3907h9(HttpUrl.FRAGMENT_ENCODE_SET, false, r);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Pair mo12132n(String str, C3923j jVar) {
        return jVar.mo12123i(C3910i.AD_STORAGE) ? mo12131m(str) : new Pair(HttpUrl.FRAGMENT_ENCODE_SET, Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: o */
    public final String mo12133o(String str, boolean z) {
        mo11931h();
        String str2 = (!this.f10651a.mo12181z().mo12010B((String) null, C3966m3.f11009l0) || z) ? (String) mo12131m(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest t = C4105xa.m15406t();
        if (t == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, t.digest(str2.getBytes()))});
    }
}
