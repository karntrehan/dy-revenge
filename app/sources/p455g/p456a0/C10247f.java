package p455g.p456a0;

import p455g.p456a0.C10240a;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.a0.f */
class C10247f extends C10246e {
    /* renamed from: b */
    public static int m34826b(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: c */
    public static long m34827c(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: d */
    public static int m34828d(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: e */
    public static long m34829e(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: f */
    public static int m34830f(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* renamed from: g */
    public static C10240a m34831g(int i, int i2) {
        return C10240a.f27478f.mo25556a(i, i2, -1);
    }

    /* renamed from: h */
    public static C10240a m34832h(C10240a aVar, int i) {
        C10457l.m35320e(aVar, "<this>");
        C10246e.m34825a(i > 0, Integer.valueOf(i));
        C10240a.C10241a aVar2 = C10240a.f27478f;
        int b = aVar.mo25547b();
        int g = aVar.mo25549g();
        if (aVar.mo25550h() <= 0) {
            i = -i;
        }
        return aVar2.mo25556a(b, g, i);
    }

    /* renamed from: i */
    public static C10243c m34833i(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? C10243c.f27486r.mo25562a() : new C10243c(i, i2 - 1);
    }
}
