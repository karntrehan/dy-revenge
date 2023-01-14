package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;

/* renamed from: e.f.a.c.f.g.t4 */
public final class C7007t4 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C7007t4 zza;
    private C6804g9 zze = C6702a9.m25414o();

    static {
        C7007t4 t4Var = new C7007t4();
        zza = t4Var;
        C6702a9.m25418s(C7007t4.class, t4Var);
    }

    private C7007t4() {
    }

    /* renamed from: B */
    static /* synthetic */ void m26525B(C7007t4 t4Var, C7039v4 v4Var) {
        v4Var.getClass();
        C6804g9 g9Var = t4Var.zze;
        if (!g9Var.mo19801a()) {
            t4Var.zze = C6702a9.m25415p(g9Var);
        }
        t4Var.zze.add(v4Var);
    }

    /* renamed from: x */
    public static C6975r4 m26526x() {
        return (C6975r4) zza.mo19524t();
    }

    /* renamed from: A */
    public final List mo20184A() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C7039v4.class});
        } else if (i2 == 3) {
            return new C7007t4();
        } else {
            if (i2 == 4) {
                return new C6975r4((C6714b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: z */
    public final C7039v4 mo20185z(int i) {
        return (C7039v4) this.zze.get(0);
    }
}
