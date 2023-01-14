package p174e.p319f.p393c.p394a.p403y;

import p174e.p319f.p393c.p394a.p404z.p405a.C9431b0;

/* renamed from: e.f.c.a.y.z */
public enum C9424z implements C9431b0.C9434c {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: s */
    private static final C9431b0.C9435d<C9424z> f25298s = null;

    /* renamed from: u */
    private final int f25300u;

    /* renamed from: e.f.c.a.y.z$a */
    class C9425a implements C9431b0.C9435d<C9424z> {
        C9425a() {
        }

        /* renamed from: b */
        public C9424z mo23424a(int i) {
            return C9424z.m31387e(i);
        }
    }

    static {
        f25298s = new C9425a();
    }

    private C9424z(int i) {
        this.f25300u = i;
    }

    /* renamed from: e */
    public static C9424z m31387e(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }

    /* renamed from: d */
    public final int mo23423d() {
        if (this != UNRECOGNIZED) {
            return this.f25300u;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
