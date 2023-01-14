package p174e.p319f.p393c.p394a.p404z.p405a;

/* renamed from: e.f.c.a.z.a.k0 */
final class C9491k0 implements C9484i1 {

    /* renamed from: a */
    private static final C9531r0 f25407a = new C9492a();

    /* renamed from: b */
    private final C9531r0 f25408b;

    /* renamed from: e.f.c.a.z.a.k0$a */
    class C9492a implements C9531r0 {
        C9492a() {
        }

        /* renamed from: a */
        public C9528q0 mo23723a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        /* renamed from: b */
        public boolean mo23724b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: e.f.c.a.z.a.k0$b */
    private static class C9493b implements C9531r0 {

        /* renamed from: a */
        private C9531r0[] f25409a;

        C9493b(C9531r0... r0VarArr) {
            this.f25409a = r0VarArr;
        }

        /* renamed from: a */
        public C9528q0 mo23723a(Class<?> cls) {
            for (C9531r0 r0Var : this.f25409a) {
                if (r0Var.mo23724b(cls)) {
                    return r0Var.mo23723a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        /* renamed from: b */
        public boolean mo23724b(Class<?> cls) {
            for (C9531r0 b : this.f25409a) {
                if (b.mo23724b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C9491k0() {
        this(m31916b());
    }

    private C9491k0(C9531r0 r0Var) {
        this.f25408b = (C9531r0) C9431b0.m31423b(r0Var, "messageInfoFactory");
    }

    /* renamed from: b */
    private static C9531r0 m31916b() {
        return new C9493b(C9575y.m32624c(), m31917c());
    }

    /* renamed from: c */
    private static C9531r0 m31917c() {
        try {
            return (C9531r0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f25407a;
        }
    }

    /* renamed from: d */
    private static boolean m31918d(C9528q0 q0Var) {
        return q0Var.mo23596c() == C9445c1.PROTO2;
    }

    /* renamed from: e */
    private static <T> C9467h1<T> m31919e(Class<T> cls, C9528q0 q0Var) {
        if (C9577z.class.isAssignableFrom(cls)) {
            if (m31918d(q0Var)) {
                return C9566v0.m32493Q(cls, q0Var, C9584z0.m32688b(), C9480i0.m31716b(), C9489j1.m31821M(), C9545t.m32386b(), C9524p0.m32199b());
            }
            return C9566v0.m32493Q(cls, q0Var, C9584z0.m32688b(), C9480i0.m31716b(), C9489j1.m31821M(), (C9530r<?>) null, C9524p0.m32199b());
        } else if (m31918d(q0Var)) {
            return C9566v0.m32493Q(cls, q0Var, C9584z0.m32687a(), C9480i0.m31715a(), C9489j1.m31816H(), C9545t.m32385a(), C9524p0.m32198a());
        } else {
            return C9566v0.m32493Q(cls, q0Var, C9584z0.m32687a(), C9480i0.m31715a(), C9489j1.m31817I(), (C9530r<?>) null, C9524p0.m32198a());
        }
    }

    /* renamed from: a */
    public <T> C9467h1<T> mo23673a(Class<T> cls) {
        C9522o1<?, ?> H;
        C9530r<?> a;
        C9489j1.m31818J(cls);
        C9528q0 a2 = this.f25408b.mo23723a(cls);
        if (!a2.mo23594a()) {
            return m31919e(cls, a2);
        }
        if (C9577z.class.isAssignableFrom(cls)) {
            H = C9489j1.m31821M();
            a = C9545t.m32386b();
        } else {
            H = C9489j1.m31816H();
            a = C9545t.m32385a();
        }
        return C9572w0.m32597m(H, a, a2.mo23595b());
    }
}
