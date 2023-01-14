package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.o4 */
public final class C6927o4 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6927o4 zza;
    private int zze;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private long zzh;
    private float zzi;
    private double zzj;
    /* access modifiers changed from: private */
    public C6804g9 zzk = C6702a9.m25414o();

    static {
        C6927o4 o4Var = new C6927o4();
        zza = o4Var;
        C6702a9.m25418s(C6927o4.class, o4Var);
    }

    private C6927o4() {
    }

    /* renamed from: B */
    public static C6911n4 m26284B() {
        return (C6911n4) zza.mo19524t();
    }

    /* renamed from: G */
    static /* synthetic */ void m26286G(C6927o4 o4Var, String str) {
        str.getClass();
        o4Var.zze |= 1;
        o4Var.zzf = str;
    }

    /* renamed from: H */
    static /* synthetic */ void m26287H(C6927o4 o4Var, String str) {
        str.getClass();
        o4Var.zze |= 2;
        o4Var.zzg = str;
    }

    /* renamed from: I */
    static /* synthetic */ void m26288I(C6927o4 o4Var) {
        o4Var.zze &= -3;
        o4Var.zzg = zza.zzg;
    }

    /* renamed from: J */
    static /* synthetic */ void m26289J(C6927o4 o4Var, long j) {
        o4Var.zze |= 4;
        o4Var.zzh = j;
    }

    /* renamed from: K */
    static /* synthetic */ void m26290K(C6927o4 o4Var) {
        o4Var.zze &= -5;
        o4Var.zzh = 0;
    }

    /* renamed from: L */
    static /* synthetic */ void m26291L(C6927o4 o4Var, double d) {
        o4Var.zze |= 16;
        o4Var.zzj = d;
    }

    /* renamed from: M */
    static /* synthetic */ void m26292M(C6927o4 o4Var) {
        o4Var.zze &= -17;
        o4Var.zzj = 0.0d;
    }

    /* renamed from: N */
    static /* synthetic */ void m26293N(C6927o4 o4Var, C6927o4 o4Var2) {
        o4Var2.getClass();
        o4Var.m26296V();
        o4Var.zzk.add(o4Var2);
    }

    /* renamed from: O */
    static /* synthetic */ void m26294O(C6927o4 o4Var, Iterable iterable) {
        o4Var.m26296V();
        C6834i7.m25867b(iterable, o4Var.zzk);
    }

    /* renamed from: V */
    private final void m26296V() {
        C6804g9 g9Var = this.zzk;
        if (!g9Var.mo19801a()) {
            this.zzk = C6702a9.m25415p(g9Var);
        }
    }

    /* renamed from: A */
    public final long mo20056A() {
        return this.zzh;
    }

    /* renamed from: D */
    public final String mo20057D() {
        return this.zzf;
    }

    /* renamed from: E */
    public final String mo20058E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final List mo20059F() {
        return this.zzk;
    }

    /* renamed from: Q */
    public final boolean mo20060Q() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: R */
    public final boolean mo20061R() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: S */
    public final boolean mo20062S() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: T */
    public final boolean mo20063T() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: U */
    public final boolean mo20064U() {
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
            return C6702a9.m25417r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C6927o4.class});
        } else if (i2 == 3) {
            return new C6927o4();
        } else {
            if (i2 == 4) {
                return new C6911n4((C6714b4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final double mo20065x() {
        return this.zzj;
    }

    /* renamed from: y */
    public final float mo20066y() {
        return this.zzi;
    }

    /* renamed from: z */
    public final int mo20067z() {
        return this.zzk.size();
    }
}
