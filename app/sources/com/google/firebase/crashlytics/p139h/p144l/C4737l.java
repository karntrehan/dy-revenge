package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.l */
final class C4737l extends C4655a0.C4665e.C4672d.C4673a {

    /* renamed from: a */
    private final C4655a0.C4665e.C4672d.C4673a.C4675b f13345a;

    /* renamed from: b */
    private final C4699b0<C4655a0.C4659c> f13346b;

    /* renamed from: c */
    private final C4699b0<C4655a0.C4659c> f13347c;

    /* renamed from: d */
    private final Boolean f13348d;

    /* renamed from: e */
    private final int f13349e;

    /* renamed from: com.google.firebase.crashlytics.h.l.l$b */
    static final class C4739b extends C4655a0.C4665e.C4672d.C4673a.C4674a {

        /* renamed from: a */
        private C4655a0.C4665e.C4672d.C4673a.C4675b f13350a;

        /* renamed from: b */
        private C4699b0<C4655a0.C4659c> f13351b;

        /* renamed from: c */
        private C4699b0<C4655a0.C4659c> f13352c;

        /* renamed from: d */
        private Boolean f13353d;

        /* renamed from: e */
        private Integer f13354e;

        C4739b() {
        }

        private C4739b(C4655a0.C4665e.C4672d.C4673a aVar) {
            this.f13350a = aVar.mo14425d();
            this.f13351b = aVar.mo14424c();
            this.f13352c = aVar.mo14426e();
            this.f13353d = aVar.mo14423b();
            this.f13354e = Integer.valueOf(aVar.mo14427f());
        }

        /* renamed from: a */
        public C4655a0.C4665e.C4672d.C4673a mo14429a() {
            C4655a0.C4665e.C4672d.C4673a.C4675b bVar = this.f13350a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (bVar == null) {
                str = str + " execution";
            }
            if (this.f13354e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new C4737l(this.f13350a, this.f13351b, this.f13352c, this.f13353d, this.f13354e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C4655a0.C4665e.C4672d.C4673a.C4674a mo14430b(Boolean bool) {
            this.f13353d = bool;
            return this;
        }

        /* renamed from: c */
        public C4655a0.C4665e.C4672d.C4673a.C4674a mo14431c(C4699b0<C4655a0.C4659c> b0Var) {
            this.f13351b = b0Var;
            return this;
        }

        /* renamed from: d */
        public C4655a0.C4665e.C4672d.C4673a.C4674a mo14432d(C4655a0.C4665e.C4672d.C4673a.C4675b bVar) {
            Objects.requireNonNull(bVar, "Null execution");
            this.f13350a = bVar;
            return this;
        }

        /* renamed from: e */
        public C4655a0.C4665e.C4672d.C4673a.C4674a mo14433e(C4699b0<C4655a0.C4659c> b0Var) {
            this.f13352c = b0Var;
            return this;
        }

        /* renamed from: f */
        public C4655a0.C4665e.C4672d.C4673a.C4674a mo14434f(int i) {
            this.f13354e = Integer.valueOf(i);
            return this;
        }
    }

    private C4737l(C4655a0.C4665e.C4672d.C4673a.C4675b bVar, C4699b0<C4655a0.C4659c> b0Var, C4699b0<C4655a0.C4659c> b0Var2, Boolean bool, int i) {
        this.f13345a = bVar;
        this.f13346b = b0Var;
        this.f13347c = b0Var2;
        this.f13348d = bool;
        this.f13349e = i;
    }

    /* renamed from: b */
    public Boolean mo14423b() {
        return this.f13348d;
    }

    /* renamed from: c */
    public C4699b0<C4655a0.C4659c> mo14424c() {
        return this.f13346b;
    }

    /* renamed from: d */
    public C4655a0.C4665e.C4672d.C4673a.C4675b mo14425d() {
        return this.f13345a;
    }

    /* renamed from: e */
    public C4699b0<C4655a0.C4659c> mo14426e() {
        return this.f13347c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f13347c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.f13348d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f13346b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.p139h.p144l.C4655a0.C4665e.C4672d.C4673a
            r2 = 0
            if (r1 == 0) goto L_0x0061
            com.google.firebase.crashlytics.h.l.a0$e$d$a r5 = (com.google.firebase.crashlytics.p139h.p144l.C4655a0.C4665e.C4672d.C4673a) r5
            com.google.firebase.crashlytics.h.l.a0$e$d$a$b r1 = r4.f13345a
            com.google.firebase.crashlytics.h.l.a0$e$d$a$b r3 = r5.mo14425d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
            com.google.firebase.crashlytics.h.l.b0<com.google.firebase.crashlytics.h.l.a0$c> r1 = r4.f13346b
            if (r1 != 0) goto L_0x0022
            com.google.firebase.crashlytics.h.l.b0 r1 = r5.mo14424c()
            if (r1 != 0) goto L_0x005f
            goto L_0x002c
        L_0x0022:
            com.google.firebase.crashlytics.h.l.b0 r3 = r5.mo14424c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x002c:
            com.google.firebase.crashlytics.h.l.b0<com.google.firebase.crashlytics.h.l.a0$c> r1 = r4.f13347c
            if (r1 != 0) goto L_0x0037
            com.google.firebase.crashlytics.h.l.b0 r1 = r5.mo14426e()
            if (r1 != 0) goto L_0x005f
            goto L_0x0041
        L_0x0037:
            com.google.firebase.crashlytics.h.l.b0 r3 = r5.mo14426e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x0041:
            java.lang.Boolean r1 = r4.f13348d
            if (r1 != 0) goto L_0x004c
            java.lang.Boolean r1 = r5.mo14423b()
            if (r1 != 0) goto L_0x005f
            goto L_0x0056
        L_0x004c:
            java.lang.Boolean r3 = r5.mo14423b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x0056:
            int r1 = r4.f13349e
            int r5 = r5.mo14427f()
            if (r1 != r5) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            return r0
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.p139h.p144l.C4737l.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public int mo14427f() {
        return this.f13349e;
    }

    /* renamed from: g */
    public C4655a0.C4665e.C4672d.C4673a.C4674a mo14428g() {
        return new C4739b(this);
    }

    public int hashCode() {
        int hashCode = (this.f13345a.hashCode() ^ 1000003) * 1000003;
        C4699b0<C4655a0.C4659c> b0Var = this.f13346b;
        int i = 0;
        int hashCode2 = (hashCode ^ (b0Var == null ? 0 : b0Var.hashCode())) * 1000003;
        C4699b0<C4655a0.C4659c> b0Var2 = this.f13347c;
        int hashCode3 = (hashCode2 ^ (b0Var2 == null ? 0 : b0Var2.hashCode())) * 1000003;
        Boolean bool = this.f13348d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.f13349e;
    }

    public String toString() {
        return "Application{execution=" + this.f13345a + ", customAttributes=" + this.f13346b + ", internalKeys=" + this.f13347c + ", background=" + this.f13348d + ", uiOrientation=" + this.f13349e + "}";
    }
}
