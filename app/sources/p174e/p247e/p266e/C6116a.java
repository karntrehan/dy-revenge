package p174e.p247e.p266e;

import android.util.Pair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: e.e.e.a */
public abstract class C6116a<T> implements C6122c<T> {

    /* renamed from: a */
    private static volatile C6119c f16775a;

    /* renamed from: b */
    private Map<String, Object> f16776b;

    /* renamed from: c */
    private C6120d f16777c = C6120d.IN_PROGRESS;

    /* renamed from: d */
    private boolean f16778d = false;

    /* renamed from: e */
    private T f16779e = null;

    /* renamed from: f */
    private Throwable f16780f = null;

    /* renamed from: g */
    private float f16781g = 0.0f;

    /* renamed from: h */
    private final ConcurrentLinkedQueue<Pair<C6125e<T>, Executor>> f16782h = new ConcurrentLinkedQueue<>();

    /* renamed from: e.e.e.a$a */
    class C6117a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ boolean f16783f;

        /* renamed from: o */
        final /* synthetic */ C6125e f16784o;

        /* renamed from: p */
        final /* synthetic */ boolean f16785p;

        C6117a(boolean z, C6125e eVar, boolean z2) {
            this.f16783f = z;
            this.f16784o = eVar;
            this.f16785p = z2;
        }

        public void run() {
            if (this.f16783f) {
                this.f16784o.mo18137b(C6116a.this);
            } else if (this.f16785p) {
                this.f16784o.mo18136a(C6116a.this);
            } else {
                this.f16784o.mo18138c(C6116a.this);
            }
        }
    }

    /* renamed from: e.e.e.a$b */
    class C6118b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C6125e f16787f;

        C6118b(C6125e eVar) {
            this.f16787f = eVar;
        }

        public void run() {
            this.f16787f.mo18139d(C6116a.this);
        }
    }

    /* renamed from: e.e.e.a$c */
    public interface C6119c {
        /* renamed from: a */
        Runnable mo18135a(Runnable runnable, String str);
    }

    /* renamed from: e.e.e.a$d */
    private enum C6120d {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    protected C6116a() {
    }

    /* renamed from: j */
    public static C6119c m23024j() {
        return f16775a;
    }

    /* renamed from: n */
    private void m23025n() {
        boolean k = mo18124k();
        boolean x = m23029x();
        Iterator<Pair<C6125e<T>, Executor>> it = this.f16782h.iterator();
        while (it.hasNext()) {
            Pair next = it.next();
            mo18126m((C6125e) next.first, (Executor) next.second, k, x);
        }
    }

    /* renamed from: s */
    private synchronized boolean m23026s(Throwable th, Map<String, Object> map) {
        boolean z;
        if (!this.f16778d) {
            if (this.f16777c == C6120d.IN_PROGRESS) {
                this.f16777c = C6120d.FAILURE;
                this.f16780f = th;
                this.f16776b = map;
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001b, code lost:
        return false;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m23027u(float r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f16778d     // Catch:{ all -> 0x001c }
            r1 = 0
            if (r0 != 0) goto L_0x001a
            e.e.e.a$d r0 = r3.f16777c     // Catch:{ all -> 0x001c }
            e.e.e.a$d r2 = p174e.p247e.p266e.C6116a.C6120d.IN_PROGRESS     // Catch:{ all -> 0x001c }
            if (r0 == r2) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            float r0 = r3.f16781g     // Catch:{ all -> 0x001c }
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0015
            monitor-exit(r3)
            return r1
        L_0x0015:
            r3.f16781g = r4     // Catch:{ all -> 0x001c }
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x001a:
            monitor-exit(r3)
            return r1
        L_0x001c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p266e.C6116a.m23027u(float):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0025, code lost:
        if (r4 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0027, code lost:
        mo18114a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0032, code lost:
        return false;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m23028w(T r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            monitor-enter(r3)     // Catch:{ all -> 0x003a }
            boolean r1 = r3.f16778d     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x002b
            e.e.e.a$d r1 = r3.f16777c     // Catch:{ all -> 0x0037 }
            e.e.e.a$d r2 = p174e.p247e.p266e.C6116a.C6120d.IN_PROGRESS     // Catch:{ all -> 0x0037 }
            if (r1 == r2) goto L_0x000d
            goto L_0x002b
        L_0x000d:
            if (r5 == 0) goto L_0x0017
            e.e.e.a$d r5 = p174e.p247e.p266e.C6116a.C6120d.SUCCESS     // Catch:{ all -> 0x0037 }
            r3.f16777c = r5     // Catch:{ all -> 0x0037 }
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.f16781g = r5     // Catch:{ all -> 0x0037 }
        L_0x0017:
            T r5 = r3.f16779e     // Catch:{ all -> 0x0037 }
            if (r5 == r4) goto L_0x0022
            r3.f16779e = r4     // Catch:{ all -> 0x001f }
            r4 = r5
            goto L_0x0023
        L_0x001f:
            r4 = move-exception
            r0 = r5
            goto L_0x0038
        L_0x0022:
            r4 = r0
        L_0x0023:
            r5 = 1
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002a
            r3.mo18114a(r4)
        L_0x002a:
            return r5
        L_0x002b:
            r5 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x0032
            r3.mo18114a(r4)
        L_0x0032:
            return r5
        L_0x0033:
            r5 = move-exception
            r0 = r4
            r4 = r5
            goto L_0x0038
        L_0x0037:
            r4 = move-exception
        L_0x0038:
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            throw r4     // Catch:{ all -> 0x003a }
        L_0x003a:
            r4 = move-exception
            if (r0 == 0) goto L_0x0040
            r3.mo18114a(r0)
        L_0x0040:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p266e.C6116a.m23028w(java.lang.Object, boolean):boolean");
    }

    /* renamed from: x */
    private synchronized boolean m23029x() {
        return mo18125l() && !mo18118d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18114a(T t) {
    }

    /* renamed from: b */
    public Map<String, Object> mo18115b() {
        return this.f16776b;
    }

    /* renamed from: c */
    public synchronized boolean mo18116c() {
        return this.f16779e != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        mo18114a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (mo18118d() != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        m23025n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f16782h.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r1 == null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean close() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f16778d     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0008
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return r0
        L_0x0008:
            r0 = 1
            r3.f16778d = r0     // Catch:{ all -> 0x002a }
            T r1 = r3.f16779e     // Catch:{ all -> 0x002a }
            r2 = 0
            r3.f16779e = r2     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0016
            r3.mo18114a(r1)
        L_0x0016:
            boolean r1 = r3.mo18118d()
            if (r1 != 0) goto L_0x001f
            r3.m23025n()
        L_0x001f:
            monitor-enter(r3)
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<e.e.e.e<T>, java.util.concurrent.Executor>> r1 = r3.f16782h     // Catch:{ all -> 0x0027 }
            r1.clear()     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            return r0
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            throw r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p266e.C6116a.close():boolean");
    }

    /* renamed from: d */
    public synchronized boolean mo18118d() {
        return this.f16777c != C6120d.IN_PROGRESS;
    }

    /* renamed from: e */
    public synchronized Throwable mo18119e() {
        return this.f16780f;
    }

    /* renamed from: f */
    public synchronized float mo18120f() {
        return this.f16781g;
    }

    /* renamed from: g */
    public boolean mo18121g() {
        return false;
    }

    /* renamed from: h */
    public synchronized T mo18122h() {
        return this.f16779e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        mo18126m(r3, r4, mo18124k(), m23029x());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18123i(p174e.p247e.p266e.C6125e<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            p174e.p247e.p253d.p257d.C6062k.m22839g(r3)
            p174e.p247e.p253d.p257d.C6062k.m22839g(r4)
            monitor-enter(r2)
            boolean r0 = r2.f16778d     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            return
        L_0x000d:
            e.e.e.a$d r0 = r2.f16777c     // Catch:{ all -> 0x0041 }
            e.e.e.a$d r1 = p174e.p247e.p266e.C6116a.C6120d.IN_PROGRESS     // Catch:{ all -> 0x0041 }
            if (r0 != r1) goto L_0x001c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<e.e.e.e<T>, java.util.concurrent.Executor>> r0 = r2.f16782h     // Catch:{ all -> 0x0041 }
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch:{ all -> 0x0041 }
            r0.add(r1)     // Catch:{ all -> 0x0041 }
        L_0x001c:
            boolean r0 = r2.mo18116c()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.mo18118d()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.m23029x()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = 0
            goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0040
            boolean r0 = r2.mo18124k()
            boolean r1 = r2.m23029x()
            r2.mo18126m(r3, r4, r0, r1)
        L_0x0040:
            return
        L_0x0041:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p266e.C6116a.mo18123i(e.e.e.e, java.util.concurrent.Executor):void");
    }

    /* renamed from: k */
    public synchronized boolean mo18124k() {
        return this.f16777c == C6120d.FAILURE;
    }

    /* renamed from: l */
    public synchronized boolean mo18125l() {
        return this.f16778d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo18126m(C6125e<T> eVar, Executor executor, boolean z, boolean z2) {
        Runnable aVar = new C6117a(z, eVar, z2);
        C6119c j = m23024j();
        if (j != null) {
            aVar = j.mo18135a(aVar, "AbstractDataSource_notifyDataSubscriber");
        }
        executor.execute(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo18127o() {
        Iterator<Pair<C6125e<T>, Executor>> it = this.f16782h.iterator();
        while (it.hasNext()) {
            Pair next = it.next();
            ((Executor) next.second).execute(new C6118b((C6125e) next.first));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo18128p(Map<String, Object> map) {
        this.f16776b = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo18129q(Throwable th) {
        return mo18130r(th, (Map<String, Object>) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo18130r(Throwable th, Map<String, Object> map) {
        boolean s = m23026s(th, map);
        if (s) {
            m23025n();
        }
        return s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo18131t(float f) {
        boolean u = m23027u(f);
        if (u) {
            mo18127o();
        }
        return u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public boolean mo18132v(T t, boolean z, Map<String, Object> map) {
        mo18128p(map);
        boolean w = m23028w(t, z);
        if (w) {
            m23025n();
        }
        return w;
    }
}
