package p174e.p446g.p448b;

import android.view.MotionEvent;
import p174e.p446g.p448b.C10224v;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: e.g.b.w */
public final class C10226w extends C10200h<C10226w> {

    /* renamed from: L */
    public static final C10227a f27427L = new C10227a((C10452g) null);

    /* renamed from: M */
    private C10224v f27428M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public double f27429N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public double f27430O;

    /* renamed from: P */
    private final C10224v.C10225a f27431P = new C10228b(this);

    /* renamed from: e.g.b.w$a */
    public static final class C10227a {
        private C10227a() {
        }

        public /* synthetic */ C10227a(C10452g gVar) {
            this();
        }
    }

    /* renamed from: e.g.b.w$b */
    public static final class C10228b implements C10224v.C10225a {

        /* renamed from: a */
        final /* synthetic */ C10226w f27432a;

        C10228b(C10226w wVar) {
            this.f27432a = wVar;
        }

        /* renamed from: a */
        public void mo25520a(C10224v vVar) {
            C10457l.m35320e(vVar, "detector");
            this.f27432a.mo25465z();
        }

        /* renamed from: b */
        public boolean mo25521b(C10224v vVar) {
            C10457l.m35320e(vVar, "detector");
            double M0 = this.f27432a.mo25525M0();
            C10226w wVar = this.f27432a;
            wVar.f27429N = wVar.mo25525M0() + vVar.mo25517d();
            long e = vVar.mo25518e();
            if (e > 0) {
                C10226w wVar2 = this.f27432a;
                wVar2.f27430O = (wVar2.mo25525M0() - M0) / ((double) e);
            }
            if (Math.abs(this.f27432a.mo25525M0()) < 0.08726646259971647d || this.f27432a.mo25427N() != 2) {
                return true;
            }
            this.f27432a.mo25441i();
            return true;
        }

        /* renamed from: c */
        public boolean mo25522c(C10224v vVar) {
            C10457l.m35320e(vVar, "detector");
            return true;
        }
    }

    public C10226w() {
        mo25463x0(false);
    }

    /* renamed from: K0 */
    public final float mo25523K0() {
        C10224v vVar = this.f27428M;
        if (vVar == null) {
            return Float.NaN;
        }
        return vVar.mo25515b();
    }

    /* renamed from: L0 */
    public final float mo25524L0() {
        C10224v vVar = this.f27428M;
        if (vVar == null) {
            return Float.NaN;
        }
        return vVar.mo25516c();
    }

    /* renamed from: M0 */
    public final double mo25525M0() {
        return this.f27429N;
    }

    /* renamed from: N0 */
    public final double mo25526N0() {
        return this.f27430O;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public void mo24742e0(MotionEvent motionEvent) {
        C10457l.m35320e(motionEvent, "event");
        if (mo25427N() == 0) {
            mo25443k0();
            this.f27428M = new C10224v(this.f27431P);
            mo25446n();
        }
        C10224v vVar = this.f27428M;
        if (vVar != null) {
            vVar.mo25519f(motionEvent);
        }
        if (motionEvent.getActionMasked() != 1) {
            return;
        }
        if (mo25427N() == 4) {
            mo25465z();
        } else {
            mo25409B();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo25405f0() {
        this.f27428M = null;
        mo25443k0();
    }

    /* renamed from: j */
    public void mo25406j(boolean z) {
        if (mo25427N() != 4) {
            mo25443k0();
        }
        super.mo25406j(z);
    }

    /* renamed from: k0 */
    public void mo25443k0() {
        this.f27430O = 0.0d;
        this.f27429N = 0.0d;
    }
}
