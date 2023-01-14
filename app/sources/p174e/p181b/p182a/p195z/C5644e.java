package p174e.p181b.p182a.p195z;

import android.view.Choreographer;
import p174e.p181b.p182a.C5422c;
import p174e.p181b.p182a.C5433e;

/* renamed from: e.b.a.z.e */
public class C5644e extends C5640a implements Choreographer.FrameCallback {

    /* renamed from: p */
    private float f15965p = 1.0f;

    /* renamed from: q */
    private boolean f15966q = false;

    /* renamed from: r */
    private long f15967r = 0;

    /* renamed from: s */
    private float f15968s = 0.0f;

    /* renamed from: t */
    private int f15969t = 0;

    /* renamed from: u */
    private float f15970u = -2.14748365E9f;

    /* renamed from: v */
    private float f15971v = 2.14748365E9f;

    /* renamed from: w */
    private C5433e f15972w;

    /* renamed from: x */
    protected boolean f15973x = false;

    /* renamed from: H */
    private void m21029H() {
        if (this.f15972w != null) {
            float f = this.f15968s;
            if (f < this.f15970u || f > this.f15971v) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f15970u), Float.valueOf(this.f15971v), Float.valueOf(this.f15968s)}));
            }
        }
    }

    /* renamed from: m */
    private float m21030m() {
        C5433e eVar = this.f15972w;
        if (eVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / eVar.mo16463i()) / Math.abs(this.f15965p);
    }

    /* renamed from: r */
    private boolean m21031r() {
        return mo16915q() < 0.0f;
    }

    /* renamed from: B */
    public void mo16898B(float f) {
        if (this.f15968s != f) {
            this.f15968s = C5646g.m21055c(f, mo16914p(), mo16913n());
            this.f15967r = 0;
            mo16888g();
        }
    }

    /* renamed from: C */
    public void mo16899C(float f) {
        mo16900D(this.f15970u, f);
    }

    /* renamed from: D */
    public void mo16900D(float f, float f2) {
        if (f <= f2) {
            C5433e eVar = this.f15972w;
            float p = eVar == null ? -3.4028235E38f : eVar.mo16470p();
            C5433e eVar2 = this.f15972w;
            float f3 = eVar2 == null ? Float.MAX_VALUE : eVar2.mo16460f();
            float c = C5646g.m21055c(f, p, f3);
            float c2 = C5646g.m21055c(f2, p, f3);
            if (c != this.f15970u || c2 != this.f15971v) {
                this.f15970u = c;
                this.f15971v = c2;
                mo16898B((float) ((int) C5646g.m21055c(this.f15968s, c, c2)));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    /* renamed from: F */
    public void mo16901F(int i) {
        mo16900D((float) i, (float) ((int) this.f15971v));
    }

    /* renamed from: G */
    public void mo16902G(float f) {
        this.f15965p = f;
    }

    public void cancel() {
        mo16884c();
        mo16920v();
    }

    public void doFrame(long j) {
        mo16919u();
        if (this.f15972w != null && isRunning()) {
            C5422c.m20179a("LottieValueAnimator#doFrame");
            long j2 = this.f15967r;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float m = ((float) j3) / m21030m();
            float f = this.f15968s;
            if (m21031r()) {
                m = -m;
            }
            float f2 = f + m;
            this.f15968s = f2;
            boolean z = !C5646g.m21057e(f2, mo16914p(), mo16913n());
            this.f15968s = C5646g.m21055c(this.f15968s, mo16914p(), mo16913n());
            this.f15967r = j;
            mo16888g();
            if (z) {
                if (getRepeatCount() == -1 || this.f15969t < getRepeatCount()) {
                    mo16886e();
                    this.f15969t++;
                    if (getRepeatMode() == 2) {
                        this.f15966q = !this.f15966q;
                        mo16923y();
                    } else {
                        this.f15968s = m21031r() ? mo16913n() : mo16914p();
                    }
                    this.f15967r = j;
                } else {
                    this.f15968s = this.f15965p < 0.0f ? mo16914p() : mo16913n();
                    mo16920v();
                    mo16885d(m21031r());
                }
            }
            m21029H();
            C5422c.m20180b("LottieValueAnimator#doFrame");
        }
    }

    public float getAnimatedFraction() {
        float f;
        float p;
        if (this.f15972w == null) {
            return 0.0f;
        }
        if (m21031r()) {
            f = mo16913n();
            p = this.f15968s;
        } else {
            f = this.f15968s;
            p = mo16914p();
        }
        return (f - p) / (mo16913n() - mo16914p());
    }

    public Object getAnimatedValue() {
        return Float.valueOf(mo16911k());
    }

    public long getDuration() {
        C5433e eVar = this.f15972w;
        if (eVar == null) {
            return 0;
        }
        return (long) eVar.mo16458d();
    }

    /* renamed from: i */
    public void mo16908i() {
        this.f15972w = null;
        this.f15970u = -2.14748365E9f;
        this.f15971v = 2.14748365E9f;
    }

    public boolean isRunning() {
        return this.f15973x;
    }

    /* renamed from: j */
    public void mo16910j() {
        mo16920v();
        mo16885d(m21031r());
    }

    /* renamed from: k */
    public float mo16911k() {
        C5433e eVar = this.f15972w;
        if (eVar == null) {
            return 0.0f;
        }
        return (this.f15968s - eVar.mo16470p()) / (this.f15972w.mo16460f() - this.f15972w.mo16470p());
    }

    /* renamed from: l */
    public float mo16912l() {
        return this.f15968s;
    }

    /* renamed from: n */
    public float mo16913n() {
        C5433e eVar = this.f15972w;
        if (eVar == null) {
            return 0.0f;
        }
        float f = this.f15971v;
        return f == 2.14748365E9f ? eVar.mo16460f() : f;
    }

    /* renamed from: p */
    public float mo16914p() {
        C5433e eVar = this.f15972w;
        if (eVar == null) {
            return 0.0f;
        }
        float f = this.f15970u;
        return f == -2.14748365E9f ? eVar.mo16470p() : f;
    }

    /* renamed from: q */
    public float mo16915q() {
        return this.f15965p;
    }

    /* renamed from: s */
    public void mo16916s() {
        mo16920v();
    }

    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f15966q) {
            this.f15966q = false;
            mo16923y();
        }
    }

    /* renamed from: t */
    public void mo16918t() {
        this.f15973x = true;
        mo16887f(m21031r());
        mo16898B((float) ((int) (m21031r() ? mo16913n() : mo16914p())));
        this.f15967r = 0;
        this.f15969t = 0;
        mo16919u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo16919u() {
        if (isRunning()) {
            mo16921w(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo16920v() {
        mo16921w(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo16921w(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f15973x = false;
        }
    }

    /* renamed from: x */
    public void mo16922x() {
        float p;
        this.f15973x = true;
        mo16919u();
        this.f15967r = 0;
        if (m21031r() && mo16912l() == mo16914p()) {
            p = mo16913n();
        } else if (!m21031r() && mo16912l() == mo16913n()) {
            p = mo16914p();
        } else {
            return;
        }
        this.f15968s = p;
    }

    /* renamed from: y */
    public void mo16923y() {
        mo16902G(-mo16915q());
    }

    /* renamed from: z */
    public void mo16924z(C5433e eVar) {
        float f;
        float f2;
        boolean z = this.f15972w == null;
        this.f15972w = eVar;
        if (z) {
            f2 = (float) ((int) Math.max(this.f15970u, eVar.mo16470p()));
            f = Math.min(this.f15971v, eVar.mo16460f());
        } else {
            f2 = (float) ((int) eVar.mo16470p());
            f = eVar.mo16460f();
        }
        mo16900D(f2, (float) ((int) f));
        float f3 = this.f15968s;
        this.f15968s = 0.0f;
        mo16898B((float) ((int) f3));
        mo16888g();
    }
}
