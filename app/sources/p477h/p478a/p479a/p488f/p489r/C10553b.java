package p477h.p478a.p479a.p488f.p489r;

/* renamed from: h.a.a.f.r.b */
public enum C10553b {
    ONE(1),
    TWO(2);
    

    /* renamed from: q */
    private int f27939q;

    private C10553b(int i) {
        this.f27939q = i;
    }

    /* renamed from: e */
    public static C10553b m35777e(int i) {
        for (C10553b bVar : values()) {
            if (bVar.f27939q == i) {
                return bVar;
            }
        }
        throw new IllegalArgumentException("Unsupported Aes version");
    }

    /* renamed from: g */
    public int mo26196g() {
        return this.f27939q;
    }
}
