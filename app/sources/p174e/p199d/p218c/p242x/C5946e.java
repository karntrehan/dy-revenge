package p174e.p199d.p218c.p242x;

import p174e.p199d.p200a.p207l.C5672a;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.p242x.p243g.C5952e;
import p174e.p199d.p218c.p242x.p244h.C5964c;
import p174e.p199d.p218c.p242x.p244h.C5968g;
import p174e.p199d.p218c.p242x.p244h.C5971j;
import p174e.p199d.p218c.p242x.p244h.C5974m;
import p174e.p199d.p218c.p242x.p244h.C5977p;

/* renamed from: e.d.c.x.e */
public class C5946e {

    /* renamed from: a */
    public static Long f16493a;

    /* renamed from: b */
    public static Long f16494b;

    /* renamed from: c */
    public static Long f16495c;

    /* renamed from: d */
    public static Long f16496d;

    /* renamed from: e */
    public static String f16497e;

    /* renamed from: f */
    private C5672a f16498f;

    public C5946e(C5672a aVar) {
        this.f16498f = aVar;
    }

    /* renamed from: a */
    public C5672a mo17856a(C5952e eVar, C5732e eVar2) {
        String a = eVar.mo17863a();
        return a.equals("soun") ? new C5971j(eVar2) : a.equals("vide") ? new C5977p(eVar2) : a.equals("hint") ? new C5964c(eVar2) : a.equals("text") ? new C5974m(eVar2) : a.equals("meta") ? new C5968g(eVar2) : this.f16498f;
    }
}
