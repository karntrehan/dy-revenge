package p174e.p319f.p393c.p394a.p404z.p405a;

import java.util.Iterator;
import java.util.Map;
import p174e.p319f.p393c.p394a.p404z.p405a.C9452e0;
import p174e.p319f.p393c.p394a.p404z.p405a.C9555u1;
import p174e.p319f.p393c.p394a.p404z.p405a.C9563v;

/* renamed from: e.f.c.a.z.a.w0 */
final class C9572w0<T> implements C9467h1<T> {

    /* renamed from: a */
    private final C9537s0 f25635a;

    /* renamed from: b */
    private final C9522o1<?, ?> f25636b;

    /* renamed from: c */
    private final boolean f25637c;

    /* renamed from: d */
    private final C9530r<?> f25638d;

    private C9572w0(C9522o1<?, ?> o1Var, C9530r<?> rVar, C9537s0 s0Var) {
        this.f25636b = o1Var;
        this.f25637c = rVar.mo23951e(s0Var);
        this.f25638d = rVar;
        this.f25635a = s0Var;
    }

    /* renamed from: k */
    private <UT, UB> int m32595k(C9522o1<UT, UB> o1Var, T t) {
        return o1Var.mo23906i(o1Var.mo23904g(t));
    }

    /* renamed from: l */
    private <UT, UB, ET extends C9563v.C9565b<ET>> void m32596l(C9522o1<UT, UB> o1Var, C9530r<ET> rVar, T t, C9464g1 g1Var, C9526q qVar) {
        UB f = o1Var.mo23903f(t);
        C9563v<ET> d = rVar.mo23950d(t);
        do {
            try {
                if (g1Var.mo23543B() == Integer.MAX_VALUE) {
                    o1Var.mo23912o(t, f);
                    return;
                }
            } finally {
                o1Var.mo23912o(t, f);
            }
        } while (m32598n(g1Var, qVar, rVar, d, o1Var, f));
    }

    /* renamed from: m */
    static <T> C9572w0<T> m32597m(C9522o1<?, ?> o1Var, C9530r<?> rVar, C9537s0 s0Var) {
        return new C9572w0<>(o1Var, rVar, s0Var);
    }

    /* renamed from: n */
    private <UT, UB, ET extends C9563v.C9565b<ET>> boolean m32598n(C9464g1 g1Var, C9526q qVar, C9530r<ET> rVar, C9563v<ET> vVar, C9522o1<UT, UB> o1Var, UB ub) {
        int t = g1Var.mo23582t();
        if (t == C9555u1.f25504a) {
            int i = 0;
            Object obj = null;
            C9468i iVar = null;
            while (g1Var.mo23543B() != Integer.MAX_VALUE) {
                int t2 = g1Var.mo23582t();
                if (t2 == C9555u1.f25506c) {
                    i = g1Var.mo23572l();
                    obj = rVar.mo23948b(qVar, this.f25635a, i);
                } else if (t2 == C9555u1.f25507d) {
                    if (obj != null) {
                        rVar.mo23954h(g1Var, obj, qVar, vVar);
                    } else {
                        iVar = g1Var.mo23546E();
                    }
                } else if (!g1Var.mo23549H()) {
                    break;
                }
            }
            if (g1Var.mo23582t() == C9555u1.f25505b) {
                if (iVar != null) {
                    if (obj != null) {
                        rVar.mo23955i(iVar, obj, qVar, vVar);
                    } else {
                        o1Var.mo23901d(ub, i, iVar);
                    }
                }
                return true;
            }
            throw C9443c0.m31441a();
        } else if (C9555u1.m32444b(t) != 2) {
            return g1Var.mo23549H();
        } else {
            Object b = rVar.mo23948b(qVar, this.f25635a, C9555u1.m32443a(t));
            if (b == null) {
                return o1Var.mo23910m(ub, g1Var);
            }
            rVar.mo23954h(g1Var, b, qVar, vVar);
            return true;
        }
    }

    /* renamed from: o */
    private <UT, UB> void m32599o(C9522o1<UT, UB> o1Var, T t, C9567v1 v1Var) {
        o1Var.mo23916s(o1Var.mo23904g(t), v1Var);
    }

    /* renamed from: a */
    public void mo23629a(T t, T t2) {
        C9489j1.m31815G(this.f25636b, t, t2);
        if (this.f25637c) {
            C9489j1.m31813E(this.f25638d, t, t2);
        }
    }

    /* renamed from: b */
    public void mo23630b(T t) {
        this.f25636b.mo23907j(t);
        this.f25638d.mo23952f(t);
    }

    /* renamed from: c */
    public final boolean mo23631c(T t) {
        return this.f25638d.mo23949c(t).mo24023o();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: e.f.c.a.z.a.z$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23632d(T r11, byte[] r12, int r13, int r14, p174e.p319f.p393c.p394a.p404z.p405a.C9449e.C9451b r15) {
        /*
            r10 = this;
            r0 = r11
            e.f.c.a.z.a.z r0 = (p174e.p319f.p393c.p394a.p404z.p405a.C9577z) r0
            e.f.c.a.z.a.p1 r1 = r0.unknownFields
            e.f.c.a.z.a.p1 r2 = p174e.p319f.p393c.p394a.p404z.p405a.C9525p1.m32204e()
            if (r1 != r2) goto L_0x0011
            e.f.c.a.z.a.p1 r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9525p1.m32208l()
            r0.unknownFields = r1
        L_0x0011:
            e.f.c.a.z.a.z$c r11 = (p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9580c) r11
            e.f.c.a.z.a.v r11 = r11.mo24073M()
            r0 = 0
            r2 = r0
        L_0x0019:
            if (r13 >= r14) goto L_0x00d7
            int r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31468I(r12, r13, r15)
            int r13 = r15.f25335a
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9555u1.f25504a
            r5 = 2
            if (r13 == r3) goto L_0x006b
            int r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9555u1.m32444b(r13)
            if (r3 != r5) goto L_0x0066
            e.f.c.a.z.a.r<?> r2 = r10.f25638d
            e.f.c.a.z.a.q r3 = r15.f25338d
            e.f.c.a.z.a.s0 r5 = r10.f25635a
            int r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9555u1.m32443a(r13)
            java.lang.Object r2 = r2.mo23948b(r3, r5, r6)
            r8 = r2
            e.f.c.a.z.a.z$e r8 = (p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9582e) r8
            if (r8 == 0) goto L_0x005b
            e.f.c.a.z.a.d1 r13 = p174e.p319f.p393c.p394a.p404z.p405a.C9448d1.m31455a()
            e.f.c.a.z.a.s0 r2 = r8.mo24078b()
            java.lang.Class r2 = r2.getClass()
            e.f.c.a.z.a.h1 r13 = r13.mo23522d(r2)
            int r13 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31489p(r13, r12, r4, r14, r15)
            e.f.c.a.z.a.z$d r2 = r8.f25653b
            java.lang.Object r3 = r15.f25337c
            r11.mo24027w(r2, r3)
            goto L_0x0064
        L_0x005b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31466G(r2, r3, r4, r5, r6, r7)
        L_0x0064:
            r2 = r8
            goto L_0x0019
        L_0x0066:
            int r13 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31473N(r13, r12, r4, r14, r15)
            goto L_0x0019
        L_0x006b:
            r13 = 0
            r3 = r0
        L_0x006d:
            if (r4 >= r14) goto L_0x00cb
            int r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31468I(r12, r4, r15)
            int r6 = r15.f25335a
            int r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9555u1.m32443a(r6)
            int r8 = p174e.p319f.p393c.p394a.p404z.p405a.C9555u1.m32444b(r6)
            if (r7 == r5) goto L_0x00ac
            r9 = 3
            if (r7 == r9) goto L_0x0083
            goto L_0x00c1
        L_0x0083:
            if (r2 == 0) goto L_0x00a1
            e.f.c.a.z.a.d1 r6 = p174e.p319f.p393c.p394a.p404z.p405a.C9448d1.m31455a()
            e.f.c.a.z.a.s0 r7 = r2.mo24078b()
            java.lang.Class r7 = r7.getClass()
            e.f.c.a.z.a.h1 r6 = r6.mo23522d(r7)
            int r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31489p(r6, r12, r4, r14, r15)
            e.f.c.a.z.a.z$d r6 = r2.f25653b
            java.lang.Object r7 = r15.f25337c
            r11.mo24027w(r6, r7)
            goto L_0x006d
        L_0x00a1:
            if (r8 != r5) goto L_0x00c1
            int r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31475b(r12, r4, r15)
            java.lang.Object r3 = r15.f25337c
            e.f.c.a.z.a.i r3 = (p174e.p319f.p393c.p394a.p404z.p405a.C9468i) r3
            goto L_0x006d
        L_0x00ac:
            if (r8 != 0) goto L_0x00c1
            int r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31468I(r12, r4, r15)
            int r13 = r15.f25335a
            e.f.c.a.z.a.r<?> r2 = r10.f25638d
            e.f.c.a.z.a.q r6 = r15.f25338d
            e.f.c.a.z.a.s0 r7 = r10.f25635a
            java.lang.Object r2 = r2.mo23948b(r6, r7, r13)
            e.f.c.a.z.a.z$e r2 = (p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9582e) r2
            goto L_0x006d
        L_0x00c1:
            int r7 = p174e.p319f.p393c.p394a.p404z.p405a.C9555u1.f25505b
            if (r6 != r7) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            int r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9449e.m31473N(r6, r12, r4, r14, r15)
            goto L_0x006d
        L_0x00cb:
            if (r3 == 0) goto L_0x00d4
            int r13 = p174e.p319f.p393c.p394a.p404z.p405a.C9555u1.m32445c(r13, r5)
            r1.mo23925n(r13, r3)
        L_0x00d4:
            r13 = r4
            goto L_0x0019
        L_0x00d7:
            if (r13 != r14) goto L_0x00da
            return
        L_0x00da:
            e.f.c.a.z.a.c0 r11 = p174e.p319f.p393c.p394a.p404z.p405a.C9443c0.m31447g()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9572w0.mo23632d(java.lang.Object, byte[], int, int, e.f.c.a.z.a.e$b):void");
    }

    /* renamed from: e */
    public void mo23633e(T t, C9567v1 v1Var) {
        Iterator<Map.Entry<?, Object>> r = this.f25638d.mo23949c(t).mo24024r();
        while (r.hasNext()) {
            Map.Entry next = r.next();
            C9563v.C9565b bVar = (C9563v.C9565b) next.getKey();
            if (bVar.mo24028I() != C9555u1.C9562c.MESSAGE || bVar.mo24031f() || bVar.mo24029J()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            v1Var.mo23837c(bVar.mo24030d(), next instanceof C9452e0.C9454b ? ((C9452e0.C9454b) next).mo23528a().mo23593e() : next.getValue());
        }
        m32599o(this.f25636b, t, v1Var);
    }

    /* renamed from: f */
    public void mo23634f(T t, C9464g1 g1Var, C9526q qVar) {
        m32596l(this.f25636b, this.f25638d, t, g1Var, qVar);
    }

    /* renamed from: g */
    public boolean mo23635g(T t, T t2) {
        if (!this.f25636b.mo23904g(t).equals(this.f25636b.mo23904g(t2))) {
            return false;
        }
        if (this.f25637c) {
            return this.f25638d.mo23949c(t).equals(this.f25638d.mo23949c(t2));
        }
        return true;
    }

    /* renamed from: h */
    public int mo23636h(T t) {
        int k = m32595k(this.f25636b, t) + 0;
        return this.f25637c ? k + this.f25638d.mo23949c(t).mo24019j() : k;
    }

    /* renamed from: i */
    public T mo23637i() {
        return this.f25635a.mo23982j().mo23984X();
    }

    /* renamed from: j */
    public int mo23638j(T t) {
        int hashCode = this.f25636b.mo23904g(t).hashCode();
        return this.f25637c ? (hashCode * 53) + this.f25638d.mo23949c(t).hashCode() : hashCode;
    }
}
