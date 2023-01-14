package p174e.p319f.p393c.p394a.p403y;

import okhttp3.HttpUrl;
import p174e.p319f.p393c.p394a.p404z.p405a.C9429a1;
import p174e.p319f.p393c.p394a.p404z.p405a.C9431b0;
import p174e.p319f.p393c.p394a.p404z.p405a.C9546t0;
import p174e.p319f.p393c.p394a.p404z.p405a.C9577z;

/* renamed from: e.f.c.a.y.d0 */
public final class C9332d0 extends C9577z<C9332d0, C9334b> implements C9546t0 {
    /* access modifiers changed from: private */
    public static final C9332d0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile C9429a1<C9332d0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C9431b0.C9440i<C9335c> keyInfo_ = C9577z.m32637v();
    private int primaryKeyId_;

    /* renamed from: e.f.c.a.y.d0$a */
    static /* synthetic */ class C9333a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25238a;

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
                f25238a = r0
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25238a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25238a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25238a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25238a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25238a     // Catch:{ NoSuchFieldError -> 0x0049 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25238a     // Catch:{ NoSuchFieldError -> 0x0054 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p403y.C9332d0.C9333a.<clinit>():void");
        }
    }

    /* renamed from: e.f.c.a.y.d0$b */
    public static final class C9334b extends C9577z.C9578a<C9332d0, C9334b> implements C9546t0 {
        private C9334b() {
            super(C9332d0.DEFAULT_INSTANCE);
        }

        /* synthetic */ C9334b(C9333a aVar) {
            this();
        }

        /* renamed from: B */
        public C9334b mo23388B(int i) {
            mo24067t();
            ((C9332d0) this.f25644o).m31118T(i);
            return this;
        }

        /* renamed from: z */
        public C9334b mo23389z(C9335c cVar) {
            mo24067t();
            ((C9332d0) this.f25644o).m31115P(cVar);
            return this;
        }
    }

    /* renamed from: e.f.c.a.y.d0$c */
    public static final class C9335c extends C9577z<C9335c, C9336a> implements C9546t0 {
        /* access modifiers changed from: private */
        public static final C9335c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile C9429a1<C9335c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = HttpUrl.FRAGMENT_ENCODE_SET;

        /* renamed from: e.f.c.a.y.d0$c$a */
        public static final class C9336a extends C9577z.C9578a<C9335c, C9336a> implements C9546t0 {
            private C9336a() {
                super(C9335c.DEFAULT_INSTANCE);
            }

            /* synthetic */ C9336a(C9333a aVar) {
                this();
            }

            /* renamed from: B */
            public C9336a mo23391B(C9364i0 i0Var) {
                mo24067t();
                ((C9335c) this.f25644o).m31130U(i0Var);
                return this;
            }

            /* renamed from: C */
            public C9336a mo23392C(C9424z zVar) {
                mo24067t();
                ((C9335c) this.f25644o).m31131V(zVar);
                return this;
            }

            /* renamed from: D */
            public C9336a mo23393D(String str) {
                mo24067t();
                ((C9335c) this.f25644o).m31132W(str);
                return this;
            }

            /* renamed from: z */
            public C9336a mo23394z(int i) {
                mo24067t();
                ((C9335c) this.f25644o).m31129T(i);
                return this;
            }
        }

        static {
            C9335c cVar = new C9335c();
            DEFAULT_INSTANCE = cVar;
            C9577z.m32635K(C9335c.class, cVar);
        }

        private C9335c() {
        }

        /* renamed from: S */
        public static C9336a m31128S() {
            return (C9336a) DEFAULT_INSTANCE.mo24058r();
        }

        /* access modifiers changed from: private */
        /* renamed from: T */
        public void m31129T(int i) {
            this.keyId_ = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: U */
        public void m31130U(C9364i0 i0Var) {
            this.outputPrefixType_ = i0Var.mo23423d();
        }

        /* access modifiers changed from: private */
        /* renamed from: V */
        public void m31131V(C9424z zVar) {
            this.status_ = zVar.mo23423d();
        }

        /* access modifiers changed from: private */
        /* renamed from: W */
        public void m31132W(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        /* renamed from: R */
        public int mo23390R() {
            return this.keyId_;
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public final Object mo23350u(C9577z.C9583f fVar, Object obj, Object obj2) {
            switch (C9333a.f25238a[fVar.ordinal()]) {
                case 1:
                    return new C9335c();
                case 2:
                    return new C9336a((C9333a) null);
                case 3:
                    return C9577z.m32629D(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C9429a1<C9335c> a1Var = PARSER;
                    if (a1Var == null) {
                        synchronized (C9335c.class) {
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

    static {
        C9332d0 d0Var = new C9332d0();
        DEFAULT_INSTANCE = d0Var;
        C9577z.m32635K(C9332d0.class, d0Var);
    }

    private C9332d0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m31115P(C9335c cVar) {
        cVar.getClass();
        m31116Q();
        this.keyInfo_.add(cVar);
    }

    /* renamed from: Q */
    private void m31116Q() {
        if (!this.keyInfo_.mo23512y()) {
            this.keyInfo_ = C9577z.m32628B(this.keyInfo_);
        }
    }

    /* renamed from: S */
    public static C9334b m31117S() {
        return (C9334b) DEFAULT_INSTANCE.mo24058r();
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m31118T(int i) {
        this.primaryKeyId_ = i;
    }

    /* renamed from: R */
    public C9335c mo23387R(int i) {
        return this.keyInfo_.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Object mo23350u(C9577z.C9583f fVar, Object obj, Object obj2) {
        switch (C9333a.f25238a[fVar.ordinal()]) {
            case 1:
                return new C9332d0();
            case 2:
                return new C9334b((C9333a) null);
            case 3:
                return C9577z.m32629D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", C9335c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C9429a1<C9332d0> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (C9332d0.class) {
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
