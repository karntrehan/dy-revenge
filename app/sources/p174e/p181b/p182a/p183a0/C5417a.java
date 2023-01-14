package p174e.p181b.p182a.p183a0;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import p174e.p181b.p182a.C5433e;

/* renamed from: e.b.a.a0.a */
public class C5417a<T> {

    /* renamed from: a */
    private final C5433e f15113a;

    /* renamed from: b */
    public final T f15114b;

    /* renamed from: c */
    public T f15115c;

    /* renamed from: d */
    public final Interpolator f15116d;

    /* renamed from: e */
    public final Interpolator f15117e;

    /* renamed from: f */
    public final Interpolator f15118f;

    /* renamed from: g */
    public final float f15119g;

    /* renamed from: h */
    public Float f15120h;

    /* renamed from: i */
    private float f15121i;

    /* renamed from: j */
    private float f15122j;

    /* renamed from: k */
    private int f15123k;

    /* renamed from: l */
    private int f15124l;

    /* renamed from: m */
    private float f15125m;

    /* renamed from: n */
    private float f15126n;

    /* renamed from: o */
    public PointF f15127o;

    /* renamed from: p */
    public PointF f15128p;

    public C5417a(C5433e eVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f15121i = -3987645.8f;
        this.f15122j = -3987645.8f;
        this.f15123k = 784923401;
        this.f15124l = 784923401;
        this.f15125m = Float.MIN_VALUE;
        this.f15126n = Float.MIN_VALUE;
        this.f15127o = null;
        this.f15128p = null;
        this.f15113a = eVar;
        this.f15114b = t;
        this.f15115c = t2;
        this.f15116d = interpolator;
        this.f15117e = null;
        this.f15118f = null;
        this.f15119g = f;
        this.f15120h = f2;
    }

    public C5417a(C5433e eVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.f15121i = -3987645.8f;
        this.f15122j = -3987645.8f;
        this.f15123k = 784923401;
        this.f15124l = 784923401;
        this.f15125m = Float.MIN_VALUE;
        this.f15126n = Float.MIN_VALUE;
        this.f15127o = null;
        this.f15128p = null;
        this.f15113a = eVar;
        this.f15114b = t;
        this.f15115c = t2;
        this.f15116d = null;
        this.f15117e = interpolator;
        this.f15118f = interpolator2;
        this.f15119g = f;
        this.f15120h = f2;
    }

    protected C5417a(C5433e eVar, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f15121i = -3987645.8f;
        this.f15122j = -3987645.8f;
        this.f15123k = 784923401;
        this.f15124l = 784923401;
        this.f15125m = Float.MIN_VALUE;
        this.f15126n = Float.MIN_VALUE;
        this.f15127o = null;
        this.f15128p = null;
        this.f15113a = eVar;
        this.f15114b = t;
        this.f15115c = t2;
        this.f15116d = interpolator;
        this.f15117e = interpolator2;
        this.f15118f = interpolator3;
        this.f15119g = f;
        this.f15120h = f2;
    }

    public C5417a(T t) {
        this.f15121i = -3987645.8f;
        this.f15122j = -3987645.8f;
        this.f15123k = 784923401;
        this.f15124l = 784923401;
        this.f15125m = Float.MIN_VALUE;
        this.f15126n = Float.MIN_VALUE;
        this.f15127o = null;
        this.f15128p = null;
        this.f15113a = null;
        this.f15114b = t;
        this.f15115c = t;
        this.f15116d = null;
        this.f15117e = null;
        this.f15118f = null;
        this.f15119g = Float.MIN_VALUE;
        this.f15120h = Float.valueOf(Float.MAX_VALUE);
    }

    /* renamed from: a */
    public boolean mo16359a(float f) {
        return f >= mo16363e() && f < mo16360b();
    }

    /* renamed from: b */
    public float mo16360b() {
        if (this.f15113a == null) {
            return 1.0f;
        }
        if (this.f15126n == Float.MIN_VALUE) {
            if (this.f15120h == null) {
                this.f15126n = 1.0f;
            } else {
                this.f15126n = mo16363e() + ((this.f15120h.floatValue() - this.f15119g) / this.f15113a.mo16459e());
            }
        }
        return this.f15126n;
    }

    /* renamed from: c */
    public float mo16361c() {
        if (this.f15122j == -3987645.8f) {
            this.f15122j = ((Float) this.f15115c).floatValue();
        }
        return this.f15122j;
    }

    /* renamed from: d */
    public int mo16362d() {
        if (this.f15124l == 784923401) {
            this.f15124l = ((Integer) this.f15115c).intValue();
        }
        return this.f15124l;
    }

    /* renamed from: e */
    public float mo16363e() {
        C5433e eVar = this.f15113a;
        if (eVar == null) {
            return 0.0f;
        }
        if (this.f15125m == Float.MIN_VALUE) {
            this.f15125m = (this.f15119g - eVar.mo16470p()) / this.f15113a.mo16459e();
        }
        return this.f15125m;
    }

    /* renamed from: f */
    public float mo16364f() {
        if (this.f15121i == -3987645.8f) {
            this.f15121i = ((Float) this.f15114b).floatValue();
        }
        return this.f15121i;
    }

    /* renamed from: g */
    public int mo16365g() {
        if (this.f15123k == 784923401) {
            this.f15123k = ((Integer) this.f15114b).intValue();
        }
        return this.f15123k;
    }

    /* renamed from: h */
    public boolean mo16366h() {
        return this.f15116d == null && this.f15117e == null && this.f15118f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f15114b + ", endValue=" + this.f15115c + ", startFrame=" + this.f15119g + ", endFrame=" + this.f15120h + ", interpolator=" + this.f15116d + '}';
    }
}
