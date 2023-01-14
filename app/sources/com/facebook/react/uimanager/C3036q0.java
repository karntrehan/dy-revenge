package com.facebook.react.uimanager;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* renamed from: com.facebook.react.uimanager.q0 */
public class C3036q0 {

    /* renamed from: a */
    private static ThreadLocal<double[]> f8434a = new C3037a();

    /* renamed from: com.facebook.react.uimanager.q0$a */
    static class C3037a extends ThreadLocal<double[]> {
        C3037a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public double[] initialValue() {
            return new double[16];
        }
    }

    /* renamed from: a */
    private static double m12001a(ReadableMap readableMap, String str) {
        double d;
        boolean z = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z = false;
            }
            d = (double) Float.parseFloat(string);
        } else {
            d = readableMap.getDouble(str);
        }
        return z ? d : C2993k.m11860l(d);
    }

    /* renamed from: b */
    public static void m12002b(ReadableArray readableArray, double[] dArr) {
        double d;
        double[] dArr2 = f8434a.get();
        C2993k.m11866r(dArr);
        if (readableArray.size() == 16 && readableArray.getType(0) == ReadableType.Number) {
            for (int i = 0; i < readableArray.size(); i++) {
                dArr[i] = readableArray.getDouble(i);
            }
            return;
        }
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReadableMap map = readableArray.getMap(i2);
            String nextKey = map.keySetIterator().nextKey();
            C2993k.m11866r(dArr2);
            if ("matrix".equals(nextKey)) {
                ReadableArray array = map.getArray(nextKey);
                for (int i3 = 0; i3 < 16; i3++) {
                    dArr2[i3] = array.getDouble(i3);
                }
            } else if ("perspective".equals(nextKey)) {
                C2993k.m11849a(dArr2, map.getDouble(nextKey));
            } else if ("rotateX".equals(nextKey)) {
                C2993k.m11850b(dArr2, m12001a(map, nextKey));
            } else if ("rotateY".equals(nextKey)) {
                C2993k.m11851c(dArr2, m12001a(map, nextKey));
            } else if ("rotate".equals(nextKey) || "rotateZ".equals(nextKey)) {
                C2993k.m11852d(dArr2, m12001a(map, nextKey));
            } else {
                if ("scale".equals(nextKey)) {
                    d = map.getDouble(nextKey);
                    C2993k.m11853e(dArr2, d);
                } else if ("scaleX".equals(nextKey)) {
                    C2993k.m11853e(dArr2, map.getDouble(nextKey));
                } else if ("scaleY".equals(nextKey)) {
                    d = map.getDouble(nextKey);
                } else {
                    double d2 = 0.0d;
                    if ("translate".equals(nextKey)) {
                        ReadableArray array2 = map.getArray(nextKey);
                        double d3 = array2.getDouble(0);
                        double d4 = array2.getDouble(1);
                        if (array2.size() > 2) {
                            d2 = array2.getDouble(2);
                        }
                        C2993k.m11858j(dArr2, d3, d4, d2);
                    } else if ("translateX".equals(nextKey)) {
                        C2993k.m11857i(dArr2, map.getDouble(nextKey), 0.0d);
                    } else if ("translateY".equals(nextKey)) {
                        C2993k.m11857i(dArr2, 0.0d, map.getDouble(nextKey));
                    } else if ("skewX".equals(nextKey)) {
                        C2993k.m11855g(dArr2, m12001a(map, nextKey));
                    } else if ("skewY".equals(nextKey)) {
                        C2993k.m11856h(dArr2, m12001a(map, nextKey));
                    } else {
                        throw new JSApplicationIllegalArgumentException("Unsupported transform type: " + nextKey);
                    }
                }
                C2993k.m11854f(dArr2, d);
            }
            C2993k.m11864p(dArr, dArr, dArr2);
        }
    }
}
