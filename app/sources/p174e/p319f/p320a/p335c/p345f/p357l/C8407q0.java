package p174e.p319f.p320a.p335c.p345f.p357l;

import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.l.q0 */
public final class C8407q0 extends C8197ed<C8407q0, C8389p0> implements C8293je {
    /* access modifiers changed from: private */
    public static final C8407q0 zzb;
    private int zze;
    private C8177dc zzf = C8177dc.f22199f;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;

    static {
        C8407q0 q0Var = new C8407q0();
        zzb = q0Var;
        C8197ed.m28469j(C8407q0.class, q0Var);
    }

    private C8407q0() {
    }

    /* renamed from: w */
    public static C8389p0 m28937w() {
        return (C8389p0) zzb.mo21765l();
    }

    /* renamed from: y */
    static /* synthetic */ void m28939y(C8407q0 q0Var, String str) {
        q0Var.zze |= 2;
        q0Var.zzg = "models";
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Object mo21702k(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8197ed.m28468i(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C8407q0();
        } else {
            if (i2 == 4) {
                return new C8389p0((C8352n) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
