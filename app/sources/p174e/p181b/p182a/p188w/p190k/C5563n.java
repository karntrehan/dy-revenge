package p174e.p181b.p182a.p188w.p190k;

import java.util.Arrays;
import java.util.List;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.p184u.p185b.C5480c;
import p174e.p181b.p182a.p184u.p185b.C5481d;
import p174e.p181b.p182a.p188w.p191l.C5571a;

/* renamed from: e.b.a.w.k.n */
public class C5563n implements C5548b {

    /* renamed from: a */
    private final String f15728a;

    /* renamed from: b */
    private final List<C5548b> f15729b;

    /* renamed from: c */
    private final boolean f15730c;

    public C5563n(String str, List<C5548b> list, boolean z) {
        this.f15728a = str;
        this.f15729b = list;
        this.f15730c = z;
    }

    /* renamed from: a */
    public C5480c mo16698a(C5442g gVar, C5571a aVar) {
        return new C5481d(gVar, aVar, this);
    }

    /* renamed from: b */
    public List<C5548b> mo16779b() {
        return this.f15729b;
    }

    /* renamed from: c */
    public String mo16780c() {
        return this.f15728a;
    }

    /* renamed from: d */
    public boolean mo16781d() {
        return this.f15730c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f15728a + "' Shapes: " + Arrays.toString(this.f15729b.toArray()) + '}';
    }
}
