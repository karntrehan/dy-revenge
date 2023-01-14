package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.w3 */
public final class C7054w3 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C7054w3 zza;
    private int zze;
    private long zzf;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private int zzh;
    private C6804g9 zzi = C6702a9.m25414o();
    private C6804g9 zzj = C6702a9.m25414o();
    /* access modifiers changed from: private */
    public C6804g9 zzk = C6702a9.m25414o();
    private String zzl = HttpUrl.FRAGMENT_ENCODE_SET;
    private boolean zzm;
    private C6804g9 zzn = C6702a9.m25414o();
    private C6804g9 zzo = C6702a9.m25414o();
    private String zzp = HttpUrl.FRAGMENT_ENCODE_SET;

    static {
        C7054w3 w3Var = new C7054w3();
        zza = w3Var;
        C6702a9.m25418s(C7054w3.class, w3Var);
    }

    private C7054w3() {
    }

    /* renamed from: B */
    public static C7038v3 m26949B() {
        return (C7038v3) zza.mo19524t();
    }

    /* renamed from: D */
    public static C7054w3 m26951D() {
        return zza;
    }

    /* renamed from: K */
    static /* synthetic */ void m26952K(C7054w3 w3Var, int i, C7022u3 u3Var) {
        u3Var.getClass();
        C6804g9 g9Var = w3Var.zzj;
        if (!g9Var.mo19801a()) {
            w3Var.zzj = C6702a9.m25415p(g9Var);
        }
        w3Var.zzj.set(i, u3Var);
    }

    /* renamed from: A */
    public final C7022u3 mo20398A(int i) {
        return (C7022u3) this.zzj.get(i);
    }

    /* renamed from: E */
    public final String mo20399E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final String mo20400F() {
        return this.zzp;
    }

    /* renamed from: G */
    public final List mo20401G() {
        return this.zzk;
    }

    /* renamed from: H */
    public final List mo20402H() {
        return this.zzo;
    }

    /* renamed from: I */
    public final List mo20403I() {
        return this.zzn;
    }

    /* renamed from: J */
    public final List mo20404J() {
        return this.zzi;
    }

    /* renamed from: M */
    public final boolean mo20405M() {
        return this.zzm;
    }

    /* renamed from: N */
    public final boolean mo20406N() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: O */
    public final boolean mo20407O() {
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
            return C6702a9.m25417r(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C6697a4.class, "zzj", C7022u3.class, "zzk", C7085y2.class, "zzl", "zzm", "zzn", C6880l5.class, "zzo", C6990s3.class, "zzp"});
        } else if (i2 == 3) {
            return new C7054w3();
        } else {
            if (i2 == 4) {
                return new C7038v3((C6942p3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo20408x() {
        return this.zzn.size();
    }

    /* renamed from: y */
    public final int mo20409y() {
        return this.zzj.size();
    }

    /* renamed from: z */
    public final long mo20410z() {
        return this.zzf;
    }
}
