package p174e.p247e.p274h.p288i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import p174e.p247e.p253d.p257d.C6058j;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p274h.p280b.C6167c;
import p174e.p247e.p274h.p284e.C6222t;
import p174e.p247e.p274h.p284e.C6223u;
import p174e.p247e.p274h.p287h.C6232a;
import p174e.p247e.p274h.p287h.C6233b;

/* renamed from: e.e.h.i.b */
public class C6238b<DH extends C6233b> implements C6223u {

    /* renamed from: a */
    private boolean f17272a = false;

    /* renamed from: b */
    private boolean f17273b = false;

    /* renamed from: c */
    private boolean f17274c = true;

    /* renamed from: d */
    private DH f17275d;

    /* renamed from: e */
    private C6232a f17276e = null;

    /* renamed from: f */
    private final C6167c f17277f = C6167c.m23263a();

    public C6238b(DH dh) {
        if (dh != null) {
            mo18525p(dh);
        }
    }

    /* renamed from: c */
    private void m23643c() {
        if (!this.f17272a) {
            this.f17277f.mo18255b(C6167c.C6168a.ON_ATTACH_CONTROLLER);
            this.f17272a = true;
            C6232a aVar = this.f17276e;
            if (aVar != null && aVar.mo18270c() != null) {
                this.f17276e.mo18275f();
            }
        }
    }

    /* renamed from: d */
    private void m23644d() {
        if (!this.f17273b || !this.f17274c) {
            m23646f();
        } else {
            m23643c();
        }
    }

    /* renamed from: e */
    public static <DH extends C6233b> C6238b<DH> m23645e(DH dh, Context context) {
        C6238b<DH> bVar = new C6238b<>(dh);
        bVar.mo18523n(context);
        return bVar;
    }

    /* renamed from: f */
    private void m23646f() {
        if (this.f17272a) {
            this.f17277f.mo18255b(C6167c.C6168a.ON_DETACH_CONTROLLER);
            this.f17272a = false;
            if (mo18519j()) {
                this.f17276e.mo18268b();
            }
        }
    }

    /* renamed from: q */
    private void m23647q(C6223u uVar) {
        Drawable i = mo18518i();
        if (i instanceof C6222t) {
            ((C6222t) i).mo18452q(uVar);
        }
    }

    /* renamed from: a */
    public void mo18453a() {
        if (!this.f17272a) {
            C6071a.m22857E(C6167c.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f17276e)), toString());
            this.f17273b = true;
            this.f17274c = true;
            m23644d();
        }
    }

    /* renamed from: b */
    public void mo18454b(boolean z) {
        if (this.f17274c != z) {
            this.f17277f.mo18255b(z ? C6167c.C6168a.ON_DRAWABLE_SHOW : C6167c.C6168a.ON_DRAWABLE_HIDE);
            this.f17274c = z;
            m23644d();
        }
    }

    /* renamed from: g */
    public C6232a mo18516g() {
        return this.f17276e;
    }

    /* renamed from: h */
    public DH mo18517h() {
        return (C6233b) C6062k.m22839g(this.f17275d);
    }

    /* renamed from: i */
    public Drawable mo18518i() {
        DH dh = this.f17275d;
        if (dh == null) {
            return null;
        }
        return dh.mo18464g();
    }

    /* renamed from: j */
    public boolean mo18519j() {
        C6232a aVar = this.f17276e;
        return aVar != null && aVar.mo18270c() == this.f17275d;
    }

    /* renamed from: k */
    public void mo18520k() {
        this.f17277f.mo18255b(C6167c.C6168a.ON_HOLDER_ATTACH);
        this.f17273b = true;
        m23644d();
    }

    /* renamed from: l */
    public void mo18521l() {
        this.f17277f.mo18255b(C6167c.C6168a.ON_HOLDER_DETACH);
        this.f17273b = false;
        m23644d();
    }

    /* renamed from: m */
    public boolean mo18522m(MotionEvent motionEvent) {
        if (!mo18519j()) {
            return false;
        }
        return this.f17276e.mo18272d(motionEvent);
    }

    /* renamed from: n */
    public void mo18523n(Context context) {
    }

    /* renamed from: o */
    public void mo18524o(C6232a aVar) {
        boolean z = this.f17272a;
        if (z) {
            m23646f();
        }
        if (mo18519j()) {
            this.f17277f.mo18255b(C6167c.C6168a.ON_CLEAR_OLD_CONTROLLER);
            this.f17276e.mo18164g((C6233b) null);
        }
        this.f17276e = aVar;
        if (aVar != null) {
            this.f17277f.mo18255b(C6167c.C6168a.ON_SET_CONTROLLER);
            this.f17276e.mo18164g(this.f17275d);
        } else {
            this.f17277f.mo18255b(C6167c.C6168a.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            m23643c();
        }
    }

    /* renamed from: p */
    public void mo18525p(DH dh) {
        this.f17277f.mo18255b(C6167c.C6168a.ON_SET_HIERARCHY);
        boolean j = mo18519j();
        m23647q((C6223u) null);
        DH dh2 = (C6233b) C6062k.m22839g(dh);
        this.f17275d = dh2;
        Drawable g = dh2.mo18464g();
        mo18454b(g == null || g.isVisible());
        m23647q(this);
        if (j) {
            this.f17276e.mo18164g(dh);
        }
    }

    public String toString() {
        return C6058j.m22827c(this).mo18045c("controllerAttached", this.f17272a).mo18045c("holderAttached", this.f17273b).mo18045c("drawableVisible", this.f17274c).mo18044b("events", this.f17277f.toString()).toString();
    }
}
