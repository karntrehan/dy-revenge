package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.y4 */
public final class C7087y4 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C7087y4 zza;
    private int zze;
    private int zzf = 1;
    private C6804g9 zzg = C6702a9.m25414o();

    static {
        C7087y4 y4Var = new C7087y4();
        zza = y4Var;
        C6702a9.m25418s(C7087y4.class, y4Var);
    }

    private C7087y4() {
    }

    /* renamed from: x */
    public static C7055w4 m27033x() {
        return (C7055w4) zza.mo19524t();
    }

    /* renamed from: z */
    static /* synthetic */ void m27035z(C7087y4 y4Var, C6895m4 m4Var) {
        m4Var.getClass();
        C6804g9 g9Var = y4Var.zzg;
        if (!g9Var.mo19801a()) {
            y4Var.zzg = C6702a9.m25415p(g9Var);
        }
        y4Var.zzg.add(m4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", C7071x4.f19042a, "zzg", C6895m4.class});
        } else if (i2 == 3) {
            return new C7087y4();
        } else {
            if (i2 == 4) {
                return new C7055w4((C6714b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
