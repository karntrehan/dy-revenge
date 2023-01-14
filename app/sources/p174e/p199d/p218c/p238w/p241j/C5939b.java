package p174e.p199d.p218c.p238w.p241j;

import p174e.p199d.p200a.p211p.C5685a;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.p238w.C5893g;
import p174e.p199d.p218c.p238w.p239h.C5894a;

/* renamed from: e.d.c.w.j.b */
public class C5939b extends C5893g {

    /* renamed from: c */
    private String f16483c;

    public C5939b(C5732e eVar) {
        super(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C5685a mo16976c(C5894a aVar, byte[] bArr) {
        String str;
        if (bArr != null) {
            C5713n nVar = new C5713n(bArr);
            if (!aVar.f16379b.equals("data") || this.f16483c == null) {
                str = new String(nVar.mo17082d(4));
            } else {
                mo17855g(bArr, nVar);
                return this;
            }
        } else {
            str = C5941d.f16485h.containsKey(aVar.f16379b) ? aVar.f16379b : null;
        }
        this.f16483c = str;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo16978e(C5894a aVar) {
        return aVar.f16379b.equals("data");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo16979f(C5894a aVar) {
        return C5941d.f16485h.containsKey(aVar.f16379b) || aVar.f16379b.equals("ilst");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo17855g(byte[] bArr, C5713n nVar) {
        nVar.mo17084t(8);
        this.f16129b.mo17133R(C5941d.f16485h.get(this.f16483c).intValue(), new String(nVar.mo17082d(bArr.length - 8)));
    }
}
