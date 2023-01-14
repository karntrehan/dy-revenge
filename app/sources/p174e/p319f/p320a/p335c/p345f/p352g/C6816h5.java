package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.List;

/* renamed from: e.f.a.c.f.g.h5 */
public final class C6816h5 extends C6702a9 implements C6821ha {
    /* access modifiers changed from: private */
    public static final C6816h5 zza;
    private C6804g9 zze = C6702a9.m25414o();

    static {
        C6816h5 h5Var = new C6816h5();
        zza = h5Var;
        C6702a9.m25418s(C6816h5.class, h5Var);
    }

    private C6816h5() {
    }

    /* renamed from: z */
    public static C6816h5 m25791z() {
        return zza;
    }

    /* renamed from: A */
    public final List mo19823A() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final Object mo19497w(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6702a9.m25417r(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C6848j5.class});
        } else if (i2 == 3) {
            return new C6816h5();
        } else {
            if (i2 == 4) {
                return new C6800g5((C6783f5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: x */
    public final int mo19824x() {
        return this.zze.size();
    }
}
