package p174e.p319f.p393c.p394a.p404z.p405a;

import okhttp3.HttpUrl;

/* renamed from: e.f.c.a.z.a.u1 */
public final class C9555u1 {

    /* renamed from: a */
    static final int f25504a = m32445c(1, 3);

    /* renamed from: b */
    static final int f25505b = m32445c(1, 4);

    /* renamed from: c */
    static final int f25506c = m32445c(2, 0);

    /* renamed from: d */
    static final int f25507d = m32445c(3, 2);

    /* renamed from: e.f.c.a.z.a.u1$b */
    public enum C9557b {
        DOUBLE(C9562c.DOUBLE, 1),
        FLOAT(C9562c.FLOAT, 5),
        INT64(r5, 0),
        UINT64(r5, 0),
        INT32(r11, 0),
        FIXED64(r5, 1),
        FIXED32(r11, 5),
        BOOL(C9562c.BOOLEAN, 0),
        STRING(C9562c.STRING, 2) {
        },
        GROUP(r13, 3) {
        },
        MESSAGE(r13, 2) {
        },
        BYTES(C9562c.BYTE_STRING, 2) {
        },
        UINT32(r11, 0),
        ENUM(C9562c.ENUM, 0),
        SFIXED32(r11, 5),
        SFIXED64(r5, 1),
        SINT32(r11, 0),
        SINT64(r5, 0);
        

        /* renamed from: G */
        private final C9562c f25527G;

        /* renamed from: H */
        private final int f25528H;

        private C9557b(C9562c cVar, int i) {
            this.f25527G = cVar;
            this.f25528H = i;
        }

        /* renamed from: e */
        public C9562c mo24011e() {
            return this.f25527G;
        }
    }

    /* renamed from: e.f.c.a.z.a.u1$c */
    public enum C9562c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(HttpUrl.FRAGMENT_ENCODE_SET),
        BYTE_STRING(C9468i.f25367f),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: x */
        private final Object f25539x;

        private C9562c(Object obj) {
            this.f25539x = obj;
        }
    }

    /* renamed from: a */
    public static int m32443a(int i) {
        return i >>> 3;
    }

    /* renamed from: b */
    public static int m32444b(int i) {
        return i & 7;
    }

    /* renamed from: c */
    static int m32445c(int i, int i2) {
        return (i << 3) | i2;
    }
}
