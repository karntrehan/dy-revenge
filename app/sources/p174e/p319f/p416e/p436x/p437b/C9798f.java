package p174e.p319f.p416e.p436x.p437b;

/* renamed from: e.f.e.x.b.f */
public enum C9798f {
    L(1),
    M(0),
    Q(3),
    H(2);
    

    /* renamed from: r */
    private static final C9798f[] f26239r = null;

    /* renamed from: t */
    private final int f26241t;

    static {
        C9798f fVar;
        C9798f fVar2;
        C9798f fVar3;
        C9798f fVar4;
        f26239r = new C9798f[]{fVar2, fVar, fVar4, fVar3};
    }

    private C9798f(int i) {
        this.f26241t = i;
    }

    /* renamed from: e */
    public static C9798f m33464e(int i) {
        if (i >= 0) {
            C9798f[] fVarArr = f26239r;
            if (i < fVarArr.length) {
                return fVarArr[i];
            }
        }
        throw new IllegalArgumentException();
    }
}
