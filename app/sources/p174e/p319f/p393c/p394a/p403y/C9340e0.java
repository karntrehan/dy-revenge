package p174e.p319f.p393c.p394a.p403y;

import p174e.p319f.p393c.p394a.p404z.p405a.C9429a1;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9526q;
import p174e.p319f.p393c.p394a.p404z.p405a.C9546t0;
import p174e.p319f.p393c.p394a.p404z.p405a.C9577z;

/* renamed from: e.f.c.a.y.e0 */
public final class C9340e0 extends C9577z<C9340e0, C9342b> implements C9546t0 {
    /* access modifiers changed from: private */
    public static final C9340e0 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile C9429a1<C9340e0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C9346f0 params_;
    private int version_;

    /* renamed from: e.f.c.a.y.e0$a */
    static /* synthetic */ class C9341a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25240a;

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
                f25240a = r0
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25240a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25240a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25240a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25240a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25240a     // Catch:{ NoSuchFieldError -> 0x0049 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25240a     // Catch:{ NoSuchFieldError -> 0x0054 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p403y.C9340e0.C9341a.<clinit>():void");
        }
    }

    /* renamed from: e.f.c.a.y.e0$b */
    public static final class C9342b extends C9577z.C9578a<C9340e0, C9342b> implements C9546t0 {
        private C9342b() {
            super(C9340e0.DEFAULT_INSTANCE);
        }

        /* synthetic */ C9342b(C9341a aVar) {
            this();
        }

        /* renamed from: B */
        public C9342b mo23399B(int i) {
            mo24067t();
            ((C9340e0) this.f25644o).m31150U(i);
            return this;
        }

        /* renamed from: z */
        public C9342b mo23400z(C9346f0 f0Var) {
            mo24067t();
            ((C9340e0) this.f25644o).m31149T(f0Var);
            return this;
        }
    }

    static {
        C9340e0 e0Var = new C9340e0();
        DEFAULT_INSTANCE = e0Var;
        C9577z.m32635K(C9340e0.class, e0Var);
    }

    private C9340e0() {
    }

    /* renamed from: R */
    public static C9342b m31147R() {
        return (C9342b) DEFAULT_INSTANCE.mo24058r();
    }

    /* renamed from: S */
    public static C9340e0 m31148S(C9468i iVar, C9526q qVar) {
        return (C9340e0) C9577z.m32630F(DEFAULT_INSTANCE, iVar, qVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m31149T(C9346f0 f0Var) {
        f0Var.getClass();
        this.params_ = f0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m31150U(int i) {
        this.version_ = i;
    }

    /* renamed from: P */
    public C9346f0 mo23397P() {
        C9346f0 f0Var = this.params_;
        return f0Var == null ? C9346f0.m31174N() : f0Var;
    }

    /* renamed from: Q */
    public int mo23398Q() {
        return this.version_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Object mo23350u(C9577z.C9583f fVar, Object obj, Object obj2) {
        switch (C9341a.f25240a[fVar.ordinal()]) {
            case 1:
                return new C9340e0();
            case 2:
                return new C9342b((C9341a) null);
            case 3:
                return C9577z.m32629D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C9429a1<C9340e0> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (C9340e0.class) {
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
