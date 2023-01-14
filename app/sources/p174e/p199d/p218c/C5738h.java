package p174e.p199d.p218c;

/* renamed from: e.d.c.h */
public class C5738h {

    /* renamed from: a */
    private final int f16213a;

    /* renamed from: b */
    private final C5722b f16214b;

    public C5738h(int i, C5722b bVar) {
        this.f16213a = i;
        this.f16214b = bVar;
    }

    /* renamed from: a */
    public String mo17182a() {
        return this.f16214b.mo17142f(this.f16213a);
    }

    /* renamed from: b */
    public String mo17183b() {
        return this.f16214b.mo17158v(this.f16213a);
    }

    /* renamed from: c */
    public int mo17184c() {
        return this.f16213a;
    }

    public String toString() {
        String a = mo17182a();
        if (a == null) {
            a = this.f16214b.mo17153r(mo17184c()) + " (unable to formulate description)";
        }
        return "[" + this.f16214b.mo17104n() + "] " + mo17183b() + " - " + a;
    }
}
