package p174e.p446g.p448b;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: e.g.b.q */
public final class C10217q extends C10200h<C10217q> {

    /* renamed from: L */
    public static final C10218a f27380L = new C10218a((C10452g) null);

    /* renamed from: M */
    private float f27381M;

    /* renamed from: N */
    private float f27382N;

    /* renamed from: O */
    private final float f27383O;

    /* renamed from: P */
    private float f27384P = Float.MIN_VALUE;

    /* renamed from: Q */
    private float f27385Q = Float.MAX_VALUE;

    /* renamed from: R */
    private float f27386R = Float.MIN_VALUE;

    /* renamed from: S */
    private float f27387S = Float.MIN_VALUE;

    /* renamed from: T */
    private float f27388T = Float.MAX_VALUE;

    /* renamed from: U */
    private float f27389U = Float.MAX_VALUE;

    /* renamed from: V */
    private float f27390V = Float.MIN_VALUE;

    /* renamed from: W */
    private float f27391W = Float.MIN_VALUE;

    /* renamed from: X */
    private float f27392X = Float.MAX_VALUE;

    /* renamed from: Y */
    private float f27393Y = Float.MAX_VALUE;

    /* renamed from: Z */
    private float f27394Z = Float.MAX_VALUE;

    /* renamed from: a0 */
    private float f27395a0 = Float.MAX_VALUE;

    /* renamed from: b0 */
    private int f27396b0 = 1;

    /* renamed from: c0 */
    private int f27397c0 = 10;

    /* renamed from: d0 */
    private float f27398d0;

    /* renamed from: e0 */
    private float f27399e0;

    /* renamed from: f0 */
    private float f27400f0;

    /* renamed from: g0 */
    private float f27401g0;

    /* renamed from: h0 */
    private float f27402h0;

    /* renamed from: i0 */
    private float f27403i0;

    /* renamed from: j0 */
    private VelocityTracker f27404j0;

    /* renamed from: k0 */
    private boolean f27405k0;

    /* renamed from: e.g.b.q$a */
    public static final class C10218a {
        private C10218a() {
        }

        public /* synthetic */ C10218a(C10452g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m34717b(VelocityTracker velocityTracker, MotionEvent motionEvent) {
            float rawX = motionEvent.getRawX() - motionEvent.getX();
            float rawY = motionEvent.getRawY() - motionEvent.getY();
            motionEvent.offsetLocation(rawX, rawY);
            C10457l.m35317b(velocityTracker);
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
        }
    }

    public C10217q(Context context) {
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        float f = (float) (scaledTouchSlop * scaledTouchSlop);
        this.f27383O = f;
        this.f27384P = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x008c, code lost:
        if ((0.0f <= r1 && r1 <= r0) != false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00af, code lost:
        if ((0.0f <= r5 && r5 <= r0) != false) goto L_0x00b1;
     */
    /* renamed from: b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m34690b1() {
        /*
            r8 = this;
            float r0 = r8.f27402h0
            float r1 = r8.f27398d0
            float r0 = r0 - r1
            float r1 = r8.f27400f0
            float r0 = r0 + r1
            float r1 = r8.f27385Q
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3 = 0
            r4 = 1
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0015
            r5 = 1
            goto L_0x0016
        L_0x0015:
            r5 = 0
        L_0x0016:
            if (r5 != 0) goto L_0x001d
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x001d
            return r4
        L_0x001d:
            float r1 = r8.f27386R
            r5 = 1
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 != 0) goto L_0x0026
            r6 = 1
            goto L_0x0027
        L_0x0026:
            r6 = 0
        L_0x0027:
            if (r6 != 0) goto L_0x002e
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x002e
            return r4
        L_0x002e:
            float r1 = r8.f27403i0
            float r6 = r8.f27399e0
            float r1 = r1 - r6
            float r6 = r8.f27401g0
            float r1 = r1 + r6
            float r6 = r8.f27389U
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x003e
            r7 = 1
            goto L_0x003f
        L_0x003e:
            r7 = 0
        L_0x003f:
            if (r7 != 0) goto L_0x0046
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0046
            return r4
        L_0x0046:
            float r6 = r8.f27390V
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x004e
            r5 = 1
            goto L_0x004f
        L_0x004e:
            r5 = 0
        L_0x004f:
            if (r5 != 0) goto L_0x0056
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0056
            return r4
        L_0x0056:
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            float r1 = r8.f27384P
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0063
            r5 = 1
            goto L_0x0064
        L_0x0063:
            r5 = 0
        L_0x0064:
            if (r5 != 0) goto L_0x006b
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x006b
            return r4
        L_0x006b:
            float r0 = r8.f27381M
            float r1 = r8.f27393Y
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0075
            r5 = 1
            goto L_0x0076
        L_0x0075:
            r5 = 0
        L_0x0076:
            r6 = 0
            if (r5 != 0) goto L_0x008f
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0081
            int r5 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x008e
        L_0x0081:
            int r5 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x008b
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 > 0) goto L_0x008b
            r1 = 1
            goto L_0x008c
        L_0x008b:
            r1 = 0
        L_0x008c:
            if (r1 == 0) goto L_0x008f
        L_0x008e:
            return r4
        L_0x008f:
            float r1 = r8.f27382N
            float r5 = r8.f27394Z
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0099
            r7 = 1
            goto L_0x009a
        L_0x0099:
            r7 = 0
        L_0x009a:
            if (r7 != 0) goto L_0x00b2
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a4
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00b1
        L_0x00a4:
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 > 0) goto L_0x00ae
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x00ae
            r5 = 1
            goto L_0x00af
        L_0x00ae:
            r5 = 0
        L_0x00af:
            if (r5 == 0) goto L_0x00b2
        L_0x00b1:
            return r4
        L_0x00b2:
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            float r1 = r8.f27395a0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x00bf
            r2 = 1
            goto L_0x00c0
        L_0x00bf:
            r2 = 0
        L_0x00c0:
            if (r2 != 0) goto L_0x00c7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00c7
            r3 = 1
        L_0x00c7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p446g.p448b.C10217q.m34690b1():boolean");
    }

    /* renamed from: c1 */
    private final boolean m34691c1() {
        float f = (this.f27402h0 - this.f27398d0) + this.f27400f0;
        float f2 = this.f27387S;
        if (!(f2 == Float.MIN_VALUE) && f < f2) {
            return true;
        }
        float f3 = this.f27388T;
        if (!(f3 == Float.MAX_VALUE) && f > f3) {
            return true;
        }
        float f4 = (this.f27403i0 - this.f27399e0) + this.f27401g0;
        float f5 = this.f27391W;
        if (!(f5 == Float.MIN_VALUE) && f4 < f5) {
            return true;
        }
        float f6 = this.f27392X;
        return !((f6 > Float.MAX_VALUE ? 1 : (f6 == Float.MAX_VALUE ? 0 : -1)) == 0) && f4 > f6;
    }

    /* renamed from: I0 */
    public final float mo25489I0() {
        return (this.f27402h0 - this.f27398d0) + this.f27400f0;
    }

    /* renamed from: J0 */
    public final float mo25490J0() {
        return (this.f27403i0 - this.f27399e0) + this.f27401g0;
    }

    /* renamed from: K0 */
    public final float mo25491K0() {
        return this.f27381M;
    }

    /* renamed from: L0 */
    public final float mo25492L0() {
        return this.f27382N;
    }

    /* renamed from: M0 */
    public final C10217q mo25493M0(float f) {
        this.f27386R = f;
        return this;
    }

    /* renamed from: N0 */
    public final C10217q mo25494N0(float f) {
        this.f27385Q = f;
        return this;
    }

    /* renamed from: O0 */
    public final C10217q mo25495O0(float f) {
        this.f27390V = f;
        return this;
    }

    /* renamed from: P0 */
    public final C10217q mo25496P0(float f) {
        this.f27389U = f;
        return this;
    }

    /* renamed from: Q0 */
    public final C10217q mo25497Q0(boolean z) {
        this.f27405k0 = z;
        return this;
    }

    /* renamed from: R0 */
    public final C10217q mo25498R0(float f) {
        this.f27388T = f;
        return this;
    }

    /* renamed from: S0 */
    public final C10217q mo25499S0(float f) {
        this.f27387S = f;
        return this;
    }

    /* renamed from: T0 */
    public final C10217q mo25500T0(float f) {
        this.f27392X = f;
        return this;
    }

    /* renamed from: U0 */
    public final C10217q mo25501U0(float f) {
        this.f27391W = f;
        return this;
    }

    /* renamed from: V0 */
    public final C10217q mo25502V0(int i) {
        this.f27397c0 = i;
        return this;
    }

    /* renamed from: W0 */
    public final C10217q mo25503W0(float f) {
        this.f27384P = f * f;
        return this;
    }

    /* renamed from: X0 */
    public final C10217q mo25504X0(int i) {
        this.f27396b0 = i;
        return this;
    }

    /* renamed from: Y0 */
    public final C10217q mo25505Y0(float f) {
        this.f27395a0 = f * f;
        return this;
    }

    /* renamed from: Z0 */
    public final C10217q mo25506Z0(float f) {
        this.f27393Y = f;
        return this;
    }

    /* renamed from: a1 */
    public final C10217q mo25507a1(float f) {
        this.f27394Z = f;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public void mo24742e0(MotionEvent motionEvent) {
        C10457l.m35320e(motionEvent, "event");
        int N = mo25427N();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 5 || actionMasked == 6) {
            this.f27400f0 += this.f27402h0 - this.f27398d0;
            this.f27401g0 += this.f27403i0 - this.f27399e0;
            C10209l lVar = C10209l.f27367a;
            this.f27402h0 = lVar.mo25482a(motionEvent, this.f27405k0);
            float b = lVar.mo25483b(motionEvent, this.f27405k0);
            this.f27403i0 = b;
            this.f27398d0 = this.f27402h0;
            this.f27399e0 = b;
        } else {
            C10209l lVar2 = C10209l.f27367a;
            this.f27402h0 = lVar2.mo25482a(motionEvent, this.f27405k0);
            this.f27403i0 = lVar2.mo25483b(motionEvent, this.f27405k0);
        }
        if (N != 0 || motionEvent.getPointerCount() < this.f27396b0) {
            VelocityTracker velocityTracker = this.f27404j0;
            if (velocityTracker != null) {
                f27380L.m34717b(velocityTracker, motionEvent);
                VelocityTracker velocityTracker2 = this.f27404j0;
                C10457l.m35317b(velocityTracker2);
                velocityTracker2.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
                VelocityTracker velocityTracker3 = this.f27404j0;
                C10457l.m35317b(velocityTracker3);
                this.f27381M = velocityTracker3.getXVelocity();
                VelocityTracker velocityTracker4 = this.f27404j0;
                C10457l.m35317b(velocityTracker4);
                this.f27382N = velocityTracker4.getYVelocity();
            }
        } else {
            mo25443k0();
            this.f27400f0 = 0.0f;
            this.f27401g0 = 0.0f;
            this.f27381M = 0.0f;
            this.f27382N = 0.0f;
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f27404j0 = obtain;
            f27380L.m34717b(obtain, motionEvent);
            mo25446n();
        }
        if (actionMasked == 1) {
            if (N == 4) {
                mo25465z();
                return;
            }
        } else if (actionMasked != 5 || motionEvent.getPointerCount() <= this.f27397c0) {
            if (!(actionMasked == 6 && N == 4 && motionEvent.getPointerCount() < this.f27396b0)) {
                if (N != 2) {
                    return;
                }
                if (!m34691c1()) {
                    if (m34690b1()) {
                        mo25441i();
                        return;
                    }
                    return;
                }
            }
        } else if (N == 4) {
            mo25448o();
            return;
        }
        mo25409B();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo25405f0() {
        VelocityTracker velocityTracker = this.f27404j0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f27404j0 = null;
        }
    }

    /* renamed from: j */
    public void mo25406j(boolean z) {
        if (mo25427N() != 4) {
            mo25443k0();
        }
        super.mo25406j(z);
    }

    /* renamed from: j0 */
    public void mo25407j0() {
        super.mo25407j0();
        this.f27385Q = Float.MAX_VALUE;
        this.f27386R = Float.MIN_VALUE;
        this.f27387S = Float.MIN_VALUE;
        this.f27388T = Float.MAX_VALUE;
        this.f27389U = Float.MAX_VALUE;
        this.f27390V = Float.MIN_VALUE;
        this.f27391W = Float.MIN_VALUE;
        this.f27392X = Float.MAX_VALUE;
        this.f27393Y = Float.MAX_VALUE;
        this.f27394Z = Float.MAX_VALUE;
        this.f27395a0 = Float.MAX_VALUE;
        this.f27384P = this.f27383O;
        this.f27396b0 = 1;
        this.f27397c0 = 10;
        this.f27405k0 = false;
    }

    /* renamed from: k0 */
    public void mo25443k0() {
        this.f27398d0 = this.f27402h0;
        this.f27399e0 = this.f27403i0;
    }
}
