package p174e.p446g.p448b;

import android.os.Handler;
import android.view.MotionEvent;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: e.g.b.y */
public final class C10232y extends C10200h<C10232y> {

    /* renamed from: L */
    public static final C10233a f27458L = new C10233a((C10452g) null);

    /* renamed from: M */
    private float f27459M = Float.MIN_VALUE;

    /* renamed from: N */
    private float f27460N = Float.MIN_VALUE;

    /* renamed from: O */
    private float f27461O = Float.MIN_VALUE;

    /* renamed from: P */
    private long f27462P = 500;

    /* renamed from: Q */
    private long f27463Q = 200;

    /* renamed from: R */
    private int f27464R = 1;

    /* renamed from: S */
    private int f27465S = 1;

    /* renamed from: T */
    private int f27466T = 1;

    /* renamed from: U */
    private float f27467U;

    /* renamed from: V */
    private float f27468V;

    /* renamed from: W */
    private float f27469W;

    /* renamed from: X */
    private float f27470X;

    /* renamed from: Y */
    private float f27471Y;

    /* renamed from: Z */
    private float f27472Z;

    /* renamed from: a0 */
    private Handler f27473a0;

    /* renamed from: b0 */
    private int f27474b0;

    /* renamed from: c0 */
    private final Runnable f27475c0 = new C10196e(this);

    /* renamed from: e.g.b.y$a */
    public static final class C10233a {
        private C10233a() {
        }

        public /* synthetic */ C10233a(C10452g gVar) {
            this();
        }
    }

    public C10232y() {
        mo25463x0(true);
    }

    /* renamed from: I0 */
    private final void m34776I0() {
        Handler handler = this.f27473a0;
        if (handler == null) {
            this.f27473a0 = new Handler();
        } else {
            C10457l.m35317b(handler);
            handler.removeCallbacksAndMessages((Object) null);
        }
        int i = this.f27474b0 + 1;
        this.f27474b0 = i;
        if (i != this.f27464R || this.f27466T < this.f27465S) {
            Handler handler2 = this.f27473a0;
            C10457l.m35317b(handler2);
            handler2.postDelayed(this.f27475c0, this.f27463Q);
            return;
        }
        mo25441i();
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public static final void m34777J0(C10232y yVar) {
        C10457l.m35320e(yVar, "this$0");
        yVar.mo25409B();
    }

    /* renamed from: S0 */
    private final boolean m34779S0() {
        float f = (this.f27471Y - this.f27467U) + this.f27469W;
        if (!(this.f27459M == Float.MIN_VALUE) && Math.abs(f) > this.f27459M) {
            return true;
        }
        float f2 = (this.f27472Z - this.f27468V) + this.f27470X;
        if (!(this.f27460N == Float.MIN_VALUE) && Math.abs(f2) > this.f27460N) {
            return true;
        }
        float f3 = (f2 * f2) + (f * f);
        float f4 = this.f27461O;
        return !((f4 > Float.MIN_VALUE ? 1 : (f4 == Float.MIN_VALUE ? 0 : -1)) == 0) && f3 > f4;
    }

    /* renamed from: T0 */
    private final void m34780T0() {
        Handler handler = this.f27473a0;
        if (handler == null) {
            this.f27473a0 = new Handler();
        } else {
            C10457l.m35317b(handler);
            handler.removeCallbacksAndMessages((Object) null);
        }
        Handler handler2 = this.f27473a0;
        C10457l.m35317b(handler2);
        handler2.postDelayed(this.f27475c0, this.f27462P);
    }

    /* renamed from: L0 */
    public final C10232y mo25536L0(long j) {
        this.f27463Q = j;
        return this;
    }

    /* renamed from: M0 */
    public final C10232y mo25537M0(float f) {
        this.f27461O = f * f;
        return this;
    }

    /* renamed from: N0 */
    public final C10232y mo25538N0(long j) {
        this.f27462P = j;
        return this;
    }

    /* renamed from: O0 */
    public final C10232y mo25539O0(float f) {
        this.f27459M = f;
        return this;
    }

    /* renamed from: P0 */
    public final C10232y mo25540P0(float f) {
        this.f27460N = f;
        return this;
    }

    /* renamed from: Q0 */
    public final C10232y mo25541Q0(int i) {
        this.f27465S = i;
        return this;
    }

    /* renamed from: R0 */
    public final C10232y mo25542R0(int i) {
        this.f27464R = i;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo24741d0() {
        Handler handler = this.f27473a0;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public void mo24742e0(MotionEvent motionEvent) {
        C10457l.m35320e(motionEvent, "event");
        int N = mo25427N();
        int actionMasked = motionEvent.getActionMasked();
        if (N == 0) {
            this.f27469W = 0.0f;
            this.f27470X = 0.0f;
            this.f27467U = motionEvent.getRawX();
            this.f27468V = motionEvent.getRawY();
        }
        if (actionMasked == 5 || actionMasked == 6) {
            this.f27469W += this.f27471Y - this.f27467U;
            this.f27470X += this.f27472Z - this.f27468V;
            C10209l lVar = C10209l.f27367a;
            this.f27471Y = lVar.mo25482a(motionEvent, true);
            float b = lVar.mo25483b(motionEvent, true);
            this.f27472Z = b;
            this.f27467U = this.f27471Y;
            this.f27468V = b;
        } else {
            C10209l lVar2 = C10209l.f27367a;
            this.f27471Y = lVar2.mo25482a(motionEvent, true);
            this.f27472Z = lVar2.mo25483b(motionEvent, true);
        }
        if (this.f27466T < motionEvent.getPointerCount()) {
            this.f27466T = motionEvent.getPointerCount();
        }
        if (m34779S0()) {
            mo25409B();
            return;
        }
        if (N == 0) {
            if (actionMasked == 0) {
                mo25446n();
            }
        } else if (N != 2) {
            return;
        } else {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    m34776I0();
                    return;
                }
                return;
            }
        }
        m34780T0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo25405f0() {
        this.f27474b0 = 0;
        this.f27466T = 0;
        Handler handler = this.f27473a0;
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
        this.f27459M = Float.MIN_VALUE;
        this.f27460N = Float.MIN_VALUE;
        this.f27461O = Float.MIN_VALUE;
        this.f27462P = 500;
        this.f27463Q = 200;
        this.f27464R = 1;
        this.f27465S = 1;
    }
}
