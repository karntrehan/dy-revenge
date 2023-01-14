package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.r */
final class C4755r extends C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b {

    /* renamed from: a */
    private final long f13395a;

    /* renamed from: b */
    private final String f13396b;

    /* renamed from: c */
    private final String f13397c;

    /* renamed from: d */
    private final long f13398d;

    /* renamed from: e */
    private final int f13399e;

    /* renamed from: com.google.firebase.crashlytics.h.l.r$b */
    static final class C4757b extends C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b.C4686a {

        /* renamed from: a */
        private Long f13400a;

        /* renamed from: b */
        private String f13401b;

        /* renamed from: c */
        private String f13402c;

        /* renamed from: d */
        private Long f13403d;

        /* renamed from: e */
        private Integer f13404e;

        C4757b() {
        }

        /* renamed from: a */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b mo14487a() {
            Long l = this.f13400a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = str + " pc";
            }
            if (this.f13401b == null) {
                str = str + " symbol";
            }
            if (this.f13403d == null) {
                str = str + " offset";
            }
            if (this.f13404e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C4755r(this.f13400a.longValue(), this.f13401b, this.f13402c, this.f13403d.longValue(), this.f13404e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b.C4686a mo14488b(String str) {
            this.f13402c = str;
            return this;
        }

        /* renamed from: c */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b.C4686a mo14489c(int i) {
            this.f13404e = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b.C4686a mo14490d(long j) {
            this.f13403d = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b.C4686a mo14491e(long j) {
            this.f13400a = Long.valueOf(j);
            return this;
        }

        /* renamed from: f */
        public C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b.C4686a mo14492f(String str) {
            Objects.requireNonNull(str, "Null symbol");
            this.f13401b = str;
            return this;
        }
    }

    private C4755r(long j, String str, String str2, long j2, int i) {
        this.f13395a = j;
        this.f13396b = str;
        this.f13397c = str2;
        this.f13398d = j2;
        this.f13399e = i;
    }

    /* renamed from: b */
    public String mo14482b() {
        return this.f13397c;
    }

    /* renamed from: c */
    public int mo14483c() {
        return this.f13399e;
    }

    /* renamed from: d */
    public long mo14484d() {
        return this.f13398d;
    }

    /* renamed from: e */
    public long mo14485e() {
        return this.f13395a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r1 = r7.f13397c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.firebase.crashlytics.p139h.p144l.C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b
            r2 = 0
            if (r1 == 0) goto L_0x004b
            com.google.firebase.crashlytics.h.l.a0$e$d$a$b$e$b r8 = (com.google.firebase.crashlytics.p139h.p144l.C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b) r8
            long r3 = r7.f13395a
            long r5 = r8.mo14485e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = r7.f13396b
            java.lang.String r3 = r8.mo14486f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r7.f13397c
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r8.mo14482b()
            if (r1 != 0) goto L_0x0049
            goto L_0x0036
        L_0x002c:
            java.lang.String r3 = r8.mo14482b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
        L_0x0036:
            long r3 = r7.f13398d
            long r5 = r8.mo14484d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            int r1 = r7.f13399e
            int r8 = r8.mo14483c()
            if (r1 != r8) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.p139h.p144l.C4755r.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public String mo14486f() {
        return this.f13396b;
    }

    public int hashCode() {
        long j = this.f13395a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f13396b.hashCode()) * 1000003;
        String str = this.f13397c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.f13398d;
        return this.f13399e ^ ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f13395a + ", symbol=" + this.f13396b + ", file=" + this.f13397c + ", offset=" + this.f13398d + ", importance=" + this.f13399e + "}";
    }
}
