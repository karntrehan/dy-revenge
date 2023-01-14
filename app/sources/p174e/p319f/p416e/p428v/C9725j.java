package p174e.p319f.p416e.p428v;

import java.util.Collection;
import java.util.Map;
import p174e.p319f.p416e.C9655a;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9667m;
import p174e.p319f.p416e.C9668n;
import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.j */
public final class C9725j extends C9726k {

    /* renamed from: a */
    private final C9731p[] f26059a;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9725j(java.util.Map<p174e.p319f.p416e.C9659e, ?> r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L_0x0007
            r3 = 0
            goto L_0x000f
        L_0x0007:
            e.f.e.e r0 = p174e.p319f.p416e.C9659e.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        L_0x000f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L_0x0055
            e.f.e.a r1 = p174e.p319f.p416e.C9655a.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0027
            e.f.e.v.e r1 = new e.f.e.v.e
            r1.<init>()
        L_0x0023:
            r0.add(r1)
            goto L_0x0035
        L_0x0027:
            e.f.e.a r1 = p174e.p319f.p416e.C9655a.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0035
            e.f.e.v.l r1 = new e.f.e.v.l
            r1.<init>()
            goto L_0x0023
        L_0x0035:
            e.f.e.a r1 = p174e.p319f.p416e.C9655a.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0045
            e.f.e.v.f r1 = new e.f.e.v.f
            r1.<init>()
            r0.add(r1)
        L_0x0045:
            e.f.e.a r1 = p174e.p319f.p416e.C9655a.UPC_E
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x0055
            e.f.e.v.q r3 = new e.f.e.v.q
            r3.<init>()
            r0.add(r3)
        L_0x0055:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0073
            e.f.e.v.e r3 = new e.f.e.v.e
            r3.<init>()
            r0.add(r3)
            e.f.e.v.f r3 = new e.f.e.v.f
            r3.<init>()
            r0.add(r3)
            e.f.e.v.q r3 = new e.f.e.v.q
            r3.<init>()
            r0.add(r3)
        L_0x0073:
            int r3 = r0.size()
            e.f.e.v.p[] r3 = new p174e.p319f.p416e.p428v.C9731p[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            e.f.e.v.p[] r3 = (p174e.p319f.p416e.p428v.C9731p[]) r3
            r2.f26059a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p416e.p428v.C9725j.<init>(java.util.Map):void");
    }

    /* renamed from: a */
    public void mo24216a() {
        for (C9731p a : this.f26059a) {
            a.mo24216a();
        }
    }

    /* renamed from: c */
    public C9668n mo24349c(int i, C9679a aVar, Map<C9659e, ?> map) {
        boolean z;
        int[] p = C9731p.m33147p(aVar);
        C9731p[] pVarArr = this.f26059a;
        int i2 = 0;
        while (i2 < pVarArr.length) {
            try {
                C9668n m = pVarArr[i2].mo24353m(i, aVar, p, map);
                boolean z2 = m.mo24222b() == C9655a.EAN_13 && m.mo24226f().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(C9659e.POSSIBLE_FORMATS);
                if (collection != null) {
                    if (!collection.contains(C9655a.UPC_A)) {
                        z = false;
                        if (z2 || !z) {
                            return m;
                        }
                        C9668n nVar = new C9668n(m.mo24226f().substring(1), m.mo24223c(), m.mo24225e(), C9655a.UPC_A);
                        nVar.mo24227g(m.mo24224d());
                        return nVar;
                    }
                }
                z = true;
                if (z2) {
                }
                return m;
            } catch (C9667m unused) {
                i2++;
            }
        }
        throw C9664j.m32854a();
    }
}
