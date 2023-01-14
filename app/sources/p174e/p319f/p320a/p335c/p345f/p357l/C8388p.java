package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.p */
public final class C8388p extends C8197ed<C8388p, C8370o> implements C8293je {
    /* access modifiers changed from: private */
    public static final C8388p zzb;
    private int zze;
    private C8407q0 zzf;
    private C8407q0 zzg;

    static {
        C8388p pVar = new C8388p();
        zzb = pVar;
        C8197ed.m28469j(C8388p.class, pVar);
    }

    private C8388p() {
    }

    /* renamed from: w */
    public static C8370o m28917w() {
        return (C8370o) zzb.mo21765l();
    }

    /* renamed from: y */
    static /* synthetic */ void m28919y(C8388p pVar, C8407q0 q0Var) {
        q0Var.getClass();
        pVar.zzf = q0Var;
        pVar.zze |= 1;
    }

    /* renamed from: z */
    static /* synthetic */ void m28920z(C8388p pVar, C8407q0 q0Var) {
        q0Var.getClass();
        pVar.zzg = q0Var;
        pVar.zze |= 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Object mo21702k(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8197ed.m28468i(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C8388p();
        } else {
            if (i2 == 4) {
                return new C8370o((C8352n) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
