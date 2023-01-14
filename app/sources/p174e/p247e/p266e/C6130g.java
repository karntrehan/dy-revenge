package p174e.p247e.p266e;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p174e.p247e.p253d.p255b.C6036a;
import p174e.p247e.p253d.p257d.C6058j;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p257d.C6065n;

/* renamed from: e.e.e.g */
public class C6130g<T> implements C6065n<C6122c<T>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<C6065n<C6122c<T>>> f16800a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f16801b;

    /* renamed from: e.e.e.g$a */
    private class C6131a extends C6116a<T> {

        /* renamed from: i */
        private ArrayList<C6122c<T>> f16802i;

        /* renamed from: j */
        private int f16803j;

        /* renamed from: k */
        private int f16804k;

        /* renamed from: l */
        private AtomicInteger f16805l;

        /* renamed from: m */
        private Throwable f16806m;

        /* renamed from: n */
        private Map<String, Object> f16807n;

        /* renamed from: e.e.e.g$a$a */
        private class C6132a implements C6125e<T> {

            /* renamed from: a */
            private int f16809a;

            public C6132a(int i) {
                this.f16809a = i;
            }

            /* renamed from: a */
            public void mo18136a(C6122c<T> cVar) {
            }

            /* renamed from: b */
            public void mo18137b(C6122c<T> cVar) {
                C6131a.this.m23101H(this.f16809a, cVar);
            }

            /* renamed from: c */
            public void mo18138c(C6122c<T> cVar) {
                if (cVar.mo18116c()) {
                    C6131a.this.m23102I(this.f16809a, cVar);
                } else if (cVar.mo18118d()) {
                    C6131a.this.m23101H(this.f16809a, cVar);
                }
            }

            /* renamed from: d */
            public void mo18139d(C6122c<T> cVar) {
                if (this.f16809a == 0) {
                    C6131a.this.mo18131t(cVar.mo18120f());
                }
            }
        }

        public C6131a() {
            if (!C6130g.this.f16801b) {
                m23095B();
            }
        }

        /* renamed from: A */
        private void m23094A(C6122c<T> cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        /* renamed from: B */
        private void m23095B() {
            if (this.f16805l == null) {
                synchronized (this) {
                    if (this.f16805l == null) {
                        int i = 0;
                        this.f16805l = new AtomicInteger(0);
                        int size = C6130g.this.f16800a.size();
                        this.f16804k = size;
                        this.f16803j = size;
                        this.f16802i = new ArrayList<>(size);
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            C6122c cVar = (C6122c) ((C6065n) C6130g.this.f16800a.get(i)).get();
                            this.f16802i.add(cVar);
                            cVar.mo18123i(new C6132a(i), C6036a.m22791a());
                            if (cVar.mo18116c()) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }

        /* renamed from: C */
        private synchronized C6122c<T> m23096C(int i) {
            C6122c<T> cVar;
            ArrayList<C6122c<T>> arrayList = this.f16802i;
            cVar = null;
            if (arrayList != null && i < arrayList.size()) {
                cVar = this.f16802i.set(i, (Object) null);
            }
            return cVar;
        }

        /* renamed from: D */
        private synchronized C6122c<T> m23097D(int i) {
            ArrayList<C6122c<T>> arrayList;
            arrayList = this.f16802i;
            return (arrayList == null || i >= arrayList.size()) ? null : this.f16802i.get(i);
        }

        /* renamed from: E */
        private synchronized C6122c<T> m23098E() {
            return m23097D(this.f16803j);
        }

        /* renamed from: F */
        private void m23099F() {
            Throwable th;
            if (this.f16805l.incrementAndGet() == this.f16804k && (th = this.f16806m) != null) {
                mo18130r(th, this.f16807n);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
            if (r0 <= r3) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
            m23094A(m23096C(r0));
            r0 = r0 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
            return;
         */
        /* renamed from: G */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m23100G(int r3, p174e.p247e.p266e.C6122c<T> r4, boolean r5) {
            /*
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.f16803j     // Catch:{ all -> 0x002f }
                e.e.e.c r1 = r2.m23097D(r3)     // Catch:{ all -> 0x002f }
                if (r4 != r1) goto L_0x002d
                int r4 = r2.f16803j     // Catch:{ all -> 0x002f }
                if (r3 != r4) goto L_0x000e
                goto L_0x002d
            L_0x000e:
                e.e.e.c r4 = r2.m23098E()     // Catch:{ all -> 0x002f }
                if (r4 == 0) goto L_0x001d
                if (r5 == 0) goto L_0x001b
                int r4 = r2.f16803j     // Catch:{ all -> 0x002f }
                if (r3 >= r4) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r3 = r0
                goto L_0x001f
            L_0x001d:
                r2.f16803j = r3     // Catch:{ all -> 0x002f }
            L_0x001f:
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
            L_0x0020:
                if (r0 <= r3) goto L_0x002c
                e.e.e.c r4 = r2.m23096C(r0)
                r2.m23094A(r4)
                int r0 = r0 + -1
                goto L_0x0020
            L_0x002c:
                return
            L_0x002d:
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                return
            L_0x002f:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p266e.C6130g.C6131a.m23100G(int, e.e.e.c, boolean):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: H */
        public void m23101H(int i, C6122c<T> cVar) {
            m23094A(m23103J(i, cVar));
            if (i == 0) {
                this.f16806m = cVar.mo18119e();
                this.f16807n = cVar.mo18115b();
            }
            m23099F();
        }

        /* access modifiers changed from: private */
        /* renamed from: I */
        public void m23102I(int i, C6122c<T> cVar) {
            m23100G(i, cVar, cVar.mo18118d());
            if (cVar == m23098E()) {
                mo18132v(null, i == 0 && cVar.mo18118d(), cVar.mo18115b());
            }
            m23099F();
        }

        /* renamed from: J */
        private synchronized C6122c<T> m23103J(int i, C6122c<T> cVar) {
            if (cVar == m23098E()) {
                return null;
            }
            if (cVar != m23097D(i)) {
                return cVar;
            }
            return m23096C(i);
        }

        /* renamed from: c */
        public synchronized boolean mo18116c() {
            C6122c E;
            if (C6130g.this.f16801b) {
                m23095B();
            }
            E = m23098E();
            return E != null && E.mo18116c();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r1 >= r0.size()) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            m23094A(r0.get(r1));
            r1 = r1 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean close() {
            /*
                r3 = this;
                e.e.e.g r0 = p174e.p247e.p266e.C6130g.this
                boolean r0 = r0.f16801b
                if (r0 == 0) goto L_0x000b
                r3.m23095B()
            L_0x000b:
                monitor-enter(r3)
                boolean r0 = super.close()     // Catch:{ all -> 0x0031 }
                r1 = 0
                if (r0 != 0) goto L_0x0015
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                return r1
            L_0x0015:
                java.util.ArrayList<e.e.e.c<T>> r0 = r3.f16802i     // Catch:{ all -> 0x0031 }
                r2 = 0
                r3.f16802i = r2     // Catch:{ all -> 0x0031 }
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                if (r0 == 0) goto L_0x002f
            L_0x001d:
                int r2 = r0.size()
                if (r1 >= r2) goto L_0x002f
                java.lang.Object r2 = r0.get(r1)
                e.e.e.c r2 = (p174e.p247e.p266e.C6122c) r2
                r3.m23094A(r2)
                int r1 = r1 + 1
                goto L_0x001d
            L_0x002f:
                r0 = 1
                return r0
            L_0x0031:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0031 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p266e.C6130g.C6131a.close():boolean");
        }

        /* renamed from: h */
        public synchronized T mo18122h() {
            C6122c E;
            if (C6130g.this.f16801b) {
                m23095B();
            }
            E = m23098E();
            return E != null ? E.mo18122h() : null;
        }
    }

    private C6130g(List<C6065n<C6122c<T>>> list, boolean z) {
        C6062k.m22835c(!list.isEmpty(), "List of suppliers is empty!");
        this.f16800a = list;
        this.f16801b = z;
    }

    /* renamed from: c */
    public static <T> C6130g<T> m23092c(List<C6065n<C6122c<T>>> list, boolean z) {
        return new C6130g<>(list, z);
    }

    /* renamed from: d */
    public C6122c<T> get() {
        return new C6131a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6130g)) {
            return false;
        }
        return C6058j.m22825a(this.f16800a, ((C6130g) obj).f16800a);
    }

    public int hashCode() {
        return this.f16800a.hashCode();
    }

    public String toString() {
        return C6058j.m22827c(this).mo18044b("list", this.f16800a).toString();
    }
}
