package p174e.p319f.p320a.p335c.p345f.p352g;

import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.h3 */
public final class C6814h3 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6814h3 zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzi = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzj = HttpUrl.FRAGMENT_ENCODE_SET;

    static {
        C6814h3 h3Var = new C6814h3();
        zza = h3Var;
        C6702a9.m25418s(C6814h3.class, h3Var);
    }

    private C6814h3() {
    }

    /* renamed from: y */
    public static C6814h3 m25776y() {
        return zza;
    }

    /* renamed from: A */
    public final String mo19811A() {
        return this.zzj;
    }

    /* renamed from: B */
    public final String mo19812B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final boolean mo19813C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final boolean mo19814D() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: E */
    public final boolean mo19815E() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: F */
    public final boolean mo19816F() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: G */
    public final boolean mo19817G() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: H */
    public final boolean mo19818H() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: I */
    public final int mo19819I() {
        int a = C6798g3.m25732a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", C6781f3.f18479a, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C6814h3();
        } else {
            if (i2 == 4) {
                return new C6747d3((C7053w2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final String mo19820z() {
        return this.zzh;
    }
}
