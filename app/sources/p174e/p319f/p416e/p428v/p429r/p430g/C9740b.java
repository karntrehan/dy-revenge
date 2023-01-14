package p174e.p319f.p416e.p428v.p429r.p430g;

import p174e.p319f.p416e.p428v.p429r.C9734b;
import p174e.p319f.p416e.p428v.p429r.C9735c;

/* renamed from: e.f.e.v.r.g.b */
final class C9740b {

    /* renamed from: a */
    private final boolean f26102a;

    /* renamed from: b */
    private final C9734b f26103b;

    /* renamed from: c */
    private final C9734b f26104c;

    /* renamed from: d */
    private final C9735c f26105d;

    C9740b(C9734b bVar, C9734b bVar2, C9735c cVar, boolean z) {
        this.f26103b = bVar;
        this.f26104c = bVar2;
        this.f26105d = cVar;
        this.f26102a = z;
    }

    /* renamed from: a */
    private static boolean m33192a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: e */
    private static int m33193e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C9735c mo24378b() {
        return this.f26105d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C9734b mo24379c() {
        return this.f26103b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C9734b mo24380d() {
        return this.f26104c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9740b)) {
            return false;
        }
        C9740b bVar = (C9740b) obj;
        return m33192a(this.f26103b, bVar.f26103b) && m33192a(this.f26104c, bVar.f26104c) && m33192a(this.f26105d, bVar.f26105d);
    }

    /* renamed from: f */
    public boolean mo24382f() {
        return this.f26104c == null;
    }

    public int hashCode() {
        return (m33193e(this.f26103b) ^ m33193e(this.f26104c)) ^ m33193e(this.f26105d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f26103b);
        sb.append(" , ");
        sb.append(this.f26104c);
        sb.append(" : ");
        C9735c cVar = this.f26105d;
        sb.append(cVar == null ? "null" : Integer.valueOf(cVar.mo24372c()));
        sb.append(" ]");
        return sb.toString();
    }
}
