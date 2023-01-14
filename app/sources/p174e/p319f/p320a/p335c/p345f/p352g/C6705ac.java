package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.ac */
public enum C6705ac {
    DOUBLE(C6722bc.DOUBLE, 1),
    FLOAT(C6722bc.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(C6722bc.BOOLEAN, 0),
    STRING(C6722bc.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(C6722bc.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(C6722bc.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    

    /* renamed from: G */
    private final C6722bc f18370G;

    private C6705ac(C6722bc bcVar, int i) {
        this.f18370G = bcVar;
    }

    /* renamed from: e */
    public final C6722bc mo19538e() {
        return this.f18370G;
    }
}
