package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;

/* renamed from: e.f.a.c.f.g.c5 */
public final class C6732c5 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6732c5 zza;
    private int zze;
    private int zzf;
    private C6787f9 zzg = C6702a9.m25412m();

    static {
        C6732c5 c5Var = new C6732c5();
        zza = c5Var;
        C6702a9.m25418s(C6732c5.class, c5Var);
    }

    private C6732c5() {
    }

    /* renamed from: A */
    public static C6715b5 m25514A() {
        return (C6715b5) zza.mo19524t();
    }

    /* renamed from: D */
    static /* synthetic */ void m25516D(C6732c5 c5Var, int i) {
        c5Var.zze |= 1;
        c5Var.zzf = i;
    }

    /* renamed from: E */
    static /* synthetic */ void m25517E(C6732c5 c5Var, Iterable iterable) {
        C6787f9 f9Var = c5Var.zzg;
        if (!f9Var.mo19801a()) {
            c5Var.zzg = C6702a9.m25413n(f9Var);
        }
        C6834i7.m25867b(iterable, c5Var.zzg);
    }

    /* renamed from: C */
    public final List mo19610C() {
        return this.zzg;
    }

    /* renamed from: F */
    public final boolean mo19611F() {
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
            return C6702a9.m25417r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C6732c5();
        } else {
            if (i2 == 4) {
                return new C6715b5((C6714b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo19612x() {
        return this.zzg.size();
    }

    /* renamed from: y */
    public final int mo19613y() {
        return this.zzf;
    }

    /* renamed from: z */
    public final long mo19614z(int i) {
        return this.zzg.mo19763e(i);
    }
}
