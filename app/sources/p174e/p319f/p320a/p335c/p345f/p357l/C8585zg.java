package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.List;

/* renamed from: e.f.a.c.f.l.zg */
public final class C8585zg extends C8197ed<C8585zg, C8567yg> implements C8293je {
    /* access modifiers changed from: private */
    public static final C8585zg zzb;
    private C8292jd<C8531wg> zze = C8197ed.m28466g();
    private byte zzf = 2;

    static {
        C8585zg zgVar = new C8585zg();
        zzb = zgVar;
        C8197ed.m28469j(C8585zg.class, zgVar);
    }

    private C8585zg() {
    }

    /* renamed from: x */
    public static C8585zg m29356x() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Object mo21702k(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzf);
        }
        byte b = 1;
        if (i2 == 2) {
            return C8197ed.m28468i(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zze", C8531wg.class});
        } else if (i2 == 3) {
            return new C8585zg();
        } else {
            if (i2 == 4) {
                return new C8567yg((C8549xg) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzf = b;
            return null;
        }
    }

    /* renamed from: y */
    public final List<C8531wg> mo22298y() {
        return this.zze;
    }
}
