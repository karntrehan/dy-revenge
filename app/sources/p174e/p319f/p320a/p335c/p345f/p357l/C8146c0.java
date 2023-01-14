package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.c0 */
public final class C8146c0 extends C8197ed<C8146c0, C8108a0> implements C8293je {
    /* access modifiers changed from: private */
    public static final C8146c0 zzb;
    private int zze;
    private C8585zg zzf;
    private byte zzg = 2;

    static {
        C8146c0 c0Var = new C8146c0();
        zzb = c0Var;
        C8197ed.m28469j(C8146c0.class, c0Var);
    }

    private C8146c0() {
    }

    /* renamed from: x */
    public static C8146c0 m28375x(byte[] bArr, C8419qc qcVar) {
        return (C8146c0) C8197ed.m28472q(zzb, bArr, qcVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Object mo21702k(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        byte b = 1;
        if (i2 == 2) {
            return C8197ed.m28468i(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new C8146c0();
        } else {
            if (i2 == 4) {
                return new C8108a0((C8352n) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzg = b;
            return null;
        }
    }

    /* renamed from: y */
    public final C8585zg mo21703y() {
        C8585zg zgVar = this.zzf;
        return zgVar == null ? C8585zg.m29356x() : zgVar;
    }
}
