package p174e.p319f.p416e.p436x.p438c;

import java.util.Map;
import p174e.p319f.p416e.C9659e;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.C9670p;
import p174e.p319f.p416e.C9671q;
import p174e.p319f.p416e.p420s.C9680b;
import p174e.p319f.p416e.p420s.C9685g;
import p174e.p319f.p416e.p420s.C9687i;
import p174e.p319f.p416e.p420s.C9689k;
import p174e.p319f.p416e.p420s.p421m.C9691a;
import p174e.p319f.p416e.p436x.p437b.C9802j;

/* renamed from: e.f.e.x.c.c */
public class C9807c {

    /* renamed from: a */
    private final C9680b f26279a;

    /* renamed from: b */
    private C9671q f26280b;

    public C9807c(C9680b bVar) {
        this.f26279a = bVar;
    }

    /* renamed from: b */
    private float m33494b(C9670p pVar, C9670p pVar2) {
        float j = m33499j((int) pVar.mo24230c(), (int) pVar.mo24231d(), (int) pVar2.mo24230c(), (int) pVar2.mo24231d());
        float j2 = m33499j((int) pVar2.mo24230c(), (int) pVar2.mo24231d(), (int) pVar.mo24230c(), (int) pVar.mo24231d());
        return Float.isNaN(j) ? j2 / 7.0f : Float.isNaN(j2) ? j / 7.0f : (j + j2) / 14.0f;
    }

    /* renamed from: c */
    private static int m33495c(C9670p pVar, C9670p pVar2, C9670p pVar3, float f) {
        int c = ((C9691a.m32982c(C9670p.m32869b(pVar, pVar2) / f) + C9691a.m32982c(C9670p.m32869b(pVar, pVar3) / f)) / 2) + 7;
        int i = c & 3;
        if (i == 0) {
            return c + 1;
        }
        if (i == 2) {
            return c - 1;
        }
        if (i != 3) {
            return c;
        }
        throw C9664j.m32854a();
    }

    /* renamed from: d */
    private static C9689k m33496d(C9670p pVar, C9670p pVar2, C9670p pVar3, C9670p pVar4, int i) {
        float f;
        float f2;
        float f3;
        float f4 = ((float) i) - 3.5f;
        if (pVar4 != null) {
            f2 = pVar4.mo24230c();
            f = pVar4.mo24231d();
            f3 = f4 - 3.0f;
        } else {
            f2 = (pVar2.mo24230c() - pVar.mo24230c()) + pVar3.mo24230c();
            f = (pVar2.mo24231d() - pVar.mo24231d()) + pVar3.mo24231d();
            f3 = f4;
        }
        return C9689k.m32973b(3.5f, 3.5f, f4, 3.5f, f3, f3, 3.5f, f4, pVar.mo24230c(), pVar.mo24231d(), pVar2.mo24230c(), pVar2.mo24231d(), f2, f, pVar3.mo24230c(), pVar3.mo24231d());
    }

    /* renamed from: h */
    private static C9680b m33497h(C9680b bVar, C9689k kVar, int i) {
        return C9687i.m32964b().mo24296d(bVar, i, i, kVar);
    }

    /* renamed from: i */
    private float m33498i(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        C9807c cVar;
        boolean z2;
        int i10 = 1;
        boolean z3 = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z3) {
            i7 = i;
            i8 = i2;
            i5 = i3;
            i6 = i4;
        } else {
            i8 = i;
            i7 = i2;
            i6 = i3;
            i5 = i4;
        }
        int abs = Math.abs(i6 - i8);
        int abs2 = Math.abs(i5 - i7);
        int i11 = (-abs) / 2;
        int i12 = -1;
        int i13 = i8 < i6 ? 1 : -1;
        if (i7 < i5) {
            i12 = 1;
        }
        int i14 = i6 + i13;
        int i15 = i8;
        int i16 = i7;
        int i17 = 0;
        while (true) {
            if (i15 == i14) {
                i9 = i14;
                break;
            }
            int i18 = z3 ? i16 : i15;
            int i19 = z3 ? i15 : i16;
            if (i17 == i10) {
                cVar = this;
                z = z3;
                i9 = i14;
                z2 = true;
            } else {
                cVar = this;
                z = z3;
                i9 = i14;
                z2 = false;
            }
            if (z2 == cVar.f26279a.mo24264f(i18, i19)) {
                if (i17 == 2) {
                    return C9691a.m32981b(i15, i16, i8, i7);
                }
                i17++;
            }
            i11 += abs2;
            if (i11 > 0) {
                if (i16 == i5) {
                    break;
                }
                i16 += i12;
                i11 -= abs;
            }
            i15 += i13;
            i14 = i9;
            z3 = z;
            i10 = 1;
        }
        if (i17 == 2) {
            return C9691a.m32981b(i9, i5, i8, i7);
        }
        return Float.NaN;
    }

    /* renamed from: j */
    private float m33499j(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float i5 = m33498i(i, i2, i3, i4);
        int i6 = i - (i3 - i);
        int i7 = 0;
        if (i6 < 0) {
            f = ((float) i) / ((float) (i - i6));
            i6 = 0;
        } else if (i6 >= this.f26279a.mo24271m()) {
            f = ((float) ((this.f26279a.mo24271m() - 1) - i)) / ((float) (i6 - i));
            i6 = this.f26279a.mo24271m() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = (float) i2;
        int i8 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i8 < 0) {
            f2 = f3 / ((float) (i2 - i8));
        } else if (i8 >= this.f26279a.mo24268j()) {
            f2 = ((float) ((this.f26279a.mo24268j() - 1) - i2)) / ((float) (i8 - i2));
            i7 = this.f26279a.mo24268j() - 1;
        } else {
            i7 = i8;
            f2 = 1.0f;
        }
        return (i5 + m33498i(i, i2, (int) (((float) i) + (((float) (i6 - i)) * f2)), i7)) - 1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo24539a(C9670p pVar, C9670p pVar2, C9670p pVar3) {
        return (m33494b(pVar, pVar2) + m33494b(pVar, pVar3)) / 2.0f;
    }

    /* renamed from: e */
    public final C9685g mo24540e(Map<C9659e, ?> map) {
        C9671q qVar = map == null ? null : (C9671q) map.get(C9659e.NEED_RESULT_POINT_CALLBACK);
        this.f26280b = qVar;
        return mo24542g(new C9809e(this.f26279a, qVar).mo24548f(map));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C9805a mo24541f(float f, int i, int i2, float f2) {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f26279a.mo24271m() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (((float) min) >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f26279a.mo24268j() - 1, i2 + i3) - max2;
            if (((float) min2) >= f3) {
                return new C9806b(this.f26279a, max, max2, min, min2, f, this.f26280b).mo24538c();
            }
            throw C9664j.m32854a();
        }
        throw C9664j.m32854a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C9685g mo24542g(C9813f fVar) {
        C9670p[] pVarArr;
        C9808d b = fVar.mo24556b();
        C9808d c = fVar.mo24557c();
        C9808d a = fVar.mo24555a();
        float a2 = mo24539a(b, c, a);
        if (a2 >= 1.0f) {
            int c2 = m33495c(b, c, a, a2);
            C9802j g = C9802j.m33475g(c2);
            int e = g.mo24527e() - 7;
            C9805a aVar = null;
            if (g.mo24526d().length > 0) {
                float c3 = (c.mo24230c() - b.mo24230c()) + a.mo24230c();
                float d = (c.mo24231d() - b.mo24231d()) + a.mo24231d();
                float f = 1.0f - (3.0f / ((float) e));
                int c4 = (int) (b.mo24230c() + ((c3 - b.mo24230c()) * f));
                int d2 = (int) (b.mo24231d() + (f * (d - b.mo24231d())));
                int i = 4;
                while (true) {
                    if (i > 16) {
                        break;
                    }
                    try {
                        aVar = mo24541f(a2, c4, d2, (float) i);
                        break;
                    } catch (C9664j unused) {
                        i <<= 1;
                    }
                }
            }
            C9680b h = m33497h(this.f26279a, m33496d(b, c, a, aVar, c2), c2);
            if (aVar == null) {
                pVarArr = new C9670p[]{a, b, c};
            } else {
                pVarArr = new C9670p[]{a, b, c, aVar};
            }
            return new C9685g(h, pVarArr);
        }
        throw C9664j.m32854a();
    }
}
