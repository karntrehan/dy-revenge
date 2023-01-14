package p174e.p247e.p266e;

import java.util.List;
import p174e.p247e.p253d.p255b.C6036a;
import p174e.p247e.p253d.p257d.C6058j;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p257d.C6065n;

/* renamed from: e.e.e.f */
public class C6126f<T> implements C6065n<C6122c<T>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<C6065n<C6122c<T>>> f16794a;

    /* renamed from: e.e.e.f$b */
    private class C6128b extends C6116a<T> {

        /* renamed from: i */
        private int f16795i = 0;

        /* renamed from: j */
        private C6122c<T> f16796j = null;

        /* renamed from: k */
        private C6122c<T> f16797k = null;

        /* renamed from: e.e.e.f$b$a */
        private class C6129a implements C6125e<T> {
            private C6129a() {
            }

            /* renamed from: a */
            public void mo18136a(C6122c<T> cVar) {
            }

            /* renamed from: b */
            public void mo18137b(C6122c<T> cVar) {
                C6128b.this.m23078F(cVar);
            }

            /* renamed from: c */
            public void mo18138c(C6122c<T> cVar) {
                if (cVar.mo18116c()) {
                    C6128b.this.m23079G(cVar);
                } else if (cVar.mo18118d()) {
                    C6128b.this.m23078F(cVar);
                }
            }

            /* renamed from: d */
            public void mo18139d(C6122c<T> cVar) {
                C6128b.this.mo18131t(Math.max(C6128b.this.mo18120f(), cVar.mo18120f()));
            }
        }

        public C6128b() {
            if (!m23081I()) {
                mo18129q(new RuntimeException("No data source supplier or supplier returned null."));
            }
        }

        /* renamed from: A */
        private synchronized boolean m23073A(C6122c<T> cVar) {
            boolean z;
            if (!mo18125l()) {
                if (cVar == this.f16796j) {
                    this.f16796j = null;
                    z = true;
                }
            }
            z = false;
            return z;
        }

        /* renamed from: B */
        private void m23074B(C6122c<T> cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        /* renamed from: C */
        private synchronized C6122c<T> m23075C() {
            return this.f16797k;
        }

        /* renamed from: D */
        private synchronized C6065n<C6122c<T>> m23076D() {
            if (mo18125l() || this.f16795i >= C6126f.this.f16794a.size()) {
                return null;
            }
            List a = C6126f.this.f16794a;
            int i = this.f16795i;
            this.f16795i = i + 1;
            return (C6065n) a.get(i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
            m23074B(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0017, code lost:
            return;
         */
        /* renamed from: E */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m23077E(p174e.p247e.p266e.C6122c<T> r2, boolean r3) {
            /*
                r1 = this;
                monitor-enter(r1)
                e.e.e.c<T> r0 = r1.f16796j     // Catch:{ all -> 0x001a }
                if (r2 != r0) goto L_0x0018
                e.e.e.c<T> r0 = r1.f16797k     // Catch:{ all -> 0x001a }
                if (r2 != r0) goto L_0x000a
                goto L_0x0018
            L_0x000a:
                if (r0 == 0) goto L_0x0011
                if (r3 == 0) goto L_0x000f
                goto L_0x0011
            L_0x000f:
                r0 = 0
                goto L_0x0013
            L_0x0011:
                r1.f16797k = r2     // Catch:{ all -> 0x001a }
            L_0x0013:
                monitor-exit(r1)     // Catch:{ all -> 0x001a }
                r1.m23074B(r0)
                return
            L_0x0018:
                monitor-exit(r1)     // Catch:{ all -> 0x001a }
                return
            L_0x001a:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x001a }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p266e.C6126f.C6128b.m23077E(e.e.e.c, boolean):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: F */
        public void m23078F(C6122c<T> cVar) {
            if (m23073A(cVar)) {
                if (cVar != m23075C()) {
                    m23074B(cVar);
                }
                if (!m23081I()) {
                    mo18130r(cVar.mo18119e(), cVar.mo18115b());
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: G */
        public void m23079G(C6122c<T> cVar) {
            m23077E(cVar, cVar.mo18118d());
            if (cVar == m23075C()) {
                mo18132v(null, cVar.mo18118d(), cVar.mo18115b());
            }
        }

        /* renamed from: H */
        private synchronized boolean m23080H(C6122c<T> cVar) {
            boolean z;
            if (mo18125l()) {
                z = false;
            } else {
                this.f16796j = cVar;
                z = true;
            }
            return z;
        }

        /* renamed from: I */
        private boolean m23081I() {
            C6065n D = m23076D();
            C6122c cVar = D != null ? (C6122c) D.get() : null;
            if (!m23080H(cVar) || cVar == null) {
                m23074B(cVar);
                return false;
            }
            cVar.mo18123i(new C6129a(), C6036a.m22791a());
            return true;
        }

        /* renamed from: c */
        public synchronized boolean mo18116c() {
            C6122c C;
            C = m23075C();
            return C != null && C.mo18116c();
        }

        public boolean close() {
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                C6122c<T> cVar = this.f16796j;
                this.f16796j = null;
                C6122c<T> cVar2 = this.f16797k;
                this.f16797k = null;
                m23074B(cVar2);
                m23074B(cVar);
                return true;
            }
        }

        /* renamed from: h */
        public synchronized T mo18122h() {
            C6122c C;
            C = m23075C();
            return C != null ? C.mo18122h() : null;
        }
    }

    private C6126f(List<C6065n<C6122c<T>>> list) {
        C6062k.m22835c(!list.isEmpty(), "List of suppliers is empty!");
        this.f16794a = list;
    }

    /* renamed from: b */
    public static <T> C6126f<T> m23071b(List<C6065n<C6122c<T>>> list) {
        return new C6126f<>(list);
    }

    /* renamed from: c */
    public C6122c<T> get() {
        return new C6128b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6126f)) {
            return false;
        }
        return C6058j.m22825a(this.f16794a, ((C6126f) obj).f16794a);
    }

    public int hashCode() {
        return this.f16794a.hashCode();
    }

    public String toString() {
        return C6058j.m22827c(this).mo18044b("list", this.f16794a).toString();
    }
}
