package p027c.p060f;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: c.f.g */
public class C1801g<K, V> {

    /* renamed from: f */
    static Object[] f5351f;

    /* renamed from: o */
    static int f5352o;

    /* renamed from: p */
    static Object[] f5353p;

    /* renamed from: q */
    static int f5354q;

    /* renamed from: r */
    int[] f5355r;

    /* renamed from: s */
    Object[] f5356s;

    /* renamed from: t */
    int f5357t;

    public C1801g() {
        this.f5355r = C1792c.f5320a;
        this.f5356s = C1792c.f5322c;
        this.f5357t = 0;
    }

    public C1801g(int i) {
        if (i == 0) {
            this.f5355r = C1792c.f5320a;
            this.f5356s = C1792c.f5322c;
        } else {
            m7675a(i);
        }
        this.f5357t = 0;
    }

    public C1801g(C1801g<K, V> gVar) {
        this();
        if (gVar != null) {
            mo6260j(gVar);
        }
    }

    /* renamed from: a */
    private void m7675a(int i) {
        Class<C1801g> cls = C1801g.class;
        if (i == 8) {
            synchronized (cls) {
                Object[] objArr = f5353p;
                if (objArr != null) {
                    this.f5356s = objArr;
                    f5353p = (Object[]) objArr[0];
                    this.f5355r = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f5354q--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                Object[] objArr2 = f5351f;
                if (objArr2 != null) {
                    this.f5356s = objArr2;
                    f5351f = (Object[]) objArr2[0];
                    this.f5355r = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f5352o--;
                    return;
                }
            }
        }
        this.f5355r = new int[i];
        this.f5356s = new Object[(i << 1)];
    }

    /* renamed from: b */
    private static int m7676b(int[] iArr, int i, int i2) {
        try {
            return C1792c.m7626a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    private static void m7677d(int[] iArr, Object[] objArr, int i) {
        Class<C1801g> cls = C1801g.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f5354q < 10) {
                    objArr[0] = f5353p;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f5353p = objArr;
                    f5354q++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f5352o < 10) {
                    objArr[0] = f5351f;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f5351f = objArr;
                    f5352o++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo6246c(int i) {
        int i2 = this.f5357t;
        int[] iArr = this.f5355r;
        if (iArr.length < i) {
            Object[] objArr = this.f5356s;
            m7675a(i);
            if (this.f5357t > 0) {
                System.arraycopy(iArr, 0, this.f5355r, 0, i2);
                System.arraycopy(objArr, 0, this.f5356s, 0, i2 << 1);
            }
            m7677d(iArr, objArr, i2);
        }
        if (this.f5357t != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f5357t;
        if (i > 0) {
            int[] iArr = this.f5355r;
            Object[] objArr = this.f5356s;
            this.f5355r = C1792c.f5320a;
            this.f5356s = C1792c.f5322c;
            this.f5357t = 0;
            m7677d(iArr, objArr, i);
        }
        if (this.f5357t > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo6252f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo6256h(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo6250e(Object obj, int i) {
        int i2 = this.f5357t;
        if (i2 == 0) {
            return -1;
        }
        int b = m7676b(this.f5355r, i2, i);
        if (b < 0 || obj.equals(this.f5356s[b << 1])) {
            return b;
        }
        int i3 = b + 1;
        while (i3 < i2 && this.f5355r[i3] == i) {
            if (obj.equals(this.f5356s[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = b - 1;
        while (i4 >= 0 && this.f5355r[i4] == i) {
            if (obj.equals(this.f5356s[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1801g) {
            C1801g gVar = (C1801g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f5357t) {
                try {
                    Object i2 = mo6258i(i);
                    Object m = mo6263m(i);
                    Object obj2 = gVar.get(i2);
                    if (m == null) {
                        if (obj2 != null || !gVar.containsKey(i2)) {
                            return false;
                        }
                    } else if (!m.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f5357t) {
                try {
                    Object i4 = mo6258i(i3);
                    Object m2 = mo6263m(i3);
                    Object obj3 = map.get(i4);
                    if (m2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!m2.equals(obj3)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo6252f(Object obj) {
        return obj == null ? mo6253g() : mo6250e(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo6253g() {
        int i = this.f5357t;
        if (i == 0) {
            return -1;
        }
        int b = m7676b(this.f5355r, i, 0);
        if (b < 0 || this.f5356s[b << 1] == null) {
            return b;
        }
        int i2 = b + 1;
        while (i2 < i && this.f5355r[i2] == 0) {
            if (this.f5356s[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = b - 1;
        while (i3 >= 0 && this.f5355r[i3] == 0) {
            if (this.f5356s[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int f = mo6252f(obj);
        return f >= 0 ? this.f5356s[(f << 1) + 1] : v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo6256h(Object obj) {
        int i = this.f5357t * 2;
        Object[] objArr = this.f5356s;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f5355r;
        Object[] objArr = this.f5356s;
        int i = this.f5357t;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public K mo6258i(int i) {
        return this.f5356s[i << 1];
    }

    public boolean isEmpty() {
        return this.f5357t <= 0;
    }

    /* renamed from: j */
    public void mo6260j(C1801g<? extends K, ? extends V> gVar) {
        int i = gVar.f5357t;
        mo6246c(this.f5357t + i);
        if (this.f5357t != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gVar.mo6258i(i2), gVar.mo6263m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f5355r, 0, this.f5355r, 0, i);
            System.arraycopy(gVar.f5356s, 0, this.f5356s, 0, i << 1);
            this.f5357t = i;
        }
    }

    /* renamed from: k */
    public V mo6261k(int i) {
        V[] vArr = this.f5356s;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f5357t;
        int i4 = 0;
        if (i3 <= 1) {
            m7677d(this.f5355r, vArr, i3);
            this.f5355r = C1792c.f5320a;
            this.f5356s = C1792c.f5322c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f5355r;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr = this.f5356s;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f5356s;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m7675a(i6);
                if (i3 == this.f5357t) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f5355r, 0, i);
                        System.arraycopy(vArr, 0, this.f5356s, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f5355r, i, i11);
                        System.arraycopy(vArr, i10 << 1, this.f5356s, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f5357t) {
            this.f5357t = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: l */
    public V mo6262l(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f5356s;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: m */
    public V mo6263m(int i) {
        return this.f5356s[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f5357t;
        if (k == null) {
            i2 = mo6253g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo6250e(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f5356s;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.f5355r;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f5356s;
            m7675a(i6);
            if (i3 == this.f5357t) {
                int[] iArr2 = this.f5355r;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f5356s, 0, objArr.length);
                }
                m7677d(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f5355r;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f5356s;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f5357t - i5) << 1);
        }
        int i8 = this.f5357t;
        if (i3 == i8) {
            int[] iArr4 = this.f5355r;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f5356s;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f5357t = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int f = mo6252f(obj);
        if (f >= 0) {
            return mo6261k(f);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int f = mo6252f(obj);
        if (f < 0) {
            return false;
        }
        Object m = mo6263m(f);
        if (obj2 != m && (obj2 == null || !obj2.equals(m))) {
            return false;
        }
        mo6261k(f);
        return true;
    }

    public V replace(K k, V v) {
        int f = mo6252f(k);
        if (f >= 0) {
            return mo6262l(f, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int f = mo6252f(k);
        if (f < 0) {
            return false;
        }
        V m = mo6263m(f);
        if (m != v && (v == null || !v.equals(m))) {
            return false;
        }
        mo6262l(f, v2);
        return true;
    }

    public int size() {
        return this.f5357t;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5357t * 28);
        sb.append('{');
        for (int i = 0; i < this.f5357t; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object i2 = mo6258i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m = mo6263m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
