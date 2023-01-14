package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.vg */
public final class C8513vg extends C8197ed<C8513vg, C8369ng> implements C8293je {
    /* access modifiers changed from: private */
    public static final C8513vg zzb;
    private int zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private int zzi = 15000;
    private int zzj;
    private float zzk;

    static {
        C8513vg vgVar = new C8513vg();
        zzb = vgVar;
        C8197ed.m28469j(C8513vg.class, vgVar);
    }

    private C8513vg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Object mo21702k(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8197ed.m28468i(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ခ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C8441rg.m29017e(), "zzj", C8495ug.m29121e(), "zzk"});
        } else if (i2 == 3) {
            return new C8513vg();
        } else {
            if (i2 == 4) {
                return new C8369ng((C8162cg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: w */
    public final float mo22217w() {
        return this.zzf;
    }

    /* renamed from: x */
    public final float mo22218x() {
        return this.zzg;
    }

    /* renamed from: y */
    public final C8441rg mo22219y() {
        C8441rg g = C8441rg.m29018g(this.zzi);
        return g == null ? C8441rg.LANDMARK_UNKNOWN : g;
    }
}
