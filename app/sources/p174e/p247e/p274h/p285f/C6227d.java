package p174e.p247e.p274h.p285f;

import java.util.Arrays;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: e.e.h.f.d */
public class C6227d {

    /* renamed from: a */
    private C6228a f17250a = C6228a.BITMAP_ONLY;

    /* renamed from: b */
    private boolean f17251b = false;

    /* renamed from: c */
    private float[] f17252c = null;

    /* renamed from: d */
    private int f17253d = 0;

    /* renamed from: e */
    private float f17254e = 0.0f;

    /* renamed from: f */
    private int f17255f = 0;

    /* renamed from: g */
    private float f17256g = 0.0f;

    /* renamed from: h */
    private boolean f17257h = false;

    /* renamed from: i */
    private boolean f17258i = false;

    /* renamed from: e.e.h.f.d$a */
    public enum C6228a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    /* renamed from: a */
    public static C6227d m23591a(float f) {
        return new C6227d().mo18508n(f);
    }

    /* renamed from: e */
    private float[] m23592e() {
        if (this.f17252c == null) {
            this.f17252c = new float[8];
        }
        return this.f17252c;
    }

    /* renamed from: b */
    public int mo18495b() {
        return this.f17255f;
    }

    /* renamed from: c */
    public float mo18496c() {
        return this.f17254e;
    }

    /* renamed from: d */
    public float[] mo18497d() {
        return this.f17252c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6227d.class != obj.getClass()) {
            return false;
        }
        C6227d dVar = (C6227d) obj;
        if (this.f17251b == dVar.f17251b && this.f17253d == dVar.f17253d && Float.compare(dVar.f17254e, this.f17254e) == 0 && this.f17255f == dVar.f17255f && Float.compare(dVar.f17256g, this.f17256g) == 0 && this.f17250a == dVar.f17250a && this.f17257h == dVar.f17257h && this.f17258i == dVar.f17258i) {
            return Arrays.equals(this.f17252c, dVar.f17252c);
        }
        return false;
    }

    /* renamed from: f */
    public int mo18499f() {
        return this.f17253d;
    }

    /* renamed from: g */
    public float mo18500g() {
        return this.f17256g;
    }

    /* renamed from: h */
    public boolean mo18501h() {
        return this.f17258i;
    }

    public int hashCode() {
        C6228a aVar = this.f17250a;
        int i = 0;
        int hashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + (this.f17251b ? 1 : 0)) * 31;
        float[] fArr = this.f17252c;
        int hashCode2 = (((hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f17253d) * 31;
        float f = this.f17254e;
        int floatToIntBits = (((hashCode2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f17255f) * 31;
        float f2 = this.f17256g;
        if (f2 != 0.0f) {
            i = Float.floatToIntBits(f2);
        }
        return ((((floatToIntBits + i) * 31) + (this.f17257h ? 1 : 0)) * 31) + (this.f17258i ? 1 : 0);
    }

    /* renamed from: i */
    public boolean mo18503i() {
        return this.f17251b;
    }

    /* renamed from: j */
    public C6228a mo18504j() {
        return this.f17250a;
    }

    /* renamed from: k */
    public boolean mo18505k() {
        return this.f17257h;
    }

    /* renamed from: l */
    public C6227d mo18506l(int i, float f) {
        C6062k.m22835c(f >= 0.0f, "the border width cannot be < 0");
        this.f17254e = f;
        this.f17255f = i;
        return this;
    }

    /* renamed from: m */
    public C6227d mo18507m(float f, float f2, float f3, float f4) {
        float[] e = m23592e();
        e[1] = f;
        e[0] = f;
        e[3] = f2;
        e[2] = f2;
        e[5] = f3;
        e[4] = f3;
        e[7] = f4;
        e[6] = f4;
        return this;
    }

    /* renamed from: n */
    public C6227d mo18508n(float f) {
        Arrays.fill(m23592e(), f);
        return this;
    }

    /* renamed from: o */
    public C6227d mo18509o(int i) {
        this.f17253d = i;
        this.f17250a = C6228a.OVERLAY_COLOR;
        return this;
    }

    /* renamed from: p */
    public C6227d mo18510p(C6228a aVar) {
        this.f17250a = aVar;
        return this;
    }
}
