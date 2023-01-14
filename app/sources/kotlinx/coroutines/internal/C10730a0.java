package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.C10819p0;
import kotlinx.coroutines.internal.C10732b0;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.internal.a0 */
public class C10730a0<T extends C10732b0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    private T[] f28215a;

    /* renamed from: f */
    private final T[] m36469f() {
        T[] tArr = this.f28215a;
        if (tArr == null) {
            T[] tArr2 = new C10732b0[4];
            this.f28215a = tArr2;
            return tArr2;
        } else if (mo26692c() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, mo26692c() * 2);
            C10457l.m35319d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            T[] tArr3 = (C10732b0[]) copyOf;
            this.f28215a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: j */
    private final void m36470j(int i) {
        this._size = i;
    }

    /* renamed from: k */
    private final void m36471k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo26692c()) {
                T[] tArr = this.f28215a;
                C10457l.m35317b(tArr);
                int i3 = i2 + 1;
                if (i3 < mo26692c()) {
                    T t = tArr[i3];
                    C10457l.m35317b(t);
                    T t2 = tArr[i2];
                    C10457l.m35317b(t2);
                    if (((Comparable) t).compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr[i];
                C10457l.m35317b(t3);
                T t4 = tArr[i2];
                C10457l.m35317b(t4);
                if (((Comparable) t3).compareTo(t4) > 0) {
                    m36473m(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    private final void m36472l(int i) {
        while (i > 0) {
            T[] tArr = this.f28215a;
            C10457l.m35317b(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C10457l.m35317b(t);
            T t2 = tArr[i];
            C10457l.m35317b(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                m36473m(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    private final void m36473m(int i, int i2) {
        T[] tArr = this.f28215a;
        C10457l.m35317b(tArr);
        T t = tArr[i2];
        C10457l.m35317b(t);
        T t2 = tArr[i];
        C10457l.m35317b(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.mo26643z(i);
        t2.mo26643z(i2);
    }

    /* renamed from: a */
    public final void mo26690a(T t) {
        if (C10819p0.m36781a()) {
            if (!(t.mo26642v() == null)) {
                throw new AssertionError();
            }
        }
        t.mo26640g(this);
        C10732b0[] f = m36469f();
        int c = mo26692c();
        m36470j(c + 1);
        f[c] = t;
        t.mo26643z(c);
        m36472l(c);
    }

    /* renamed from: b */
    public final T mo26691b() {
        T[] tArr = this.f28215a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: c */
    public final int mo26692c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean mo26693d() {
        return mo26692c() == 0;
    }

    /* renamed from: e */
    public final T mo26694e() {
        T b;
        synchronized (this) {
            b = mo26691b();
        }
        return b;
    }

    /* renamed from: g */
    public final boolean mo26695g(T t) {
        boolean z;
        synchronized (this) {
            z = true;
            boolean z2 = false;
            if (t.mo26642v() == null) {
                z = false;
            } else {
                int A = t.mo26635A();
                if (C10819p0.m36781a()) {
                    if (A >= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
                mo26696h(A);
            }
        }
        return z;
    }

    /* renamed from: h */
    public final T mo26696h(int i) {
        boolean z = false;
        if (C10819p0.m36781a()) {
            if (!(mo26692c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f28215a;
        C10457l.m35317b(tArr);
        m36470j(mo26692c() - 1);
        if (i < mo26692c()) {
            m36473m(i, mo26692c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C10457l.m35317b(t);
                T t2 = tArr[i2];
                C10457l.m35317b(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m36473m(i, i2);
                    m36472l(i2);
                }
            }
            m36471k(i);
        }
        T t3 = tArr[mo26692c()];
        C10457l.m35317b(t3);
        if (C10819p0.m36781a()) {
            if (t3.mo26642v() == this) {
                z = true;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
        t3.mo26640g((C10730a0<?>) null);
        t3.mo26643z(-1);
        tArr[mo26692c()] = null;
        return t3;
    }

    /* renamed from: i */
    public final T mo26697i() {
        T h;
        synchronized (this) {
            h = mo26692c() > 0 ? mo26696h(0) : null;
        }
        return h;
    }
}
