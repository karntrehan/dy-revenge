package p174e.p319f.p320a.p335c.p362h;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: e.f.a.c.h.k0 */
final class C8962k0<TResult> {

    /* renamed from: a */
    private final Object f24370a = new Object();

    /* renamed from: b */
    private Queue<C8960j0<TResult>> f24371b;

    /* renamed from: c */
    private boolean f24372c;

    C8962k0() {
    }

    /* renamed from: a */
    public final void mo22763a(C8960j0<TResult> j0Var) {
        synchronized (this.f24370a) {
            if (this.f24371b == null) {
                this.f24371b = new ArrayDeque();
            }
            this.f24371b.add(j0Var);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f24370a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r2.f24371b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f24372c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.mo22754d(r3);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22764b(p174e.p319f.p320a.p335c.p362h.C8963l<TResult> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f24370a
            monitor-enter(r0)
            java.util.Queue<e.f.a.c.h.j0<TResult>> r1 = r2.f24371b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f24372c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f24372c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f24370a
            monitor-enter(r1)
            java.util.Queue<e.f.a.c.h.j0<TResult>> r0 = r2.f24371b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            e.f.a.c.h.j0 r0 = (p174e.p319f.p320a.p335c.p362h.C8960j0) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f24372c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.mo22754d(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r3
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p362h.C8962k0.mo22764b(e.f.a.c.h.l):void");
    }
}
