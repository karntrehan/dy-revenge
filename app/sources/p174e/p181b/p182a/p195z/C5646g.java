package p174e.p181b.p182a.p195z;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p174e.p181b.p182a.p184u.p185b.C5488k;
import p174e.p181b.p182a.p188w.C5523a;
import p174e.p181b.p182a.p188w.C5528e;
import p174e.p181b.p182a.p188w.p190k.C5561l;

/* renamed from: e.b.a.z.g */
public class C5646g {

    /* renamed from: a */
    private static PointF f15976a = new PointF();

    /* renamed from: a */
    public static PointF m21053a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    public static double m21054b(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    /* renamed from: c */
    public static float m21055c(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: d */
    public static int m21056d(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* renamed from: e */
    public static boolean m21057e(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: f */
    private static int m21058f(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    /* renamed from: g */
    static int m21059g(float f, float f2) {
        return m21060h((int) f, (int) f2);
    }

    /* renamed from: h */
    private static int m21060h(int i, int i2) {
        return i - (i2 * m21058f(i, i2));
    }

    /* renamed from: i */
    public static void m21061i(C5561l lVar, Path path) {
        path.reset();
        PointF b = lVar.mo16769b();
        path.moveTo(b.x, b.y);
        f15976a.set(b.x, b.y);
        for (int i = 0; i < lVar.mo16768a().size(); i++) {
            C5523a aVar = lVar.mo16768a().get(i);
            PointF a = aVar.mo16664a();
            PointF b2 = aVar.mo16665b();
            PointF c = aVar.mo16666c();
            if (!a.equals(f15976a) || !b2.equals(c)) {
                path.cubicTo(a.x, a.y, b2.x, b2.y, c.x, c.y);
            } else {
                path.lineTo(c.x, c.y);
            }
            f15976a.set(c.x, c.y);
        }
        if (lVar.mo16771d()) {
            path.close();
        }
    }

    /* renamed from: j */
    public static double m21062j(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: k */
    public static float m21063k(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: l */
    public static int m21064l(int i, int i2, float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    /* renamed from: m */
    public static void m21065m(C5528e eVar, int i, List<C5528e> list, C5528e eVar2, C5488k kVar) {
        if (eVar.mo16679c(kVar.getName(), i)) {
            list.add(eVar2.mo16678a(kVar.getName()).mo16684i(kVar));
        }
    }
}
