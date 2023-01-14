package p477h.p478a.p479a.p488f.p489r;

/* renamed from: h.a.a.f.r.a */
public enum C10552a {
    KEY_STRENGTH_128(1, 8, 16, 16),
    KEY_STRENGTH_192(2, 12, 24, 24),
    KEY_STRENGTH_256(3, 16, 32, 32);
    

    /* renamed from: r */
    private int f27932r;

    /* renamed from: s */
    private int f27933s;

    /* renamed from: t */
    private int f27934t;

    /* renamed from: u */
    private int f27935u;

    private C10552a(int i, int i2, int i3, int i4) {
        this.f27932r = i;
        this.f27933s = i2;
        this.f27934t = i3;
        this.f27935u = i4;
    }

    /* renamed from: e */
    public static C10552a m35772e(int i) {
        for (C10552a aVar : values()) {
            if (aVar.mo26194v() == i) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    public int mo26192g() {
        return this.f27935u;
    }

    /* renamed from: h */
    public int mo26193h() {
        return this.f27934t;
    }

    /* renamed from: v */
    public int mo26194v() {
        return this.f27932r;
    }

    /* renamed from: z */
    public int mo26195z() {
        return this.f27933s;
    }
}
