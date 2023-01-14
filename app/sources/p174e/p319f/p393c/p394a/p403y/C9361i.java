package p174e.p319f.p393c.p394a.p403y;

import p174e.p319f.p393c.p394a.p404z.p405a.C9429a1;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9526q;
import p174e.p319f.p393c.p394a.p404z.p405a.C9546t0;
import p174e.p319f.p393c.p394a.p404z.p405a.C9577z;

/* renamed from: e.f.c.a.y.i */
public final class C9361i extends C9577z<C9361i, C9363b> implements C9546t0 {
    /* access modifiers changed from: private */
    public static final C9361i DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile C9429a1<C9361i> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C9468i keyValue_ = C9468i.f25367f;
    private C9372k params_;
    private int version_;

    /* renamed from: e.f.c.a.y.i$a */
    static /* synthetic */ class C9362a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25247a;

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
                f25247a = r0
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25247a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25247a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25247a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25247a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25247a     // Catch:{ NoSuchFieldError -> 0x0049 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25247a     // Catch:{ NoSuchFieldError -> 0x0054 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p403y.C9361i.C9362a.<clinit>():void");
        }
    }

    /* renamed from: e.f.c.a.y.i$b */
    public static final class C9363b extends C9577z.C9578a<C9361i, C9363b> implements C9546t0 {
        private C9363b() {
            super(C9361i.DEFAULT_INSTANCE);
        }

        /* synthetic */ C9363b(C9362a aVar) {
            this();
        }

        /* renamed from: B */
        public C9363b mo23420B(C9372k kVar) {
            mo24067t();
            ((C9361i) this.f25644o).m31213W(kVar);
            return this;
        }

        /* renamed from: C */
        public C9363b mo23421C(int i) {
            mo24067t();
            ((C9361i) this.f25644o).m31214Y(i);
            return this;
        }

        /* renamed from: z */
        public C9363b mo23422z(C9468i iVar) {
            mo24067t();
            ((C9361i) this.f25644o).m31212V(iVar);
            return this;
        }
    }

    static {
        C9361i iVar = new C9361i();
        DEFAULT_INSTANCE = iVar;
        C9577z.m32635K(C9361i.class, iVar);
    }

    private C9361i() {
    }

    /* renamed from: T */
    public static C9363b m31210T() {
        return (C9363b) DEFAULT_INSTANCE.mo24058r();
    }

    /* renamed from: U */
    public static C9361i m31211U(C9468i iVar, C9526q qVar) {
        return (C9361i) C9577z.m32630F(DEFAULT_INSTANCE, iVar, qVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m31212V(C9468i iVar) {
        iVar.getClass();
        this.keyValue_ = iVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m31213W(C9372k kVar) {
        kVar.getClass();
        this.params_ = kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m31214Y(int i) {
        this.version_ = i;
    }

    /* renamed from: Q */
    public C9468i mo23417Q() {
        return this.keyValue_;
    }

    /* renamed from: R */
    public C9372k mo23418R() {
        C9372k kVar = this.params_;
        return kVar == null ? C9372k.m31235N() : kVar;
    }

    /* renamed from: S */
    public int mo23419S() {
        return this.version_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Object mo23350u(C9577z.C9583f fVar, Object obj, Object obj2) {
        switch (C9362a.f25247a[fVar.ordinal()]) {
            case 1:
                return new C9361i();
            case 2:
                return new C9363b((C9362a) null);
            case 3:
                return C9577z.m32629D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C9429a1<C9361i> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (C9361i.class) {
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
