package p174e.p247e.p274h.p275a.p276a;

import android.content.res.Resources;
import java.util.concurrent.Executor;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p253d.p257d.C6054f;
import p174e.p247e.p253d.p257d.C6065n;
import p174e.p247e.p274h.p280b.C6163a;
import p174e.p247e.p294k.p300d.C6304s;
import p174e.p247e.p294k.p306j.C6365a;
import p174e.p247e.p294k.p307k.C6367b;

/* renamed from: e.e.h.a.a.g */
public class C6147g {

    /* renamed from: a */
    private Resources f16858a;

    /* renamed from: b */
    private C6163a f16859b;

    /* renamed from: c */
    private C6365a f16860c;

    /* renamed from: d */
    private Executor f16861d;

    /* renamed from: e */
    private C6304s<C5999d, C6367b> f16862e;

    /* renamed from: f */
    private C6054f<C6365a> f16863f;

    /* renamed from: g */
    private C6065n<Boolean> f16864g;

    /* renamed from: a */
    public void mo18194a(Resources resources, C6163a aVar, C6365a aVar2, Executor executor, C6304s<C5999d, C6367b> sVar, C6054f<C6365a> fVar, C6065n<Boolean> nVar) {
        this.f16858a = resources;
        this.f16859b = aVar;
        this.f16860c = aVar2;
        this.f16861d = executor;
        this.f16862e = sVar;
        this.f16863f = fVar;
        this.f16864g = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C6143d mo18195b(Resources resources, C6163a aVar, C6365a aVar2, Executor executor, C6304s<C5999d, C6367b> sVar, C6054f<C6365a> fVar) {
        return new C6143d(resources, aVar, aVar2, executor, sVar, fVar);
    }

    /* renamed from: c */
    public C6143d mo18196c() {
        C6143d b = mo18195b(this.f16858a, this.f16859b, this.f16860c, this.f16861d, this.f16862e, this.f16863f);
        C6065n<Boolean> nVar = this.f16864g;
        if (nVar != null) {
            b.mo18158B0(nVar.get().booleanValue());
        }
        return b;
    }
}
