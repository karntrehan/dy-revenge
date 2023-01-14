package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.zd */
final class C8582zd implements C8236ge {

    /* renamed from: a */
    private final C8236ge[] f23364a;

    C8582zd(C8236ge... geVarArr) {
        this.f23364a = geVarArr;
    }

    /* renamed from: a */
    public final C8217fe mo21833a(Class<?> cls) {
        C8236ge[] geVarArr = this.f23364a;
        for (int i = 0; i < 2; i++) {
            C8236ge geVar = geVarArr[i];
            if (geVar.mo21834b(cls)) {
                return geVar.mo21833a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    /* renamed from: b */
    public final boolean mo21834b(Class<?> cls) {
        C8236ge[] geVarArr = this.f23364a;
        for (int i = 0; i < 2; i++) {
            if (geVarArr[i].mo21834b(cls)) {
                return true;
            }
        }
        return false;
    }
}
