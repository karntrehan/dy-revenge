package p174e.p199d.p218c.p238w;

import p174e.p199d.p200a.p211p.C5685a;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.p238w.p239h.C5894a;
import p174e.p199d.p218c.p238w.p239h.C5895b;
import p174e.p199d.p218c.p238w.p239h.C5897d;
import p174e.p199d.p218c.p238w.p239h.C5898e;
import p174e.p199d.p218c.p238w.p239h.C5899f;

/* renamed from: e.d.c.w.a */
public class C5887a extends C5685a<C5890d> {

    /* renamed from: c */
    private C5891e f16366c = new C5891e(this);

    public C5887a(C5732e eVar) {
        super(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C5890d mo16975b() {
        return new C5890d();
    }

    /* renamed from: c */
    public C5685a mo16976c(C5894a aVar, byte[] bArr) {
        if (bArr != null) {
            C5713n nVar = new C5713n(bArr);
            if (aVar.f16379b.equals("mvhd")) {
                new C5899f(nVar, aVar).mo17829a(this.f16129b);
            } else if (aVar.f16379b.equals("ftyp")) {
                new C5895b(nVar, aVar).mo17827a(this.f16129b);
            } else if (aVar.f16379b.equals("hdlr")) {
                return this.f16366c.mo17821a(new C5897d(nVar, aVar).mo17828a(), this.f16128a);
            } else if (aVar.f16379b.equals("mdhd")) {
                new C5898e(nVar, aVar);
            }
        } else if (aVar.f16379b.equals("cmov")) {
            this.f16129b.mo17137a("Compressed QuickTime movies not supported");
        }
        return this;
    }

    /* renamed from: e */
    public boolean mo16978e(C5894a aVar) {
        return aVar.f16379b.equals("ftyp") || aVar.f16379b.equals("mvhd") || aVar.f16379b.equals("hdlr") || aVar.f16379b.equals("mdhd");
    }

    /* renamed from: f */
    public boolean mo16979f(C5894a aVar) {
        return aVar.f16379b.equals("trak") || aVar.f16379b.equals("udta") || aVar.f16379b.equals("meta") || aVar.f16379b.equals("moov") || aVar.f16379b.equals("mdia");
    }
}
