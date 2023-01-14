package androidx.camera.core.impl;

import java.util.Set;

/* renamed from: androidx.camera.core.impl.g1 */
public interface C0809g1 {

    /* renamed from: androidx.camera.core.impl.g1$a */
    public static abstract class C0810a<T> {
        C0810a() {
        }

        /* renamed from: a */
        public static <T> C0810a<T> m3180a(String str, Class<?> cls) {
            return m3181b(str, cls, (Object) null);
        }

        /* renamed from: b */
        public static <T> C0810a<T> m3181b(String str, Class<?> cls, Object obj) {
            return new C0882t(str, cls, obj);
        }

        /* renamed from: c */
        public abstract String mo2986c();

        /* renamed from: d */
        public abstract Object mo2987d();

        /* renamed from: e */
        public abstract Class<T> mo2988e();
    }

    /* renamed from: androidx.camera.core.impl.g1$b */
    public interface C0811b {
        /* renamed from: a */
        boolean mo2519a(C0810a<?> aVar);
    }

    /* renamed from: androidx.camera.core.impl.g1$c */
    public enum C0812c {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    /* renamed from: a */
    <ValueT> ValueT mo2494a(C0810a<ValueT> aVar);

    /* renamed from: b */
    boolean mo2495b(C0810a<?> aVar);

    /* renamed from: c */
    Set<C0810a<?>> mo2496c();

    /* renamed from: d */
    <ValueT> ValueT mo2497d(C0810a<ValueT> aVar, ValueT valuet);

    /* renamed from: e */
    C0812c mo2498e(C0810a<?> aVar);

    /* renamed from: m */
    void mo2502m(String str, C0811b bVar);

    /* renamed from: n */
    <ValueT> ValueT mo2503n(C0810a<ValueT> aVar, C0812c cVar);

    /* renamed from: v */
    Set<C0812c> mo2507v(C0810a<?> aVar);
}
