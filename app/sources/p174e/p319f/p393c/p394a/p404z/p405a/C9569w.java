package p174e.p319f.p393c.p394a.p404z.p405a;

import java.lang.reflect.Type;

/* renamed from: e.f.c.a.z.a.w */
public enum C9569w {
    DOUBLE(0, r4, r8),
    FLOAT(1, r4, r9),
    INT64(2, r4, r5),
    UINT64(3, r4, r5),
    INT32(4, r4, r11),
    FIXED64(5, r4, r10),
    FIXED32(6, r4, r11),
    BOOL(7, r4, r12),
    STRING(8, r4, r13),
    MESSAGE(9, r4, r14),
    BYTES(10, r4, r15),
    UINT32(11, r4, r11),
    ENUM(12, r4, r16),
    SFIXED32(13, r4, r11),
    SFIXED64(14, r4, r10),
    SINT32(15, r4, r11),
    SINT64(16, r4, r10),
    GROUP(17, r4, r14),
    DOUBLE_LIST(18, r4, r8),
    FLOAT_LIST(19, r4, r9),
    INT64_LIST(20, r4, r5),
    UINT64_LIST(21, r4, r5),
    INT32_LIST(22, r4, r11),
    FIXED64_LIST(23, r4, r10),
    FIXED32_LIST(24, r4, r11),
    BOOL_LIST(25, r4, r12),
    STRING_LIST(26, r4, r13),
    MESSAGE_LIST(27, r4, r14),
    BYTES_LIST(28, r4, r15),
    UINT32_LIST(29, r4, r11),
    ENUM_LIST(30, r4, r16),
    SFIXED32_LIST(31, r4, r11),
    SFIXED64_LIST(32, r4, r10),
    SINT32_LIST(33, r4, r11),
    SINT64_LIST(34, r4, r10),
    DOUBLE_LIST_PACKED(35, r4, r8),
    FLOAT_LIST_PACKED(36, r4, r9),
    INT64_LIST_PACKED(37, r4, r5),
    UINT64_LIST_PACKED(38, r4, r5),
    INT32_LIST_PACKED(39, r4, r11),
    FIXED64_LIST_PACKED(40, r4, r10),
    FIXED32_LIST_PACKED(41, r4, r11),
    BOOL_LIST_PACKED(42, r4, r12),
    UINT32_LIST_PACKED(43, r4, r11),
    ENUM_LIST_PACKED(44, r4, r16),
    SFIXED32_LIST_PACKED(45, r4, r11),
    SFIXED64_LIST_PACKED(46, r4, r8),
    SINT32_LIST_PACKED(47, r4, C9447d0.INT),
    SINT64_LIST_PACKED(48, r4, r8),
    GROUP_LIST(49, r7, r14),
    MAP(50, C9571b.MAP, C9447d0.VOID);
    

    /* renamed from: m0 */
    private static final C9569w[] f25607m0 = null;

    /* renamed from: n0 */
    private static final Type[] f25608n0 = null;

    /* renamed from: p0 */
    private final C9447d0 f25622p0;

    /* renamed from: q0 */
    private final int f25623q0;

    /* renamed from: r0 */
    private final C9571b f25624r0;

    /* renamed from: s0 */
    private final Class<?> f25625s0;

    /* renamed from: t0 */
    private final boolean f25626t0;

    /* renamed from: e.f.c.a.z.a.w$a */
    static /* synthetic */ class C9570a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25627a = null;

        /* renamed from: b */
        static final /* synthetic */ int[] f25628b = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                e.f.c.a.z.a.d0[] r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9447d0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25628b = r0
                r1 = 1
                e.f.c.a.z.a.d0 r2 = p174e.p319f.p393c.p394a.p404z.p405a.C9447d0.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f25628b     // Catch:{ NoSuchFieldError -> 0x001d }
                e.f.c.a.z.a.d0 r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9447d0.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f25628b     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.f.c.a.z.a.d0 r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9447d0.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                e.f.c.a.z.a.w$b[] r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9569w.C9571b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f25627a = r3
                e.f.c.a.z.a.w$b r4 = p174e.p319f.p393c.p394a.p404z.p405a.C9569w.C9571b.MAP     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f25627a     // Catch:{ NoSuchFieldError -> 0x0043 }
                e.f.c.a.z.a.w$b r3 = p174e.p319f.p393c.p394a.p404z.p405a.C9569w.C9571b.VECTOR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f25627a     // Catch:{ NoSuchFieldError -> 0x004d }
                e.f.c.a.z.a.w$b r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9569w.C9571b.SCALAR     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p404z.p405a.C9569w.C9570a.<clinit>():void");
        }
    }

    /* renamed from: e.f.c.a.z.a.w$b */
    enum C9571b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: s */
        private final boolean f25634s;

        private C9571b(boolean z) {
            this.f25634s = z;
        }
    }

    static {
        int i;
        f25608n0 = new Type[0];
        C9569w[] values = values();
        f25607m0 = new C9569w[values.length];
        for (C9569w wVar : values) {
            f25607m0[wVar.f25623q0] = wVar;
        }
    }

    private C9569w(int i, C9571b bVar, C9447d0 d0Var) {
        int i2;
        this.f25623q0 = i;
        this.f25624r0 = bVar;
        this.f25622p0 = d0Var;
        int i3 = C9570a.f25627a[bVar.ordinal()];
        boolean z = true;
        this.f25625s0 = (i3 == 1 || i3 == 2) ? d0Var.mo23519e() : null;
        this.f25626t0 = (bVar != C9571b.SCALAR || (i2 = C9570a.f25628b[d0Var.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : z;
    }

    /* renamed from: e */
    public int mo24035e() {
        return this.f25623q0;
    }
}
