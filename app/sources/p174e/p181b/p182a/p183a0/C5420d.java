package p174e.p181b.p182a.p183a0;

/* renamed from: e.b.a.a0.d */
public class C5420d {

    /* renamed from: a */
    private float f15139a;

    /* renamed from: b */
    private float f15140b;

    public C5420d() {
        this(1.0f, 1.0f);
    }

    public C5420d(float f, float f2) {
        this.f15139a = f;
        this.f15140b = f2;
    }

    /* renamed from: a */
    public boolean mo16372a(float f, float f2) {
        return this.f15139a == f && this.f15140b == f2;
    }

    /* renamed from: b */
    public float mo16373b() {
        return this.f15139a;
    }

    /* renamed from: c */
    public float mo16374c() {
        return this.f15140b;
    }

    /* renamed from: d */
    public void mo16375d(float f, float f2) {
        this.f15139a = f;
        this.f15140b = f2;
    }

    public String toString() {
        return mo16373b() + "x" + mo16374c();
    }
}
