package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.e0 */
public final class C8184e0 extends C8197ed<C8184e0, C8165d0> implements C8293je {
    /* access modifiers changed from: private */
    public static final C8184e0 zzb;
    private int zze;
    private float zzf = 0.1f;
    private int zzg = 1;
    private int zzh = 1;
    private int zzi = 1;
    private boolean zzj;
    private boolean zzk;
    private float zzl = 45.0f;
    private float zzm = 0.5f;
    private boolean zzn;
    private C8222g0 zzo;
    private C8388p zzp;
    private C8317l0 zzq;

    static {
        C8184e0 e0Var = new C8184e0();
        zzb = e0Var;
        C8197ed.m28469j(C8184e0.class, e0Var);
    }

    private C8184e0() {
    }

    /* renamed from: A */
    static /* synthetic */ void m28436A(C8184e0 e0Var, float f) {
        e0Var.zze |= 1;
        e0Var.zzf = f;
    }

    /* renamed from: B */
    static /* synthetic */ void m28437B(C8184e0 e0Var, boolean z) {
        e0Var.zze |= 32;
        e0Var.zzk = z;
    }

    /* renamed from: C */
    static /* synthetic */ void m28438C(C8184e0 e0Var, boolean z) {
        e0Var.zze |= 256;
        e0Var.zzn = true;
    }

    /* renamed from: D */
    static /* synthetic */ void m28439D(C8184e0 e0Var, C8222g0 g0Var) {
        g0Var.getClass();
        e0Var.zzo = g0Var;
        e0Var.zze |= 512;
    }

    /* renamed from: E */
    static /* synthetic */ void m28440E(C8184e0 e0Var, C8388p pVar) {
        pVar.getClass();
        e0Var.zzp = pVar;
        e0Var.zze |= 1024;
    }

    /* renamed from: F */
    static /* synthetic */ void m28441F(C8184e0 e0Var, C8317l0 l0Var) {
        l0Var.getClass();
        e0Var.zzq = l0Var;
        e0Var.zze |= 2048;
    }

    /* renamed from: G */
    static /* synthetic */ void m28442G(C8184e0 e0Var, C8279j0 j0Var) {
        e0Var.zzg = j0Var.zza();
        e0Var.zze |= 2;
    }

    /* renamed from: H */
    static /* synthetic */ void m28443H(C8184e0 e0Var, C8442s sVar) {
        e0Var.zzh = sVar.zza();
        e0Var.zze |= 4;
    }

    /* renamed from: J */
    static /* synthetic */ void m28444J(C8184e0 e0Var, C8371o0 o0Var) {
        e0Var.zzi = o0Var.zza();
        e0Var.zze |= 8;
    }

    /* renamed from: K */
    static /* synthetic */ void m28445K(C8184e0 e0Var, boolean z) {
        e0Var.zze |= 16;
        e0Var.zzj = z;
    }

    /* renamed from: x */
    public static C8165d0 m28446x() {
        return (C8165d0) zzb.mo21765l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Object mo21702k(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8197ed.m28468i(zzb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ခ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ခ\u0006\bခ\u0007\tဇ\b\nဉ\t\u000bဉ\n\fဉ\u000b", new Object[]{"zze", "zzf", "zzg", C8279j0.m28610g(), "zzh", C8442s.m29020g(), "zzi", C8371o0.m28894g(), "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        } else if (i2 == 3) {
            return new C8184e0();
        } else {
            if (i2 == 4) {
                return new C8165d0((C8352n) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: w */
    public final C8442s mo21756w() {
        C8442s e = C8442s.m29019e(this.zzh);
        return e == null ? C8442s.NO_CLASSIFICATION : e;
    }

    /* renamed from: z */
    public final C8279j0 mo21757z() {
        C8279j0 e = C8279j0.m28609e(this.zzg);
        return e == null ? C8279j0.NO_LANDMARK : e;
    }
}
