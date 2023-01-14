package p174e.p247e.p294k.p301e;

import java.util.Locale;
import p174e.p247e.p253d.p264k.C6106b;

/* renamed from: e.e.k.e.f */
public class C6317f {

    /* renamed from: a */
    private static final C6317f f17474a = new C6317f(-1, false);

    /* renamed from: b */
    private static final C6317f f17475b = new C6317f(-2, false);

    /* renamed from: c */
    private static final C6317f f17476c = new C6317f(-1, true);

    /* renamed from: d */
    private final int f17477d;

    /* renamed from: e */
    private final boolean f17478e;

    private C6317f(int i, boolean z) {
        this.f17477d = i;
        this.f17478e = z;
    }

    /* renamed from: a */
    public static C6317f m23927a() {
        return f17474a;
    }

    /* renamed from: b */
    public static C6317f m23928b() {
        return f17476c;
    }

    /* renamed from: d */
    public static C6317f m23929d() {
        return f17475b;
    }

    /* renamed from: c */
    public boolean mo18690c() {
        return this.f17478e;
    }

    /* renamed from: e */
    public int mo18691e() {
        if (!mo18694g()) {
            return this.f17477d;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6317f)) {
            return false;
        }
        C6317f fVar = (C6317f) obj;
        return this.f17477d == fVar.f17477d && this.f17478e == fVar.f17478e;
    }

    /* renamed from: f */
    public boolean mo18693f() {
        return this.f17477d != -2;
    }

    /* renamed from: g */
    public boolean mo18694g() {
        return this.f17477d == -1;
    }

    public int hashCode() {
        return C6106b.m22990c(Integer.valueOf(this.f17477d), Boolean.valueOf(this.f17478e));
    }

    public String toString() {
        return String.format((Locale) null, "%d defer:%b", new Object[]{Integer.valueOf(this.f17477d), Boolean.valueOf(this.f17478e)});
    }
}
