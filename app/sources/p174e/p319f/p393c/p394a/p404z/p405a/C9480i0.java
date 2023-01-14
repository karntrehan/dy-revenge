package p174e.p319f.p393c.p394a.p404z.p405a;

import java.util.Collections;
import java.util.List;
import p174e.p319f.p393c.p394a.p404z.p405a.C9431b0;

/* renamed from: e.f.c.a.z.a.i0 */
abstract class C9480i0 {

    /* renamed from: a */
    private static final C9480i0 f25379a = new C9482b();

    /* renamed from: b */
    private static final C9480i0 f25380b = new C9483c();

    /* renamed from: e.f.c.a.z.a.i0$b */
    private static final class C9482b extends C9480i0 {

        /* renamed from: c */
        private static final Class<?> f25381c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private C9482b() {
            super();
        }

        /* renamed from: f */
        static <E> List<E> m31720f(Object obj, long j) {
            return (List) C9539s1.m32300A(obj, j);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: e.f.c.a.z.a.g0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: e.f.c.a.z.a.g0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: e.f.c.a.z.a.g0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static <L> java.util.List<L> m31721g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = m31720f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof p174e.p319f.p393c.p394a.p404z.p405a.C9466h0
                if (r1 == 0) goto L_0x0014
                e.f.c.a.z.a.g0 r0 = new e.f.c.a.z.a.g0
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof p174e.p319f.p393c.p394a.p404z.p405a.C9441b1
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.C9440i
                if (r1 == 0) goto L_0x0024
                e.f.c.a.z.a.b0$i r0 = (p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.C9440i) r0
                e.f.c.a.z.a.b0$i r6 = r0.mo23497n(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r3, r4, r0)
                goto L_0x007a
            L_0x002d:
                java.lang.Class<?> r1 = f25381c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
            L_0x0046:
                p174e.p319f.p393c.p394a.p404z.p405a.C9539s1.m32314O(r3, r4, r1)
                r0 = r1
                goto L_0x007a
            L_0x004b:
                boolean r1 = r0 instanceof p174e.p319f.p393c.p394a.p404z.p405a.C9532r1
                if (r1 == 0) goto L_0x005f
                e.f.c.a.z.a.g0 r1 = new e.f.c.a.z.a.g0
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                e.f.c.a.z.a.r1 r0 = (p174e.p319f.p393c.p394a.p404z.p405a.C9532r1) r0
                r1.addAll(r0)
                goto L_0x0046
            L_0x005f:
                boolean r1 = r0 instanceof p174e.p319f.p393c.p394a.p404z.p405a.C9441b1
                if (r1 == 0) goto L_0x007a
                boolean r1 = r0 instanceof p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.C9440i
                if (r1 == 0) goto L_0x007a
                r1 = r0
                e.f.c.a.z.a.b0$i r1 = (p174e.p319f.p393c.p394a.p404z.p405a.C9431b0.C9440i) r1
                boolean r2 = r1.mo23512y()
                if (r2 != 0) goto L_0x007a
                int r0 = r0.size()
                int r0 = r0 + r6
                e.f.c.a.z.a.b0$i r0 = r1.mo23497n(r0)
                goto L_0x0029
            L_0x007a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9480i0.C9482b.m31721g(java.lang.Object, long, int):java.util.List");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo23670c(Object obj, long j) {
            Object obj2;
            List list = (List) C9539s1.m32300A(obj, j);
            if (list instanceof C9466h0) {
                obj2 = ((C9466h0) list).mo23626u();
            } else if (!f25381c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof C9441b1) || !(list instanceof C9431b0.C9440i)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C9431b0.C9440i iVar = (C9431b0.C9440i) list;
                    if (iVar.mo23512y()) {
                        iVar.mo23511l();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            C9539s1.m32314O(obj, j, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <E> void mo23671d(Object obj, Object obj2, long j) {
            List f = m31720f(obj2, j);
            List g = m31721g(obj, j, f.size());
            int size = g.size();
            int size2 = f.size();
            if (size > 0 && size2 > 0) {
                g.addAll(f);
            }
            if (size > 0) {
                f = g;
            }
            C9539s1.m32314O(obj, j, f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public <L> List<L> mo23672e(Object obj, long j) {
            return m31721g(obj, j, 10);
        }
    }

    /* renamed from: e.f.c.a.z.a.i0$c */
    private static final class C9483c extends C9480i0 {
        private C9483c() {
            super();
        }

        /* renamed from: f */
        static <E> C9431b0.C9440i<E> m31725f(Object obj, long j) {
            return (C9431b0.C9440i) C9539s1.m32300A(obj, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo23670c(Object obj, long j) {
            m31725f(obj, j).mo23511l();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <E> void mo23671d(Object obj, Object obj2, long j) {
            C9431b0.C9440i f = m31725f(obj, j);
            C9431b0.C9440i f2 = m31725f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                if (!f.mo23512y()) {
                    f = f.mo23497n(size2 + size);
                }
                f.addAll(f2);
            }
            if (size > 0) {
                f2 = f;
            }
            C9539s1.m32314O(obj, j, f2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public <L> List<L> mo23672e(Object obj, long j) {
            C9431b0.C9440i f = m31725f(obj, j);
            if (f.mo23512y()) {
                return f;
            }
            int size = f.size();
            C9431b0.C9440i n = f.mo23497n(size == 0 ? 10 : size * 2);
            C9539s1.m32314O(obj, j, n);
            return n;
        }
    }

    private C9480i0() {
    }

    /* renamed from: a */
    static C9480i0 m31715a() {
        return f25379a;
    }

    /* renamed from: b */
    static C9480i0 m31716b() {
        return f25380b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo23670c(Object obj, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract <L> void mo23671d(Object obj, Object obj2, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract <L> List<L> mo23672e(Object obj, long j);
}
