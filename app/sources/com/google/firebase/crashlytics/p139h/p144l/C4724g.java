package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.g */
final class C4724g extends C4655a0.C4665e {

    /* renamed from: a */
    private final String f13280a;

    /* renamed from: b */
    private final String f13281b;

    /* renamed from: c */
    private final long f13282c;

    /* renamed from: d */
    private final Long f13283d;

    /* renamed from: e */
    private final boolean f13284e;

    /* renamed from: f */
    private final C4655a0.C4665e.C4666a f13285f;

    /* renamed from: g */
    private final C4655a0.C4665e.C4694f f13286g;

    /* renamed from: h */
    private final C4655a0.C4665e.C4692e f13287h;

    /* renamed from: i */
    private final C4655a0.C4665e.C4670c f13288i;

    /* renamed from: j */
    private final C4699b0<C4655a0.C4665e.C4672d> f13289j;

    /* renamed from: k */
    private final int f13290k;

    /* renamed from: com.google.firebase.crashlytics.h.l.g$b */
    static final class C4726b extends C4655a0.C4665e.C4669b {

        /* renamed from: a */
        private String f13291a;

        /* renamed from: b */
        private String f13292b;

        /* renamed from: c */
        private Long f13293c;

        /* renamed from: d */
        private Long f13294d;

        /* renamed from: e */
        private Boolean f13295e;

        /* renamed from: f */
        private C4655a0.C4665e.C4666a f13296f;

        /* renamed from: g */
        private C4655a0.C4665e.C4694f f13297g;

        /* renamed from: h */
        private C4655a0.C4665e.C4692e f13298h;

        /* renamed from: i */
        private C4655a0.C4665e.C4670c f13299i;

        /* renamed from: j */
        private C4699b0<C4655a0.C4665e.C4672d> f13300j;

        /* renamed from: k */
        private Integer f13301k;

        C4726b() {
        }

        private C4726b(C4655a0.C4665e eVar) {
            this.f13291a = eVar.mo14359f();
            this.f13292b = eVar.mo14361h();
            this.f13293c = Long.valueOf(eVar.mo14364k());
            this.f13294d = eVar.mo14357d();
            this.f13295e = Boolean.valueOf(eVar.mo14366m());
            this.f13296f = eVar.mo14355b();
            this.f13297g = eVar.mo14365l();
            this.f13298h = eVar.mo14363j();
            this.f13299i = eVar.mo14356c();
            this.f13300j = eVar.mo14358e();
            this.f13301k = Integer.valueOf(eVar.mo14360g());
        }

        /* renamed from: a */
        public C4655a0.C4665e mo14385a() {
            String str = this.f13291a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = str2 + " generator";
            }
            if (this.f13292b == null) {
                str2 = str2 + " identifier";
            }
            if (this.f13293c == null) {
                str2 = str2 + " startedAt";
            }
            if (this.f13295e == null) {
                str2 = str2 + " crashed";
            }
            if (this.f13296f == null) {
                str2 = str2 + " app";
            }
            if (this.f13301k == null) {
                str2 = str2 + " generatorType";
            }
            if (str2.isEmpty()) {
                return new C4724g(this.f13291a, this.f13292b, this.f13293c.longValue(), this.f13294d, this.f13295e.booleanValue(), this.f13296f, this.f13297g, this.f13298h, this.f13299i, this.f13300j, this.f13301k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        /* renamed from: b */
        public C4655a0.C4665e.C4669b mo14386b(C4655a0.C4665e.C4666a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f13296f = aVar;
            return this;
        }

        /* renamed from: c */
        public C4655a0.C4665e.C4669b mo14387c(boolean z) {
            this.f13295e = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public C4655a0.C4665e.C4669b mo14388d(C4655a0.C4665e.C4670c cVar) {
            this.f13299i = cVar;
            return this;
        }

        /* renamed from: e */
        public C4655a0.C4665e.C4669b mo14389e(Long l) {
            this.f13294d = l;
            return this;
        }

        /* renamed from: f */
        public C4655a0.C4665e.C4669b mo14390f(C4699b0<C4655a0.C4665e.C4672d> b0Var) {
            this.f13300j = b0Var;
            return this;
        }

        /* renamed from: g */
        public C4655a0.C4665e.C4669b mo14391g(String str) {
            Objects.requireNonNull(str, "Null generator");
            this.f13291a = str;
            return this;
        }

        /* renamed from: h */
        public C4655a0.C4665e.C4669b mo14392h(int i) {
            this.f13301k = Integer.valueOf(i);
            return this;
        }

        /* renamed from: i */
        public C4655a0.C4665e.C4669b mo14393i(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f13292b = str;
            return this;
        }

        /* renamed from: k */
        public C4655a0.C4665e.C4669b mo14395k(C4655a0.C4665e.C4692e eVar) {
            this.f13298h = eVar;
            return this;
        }

        /* renamed from: l */
        public C4655a0.C4665e.C4669b mo14396l(long j) {
            this.f13293c = Long.valueOf(j);
            return this;
        }

        /* renamed from: m */
        public C4655a0.C4665e.C4669b mo14397m(C4655a0.C4665e.C4694f fVar) {
            this.f13297g = fVar;
            return this;
        }
    }

    private C4724g(String str, String str2, long j, Long l, boolean z, C4655a0.C4665e.C4666a aVar, C4655a0.C4665e.C4694f fVar, C4655a0.C4665e.C4692e eVar, C4655a0.C4665e.C4670c cVar, C4699b0<C4655a0.C4665e.C4672d> b0Var, int i) {
        this.f13280a = str;
        this.f13281b = str2;
        this.f13282c = j;
        this.f13283d = l;
        this.f13284e = z;
        this.f13285f = aVar;
        this.f13286g = fVar;
        this.f13287h = eVar;
        this.f13288i = cVar;
        this.f13289j = b0Var;
        this.f13290k = i;
    }

    /* renamed from: b */
    public C4655a0.C4665e.C4666a mo14355b() {
        return this.f13285f;
    }

    /* renamed from: c */
    public C4655a0.C4665e.C4670c mo14356c() {
        return this.f13288i;
    }

    /* renamed from: d */
    public Long mo14357d() {
        return this.f13283d;
    }

    /* renamed from: e */
    public C4699b0<C4655a0.C4665e.C4672d> mo14358e() {
        return this.f13289j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r1 = r7.f13283d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r7.f13286g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r1 = r7.f13287h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r1 = r7.f13288i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r1 = r7.f13289j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.p139h.p144l.C4655a0.C4665e
            r2 = 0
            if (r1 == 0) goto L_0x00b5
            com.google.firebase.crashlytics.h.l.a0$e r8 = (com.google.firebase.crashlytics.p139h.p144l.C4655a0.C4665e) r8
            java.lang.String r1 = r7.f13280a
            java.lang.String r3 = r8.mo14359f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            java.lang.String r1 = r7.f13281b
            java.lang.String r3 = r8.mo14361h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            long r3 = r7.f13282c
            long r5 = r8.mo14364k()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00b3
            java.lang.Long r1 = r7.f13283d
            if (r1 != 0) goto L_0x0038
            java.lang.Long r1 = r8.mo14357d()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0042
        L_0x0038:
            java.lang.Long r3 = r8.mo14357d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0042:
            boolean r1 = r7.f13284e
            boolean r3 = r8.mo14366m()
            if (r1 != r3) goto L_0x00b3
            com.google.firebase.crashlytics.h.l.a0$e$a r1 = r7.f13285f
            com.google.firebase.crashlytics.h.l.a0$e$a r3 = r8.mo14355b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
            com.google.firebase.crashlytics.h.l.a0$e$f r1 = r7.f13286g
            if (r1 != 0) goto L_0x0061
            com.google.firebase.crashlytics.h.l.a0$e$f r1 = r8.mo14365l()
            if (r1 != 0) goto L_0x00b3
            goto L_0x006b
        L_0x0061:
            com.google.firebase.crashlytics.h.l.a0$e$f r3 = r8.mo14365l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x006b:
            com.google.firebase.crashlytics.h.l.a0$e$e r1 = r7.f13287h
            if (r1 != 0) goto L_0x0076
            com.google.firebase.crashlytics.h.l.a0$e$e r1 = r8.mo14363j()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0080
        L_0x0076:
            com.google.firebase.crashlytics.h.l.a0$e$e r3 = r8.mo14363j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0080:
            com.google.firebase.crashlytics.h.l.a0$e$c r1 = r7.f13288i
            if (r1 != 0) goto L_0x008b
            com.google.firebase.crashlytics.h.l.a0$e$c r1 = r8.mo14356c()
            if (r1 != 0) goto L_0x00b3
            goto L_0x0095
        L_0x008b:
            com.google.firebase.crashlytics.h.l.a0$e$c r3 = r8.mo14356c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x0095:
            com.google.firebase.crashlytics.h.l.b0<com.google.firebase.crashlytics.h.l.a0$e$d> r1 = r7.f13289j
            if (r1 != 0) goto L_0x00a0
            com.google.firebase.crashlytics.h.l.b0 r1 = r8.mo14358e()
            if (r1 != 0) goto L_0x00b3
            goto L_0x00aa
        L_0x00a0:
            com.google.firebase.crashlytics.h.l.b0 r3 = r8.mo14358e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b3
        L_0x00aa:
            int r1 = r7.f13290k
            int r8 = r8.mo14360g()
            if (r1 != r8) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r0 = 0
        L_0x00b4:
            return r0
        L_0x00b5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.p139h.p144l.C4724g.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public String mo14359f() {
        return this.f13280a;
    }

    /* renamed from: g */
    public int mo14360g() {
        return this.f13290k;
    }

    /* renamed from: h */
    public String mo14361h() {
        return this.f13281b;
    }

    public int hashCode() {
        long j = this.f13282c;
        int hashCode = (((((this.f13280a.hashCode() ^ 1000003) * 1000003) ^ this.f13281b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f13283d;
        int i = 0;
        int hashCode2 = (((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f13284e ? 1231 : 1237)) * 1000003) ^ this.f13285f.hashCode()) * 1000003;
        C4655a0.C4665e.C4694f fVar = this.f13286g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        C4655a0.C4665e.C4692e eVar = this.f13287h;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        C4655a0.C4665e.C4670c cVar = this.f13288i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        C4699b0<C4655a0.C4665e.C4672d> b0Var = this.f13289j;
        if (b0Var != null) {
            i = b0Var.hashCode();
        }
        return ((hashCode5 ^ i) * 1000003) ^ this.f13290k;
    }

    /* renamed from: j */
    public C4655a0.C4665e.C4692e mo14363j() {
        return this.f13287h;
    }

    /* renamed from: k */
    public long mo14364k() {
        return this.f13282c;
    }

    /* renamed from: l */
    public C4655a0.C4665e.C4694f mo14365l() {
        return this.f13286g;
    }

    /* renamed from: m */
    public boolean mo14366m() {
        return this.f13284e;
    }

    /* renamed from: n */
    public C4655a0.C4665e.C4669b mo14367n() {
        return new C4726b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f13280a + ", identifier=" + this.f13281b + ", startedAt=" + this.f13282c + ", endedAt=" + this.f13283d + ", crashed=" + this.f13284e + ", app=" + this.f13285f + ", user=" + this.f13286g + ", os=" + this.f13287h + ", device=" + this.f13288i + ", events=" + this.f13289j + ", generatorType=" + this.f13290k + "}";
    }
}
