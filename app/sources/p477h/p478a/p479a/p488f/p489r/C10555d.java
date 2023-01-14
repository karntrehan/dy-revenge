package p477h.p478a.p479a.p488f.p489r;

import p477h.p478a.p479a.p483c.C10497a;

/* renamed from: h.a.a.f.r.d */
public enum C10555d {
    STORE(0),
    DEFLATE(8),
    AES_INTERNAL_ONLY(99);
    

    /* renamed from: r */
    private int f27951r;

    private C10555d(int i) {
        this.f27951r = i;
    }

    /* renamed from: g */
    public static C10555d m35780g(int i) {
        for (C10555d dVar : values()) {
            if (dVar.mo26198e() == i) {
                return dVar;
            }
        }
        throw new C10497a("Unknown compression method", C10497a.C10498a.UNKNOWN_COMPRESSION_METHOD);
    }

    /* renamed from: e */
    public int mo26198e() {
        return this.f27951r;
    }
}
