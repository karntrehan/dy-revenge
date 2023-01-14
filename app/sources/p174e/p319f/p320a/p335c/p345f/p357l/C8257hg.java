package p174e.p319f.p320a.p335c.p345f.p357l;

import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.l.hg */
public final class C8257hg extends C8197ed<C8257hg, C8181dg> implements C8293je {
    /* access modifiers changed from: private */
    public static final C8257hg zzb;
    private int zze;
    private int zzf;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private float zzh;
    private float zzi;

    static {
        C8257hg hgVar = new C8257hg();
        zzb = hgVar;
        C8197ed.m28469j(C8257hg.class, hgVar);
    }

    private C8257hg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Object mo21702k(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8197ed.m28468i(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zze", "zzf", C8238gg.m28542e(), "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C8257hg();
        } else {
            if (i2 == 4) {
                return new C8181dg((C8162cg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: w */
    public final float mo21842w() {
        return this.zzh;
    }

    /* renamed from: y */
    public final String mo21843y() {
        return this.zzg;
    }
}
