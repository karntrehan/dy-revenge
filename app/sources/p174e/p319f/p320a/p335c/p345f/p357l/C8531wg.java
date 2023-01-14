package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.List;

/* renamed from: e.f.a.c.f.l.wg */
public final class C8531wg extends C8140bd<C8531wg, C8314kg> implements C8293je {
    /* access modifiers changed from: private */
    public static final C8531wg zze;
    private int zzf;
    private C8295jg zzg;
    private C8292jd<C8513vg> zzh = C8197ed.m28466g();
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private C8292jd<C8351mg> zzn = C8197ed.m28466g();
    private C8292jd<C8257hg> zzo = C8197ed.m28466g();
    private long zzp;
    private long zzq;
    private long zzr;
    private float zzs;
    private byte zzt = 2;

    static {
        C8531wg wgVar = new C8531wg();
        zze = wgVar;
        C8197ed.m28469j(C8531wg.class, wgVar);
    }

    private C8531wg() {
    }

    /* renamed from: H */
    public static C8531wg m29229H() {
        return zze;
    }

    /* renamed from: A */
    public final float mo22244A() {
        return this.zzi;
    }

    /* renamed from: B */
    public final float mo22245B() {
        return this.zzk;
    }

    /* renamed from: C */
    public final float mo22246C() {
        return this.zzj;
    }

    /* renamed from: D */
    public final float mo22247D() {
        return this.zzl;
    }

    /* renamed from: E */
    public final long mo22248E() {
        return this.zzq;
    }

    /* renamed from: F */
    public final C8295jg mo22249F() {
        C8295jg jgVar = this.zzg;
        return jgVar == null ? C8295jg.m28637B() : jgVar;
    }

    /* renamed from: J */
    public final List<C8257hg> mo22250J() {
        return this.zzo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final Object mo21702k(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzt);
        }
        byte b = 1;
        if (i2 == 2) {
            return C8197ed.m28468i(zze, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004\u0007\u001b\b\u001b\tဃ\u0007\nခ\t\u000bဃ\b\fဃ\u0006\rခ\u0005", new Object[]{"zzf", "zzg", "zzh", C8513vg.class, "zzi", "zzj", "zzk", "zzl", "zzn", C8351mg.class, "zzo", C8257hg.class, "zzq", "zzs", "zzr", "zzp", "zzm"});
        } else if (i2 == 3) {
            return new C8531wg();
        } else {
            if (i2 == 4) {
                return new C8314kg((C8162cg) null);
            }
            if (i2 == 5) {
                return zze;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzt = b;
            return null;
        }
    }

    /* renamed from: y */
    public final List<C8513vg> mo22251y() {
        return this.zzh;
    }

    /* renamed from: z */
    public final boolean mo22252z() {
        return (this.zzf & 2) != 0;
    }
}
