package p174e.p319f.p320a.p335c.p345f.p352g;

import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.j3 */
public final class C6846j3 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6846j3 zza;
    private int zze;
    private int zzf;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private C6730c3 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C6846j3 j3Var = new C6846j3();
        zza = j3Var;
        C6702a9.m25418s(C6846j3.class, j3Var);
    }

    private C6846j3() {
    }

    /* renamed from: C */
    static /* synthetic */ void m25936C(C6846j3 j3Var, String str) {
        j3Var.zze |= 2;
        j3Var.zzg = str;
    }

    /* renamed from: z */
    public static C6830i3 m25937z() {
        return (C6830i3) zza.mo19524t();
    }

    /* renamed from: B */
    public final String mo19850B() {
        return this.zzg;
    }

    /* renamed from: D */
    public final boolean mo19851D() {
        return this.zzi;
    }

    /* renamed from: E */
    public final boolean mo19852E() {
        return this.zzj;
    }

    /* renamed from: F */
    public final boolean mo19853F() {
        return this.zzk;
    }

    /* renamed from: G */
    public final boolean mo19854G() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: H */
    public final boolean mo19855H() {
        return (this.zze & 32) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C6846j3();
        } else {
            if (i2 == 4) {
                return new C6830i3((C7053w2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo19856x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final C6730c3 mo19857y() {
        C6730c3 c3Var = this.zzh;
        return c3Var == null ? C6730c3.m25503y() : c3Var;
    }
}
