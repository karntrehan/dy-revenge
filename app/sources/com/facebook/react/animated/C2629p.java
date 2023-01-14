package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.animated.p */
class C2629p extends C2636s {

    /* renamed from: i */
    private final C2621l f7742i;

    /* renamed from: j */
    private final int[] f7743j;

    public C2629p(ReadableMap readableMap, C2621l lVar) {
        this.f7742i = lVar;
        ReadableArray array = readableMap.getArray("input");
        this.f7743j = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f7743j;
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
        sb.append("SubtractionAnimatedNode[");
        sb.append(this.f7660d);
        sb.append("]: input nodes: ");
        int[] iArr = this.f7743j;
        sb.append(iArr != null ? iArr.toString() : "null");
        sb.append(" - super: ");
        sb.append(super.mo8421d());
        return sb.toString();
    }

    /* renamed from: g */
    public void mo8422g() {
        int i = 0;
        while (true) {
            int[] iArr = this.f7743j;
            if (i < iArr.length) {
                C2611b o = this.f7742i.mo8442o(iArr[i]);
                if (o != null && (o instanceof C2636s)) {
                    C2636s sVar = (C2636s) o;
                    double k = sVar.mo8464k();
                    if (i != 0) {
                        k = this.f7758f - sVar.mo8464k();
                    }
                    this.f7758f = k;
                    i++;
                }
            } else {
                return;
            }
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.subtract node");
    }
}
