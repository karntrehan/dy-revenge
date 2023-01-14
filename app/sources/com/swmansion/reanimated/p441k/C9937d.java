package com.swmansion.reanimated.p441k;

import android.animation.TimeInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import p027c.p100v.C2125a0;
import p027c.p100v.C2127b0;
import p027c.p100v.C2132d;
import p027c.p100v.C2145e;
import p027c.p100v.C2153f;
import p027c.p100v.C2199v0;
import p027c.p100v.C2203w;
import p027c.p100v.C2214x;

/* renamed from: com.swmansion.reanimated.k.d */
class C9937d {
    /* renamed from: a */
    private static void m33843a(C2214x xVar, ReadableMap readableMap) {
        int i;
        TimeInterpolator linearInterpolator;
        if (readableMap.hasKey("durationMs")) {
            xVar.mo7184f0((long) readableMap.getInt("durationMs"));
        }
        if (readableMap.hasKey("interpolation")) {
            String string = readableMap.getString("interpolation");
            if (string.equals("easeIn")) {
                linearInterpolator = new AccelerateInterpolator();
            } else if (string.equals("easeOut")) {
                linearInterpolator = new DecelerateInterpolator();
            } else if (string.equals("easeInOut")) {
                linearInterpolator = new AccelerateDecelerateInterpolator();
            } else if (string.equals("linear")) {
                linearInterpolator = new LinearInterpolator();
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid interpolation type " + string);
            }
            xVar.mo7186h0(linearInterpolator);
        }
        if (readableMap.hasKey("propagation")) {
            String string2 = readableMap.getString("propagation");
            C9932a aVar = new C9932a();
            if ("top".equals(string2)) {
                i = 80;
            } else if ("bottom".equals(string2)) {
                i = 48;
            } else if ("left".equals(string2)) {
                i = 5;
            } else {
                if ("right".equals(string2)) {
                    i = 3;
                }
                xVar.mo7190k0(aVar);
            }
            aVar.mo7358j(i);
            xVar.mo7190k0(aVar);
        } else {
            xVar.mo7190k0((C2125a0) null);
        }
        if (readableMap.hasKey("delayMs")) {
            xVar.mo7192l0((long) readableMap.getInt("delayMs"));
        }
    }

    /* renamed from: b */
    private static C2199v0 m33844b(String str) {
        if (str == null || "none".equals(str)) {
            return null;
        }
        if ("fade".equals(str)) {
            return new C2153f(3);
        }
        if ("scale".equals(str)) {
            return new C9933b();
        }
        if ("slide-top".equals(str)) {
            return new C2203w(48);
        }
        if ("slide-bottom".equals(str)) {
            return new C2203w(80);
        }
        if ("slide-right".equals(str)) {
            return new C2203w(5);
        }
        if ("slide-left".equals(str)) {
            return new C2203w(3);
        }
        throw new JSApplicationIllegalArgumentException("Invalid transition type " + str);
    }

    /* renamed from: c */
    static C2214x m33845c(ReadableMap readableMap) {
        String string = readableMap.getString("type");
        if ("group".equals(string)) {
            return m33847e(readableMap);
        }
        if ("in".equals(string)) {
            return m33848f(readableMap);
        }
        if ("out".equals(string)) {
            return m33849g(readableMap);
        }
        if ("change".equals(string)) {
            return m33846d(readableMap);
        }
        throw new JSApplicationIllegalArgumentException("Unrecognized transition type " + string);
    }

    /* renamed from: d */
    private static C2214x m33846d(ReadableMap readableMap) {
        C2132d dVar = new C2132d();
        C2145e eVar = new C2145e();
        m33843a(dVar, readableMap);
        m33843a(eVar, readableMap);
        return new C2127b0().mo7197q0(dVar).mo7197q0(eVar);
    }

    /* renamed from: e */
    private static C2214x m33847e(ReadableMap readableMap) {
        C2127b0 b0Var = new C2127b0();
        if (!readableMap.hasKey("sequence") || !readableMap.getBoolean("sequence")) {
            b0Var.mo7205y0(0);
        } else {
            b0Var.mo7205y0(1);
        }
        ReadableArray array = readableMap.getArray("transitions");
        int size = array.size();
        for (int i = 0; i < size; i++) {
            C2214x c = m33845c(array.getMap(i));
            if (c != null) {
                b0Var.mo7197q0(c);
            }
        }
        return b0Var;
    }

    /* renamed from: f */
    private static C2214x m33848f(ReadableMap readableMap) {
        C2199v0 b = m33844b(readableMap.getString("animation"));
        if (b == null) {
            return null;
        }
        b.mo7362u0(1);
        m33843a(b, readableMap);
        return b;
    }

    /* renamed from: g */
    private static C2214x m33849g(ReadableMap readableMap) {
        C2199v0 b = m33844b(readableMap.getString("animation"));
        if (b == null) {
            return null;
        }
        b.mo7362u0(2);
        m33843a(b, readableMap);
        return b;
    }
}
