package p174e.p319f.p320a.p335c.p345f.p352g;

import sun.misc.Unsafe;

/* renamed from: e.f.a.c.f.g.qb */
final class C6966qb extends C6998sb {
    C6966qb(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo20107a(Object obj, long j) {
        return Double.longBitsToDouble(mo20162k(obj, j));
    }

    /* renamed from: b */
    public final float mo20108b(Object obj, long j) {
        return Float.intBitsToFloat(mo20161j(obj, j));
    }

    /* renamed from: c */
    public final void mo20109c(Object obj, long j, boolean z) {
        if (C7014tb.f18968h) {
            C7014tb.m26613d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            C7014tb.m26614e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo20110d(Object obj, long j, byte b) {
        if (C7014tb.f18968h) {
            C7014tb.m26613d(obj, j, b);
        } else {
            C7014tb.m26614e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo20111e(Object obj, long j, double d) {
        mo20166o(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo20112f(Object obj, long j, float f) {
        mo20165n(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo20113g(Object obj, long j) {
        return C7014tb.f18968h ? C7014tb.m26634y(obj, j) : C7014tb.m26635z(obj, j);
    }
}
