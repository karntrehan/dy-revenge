package p174e.p446g.p448b;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import p174e.p446g.p448b.C10229x;
import p455g.p470y.p472d.C10457l;

/* renamed from: e.g.b.r */
public final class C10219r extends C10200h<C10219r> {
    /* access modifiers changed from: private */

    /* renamed from: L */
    public double f27406L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public double f27407M;

    /* renamed from: N */
    private C10229x f27408N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public float f27409O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public float f27410P;

    /* renamed from: Q */
    private final C10229x.C10231b f27411Q = new C10220a(this);

    /* renamed from: e.g.b.r$a */
    public static final class C10220a implements C10229x.C10231b {

        /* renamed from: a */
        final /* synthetic */ C10219r f27412a;

        C10220a(C10219r rVar) {
            this.f27412a = rVar;
            rVar.mo25463x0(false);
        }

        /* renamed from: a */
        public void mo25512a(C10229x xVar) {
            C10457l.m35320e(xVar, "detector");
        }

        /* renamed from: b */
        public boolean mo25513b(C10229x xVar) {
            C10457l.m35320e(xVar, "detector");
            this.f27412a.f27409O = xVar.mo25527d();
            return true;
        }

        /* renamed from: c */
        public boolean mo25514c(C10229x xVar) {
            C10457l.m35320e(xVar, "detector");
            double P0 = this.f27412a.mo25510P0();
            C10219r rVar = this.f27412a;
            rVar.f27406L = rVar.mo25510P0() * ((double) xVar.mo25530g());
            long h = xVar.mo25531h();
            if (h > 0) {
                C10219r rVar2 = this.f27412a;
                rVar2.f27407M = (rVar2.mo25510P0() - P0) / ((double) h);
            }
            if (Math.abs(this.f27412a.f27409O - xVar.mo25527d()) < this.f27412a.f27410P || this.f27412a.mo25427N() != 2) {
                return true;
            }
            this.f27412a.mo25441i();
            return true;
        }
    }

    /* renamed from: N0 */
    public final float mo25508N0() {
        C10229x xVar = this.f27408N;
        if (xVar == null) {
            return Float.NaN;
        }
        return xVar.mo25528e();
    }

    /* renamed from: O0 */
    public final float mo25509O0() {
        C10229x xVar = this.f27408N;
        if (xVar == null) {
            return Float.NaN;
        }
        return xVar.mo25529f();
    }

    /* renamed from: P0 */
    public final double mo25510P0() {
        return this.f27406L;
    }

    /* renamed from: Q0 */
    public final double mo25511Q0() {
        return this.f27407M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public void mo24742e0(MotionEvent motionEvent) {
        C10457l.m35320e(motionEvent, "event");
        if (mo25427N() == 0) {
            View R = mo25431R();
            C10457l.m35317b(R);
            Context context = R.getContext();
            mo25443k0();
            this.f27408N = new C10229x(context, this.f27411Q);
            this.f27410P = (float) ViewConfiguration.get(context).getScaledTouchSlop();
            mo25446n();
        }
        C10229x xVar = this.f27408N;
        if (xVar != null) {
            xVar.mo25532j(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        if (motionEvent.getActionMasked() == 6) {
            pointerCount--;
        }
        if (mo25427N() == 4 && pointerCount < 2) {
            mo25465z();
        } else if (motionEvent.getActionMasked() == 1) {
            mo25409B();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo25405f0() {
        this.f27408N = null;
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
        this.f27407M = 0.0d;
        this.f27406L = 1.0d;
    }
}
