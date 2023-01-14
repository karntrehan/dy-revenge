package p174e.p319f.p393c.p394a.p403y;

import p174e.p319f.p393c.p394a.p404z.p405a.C9429a1;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9526q;
import p174e.p319f.p393c.p394a.p404z.p405a.C9546t0;
import p174e.p319f.p393c.p394a.p404z.p405a.C9577z;

/* renamed from: e.f.c.a.y.a */
public final class C9309a extends C9577z<C9309a, C9311b> implements C9546t0 {
    /* access modifiers changed from: private */
    public static final C9309a DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile C9429a1<C9309a> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C9468i keyValue_ = C9468i.f25367f;
    private C9321c params_;
    private int version_;

    /* renamed from: e.f.c.a.y.a$a */
    static /* synthetic */ class C9310a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25231a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                e.f.c.a.z.a.z$f[] r0 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25231a = r0
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25231a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25231a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25231a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25231a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25231a     // Catch:{ NoSuchFieldError -> 0x0049 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25231a     // Catch:{ NoSuchFieldError -> 0x0054 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p403y.C9309a.C9310a.<clinit>():void");
        }
    }

    /* renamed from: e.f.c.a.y.a$b */
    public static final class C9311b extends C9577z.C9578a<C9309a, C9311b> implements C9546t0 {
        private C9311b() {
            super(C9309a.DEFAULT_INSTANCE);
        }

        /* synthetic */ C9311b(C9310a aVar) {
            this();
        }

        /* renamed from: B */
        public C9311b mo23351B(C9321c cVar) {
            mo24067t();
            ((C9309a) this.f25644o).m31022W(cVar);
            return this;
        }

        /* renamed from: C */
        public C9311b mo23352C(int i) {
            mo24067t();
            ((C9309a) this.f25644o).m31023Y(i);
            return this;
        }

        /* renamed from: z */
        public C9311b mo23353z(C9468i iVar) {
            mo24067t();
            ((C9309a) this.f25644o).m31021V(iVar);
            return this;
        }
    }

    static {
        C9309a aVar = new C9309a();
        DEFAULT_INSTANCE = aVar;
        C9577z.m32635K(C9309a.class, aVar);
    }

    private C9309a() {
    }

    /* renamed from: T */
    public static C9311b m31019T() {
        return (C9311b) DEFAULT_INSTANCE.mo24058r();
    }

    /* renamed from: U */
    public static C9309a m31020U(C9468i iVar, C9526q qVar) {
        return (C9309a) C9577z.m32630F(DEFAULT_INSTANCE, iVar, qVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m31021V(C9468i iVar) {
        iVar.getClass();
        this.keyValue_ = iVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m31022W(C9321c cVar) {
        cVar.getClass();
        this.params_ = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m31023Y(int i) {
        this.version_ = i;
    }

    /* renamed from: Q */
    public C9468i mo23347Q() {
        return this.keyValue_;
    }

    /* renamed from: R */
    public C9321c mo23348R() {
        C9321c cVar = this.params_;
        return cVar == null ? C9321c.m31055N() : cVar;
    }

    /* renamed from: S */
    public int mo23349S() {
        return this.version_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Object mo23350u(C9577z.C9583f fVar, Object obj, Object obj2) {
        switch (C9310a.f25231a[fVar.ordinal()]) {
            case 1:
                return new C9309a();
            case 2:
                return new C9311b((C9310a) null);
            case 3:
                return C9577z.m32629D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C9429a1<C9309a> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (C9309a.class) {
                        a1Var = PARSER;
                        if (a1Var == null) {
                            a1Var = new C9577z.C9579b<>(DEFAULT_INSTANCE);
                            PARSER = a1Var;
                        }
                    }
                }
                return a1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
