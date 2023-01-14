package p174e.p319f.p320a.p335c.p345f.p352g;

import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.e4 */
public final class C6765e4 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6765e4 zza;
    private int zze;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzi = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzj = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzk = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzl = HttpUrl.FRAGMENT_ENCODE_SET;

    static {
        C6765e4 e4Var = new C6765e4();
        zza = e4Var;
        C6702a9.m25418s(C6765e4.class, e4Var);
    }

    private C6765e4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C6765e4();
        } else {
            if (i2 == 4) {
                return new C6748d4((C6714b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
