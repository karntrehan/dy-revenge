package p174e.p181b.p182a.p188w.p190k;

import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.p184u.p185b.C5480c;
import p174e.p181b.p182a.p184u.p185b.C5489l;
import p174e.p181b.p182a.p188w.p191l.C5571a;
import p174e.p181b.p182a.p195z.C5643d;

/* renamed from: e.b.a.w.k.h */
public class C5555h implements C5548b {

    /* renamed from: a */
    private final String f15686a;

    /* renamed from: b */
    private final C5556a f15687b;

    /* renamed from: c */
    private final boolean f15688c;

    /* renamed from: e.b.a.w.k.h$a */
    public enum C5556a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        /* renamed from: e */
        public static C5556a m20696e(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public C5555h(String str, C5556a aVar, boolean z) {
        this.f15686a = str;
        this.f15687b = aVar;
        this.f15688c = z;
    }

    /* renamed from: a */
    public C5480c mo16698a(C5442g gVar, C5571a aVar) {
        if (gVar.mo16543o()) {
            return new C5489l(this);
        }
        C5643d.m21027c("Animation contains merge paths but they are disabled.");
        return null;
    }

    /* renamed from: b */
    public C5556a mo16743b() {
        return this.f15687b;
    }

    /* renamed from: c */
    public String mo16744c() {
        return this.f15686a;
    }

    /* renamed from: d */
    public boolean mo16745d() {
        return this.f15688c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f15687b + '}';
    }
}
