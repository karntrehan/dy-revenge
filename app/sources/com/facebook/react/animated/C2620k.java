package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.k */
class C2620k extends C2636s {

    /* renamed from: i */
    private final C2621l f7700i;

    /* renamed from: j */
    private final int[] f7701j;

    public C2620k(ReadableMap readableMap, C2621l lVar) {
        this.f7700i = lVar;
        ReadableArray array = readableMap.getArray("input");
        this.f7701j = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f7701j;
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
        sb.append("MultiplicationAnimatedNode[");
        sb.append(this.f7660d);
        sb.append("]: input nodes: ");
        int[] iArr = this.f7701j;
        sb.append(iArr != null ? iArr.toString() : "null");
        sb.append(" - super: ");
        sb.append(super.mo8421d());
        return sb.toString();
    }

    /* renamed from: g */
    public void mo8422g() {
        this.f7758f = 1.0d;
        int i = 0;
        while (true) {
            int[] iArr = this.f7701j;
            if (i < iArr.length) {
                C2611b o = this.f7700i.mo8442o(iArr[i]);
                if (o != null && (o instanceof C2636s)) {
                    this.f7758f *= ((C2636s) o).mo8464k();
                    i++;
                }
            } else {
                return;
            }
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.multiply node");
    }
}
