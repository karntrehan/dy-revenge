package p174e.p319f.p320a.p335c.p345f.p357l;

import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.l.j */
public final class C8278j extends C8197ed<C8278j, C8259i> implements C8293je {
    /* access modifiers changed from: private */
    public static final C8278j zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private String zzl = HttpUrl.FRAGMENT_ENCODE_SET;

    static {
        C8278j jVar = new C8278j();
        zzb = jVar;
        C8197ed.m28469j(C8278j.class, jVar);
    }

    private C8278j() {
    }

    /* renamed from: A */
    static /* synthetic */ void m28601A(C8278j jVar, int i) {
        jVar.zze |= 2;
        jVar.zzg = i;
    }

    /* renamed from: B */
    static /* synthetic */ void m28602B(C8278j jVar, C8221g gVar) {
        jVar.zzh = gVar.zza();
        jVar.zze |= 4;
    }

    /* renamed from: C */
    static /* synthetic */ void m28603C(C8278j jVar, C8334m mVar) {
        jVar.zzi = mVar.zza();
        jVar.zze |= 8;
    }

    /* renamed from: w */
    public static C8259i m28604w() {
        return (C8259i) zzb.mo21765l();
    }

    /* renamed from: y */
    static /* synthetic */ void m28606y(C8278j jVar, int i) {
        jVar.zze |= 1;
        jVar.zzf = i;
    }

    /* renamed from: z */
    static /* synthetic */ void m28607z(C8278j jVar, long j) {
        jVar.zze |= 32;
        jVar.zzk = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Object mo21702k(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8197ed.m28468i(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C8221g.m28520g(), "zzi", C8334m.m28831g(), "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C8278j();
        } else {
            if (i2 == 4) {
                return new C8259i((C8240h) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
