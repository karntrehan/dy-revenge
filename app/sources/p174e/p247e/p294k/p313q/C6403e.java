package p174e.p247e.p294k.p313q;

import android.graphics.Matrix;
import p174e.p247e.p253d.p257d.C6054f;
import p174e.p247e.p294k.p301e.C6316e;
import p174e.p247e.p294k.p301e.C6317f;
import p174e.p247e.p294k.p307k.C6369d;

/* renamed from: e.e.k.q.e */
public class C6403e {

    /* renamed from: a */
    public static final C6054f<Integer> f17837a = C6054f.m22819g(2, 7, 4, 5);

    /* renamed from: a */
    public static int m24495a(int i) {
        return Math.max(1, 8 / i);
    }

    /* renamed from: b */
    public static float m24496b(C6316e eVar, int i, int i2) {
        if (eVar == null) {
            return 1.0f;
        }
        float f = (float) i;
        float f2 = (float) i2;
        float max = Math.max(((float) eVar.f17470a) / f, ((float) eVar.f17471b) / f2);
        float f3 = eVar.f17472c;
        if (f * max > f3) {
            max = f3 / f;
        }
        return f2 * max > f3 ? f3 / f2 : max;
    }

    /* renamed from: c */
    private static int m24497c(C6369d dVar) {
        int i0 = dVar.mo18898i0();
        if (i0 == 90 || i0 == 180 || i0 == 270) {
            return dVar.mo18898i0();
        }
        return 0;
    }

    /* renamed from: d */
    public static int m24498d(C6317f fVar, C6369d dVar) {
        int I = dVar.mo18886I();
        C6054f<Integer> fVar2 = f17837a;
        int indexOf = fVar2.indexOf(Integer.valueOf(I));
        if (indexOf >= 0) {
            int i = 0;
            if (!fVar.mo18694g()) {
                i = fVar.mo18691e();
            }
            return fVar2.get((indexOf + (i / 90)) % fVar2.size()).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    /* renamed from: e */
    public static int m24499e(C6317f fVar, C6369d dVar) {
        if (!fVar.mo18693f()) {
            return 0;
        }
        int c = m24497c(dVar);
        return fVar.mo18694g() ? c : (c + fVar.mo18691e()) % 360;
    }

    /* renamed from: f */
    public static int m24500f(C6317f fVar, C6316e eVar, C6369d dVar, boolean z) {
        if (!z || eVar == null) {
            return 8;
        }
        int e = m24499e(fVar, dVar);
        boolean z2 = false;
        int d = f17837a.contains(Integer.valueOf(dVar.mo18886I())) ? m24498d(fVar, dVar) : 0;
        if (e == 90 || e == 270 || d == 5 || d == 7) {
            z2 = true;
        }
        int k = m24505k(m24496b(eVar, z2 ? dVar.mo18894c() : dVar.mo18896e(), z2 ? dVar.mo18896e() : dVar.mo18894c()), eVar.f17473d);
        if (k > 8) {
            return 8;
        }
        if (k < 1) {
            return 1;
        }
        return k;
    }

    /* renamed from: g */
    public static Matrix m24501g(C6369d dVar, C6317f fVar) {
        if (f17837a.contains(Integer.valueOf(dVar.mo18886I()))) {
            return m24502h(m24498d(fVar, dVar));
        }
        int e = m24499e(fVar, dVar);
        if (e == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) e);
        return matrix;
    }

    /* renamed from: h */
    private static Matrix m24502h(int i) {
        float f;
        Matrix matrix = new Matrix();
        if (i != 2) {
            if (i == 7) {
                f = -90.0f;
            } else if (i == 4) {
                f = 180.0f;
            } else if (i != 5) {
                return null;
            } else {
                f = 90.0f;
            }
            matrix.setRotate(f);
            matrix.postScale(-1.0f, 1.0f);
        } else {
            matrix.setScale(-1.0f, 1.0f);
        }
        return matrix;
    }

    /* renamed from: i */
    public static boolean m24503i(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: j */
    public static boolean m24504j(int i) {
        return i >= 0 && i <= 270 && i % 90 == 0;
    }

    /* renamed from: k */
    public static int m24505k(float f, float f2) {
        return (int) (f2 + (f * 8.0f));
    }
}
