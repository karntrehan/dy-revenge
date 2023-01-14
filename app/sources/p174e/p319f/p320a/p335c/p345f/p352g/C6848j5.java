package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.j5 */
public final class C6848j5 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6848j5 zza;
    private int zze;
    private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
    private C6804g9 zzg = C6702a9.m25414o();

    static {
        C6848j5 j5Var = new C6848j5();
        zza = j5Var;
        C6702a9.m25418s(C6848j5.class, j5Var);
    }

    private C6848j5() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", C6960q5.class});
        } else if (i2 == 3) {
            return new C6848j5();
        } else {
            if (i2 == 4) {
                return new C6832i5((C6783f5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: y */
    public final String mo19875y() {
        return this.zzf;
    }

    /* renamed from: z */
    public final List mo19876z() {
        return this.zzg;
    }
}
