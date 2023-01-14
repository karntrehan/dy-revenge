package com.facebook.hermes.intl;

import java.util.Arrays;
import okhttp3.HttpUrl;

/* renamed from: com.facebook.hermes.intl.q */
public class C2366q {

    /* renamed from: com.facebook.hermes.intl.q$a */
    public enum C2367a {
        BOOLEAN,
        STRING
    }

    /* renamed from: a */
    public static Object m9804a(Object obj, Object obj2, Object obj3, Object obj4) {
        if (C2350g.m9727n(obj)) {
            return obj4;
        }
        if (C2350g.m9724k(obj)) {
            double f = C2350g.m9719f(obj);
            if (!Double.isNaN(f) && f <= C2350g.m9719f(obj3) && f >= C2350g.m9719f(obj2)) {
                return obj;
            }
            throw new C2354h("Invalid number value !");
        }
        throw new C2354h("Invalid number value !");
    }

    /* renamed from: b */
    public static Object m9805b(Object obj, String str, Object obj2, Object obj3, Object obj4) {
        return m9804a(C2350g.m9714a(obj, str), obj2, obj3, obj4);
    }

    /* renamed from: c */
    public static Object m9806c(Object obj, String str, C2367a aVar, Object obj2, Object obj3) {
        Object a = C2350g.m9714a(obj, str);
        if (C2350g.m9727n(a)) {
            return obj3;
        }
        if (C2350g.m9723j(a)) {
            a = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (aVar == C2367a.BOOLEAN && !C2350g.m9722i(a)) {
            throw new C2354h("Boolean option expected but not found");
        } else if (aVar == C2367a.STRING && !C2350g.m9726m(a)) {
            throw new C2354h("String option expected but not found");
        } else if (C2350g.m9727n(obj2) || Arrays.asList((Object[]) obj2).contains(a)) {
            return a;
        } else {
            throw new C2354h("String option expected but not found");
        }
    }

    /* renamed from: d */
    public static <T extends Enum<T>> T m9807d(Class<T> cls, Object obj) {
        try {
            if (C2350g.m9727n(obj)) {
                return Enum.valueOf(cls, "UNDEFINED");
            }
            if (C2350g.m9723j(obj)) {
                return null;
            }
            String h = C2350g.m9721h(obj);
            if (h.equals("2-digit")) {
                return Enum.valueOf(cls, "DIGIT2");
            }
            for (T t : (Enum[]) cls.getEnumConstants()) {
                if (t.name().compareToIgnoreCase(h) == 0) {
                    return t;
                }
            }
            return null;
        } catch (IllegalArgumentException unused) {
        }
    }
}
