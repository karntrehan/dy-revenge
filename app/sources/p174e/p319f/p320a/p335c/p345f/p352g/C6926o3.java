package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.o3 */
public final class C6926o3 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6926o3 zza;
    private int zze;
    private int zzf;
    private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
    private boolean zzh;
    private C6804g9 zzi = C6702a9.m25414o();

    static {
        C6926o3 o3Var = new C6926o3();
        zza = o3Var;
        C6702a9.m25418s(C6926o3.class, o3Var);
    }

    private C6926o3() {
    }

    /* renamed from: z */
    public static C6926o3 m26274z() {
        return zza;
    }

    /* renamed from: A */
    public final String mo20048A() {
        return this.zzg;
    }

    /* renamed from: B */
    public final List mo20049B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final boolean mo20050C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final boolean mo20051D() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: E */
    public final boolean mo20052E() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: F */
    public final boolean mo20053F() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: G */
    public final int mo20054G() {
        int a = C6910n3.m26202a(this.zzf);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", C6894m3.f18627a, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C6926o3();
        } else {
            if (i2 == 4) {
                return new C6862k3((C7053w2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo20055x() {
        return this.zzi.size();
    }
}
