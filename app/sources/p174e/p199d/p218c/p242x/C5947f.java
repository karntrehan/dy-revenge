package p174e.p199d.p218c.p242x;

import java.util.Calendar;
import java.util.Date;
import p174e.p199d.p200a.p207l.C5672a;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.p242x.p243g.C5949b;
import p174e.p199d.p218c.p242x.p244h.C5965d;

/* renamed from: e.d.c.x.f */
public abstract class C5947f<T extends C5965d> extends C5672a<T> {
    public C5947f(C5732e eVar) {
        super(eVar);
        if (C5946e.f16494b != null && C5946e.f16495c != null) {
            Calendar instance = Calendar.getInstance();
            instance.set(1904, 0, 1, 0, 0, 0);
            long time = instance.getTime().getTime();
            String date = new Date((C5946e.f16494b.longValue() * 1000) + time).toString();
            String date2 = new Date((C5946e.f16495c.longValue() * 1000) + time).toString();
            String str = C5946e.f16497e;
            ((C5965d) this.f16077b).mo17133R(101, date);
            ((C5965d) this.f16077b).mo17133R(102, date2);
            ((C5965d) this.f16077b).mo17133R(104, str);
        }
    }

    /* renamed from: c */
    public C5672a mo16945c(C5949b bVar, byte[] bArr) {
        if (bArr != null) {
            C5713n nVar = new C5713n(bArr);
            if (bVar.f16503b.equals(mo17857g())) {
                mo17858h(nVar, bVar);
            } else if (bVar.f16503b.equals("stsd")) {
                mo17859i(nVar, bVar);
            } else if (bVar.f16503b.equals("stts")) {
                mo17860j(nVar, bVar);
            }
        }
        return this;
    }

    /* renamed from: e */
    public boolean mo16947e(C5949b bVar) {
        return bVar.f16503b.equals(mo17857g()) || bVar.f16503b.equals("stsd") || bVar.f16503b.equals("stts");
    }

    /* renamed from: f */
    public boolean mo16948f(C5949b bVar) {
        return bVar.f16503b.equals("stbl") || bVar.f16503b.equals("minf");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo17857g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo17858h(C5714o oVar, C5949b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo17859i(C5714o oVar, C5949b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo17860j(C5714o oVar, C5949b bVar);
}
