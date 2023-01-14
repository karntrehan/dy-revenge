package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.g4 */
public final class C6799g4 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6799g4 zza;
    private int zze;
    private int zzf;
    private C6698a5 zzg;
    private C6698a5 zzh;
    private boolean zzi;

    static {
        C6799g4 g4Var = new C6799g4();
        zza = g4Var;
        C6702a9.m25418s(C6799g4.class, g4Var);
    }

    private C6799g4() {
    }

    /* renamed from: C */
    static /* synthetic */ void m25733C(C6799g4 g4Var, int i) {
        g4Var.zze |= 1;
        g4Var.zzf = i;
    }

    /* renamed from: D */
    static /* synthetic */ void m25734D(C6799g4 g4Var, C6698a5 a5Var) {
        a5Var.getClass();
        g4Var.zzg = a5Var;
        g4Var.zze |= 2;
    }

    /* renamed from: E */
    static /* synthetic */ void m25735E(C6799g4 g4Var, C6698a5 a5Var) {
        g4Var.zzh = a5Var;
        g4Var.zze |= 4;
    }

    /* renamed from: F */
    static /* synthetic */ void m25736F(C6799g4 g4Var, boolean z) {
        g4Var.zze |= 8;
        g4Var.zzi = z;
    }

    /* renamed from: y */
    public static C6782f4 m25737y() {
        return (C6782f4) zza.mo19524t();
    }

    /* renamed from: A */
    public final C6698a5 mo19792A() {
        C6698a5 a5Var = this.zzg;
        return a5Var == null ? C6698a5.m25382E() : a5Var;
    }

    /* renamed from: B */
    public final C6698a5 mo19793B() {
        C6698a5 a5Var = this.zzh;
        return a5Var == null ? C6698a5.m25382E() : a5Var;
    }

    /* renamed from: G */
    public final boolean mo19794G() {
        return this.zzi;
    }

    /* renamed from: H */
    public final boolean mo19795H() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: I */
    public final boolean mo19796I() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: J */
    public final boolean mo19797J() {
        return (this.zze & 4) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C6799g4();
        } else {
            if (i2 == 4) {
                return new C6782f4((C6714b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo19798x() {
        return this.zzf;
    }
}
