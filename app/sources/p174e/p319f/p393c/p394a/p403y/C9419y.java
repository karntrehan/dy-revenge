package p174e.p319f.p393c.p394a.p403y;

import okhttp3.HttpUrl;
import p174e.p319f.p393c.p394a.p404z.p405a.C9429a1;
import p174e.p319f.p393c.p394a.p404z.p405a.C9431b0;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9546t0;
import p174e.p319f.p393c.p394a.p404z.p405a.C9577z;

/* renamed from: e.f.c.a.y.y */
public final class C9419y extends C9577z<C9419y, C9421b> implements C9546t0 {
    /* access modifiers changed from: private */
    public static final C9419y DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile C9429a1<C9419y> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = HttpUrl.FRAGMENT_ENCODE_SET;
    private C9468i value_ = C9468i.f25367f;

    /* renamed from: e.f.c.a.y.y$a */
    static /* synthetic */ class C9420a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25283a;

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
                f25283a = r0
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25283a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25283a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25283a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25283a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25283a     // Catch:{ NoSuchFieldError -> 0x0049 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25283a     // Catch:{ NoSuchFieldError -> 0x0054 }
                e.f.c.a.z.a.z$f r1 = p174e.p319f.p393c.p394a.p404z.p405a.C9577z.C9583f.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p403y.C9419y.C9420a.<clinit>():void");
        }
    }

    /* renamed from: e.f.c.a.y.y$b */
    public static final class C9421b extends C9577z.C9578a<C9419y, C9421b> implements C9546t0 {
        private C9421b() {
            super(C9419y.DEFAULT_INSTANCE);
        }

        /* synthetic */ C9421b(C9420a aVar) {
            this();
        }

        /* renamed from: B */
        public C9421b mo23471B(String str) {
            mo24067t();
            ((C9419y) this.f25644o).m31374W(str);
            return this;
        }

        /* renamed from: C */
        public C9421b mo23472C(C9468i iVar) {
            mo24067t();
            ((C9419y) this.f25644o).m31375Y(iVar);
            return this;
        }

        /* renamed from: z */
        public C9421b mo23473z(C9422c cVar) {
            mo24067t();
            ((C9419y) this.f25644o).m31373V(cVar);
            return this;
        }
    }

    /* renamed from: e.f.c.a.y.y$c */
    public enum C9422c implements C9431b0.C9434c {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: t */
        private static final C9431b0.C9435d<C9422c> f25290t = null;

        /* renamed from: v */
        private final int f25292v;

        /* renamed from: e.f.c.a.y.y$c$a */
        class C9423a implements C9431b0.C9435d<C9422c> {
            C9423a() {
            }

            /* renamed from: b */
            public C9422c mo23424a(int i) {
                return C9422c.m31383e(i);
            }
        }

        static {
            f25290t = new C9423a();
        }

        private C9422c(int i) {
            this.f25292v = i;
        }

        /* renamed from: e */
        public static C9422c m31383e(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }

        /* renamed from: d */
        public final int mo23423d() {
            if (this != UNRECOGNIZED) {
                return this.f25292v;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        C9419y yVar = new C9419y();
        DEFAULT_INSTANCE = yVar;
        C9577z.m32635K(C9419y.class, yVar);
    }

    private C9419y() {
    }

    /* renamed from: Q */
    public static C9419y m31371Q() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: U */
    public static C9421b m31372U() {
        return (C9421b) DEFAULT_INSTANCE.mo24058r();
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m31373V(C9422c cVar) {
        this.keyMaterialType_ = cVar.mo23423d();
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m31374W(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m31375Y(C9468i iVar) {
        iVar.getClass();
        this.value_ = iVar;
    }

    /* renamed from: R */
    public C9422c mo23468R() {
        C9422c e = C9422c.m31383e(this.keyMaterialType_);
        return e == null ? C9422c.UNRECOGNIZED : e;
    }

    /* renamed from: S */
    public String mo23469S() {
        return this.typeUrl_;
    }

    /* renamed from: T */
    public C9468i mo23470T() {
        return this.value_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Object mo23350u(C9577z.C9583f fVar, Object obj, Object obj2) {
        switch (C9420a.f25283a[fVar.ordinal()]) {
            case 1:
                return new C9419y();
            case 2:
                return new C9421b((C9420a) null);
            case 3:
                return C9577z.m32629D(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C9429a1<C9419y> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (C9419y.class) {
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
