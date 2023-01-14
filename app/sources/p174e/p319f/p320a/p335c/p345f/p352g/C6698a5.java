package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;

/* renamed from: e.f.a.c.f.g.a5 */
public final class C6698a5 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6698a5 zza;
    /* access modifiers changed from: private */
    public C6787f9 zze = C6702a9.m25412m();
    /* access modifiers changed from: private */
    public C6787f9 zzf = C6702a9.m25412m();
    /* access modifiers changed from: private */
    public C6804g9 zzg = C6702a9.m25414o();
    /* access modifiers changed from: private */
    public C6804g9 zzh = C6702a9.m25414o();

    static {
        C6698a5 a5Var = new C6698a5();
        zza = a5Var;
        C6702a9.m25418s(C6698a5.class, a5Var);
    }

    private C6698a5() {
    }

    /* renamed from: C */
    public static C7103z4 m25380C() {
        return (C7103z4) zza.mo19524t();
    }

    /* renamed from: E */
    public static C6698a5 m25382E() {
        return zza;
    }

    /* renamed from: K */
    static /* synthetic */ void m25383K(C6698a5 a5Var, Iterable iterable) {
        C6787f9 f9Var = a5Var.zze;
        if (!f9Var.mo19801a()) {
            a5Var.zze = C6702a9.m25413n(f9Var);
        }
        C6834i7.m25867b(iterable, a5Var.zze);
    }

    /* renamed from: M */
    static /* synthetic */ void m25385M(C6698a5 a5Var, Iterable iterable) {
        C6787f9 f9Var = a5Var.zzf;
        if (!f9Var.mo19801a()) {
            a5Var.zzf = C6702a9.m25413n(f9Var);
        }
        C6834i7.m25867b(iterable, a5Var.zzf);
    }

    /* renamed from: O */
    static /* synthetic */ void m25387O(C6698a5 a5Var, Iterable iterable) {
        a5Var.m25393U();
        C6834i7.m25867b(iterable, a5Var.zzg);
    }

    /* renamed from: Q */
    static /* synthetic */ void m25389Q(C6698a5 a5Var, int i) {
        a5Var.m25393U();
        a5Var.zzg.remove(i);
    }

    /* renamed from: R */
    static /* synthetic */ void m25390R(C6698a5 a5Var, Iterable iterable) {
        a5Var.m25394V();
        C6834i7.m25867b(iterable, a5Var.zzh);
    }

    /* renamed from: T */
    static /* synthetic */ void m25392T(C6698a5 a5Var, int i) {
        a5Var.m25394V();
        a5Var.zzh.remove(i);
    }

    /* renamed from: U */
    private final void m25393U() {
        C6804g9 g9Var = this.zzg;
        if (!g9Var.mo19801a()) {
            this.zzg = C6702a9.m25415p(g9Var);
        }
    }

    /* renamed from: V */
    private final void m25394V() {
        C6804g9 g9Var = this.zzh;
        if (!g9Var.mo19801a()) {
            this.zzh = C6702a9.m25415p(g9Var);
        }
    }

    /* renamed from: A */
    public final int mo19502A() {
        return this.zze.size();
    }

    /* renamed from: B */
    public final C6831i4 mo19503B(int i) {
        return (C6831i4) this.zzg.get(i);
    }

    /* renamed from: F */
    public final C6732c5 mo19504F(int i) {
        return (C6732c5) this.zzh.get(i);
    }

    /* renamed from: G */
    public final List mo19505G() {
        return this.zzg;
    }

    /* renamed from: H */
    public final List mo19506H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final List mo19507I() {
        return this.zzh;
    }

    /* renamed from: J */
    public final List mo19508J() {
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
            return C6702a9.m25417r(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C6831i4.class, "zzh", C6732c5.class});
        } else if (i2 == 3) {
            return new C6698a5();
        } else {
            if (i2 == 4) {
                return new C7103z4((C6714b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo19509x() {
        return this.zzg.size();
    }

    /* renamed from: y */
    public final int mo19510y() {
        return this.zzf.size();
    }

    /* renamed from: z */
    public final int mo19511z() {
        return this.zzh.size();
    }
}
