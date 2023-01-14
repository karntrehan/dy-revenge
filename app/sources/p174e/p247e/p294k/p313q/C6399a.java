package p174e.p247e.p294k.p313q;

import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p293j.C6252b;
import p174e.p247e.p294k.p301e.C6316e;
import p174e.p247e.p294k.p301e.C6317f;
import p174e.p247e.p294k.p307k.C6369d;

/* renamed from: e.e.k.q.a */
public class C6399a {
    /* renamed from: a */
    public static float m24484a(C6317f fVar, C6316e eVar, C6369d dVar) {
        C6062k.m22834b(Boolean.valueOf(C6369d.m24311x0(dVar)));
        if (eVar == null || eVar.f17471b <= 0 || eVar.f17470a <= 0 || dVar.mo18896e() == 0 || dVar.mo18894c() == 0) {
            return 1.0f;
        }
        int d = m24487d(fVar, dVar);
        boolean z = d == 90 || d == 270;
        int c = z ? dVar.mo18894c() : dVar.mo18896e();
        int e = z ? dVar.mo18896e() : dVar.mo18894c();
        float f = ((float) eVar.f17470a) / ((float) c);
        float f2 = ((float) eVar.f17471b) / ((float) e);
        float max = Math.max(f, f2);
        C6071a.m22854B("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(eVar.f17470a), Integer.valueOf(eVar.f17471b), Integer.valueOf(c), Integer.valueOf(e), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(max));
        return max;
    }

    /* renamed from: b */
    public static int m24485b(C6317f fVar, C6316e eVar, C6369d dVar, int i) {
        if (!C6369d.m24311x0(dVar)) {
            return 1;
        }
        float a = m24484a(fVar, eVar, dVar);
        int f = dVar.mo18891W() == C6252b.f17318a ? m24489f(a) : m24488e(a);
        int max = Math.max(dVar.mo18894c(), dVar.mo18896e());
        float f2 = eVar != null ? eVar.f17472c : (float) i;
        while (((float) (max / f)) > f2) {
            f = dVar.mo18891W() == C6252b.f17318a ? f * 2 : f + 1;
        }
        return f;
    }

    /* renamed from: c */
    public static int m24486c(C6369d dVar, int i, int i2) {
        int n0 = dVar.mo18899n0();
        while ((((dVar.mo18896e() * dVar.mo18894c()) * i) / n0) / n0 > i2) {
            n0 *= 2;
        }
        return n0;
    }

    /* renamed from: d */
    private static int m24487d(C6317f fVar, C6369d dVar) {
        boolean z = false;
        if (!fVar.mo18694g()) {
            return 0;
        }
        int i0 = dVar.mo18898i0();
        if (i0 == 0 || i0 == 90 || i0 == 180 || i0 == 270) {
            z = true;
        }
        C6062k.m22834b(Boolean.valueOf(z));
        return i0;
    }

    /* renamed from: e */
    public static int m24488e(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            double d = (double) i;
            if ((1.0d / d) + ((1.0d / (Math.pow(d, 2.0d) - d)) * 0.3333333432674408d) <= ((double) f)) {
                return i - 1;
            }
            i++;
        }
    }

    /* renamed from: f */
    public static int m24489f(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            int i2 = i * 2;
            double d = 1.0d / ((double) i2);
            if (d + (0.3333333432674408d * d) <= ((double) f)) {
                return i;
            }
            i = i2;
        }
    }
}
