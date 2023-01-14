package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.q5 */
public final class C6960q5 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6960q5 zza;
    private int zze;
    private int zzf;
    private C6804g9 zzg = C6702a9.m25414o();
    private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
    private String zzi = HttpUrl.FRAGMENT_ENCODE_SET;
    private boolean zzj;
    private double zzk;

    static {
        C6960q5 q5Var = new C6960q5();
        zza = q5Var;
        C6702a9.m25418s(C6960q5.class, q5Var);
    }

    private C6960q5() {
    }

    /* renamed from: A */
    public final String mo20092A() {
        return this.zzi;
    }

    /* renamed from: B */
    public final List mo20093B() {
        return this.zzg;
    }

    /* renamed from: C */
    public final boolean mo20094C() {
        return this.zzj;
    }

    /* renamed from: D */
    public final boolean mo20095D() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: E */
    public final boolean mo20096E() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: F */
    public final boolean mo20097F() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: G */
    public final int mo20098G() {
        int a = C6944p5.m26362a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", C6928o5.f18740a, "zzg", C6960q5.class, "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C6960q5();
        } else {
            if (i2 == 4) {
                return new C6896m5((C6783f5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final double mo20099x() {
        return this.zzk;
    }

    /* renamed from: z */
    public final String mo20100z() {
        return this.zzh;
    }
}
