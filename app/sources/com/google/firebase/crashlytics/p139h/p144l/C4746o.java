package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.o */
final class C4746o extends C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c {

    /* renamed from: a */
    private final String f13373a;

    /* renamed from: b */
    private final String f13374b;

    /* renamed from: c */
    private final C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b> f13375c;

    /* renamed from: d */
    private final C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c f13376d;

    /* renamed from: e */
    private final int f13377e;

    /* renamed from: com.google.firebase.crashlytics.h.l.o$b */
    static final class C4748b extends C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c.C4680a {

        /* renamed from: a */
        private String f13378a;

        /* renamed from: b */
        private String f13379b;

        /* renamed from: c */
        private C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b> f13380c;

        /* renamed from: d */
        private C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c f13381d;

        /* renamed from: e */
        private Integer f13382e;

        C4748b() {
        }

        /* renamed from: a */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c mo14462a() {
            String str = this.f13378a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = str2 + " type";
            }
            if (this.f13380c == null) {
                str2 = str2 + " frames";
            }
            if (this.f13382e == null) {
                str2 = str2 + " overflowCount";
            }
            if (str2.isEmpty()) {
                return new C4746o(this.f13378a, this.f13379b, this.f13380c, this.f13381d, this.f13382e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* renamed from: b */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c.C4680a mo14463b(C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c cVar) {
            this.f13381d = cVar;
            return this;
        }

        /* renamed from: c */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c.C4680a mo14464c(C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b> b0Var) {
            Objects.requireNonNull(b0Var, "Null frames");
            this.f13380c = b0Var;
            return this;
        }

        /* renamed from: d */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c.C4680a mo14465d(int i) {
            this.f13382e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c.C4680a mo14466e(String str) {
            this.f13379b = str;
            return this;
        }

        /* renamed from: f */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c.C4680a mo14467f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f13378a = str;
            return this;
        }
    }

    private C4746o(String str, String str2, C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b> b0Var, C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c cVar, int i) {
        this.f13373a = str;
        this.f13374b = str2;
        this.f13375c = b0Var;
        this.f13376d = cVar;
        this.f13377e = i;
    }

    /* renamed from: b */
    public C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c mo14457b() {
        return this.f13376d;
    }

    /* renamed from: c */
    public C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b> mo14458c() {
        return this.f13375c;
    }

    /* renamed from: d */
    public int mo14459d() {
        return this.f13377e;
    }

    /* renamed from: e */
    public String mo14460e() {
        return this.f13374b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.f13376d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f13374b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.firebase.crashlytics.p139h.p144l.C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c
            r2 = 0
            if (r1 == 0) goto L_0x0058
            com.google.firebase.crashlytics.h.l.a0$e$d$a$b$c r5 = (com.google.firebase.crashlytics.p139h.p144l.C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c) r5
            java.lang.String r1 = r4.f13373a
            java.lang.String r3 = r5.mo14461f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r4.f13374b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.mo14460e()
            if (r1 != 0) goto L_0x0056
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r5.mo14460e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x002c:
            com.google.firebase.crashlytics.h.l.b0<com.google.firebase.crashlytics.h.l.a0$e$d$a$b$e$b> r1 = r4.f13375c
            com.google.firebase.crashlytics.h.l.b0 r3 = r5.mo14458c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            com.google.firebase.crashlytics.h.l.a0$e$d$a$b$c r1 = r4.f13376d
            if (r1 != 0) goto L_0x0043
            com.google.firebase.crashlytics.h.l.a0$e$d$a$b$c r1 = r5.mo14457b()
            if (r1 != 0) goto L_0x0056
            goto L_0x004d
        L_0x0043:
            com.google.firebase.crashlytics.h.l.a0$e$d$a$b$c r3 = r5.mo14457b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x004d:
            int r1 = r4.f13377e
            int r5 = r5.mo14459d()
            if (r1 != r5) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.p139h.p144l.C4746o.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public String mo14461f() {
        return this.f13373a;
    }

    public int hashCode() {
        int hashCode = (this.f13373a.hashCode() ^ 1000003) * 1000003;
        String str = this.f13374b;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f13375c.hashCode()) * 1000003;
        C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c cVar = this.f13376d;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.f13377e;
    }

    public String toString() {
        return "Exception{type=" + this.f13373a + ", reason=" + this.f13374b + ", frames=" + this.f13375c + ", causedBy=" + this.f13376d + ", overflowCount=" + this.f13377e + "}";
    }
}
