package p174e.p319f.p393c.p394a.p404z.p405a;

/* renamed from: e.f.c.a.z.a.f1 */
final class C9461f1 implements C9528q0 {

    /* renamed from: a */
    private final C9537s0 f25357a;

    /* renamed from: b */
    private final String f25358b;

    /* renamed from: c */
    private final Object[] f25359c;

    /* renamed from: d */
    private final int f25360d;

    C9461f1(C9537s0 s0Var, String str, Object[] objArr) {
        char charAt;
        this.f25357a = s0Var;
        this.f25358b = str;
        this.f25359c = objArr;
        char charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            char c = charAt2 & 8191;
            int i = 13;
            int i2 = 1;
            while (true) {
                int i3 = i2 + 1;
                charAt = str.charAt(i2);
                if (charAt < 55296) {
                    break;
                }
                c |= (charAt & 8191) << i;
                i += 13;
                i2 = i3;
            }
            charAt2 = c | (charAt << i);
        }
        this.f25360d = charAt2;
    }

    /* renamed from: a */
    public boolean mo23594a() {
        return (this.f25360d & 2) == 2;
    }

    /* renamed from: b */
    public C9537s0 mo23595b() {
        return this.f25357a;
    }

    /* renamed from: c */
    public C9445c1 mo23596c() {
        return (this.f25360d & 1) == 1 ? C9445c1.PROTO2 : C9445c1.PROTO3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object[] mo23597d() {
        return this.f25359c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo23598e() {
        return this.f25358b;
    }
}
