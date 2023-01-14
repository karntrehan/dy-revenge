package p174e.p319f.p320a.p335c.p345f.p356k;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.k.e0 */
final class C7822e0<K, V> extends AbstractMap<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Object f21327f = new Object();
    /* access modifiers changed from: private */
    @NullableDecl

    /* renamed from: o */
    public transient Object f21328o;
    @NullableDecl

    /* renamed from: p */
    transient int[] f21329p;
    @NullableDecl

    /* renamed from: q */
    transient Object[] f21330q;
    @NullableDecl

    /* renamed from: r */
    transient Object[] f21331r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public transient int f21332s;

    /* renamed from: t */
    private transient int f21333t;
    @NullableDecl

    /* renamed from: u */
    private transient Set<K> f21334u;
    @NullableDecl

    /* renamed from: v */
    private transient Set<Map.Entry<K, V>> f21335v;
    @NullableDecl

    /* renamed from: w */
    private transient Collection<V> f21336w;

    C7822e0(int i) {
        mo21297l(12);
    }

    /* renamed from: d */
    static /* synthetic */ int m27936d(C7822e0 e0Var) {
        int i = e0Var.f21333t;
        e0Var.f21333t = i - 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final int m27940o() {
        return (1 << (this.f21332s & 31)) - 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final int m27941p(@NullableDecl Object obj) {
        if (mo21299n()) {
            return -1;
        }
        int a = C7848g0.m27999a(obj);
        int o = m27940o();
        int c = C7835f0.m27987c(this.f21328o, a & o);
        if (c != 0) {
            int i = ~o;
            int i2 = a & i;
            do {
                int i3 = c - 1;
                int i4 = this.f21329p[i3];
                if ((i4 & i) == i2 && C8080xb.m28291a(obj, this.f21330q[i3])) {
                    return i3;
                }
                c = i4 & o;
            } while (c != 0);
        }
        return -1;
    }

    /* renamed from: q */
    private final int m27942q(int i, int i2, int i3, int i4) {
        Object d = C7835f0.m27988d(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C7835f0.m27989e(d, i3 & i5, i4 + 1);
        }
        Object obj = this.f21328o;
        int[] iArr = this.f21329p;
        for (int i6 = 0; i6 <= i; i6++) {
            int c = C7835f0.m27987c(obj, i6);
            while (c != 0) {
                int i7 = c - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int c2 = C7835f0.m27987c(d, i10);
                C7835f0.m27989e(d, i10, c);
                iArr[i7] = ((~i5) & i9) | (c2 & i5);
                c = i8 & i;
            }
        }
        this.f21328o = d;
        m27944s(i5);
        return i5;
    }

    /* access modifiers changed from: private */
    @NullableDecl
    /* renamed from: r */
    public final Object m27943r(@NullableDecl Object obj) {
        if (mo21299n()) {
            return f21327f;
        }
        int o = m27940o();
        int b = C7835f0.m27986b(obj, (Object) null, o, this.f21328o, this.f21329p, this.f21330q, (Object[]) null);
        if (b == -1) {
            return f21327f;
        }
        Object obj2 = this.f21331r[b];
        mo21298m(b, o);
        this.f21333t--;
        mo21295k();
        return obj2;
    }

    /* renamed from: s */
    private final void m27944s(int i) {
        this.f21332s = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f21332s & -32);
    }

    public final void clear() {
        if (!mo21299n()) {
            mo21295k();
            Map j = mo21294j();
            if (j != null) {
                this.f21332s = C7849g1.m28000a(size(), 3, 1073741823);
                j.clear();
                this.f21328o = null;
            } else {
                Arrays.fill(this.f21330q, 0, this.f21333t, (Object) null);
                Arrays.fill(this.f21331r, 0, this.f21333t, (Object) null);
                Object obj = this.f21328o;
                if (obj instanceof byte[]) {
                    Arrays.fill((byte[]) obj, (byte) 0);
                } else if (obj instanceof short[]) {
                    Arrays.fill((short[]) obj, 0);
                } else {
                    Arrays.fill((int[]) obj, 0);
                }
                Arrays.fill(this.f21329p, 0, this.f21333t, 0);
            }
            this.f21333t = 0;
        }
    }

    public final boolean containsKey(@NullableDecl Object obj) {
        Map j = mo21294j();
        return j != null ? j.containsKey(obj) : m27941p(obj) != -1;
    }

    public final boolean containsValue(@NullableDecl Object obj) {
        Map j = mo21294j();
        if (j != null) {
            return j.containsValue(obj);
        }
        for (int i = 0; i < this.f21333t; i++) {
            if (C8080xb.m28291a(obj, this.f21331r[i])) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo21289e() {
        return isEmpty() ? -1 : 0;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f21335v;
        if (set != null) {
            return set;
        }
        C8081y yVar = new C8081y(this);
        this.f21335v = yVar;
        return yVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo21291f(int i) {
        int i2 = i + 1;
        if (i2 < this.f21333t) {
            return i2;
        }
        return -1;
    }

    public final V get(@NullableDecl Object obj) {
        Map j = mo21294j();
        if (j != null) {
            return j.get(obj);
        }
        int p = m27941p(obj);
        if (p == -1) {
            return null;
        }
        return this.f21331r[p];
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    /* renamed from: j */
    public final Map<K, V> mo21294j() {
        Object obj = this.f21328o;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo21295k() {
        this.f21332s += 32;
    }

    public final Set<K> keySet() {
        Set<K> set = this.f21334u;
        if (set != null) {
            return set;
        }
        C7770a0 a0Var = new C7770a0(this);
        this.f21334u = a0Var;
        return a0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo21297l(int i) {
        this.f21332s = C7849g1.m28000a(12, 1, 1073741823);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo21298m(int i, int i2) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f21330q;
            Object obj = objArr[size];
            objArr[i] = obj;
            Object[] objArr2 = this.f21331r;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.f21329p;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int a = C7848g0.m27999a(obj) & i2;
            int c = C7835f0.m27987c(this.f21328o, a);
            int i3 = size + 1;
            if (c != i3) {
                while (true) {
                    int i4 = c - 1;
                    int[] iArr2 = this.f21329p;
                    int i5 = iArr2[i4];
                    int i6 = i5 & i2;
                    if (i6 != i3) {
                        c = i6;
                    } else {
                        iArr2[i4] = ((i + 1) & i2) | ((~i2) & i5);
                        return;
                    }
                }
            } else {
                C7835f0.m27989e(this.f21328o, a, i + 1);
            }
        } else {
            this.f21330q[i] = null;
            this.f21331r[i] = null;
            this.f21329p[i] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo21299n() {
        return this.f21328o == null;
    }

    @NullableDecl
    public final V put(@NullableDecl K k, @NullableDecl V v) {
        int min;
        K k2 = k;
        V v2 = v;
        if (mo21299n()) {
            C7795c.m27871d(mo21299n(), "Arrays already allocated");
            int i = this.f21332s;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) ((double) highestOneBit)) && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f21328o = C7835f0.m27988d(max2);
            m27944s(max2 - 1);
            this.f21329p = new int[i];
            this.f21330q = new Object[i];
            this.f21331r = new Object[i];
        }
        Map j = mo21294j();
        if (j != null) {
            return j.put(k2, v2);
        }
        int[] iArr = this.f21329p;
        Object[] objArr = this.f21330q;
        V[] vArr = this.f21331r;
        int i2 = this.f21333t;
        int i3 = i2 + 1;
        int a = C7848g0.m27999a(k);
        int o = m27940o();
        int i4 = a & o;
        int c = C7835f0.m27987c(this.f21328o, i4);
        if (c != 0) {
            int i5 = ~o;
            int i6 = a & i5;
            int i7 = 0;
            while (true) {
                int i8 = c - 1;
                int i9 = iArr[i8];
                int i10 = i9 & i5;
                if (i10 != i6 || !C8080xb.m28291a(k2, objArr[i8])) {
                    int i11 = i9 & o;
                    i7++;
                    if (i11 != 0) {
                        c = i11;
                    } else if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(m27940o() + 1, 1.0f);
                        for (int e = mo21289e(); e >= 0; e = mo21291f(e)) {
                            linkedHashMap.put(this.f21330q[e], this.f21331r[e]);
                        }
                        this.f21328o = linkedHashMap;
                        this.f21329p = null;
                        this.f21330q = null;
                        this.f21331r = null;
                        mo21295k();
                        return linkedHashMap.put(k2, v2);
                    } else if (i3 <= o) {
                        iArr[i8] = (i3 & o) | i10;
                    }
                } else {
                    V v3 = vArr[i8];
                    vArr[i8] = v2;
                    return v3;
                }
            }
            int length = this.f21329p.length;
            this.f21329p = Arrays.copyOf(this.f21329p, min);
            this.f21330q = Arrays.copyOf(this.f21330q, min);
            this.f21331r = Arrays.copyOf(this.f21331r, min);
            this.f21329p[i2] = (~o) & a;
            this.f21330q[i2] = k2;
            this.f21331r[i2] = v2;
            this.f21333t = i3;
            mo21295k();
            return null;
        } else if (i3 <= o) {
            C7835f0.m27989e(this.f21328o, i4, i3);
            int length2 = this.f21329p.length;
            if (i3 > length2 && (min = Math.min(1073741823, (Math.max(1, length2 >>> 1) + length2) | 1)) != length2) {
                this.f21329p = Arrays.copyOf(this.f21329p, min);
                this.f21330q = Arrays.copyOf(this.f21330q, min);
                this.f21331r = Arrays.copyOf(this.f21331r, min);
            }
            this.f21329p[i2] = (~o) & a;
            this.f21330q[i2] = k2;
            this.f21331r[i2] = v2;
            this.f21333t = i3;
            mo21295k();
            return null;
        }
        o = m27942q(o, C7835f0.m27985a(o), a, i2);
        int length22 = this.f21329p.length;
        this.f21329p = Arrays.copyOf(this.f21329p, min);
        this.f21330q = Arrays.copyOf(this.f21330q, min);
        this.f21331r = Arrays.copyOf(this.f21331r, min);
        this.f21329p[i2] = (~o) & a;
        this.f21330q[i2] = k2;
        this.f21331r[i2] = v2;
        this.f21333t = i3;
        mo21295k();
        return null;
    }

    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        Map j = mo21294j();
        if (j != null) {
            return j.remove(obj);
        }
        V r = m27943r(obj);
        if (r == f21327f) {
            return null;
        }
        return r;
    }

    public final int size() {
        Map j = mo21294j();
        return j != null ? j.size() : this.f21333t;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f21336w;
        if (collection != null) {
            return collection;
        }
        C7809d0 d0Var = new C7809d0(this);
        this.f21336w = d0Var;
        return d0Var;
    }
}
