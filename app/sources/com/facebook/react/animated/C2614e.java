package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.e */
public class C2614e extends C2613d {

    /* renamed from: e */
    private final double f7665e;

    /* renamed from: f */
    private double f7666f;

    /* renamed from: g */
    private long f7667g;

    /* renamed from: h */
    private double f7668h;

    /* renamed from: i */
    private double f7669i;

    /* renamed from: j */
    private int f7670j;

    /* renamed from: k */
    private int f7671k;

    public C2614e(ReadableMap readableMap) {
        this.f7665e = readableMap.getDouble("velocity");
        mo8428a(readableMap);
    }

    /* renamed from: a */
    public void mo8428a(ReadableMap readableMap) {
        this.f7666f = readableMap.getDouble("deceleration");
        boolean z = true;
        int i = readableMap.hasKey("iterations") ? readableMap.getInt("iterations") : 1;
        this.f7670j = i;
        this.f7671k = 1;
        if (i != 0) {
            z = false;
        }
        this.f7661a = z;
        this.f7667g = -1;
        this.f7668h = 0.0d;
        this.f7669i = 0.0d;
    }

    /* renamed from: b */
    public void mo8429b(long j) {
        long j2 = j / 1000000;
        if (this.f7667g == -1) {
            this.f7667g = j2 - 16;
            double d = this.f7668h;
            if (d == this.f7669i) {
                this.f7668h = this.f7662b.f7758f;
            } else {
                this.f7662b.f7758f = d;
            }
            this.f7669i = this.f7662b.f7758f;
        }
        double d2 = this.f7668h;
        double d3 = this.f7665e;
        double d4 = this.f7666f;
        double exp = d2 + ((d3 / (1.0d - d4)) * (1.0d - Math.exp((-(1.0d - d4)) * ((double) (j2 - this.f7667g)))));
        if (Math.abs(this.f7669i - exp) < 0.1d) {
            int i = this.f7670j;
            if (i == -1 || this.f7671k < i) {
                this.f7667g = -1;
                this.f7671k++;
            } else {
                this.f7661a = true;
                return;
            }
        }
        this.f7669i = exp;
        this.f7662b.f7758f = exp;
    }
}
