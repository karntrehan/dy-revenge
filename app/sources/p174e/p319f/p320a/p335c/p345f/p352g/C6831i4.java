package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.i4 */
public final class C6831i4 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6831i4 zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        C6831i4 i4Var = new C6831i4();
        zza = i4Var;
        C6702a9.m25418s(C6831i4.class, i4Var);
    }

    private C6831i4() {
    }

    /* renamed from: B */
    static /* synthetic */ void m25858B(C6831i4 i4Var, int i) {
        i4Var.zze |= 1;
        i4Var.zzf = i;
    }

    /* renamed from: C */
    static /* synthetic */ void m25859C(C6831i4 i4Var, long j) {
        i4Var.zze |= 2;
        i4Var.zzg = j;
    }

    /* renamed from: z */
    public static C6815h4 m25860z() {
        return (C6815h4) zza.mo19524t();
    }

    /* renamed from: D */
    public final boolean mo19836D() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: E */
    public final boolean mo19837E() {
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
            return C6702a9.m25417r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C6831i4();
        } else {
            if (i2 == 4) {
                return new C6815h4((C6714b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo19838x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final long mo19839y() {
        return this.zzg;
    }
}
