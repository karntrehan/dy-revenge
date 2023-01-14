package p174e.p319f.p416e.p428v.p429r.p430g.p431e;

import p174e.p319f.p416e.p420s.C9679a;

/* renamed from: e.f.e.v.r.g.e.j */
public abstract class C9752j {

    /* renamed from: a */
    private final C9679a f26121a;

    /* renamed from: b */
    private final C9762s f26122b;

    C9752j(C9679a aVar) {
        this.f26121a = aVar;
        this.f26122b = new C9762s(aVar);
    }

    /* renamed from: a */
    public static C9752j m33238a(C9679a aVar) {
        if (aVar.mo24248e(1)) {
            return new C9749g(aVar);
        }
        if (!aVar.mo24248e(2)) {
            return new C9753k(aVar);
        }
        int g = C9762s.m33269g(aVar, 1, 4);
        if (g == 4) {
            return new C9743a(aVar);
        }
        if (g == 5) {
            return new C9744b(aVar);
        }
        int g2 = C9762s.m33269g(aVar, 1, 5);
        if (g2 == 12) {
            return new C9745c(aVar);
        }
        if (g2 == 13) {
            return new C9746d(aVar);
        }
        switch (C9762s.m33269g(aVar, 1, 7)) {
            case 56:
                return new C9747e(aVar, "310", "11");
            case 57:
                return new C9747e(aVar, "320", "11");
            case 58:
                return new C9747e(aVar, "310", "13");
            case 59:
                return new C9747e(aVar, "320", "13");
            case 60:
                return new C9747e(aVar, "310", "15");
            case 61:
                return new C9747e(aVar, "320", "15");
            case 62:
                return new C9747e(aVar, "310", "17");
            case 63:
                return new C9747e(aVar, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(aVar)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C9762s mo24400b() {
        return this.f26122b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C9679a mo24401c() {
        return this.f26121a;
    }

    /* renamed from: d */
    public abstract String mo24396d();
}
