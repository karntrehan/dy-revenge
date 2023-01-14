package p174e.p181b.p182a.p188w.p190k;

import android.graphics.Path;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.p184u.p185b.C5480c;
import p174e.p181b.p182a.p184u.p185b.C5484g;
import p174e.p181b.p182a.p188w.p189j.C5533a;
import p174e.p181b.p182a.p188w.p189j.C5536d;
import p174e.p181b.p182a.p188w.p191l.C5571a;

/* renamed from: e.b.a.w.k.m */
public class C5562m implements C5548b {

    /* renamed from: a */
    private final boolean f15722a;

    /* renamed from: b */
    private final Path.FillType f15723b;

    /* renamed from: c */
    private final String f15724c;

    /* renamed from: d */
    private final C5533a f15725d;

    /* renamed from: e */
    private final C5536d f15726e;

    /* renamed from: f */
    private final boolean f15727f;

    public C5562m(String str, boolean z, Path.FillType fillType, C5533a aVar, C5536d dVar, boolean z2) {
        this.f15724c = str;
        this.f15722a = z;
        this.f15723b = fillType;
        this.f15725d = aVar;
        this.f15726e = dVar;
        this.f15727f = z2;
    }

    /* renamed from: a */
    public C5480c mo16698a(C5442g gVar, C5571a aVar) {
        return new C5484g(gVar, aVar, this);
    }

    /* renamed from: b */
    public C5533a mo16773b() {
        return this.f15725d;
    }

    /* renamed from: c */
    public Path.FillType mo16774c() {
        return this.f15723b;
    }

    /* renamed from: d */
    public String mo16775d() {
        return this.f15724c;
    }

    /* renamed from: e */
    public C5536d mo16776e() {
        return this.f15726e;
    }

    /* renamed from: f */
    public boolean mo16777f() {
        return this.f15727f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f15722a + '}';
    }
}
