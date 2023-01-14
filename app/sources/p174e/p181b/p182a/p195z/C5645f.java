package p174e.p181b.p182a.p195z;

/* renamed from: e.b.a.z.f */
public class C5645f {

    /* renamed from: a */
    private float f15974a;

    /* renamed from: b */
    private int f15975b;

    /* renamed from: a */
    public void mo16925a(float f) {
        float f2 = this.f15974a + f;
        this.f15974a = f2;
        int i = this.f15975b + 1;
        this.f15975b = i;
        if (i == Integer.MAX_VALUE) {
            this.f15974a = f2 / 2.0f;
            this.f15975b = i / 2;
        }
    }
}
