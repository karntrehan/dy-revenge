package com.facebook.react.uimanager;

import com.facebook.yoga.C3307g;

/* renamed from: com.facebook.react.uimanager.m0 */
public class C3001m0 {

    /* renamed from: a */
    private static final int[] f8335a = {1, 2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: b */
    private final float[] f8336b;

    /* renamed from: c */
    private int f8337c;

    /* renamed from: d */
    private final float f8338d;

    /* renamed from: e */
    private boolean f8339e;

    public C3001m0() {
        this(0.0f);
    }

    public C3001m0(float f) {
        this.f8337c = 0;
        this.f8338d = f;
        this.f8336b = m11891c();
    }

    /* renamed from: c */
    private static float[] m11891c() {
        return new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    }

    /* renamed from: a */
    public float mo9735a(int i) {
        float f = (i == 4 || i == 5) ? Float.NaN : this.f8338d;
        int i2 = this.f8337c;
        if (i2 == 0) {
            return f;
        }
        int[] iArr = f8335a;
        if ((iArr[i] & i2) != 0) {
            return this.f8336b[i];
        }
        if (this.f8339e) {
            char c = (i == 1 || i == 3) ? (char) 7 : 6;
            if ((iArr[c] & i2) != 0) {
                return this.f8336b[c];
            }
            if ((i2 & iArr[8]) != 0) {
                return this.f8336b[8];
            }
        }
        return f;
    }

    /* renamed from: b */
    public float mo9736b(int i) {
        return this.f8336b[i];
    }

    /* renamed from: d */
    public boolean mo9737d(int i, float f) {
        int i2;
        boolean z = false;
        if (C2939e.m11588a(this.f8336b[i], f)) {
            return false;
        }
        this.f8336b[i] = f;
        if (C3307g.m12971a(f)) {
            i2 = (~f8335a[i]) & this.f8337c;
        } else {
            i2 = f8335a[i] | this.f8337c;
        }
        this.f8337c = i2;
        int i3 = this.f8337c;
        int[] iArr = f8335a;
        if (!((iArr[8] & i3) == 0 && (iArr[7] & i3) == 0 && (i3 & iArr[6]) == 0)) {
            z = true;
        }
        this.f8339e = z;
        return true;
    }
}
