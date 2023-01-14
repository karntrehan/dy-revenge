package p174e.p247e.p294k.p300d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p253d.p260g.C6082g;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p294k.p307k.C6369d;

/* renamed from: e.e.k.d.x */
public class C6310x {

    /* renamed from: a */
    private static final Class<?> f17436a = C6310x.class;

    /* renamed from: b */
    private Map<C5999d, C6369d> f17437b = new HashMap();

    private C6310x() {
    }

    /* renamed from: d */
    public static C6310x m23895d() {
        return new C6310x();
    }

    /* renamed from: e */
    private synchronized void m23896e() {
        C6071a.m22888v(f17436a, "Count = %d", Integer.valueOf(this.f17437b.size()));
    }

    /* renamed from: a */
    public void mo18659a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f17437b.values());
            this.f17437b.clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C6369d dVar = (C6369d) arrayList.get(i);
            if (dVar != null) {
                dVar.close();
            }
        }
    }

    /* renamed from: b */
    public synchronized boolean mo18660b(C5999d dVar) {
        C6062k.m22839g(dVar);
        if (!this.f17437b.containsKey(dVar)) {
            return false;
        }
        C6369d dVar2 = this.f17437b.get(dVar);
        synchronized (dVar2) {
            if (C6369d.m24312z0(dVar2)) {
                return true;
            }
            this.f17437b.remove(dVar);
            C6071a.m22857E(f17436a, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(dVar2)), dVar.mo17920c(), Integer.valueOf(System.identityHashCode(dVar)));
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        return r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p174e.p247e.p294k.p307k.C6369d mo18661c(p174e.p247e.p249b.p250a.C5999d r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            p174e.p247e.p253d.p257d.C6062k.m22839g(r7)     // Catch:{ all -> 0x0051 }
            java.util.Map<e.e.b.a.d, e.e.k.k.d> r0 = r6.f17437b     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0051 }
            e.e.k.k.d r0 = (p174e.p247e.p294k.p307k.C6369d) r0     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x004f
            monitor-enter(r0)     // Catch:{ all -> 0x0051 }
            boolean r1 = p174e.p247e.p294k.p307k.C6369d.m24312z0(r0)     // Catch:{ all -> 0x004c }
            if (r1 != 0) goto L_0x0045
            java.util.Map<e.e.b.a.d, e.e.k.k.d> r1 = r6.f17437b     // Catch:{ all -> 0x004c }
            r1.remove(r7)     // Catch:{ all -> 0x004c }
            java.lang.Class<?> r1 = f17436a     // Catch:{ all -> 0x004c }
            java.lang.String r2 = "Found closed reference %d for key %s (%d)"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x004c }
            r4 = 0
            int r5 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x004c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x004c }
            r3[r4] = r5     // Catch:{ all -> 0x004c }
            r4 = 1
            java.lang.String r5 = r7.mo17920c()     // Catch:{ all -> 0x004c }
            r3[r4] = r5     // Catch:{ all -> 0x004c }
            r4 = 2
            int r7 = java.lang.System.identityHashCode(r7)     // Catch:{ all -> 0x004c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x004c }
            r3[r4] = r7     // Catch:{ all -> 0x004c }
            p174e.p247e.p253d.p258e.C6071a.m22857E(r1, r2, r3)     // Catch:{ all -> 0x004c }
            r7 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            monitor-exit(r6)
            return r7
        L_0x0045:
            e.e.k.k.d r7 = p174e.p247e.p294k.p307k.C6369d.m24308b(r0)     // Catch:{ all -> 0x004c }
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            r0 = r7
            goto L_0x004f
        L_0x004c:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r7     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r6)
            return r0
        L_0x0051:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p294k.p300d.C6310x.mo18661c(e.e.b.a.d):e.e.k.k.d");
    }

    /* renamed from: f */
    public synchronized void mo18662f(C5999d dVar, C6369d dVar2) {
        C6062k.m22839g(dVar);
        C6062k.m22834b(Boolean.valueOf(C6369d.m24312z0(dVar2)));
        C6369d.m24309h(this.f17437b.put(dVar, C6369d.m24308b(dVar2)));
        m23896e();
    }

    /* renamed from: g */
    public boolean mo18663g(C5999d dVar) {
        C6369d remove;
        C6062k.m22839g(dVar);
        synchronized (this) {
            remove = this.f17437b.remove(dVar);
        }
        if (remove == null) {
            return false;
        }
        try {
            return remove.mo18905y0();
        } finally {
            remove.close();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: h */
    public synchronized boolean mo18664h(C5999d dVar, C6369d dVar2) {
        C6062k.m22839g(dVar);
        C6062k.m22839g(dVar2);
        C6062k.m22834b(Boolean.valueOf(C6369d.m24312z0(dVar2)));
        C6369d dVar3 = this.f17437b.get(dVar);
        if (dVar3 == null) {
            return false;
        }
        C6088a<C6082g> r = dVar3.mo18901r();
        C6088a<C6082g> r2 = dVar2.mo18901r();
        if (!(r == null || r2 == null)) {
            try {
                if (r.mo18082w0() == r2.mo18082w0()) {
                    this.f17437b.remove(dVar);
                    C6088a.m22949v0(r2);
                    C6088a.m22949v0(r);
                    C6369d.m24309h(dVar3);
                    m23896e();
                    return true;
                }
            } catch (Throwable th) {
                C6088a.m22949v0(r2);
                C6088a.m22949v0(r);
                C6369d.m24309h(dVar3);
                throw th;
            }
        }
        C6088a.m22949v0(r2);
        C6088a.m22949v0(r);
        C6369d.m24309h(dVar3);
        return false;
    }
}
