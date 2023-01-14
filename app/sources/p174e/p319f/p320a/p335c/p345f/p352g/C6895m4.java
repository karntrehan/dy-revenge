package p174e.p319f.p320a.p335c.p345f.p352g;

import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.m4 */
public final class C6895m4 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6895m4 zza;
    private int zze;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private long zzg;

    static {
        C6895m4 m4Var = new C6895m4();
        zza = m4Var;
        C6702a9.m25418s(C6895m4.class, m4Var);
    }

    private C6895m4() {
    }

    /* renamed from: A */
    static /* synthetic */ void m26121A(C6895m4 m4Var, long j) {
        m4Var.zze |= 2;
        m4Var.zzg = j;
    }

    /* renamed from: x */
    public static C6879l4 m26122x() {
        return (C6879l4) zza.mo19524t();
    }

    /* renamed from: z */
    static /* synthetic */ void m26124z(C6895m4 m4Var, String str) {
        str.getClass();
        m4Var.zze |= 1;
        m4Var.zzf = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C6895m4();
        } else {
            if (i2 == 4) {
                return new C6879l4((C6714b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
