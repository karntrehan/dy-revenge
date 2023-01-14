package p174e.p319f.p320a.p382e.p383a.p389f;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: e.f.a.e.a.f.l */
final class C9164l<ResultT> {

    /* renamed from: a */
    private final Object f25046a = new Object();

    /* renamed from: b */
    private Queue<C9163k<ResultT>> f25047b;

    /* renamed from: c */
    private boolean f25048c;

    C9164l() {
    }

    /* renamed from: a */
    public final void mo23137a(C9163k<ResultT> kVar) {
        synchronized (this.f25046a) {
            if (this.f25047b == null) {
                this.f25047b = new ArrayDeque();
            }
            this.f25047b.add(kVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f25046a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r2.f25047b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f25048c = false;
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
        r0.mo23135a(r3);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23138b(p174e.p319f.p320a.p382e.p383a.p389f.C9156d<ResultT> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f25046a
            monitor-enter(r0)
            java.util.Queue<e.f.a.e.a.f.k<ResultT>> r1 = r2.f25047b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f25048c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f25048c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f25046a
            monitor-enter(r1)
            java.util.Queue<e.f.a.e.a.f.k<ResultT>> r0 = r2.f25047b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            e.f.a.e.a.f.k r0 = (p174e.p319f.p320a.p382e.p383a.p389f.C9163k) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f25048c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.mo23135a(r3)
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
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p382e.p383a.p389f.C9164l.mo23138b(e.f.a.e.a.f.d):void");
    }
}
