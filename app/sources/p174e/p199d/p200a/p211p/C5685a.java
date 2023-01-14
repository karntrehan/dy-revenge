package p174e.p199d.p200a.p211p;

import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.p238w.C5890d;
import p174e.p199d.p218c.p238w.p239h.C5894a;

/* renamed from: e.d.a.p.a */
public abstract class C5685a<T extends C5890d> {

    /* renamed from: a */
    protected C5732e f16128a;

    /* renamed from: b */
    protected T f16129b;

    public C5685a(C5732e eVar) {
        this.f16128a = eVar;
        T b = mo16975b();
        this.f16129b = b;
        eVar.mo17166a(b);
    }

    /* renamed from: a */
    public void mo16974a(String str) {
        this.f16129b.mo17137a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo16975b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C5685a mo16976c(C5894a aVar, byte[] bArr);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C5685a mo16977d(C5894a aVar) {
        return mo16976c(aVar, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo16978e(C5894a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo16979f(C5894a aVar);
}
