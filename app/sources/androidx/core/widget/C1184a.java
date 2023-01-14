package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p027c.p064i.p072j.C1988t;

/* renamed from: androidx.core.widget.a */
public abstract class C1184a implements View.OnTouchListener {

    /* renamed from: f */
    private static final int f3296f = ViewConfiguration.getTapTimeout();

    /* renamed from: A */
    boolean f3297A;

    /* renamed from: B */
    boolean f3298B;

    /* renamed from: C */
    boolean f3299C;

    /* renamed from: D */
    private boolean f3300D;

    /* renamed from: E */
    private boolean f3301E;

    /* renamed from: o */
    final C1185a f3302o = new C1185a();

    /* renamed from: p */
    private final Interpolator f3303p = new AccelerateInterpolator();

    /* renamed from: q */
    final View f3304q;

    /* renamed from: r */
    private Runnable f3305r;

    /* renamed from: s */
    private float[] f3306s = {0.0f, 0.0f};

    /* renamed from: t */
    private float[] f3307t = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: u */
    private int f3308u;

    /* renamed from: v */
    private int f3309v;

    /* renamed from: w */
    private float[] f3310w = {0.0f, 0.0f};

    /* renamed from: x */
    private float[] f3311x = {0.0f, 0.0f};

    /* renamed from: y */
    private float[] f3312y = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: z */
    private boolean f3313z;

    /* renamed from: androidx.core.widget.a$a */
    private static class C1185a {

        /* renamed from: a */
        private int f3314a;

        /* renamed from: b */
        private int f3315b;

        /* renamed from: c */
        private float f3316c;

        /* renamed from: d */
        private float f3317d;

        /* renamed from: e */
        private long f3318e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f3319f = 0;

        /* renamed from: g */
        private int f3320g = 0;

        /* renamed from: h */
        private int f3321h = 0;

        /* renamed from: i */
        private long f3322i = -1;

        /* renamed from: j */
        private float f3323j;

        /* renamed from: k */
        private int f3324k;

        C1185a() {
        }

        /* renamed from: e */
        private float m4664e(long j) {
            long j2 = this.f3318e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f3322i;
            if (j3 < 0 || j < j3) {
                return C1184a.m4643e(((float) (j - j2)) / ((float) this.f3314a), 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f3323j;
            return (1.0f - f) + (f * C1184a.m4643e(((float) (j - j3)) / ((float) this.f3324k), 0.0f, 1.0f));
        }

        /* renamed from: g */
        private float m4665g(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void mo3800a() {
            if (this.f3319f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g = m4665g(m4664e(currentAnimationTimeMillis));
                this.f3319f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f3319f)) * g;
                this.f3320g = (int) (this.f3316c * f);
                this.f3321h = (int) (f * this.f3317d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int mo3801b() {
            return this.f3320g;
        }

        /* renamed from: c */
        public int mo3802c() {
            return this.f3321h;
        }

        /* renamed from: d */
        public int mo3803d() {
            float f = this.f3316c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int mo3804f() {
            float f = this.f3317d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: h */
        public boolean mo3805h() {
            return this.f3322i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f3322i + ((long) this.f3324k);
        }

        /* renamed from: i */
        public void mo3806i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3324k = C1184a.m4644f((int) (currentAnimationTimeMillis - this.f3318e), 0, this.f3315b);
            this.f3323j = m4664e(currentAnimationTimeMillis);
            this.f3322i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void mo3807j(int i) {
            this.f3315b = i;
        }

        /* renamed from: k */
        public void mo3808k(int i) {
            this.f3314a = i;
        }

        /* renamed from: l */
        public void mo3809l(float f, float f2) {
            this.f3316c = f;
            this.f3317d = f2;
        }

        /* renamed from: m */
        public void mo3810m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3318e = currentAnimationTimeMillis;
            this.f3322i = -1;
            this.f3319f = currentAnimationTimeMillis;
            this.f3323j = 0.5f;
            this.f3320g = 0;
            this.f3321h = 0;
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    private class C1186b implements Runnable {
        C1186b() {
        }

        public void run() {
            C1184a aVar = C1184a.this;
            if (aVar.f3299C) {
                if (aVar.f3297A) {
                    aVar.f3297A = false;
                    aVar.f3302o.mo3810m();
                }
                C1185a aVar2 = C1184a.this.f3302o;
                if (aVar2.mo3805h() || !C1184a.this.mo3799u()) {
                    C1184a.this.f3299C = false;
                    return;
                }
                C1184a aVar3 = C1184a.this;
                if (aVar3.f3298B) {
                    aVar3.f3298B = false;
                    aVar3.mo3786c();
                }
                aVar2.mo3800a();
                C1184a.this.mo3787j(aVar2.mo3801b(), aVar2.mo3802c());
                C1988t.m8378e0(C1184a.this.f3304q, this);
            }
        }
    }

    public C1184a(View view) {
        this.f3304q = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo3792o(f2, f2);
        float f3 = (float) ((int) ((f * 315.0f) + 0.5f));
        mo3794p(f3, f3);
        mo3789l(1);
        mo3791n(Float.MAX_VALUE, Float.MAX_VALUE);
        mo3797s(0.2f, 0.2f);
        mo3798t(1.0f, 1.0f);
        mo3788k(f3296f);
        mo3796r(500);
        mo3795q(500);
    }

    /* renamed from: d */
    private float m4642d(int i, float f, float f2, float f3) {
        float h = m4646h(this.f3306s[i], f2, this.f3307t[i], f);
        int i2 = (h > 0.0f ? 1 : (h == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f3310w[i];
        float f5 = this.f3311x[i];
        float f6 = this.f3312y[i];
        float f7 = f4 * f3;
        return i2 > 0 ? m4643e(h * f7, f5, f6) : -m4643e((-h) * f7, f5, f6);
    }

    /* renamed from: e */
    static float m4643e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    static int m4644f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: g */
    private float m4645g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f3308u;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (!this.f3299C || i != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: h */
    private float m4646h(float f, float f2, float f3, float f4) {
        float f5;
        float e = m4643e(f * f2, 0.0f, f3);
        float g = m4645g(f2 - f4, e) - m4645g(f4, e);
        if (g < 0.0f) {
            f5 = -this.f3303p.getInterpolation(-g);
        } else if (g <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f3303p.getInterpolation(g);
        }
        return m4643e(f5, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m4647i() {
        if (this.f3297A) {
            this.f3299C = false;
        } else {
            this.f3302o.mo3806i();
        }
    }

    /* renamed from: v */
    private void m4648v() {
        int i;
        if (this.f3305r == null) {
            this.f3305r = new C1186b();
        }
        this.f3299C = true;
        this.f3297A = true;
        if (this.f3313z || (i = this.f3309v) <= 0) {
            this.f3305r.run();
        } else {
            C1988t.m8380f0(this.f3304q, this.f3305r, (long) i);
        }
        this.f3313z = true;
    }

    /* renamed from: a */
    public abstract boolean mo3784a(int i);

    /* renamed from: b */
    public abstract boolean mo3785b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3786c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f3304q.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo3787j(int i, int i2);

    /* renamed from: k */
    public C1184a mo3788k(int i) {
        this.f3309v = i;
        return this;
    }

    /* renamed from: l */
    public C1184a mo3789l(int i) {
        this.f3308u = i;
        return this;
    }

    /* renamed from: m */
    public C1184a mo3790m(boolean z) {
        if (this.f3300D && !z) {
            m4647i();
        }
        this.f3300D = z;
        return this;
    }

    /* renamed from: n */
    public C1184a mo3791n(float f, float f2) {
        float[] fArr = this.f3307t;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: o */
    public C1184a mo3792o(float f, float f2) {
        float[] fArr = this.f3312y;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3300D
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m4647i()
            goto L_0x0058
        L_0x001a:
            r5.f3298B = r2
            r5.f3313z = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f3304q
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m4642d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f3304q
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m4642d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f3302o
            r7.mo3809l(r0, r6)
            boolean r6 = r5.f3299C
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo3799u()
            if (r6 == 0) goto L_0x0058
            r5.m4648v()
        L_0x0058:
            boolean r6 = r5.f3301E
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f3299C
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C1184a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public C1184a mo3794p(float f, float f2) {
        float[] fArr = this.f3311x;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public C1184a mo3795q(int i) {
        this.f3302o.mo3807j(i);
        return this;
    }

    /* renamed from: r */
    public C1184a mo3796r(int i) {
        this.f3302o.mo3808k(i);
        return this;
    }

    /* renamed from: s */
    public C1184a mo3797s(float f, float f2) {
        float[] fArr = this.f3306s;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: t */
    public C1184a mo3798t(float f, float f2) {
        float[] fArr = this.f3310w;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo3799u() {
        C1185a aVar = this.f3302o;
        int f = aVar.mo3804f();
        int d = aVar.mo3803d();
        return (f != 0 && mo3785b(f)) || (d != 0 && mo3784a(d));
    }
}
