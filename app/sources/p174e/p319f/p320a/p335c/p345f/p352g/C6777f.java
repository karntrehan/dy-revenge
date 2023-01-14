package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.f */
public final class C6777f implements Iterable, C6954q, C6890m {

    /* renamed from: f */
    final SortedMap f18474f;

    /* renamed from: o */
    final Map f18475o;

    public C6777f() {
        this.f18474f = new TreeMap();
        this.f18475o = new TreeMap();
    }

    public C6777f(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                mo19736H(i, (C6954q) list.get(i));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r1.f18474f.get(java.lang.Integer.valueOf(r2));
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p174e.p319f.p320a.p335c.p345f.p352g.C6954q mo19729A(int r2) {
        /*
            r1 = this;
            int r0 = r1.mo19752z()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.mo19737I(r2)
            if (r0 == 0) goto L_0x001b
            java.util.SortedMap r0 = r1.f18474f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            e.f.a.c.f.g.q r2 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            e.f.a.c.f.g.q r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18804c
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6777f.mo19729A(int):e.f.a.c.f.g.q");
    }

    /* renamed from: B */
    public final String mo19730B(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f18474f.isEmpty()) {
            for (int i = 0; i < mo19752z(); i++) {
                C6954q A = mo19729A(i);
                sb.append(str);
                if (!(A instanceof C7034v) && !(A instanceof C6922o)) {
                    sb.append(A.mo19741g());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    /* renamed from: C */
    public final Iterator mo19731C() {
        return this.f18474f.keySet().iterator();
    }

    /* renamed from: D */
    public final List mo19732D() {
        ArrayList arrayList = new ArrayList(mo19752z());
        for (int i = 0; i < mo19752z(); i++) {
            arrayList.add(mo19729A(i));
        }
        return arrayList;
    }

    /* renamed from: E */
    public final void mo19733E() {
        this.f18474f.clear();
    }

    /* renamed from: F */
    public final void mo19734F(int i, C6954q qVar) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i);
        } else if (i >= mo19752z()) {
            mo19736H(i, qVar);
        } else {
            for (int intValue = ((Integer) this.f18474f.lastKey()).intValue(); intValue >= i; intValue--) {
                SortedMap sortedMap = this.f18474f;
                Integer valueOf = Integer.valueOf(intValue);
                C6954q qVar2 = (C6954q) sortedMap.get(valueOf);
                if (qVar2 != null) {
                    mo19736H(intValue + 1, qVar2);
                    this.f18474f.remove(valueOf);
                }
            }
            mo19736H(i, qVar);
        }
    }

    /* renamed from: G */
    public final void mo19735G(int i) {
        int intValue = ((Integer) this.f18474f.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            this.f18474f.remove(Integer.valueOf(i));
            if (i == intValue) {
                SortedMap sortedMap = this.f18474f;
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!sortedMap.containsKey(valueOf) && i2 >= 0) {
                    this.f18474f.put(valueOf, C6954q.f18804c);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) this.f18474f.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.f18474f;
                    Integer valueOf2 = Integer.valueOf(i);
                    C6954q qVar = (C6954q) sortedMap2.get(valueOf2);
                    if (qVar != null) {
                        this.f18474f.put(Integer.valueOf(i - 1), qVar);
                        this.f18474f.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: H */
    public final void mo19736H(int i, C6954q qVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        } else if (qVar == null) {
            this.f18474f.remove(Integer.valueOf(i));
        } else {
            this.f18474f.put(Integer.valueOf(i), qVar);
        }
    }

    /* renamed from: I */
    public final boolean mo19737I(int i) {
        if (i >= 0 && i <= ((Integer) this.f18474f.lastKey()).intValue()) {
            return this.f18474f.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    /* renamed from: b */
    public final C6954q mo19738b() {
        Integer num;
        SortedMap sortedMap;
        C6954q qVar;
        C6777f fVar = new C6777f();
        for (Map.Entry entry : this.f18474f.entrySet()) {
            if (entry.getValue() instanceof C6890m) {
                sortedMap = fVar.f18474f;
                num = (Integer) entry.getKey();
                qVar = (C6954q) entry.getValue();
            } else {
                sortedMap = fVar.f18474f;
                num = (Integer) entry.getKey();
                qVar = ((C6954q) entry.getValue()).mo19738b();
            }
            sortedMap.put(num, qVar);
        }
        return fVar;
    }

    /* renamed from: d */
    public final Double mo19739d() {
        return this.f18474f.size() == 1 ? mo19729A(0).mo19739d() : this.f18474f.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6777f)) {
            return false;
        }
        C6777f fVar = (C6777f) obj;
        if (mo19752z() != fVar.mo19752z()) {
            return false;
        }
        if (this.f18474f.isEmpty()) {
            return fVar.f18474f.isEmpty();
        }
        for (int intValue = ((Integer) this.f18474f.firstKey()).intValue(); intValue <= ((Integer) this.f18474f.lastKey()).intValue(); intValue++) {
            if (!mo19729A(intValue).equals(fVar.mo19729A(intValue))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final String mo19741g() {
        return mo19730B(",");
    }

    /* renamed from: h */
    public final Boolean mo19742h() {
        return Boolean.TRUE;
    }

    public final int hashCode() {
        return this.f18474f.hashCode() * 31;
    }

    public final Iterator iterator() {
        return new C6760e(this);
    }

    /* renamed from: j */
    public final Iterator mo19745j() {
        return new C6743d(this, this.f18474f.keySet().iterator(), this.f18475o.keySet().iterator());
    }

    /* renamed from: k */
    public final boolean mo19746k(String str) {
        return "length".equals(str) || this.f18475o.containsKey(str);
    }

    /* renamed from: o */
    public final void mo19747o(String str, C6954q qVar) {
        if (qVar == null) {
            this.f18475o.remove(str);
        } else {
            this.f18475o.put(str, qVar);
        }
    }

    /* renamed from: p */
    public final C6954q mo19748p(String str, C6991s4 s4Var, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? C6744d0.m25581a(str, this, s4Var, list) : C6858k.m26039a(this, new C7018u(str), s4Var, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r2.f18475o.get(r3);
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p174e.p319f.p320a.p335c.p345f.p352g.C6954q mo19749r(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            e.f.a.c.f.g.i r3 = new e.f.a.c.f.g.i
            int r0 = r2.mo19752z()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.mo19746k(r3)
            if (r0 == 0) goto L_0x0028
            java.util.Map r0 = r2.f18475o
            java.lang.Object r3 = r0.get(r3)
            e.f.a.c.f.g.q r3 = (p174e.p319f.p320a.p335c.p345f.p352g.C6954q) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            e.f.a.c.f.g.q r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6954q.f18804c
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6777f.mo19749r(java.lang.String):e.f.a.c.f.g.q");
    }

    public final String toString() {
        return mo19730B(",");
    }

    /* renamed from: v */
    public final int mo19751v() {
        return this.f18474f.size();
    }

    /* renamed from: z */
    public final int mo19752z() {
        if (this.f18474f.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f18474f.lastKey()).intValue() + 1;
    }
}
