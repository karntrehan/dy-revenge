package p174e.p319f.p320a.p335c.p345f.p357l;

import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.l.od */
public enum C8384od {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, HttpUrl.FRAGMENT_ENCODE_SET),
    BYTE_STRING(C8177dc.class, C8177dc.class, C8177dc.f22199f),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: A */
    private final Object f22882A;

    /* renamed from: y */
    private final Class<?> f22883y;

    /* renamed from: z */
    private final Class<?> f22884z;

    private C8384od(Class<?> cls, Class<?> cls2, Object obj) {
        this.f22883y = cls;
        this.f22884z = cls2;
        this.f22882A = obj;
    }

    /* renamed from: e */
    public final Class<?> mo22058e() {
        return this.f22884z;
    }
}
