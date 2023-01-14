package p174e.p319f.p320a.p335c.p345f.p352g;

import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.k9 */
public enum C6868k9 {
    VOID(Void.class, Void.class, (Class) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, HttpUrl.FRAGMENT_ENCODE_SET),
    BYTE_STRING(C7106z7.class, C7106z7.class, C7106z7.f19078f),
    ENUM(r1, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: A */
    private final Object f18591A;

    /* renamed from: y */
    private final Class f18592y;

    /* renamed from: z */
    private final Class f18593z;

    private C6868k9(Class cls, Class cls2, Object obj) {
        this.f18592y = cls;
        this.f18593z = cls2;
        this.f18591A = obj;
    }

    /* renamed from: e */
    public final Class mo19925e() {
        return this.f18593z;
    }
}
