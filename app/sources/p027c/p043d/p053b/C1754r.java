package p027c.p043d.p053b;

import androidx.camera.core.C0949o2;
import androidx.camera.core.C0957q1;
import androidx.camera.core.impl.C0783b0;
import androidx.camera.core.impl.C0796d2;
import androidx.camera.core.impl.C0830k0;
import androidx.camera.core.impl.C0888u0;
import androidx.camera.core.impl.C0899w0;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import androidx.camera.core.impl.p014a3.p016o.C0766e;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.lifecycle.C1300m;
import java.util.ArrayList;
import java.util.List;
import p027c.p043d.p053b.C1759t;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: c.d.b.r */
final class C1754r implements C0796d2.C0797a<C0899w0.C0900a> {

    /* renamed from: a */
    private final C0888u0 f5186a;

    /* renamed from: b */
    private final C1300m<C1759t.C1765f> f5187b;

    /* renamed from: c */
    private C1759t.C1765f f5188c;

    /* renamed from: d */
    private final C1766u f5189d;

    /* renamed from: e */
    C9172b<Void> f5190e;

    /* renamed from: f */
    private boolean f5191f = false;

    /* renamed from: c.d.b.r$a */
    class C1755a implements C0765d<Void> {

        /* renamed from: a */
        final /* synthetic */ List f5192a;

        /* renamed from: b */
        final /* synthetic */ C0957q1 f5193b;

        C1755a(List list, C0957q1 q1Var) {
            this.f5192a = list;
            this.f5193b = q1Var;
        }

        /* renamed from: b */
        public void mo1981b(Throwable th) {
            C1754r.this.f5190e = null;
            if (!this.f5192a.isEmpty()) {
                for (C0783b0 i : this.f5192a) {
                    ((C0888u0) this.f5193b).mo2461i(i);
                }
                this.f5192a.clear();
            }
        }

        /* renamed from: c */
        public void mo1980a(Void voidR) {
            C1754r.this.f5190e = null;
        }
    }

    /* renamed from: c.d.b.r$b */
    class C1756b extends C0783b0 {

        /* renamed from: a */
        final /* synthetic */ C1814b.C1815a f5195a;

        /* renamed from: b */
        final /* synthetic */ C0957q1 f5196b;

        C1756b(C1814b.C1815a aVar, C0957q1 q1Var) {
            this.f5195a = aVar;
            this.f5196b = q1Var;
        }

        /* renamed from: b */
        public void mo1920b(C0830k0 k0Var) {
            this.f5195a.mo6308c(null);
            ((C0888u0) this.f5196b).mo2461i(this);
        }
    }

    C1754r(C0888u0 u0Var, C1300m<C1759t.C1765f> mVar, C1766u uVar) {
        this.f5186a = u0Var;
        this.f5187b = mVar;
        this.f5189d = uVar;
        synchronized (this) {
            this.f5188c = mVar.mo2469e();
        }
    }

    /* renamed from: c */
    private void m7407c() {
        C9172b<Void> bVar = this.f5190e;
        if (bVar != null) {
            bVar.cancel(false);
            this.f5190e = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ C9172b mo5975f(Void voidR) {
        return this.f5189d.mo6025i();
    }

    /* renamed from: g */
    private /* synthetic */ Void m7409g(Void voidR) {
        mo5979m(C1759t.C1765f.STREAMING);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object mo5977j(C0957q1 q1Var, List list, C1814b.C1815a aVar) {
        C1756b bVar = new C1756b(aVar, q1Var);
        list.add(bVar);
        ((C0888u0) q1Var).mo2454b(C0744a.m3044a(), bVar);
        return "waitForCaptureResult";
    }

    /* renamed from: l */
    private void m7411l(C0957q1 q1Var) {
        mo5979m(C1759t.C1765f.IDLE);
        ArrayList arrayList = new ArrayList();
        C0766e<T> d = C0766e.m3068a(m7412n(q1Var, arrayList)).mo2920f(new C1739c(this), C0744a.m3044a()).mo2918d(new C1732a(this), C0744a.m3044a());
        this.f5190e = d;
        C0768f.m3075a(d, new C1755a(arrayList, q1Var), C0744a.m3044a());
    }

    /* renamed from: n */
    private C9172b<Void> m7412n(C0957q1 q1Var, List<C0783b0> list) {
        return C1814b.m7736a(new C1737b(this, q1Var, list));
    }

    /* renamed from: a */
    public void mo2977a(Throwable th) {
        mo5974d();
        mo5979m(C1759t.C1765f.IDLE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5974d() {
        m7407c();
    }

    /* renamed from: h */
    public /* synthetic */ Void mo5976h(Void voidR) {
        m7409g(voidR);
        return null;
    }

    /* renamed from: k */
    public void mo2978b(C0899w0.C0900a aVar) {
        if (aVar == C0899w0.C0900a.CLOSING || aVar == C0899w0.C0900a.CLOSED || aVar == C0899w0.C0900a.RELEASING || aVar == C0899w0.C0900a.RELEASED) {
            mo5979m(C1759t.C1765f.IDLE);
            if (this.f5191f) {
                this.f5191f = false;
                m7407c();
            }
        } else if ((aVar == C0899w0.C0900a.OPENING || aVar == C0899w0.C0900a.OPEN || aVar == C0899w0.C0900a.PENDING_OPEN) && !this.f5191f) {
            m7411l(this.f5186a);
            this.f5191f = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo5979m(C1759t.C1765f fVar) {
        synchronized (this) {
            if (!this.f5188c.equals(fVar)) {
                this.f5188c = fVar;
                C0949o2.m3688a("StreamStateObserver", "Update Preview stream state to " + fVar);
                this.f5187b.mo4314l(fVar);
            }
        }
    }
}
