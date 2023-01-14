package p174e.p319f.p393c.p394a.p403y;

import java.util.Collections;
import java.util.List;
import p174e.p319f.p393c.p394a.p404z.p405a.C9429a1;
import p174e.p319f.p393c.p394a.p404z.p405a.C9431b0;
import p174e.p319f.p393c.p394a.p404z.p405a.C9526q;
import p174e.p319f.p393c.p394a.p404z.p405a.C9546t0;
import p174e.p319f.p393c.p394a.p404z.p405a.C9577z;

/* renamed from: e.f.c.a.y.c0 */
public final class C9324c0 extends C9577z<C9324c0, C9326b> implements C9546t0 {
    /* access modifiers changed from: private */
    public static final C9324c0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile C9429a1<C9324c0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C9431b0.C9440i<C9327c> key_ = C9577z.m32637v();
    private int primaryKeyId_;

    /* renamed from: e.f.c.a.y.c0$a */
    static /* synthetic */ class C9325a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25236a;

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
                f25236a = r0
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25236a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25236a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25236a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25236a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25236a     // Catch:{ NoSuchFieldError -> 0x0049 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25236a     // Catch:{ NoSuchFieldError -> 0x0054 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p403y.C9324c0.C9325a.<clinit>():void");
        }
    }

    /* renamed from: e.f.c.a.y.c0$b */
    public static final class C9326b extends C9577z.C9578a<C9324c0, C9326b> implements C9546t0 {
        private C9326b() {
            super(C9324c0.DEFAULT_INSTANCE);
        }

        /* synthetic */ C9326b(C9325a aVar) {
            this();
        }

        /* renamed from: B */
        public C9327c mo23367B(int i) {
            return ((C9324c0) this.f25644o).mo23363R(i);
        }

        /* renamed from: C */
        public int mo23368C() {
            return ((C9324c0) this.f25644o).mo23364S();
        }

        /* renamed from: D */
        public List<C9327c> mo23369D() {
            return Collections.unmodifiableList(((C9324c0) this.f25644o).mo23365T());
        }

        /* renamed from: F */
        public C9326b mo23370F(int i) {
            mo24067t();
            ((C9324c0) this.f25644o).m31065Y(i);
            return this;
        }

        /* renamed from: z */
        public C9326b mo23371z(C9327c cVar) {
            mo24067t();
            ((C9324c0) this.f25644o).m31061P(cVar);
            return this;
        }
    }

    /* renamed from: e.f.c.a.y.c0$c */
    public static final class C9327c extends C9577z<C9327c, C9328a> implements C9546t0 {
        /* access modifiers changed from: private */
        public static final C9327c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile C9429a1<C9327c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private C9419y keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* renamed from: e.f.c.a.y.c0$c$a */
        public static final class C9328a extends C9577z.C9578a<C9327c, C9328a> implements C9546t0 {
            private C9328a() {
                super(C9327c.DEFAULT_INSTANCE);
            }

            /* synthetic */ C9328a(C9325a aVar) {
                this();
            }

            /* renamed from: B */
            public C9328a mo23377B(int i) {
                mo24067t();
                ((C9327c) this.f25644o).m31083Z(i);
                return this;
            }

            /* renamed from: C */
            public C9328a mo23378C(C9364i0 i0Var) {
                mo24067t();
                ((C9327c) this.f25644o).m31084a0(i0Var);
                return this;
            }

            /* renamed from: D */
            public C9328a mo23379D(C9424z zVar) {
                mo24067t();
                ((C9327c) this.f25644o).m31085b0(zVar);
                return this;
            }

            /* renamed from: z */
            public C9328a mo23380z(C9419y yVar) {
                mo24067t();
                ((C9327c) this.f25644o).m31082Y(yVar);
                return this;
            }
        }

        static {
            C9327c cVar = new C9327c();
            DEFAULT_INSTANCE = cVar;
            C9577z.m32635K(C9327c.class, cVar);
        }

        private C9327c() {
        }

        /* renamed from: W */
        public static C9328a m31081W() {
            return (C9328a) DEFAULT_INSTANCE.mo24058r();
        }

        /* access modifiers changed from: private */
        /* renamed from: Y */
        public void m31082Y(C9419y yVar) {
            yVar.getClass();
            this.keyData_ = yVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: Z */
        public void m31083Z(int i) {
            this.keyId_ = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a0 */
        public void m31084a0(C9364i0 i0Var) {
            this.outputPrefixType_ = i0Var.mo23423d();
        }

        /* access modifiers changed from: private */
        /* renamed from: b0 */
        public void m31085b0(C9424z zVar) {
            this.status_ = zVar.mo23423d();
        }

        /* renamed from: R */
        public C9419y mo23372R() {
            C9419y yVar = this.keyData_;
            return yVar == null ? C9419y.m31371Q() : yVar;
        }

        /* renamed from: S */
        public int mo23373S() {
            return this.keyId_;
        }

        /* renamed from: T */
        public C9364i0 mo23374T() {
            C9364i0 e = C9364i0.m31222e(this.outputPrefixType_);
            return e == null ? C9364i0.UNRECOGNIZED : e;
        }

        /* renamed from: U */
        public C9424z mo23375U() {
            C9424z e = C9424z.m31387e(this.status_);
            return e == null ? C9424z.UNRECOGNIZED : e;
        }

        /* renamed from: V */
        public boolean mo23376V() {
            return this.keyData_ != null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public final Object mo23350u(C9577z.C9583f fVar, Object obj, Object obj2) {
            switch (C9325a.f25236a[fVar.ordinal()]) {
                case 1:
                    return new C9327c();
                case 2:
                    return new C9328a((C9325a) null);
                case 3:
                    return C9577z.m32629D(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    C9429a1<C9327c> a1Var = PARSER;
                    if (a1Var == null) {
                        synchronized (C9327c.class) {
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
        C9324c0 c0Var = new C9324c0();
        DEFAULT_INSTANCE = c0Var;
        C9577z.m32635K(C9324c0.class, c0Var);
    }

    private C9324c0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m31061P(C9327c cVar) {
        cVar.getClass();
        m31062Q();
        this.key_.add(cVar);
    }

    /* renamed from: Q */
    private void m31062Q() {
        if (!this.key_.mo23512y()) {
            this.key_ = C9577z.m32628B(this.key_);
        }
    }

    /* renamed from: V */
    public static C9326b m31063V() {
        return (C9326b) DEFAULT_INSTANCE.mo24058r();
    }

    /* renamed from: W */
    public static C9324c0 m31064W(byte[] bArr, C9526q qVar) {
        return (C9324c0) C9577z.m32631G(DEFAULT_INSTANCE, bArr, qVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m31065Y(int i) {
        this.primaryKeyId_ = i;
    }

    /* renamed from: R */
    public C9327c mo23363R(int i) {
        return this.key_.get(i);
    }

    /* renamed from: S */
    public int mo23364S() {
        return this.key_.size();
    }

    /* renamed from: T */
    public List<C9327c> mo23365T() {
        return this.key_;
    }

    /* renamed from: U */
    public int mo23366U() {
        return this.primaryKeyId_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Object mo23350u(C9577z.C9583f fVar, Object obj, Object obj2) {
        switch (C9325a.f25236a[fVar.ordinal()]) {
            case 1:
                return new C9324c0();
            case 2:
                return new C9326b((C9325a) null);
            case 3:
                return C9577z.m32629D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", C9327c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C9429a1<C9324c0> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (C9324c0.class) {
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
