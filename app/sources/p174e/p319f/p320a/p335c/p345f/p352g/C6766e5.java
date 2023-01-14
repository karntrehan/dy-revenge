package p174e.p319f.p320a.p335c.p345f.p352g;

import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.e5 */
public final class C6766e5 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6766e5 zza;
    private int zze;
    private long zzf;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        C6766e5 e5Var = new C6766e5();
        zza = e5Var;
        C6702a9.m25418s(C6766e5.class, e5Var);
    }

    private C6766e5() {
    }

    /* renamed from: A */
    public static C6749d5 m25622A() {
        return (C6749d5) zza.mo19524t();
    }

    /* renamed from: E */
    static /* synthetic */ void m25624E(C6766e5 e5Var, long j) {
        e5Var.zze |= 1;
        e5Var.zzf = j;
    }

    /* renamed from: F */
    static /* synthetic */ void m25625F(C6766e5 e5Var, String str) {
        str.getClass();
        e5Var.zze |= 2;
        e5Var.zzg = str;
    }

    /* renamed from: G */
    static /* synthetic */ void m25626G(C6766e5 e5Var, String str) {
        str.getClass();
        e5Var.zze |= 4;
        e5Var.zzh = str;
    }

    /* renamed from: H */
    static /* synthetic */ void m25627H(C6766e5 e5Var) {
        e5Var.zze &= -5;
        e5Var.zzh = zza.zzh;
    }

    /* renamed from: I */
    static /* synthetic */ void m25628I(C6766e5 e5Var, long j) {
        e5Var.zze |= 8;
        e5Var.zzi = j;
    }

    /* renamed from: J */
    static /* synthetic */ void m25629J(C6766e5 e5Var) {
        e5Var.zze &= -9;
        e5Var.zzi = 0;
    }

    /* renamed from: K */
    static /* synthetic */ void m25630K(C6766e5 e5Var, double d) {
        e5Var.zze |= 32;
        e5Var.zzk = d;
    }

    /* renamed from: L */
    static /* synthetic */ void m25631L(C6766e5 e5Var) {
        e5Var.zze &= -33;
        e5Var.zzk = 0.0d;
    }

    /* renamed from: C */
    public final String mo19696C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final String mo19697D() {
        return this.zzh;
    }

    /* renamed from: M */
    public final boolean mo19698M() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: N */
    public final boolean mo19699N() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: O */
    public final boolean mo19700O() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: P */
    public final boolean mo19701P() {
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
            return C6702a9.m25417r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C6766e5();
        } else {
            if (i2 == 4) {
                return new C6749d5((C6714b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final double mo19702x() {
        return this.zzk;
    }

    /* renamed from: y */
    public final long mo19703y() {
        return this.zzi;
    }

    /* renamed from: z */
    public final long mo19704z() {
        return this.zzf;
    }
}
