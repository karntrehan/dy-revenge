package p174e.p319f.p320a.p335c.p345f.p352g;

import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.u3 */
public final class C7022u3 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C7022u3 zza;
    private int zze;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        C7022u3 u3Var = new C7022u3();
        zza = u3Var;
        C6702a9.m25418s(C7022u3.class, u3Var);
    }

    private C7022u3() {
    }

    /* renamed from: A */
    static /* synthetic */ void m26652A(C7022u3 u3Var, String str) {
        str.getClass();
        u3Var.zze |= 1;
        u3Var.zzf = str;
    }

    /* renamed from: B */
    public final boolean mo20211B() {
        return this.zzg;
    }

    /* renamed from: C */
    public final boolean mo20212C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final boolean mo20213D() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: E */
    public final boolean mo20214E() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: F */
    public final boolean mo20215F() {
        return (this.zze & 8) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C7022u3();
        } else {
            if (i2 == 4) {
                return new C7006t3((C6942p3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo20216x() {
        return this.zzi;
    }

    /* renamed from: z */
    public final String mo20217z() {
        return this.zzf;
    }
}
