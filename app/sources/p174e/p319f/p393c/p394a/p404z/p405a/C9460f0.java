package p174e.p319f.p393c.p394a.p404z.p405a;

/* renamed from: e.f.c.a.z.a.f0 */
public class C9460f0 {

    /* renamed from: a */
    private static final C9526q f25352a = C9526q.m32218b();

    /* renamed from: b */
    private C9468i f25353b;

    /* renamed from: c */
    private C9526q f25354c;

    /* renamed from: d */
    protected volatile C9537s0 f25355d;

    /* renamed from: e */
    private volatile C9468i f25356e;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f25355d = r4;
        r3.f25356e = p174e.p319f.p393c.p394a.p404z.p405a.C9468i.f25367f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23589a(p174e.p319f.p393c.p394a.p404z.p405a.C9537s0 r4) {
        /*
            r3 = this;
            e.f.c.a.z.a.s0 r0 = r3.f25355d
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            e.f.c.a.z.a.s0 r0 = r3.f25355d     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x000c:
            e.f.c.a.z.a.i r0 = r3.f25353b     // Catch:{ c0 -> 0x002a }
            if (r0 == 0) goto L_0x0025
            e.f.c.a.z.a.a1 r0 = r4.mo23983k()     // Catch:{ c0 -> 0x002a }
            e.f.c.a.z.a.i r1 = r3.f25353b     // Catch:{ c0 -> 0x002a }
            e.f.c.a.z.a.q r2 = r3.f25354c     // Catch:{ c0 -> 0x002a }
            java.lang.Object r0 = r0.mo23506a(r1, r2)     // Catch:{ c0 -> 0x002a }
            e.f.c.a.z.a.s0 r0 = (p174e.p319f.p393c.p394a.p404z.p405a.C9537s0) r0     // Catch:{ c0 -> 0x002a }
            r3.f25355d = r0     // Catch:{ c0 -> 0x002a }
            e.f.c.a.z.a.i r0 = r3.f25353b     // Catch:{ c0 -> 0x002a }
        L_0x0022:
            r3.f25356e = r0     // Catch:{ c0 -> 0x002a }
            goto L_0x0030
        L_0x0025:
            r3.f25355d = r4     // Catch:{ c0 -> 0x002a }
            e.f.c.a.z.a.i r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9468i.f25367f     // Catch:{ c0 -> 0x002a }
            goto L_0x0022
        L_0x002a:
            r3.f25355d = r4     // Catch:{ all -> 0x0032 }
            e.f.c.a.z.a.i r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9468i.f25367f     // Catch:{ all -> 0x0032 }
            r3.f25356e = r4     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0032 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9460f0.mo23589a(e.f.c.a.z.a.s0):void");
    }

    /* renamed from: b */
    public int mo23590b() {
        if (this.f25356e != null) {
            return this.f25356e.size();
        }
        C9468i iVar = this.f25353b;
        if (iVar != null) {
            return iVar.size();
        }
        if (this.f25355d != null) {
            return this.f25355d.mo23981g();
        }
        return 0;
    }

    /* renamed from: c */
    public C9537s0 mo23591c(C9537s0 s0Var) {
        mo23589a(s0Var);
        return this.f25355d;
    }

    /* renamed from: d */
    public C9537s0 mo23592d(C9537s0 s0Var) {
        C9537s0 s0Var2 = this.f25355d;
        this.f25353b = null;
        this.f25356e = null;
        this.f25355d = s0Var;
        return s0Var2;
    }

    /* renamed from: e */
    public C9468i mo23593e() {
        if (this.f25356e != null) {
            return this.f25356e;
        }
        C9468i iVar = this.f25353b;
        if (iVar != null) {
            return iVar;
        }
        synchronized (this) {
            if (this.f25356e != null) {
                C9468i iVar2 = this.f25356e;
                return iVar2;
            }
            this.f25356e = this.f25355d == null ? C9468i.f25367f : this.f25355d.mo23477f();
            C9468i iVar3 = this.f25356e;
            return iVar3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9460f0)) {
            return false;
        }
        C9460f0 f0Var = (C9460f0) obj;
        C9537s0 s0Var = this.f25355d;
        C9537s0 s0Var2 = f0Var.f25355d;
        return (s0Var == null && s0Var2 == null) ? mo23593e().equals(f0Var.mo23593e()) : (s0Var == null || s0Var2 == null) ? s0Var != null ? s0Var.equals(f0Var.mo23591c(s0Var.mo24005c())) : mo23591c(s0Var2.mo24005c()).equals(s0Var2) : s0Var.equals(s0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
