package p174e.p247e.p294k.p308l;

import okhttp3.HttpUrl;

/* renamed from: e.e.k.l.a */
public final class C6375a {

    /* renamed from: a */
    private static volatile C6376a f17777a;

    /* renamed from: e.e.k.l.a$a */
    public interface C6376a {
        /* renamed from: a */
        Runnable mo18912a(Runnable runnable, String str);

        /* renamed from: b */
        void mo18913b(Object obj, Throwable th);

        /* renamed from: c */
        Object mo18914c(String str);

        /* renamed from: d */
        void mo18915d(Object obj);

        /* renamed from: e */
        Object mo18916e(Object obj, String str);

        boolean isTracing();
    }

    /* renamed from: a */
    public static Runnable m24349a(Runnable runnable, String str) {
        C6376a aVar = f17777a;
        if (aVar == null || runnable == null) {
            return runnable;
        }
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return aVar.mo18912a(runnable, str);
    }

    /* renamed from: b */
    public static boolean m24350b() {
        C6376a aVar = f17777a;
        if (aVar == null) {
            return false;
        }
        return aVar.isTracing();
    }

    /* renamed from: c */
    public static void m24351c(Object obj, Throwable th) {
        C6376a aVar = f17777a;
        if (aVar != null && obj != null) {
            aVar.mo18913b(obj, th);
        }
    }

    /* renamed from: d */
    public static Object m24352d(String str) {
        C6376a aVar = f17777a;
        if (aVar == null || str == null) {
            return null;
        }
        return aVar.mo18914c(str);
    }

    /* renamed from: e */
    public static Object m24353e(Object obj, String str) {
        C6376a aVar = f17777a;
        if (aVar == null || obj == null) {
            return null;
        }
        return aVar.mo18916e(obj, str);
    }

    /* renamed from: f */
    public static void m24354f(Object obj) {
        C6376a aVar = f17777a;
        if (aVar != null && obj != null) {
            aVar.mo18915d(obj);
        }
    }
}
