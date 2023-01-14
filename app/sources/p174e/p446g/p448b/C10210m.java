package p174e.p446g.p448b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: e.g.b.m */
public final class C10210m extends C10200h<C10210m> {

    /* renamed from: L */
    public static final C10211a f27368L = new C10211a((C10452g) null);

    /* renamed from: M */
    private long f27369M = 500;

    /* renamed from: N */
    private final float f27370N;

    /* renamed from: O */
    private float f27371O;

    /* renamed from: P */
    private float f27372P;

    /* renamed from: Q */
    private float f27373Q;

    /* renamed from: R */
    private long f27374R;

    /* renamed from: S */
    private long f27375S;

    /* renamed from: T */
    private Handler f27376T;

    /* renamed from: e.g.b.m$a */
    public static final class C10211a {
        private C10211a() {
        }

        public /* synthetic */ C10211a(C10452g gVar) {
            this();
        }
    }

    public C10210m(Context context) {
        C10457l.m35320e(context, "context");
        mo25463x0(true);
        float f = context.getResources().getDisplayMetrics().density * 10.0f;
        this.f27370N = f;
        this.f27371O = f;
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public static final void m34664K0(C10210m mVar) {
        C10457l.m35320e(mVar, "this$0");
        mVar.mo25441i();
    }

    /* renamed from: I0 */
    public final int mo25484I0() {
        return (int) (this.f27375S - this.f27374R);
    }

    /* renamed from: L0 */
    public final C10210m mo25485L0(float f) {
        this.f27371O = f * f;
        return this;
    }

    /* renamed from: M0 */
    public final void mo25486M0(long j) {
        this.f27369M = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public void mo24742e0(MotionEvent motionEvent) {
        C10457l.m35320e(motionEvent, "event");
        if (mo25427N() == 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f27375S = uptimeMillis;
            this.f27374R = uptimeMillis;
            mo25446n();
            this.f27372P = motionEvent.getRawX();
            this.f27373Q = motionEvent.getRawY();
            Handler handler = new Handler();
            this.f27376T = handler;
            long j = this.f27369M;
            if (j > 0) {
                C10457l.m35317b(handler);
                handler.postDelayed(new C10195d(this), this.f27369M);
            } else if (j == 0) {
                mo25441i();
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            Handler handler2 = this.f27376T;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages((Object) null);
                this.f27376T = null;
            }
            if (mo25427N() == 4) {
                mo25465z();
                return;
            }
        } else {
            float rawX = motionEvent.getRawX() - this.f27372P;
            float rawY = motionEvent.getRawY() - this.f27373Q;
            if ((rawX * rawX) + (rawY * rawY) <= this.f27371O) {
                return;
            }
            if (mo25427N() == 4) {
                mo25448o();
                return;
            }
        }
        mo25409B();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public void mo25439g0(int i, int i2) {
        Handler handler = this.f27376T;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f27376T = null;
        }
    }

    /* renamed from: j0 */
    public void mo25407j0() {
        super.mo25407j0();
        this.f27369M = 500;
        this.f27371O = this.f27370N;
    }

    /* renamed from: t */
    public void mo25455t(MotionEvent motionEvent) {
        C10457l.m35320e(motionEvent, "event");
        this.f27375S = SystemClock.uptimeMillis();
        super.mo25455t(motionEvent);
    }

    /* renamed from: u */
    public void mo25458u(int i, int i2) {
        this.f27375S = SystemClock.uptimeMillis();
        super.mo25458u(i, i2);
    }
}
