package androidx.recyclerview.widget;

import androidx.core.util.C1175f;
import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.C1400i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.a */
class C1371a implements C1400i.C1401a {

    /* renamed from: a */
    private C1175f<C1373b> f3987a;

    /* renamed from: b */
    final ArrayList<C1373b> f3988b;

    /* renamed from: c */
    final ArrayList<C1373b> f3989c;

    /* renamed from: d */
    final C1372a f3990d;

    /* renamed from: e */
    Runnable f3991e;

    /* renamed from: f */
    final boolean f3992f;

    /* renamed from: g */
    final C1400i f3993g;

    /* renamed from: h */
    private int f3994h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    interface C1372a {
        /* renamed from: a */
        void mo4749a(int i, int i2);

        /* renamed from: b */
        void mo4750b(C1373b bVar);

        /* renamed from: c */
        void mo4751c(int i, int i2, Object obj);

        /* renamed from: d */
        void mo4752d(C1373b bVar);

        /* renamed from: e */
        RecyclerView.C1328d0 mo4753e(int i);

        /* renamed from: f */
        void mo4754f(int i, int i2);

        /* renamed from: g */
        void mo4755g(int i, int i2);

        /* renamed from: h */
        void mo4756h(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    static class C1373b {

        /* renamed from: a */
        int f3995a;

        /* renamed from: b */
        int f3996b;

        /* renamed from: c */
        Object f3997c;

        /* renamed from: d */
        int f3998d;

        C1373b(int i, int i2, int i3, Object obj) {
            this.f3995a = i;
            this.f3996b = i2;
            this.f3998d = i3;
            this.f3997c = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo5091a() {
            int i = this.f3995a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1373b.class != obj.getClass()) {
                return false;
            }
            C1373b bVar = (C1373b) obj;
            int i = this.f3995a;
            if (i != bVar.f3995a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f3998d - this.f3996b) == 1 && this.f3998d == bVar.f3996b && this.f3996b == bVar.f3998d) {
                return true;
            }
            if (this.f3998d != bVar.f3998d || this.f3996b != bVar.f3996b) {
                return false;
            }
            Object obj2 = this.f3997c;
            Object obj3 = bVar.f3997c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3995a * 31) + this.f3996b) * 31) + this.f3998d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo5091a() + ",s:" + this.f3996b + "c:" + this.f3998d + ",p:" + this.f3997c + "]";
        }
    }

    C1371a(C1372a aVar) {
        this(aVar, false);
    }

    C1371a(C1372a aVar, boolean z) {
        this.f3987a = new Pools$SimplePool(30);
        this.f3988b = new ArrayList<>();
        this.f3989c = new ArrayList<>();
        this.f3994h = 0;
        this.f3990d = aVar;
        this.f3992f = z;
        this.f3993g = new C1400i(this);
    }

    /* renamed from: c */
    private void m6051c(C1373b bVar) {
        m6057r(bVar);
    }

    /* renamed from: d */
    private void m6052d(C1373b bVar) {
        m6057r(bVar);
    }

    /* renamed from: f */
    private void m6053f(C1373b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f3996b;
        int i2 = bVar.f3998d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f3990d.mo4753e(i3) != null || m6055h(i3)) {
                if (c2 == 0) {
                    m6056k(mo5078b(2, i, i4, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m6057r(mo5078b(2, i, i4, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f3998d) {
            mo5077a(bVar);
            bVar = mo5078b(2, i, i4, (Object) null);
        }
        if (c2 == 0) {
            m6056k(bVar);
        } else {
            m6057r(bVar);
        }
    }

    /* renamed from: g */
    private void m6054g(C1373b bVar) {
        int i = bVar.f3996b;
        int i2 = bVar.f3998d + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f3990d.mo4753e(i) != null || m6055h(i)) {
                if (c == 0) {
                    m6056k(mo5078b(4, i3, i4, bVar.f3997c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m6057r(mo5078b(4, i3, i4, bVar.f3997c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f3998d) {
            Object obj = bVar.f3997c;
            mo5077a(bVar);
            bVar = mo5078b(4, i3, i4, obj);
        }
        if (c == 0) {
            m6056k(bVar);
        } else {
            m6057r(bVar);
        }
    }

    /* renamed from: h */
    private boolean m6055h(int i) {
        int size = this.f3989c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1373b bVar = this.f3989c.get(i2);
            int i3 = bVar.f3995a;
            if (i3 == 8) {
                if (mo5084n(bVar.f3998d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f3996b;
                int i5 = bVar.f3998d + i4;
                while (i4 < i5) {
                    if (mo5084n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m6056k(C1373b bVar) {
        int i;
        int i2 = bVar.f3995a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int v = m6058v(bVar.f3996b, i2);
        int i3 = bVar.f3996b;
        int i4 = bVar.f3995a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f3998d; i6++) {
            int v2 = m6058v(bVar.f3996b + (i * i6), bVar.f3995a);
            int i7 = bVar.f3995a;
            if (i7 == 2 ? v2 == v : i7 == 4 && v2 == v + 1) {
                i5++;
            } else {
                C1373b b = mo5078b(i7, v, i5, bVar.f3997c);
                mo5082l(b, i3);
                mo5077a(b);
                if (bVar.f3995a == 4) {
                    i3 += i5;
                }
                v = v2;
                i5 = 1;
            }
        }
        Object obj = bVar.f3997c;
        mo5077a(bVar);
        if (i5 > 0) {
            C1373b b2 = mo5078b(bVar.f3995a, v, i5, obj);
            mo5082l(b2, i3);
            mo5077a(b2);
        }
    }

    /* renamed from: r */
    private void m6057r(C1373b bVar) {
        this.f3989c.add(bVar);
        int i = bVar.f3995a;
        if (i == 1) {
            this.f3990d.mo4755g(bVar.f3996b, bVar.f3998d);
        } else if (i == 2) {
            this.f3990d.mo4754f(bVar.f3996b, bVar.f3998d);
        } else if (i == 4) {
            this.f3990d.mo4751c(bVar.f3996b, bVar.f3998d, bVar.f3997c);
        } else if (i == 8) {
            this.f3990d.mo4749a(bVar.f3996b, bVar.f3998d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: v */
    private int m6058v(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f3989c.size() - 1; size >= 0; size--) {
            C1373b bVar = this.f3989c.get(size);
            int i9 = bVar.f3995a;
            if (i9 == 8) {
                int i10 = bVar.f3996b;
                int i11 = bVar.f3998d;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            bVar.f3996b = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            bVar.f3996b = i10 - 1;
                            i6 = i11 - 1;
                        }
                        bVar.f3998d = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    bVar.f3998d = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    bVar.f3996b = i7;
                    i--;
                }
            } else {
                int i12 = bVar.f3996b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    bVar.f3996b = i3;
                } else if (i9 == 1) {
                    i -= bVar.f3998d;
                } else if (i9 == 2) {
                    i += bVar.f3998d;
                }
            }
        }
        for (int size2 = this.f3989c.size() - 1; size2 >= 0; size2--) {
            C1373b bVar2 = this.f3989c.get(size2);
            if (bVar2.f3995a == 8) {
                int i13 = bVar2.f3998d;
                if (i13 != bVar2.f3996b && i13 >= 0) {
                }
            } else if (bVar2.f3998d > 0) {
            }
            this.f3989c.remove(size2);
            mo5077a(bVar2);
        }
        return i;
    }

    /* renamed from: a */
    public void mo5077a(C1373b bVar) {
        if (!this.f3992f) {
            bVar.f3997c = null;
            this.f3987a.mo3701a(bVar);
        }
    }

    /* renamed from: b */
    public C1373b mo5078b(int i, int i2, int i3, Object obj) {
        C1373b b = this.f3987a.mo3702b();
        if (b == null) {
            return new C1373b(i, i2, i3, obj);
        }
        b.f3995a = i;
        b.f3996b = i2;
        b.f3998d = i3;
        b.f3997c = obj;
        return b;
    }

    /* renamed from: e */
    public int mo5079e(int i) {
        int size = this.f3988b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1373b bVar = this.f3988b.get(i2);
            int i3 = bVar.f3995a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f3996b;
                    if (i4 <= i) {
                        int i5 = bVar.f3998d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f3996b;
                    if (i6 == i) {
                        i = bVar.f3998d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f3998d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f3996b <= i) {
                i += bVar.f3998d;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo5080i() {
        int size = this.f3989c.size();
        for (int i = 0; i < size; i++) {
            this.f3990d.mo4752d(this.f3989c.get(i));
        }
        mo5089t(this.f3989c);
        this.f3994h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo5081j() {
        mo5080i();
        int size = this.f3988b.size();
        for (int i = 0; i < size; i++) {
            C1373b bVar = this.f3988b.get(i);
            int i2 = bVar.f3995a;
            if (i2 == 1) {
                this.f3990d.mo4752d(bVar);
                this.f3990d.mo4755g(bVar.f3996b, bVar.f3998d);
            } else if (i2 == 2) {
                this.f3990d.mo4752d(bVar);
                this.f3990d.mo4756h(bVar.f3996b, bVar.f3998d);
            } else if (i2 == 4) {
                this.f3990d.mo4752d(bVar);
                this.f3990d.mo4751c(bVar.f3996b, bVar.f3998d, bVar.f3997c);
            } else if (i2 == 8) {
                this.f3990d.mo4752d(bVar);
                this.f3990d.mo4749a(bVar.f3996b, bVar.f3998d);
            }
            Runnable runnable = this.f3991e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo5089t(this.f3988b);
        this.f3994h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo5082l(C1373b bVar, int i) {
        this.f3990d.mo4750b(bVar);
        int i2 = bVar.f3995a;
        if (i2 == 2) {
            this.f3990d.mo4756h(i, bVar.f3998d);
        } else if (i2 == 4) {
            this.f3990d.mo4751c(i, bVar.f3998d, bVar.f3997c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo5083m(int i) {
        return mo5084n(i, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo5084n(int i, int i2) {
        int size = this.f3989c.size();
        while (i2 < size) {
            C1373b bVar = this.f3989c.get(i2);
            int i3 = bVar.f3995a;
            if (i3 == 8) {
                int i4 = bVar.f3996b;
                if (i4 == i) {
                    i = bVar.f3998d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f3998d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f3996b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f3998d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f3998d;
                }
            }
            i2++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo5085o(int i) {
        return (i & this.f3994h) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo5086p() {
        return this.f3988b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo5087q() {
        return !this.f3989c.isEmpty() && !this.f3988b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo5088s() {
        this.f3993g.mo5185b(this.f3988b);
        int size = this.f3988b.size();
        for (int i = 0; i < size; i++) {
            C1373b bVar = this.f3988b.get(i);
            int i2 = bVar.f3995a;
            if (i2 == 1) {
                m6051c(bVar);
            } else if (i2 == 2) {
                m6053f(bVar);
            } else if (i2 == 4) {
                m6054g(bVar);
            } else if (i2 == 8) {
                m6052d(bVar);
            }
            Runnable runnable = this.f3991e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3988b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo5089t(List<C1373b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo5077a(list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo5090u() {
        mo5089t(this.f3988b);
        mo5089t(this.f3989c);
        this.f3994h = 0;
    }
}
