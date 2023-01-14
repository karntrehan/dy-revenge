package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.n */
class C2625n extends C2613d {

    /* renamed from: e */
    private long f7722e;

    /* renamed from: f */
    private boolean f7723f;

    /* renamed from: g */
    private double f7724g;

    /* renamed from: h */
    private double f7725h;

    /* renamed from: i */
    private double f7726i;

    /* renamed from: j */
    private double f7727j;

    /* renamed from: k */
    private boolean f7728k;

    /* renamed from: l */
    private final C2627b f7729l;

    /* renamed from: m */
    private double f7730m;

    /* renamed from: n */
    private double f7731n;

    /* renamed from: o */
    private double f7732o;

    /* renamed from: p */
    private double f7733p;

    /* renamed from: q */
    private double f7734q;

    /* renamed from: r */
    private int f7735r;

    /* renamed from: s */
    private int f7736s;

    /* renamed from: t */
    private double f7737t;

    /* renamed from: com.facebook.react.animated.n$b */
    private static class C2627b {

        /* renamed from: a */
        double f7738a;

        /* renamed from: b */
        double f7739b;

        private C2627b() {
        }
    }

    C2625n(ReadableMap readableMap) {
        C2627b bVar = new C2627b();
        this.f7729l = bVar;
        bVar.f7739b = readableMap.getDouble("initialVelocity");
        mo8428a(readableMap);
    }

    /* renamed from: c */
    private void m10861c(double d) {
        double d2;
        double d3;
        if (!m10863e()) {
            double d4 = 0.064d;
            if (d <= 0.064d) {
                d4 = d;
            }
            this.f7734q += d4;
            double d5 = this.f7725h;
            double d6 = this.f7726i;
            double d7 = this.f7724g;
            double d8 = -this.f7727j;
            double sqrt = d5 / (Math.sqrt(d7 * d6) * 2.0d);
            double sqrt2 = Math.sqrt(d7 / d6);
            double sqrt3 = Math.sqrt(1.0d - (sqrt * sqrt)) * sqrt2;
            double d9 = this.f7731n - this.f7730m;
            double d10 = this.f7734q;
            if (sqrt < 1.0d) {
                double exp = Math.exp((-sqrt) * sqrt2 * d10);
                double d11 = sqrt * sqrt2;
                double d12 = d8 + (d11 * d9);
                double d13 = d10 * sqrt3;
                double d14 = exp;
                d2 = this.f7731n - ((((d12 / sqrt3) * Math.sin(d13)) + (Math.cos(d13) * d9)) * d14);
                d3 = ((d11 * d14) * (((Math.sin(d13) * d12) / sqrt3) + (Math.cos(d13) * d9))) - (((Math.cos(d13) * d12) - ((sqrt3 * d9) * Math.sin(d13))) * d14);
            } else {
                double exp2 = Math.exp((-sqrt2) * d10);
                double d15 = this.f7731n - (((((sqrt2 * d9) + d8) * d10) + d9) * exp2);
                d3 = exp2 * ((d8 * ((d10 * sqrt2) - 1.0d)) + (d10 * d9 * sqrt2 * sqrt2));
                d2 = d15;
            }
            C2627b bVar = this.f7729l;
            bVar.f7738a = d2;
            bVar.f7739b = d3;
            if (m10863e() || (this.f7728k && m10864f())) {
                if (this.f7724g > 0.0d) {
                    double d16 = this.f7731n;
                    this.f7730m = d16;
                    this.f7729l.f7738a = d16;
                } else {
                    double d17 = this.f7729l.f7738a;
                    this.f7731n = d17;
                    this.f7730m = d17;
                }
                this.f7729l.f7739b = 0.0d;
            }
        }
    }

    /* renamed from: d */
    private double m10862d(C2627b bVar) {
        return Math.abs(this.f7731n - bVar.f7738a);
    }

    /* renamed from: e */
    private boolean m10863e() {
        return Math.abs(this.f7729l.f7739b) <= this.f7732o && (m10862d(this.f7729l) <= this.f7733p || this.f7724g == 0.0d);
    }

    /* renamed from: f */
    private boolean m10864f() {
        if (this.f7724g > 0.0d) {
            double d = this.f7730m;
            double d2 = this.f7731n;
            return (d < d2 && this.f7729l.f7738a > d2) || (d > d2 && this.f7729l.f7738a < d2);
        }
    }

    /* renamed from: a */
    public void mo8428a(ReadableMap readableMap) {
        this.f7724g = readableMap.getDouble("stiffness");
        this.f7725h = readableMap.getDouble("damping");
        this.f7726i = readableMap.getDouble("mass");
        this.f7727j = this.f7729l.f7739b;
        this.f7731n = readableMap.getDouble("toValue");
        this.f7732o = readableMap.getDouble("restSpeedThreshold");
        this.f7733p = readableMap.getDouble("restDisplacementThreshold");
        this.f7728k = readableMap.getBoolean("overshootClamping");
        boolean z = true;
        int i = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.f7735r = i;
        if (i != 0) {
            z = false;
        }
        this.f7661a = z;
        this.f7736s = 0;
        this.f7734q = 0.0d;
        this.f7723f = false;
    }

    /* renamed from: b */
    public void mo8429b(long j) {
        long j2 = j / 1000000;
        if (!this.f7723f) {
            if (this.f7736s == 0) {
                this.f7737t = this.f7662b.f7758f;
                this.f7736s = 1;
            }
            C2627b bVar = this.f7729l;
            double d = this.f7662b.f7758f;
            bVar.f7738a = d;
            this.f7730m = d;
            this.f7722e = j2;
            this.f7734q = 0.0d;
            this.f7723f = true;
        }
        m10861c(((double) (j2 - this.f7722e)) / 1000.0d);
        this.f7722e = j2;
        this.f7662b.f7758f = this.f7729l.f7738a;
        if (m10863e()) {
            int i = this.f7735r;
            if (i == -1 || this.f7736s < i) {
                this.f7723f = false;
                this.f7662b.f7758f = this.f7737t;
                this.f7736s++;
                return;
            }
            this.f7661a = true;
        }
    }
}
