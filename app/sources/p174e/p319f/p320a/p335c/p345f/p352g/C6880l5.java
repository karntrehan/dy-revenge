package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;

/* renamed from: e.f.a.c.f.g.l5 */
public final class C6880l5 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6880l5 zza;
    private int zze;
    private C6804g9 zzf = C6702a9.m25414o();
    private C6816h5 zzg;

    static {
        C6880l5 l5Var = new C6880l5();
        zza = l5Var;
        C6702a9.m25418s(C6880l5.class, l5Var);
    }

    private C6880l5() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", C6960q5.class, "zzg"});
        } else if (i2 == 3) {
            return new C6880l5();
        } else {
            if (i2 == 4) {
                return new C6864k5((C6783f5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final C6816h5 mo19940x() {
        C6816h5 h5Var = this.zzg;
        return h5Var == null ? C6816h5.m25791z() : h5Var;
    }

    /* renamed from: z */
    public final List mo19941z() {
        return this.zzf;
    }
}
