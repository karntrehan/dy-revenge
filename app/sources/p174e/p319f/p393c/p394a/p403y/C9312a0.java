package p174e.p319f.p393c.p394a.p403y;

import okhttp3.HttpUrl;
import p174e.p319f.p393c.p394a.p404z.p405a.C9429a1;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9546t0;
import p174e.p319f.p393c.p394a.p404z.p405a.C9577z;

/* renamed from: e.f.c.a.y.a0 */
public final class C9312a0 extends C9577z<C9312a0, C9314b> implements C9546t0 {
    /* access modifiers changed from: private */
    public static final C9312a0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile C9429a1<C9312a0> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = HttpUrl.FRAGMENT_ENCODE_SET;
    private C9468i value_ = C9468i.f25367f;

    /* renamed from: e.f.c.a.y.a0$a */
    static /* synthetic */ class C9313a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25232a;

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
                f25232a = r0
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25232a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25232a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25232a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25232a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25232a     // Catch:{ NoSuchFieldError -> 0x0049 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25232a     // Catch:{ NoSuchFieldError -> 0x0054 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p403y.C9312a0.C9313a.<clinit>():void");
        }
    }

    /* renamed from: e.f.c.a.y.a0$b */
    public static final class C9314b extends C9577z.C9578a<C9312a0, C9314b> implements C9546t0 {
        private C9314b() {
            super(C9312a0.DEFAULT_INSTANCE);
        }

        /* synthetic */ C9314b(C9313a aVar) {
            this();
        }

        /* renamed from: B */
        public C9314b mo23357B(String str) {
            mo24067t();
            ((C9312a0) this.f25644o).m31038W(str);
            return this;
        }

        /* renamed from: C */
        public C9314b mo23358C(C9468i iVar) {
            mo24067t();
            ((C9312a0) this.f25644o).m31039Y(iVar);
            return this;
        }

        /* renamed from: z */
        public C9314b mo23359z(C9364i0 i0Var) {
            mo24067t();
            ((C9312a0) this.f25644o).m31037V(i0Var);
            return this;
        }
    }

    static {
        C9312a0 a0Var = new C9312a0();
        DEFAULT_INSTANCE = a0Var;
        C9577z.m32635K(C9312a0.class, a0Var);
    }

    private C9312a0() {
    }

    /* renamed from: Q */
    public static C9312a0 m31035Q() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: U */
    public static C9314b m31036U() {
        return (C9314b) DEFAULT_INSTANCE.mo24058r();
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m31037V(C9364i0 i0Var) {
        this.outputPrefixType_ = i0Var.mo23423d();
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m31038W(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m31039Y(C9468i iVar) {
        iVar.getClass();
        this.value_ = iVar;
    }

    /* renamed from: R */
    public C9364i0 mo23354R() {
        C9364i0 e = C9364i0.m31222e(this.outputPrefixType_);
        return e == null ? C9364i0.UNRECOGNIZED : e;
    }

    /* renamed from: S */
    public String mo23355S() {
        return this.typeUrl_;
    }

    /* renamed from: T */
    public C9468i mo23356T() {
        return this.value_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Object mo23350u(C9577z.C9583f fVar, Object obj, Object obj2) {
        switch (C9313a.f25232a[fVar.ordinal()]) {
            case 1:
                return new C9312a0();
            case 2:
                return new C9314b((C9313a) null);
            case 3:
                return C9577z.m32629D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C9429a1<C9312a0> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (C9312a0.class) {
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
