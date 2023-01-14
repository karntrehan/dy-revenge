package p174e.p319f.p320a.p335c.p345f.p358m;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.m.d0 */
final class C8626d0<K, V> extends AbstractMap<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final Object f23639f = new Object();
    /* access modifiers changed from: private */
    @NullableDecl

    /* renamed from: o */
    public transient Object f23640o;
    @NullableDecl

    /* renamed from: p */
    transient int[] f23641p;
    @NullableDecl

    /* renamed from: q */
    transient Object[] f23642q;
    @NullableDecl

    /* renamed from: r */
    transient Object[] f23643r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public transient int f23644s;

    /* renamed from: t */
    private transient int f23645t;
    @NullableDecl

    /* renamed from: u */
    private transient Set<K> f23646u;
    @NullableDecl

    /* renamed from: v */
    private transient Set<Map.Entry<K, V>> f23647v;
    @NullableDecl

    /* renamed from: w */
    private transient Collection<V> f23648w;

    C8626d0(int i) {
        mo22360l(12);
    }

    /* renamed from: d */
    static /* synthetic */ int m29419d(C8626d0 d0Var) {
        int i = d0Var.f23645t;
        d0Var.f23645t = i - 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final int m29423o() {
        return (1 << (this.f23644s & 31)) - 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final int m29424p(@NullableDecl Object obj) {
        if (mo22362n()) {
            return -1;
        }
        int a = C8652f0.m29463a(obj);
        int o = m29423o();
        int c = C8639e0.m29447c(this.f23640o, a & o);
        if (c != 0) {
            int i = ~o;
            int i2 = a & i;
            do {
                int i3 = c - 1;
                int i4 = this.f23641p[i3];
                if ((i4 & i) == i2 && C8832sb.m29687a(obj, this.f23642q[i3])) {
                    return i3;
                }
                c = i4 & o;
            } while (c != 0);
        }
        return -1;
    }

    /* renamed from: q */
    private final int m29425q(int i, int i2, int i3, int i4) {
        Object d = C8639e0.m29448d(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C8639e0.m29449e(d, i3 & i5, i4 + 1);
        }
        Object obj = this.f23640o;
        int[] iArr = this.f23641p;
        for (int i6 = 0; i6 <= i; i6++) {
            int c = C8639e0.m29447c(obj, i6);
            while (c != 0) {
                int i7 = c - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int c2 = C8639e0.m29447c(d, i10);
                C8639e0.m29449e(d, i10, c);
                iArr[i7] = ((~i5) & i9) | (c2 & i5);
                c = i8 & i;
            }
        }
        this.f23640o = d;
        m29427s(i5);
        return i5;
    }

    /* access modifiers changed from: private */
    @NullableDecl
    /* renamed from: r */
    public final Object m29426r(@NullableDecl Object obj) {
        if (mo22362n()) {
            return f23639f;
        }
        int o = m29423o();
        int b = C8639e0.m29446b(obj, (Object) null, o, this.f23640o, this.f23641p, this.f23642q, (Object[]) null);
        if (b == -1) {
            return f23639f;
        }
        Object obj2 = this.f23643r[b];
        mo22361m(b, o);
        this.f23645t--;
        mo22358k();
        return obj2;
    }

    /* renamed from: s */
    private final void m29427s(int i) {
        this.f23644s = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f23644s & -32);
    }

    public final void clear() {
        if (!mo22362n()) {
            mo22358k();
            Map j = mo22357j();
            if (j != null) {
                this.f23644s = C8731l1.m29552a(size(), 3, 1073741823);
                j.clear();
                this.f23640o = null;
            } else {
                Arrays.fill(this.f23642q, 0, this.f23645t, (Object) null);
                Arrays.fill(this.f23643r, 0, this.f23645t, (Object) null);
                Object obj = this.f23640o;
                if (obj instanceof byte[]) {
                    Arrays.fill((byte[]) obj, (byte) 0);
                } else if (obj instanceof short[]) {
                    Arrays.fill((short[]) obj, 0);
                } else {
                    Arrays.fill((int[]) obj, 0);
                }
                Arrays.fill(this.f23641p, 0, this.f23645t, 0);
            }
            this.f23645t = 0;
        }
    }

    public final boolean containsKey(@NullableDecl Object obj) {
        Map j = mo22357j();
        return j != null ? j.containsKey(obj) : m29424p(obj) != -1;
    }

    public final boolean containsValue(@NullableDecl Object obj) {
        Map j = mo22357j();
        if (j != null) {
            return j.containsValue(obj);
        }
        for (int i = 0; i < this.f23645t; i++) {
            if (C8832sb.m29687a(obj, this.f23643r[i])) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo22352e() {
        return isEmpty() ? -1 : 0;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f23647v;
        if (set != null) {
            return set;
        }
        C8884x xVar = new C8884x(this);
        this.f23647v = xVar;
        return xVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo22354f(int i) {
        int i2 = i + 1;
        if (i2 < this.f23645t) {
            return i2;
        }
        return -1;
    }

    public final V get(@NullableDecl Object obj) {
        Map j = mo22357j();
        if (j != null) {
            return j.get(obj);
        }
        int p = m29424p(obj);
        if (p == -1) {
            return null;
        }
        return this.f23643r[p];
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* access modifiers changed from: package-private */
    @NullableDecl
    /* renamed from: j */
    public final Map<K, V> mo22357j() {
        Object obj = this.f23640o;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo22358k() {
        this.f23644s += 32;
    }

    public final Set<K> keySet() {
        Set<K> set = this.f23646u;
        if (set != null) {
            return set;
        }
        C8908z zVar = new C8908z(this);
        this.f23646u = zVar;
        return zVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo22360l(int i) {
        this.f23644s = C8731l1.m29552a(12, 1, 1073741823);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo22361m(int i, int i2) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.f23642q;
            Object obj = objArr[size];
            objArr[i] = obj;
            Object[] objArr2 = this.f23643r;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.f23641p;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int a = C8652f0.m29463a(obj) & i2;
            int c = C8639e0.m29447c(this.f23640o, a);
            int i3 = size + 1;
            if (c != i3) {
                while (true) {
                    int i4 = c - 1;
                    int[] iArr2 = this.f23641p;
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
                C8639e0.m29449e(this.f23640o, a, i + 1);
            }
        } else {
            this.f23642q[i] = null;
            this.f23643r[i] = null;
            this.f23641p[i] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo22362n() {
        return this.f23640o == null;
    }

    @NullableDecl
    public final V put(@NullableDecl K k, @NullableDecl V v) {
        int min;
        K k2 = k;
        V v2 = v;
        if (mo22362n()) {
            C8599b.m29381d(mo22362n(), "Arrays already allocated");
            int i = this.f23644s;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) ((double) highestOneBit)) && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f23640o = C8639e0.m29448d(max2);
            m29427s(max2 - 1);
            this.f23641p = new int[i];
            this.f23642q = new Object[i];
            this.f23643r = new Object[i];
        }
        Map j = mo22357j();
        if (j != null) {
            return j.put(k2, v2);
        }
        int[] iArr = this.f23641p;
        Object[] objArr = this.f23642q;
        V[] vArr = this.f23643r;
        int i2 = this.f23645t;
        int i3 = i2 + 1;
        int a = C8652f0.m29463a(k);
        int o = m29423o();
        int i4 = a & o;
        int c = C8639e0.m29447c(this.f23640o, i4);
        if (c != 0) {
            int i5 = ~o;
            int i6 = a & i5;
            int i7 = 0;
            while (true) {
                int i8 = c - 1;
                int i9 = iArr[i8];
                int i10 = i9 & i5;
                if (i10 != i6 || !C8832sb.m29687a(k2, objArr[i8])) {
                    int i11 = i9 & o;
                    i7++;
                    if (i11 != 0) {
                        c = i11;
                    } else if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(m29423o() + 1, 1.0f);
                        for (int e = mo22352e(); e >= 0; e = mo22354f(e)) {
                            linkedHashMap.put(this.f23642q[e], this.f23643r[e]);
                        }
                        this.f23640o = linkedHashMap;
                        this.f23641p = null;
                        this.f23642q = null;
                        this.f23643r = null;
                        mo22358k();
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
            int length = this.f23641p.length;
            this.f23641p = Arrays.copyOf(this.f23641p, min);
            this.f23642q = Arrays.copyOf(this.f23642q, min);
            this.f23643r = Arrays.copyOf(this.f23643r, min);
            this.f23641p[i2] = (~o) & a;
            this.f23642q[i2] = k2;
            this.f23643r[i2] = v2;
            this.f23645t = i3;
            mo22358k();
            return null;
        } else if (i3 <= o) {
            C8639e0.m29449e(this.f23640o, i4, i3);
            int length2 = this.f23641p.length;
            if (i3 > length2 && (min = Math.min(1073741823, (Math.max(1, length2 >>> 1) + length2) | 1)) != length2) {
                this.f23641p = Arrays.copyOf(this.f23641p, min);
                this.f23642q = Arrays.copyOf(this.f23642q, min);
                this.f23643r = Arrays.copyOf(this.f23643r, min);
            }
            this.f23641p[i2] = (~o) & a;
            this.f23642q[i2] = k2;
            this.f23643r[i2] = v2;
            this.f23645t = i3;
            mo22358k();
            return null;
        }
        o = m29425q(o, C8639e0.m29445a(o), a, i2);
        int length22 = this.f23641p.length;
        this.f23641p = Arrays.copyOf(this.f23641p, min);
        this.f23642q = Arrays.copyOf(this.f23642q, min);
        this.f23643r = Arrays.copyOf(this.f23643r, min);
        this.f23641p[i2] = (~o) & a;
        this.f23642q[i2] = k2;
        this.f23643r[i2] = v2;
        this.f23645t = i3;
        mo22358k();
        return null;
    }

    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        Map j = mo22357j();
        if (j != null) {
            return j.remove(obj);
        }
        V r = m29426r(obj);
        if (r == f23639f) {
            return null;
        }
        return r;
    }

    public final int size() {
        Map j = mo22357j();
        return j != null ? j.size() : this.f23645t;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f23648w;
        if (collection != null) {
            return collection;
        }
        C8613c0 c0Var = new C8613c0(this);
        this.f23648w = c0Var;
        return c0Var;
    }
}
