package p174e.p319f.p416e.p436x.p438c;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.C9671q;
import p174e.p319f.p416e.p420s.C9680b;

/* renamed from: e.f.e.x.c.e */
public class C9809e {

    /* renamed from: a */
    private final C9680b f26283a;

    /* renamed from: b */
    private final List<C9808d> f26284b = new ArrayList();

    /* renamed from: c */
    private boolean f26285c;

    /* renamed from: d */
    private final int[] f26286d = new int[5];

    /* renamed from: e */
    private final C9671q f26287e;

    /* renamed from: e.f.e.x.c.e$b */
    private static final class C9811b implements Serializable, Comparator<C9808d> {

        /* renamed from: f */
        private final float f26288f;

        private C9811b(float f) {
            this.f26288f = f;
        }

        /* renamed from: a */
        public int compare(C9808d dVar, C9808d dVar2) {
            int compare = Integer.compare(dVar2.mo24545h(), dVar.mo24545h());
            return compare == 0 ? Float.compare(Math.abs(dVar.mo24546i() - this.f26288f), Math.abs(dVar2.mo24546i() - this.f26288f)) : compare;
        }
    }

    /* renamed from: e.f.e.x.c.e$c */
    private static final class C9812c implements Serializable, Comparator<C9808d> {

        /* renamed from: f */
        private final float f26289f;

        private C9812c(float f) {
            this.f26289f = f;
        }

        /* renamed from: a */
        public int compare(C9808d dVar, C9808d dVar2) {
            return Float.compare(Math.abs(dVar2.mo24546i() - this.f26289f), Math.abs(dVar.mo24546i() - this.f26289f));
        }
    }

    public C9809e(C9680b bVar, C9671q qVar) {
        this.f26283a = bVar;
        this.f26287e = qVar;
    }

    /* renamed from: a */
    private static float m33508a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    /* renamed from: c */
    private boolean m33509c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] j = m33515j();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.f26283a.mo24264f(i2 - i6, i - i6)) {
            j[2] = j[2] + 1;
            i6++;
        }
        if (j[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.f26283a.mo24264f(i2 - i6, i - i6)) {
            j[1] = j[1] + 1;
            i6++;
        }
        if (j[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.f26283a.mo24264f(i2 - i6, i - i6)) {
            j[0] = j[0] + 1;
            i6++;
        }
        if (j[0] == 0) {
            return false;
        }
        int j2 = this.f26283a.mo24268j();
        int m = this.f26283a.mo24271m();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 < j2 && (i5 = i2 + i7) < m && this.f26283a.mo24264f(i5, i8)) {
                j[2] = j[2] + 1;
                i7++;
            }
        }
        while (true) {
            int i9 = i + i7;
            if (i9 < j2 && (i4 = i2 + i7) < m && !this.f26283a.mo24264f(i4, i9)) {
                j[3] = j[3] + 1;
                i7++;
            }
        }
        if (j[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 < j2 && (i3 = i2 + i7) < m && this.f26283a.mo24264f(i3, i10)) {
                j[4] = j[4] + 1;
                i7++;
            }
        }
        if (j[4] == 0) {
            return false;
        }
        return m33514i(j);
    }

    /* renamed from: d */
    private float m33510d(int i, int i2, int i3, int i4) {
        C9680b bVar = this.f26283a;
        int m = bVar.mo24271m();
        int[] j = m33515j();
        int i5 = i;
        while (i5 >= 0 && bVar.mo24264f(i5, i2)) {
            j[2] = j[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.mo24264f(i5, i2) && j[1] <= i3) {
            j[1] = j[1] + 1;
            i5--;
        }
        if (i5 >= 0 && j[1] <= i3) {
            while (i5 >= 0 && bVar.mo24264f(i5, i2) && j[0] <= i3) {
                j[0] = j[0] + 1;
                i5--;
            }
            if (j[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < m && bVar.mo24264f(i6, i2)) {
                j[2] = j[2] + 1;
                i6++;
            }
            if (i6 == m) {
                return Float.NaN;
            }
            while (i6 < m && !bVar.mo24264f(i6, i2) && j[3] < i3) {
                j[3] = j[3] + 1;
                i6++;
            }
            if (i6 != m && j[3] < i3) {
                while (i6 < m && bVar.mo24264f(i6, i2) && j[4] < i3) {
                    j[4] = j[4] + 1;
                    i6++;
                }
                if (j[4] < i3 && Math.abs(((((j[0] + j[1]) + j[2]) + j[3]) + j[4]) - i4) * 5 < i4 && m33513h(j)) {
                    return m33508a(j, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: e */
    private float m33511e(int i, int i2, int i3, int i4) {
        C9680b bVar = this.f26283a;
        int j = bVar.mo24268j();
        int[] j2 = m33515j();
        int i5 = i;
        while (i5 >= 0 && bVar.mo24264f(i2, i5)) {
            j2[2] = j2[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.mo24264f(i2, i5) && j2[1] <= i3) {
            j2[1] = j2[1] + 1;
            i5--;
        }
        if (i5 >= 0 && j2[1] <= i3) {
            while (i5 >= 0 && bVar.mo24264f(i2, i5) && j2[0] <= i3) {
                j2[0] = j2[0] + 1;
                i5--;
            }
            if (j2[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < j && bVar.mo24264f(i2, i6)) {
                j2[2] = j2[2] + 1;
                i6++;
            }
            if (i6 == j) {
                return Float.NaN;
            }
            while (i6 < j && !bVar.mo24264f(i2, i6) && j2[3] < i3) {
                j2[3] = j2[3] + 1;
                i6++;
            }
            if (i6 != j && j2[3] < i3) {
                while (i6 < j && bVar.mo24264f(i2, i6) && j2[4] < i3) {
                    j2[4] = j2[4] + 1;
                    i6++;
                }
                if (j2[4] < i3 && Math.abs(((((j2[0] + j2[1]) + j2[2]) + j2[3]) + j2[4]) - i4) * 5 < i4 * 2 && m33513h(j2)) {
                    return m33508a(j2, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: g */
    private int m33512g() {
        if (this.f26284b.size() <= 1) {
            return 0;
        }
        C9808d dVar = null;
        for (C9808d next : this.f26284b) {
            if (next.mo24545h() >= 2) {
                if (dVar == null) {
                    dVar = next;
                } else {
                    this.f26285c = true;
                    return ((int) (Math.abs(dVar.mo24230c() - next.mo24230c()) - Math.abs(dVar.mo24231d() - next.mo24231d()))) / 2;
                }
            }
        }
        return 0;
    }

    /* renamed from: h */
    protected static boolean m33513h(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 2.0f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    /* renamed from: i */
    protected static boolean m33514i(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 1.333f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    /* renamed from: j */
    private int[] m33515j() {
        mo24547b(this.f26286d);
        return this.f26286d;
    }

    /* renamed from: l */
    private boolean m33516l() {
        int size = this.f26284b.size();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (C9808d next : this.f26284b) {
            if (next.mo24545h() >= 2) {
                i++;
                f2 += next.mo24546i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (C9808d i2 : this.f26284b) {
            f += Math.abs(i2.mo24546i() - f3);
        }
        return f <= f2 * 0.05f;
    }

    /* renamed from: m */
    private C9808d[] m33517m() {
        int size = this.f26284b.size();
        if (size >= 3) {
            float f = 0.0f;
            if (size > 3) {
                float f2 = 0.0f;
                float f3 = 0.0f;
                for (C9808d i : this.f26284b) {
                    float i2 = i.mo24546i();
                    f2 += i2;
                    f3 += i2 * i2;
                }
                float f4 = (float) size;
                float f5 = f2 / f4;
                float sqrt = (float) Math.sqrt((double) ((f3 / f4) - (f5 * f5)));
                Collections.sort(this.f26284b, new C9812c(f5));
                float max = Math.max(0.2f * f5, sqrt);
                int i3 = 0;
                while (i3 < this.f26284b.size() && this.f26284b.size() > 3) {
                    if (Math.abs(this.f26284b.get(i3).mo24546i() - f5) > max) {
                        this.f26284b.remove(i3);
                        i3--;
                    }
                    i3++;
                }
            }
            if (this.f26284b.size() > 3) {
                for (C9808d i4 : this.f26284b) {
                    f += i4.mo24546i();
                }
                Collections.sort(this.f26284b, new C9811b(f / ((float) this.f26284b.size())));
                List<C9808d> list = this.f26284b;
                list.subList(3, list.size()).clear();
            }
            return new C9808d[]{this.f26284b.get(0), this.f26284b.get(1), this.f26284b.get(2)};
        }
        throw C9664j.m32854a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo24547b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C9813f mo24548f(Map<C9659e, ?> map) {
        boolean z = map != null && map.containsKey(C9659e.TRY_HARDER);
        int j = this.f26283a.mo24268j();
        int m = this.f26283a.mo24271m();
        int i = (j * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean z2 = false;
        while (i2 < j && !z2) {
            mo24547b(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < m) {
                if (this.f26283a.mo24264f(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 != 4) {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                } else if (!m33513h(iArr) || !mo24549k(iArr, i2, i3)) {
                    mo24550n(iArr);
                    i4 = 3;
                } else {
                    if (this.f26285c) {
                        z2 = m33516l();
                    } else {
                        int g = m33512g();
                        if (g > iArr[2]) {
                            i2 += (g - iArr[2]) - 2;
                            i3 = m - 1;
                        }
                    }
                    mo24547b(iArr);
                    i = 2;
                    i4 = 0;
                }
                i3++;
            }
            if (m33513h(iArr) && mo24549k(iArr, i2, m)) {
                i = iArr[0];
                if (this.f26285c) {
                    z2 = m33516l();
                }
            }
            i2 += i;
        }
        C9808d[] m2 = m33517m();
        C9670p.m32870e(m2);
        return new C9813f(m2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo24549k(int[] iArr, int i, int i2) {
        boolean z = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a = (int) m33508a(iArr, i2);
        float e = m33511e(i, a, iArr[2], i3);
        if (!Float.isNaN(e)) {
            int i4 = (int) e;
            float d = m33510d(a, i4, iArr[2], i3);
            if (!Float.isNaN(d) && m33509c(i4, (int) d)) {
                float f = ((float) i3) / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f26284b.size()) {
                        break;
                    }
                    C9808d dVar = this.f26284b.get(i5);
                    if (dVar.mo24543f(f, e, d)) {
                        this.f26284b.set(i5, dVar.mo24544g(e, d, f));
                        z = true;
                        break;
                    }
                    i5++;
                }
                if (!z) {
                    C9808d dVar2 = new C9808d(d, e, f);
                    this.f26284b.add(dVar2);
                    C9671q qVar = this.f26287e;
                    if (qVar != null) {
                        qVar.mo24235a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo24550n(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }
}
