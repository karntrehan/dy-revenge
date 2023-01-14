package p174e.p199d.p200a.p209n;

/* renamed from: e.d.a.n.e */
public enum C5680e {
    Greyscale(0, "Greyscale", 1, 2, 4, 8, 16),
    TrueColor(2, "True Color", 8, 16),
    IndexedColor(3, "Indexed Color", 1, 2, 4, 8),
    GreyscaleWithAlpha(4, "Greyscale with Alpha", 8, 16),
    TrueColorWithAlpha(6, "True Color with Alpha", 8, 16);
    

    /* renamed from: t */
    private final int f16116t;

    /* renamed from: u */
    private final String f16117u;

    /* renamed from: v */
    private final int[] f16118v;

    private C5680e(int i, String str, int... iArr) {
        this.f16116t = i;
        this.f16117u = str;
        this.f16118v = iArr;
    }

    /* renamed from: e */
    public static C5680e m21135e(int i) {
        for (C5680e eVar : (C5680e[]) C5680e.class.getEnumConstants()) {
            if (eVar.mo16966h() == i) {
                return eVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    public String mo16965g() {
        return this.f16117u;
    }

    /* renamed from: h */
    public int mo16966h() {
        return this.f16116t;
    }
}
