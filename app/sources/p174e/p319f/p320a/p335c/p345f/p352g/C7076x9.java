package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.x9 */
final class C7076x9 implements C6771ea {

    /* renamed from: a */
    private final C6771ea[] f19047a;

    C7076x9(C6771ea... eaVarArr) {
        this.f19047a = eaVarArr;
    }

    /* renamed from: a */
    public final C6754da mo19725a(Class cls) {
        C6771ea[] eaVarArr = this.f19047a;
        for (int i = 0; i < 2; i++) {
            C6771ea eaVar = eaVarArr[i];
            if (eaVar.mo19726b(cls)) {
                return eaVar.mo19725a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* renamed from: b */
    public final boolean mo19726b(Class cls) {
        C6771ea[] eaVarArr = this.f19047a;
        for (int i = 0; i < 2; i++) {
            if (eaVarArr[i].mo19726b(cls)) {
                return true;
            }
        }
        return false;
    }
}
