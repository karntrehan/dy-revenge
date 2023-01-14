package p174e.p199d.p218c.p238w.p241j;

import java.util.ArrayList;
import p174e.p199d.p200a.p211p.C5685a;
import p174e.p199d.p217b.C5704e;
import p174e.p199d.p217b.C5713n;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.p238w.C5893g;
import p174e.p199d.p218c.p238w.p239h.C5894a;

/* renamed from: e.d.c.w.j.a */
public class C5938a extends C5893g {

    /* renamed from: c */
    private int f16481c = 0;

    /* renamed from: d */
    private ArrayList<String> f16482d = new ArrayList<>();

    public C5938a(C5732e eVar) {
        super(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C5685a mo16976c(C5894a aVar, byte[] bArr) {
        if (bArr != null) {
            C5713n nVar = new C5713n(bArr);
            if (aVar.f16379b.equals("keys")) {
                mo17854h(nVar);
            } else if (aVar.f16379b.equals("data")) {
                mo17853g(bArr, nVar);
            }
        } else {
            int a = C5704e.m21214a(aVar.f16379b.getBytes(), 0, true);
            if (a > 0 && a < this.f16482d.size() + 1) {
                this.f16481c = a - 1;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo16978e(C5894a aVar) {
        return aVar.f16379b.equals("hdlr") || aVar.f16379b.equals("keys") || aVar.f16379b.equals("data");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo16979f(C5894a aVar) {
        return aVar.f16379b.equals("ilst") || C5704e.m21214a(aVar.f16379b.getBytes(), 0, true) <= this.f16482d.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo17853g(byte[] bArr, C5713n nVar) {
        nVar.mo17084t(8);
        this.f16129b.mo17133R(C5941d.f16485h.get(this.f16482d.get(this.f16481c)).intValue(), new String(nVar.mo17082d(bArr.length - 8)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo17854h(C5713n nVar) {
        nVar.mo17084t(4);
        int f = nVar.mo17087f();
        for (int i = 0; i < f; i++) {
            int f2 = nVar.mo17087f();
            nVar.mo17084t(4);
            this.f16482d.add(new String(nVar.mo17082d(f2 - 8)));
        }
    }
}
