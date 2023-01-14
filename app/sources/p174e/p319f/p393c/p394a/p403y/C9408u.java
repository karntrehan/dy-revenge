package p174e.p319f.p393c.p394a.p403y;

import p174e.p319f.p393c.p394a.p404z.p405a.C9431b0;

/* renamed from: e.f.c.a.y.u */
public enum C9408u implements C9431b0.C9434c {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: t */
    private static final C9431b0.C9435d<C9408u> f25277t = null;

    /* renamed from: v */
    private final int f25279v;

    /* renamed from: e.f.c.a.y.u$a */
    class C9409a implements C9431b0.C9435d<C9408u> {
        C9409a() {
        }

        /* renamed from: b */
        public C9408u mo23424a(int i) {
            return C9408u.m31335e(i);
        }
    }

    static {
        f25277t = new C9409a();
    }

    private C9408u(int i) {
        this.f25279v = i;
    }

    /* renamed from: e */
    public static C9408u m31335e(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i != 4) {
            return null;
        }
        return SHA512;
    }

    /* renamed from: d */
    public final int mo23423d() {
        if (this != UNRECOGNIZED) {
            return this.f25279v;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
