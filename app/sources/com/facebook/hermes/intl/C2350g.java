package com.facebook.hermes.intl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.hermes.intl.g */
public class C2350g {

    /* renamed from: a */
    private static Object f7019a = new C2353c();

    /* renamed from: b */
    private static Object f7020b = new C2352b();

    /* renamed from: com.facebook.hermes.intl.g$b */
    private static class C2352b {
        private C2352b() {
        }
    }

    /* renamed from: com.facebook.hermes.intl.g$c */
    private static class C2353c {
        private C2353c() {
        }
    }

    /* renamed from: a */
    public static Object m9714a(Object obj, String str) {
        HashMap hashMap = (HashMap) obj;
        if (!hashMap.containsKey(str)) {
            return m9717d();
        }
        Object obj2 = hashMap.get(str);
        return obj2 == null ? m9715b() : obj2;
    }

    /* renamed from: b */
    public static Object m9715b() {
        return f7020b;
    }

    /* renamed from: c */
    public static void m9716c(Object obj, String str, Object obj2) {
        ((HashMap) obj).put(str, obj2);
    }

    /* renamed from: d */
    public static Object m9717d() {
        return f7019a;
    }

    /* renamed from: e */
    public static boolean m9718e(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    /* renamed from: f */
    public static double m9719f(Object obj) {
        return ((Double) obj).doubleValue();
    }

    /* renamed from: g */
    public static Map<String, Object> m9720g(Object obj) {
        return (HashMap) obj;
    }

    /* renamed from: h */
    public static String m9721h(Object obj) {
        return (String) obj;
    }

    /* renamed from: i */
    public static boolean m9722i(Object obj) {
        return obj instanceof Boolean;
    }

    /* renamed from: j */
    public static boolean m9723j(Object obj) {
        return obj instanceof C2352b;
    }

    /* renamed from: k */
    public static boolean m9724k(Object obj) {
        return obj instanceof Double;
    }

    /* renamed from: l */
    public static boolean m9725l(Object obj) {
        return obj instanceof HashMap;
    }

    /* renamed from: m */
    public static boolean m9726m(Object obj) {
        return obj instanceof String;
    }

    /* renamed from: n */
    public static boolean m9727n(Object obj) {
        return obj instanceof C2353c;
    }

    /* renamed from: o */
    public static Object m9728o(boolean z) {
        return new Boolean(z);
    }

    /* renamed from: p */
    public static Object m9729p(double d) {
        return new Double(d);
    }

    /* renamed from: q */
    public static Object m9730q() {
        return new HashMap();
    }

    /* renamed from: r */
    public static Object m9731r(String str) {
        return str;
    }
}
