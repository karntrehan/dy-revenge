package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.qd */
public class C8420qd {

    /* renamed from: a */
    private static final C8419qc f22960a = C8419qc.m28962a();

    /* renamed from: b */
    protected volatile C8274ie f22961b;

    /* renamed from: c */
    private volatile C8177dc f22962c;

    /* renamed from: a */
    public final int mo22103a() {
        if (this.f22962c != null) {
            return ((C8139bc) this.f22962c).f22125r.length;
        }
        if (this.f22961b != null) {
            return this.f22961b.mo21771u();
        }
        return 0;
    }

    /* renamed from: b */
    public final C8177dc mo22104b() {
        if (this.f22962c != null) {
            return this.f22962c;
        }
        synchronized (this) {
            if (this.f22962c != null) {
                C8177dc dcVar = this.f22962c;
                return dcVar;
            }
            this.f22962c = this.f22961b == null ? C8177dc.f22199f : this.f22961b.mo21878e();
            C8177dc dcVar2 = this.f22962c;
            return dcVar2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22105c(p174e.p319f.p320a.p335c.p345f.p357l.C8274ie r2) {
        /*
            r1 = this;
            e.f.a.c.f.l.ie r0 = r1.f22961b
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            e.f.a.c.f.l.ie r0 = r1.f22961b     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f22961b = r2     // Catch:{ nd -> 0x0011 }
            e.f.a.c.f.l.dc r0 = p174e.p319f.p320a.p335c.p345f.p357l.C8177dc.f22199f     // Catch:{ nd -> 0x0011 }
            r1.f22962c = r0     // Catch:{ nd -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f22961b = r2     // Catch:{ all -> 0x001b }
            e.f.a.c.f.l.dc r2 = p174e.p319f.p320a.p335c.p345f.p357l.C8177dc.f22199f     // Catch:{ all -> 0x001b }
            r1.f22962c = r2     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p357l.C8420qd.mo22105c(e.f.a.c.f.l.ie):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8420qd)) {
            return false;
        }
        C8420qd qdVar = (C8420qd) obj;
        C8274ie ieVar = this.f22961b;
        C8274ie ieVar2 = qdVar.f22961b;
        if (ieVar == null && ieVar2 == null) {
            return mo22104b().equals(qdVar.mo22104b());
        }
        if (ieVar != null && ieVar2 != null) {
            return ieVar.equals(ieVar2);
        }
        if (ieVar != null) {
            qdVar.mo22105c(ieVar.mo21769t());
            return ieVar.equals(qdVar.f22961b);
        }
        mo22105c(ieVar2.mo21769t());
        return this.f22961b.equals(ieVar2);
    }

    public int hashCode() {
        return 1;
    }
}
