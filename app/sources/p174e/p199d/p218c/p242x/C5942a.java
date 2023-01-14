package p174e.p199d.p218c.p242x;

import p174e.p199d.p200a.p207l.C5672a;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.p242x.p243g.C5949b;
import p174e.p199d.p218c.p242x.p243g.C5950c;
import p174e.p199d.p218c.p242x.p243g.C5952e;
import p174e.p199d.p218c.p242x.p243g.C5954g;
import p174e.p199d.p218c.p242x.p243g.C5955h;

/* renamed from: e.d.c.x.a */
public class C5942a extends C5672a<C5945d> {

    /* renamed from: c */
    private C5946e f16486c = new C5946e(this);

    public C5942a(C5732e eVar) {
        super(eVar);
    }

    /* renamed from: g */
    private void m22473g(C5714o oVar, C5949b bVar) {
        new C5950c(oVar, bVar).mo17862a(this.f16077b);
    }

    /* renamed from: h */
    private void m22474h(C5714o oVar, C5949b bVar) {
        new C5954g(oVar, bVar);
    }

    /* renamed from: i */
    private void m22475i(C5714o oVar, C5949b bVar) {
        new C5955h(oVar, bVar).mo17865a(this.f16077b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C5945d mo16944b() {
        return new C5945d();
    }

    /* renamed from: c */
    public C5672a mo16945c(C5949b bVar, byte[] bArr) {
        if (bArr != null) {
            C5713n nVar = new C5713n(bArr);
            if (bVar.f16503b.equals("mvhd")) {
                m22475i(nVar, bVar);
            } else if (bVar.f16503b.equals("ftyp")) {
                m22473g(nVar, bVar);
            } else if (bVar.f16503b.equals("hdlr")) {
                return this.f16486c.mo17856a(new C5952e(nVar, bVar), this.f16076a);
            } else if (bVar.f16503b.equals("mdhd")) {
                m22474h(nVar, bVar);
            }
        } else if (bVar.f16503b.equals("cmov")) {
            this.f16077b.mo17137a("Compressed MP4 movies not supported");
        }
        return this;
    }

    /* renamed from: e */
    public boolean mo16947e(C5949b bVar) {
        return bVar.f16503b.equals("ftyp") || bVar.f16503b.equals("mvhd") || bVar.f16503b.equals("hdlr") || bVar.f16503b.equals("mdhd");
    }

    /* renamed from: f */
    public boolean mo16948f(C5949b bVar) {
        return bVar.f16503b.equals("trak") || bVar.f16503b.equals("meta") || bVar.f16503b.equals("moov") || bVar.f16503b.equals("mdia");
    }
}
