package p174e.p199d.p218c.p238w;

import p174e.p199d.p200a.p211p.C5685a;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.p238w.p240i.C5922d;
import p174e.p199d.p218c.p238w.p240i.C5925g;
import p174e.p199d.p218c.p238w.p240i.C5928j;
import p174e.p199d.p218c.p238w.p240i.C5931m;
import p174e.p199d.p218c.p238w.p240i.C5934p;
import p174e.p199d.p218c.p238w.p240i.C5937s;
import p174e.p199d.p218c.p238w.p241j.C5938a;
import p174e.p199d.p218c.p238w.p241j.C5939b;

/* renamed from: e.d.c.w.e */
public class C5891e {

    /* renamed from: a */
    public static Long f16373a;

    /* renamed from: b */
    public static Long f16374b;

    /* renamed from: c */
    public static Long f16375c;

    /* renamed from: d */
    public static Long f16376d;

    /* renamed from: e */
    private C5685a f16377e;

    public C5891e(C5685a aVar) {
        this.f16377e = aVar;
    }

    /* renamed from: a */
    public C5685a mo17821a(String str, C5732e eVar) {
        return str.equals("mdir") ? new C5939b(eVar) : str.equals("mdta") ? new C5938a(eVar) : str.equals("soun") ? new C5925g(eVar) : str.equals("vide") ? new C5937s(eVar) : str.equals("tmcd") ? new C5934p(eVar) : str.equals("text") ? new C5931m(eVar) : str.equals("sbtl") ? new C5928j(eVar) : str.equals("musi") ? new C5922d(eVar) : this.f16377e;
    }
}
