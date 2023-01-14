package p174e.p446g.p448b;

import android.os.Handler;
import android.view.MotionEvent;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: e.g.b.g */
public final class C10198g extends C10200h<C10198g> {

    /* renamed from: L */
    public static final C10199a f27294L = new C10199a((C10452g) null);

    /* renamed from: M */
    private int f27295M = 1;

    /* renamed from: N */
    private int f27296N = 1;

    /* renamed from: O */
    private final long f27297O = 800;

    /* renamed from: P */
    private final long f27298P = 160;

    /* renamed from: Q */
    private float f27299Q;

    /* renamed from: R */
    private float f27300R;

    /* renamed from: S */
    private Handler f27301S;

    /* renamed from: T */
    private int f27302T;

    /* renamed from: U */
    private final Runnable f27303U = new C10192a(this);

    /* renamed from: e.g.b.g$a */
    public static final class C10199a {
        private C10199a() {
        }

        public /* synthetic */ C10199a(C10452g gVar) {
            this();
        }
    }

    /* renamed from: I0 */
    private final void m34504I0(MotionEvent motionEvent) {
        if (!m34508O0(motionEvent)) {
            mo25409B();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public static final void m34505J0(C10198g gVar) {
        C10457l.m35320e(gVar, "this$0");
        gVar.mo25409B();
    }

    /* renamed from: N0 */
    private final void m34507N0(MotionEvent motionEvent) {
        this.f27299Q = motionEvent.getRawX();
        this.f27300R = motionEvent.getRawY();
        mo25446n();
        this.f27302T = 1;
        Handler handler = this.f27301S;
        if (handler == null) {
            this.f27301S = new Handler();
        } else {
            C10457l.m35317b(handler);
            handler.removeCallbacksAndMessages((Object) null);
        }
        Handler handler2 = this.f27301S;
        C10457l.m35317b(handler2);
        handler2.postDelayed(this.f27303U, this.f27297O);
    }

    /* renamed from: O0 */
    private final boolean m34508O0(MotionEvent motionEvent) {
        if (this.f27302T != this.f27295M || (((this.f27296N & 1) == 0 || motionEvent.getRawX() - this.f27299Q <= ((float) this.f27298P)) && (((this.f27296N & 2) == 0 || this.f27299Q - motionEvent.getRawX() <= ((float) this.f27298P)) && (((this.f27296N & 4) == 0 || this.f27300R - motionEvent.getRawY() <= ((float) this.f27298P)) && ((this.f27296N & 8) == 0 || motionEvent.getRawY() - this.f27300R <= ((float) this.f27298P)))))) {
            return false;
        }
        Handler handler = this.f27301S;
        C10457l.m35317b(handler);
        handler.removeCallbacksAndMessages((Object) null);
        mo25441i();
        return true;
    }

    /* renamed from: L0 */
    public final void mo25403L0(int i) {
        this.f27296N = i;
    }

    /* renamed from: M0 */
    public final void mo25404M0(int i) {
        this.f27295M = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo24741d0() {
        Handler handler = this.f27301S;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public void mo24742e0(MotionEvent motionEvent) {
        C10457l.m35320e(motionEvent, "event");
        int N = mo25427N();
        if (N == 0) {
            m34507N0(motionEvent);
        }
        if (N == 2) {
            m34508O0(motionEvent);
            if (motionEvent.getPointerCount() > this.f27302T) {
                this.f27302T = motionEvent.getPointerCount();
            }
            if (motionEvent.getActionMasked() == 1) {
                m34504I0(motionEvent);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo25405f0() {
        Handler handler = this.f27301S;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    /* renamed from: j */
    public void mo25406j(boolean z) {
        super.mo25406j(z);
        mo25465z();
    }

    /* renamed from: j0 */
    public void mo25407j0() {
        super.mo25407j0();
        this.f27295M = 1;
        this.f27296N = 1;
    }
}
