package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.ag */
public enum C8124ag {
    DOUBLE(C8143bg.DOUBLE, 1),
    FLOAT(C8143bg.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(C8143bg.BOOLEAN, 0),
    STRING(C8143bg.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(C8143bg.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(C8143bg.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: G */
    private final C8143bg f22068G;

    private C8124ag(C8143bg bgVar, int i) {
        this.f22068G = bgVar;
    }

    /* renamed from: e */
    public final C8143bg mo21663e() {
        return this.f22068G;
    }
}
