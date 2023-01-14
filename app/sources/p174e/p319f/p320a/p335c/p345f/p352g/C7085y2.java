package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;

/* renamed from: e.f.a.c.f.g.y2 */
public final class C7085y2 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C7085y2 zza;
    private int zze;
    private int zzf;
    private C6804g9 zzg = C6702a9.m25414o();
    private C6804g9 zzh = C6702a9.m25414o();
    private boolean zzi;
    private boolean zzj;

    static {
        C7085y2 y2Var = new C7085y2();
        zza = y2Var;
        C6702a9.m25418s(C7085y2.class, y2Var);
    }

    private C7085y2() {
    }

    /* renamed from: F */
    static /* synthetic */ void m27020F(C7085y2 y2Var, int i, C6846j3 j3Var) {
        j3Var.getClass();
        C6804g9 g9Var = y2Var.zzg;
        if (!g9Var.mo19801a()) {
            y2Var.zzg = C6702a9.m25415p(g9Var);
        }
        y2Var.zzg.set(i, j3Var);
    }

    /* renamed from: G */
    static /* synthetic */ void m27021G(C7085y2 y2Var, int i, C6696a3 a3Var) {
        a3Var.getClass();
        C6804g9 g9Var = y2Var.zzh;
        if (!g9Var.mo19801a()) {
            y2Var.zzh = C6702a9.m25415p(g9Var);
        }
        y2Var.zzh.set(i, a3Var);
    }

    /* renamed from: B */
    public final C6696a3 mo20443B(int i) {
        return (C6696a3) this.zzh.get(i);
    }

    /* renamed from: C */
    public final C6846j3 mo20444C(int i) {
        return (C6846j3) this.zzg.get(i);
    }

    /* renamed from: D */
    public final List mo20445D() {
        return this.zzh;
    }

    /* renamed from: E */
    public final List mo20446E() {
        return this.zzg;
    }

    /* renamed from: H */
    public final boolean mo20447H() {
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
            return C6702a9.m25417r(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C6846j3.class, "zzh", C6696a3.class, "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C7085y2();
        } else {
            if (i2 == 4) {
                return new C7069x2((C7053w2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo20448x() {
        return this.zzf;
    }

    /* renamed from: y */
    public final int mo20449y() {
        return this.zzh.size();
    }

    /* renamed from: z */
    public final int mo20450z() {
        return this.zzg.size();
    }
}
