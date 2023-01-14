package p174e.p181b.p182a.p188w;

/* renamed from: e.b.a.w.b */
public class C5524b {

    /* renamed from: a */
    public final String f15590a;

    /* renamed from: b */
    public final String f15591b;

    /* renamed from: c */
    public final float f15592c;

    /* renamed from: d */
    public final C5525a f15593d;

    /* renamed from: e */
    public final int f15594e;

    /* renamed from: f */
    public final float f15595f;

    /* renamed from: g */
    public final float f15596g;

    /* renamed from: h */
    public final int f15597h;

    /* renamed from: i */
    public final int f15598i;

    /* renamed from: j */
    public final float f15599j;

    /* renamed from: k */
    public final boolean f15600k;

    /* renamed from: e.b.a.w.b$a */
    public enum C5525a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public C5524b(String str, String str2, float f, C5525a aVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        this.f15590a = str;
        this.f15591b = str2;
        this.f15592c = f;
        this.f15593d = aVar;
        this.f15594e = i;
        this.f15595f = f2;
        this.f15596g = f3;
        this.f15597h = i2;
        this.f15598i = i3;
        this.f15599j = f4;
        this.f15600k = z;
    }

    public int hashCode() {
        int hashCode = (((((int) (((float) (((this.f15590a.hashCode() * 31) + this.f15591b.hashCode()) * 31)) + this.f15592c)) * 31) + this.f15593d.ordinal()) * 31) + this.f15594e;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f15595f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f15597h;
    }
}
