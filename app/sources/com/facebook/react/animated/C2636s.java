package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.s */
class C2636s extends C2611b {

    /* renamed from: e */
    Object f7757e = null;

    /* renamed from: f */
    double f7758f = Double.NaN;

    /* renamed from: g */
    double f7759g = 0.0d;

    /* renamed from: h */
    private C2612c f7760h;

    public C2636s() {
    }

    public C2636s(ReadableMap readableMap) {
        this.f7758f = readableMap.getDouble("value");
        this.f7759g = readableMap.getDouble("offset");
    }

    /* renamed from: d */
    public String mo8421d() {
        return "ValueAnimatedNode[" + this.f7660d + "]: value: " + this.f7758f + " offset: " + this.f7759g;
    }

    /* renamed from: h */
    public void mo8461h() {
        this.f7759g += this.f7758f;
        this.f7758f = 0.0d;
    }

    /* renamed from: i */
    public void mo8462i() {
        this.f7758f += this.f7759g;
        this.f7759g = 0.0d;
    }

    /* renamed from: j */
    public Object mo8463j() {
        return this.f7757e;
    }

    /* renamed from: k */
    public double mo8464k() {
        if (Double.isNaN(this.f7759g + this.f7758f)) {
            mo8422g();
        }
        return this.f7759g + this.f7758f;
    }

    /* renamed from: l */
    public void mo8465l() {
        C2612c cVar = this.f7760h;
        if (cVar != null) {
            cVar.mo8418a(mo8464k());
        }
    }

    /* renamed from: m */
    public void mo8466m(C2612c cVar) {
        this.f7760h = cVar;
    }
}
