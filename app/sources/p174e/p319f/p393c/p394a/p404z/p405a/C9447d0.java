package p174e.p319f.p393c.p394a.p404z.p405a;

import okhttp3.HttpUrl;

/* renamed from: e.f.c.a.z.a.d0 */
public enum C9447d0 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(r1, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, HttpUrl.FRAGMENT_ENCODE_SET),
    BYTE_STRING(C9468i.class, C9468i.class, C9468i.f25367f),
    ENUM(r1, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: A */
    private final Object f25328A;

    /* renamed from: y */
    private final Class<?> f25329y;

    /* renamed from: z */
    private final Class<?> f25330z;

    private C9447d0(Class<?> cls, Class<?> cls2, Object obj) {
        this.f25329y = cls;
        this.f25330z = cls2;
        this.f25328A = obj;
    }

    /* renamed from: e */
    public Class<?> mo23519e() {
        return this.f25330z;
    }
}
