package com.facebook.react.views.scroll;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.C2693e;
import com.facebook.react.uimanager.C3038r;
import java.util.Map;
import p174e.p247e.p315l.p316a.C6409a;

/* renamed from: com.facebook.react.views.scroll.f */
public class C3139f {

    /* renamed from: com.facebook.react.views.scroll.f$a */
    public interface C3140a<T> {
        void flashScrollIndicators(T t);

        void scrollTo(T t, C3141b bVar);

        void scrollToEnd(T t, C3142c cVar);
    }

    /* renamed from: com.facebook.react.views.scroll.f$b */
    public static class C3141b {

        /* renamed from: a */
        public final int f8795a;

        /* renamed from: b */
        public final int f8796b;

        /* renamed from: c */
        public final boolean f8797c;

        C3141b(int i, int i2, boolean z) {
            this.f8795a = i;
            this.f8796b = i2;
            this.f8797c = z;
        }
    }

    /* renamed from: com.facebook.react.views.scroll.f$c */
    public static class C3142c {

        /* renamed from: a */
        public final boolean f8798a;

        C3142c(boolean z) {
            this.f8798a = z;
        }
    }

    /* renamed from: a */
    public static Map<String, Integer> m12358a() {
        return C2693e.m10916f("scrollTo", 1, "scrollToEnd", 2, "flashScrollIndicators", 3);
    }

    /* renamed from: b */
    public static <T> void m12359b(C3140a<T> aVar, T t, int i, ReadableArray readableArray) {
        C6409a.m24521c(aVar);
        C6409a.m24521c(t);
        C6409a.m24521c(readableArray);
        if (i == 1) {
            m12361d(aVar, t, readableArray);
        } else if (i == 2) {
            m12362e(aVar, t, readableArray);
        } else if (i == 3) {
            aVar.flashScrollIndicators(t);
        } else {
            throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", new Object[]{Integer.valueOf(i), aVar.getClass().getSimpleName()}));
        }
    }

    /* renamed from: c */
    public static <T> void m12360c(C3140a<T> aVar, T t, String str, ReadableArray readableArray) {
        C6409a.m24521c(aVar);
        C6409a.m24521c(t);
        C6409a.m24521c(readableArray);
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -402165208:
                if (str.equals("scrollTo")) {
                    c = 0;
                    break;
                }
                break;
            case 28425985:
                if (str.equals("flashScrollIndicators")) {
                    c = 1;
                    break;
                }
                break;
            case 2055114131:
                if (str.equals("scrollToEnd")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m12361d(aVar, t, readableArray);
                return;
            case 1:
                aVar.flashScrollIndicators(t);
                return;
            case 2:
                m12362e(aVar, t, readableArray);
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %s received by %s.", new Object[]{str, aVar.getClass().getSimpleName()}));
        }
    }

    /* renamed from: d */
    private static <T> void m12361d(C3140a<T> aVar, T t, ReadableArray readableArray) {
        aVar.scrollTo(t, new C3141b(Math.round(C3038r.m12005b(readableArray.getDouble(0))), Math.round(C3038r.m12005b(readableArray.getDouble(1))), readableArray.getBoolean(2)));
    }

    /* renamed from: e */
    private static <T> void m12362e(C3140a<T> aVar, T t, ReadableArray readableArray) {
        aVar.scrollToEnd(t, new C3142c(readableArray.getBoolean(0)));
    }
}
