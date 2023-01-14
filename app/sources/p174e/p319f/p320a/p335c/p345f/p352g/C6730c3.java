package p174e.p319f.p320a.p335c.p345f.p352g;

import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.c3 */
public final class C6730c3 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6730c3 zza;
    private int zze;
    private C6926o3 zzf;
    private C6814h3 zzg;
    private boolean zzh;
    private String zzi = HttpUrl.FRAGMENT_ENCODE_SET;

    static {
        C6730c3 c3Var = new C6730c3();
        zza = c3Var;
        C6702a9.m25418s(C6730c3.class, c3Var);
    }

    private C6730c3() {
    }

    /* renamed from: C */
    static /* synthetic */ void m25501C(C6730c3 c3Var, String str) {
        c3Var.zze |= 8;
        c3Var.zzi = str;
    }

    /* renamed from: y */
    public static C6730c3 m25503y() {
        return zza;
    }

    /* renamed from: A */
    public final C6926o3 mo19601A() {
        C6926o3 o3Var = this.zzf;
        return o3Var == null ? C6926o3.m26274z() : o3Var;
    }

    /* renamed from: B */
    public final String mo19602B() {
        return this.zzi;
    }

    /* renamed from: D */
    public final boolean mo19603D() {
        return this.zzh;
    }

    /* renamed from: E */
    public final boolean mo19604E() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: F */
    public final boolean mo19605F() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: G */
    public final boolean mo19606G() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: H */
    public final boolean mo19607H() {
        return (this.zze & 1) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C6730c3();
        } else {
            if (i2 == 4) {
                return new C6713b3((C7053w2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final C6814h3 mo19608z() {
        C6814h3 h3Var = this.zzg;
        return h3Var == null ? C6814h3.m25776y() : h3Var;
    }
}
