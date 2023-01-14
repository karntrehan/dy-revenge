package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.a3 */
public final class C6696a3 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6696a3 zza;
    private int zze;
    private int zzf;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private C6804g9 zzh = C6702a9.m25414o();
    private boolean zzi;
    private C6814h3 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        C6696a3 a3Var = new C6696a3();
        zza = a3Var;
        C6702a9.m25418s(C6696a3.class, a3Var);
    }

    private C6696a3() {
    }

    /* renamed from: F */
    static /* synthetic */ void m25360F(C6696a3 a3Var, String str) {
        a3Var.zze |= 2;
        a3Var.zzg = str;
    }

    /* renamed from: G */
    static /* synthetic */ void m25361G(C6696a3 a3Var, int i, C6730c3 c3Var) {
        c3Var.getClass();
        C6804g9 g9Var = a3Var.zzh;
        if (!g9Var.mo19801a()) {
            a3Var.zzh = C6702a9.m25415p(g9Var);
        }
        a3Var.zzh.set(i, c3Var);
    }

    /* renamed from: z */
    public static C7101z2 m25362z() {
        return (C7101z2) zza.mo19524t();
    }

    /* renamed from: B */
    public final C6730c3 mo19487B(int i) {
        return (C6730c3) this.zzh.get(i);
    }

    /* renamed from: C */
    public final C6814h3 mo19488C() {
        C6814h3 h3Var = this.zzj;
        return h3Var == null ? C6814h3.m25776y() : h3Var;
    }

    /* renamed from: D */
    public final String mo19489D() {
        return this.zzg;
    }

    /* renamed from: E */
    public final List mo19490E() {
        return this.zzh;
    }

    /* renamed from: H */
    public final boolean mo19491H() {
        return this.zzk;
    }

    /* renamed from: I */
    public final boolean mo19492I() {
        return this.zzl;
    }

    /* renamed from: J */
    public final boolean mo19493J() {
        return this.zzm;
    }

    /* renamed from: K */
    public final boolean mo19494K() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: L */
    public final boolean mo19495L() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: M */
    public final boolean mo19496M() {
        return (this.zze & 64) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C6730c3.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i2 == 3) {
            return new C6696a3();
        } else {
            if (i2 == 4) {
                return new C7101z2((C7053w2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo19498x() {
        return this.zzh.size();
    }

    /* renamed from: y */
    public final int mo19499y() {
        return this.zzf;
    }
}
