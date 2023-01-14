package p174e.p319f.p320a.p335c.p345f.p357l;

import sun.misc.Unsafe;

/* renamed from: e.f.a.c.f.l.sf */
final class C8458sf extends C8476tf {
    C8458sf(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo22121a(Object obj, long j) {
        return Double.longBitsToDouble(mo22154k(obj, j));
    }

    /* renamed from: b */
    public final float mo22122b(Object obj, long j) {
        return Float.intBitsToFloat(mo22153j(obj, j));
    }

    /* renamed from: c */
    public final void mo22123c(Object obj, long j, boolean z) {
        if (C8494uf.f23140i) {
            C8494uf.m29098d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            C8494uf.m29099e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo22124d(Object obj, long j, byte b) {
        if (C8494uf.f23140i) {
            C8494uf.m29098d(obj, j, b);
        } else {
            C8494uf.m29099e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo22125e(Object obj, long j, double d) {
        mo22158o(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo22126f(Object obj, long j, float f) {
        mo22157n(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo22127g(Object obj, long j) {
        return C8494uf.f23140i ? C8494uf.m29119y(obj, j) : C8494uf.m29120z(obj, j);
    }
}
