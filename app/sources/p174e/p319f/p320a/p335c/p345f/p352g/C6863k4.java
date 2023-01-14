package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.k4 */
public final class C6863k4 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6863k4 zza;
    private int zze;
    /* access modifiers changed from: private */
    public C6804g9 zzf = C6702a9.m25414o();
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        C6863k4 k4Var = new C6863k4();
        zza = k4Var;
        C6702a9.m25418s(C6863k4.class, k4Var);
    }

    private C6863k4() {
    }

    /* renamed from: B */
    public static C6847j4 m26045B() {
        return (C6847j4) zza.mo19524t();
    }

    /* renamed from: G */
    static /* synthetic */ void m26047G(C6863k4 k4Var, int i, C6927o4 o4Var) {
        o4Var.getClass();
        k4Var.m26055R();
        k4Var.zzf.set(i, o4Var);
    }

    /* renamed from: H */
    static /* synthetic */ void m26048H(C6863k4 k4Var, C6927o4 o4Var) {
        o4Var.getClass();
        k4Var.m26055R();
        k4Var.zzf.add(o4Var);
    }

    /* renamed from: I */
    static /* synthetic */ void m26049I(C6863k4 k4Var, Iterable iterable) {
        k4Var.m26055R();
        C6834i7.m25867b(iterable, k4Var.zzf);
    }

    /* renamed from: K */
    static /* synthetic */ void m26051K(C6863k4 k4Var, int i) {
        k4Var.m26055R();
        k4Var.zzf.remove(i);
    }

    /* renamed from: L */
    static /* synthetic */ void m26052L(C6863k4 k4Var, String str) {
        str.getClass();
        k4Var.zze |= 1;
        k4Var.zzg = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m26053M(C6863k4 k4Var, long j) {
        k4Var.zze |= 2;
        k4Var.zzh = j;
    }

    /* renamed from: N */
    static /* synthetic */ void m26054N(C6863k4 k4Var, long j) {
        k4Var.zze |= 4;
        k4Var.zzi = j;
    }

    /* renamed from: R */
    private final void m26055R() {
        C6804g9 g9Var = this.zzf;
        if (!g9Var.mo19801a()) {
            this.zzf = C6702a9.m25415p(g9Var);
        }
    }

    /* renamed from: A */
    public final long mo19914A() {
        return this.zzh;
    }

    /* renamed from: D */
    public final C6927o4 mo19915D(int i) {
        return (C6927o4) this.zzf.get(i);
    }

    /* renamed from: E */
    public final String mo19916E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final List mo19917F() {
        return this.zzf;
    }

    /* renamed from: O */
    public final boolean mo19918O() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: P */
    public final boolean mo19919P() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: Q */
    public final boolean mo19920Q() {
        return (this.zze & 2) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C6927o4.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C6863k4();
        } else {
            if (i2 == 4) {
                return new C6847j4((C6714b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo19921x() {
        return this.zzj;
    }

    /* renamed from: y */
    public final int mo19922y() {
        return this.zzf.size();
    }

    /* renamed from: z */
    public final long mo19923z() {
        return this.zzi;
    }
}
