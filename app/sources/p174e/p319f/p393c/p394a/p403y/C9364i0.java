package p174e.p319f.p393c.p394a.p403y;

import p174e.p319f.p393c.p394a.p404z.p405a.C9431b0;

/* renamed from: e.f.c.a.y.i0 */
public enum C9364i0 implements C9431b0.C9434c {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: t */
    private static final C9431b0.C9435d<C9364i0> f25254t = null;

    /* renamed from: v */
    private final int f25256v;

    /* renamed from: e.f.c.a.y.i0$a */
    class C9365a implements C9431b0.C9435d<C9364i0> {
        C9365a() {
        }

        /* renamed from: b */
        public C9364i0 mo23424a(int i) {
            return C9364i0.m31222e(i);
        }
    }

    static {
        f25254t = new C9365a();
    }

    private C9364i0(int i) {
        this.f25256v = i;
    }

    /* renamed from: e */
    public static C9364i0 m31222e(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    /* renamed from: d */
    public final int mo23423d() {
        if (this != UNRECOGNIZED) {
            return this.f25256v;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
