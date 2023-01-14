package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* renamed from: com.facebook.react.animated.h */
class C2617h extends C2613d {

    /* renamed from: e */
    private long f7679e;

    /* renamed from: f */
    private double[] f7680f;

    /* renamed from: g */
    private double f7681g;

    /* renamed from: h */
    private double f7682h;

    /* renamed from: i */
    private int f7683i;

    /* renamed from: j */
    private int f7684j;

    C2617h(ReadableMap readableMap) {
        mo8428a(readableMap);
    }

    /* renamed from: a */
    public void mo8428a(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("frames");
        int size = array.size();
        double[] dArr = this.f7680f;
        if (dArr == null || dArr.length != size) {
            this.f7680f = new double[size];
        }
        boolean z = false;
        for (int i = 0; i < size; i++) {
            this.f7680f[i] = array.getDouble(i);
        }
        double d = 0.0d;
        if (readableMap.hasKey("toValue") && readableMap.getType("toValue") == ReadableType.Number) {
            d = readableMap.getDouble("toValue");
        }
        this.f7681g = d;
        if (readableMap.hasKey("iterations")) {
            this.f7683i = readableMap.getType("iterations") == ReadableType.Number ? readableMap.getInt("iterations") : 1;
        } else {
            this.f7683i = 1;
        }
        this.f7684j = 1;
        if (this.f7683i == 0) {
            z = true;
        }
        this.f7661a = z;
        this.f7679e = -1;
    }

    /* renamed from: b */
    public void mo8429b(long j) {
        double d;
        if (this.f7679e < 0) {
            this.f7679e = j;
            if (this.f7684j == 1) {
                this.f7682h = this.f7662b.f7758f;
            }
        }
        int round = (int) Math.round(((double) ((j - this.f7679e) / 1000000)) / 16.666666666666668d);
        if (round < 0) {
            throw new IllegalStateException("Calculated frame index should never be lower than 0");
        } else if (!this.f7661a) {
            double[] dArr = this.f7680f;
            if (round >= dArr.length - 1) {
                d = this.f7681g;
                int i = this.f7683i;
                if (i == -1 || this.f7684j < i) {
                    this.f7679e = -1;
                    this.f7684j++;
                } else {
                    this.f7661a = true;
                }
            } else {
                double d2 = this.f7682h;
                d = d2 + (dArr[round] * (this.f7681g - d2));
            }
            this.f7662b.f7758f = d;
        }
    }
}
