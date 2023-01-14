package p174e.p319f.p320a.p335c.p345f.p352g;

import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.s3 */
public final class C6990s3 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6990s3 zza;
    private int zze;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private C6804g9 zzg = C6702a9.m25414o();
    private boolean zzh;

    static {
        C6990s3 s3Var = new C6990s3();
        zza = s3Var;
        C6702a9.m25418s(C6990s3.class, s3Var);
    }

    private C6990s3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", C7086y3.class, "zzh"});
        } else if (i2 == 3) {
            return new C6990s3();
        } else {
            if (i2 == 4) {
                return new C6958q3((C6942p3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: y */
    public final String mo20142y() {
        return this.zzf;
    }
}
