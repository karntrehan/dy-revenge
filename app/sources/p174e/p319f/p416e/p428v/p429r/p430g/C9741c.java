package p174e.p319f.p416e.p428v.p429r.p430g;

import java.util.ArrayList;
import java.util.List;

/* renamed from: e.f.e.v.r.g.c */
final class C9741c {

    /* renamed from: a */
    private final List<C9740b> f26106a;

    /* renamed from: b */
    private final int f26107b;

    /* renamed from: c */
    private final boolean f26108c;

    C9741c(List<C9740b> list, int i, boolean z) {
        this.f26106a = new ArrayList(list);
        this.f26107b = i;
        this.f26108c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C9740b> mo24385a() {
        return this.f26106a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo24386b() {
        return this.f26107b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo24387c(List<C9740b> list) {
        return this.f26106a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9741c)) {
            return false;
        }
        C9741c cVar = (C9741c) obj;
        return this.f26106a.equals(cVar.mo24385a()) && this.f26108c == cVar.f26108c;
    }

    public int hashCode() {
        return this.f26106a.hashCode() ^ Boolean.valueOf(this.f26108c).hashCode();
    }

    public String toString() {
        return "{ " + this.f26106a + " }";
    }
}
