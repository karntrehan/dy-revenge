package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.l9 */
public class C6884l9 {

    /* renamed from: a */
    private static final C6899m8 f18618a = C6899m8.m26140a();

    /* renamed from: b */
    protected volatile C6805ga f18619b;

    /* renamed from: c */
    private volatile C7106z7 f18620c;

    /* renamed from: a */
    public final int mo19944a() {
        if (this.f18620c != null) {
            return ((C7058w7) this.f18620c).f19036r.length;
        }
        if (this.f18619b != null) {
            return this.f18619b.mo19520g();
        }
        return 0;
    }

    /* renamed from: b */
    public final C7106z7 mo19945b() {
        if (this.f18620c != null) {
            return this.f18620c;
        }
        synchronized (this) {
            if (this.f18620c != null) {
                C7106z7 z7Var = this.f18620c;
                return z7Var;
            }
            this.f18620c = this.f18619b == null ? C7106z7.f19078f : this.f18619b.mo19803c();
            C7106z7 z7Var2 = this.f18620c;
            return z7Var2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19946c(p174e.p319f.p320a.p335c.p345f.p352g.C6805ga r2) {
        /*
            r1 = this;
            e.f.a.c.f.g.ga r0 = r1.f18619b
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            e.f.a.c.f.g.ga r0 = r1.f18619b     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f18619b = r2     // Catch:{ j9 -> 0x0011 }
            e.f.a.c.f.g.z7 r0 = p174e.p319f.p320a.p335c.p345f.p352g.C7106z7.f19078f     // Catch:{ j9 -> 0x0011 }
            r1.f18620c = r0     // Catch:{ j9 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f18619b = r2     // Catch:{ all -> 0x001b }
            e.f.a.c.f.g.z7 r2 = p174e.p319f.p320a.p335c.p345f.p352g.C7106z7.f19078f     // Catch:{ all -> 0x001b }
            r1.f18620c = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6884l9.mo19946c(e.f.a.c.f.g.ga):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6884l9)) {
            return false;
        }
        C6884l9 l9Var = (C6884l9) obj;
        C6805ga gaVar = this.f18619b;
        C6805ga gaVar2 = l9Var.f18619b;
        if (gaVar == null && gaVar2 == null) {
            return mo19945b().equals(l9Var.mo19945b());
        }
        if (gaVar != null && gaVar2 != null) {
            return gaVar.equals(gaVar2);
        }
        if (gaVar != null) {
            l9Var.mo19946c(gaVar.mo19516d());
            return gaVar.equals(l9Var.f18619b);
        }
        mo19946c(gaVar2.mo19516d());
        return this.f18619b.equals(gaVar2);
    }

    public int hashCode() {
        return 1;
    }
}
