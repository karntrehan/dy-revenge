package p174e.p319f.p320a.p335c.p345f.p354i;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.i.t0 */
final class C7427t0<K, V> extends AbstractMap<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Object f19962f = new Object();
    /* access modifiers changed from: private */
    @NullableDecl

    /* renamed from: o */
    public transient Object f19963o;
    @NullableDecl

    /* renamed from: p */
    transient int[] f19964p;
    @NullableDecl

    /* renamed from: q */
    transient Object[] f19965q;
    @NullableDecl

    /* renamed from: r */
    transient Object[] f19966r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public transient int f19967s;

    /* renamed from: t */
    private transient int f19968t;
    @NullableDecl

    /* renamed from: u */
    private transient Set<K> f19969u;
    @NullableDecl

    /* renamed from: v */
    private transient Set<Map.Entry<K, V>> f19970v;
    @NullableDecl

    /* renamed from: w */
    private transient Collection<V> f19971w;

    C7427t0(int i) {
        mo20927l(12);
    }

    /* renamed from: d */
    static /* synthetic */ int m27482d(C7427t0 t0Var) {
        int i = t0Var.f19968t;
        t0Var.f19968t = i - 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final int m27486o() {
        return (1 << (this.f19967s & 31)) - 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final int m27487p(@NullableDecl Object obj) {
        if (mo20929n()) {
            return -1;
        }
        int a = C7455v0.m27524a(obj);
        int o = m27486o();
        int c = C7441u0.m27516c(this.f19963o, a & o);
        if (c != 0) {
            int i = ~o;
            int i2 = a & i;
            do {
                int i3 = c - 1;
                int i4 = this.f19964p[i3];
                if ((i4 & i) == i2 && C7342n.m27360a(obj, this.f19965q[i3])) {
                    return i3;
                }
                c = i4 & o;
            } while (c != 0);
        }
        return -1;
    }

    /* renamed from: q */
    private final int m27488q(int i, int i2, int i3, int i4) {
        Object d = C7441u0.m27517d(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C7441u0.m27518e(d, i3 & i5, i4 + 1);
        }
        Object obj = this.f19963o;
        int[] iArr = this.f19964p;
        for (int i6 = 0; i6 <= i; i6++) {
            int c = C7441u0.m27516c(obj, i6);
            while (c != 0) {
                int i7 = c - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int c2 = C7441u0.m27516c(d, i10);
                C7441u0.m27518e(d, i10, c);
                iArr[i7] = ((~i5) & i9) | (c2 & i5);
                c = i8 & i;
            }
        }
        this.f19963o = d;
        m27490s(i5);
        return i5;
    }

    /* access modifiers changed from: private */
    @NullableDecl
    /* renamed from: r */
    public final Object m27489r(@NullableDecl Object obj) {
        if (mo20929n()) {
            return f19962f;
        }
        int o = m27486o();
        int b = C7441u0.m27515b(obj, (Object) null, o, this.f19963o, this.f19964p, this.f19965q, (Object[]) null);
        if (b == -1) {
            return f19962f;
        }
        Object obj2 = this.f19966r[b];
        mo20928m(b, o);
        this.f19968t--;
        mo20925k();
        return obj2;
    }

    /* renamed from: s */
    private final void m27490s(int i) {
        this.f19967s = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f19967s & -32);
    }

    public final void clear() {
        if (!mo20929n()) {
            mo20925k();
            Map j = mo20924j();
            if (j != null) {
                this.f19967s = C7456v1.m27525a(size(), 3, 1073741823);
                j.clear();
                this.f19963o = null;
            } else {
                Arrays.fill(this.f19965q, 0, this.f19968t, (Object) null);
                Arrays.fill(this.f19966r, 0, this.f19968t, (Object) null);
                Object obj = this.f19963o;
                if (obj instanceof byte[]) {
                    Arrays.fill((byte[]) obj, (byte) 0);
                } else if (obj instanceof short[]) {
                    Arrays.fill((short[]) obj, 0);
                } else {
                    Arrays.fill((int[]) obj, 0);
                }
                Arrays.fill(this.f19964p, 0, this.f19968t, 0);
            }
            this.f19968t = 0;
        }
    }

    public final boolean containsKey(@NullableDecl Object obj) {
        Map j = mo20924j();
        return j != null ? j.containsKey(obj) : m27487p(obj) != -1;
    }

    public final boolean containsValue(@NullableDecl Object obj) {
        Map j = mo20924j();
        if (j != null) {
            return j.containsValue(obj);
        }
        for (int i = 0; i < this.f19968t; i++) {
            if (C7342n.m27360a(obj, this.f19966r[i])) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo20919e() {
        return isEmpty() ? -1 : 0;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f19970v;
        if (set != null) {
            return set;
        }
        C7357o0 o0Var = new C7357o0(this);
        this.f19970v = o0Var;
        return o0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo20921f(int i) {
        int i2 = i + 1;
        if (i2 < this.f19968t) {
            return i2;
        }
        return -1;
    }

    public final V get(@NullableDecl Object obj) {
        Map j = mo20924j();
        if (j != null) {
            return j.get(obj);
        }
        int p = m27487p(obj);
        if (p == -1) {
            return null;
        }
        return this.f19966r[p];
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    /* renamed from: j */
    public final Map<K, V> mo20924j() {
        Object obj = this.f19963o;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo20925k() {
        this.f19967s += 32;
    }

    public final Set<K> keySet() {
        Set<K> set = this.f19969u;
        if (set != null) {
            return set;
        }
        C7385q0 q0Var = new C7385q0(this);
        this.f19969u = q0Var;
        return q0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo20927l(int i) {
        this.f19967s = C7456v1.m27525a(12, 1, 1073741823);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo20928m(int i, int i2) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f19965q;
            Object obj = objArr[size];
            objArr[i] = obj;
            Object[] objArr2 = this.f19966r;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.f19964p;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int a = C7455v0.m27524a(obj) & i2;
            int c = C7441u0.m27516c(this.f19963o, a);
            int i3 = size + 1;
            if (c != i3) {
                while (true) {
                    int i4 = c - 1;
                    int[] iArr2 = this.f19964p;
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
                C7441u0.m27518e(this.f19963o, a, i + 1);
            }
        } else {
            this.f19965q[i] = null;
            this.f19966r[i] = null;
            this.f19964p[i] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo20929n() {
        return this.f19963o == null;
    }

    @NullableDecl
    public final V put(@NullableDecl K k, @NullableDecl V v) {
        int min;
        K k2 = k;
        V v2 = v;
        if (mo20929n()) {
            C7398r.m27426d(mo20929n(), "Arrays already allocated");
            int i = this.f19967s;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) ((double) highestOneBit)) && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f19963o = C7441u0.m27517d(max2);
            m27490s(max2 - 1);
            this.f19964p = new int[i];
            this.f19965q = new Object[i];
            this.f19966r = new Object[i];
        }
        Map j = mo20924j();
        if (j != null) {
            return j.put(k2, v2);
        }
        int[] iArr = this.f19964p;
        Object[] objArr = this.f19965q;
        V[] vArr = this.f19966r;
        int i2 = this.f19968t;
        int i3 = i2 + 1;
        int a = C7455v0.m27524a(k);
        int o = m27486o();
        int i4 = a & o;
        int c = C7441u0.m27516c(this.f19963o, i4);
        if (c != 0) {
            int i5 = ~o;
            int i6 = a & i5;
            int i7 = 0;
            while (true) {
                int i8 = c - 1;
                int i9 = iArr[i8];
                int i10 = i9 & i5;
                if (i10 != i6 || !C7342n.m27360a(k2, objArr[i8])) {
                    int i11 = i9 & o;
                    i7++;
                    if (i11 != 0) {
                        c = i11;
                    } else if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(m27486o() + 1, 1.0f);
                        for (int e = mo20919e(); e >= 0; e = mo20921f(e)) {
                            linkedHashMap.put(this.f19965q[e], this.f19966r[e]);
                        }
                        this.f19963o = linkedHashMap;
                        this.f19964p = null;
                        this.f19965q = null;
                        this.f19966r = null;
                        mo20925k();
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
            int length = this.f19964p.length;
            this.f19964p = Arrays.copyOf(this.f19964p, min);
            this.f19965q = Arrays.copyOf(this.f19965q, min);
            this.f19966r = Arrays.copyOf(this.f19966r, min);
            this.f19964p[i2] = (~o) & a;
            this.f19965q[i2] = k2;
            this.f19966r[i2] = v2;
            this.f19968t = i3;
            mo20925k();
            return null;
        } else if (i3 <= o) {
            C7441u0.m27518e(this.f19963o, i4, i3);
            int length2 = this.f19964p.length;
            if (i3 > length2 && (min = Math.min(1073741823, (Math.max(1, length2 >>> 1) + length2) | 1)) != length2) {
                this.f19964p = Arrays.copyOf(this.f19964p, min);
                this.f19965q = Arrays.copyOf(this.f19965q, min);
                this.f19966r = Arrays.copyOf(this.f19966r, min);
            }
            this.f19964p[i2] = (~o) & a;
            this.f19965q[i2] = k2;
            this.f19966r[i2] = v2;
            this.f19968t = i3;
            mo20925k();
            return null;
        }
        o = m27488q(o, C7441u0.m27514a(o), a, i2);
        int length22 = this.f19964p.length;
        this.f19964p = Arrays.copyOf(this.f19964p, min);
        this.f19965q = Arrays.copyOf(this.f19965q, min);
        this.f19966r = Arrays.copyOf(this.f19966r, min);
        this.f19964p[i2] = (~o) & a;
        this.f19965q[i2] = k2;
        this.f19966r[i2] = v2;
        this.f19968t = i3;
        mo20925k();
        return null;
    }

    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        Map j = mo20924j();
        if (j != null) {
            return j.remove(obj);
        }
        V r = m27489r(obj);
        if (r == f19962f) {
            return null;
        }
        return r;
    }

    public final int size() {
        Map j = mo20924j();
        return j != null ? j.size() : this.f19968t;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f19971w;
        if (collection != null) {
            return collection;
        }
        C7413s0 s0Var = new C7413s0(this);
        this.f19971w = s0Var;
        return s0Var;
    }
}
