package p027c.p060f;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: c.f.b */
public final class C1790b<E> implements Collection<E>, Set<E> {

    /* renamed from: f */
    private static final int[] f5309f = new int[0];

    /* renamed from: o */
    private static final Object[] f5310o = new Object[0];

    /* renamed from: p */
    private static Object[] f5311p;

    /* renamed from: q */
    private static int f5312q;

    /* renamed from: r */
    private static Object[] f5313r;

    /* renamed from: s */
    private static int f5314s;

    /* renamed from: t */
    private int[] f5315t;

    /* renamed from: u */
    Object[] f5316u;

    /* renamed from: v */
    int f5317v;

    /* renamed from: w */
    private C1795f<E, E> f5318w;

    /* renamed from: c.f.b$a */
    class C1791a extends C1795f<E, E> {
        C1791a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo6131a() {
            C1790b.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo6132b(int i, int i2) {
            return C1790b.this.f5316u[i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Map<E, E> mo6133c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public int mo6134d() {
            return C1790b.this.f5317v;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo6135e(Object obj) {
            return C1790b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo6136f(Object obj) {
            return C1790b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo6137g(E e, E e2) {
            C1790b.this.add(e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo6138h(int i) {
            C1790b.this.mo6151p(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public E mo6139i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C1790b() {
        this(0);
    }

    public C1790b(int i) {
        if (i == 0) {
            this.f5315t = f5309f;
            this.f5316u = f5310o;
        } else {
            m7609b(i);
        }
        this.f5317v = 0;
    }

    /* renamed from: b */
    private void m7609b(int i) {
        if (i == 8) {
            synchronized (C1790b.class) {
                Object[] objArr = f5313r;
                if (objArr != null) {
                    this.f5316u = objArr;
                    f5313r = (Object[]) objArr[0];
                    this.f5315t = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f5314s--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C1790b.class) {
                Object[] objArr2 = f5311p;
                if (objArr2 != null) {
                    this.f5316u = objArr2;
                    f5311p = (Object[]) objArr2[0];
                    this.f5315t = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f5312q--;
                    return;
                }
            }
        }
        this.f5315t = new int[i];
        this.f5316u = new Object[i];
    }

    /* renamed from: h */
    private static void m7610h(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C1790b.class) {
                if (f5314s < 10) {
                    objArr[0] = f5313r;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f5313r = objArr;
                    f5314s++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C1790b.class) {
                if (f5312q < 10) {
                    objArr[0] = f5311p;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f5311p = objArr;
                    f5312q++;
                }
            }
        }
    }

    /* renamed from: j */
    private C1795f<E, E> m7611j() {
        if (this.f5318w == null) {
            this.f5318w = new C1791a();
        }
        return this.f5318w;
    }

    /* renamed from: k */
    private int m7612k(Object obj, int i) {
        int i2 = this.f5317v;
        if (i2 == 0) {
            return -1;
        }
        int a = C1792c.m7626a(this.f5315t, i2, i);
        if (a < 0 || obj.equals(this.f5316u[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f5315t[i3] == i) {
            if (obj.equals(this.f5316u[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f5315t[i4] == i) {
            if (obj.equals(this.f5316u[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: o */
    private int m7613o() {
        int i = this.f5317v;
        if (i == 0) {
            return -1;
        }
        int a = C1792c.m7626a(this.f5315t, i, 0);
        if (a < 0 || this.f5316u[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f5315t[i2] == 0) {
            if (this.f5316u[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f5315t[i3] == 0) {
            if (this.f5316u[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m7613o();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m7612k(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f5317v;
        int[] iArr = this.f5315t;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f5316u;
            m7609b(i5);
            int[] iArr2 = this.f5315t;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f5316u, 0, objArr.length);
            }
            m7610h(iArr, objArr, this.f5317v);
        }
        int i6 = this.f5317v;
        if (i3 < i6) {
            int[] iArr3 = this.f5315t;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f5316u;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f5317v - i3);
        }
        this.f5315t[i3] = i;
        this.f5316u[i3] = e;
        this.f5317v++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo6146g(this.f5317v + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public void clear() {
        int i = this.f5317v;
        if (i != 0) {
            m7610h(this.f5315t, this.f5316u, i);
            this.f5315t = f5309f;
            this.f5316u = f5310o;
            this.f5317v = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f5317v) {
                try {
                    if (!set.contains(mo6152r(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void mo6146g(int i) {
        int[] iArr = this.f5315t;
        if (iArr.length < i) {
            Object[] objArr = this.f5316u;
            m7609b(i);
            int i2 = this.f5317v;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f5315t, 0, i2);
                System.arraycopy(objArr, 0, this.f5316u, 0, this.f5317v);
            }
            m7610h(iArr, objArr, this.f5317v);
        }
    }

    public int hashCode() {
        int[] iArr = this.f5315t;
        int i = this.f5317v;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m7613o() : m7612k(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f5317v <= 0;
    }

    public Iterator<E> iterator() {
        return m7611j().mo6185m().iterator();
    }

    /* renamed from: p */
    public E mo6151p(int i) {
        E[] eArr = this.f5316u;
        E e = eArr[i];
        int i2 = this.f5317v;
        if (i2 <= 1) {
            m7610h(this.f5315t, eArr, i2);
            this.f5315t = f5309f;
            this.f5316u = f5310o;
            this.f5317v = 0;
        } else {
            int[] iArr = this.f5315t;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.f5317v = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr = this.f5316u;
                    System.arraycopy(objArr, i5, objArr, i, this.f5317v - i);
                }
                this.f5316u[this.f5317v] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                m7609b(i3);
                this.f5317v--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f5315t, 0, i);
                    System.arraycopy(eArr, 0, this.f5316u, 0, i);
                }
                int i6 = this.f5317v;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.f5315t, i, i6 - i);
                    System.arraycopy(eArr, i7, this.f5316u, i, this.f5317v - i);
                }
            }
        }
        return e;
    }

    /* renamed from: r */
    public E mo6152r(int i) {
        return this.f5316u[i];
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo6151p(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f5317v - 1; i >= 0; i--) {
            if (!collection.contains(this.f5316u[i])) {
                mo6151p(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f5317v;
    }

    public Object[] toArray() {
        int i = this.f5317v;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f5316u, 0, objArr, 0, i);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f5317v) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f5317v);
        }
        System.arraycopy(this.f5316u, 0, tArr, 0, this.f5317v);
        int length = tArr.length;
        int i = this.f5317v;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5317v * 14);
        sb.append('{');
        for (int i = 0; i < this.f5317v; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object r = mo6152r(i);
            if (r != this) {
                sb.append(r);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
