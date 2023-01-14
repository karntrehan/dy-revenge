package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.g */
class C2616g extends C2636s {

    /* renamed from: i */
    private final C2621l f7677i;

    /* renamed from: j */
    private final int[] f7678j;

    public C2616g(ReadableMap readableMap, C2621l lVar) {
        this.f7677i = lVar;
        ReadableArray array = readableMap.getArray("input");
        this.f7678j = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f7678j;
            if (i < iArr.length) {
                iArr[i] = array.getInt(i);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public String mo8421d() {
        StringBuilder sb = new StringBuilder();
        sb.append("DivisionAnimatedNode[");
        sb.append(this.f7660d);
        sb.append("]: input nodes: ");
        int[] iArr = this.f7678j;
        sb.append(iArr != null ? iArr.toString() : "null");
        sb.append(" - super: ");
        sb.append(super.mo8421d());
        return sb.toString();
    }

    /* renamed from: g */
    public void mo8422g() {
        int i = 0;
        while (true) {
            int[] iArr = this.f7678j;
            if (i < iArr.length) {
                C2611b o = this.f7677i.mo8442o(iArr[i]);
                if (o == null || !(o instanceof C2636s)) {
                } else {
                    double k = ((C2636s) o).mo8464k();
                    if (i == 0) {
                        this.f7758f = k;
                    } else if (k != 0.0d) {
                        this.f7758f /= k;
                    } else {
                        throw new JSApplicationCausedNativeException("Detected a division by zero in Animated.divide node with Animated ID " + this.f7660d);
                    }
                    i++;
                }
            } else {
                return;
            }
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.divide node with Animated ID " + this.f7660d);
    }
}
