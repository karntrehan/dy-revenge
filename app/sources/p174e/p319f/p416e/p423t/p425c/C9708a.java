package p174e.p319f.p416e.p423t.p425c;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.p420s.C9680b;
import p174e.p319f.p416e.p420s.C9685g;
import p174e.p319f.p416e.p420s.C9687i;
import p174e.p319f.p416e.p420s.p421m.C9691a;
import p174e.p319f.p416e.p420s.p421m.C9692b;

/* renamed from: e.f.e.t.c.a */
public final class C9708a {

    /* renamed from: a */
    private final C9680b f26020a;

    /* renamed from: b */
    private final C9692b f26021b;

    /* renamed from: e.f.e.t.c.a$b */
    private static final class C9710b {

        /* renamed from: a */
        private final C9670p f26022a;

        /* renamed from: b */
        private final C9670p f26023b;

        /* renamed from: c */
        private final int f26024c;

        private C9710b(C9670p pVar, C9670p pVar2, int i) {
            this.f26022a = pVar;
            this.f26023b = pVar2;
            this.f26024c = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C9670p mo24341a() {
            return this.f26022a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C9670p mo24342b() {
            return this.f26023b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo24343c() {
            return this.f26024c;
        }

        public String toString() {
            return this.f26022a + "/" + this.f26023b + '/' + this.f26024c;
        }
    }

    /* renamed from: e.f.e.t.c.a$c */
    private static final class C9711c implements Serializable, Comparator<C9710b> {
        private C9711c() {
        }

        /* renamed from: a */
        public int compare(C9710b bVar, C9710b bVar2) {
            return bVar.mo24343c() - bVar2.mo24343c();
        }
    }

    public C9708a(C9680b bVar) {
        this.f26020a = bVar;
        this.f26021b = new C9692b(bVar);
    }

    /* renamed from: a */
    private C9670p m33051a(C9670p pVar, C9670p pVar2, C9670p pVar3, C9670p pVar4, int i) {
        float f = (float) i;
        float d = ((float) m33053d(pVar, pVar2)) / f;
        float d2 = (float) m33053d(pVar3, pVar4);
        C9670p pVar5 = new C9670p(pVar4.mo24230c() + (((pVar4.mo24230c() - pVar3.mo24230c()) / d2) * d), pVar4.mo24231d() + (d * ((pVar4.mo24231d() - pVar3.mo24231d()) / d2)));
        float d3 = ((float) m33053d(pVar, pVar3)) / f;
        float d4 = (float) m33053d(pVar2, pVar4);
        C9670p pVar6 = new C9670p(pVar4.mo24230c() + (((pVar4.mo24230c() - pVar2.mo24230c()) / d4) * d3), pVar4.mo24231d() + (d3 * ((pVar4.mo24231d() - pVar2.mo24231d()) / d4)));
        if (m33055f(pVar5)) {
            return (m33055f(pVar6) && Math.abs(m33057h(pVar3, pVar5).mo24343c() - m33057h(pVar2, pVar5).mo24343c()) > Math.abs(m33057h(pVar3, pVar6).mo24343c() - m33057h(pVar2, pVar6).mo24343c())) ? pVar6 : pVar5;
        }
        if (m33055f(pVar6)) {
            return pVar6;
        }
        return null;
    }

    /* renamed from: b */
    private C9670p m33052b(C9670p pVar, C9670p pVar2, C9670p pVar3, C9670p pVar4, int i, int i2) {
        float d = ((float) m33053d(pVar, pVar2)) / ((float) i);
        float d2 = (float) m33053d(pVar3, pVar4);
        C9670p pVar5 = new C9670p(pVar4.mo24230c() + (((pVar4.mo24230c() - pVar3.mo24230c()) / d2) * d), pVar4.mo24231d() + (d * ((pVar4.mo24231d() - pVar3.mo24231d()) / d2)));
        float d3 = ((float) m33053d(pVar, pVar3)) / ((float) i2);
        float d4 = (float) m33053d(pVar2, pVar4);
        C9670p pVar6 = new C9670p(pVar4.mo24230c() + (((pVar4.mo24230c() - pVar2.mo24230c()) / d4) * d3), pVar4.mo24231d() + (d3 * ((pVar4.mo24231d() - pVar2.mo24231d()) / d4)));
        if (m33055f(pVar5)) {
            return (m33055f(pVar6) && Math.abs(i - m33057h(pVar3, pVar5).mo24343c()) + Math.abs(i2 - m33057h(pVar2, pVar5).mo24343c()) > Math.abs(i - m33057h(pVar3, pVar6).mo24343c()) + Math.abs(i2 - m33057h(pVar2, pVar6).mo24343c())) ? pVar6 : pVar5;
        }
        if (m33055f(pVar6)) {
            return pVar6;
        }
        return null;
    }

    /* renamed from: d */
    private static int m33053d(C9670p pVar, C9670p pVar2) {
        return C9691a.m32982c(C9670p.m32869b(pVar, pVar2));
    }

    /* renamed from: e */
    private static void m33054e(Map<C9670p, Integer> map, C9670p pVar) {
        Integer num = map.get(pVar);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(pVar, Integer.valueOf(i));
    }

    /* renamed from: f */
    private boolean m33055f(C9670p pVar) {
        return pVar.mo24230c() >= 0.0f && pVar.mo24230c() < ((float) this.f26020a.mo24271m()) && pVar.mo24231d() > 0.0f && pVar.mo24231d() < ((float) this.f26020a.mo24268j());
    }

    /* renamed from: g */
    private static C9680b m33056g(C9680b bVar, C9670p pVar, C9670p pVar2, C9670p pVar3, C9670p pVar4, int i, int i2) {
        float f = ((float) i) - 0.5f;
        float f2 = ((float) i2) - 0.5f;
        return C9687i.m32964b().mo24295c(bVar, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, pVar.mo24230c(), pVar.mo24231d(), pVar4.mo24230c(), pVar4.mo24231d(), pVar3.mo24230c(), pVar3.mo24231d(), pVar2.mo24230c(), pVar2.mo24231d());
    }

    /* renamed from: h */
    private C9710b m33057h(C9670p pVar, C9670p pVar2) {
        int c = (int) pVar.mo24230c();
        int d = (int) pVar.mo24231d();
        int c2 = (int) pVar2.mo24230c();
        int d2 = (int) pVar2.mo24231d();
        int i = 0;
        int i2 = 1;
        boolean z = Math.abs(d2 - d) > Math.abs(c2 - c);
        if (z) {
            int i3 = d;
            d = c;
            c = i3;
            int i4 = d2;
            d2 = c2;
            c2 = i4;
        }
        int abs = Math.abs(c2 - c);
        int abs2 = Math.abs(d2 - d);
        int i5 = (-abs) / 2;
        int i6 = d < d2 ? 1 : -1;
        if (c >= c2) {
            i2 = -1;
        }
        boolean f = this.f26020a.mo24264f(z ? d : c, z ? c : d);
        while (c != c2) {
            boolean f2 = this.f26020a.mo24264f(z ? d : c, z ? c : d);
            if (f2 != f) {
                i++;
                f = f2;
            }
            i5 += abs2;
            if (i5 > 0) {
                if (d == d2) {
                    break;
                }
                d += i6;
                i5 -= abs;
            }
            c += i2;
        }
        return new C9710b(pVar, pVar2, i);
    }

    /* renamed from: c */
    public C9685g mo24340c() {
        C9670p pVar;
        C9680b bVar;
        C9670p[] c = this.f26021b.mo24302c();
        C9670p pVar2 = c[0];
        C9670p pVar3 = c[1];
        C9670p pVar4 = c[2];
        C9670p pVar5 = c[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(m33057h(pVar2, pVar3));
        arrayList.add(m33057h(pVar2, pVar4));
        arrayList.add(m33057h(pVar3, pVar5));
        arrayList.add(m33057h(pVar4, pVar5));
        C9670p pVar6 = null;
        Collections.sort(arrayList, new C9711c());
        C9710b bVar2 = (C9710b) arrayList.get(0);
        C9710b bVar3 = (C9710b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        m33054e(hashMap, bVar2.mo24341a());
        m33054e(hashMap, bVar2.mo24342b());
        m33054e(hashMap, bVar3.mo24341a());
        m33054e(hashMap, bVar3.mo24342b());
        C9670p pVar7 = null;
        C9670p pVar8 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            C9670p pVar9 = (C9670p) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                pVar7 = pVar9;
            } else if (pVar6 == null) {
                pVar6 = pVar9;
            } else {
                pVar8 = pVar9;
            }
        }
        if (pVar6 == null || pVar7 == null || pVar8 == null) {
            throw C9664j.m32854a();
        }
        C9670p[] pVarArr = {pVar6, pVar7, pVar8};
        C9670p.m32870e(pVarArr);
        C9670p pVar10 = pVarArr[0];
        C9670p pVar11 = pVarArr[1];
        C9670p pVar12 = pVarArr[2];
        C9670p pVar13 = !hashMap.containsKey(pVar2) ? pVar2 : !hashMap.containsKey(pVar3) ? pVar3 : !hashMap.containsKey(pVar4) ? pVar4 : pVar5;
        int c2 = m33057h(pVar12, pVar13).mo24343c();
        int c3 = m33057h(pVar10, pVar13).mo24343c();
        if ((c2 & 1) == 1) {
            c2++;
        }
        int i = c2 + 2;
        if ((c3 & 1) == 1) {
            c3++;
        }
        int i2 = c3 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            pVar = pVar12;
            C9670p b = m33052b(pVar11, pVar10, pVar12, pVar13, i, i2);
            if (b != null) {
                pVar13 = b;
            }
            int c4 = m33057h(pVar, pVar13).mo24343c();
            int c5 = m33057h(pVar10, pVar13).mo24343c();
            if ((c4 & 1) == 1) {
                c4++;
            }
            int i3 = c4;
            if ((c5 & 1) == 1) {
                c5++;
            }
            bVar = m33056g(this.f26020a, pVar, pVar11, pVar10, pVar13, i3, c5);
        } else {
            C9670p a = m33051a(pVar11, pVar10, pVar12, pVar13, Math.min(i2, i));
            if (a != null) {
                pVar13 = a;
            }
            int max = Math.max(m33057h(pVar12, pVar13).mo24343c(), m33057h(pVar10, pVar13).mo24343c()) + 1;
            if ((max & 1) == 1) {
                max++;
            }
            int i4 = max;
            bVar = m33056g(this.f26020a, pVar12, pVar11, pVar10, pVar13, i4, i4);
            pVar = pVar12;
        }
        return new C9685g(bVar, new C9670p[]{pVar, pVar11, pVar10, pVar13});
    }
}
