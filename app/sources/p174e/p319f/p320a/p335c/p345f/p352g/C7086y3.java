package p174e.p319f.p320a.p335c.p345f.p352g;

import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.y3 */
public final class C7086y3 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C7086y3 zza;
    private int zze;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;

    static {
        C7086y3 y3Var = new C7086y3();
        zza = y3Var;
        C6702a9.m25418s(C7086y3.class, y3Var);
    }

    private C7086y3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C7086y3();
        } else {
            if (i2 == 4) {
                return new C7070x3((C6942p3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
