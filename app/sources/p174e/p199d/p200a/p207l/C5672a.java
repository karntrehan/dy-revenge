package p174e.p199d.p200a.p207l;

import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.p242x.C5945d;
import p174e.p199d.p218c.p242x.p243g.C5949b;

/* renamed from: e.d.a.l.a */
public abstract class C5672a<T extends C5945d> {

    /* renamed from: a */
    protected C5732e f16076a;

    /* renamed from: b */
    protected T f16077b;

    public C5672a(C5732e eVar) {
        this.f16076a = eVar;
        T b = mo16944b();
        this.f16077b = b;
        eVar.mo17166a(b);
    }

    /* renamed from: a */
    public void mo16943a(String str) {
        this.f16077b.mo17137a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo16944b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C5672a mo16945c(C5949b bVar, byte[] bArr);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C5672a mo16946d(C5949b bVar) {
        return mo16945c(bVar, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo16947e(C5949b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo16948f(C5949b bVar);
}
