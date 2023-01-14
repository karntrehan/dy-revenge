package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.List;

/* renamed from: e.f.a.c.f.l.z */
public final class C8568z extends C8197ed<C8568z, C8460t> implements C8293je {
    /* access modifiers changed from: private */
    public static final C8568z zzb;
    private int zze;
    private int zzf;
    private C8292jd<C8496v> zzg = C8197ed.m28466g();

    static {
        C8568z zVar = new C8568z();
        zzb = zVar;
        C8197ed.m28469j(C8568z.class, zVar);
    }

    private C8568z() {
    }

    /* renamed from: y */
    public static C8568z m29324y() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Object mo21702k(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8197ed.m28468i(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", C8550y.m29309g(), "zzg", C8496v.class});
        } else if (i2 == 3) {
            return new C8568z();
        } else {
            if (i2 == 4) {
                return new C8460t((C8352n) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: w */
    public final C8550y mo22280w() {
        C8550y e = C8550y.m29308e(this.zzf);
        return e == null ? C8550y.CONTOUR_UNKNOWN : e;
    }

    /* renamed from: z */
    public final List<C8496v> mo22281z() {
        return this.zzg;
    }
}
