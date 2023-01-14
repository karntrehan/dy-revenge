package p174e.p319f.p320a.p335c.p345f.p357l;

import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.l.mg */
public final class C8351mg extends C8197ed<C8351mg, C8333lg> implements C8293je {
    /* access modifiers changed from: private */
    public static final C8351mg zzb;
    private int zze;
    private int zzf;
    private C8177dc zzg = C8177dc.f22199f;
    private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
    private float zzi;

    static {
        C8351mg mgVar = new C8351mg();
        zzb = mgVar;
        C8197ed.m28469j(C8351mg.class, mgVar);
    }

    private C8351mg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Object mo21702k(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C8197ed.m28468i(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ခ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C8351mg();
        } else {
            if (i2 == 4) {
                return new C8333lg((C8162cg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
