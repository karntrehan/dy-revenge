package p174e.p199d.p218c.p238w;

import java.util.Calendar;
import java.util.Date;
import p174e.p199d.p200a.p211p.C5685a;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p217b.C5714o;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.p238w.C5890d;
import p174e.p199d.p218c.p238w.p239h.C5894a;

/* renamed from: e.d.c.w.f */
public abstract class C5892f<T extends C5890d> extends C5685a<T> {
    public C5892f(C5732e eVar) {
        super(eVar);
        if (C5891e.f16374b != null && C5891e.f16375c != null) {
            Calendar instance = Calendar.getInstance();
            instance.set(1904, 0, 1, 0, 0, 0);
            long time = instance.getTime().getTime();
            String date = new Date((C5891e.f16374b.longValue() * 1000) + time).toString();
            String date2 = new Date((C5891e.f16375c.longValue() * 1000) + time).toString();
            this.f16129b.mo17133R(20481, date);
            this.f16129b.mo17133R(20482, date2);
        }
    }

    /* renamed from: e */
    public boolean mo16978e(C5894a aVar) {
        return aVar.f16379b.equals(mo17822g()) || aVar.f16379b.equals("stsd") || aVar.f16379b.equals("stts");
    }

    /* renamed from: f */
    public boolean mo16979f(C5894a aVar) {
        return aVar.f16379b.equals("stbl") || aVar.f16379b.equals("minf") || aVar.f16379b.equals("gmhd") || aVar.f16379b.equals("tmcd");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract String mo17822g();

    /* renamed from: h */
    public C5892f mo16976c(C5894a aVar, byte[] bArr) {
        if (bArr != null) {
            C5713n nVar = new C5713n(bArr);
            if (aVar.f16379b.equals(mo17822g())) {
                mo17824i(nVar, aVar);
            } else if (aVar.f16379b.equals("stsd")) {
                mo17825j(nVar, aVar);
            } else if (aVar.f16379b.equals("stts")) {
                mo17826k(nVar, aVar);
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo17824i(C5714o oVar, C5894a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo17825j(C5714o oVar, C5894a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo17826k(C5714o oVar, C5894a aVar);
}
