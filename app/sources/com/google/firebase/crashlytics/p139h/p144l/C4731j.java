package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.j */
final class C4731j extends C4655a0.C4665e.C4670c {

    /* renamed from: a */
    private final int f13317a;

    /* renamed from: b */
    private final String f13318b;

    /* renamed from: c */
    private final int f13319c;

    /* renamed from: d */
    private final long f13320d;

    /* renamed from: e */
    private final long f13321e;

    /* renamed from: f */
    private final boolean f13322f;

    /* renamed from: g */
    private final int f13323g;

    /* renamed from: h */
    private final String f13324h;

    /* renamed from: i */
    private final String f13325i;

    /* renamed from: com.google.firebase.crashlytics.h.l.j$b */
    static final class C4733b extends C4655a0.C4665e.C4670c.C4671a {

        /* renamed from: a */
        private Integer f13326a;

        /* renamed from: b */
        private String f13327b;

        /* renamed from: c */
        private Integer f13328c;

        /* renamed from: d */
        private Long f13329d;

        /* renamed from: e */
        private Long f13330e;

        /* renamed from: f */
        private Boolean f13331f;

        /* renamed from: g */
        private Integer f13332g;

        /* renamed from: h */
        private String f13333h;

        /* renamed from: i */
        private String f13334i;

        C4733b() {
        }

        /* renamed from: a */
        public C4655a0.C4665e.C4670c mo14407a() {
            Integer num = this.f13326a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (num == null) {
                str = str + " arch";
            }
            if (this.f13327b == null) {
                str = str + " model";
            }
            if (this.f13328c == null) {
                str = str + " cores";
            }
            if (this.f13329d == null) {
                str = str + " ram";
            }
            if (this.f13330e == null) {
                str = str + " diskSpace";
            }
            if (this.f13331f == null) {
                str = str + " simulator";
            }
            if (this.f13332g == null) {
                str = str + " state";
            }
            if (this.f13333h == null) {
                str = str + " manufacturer";
            }
            if (this.f13334i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new C4731j(this.f13326a.intValue(), this.f13327b, this.f13328c.intValue(), this.f13329d.longValue(), this.f13330e.longValue(), this.f13331f.booleanValue(), this.f13332g.intValue(), this.f13333h, this.f13334i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C4655a0.C4665e.C4670c.C4671a mo14408b(int i) {
            this.f13326a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public C4655a0.C4665e.C4670c.C4671a mo14409c(int i) {
            this.f13328c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public C4655a0.C4665e.C4670c.C4671a mo14410d(long j) {
            this.f13330e = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public C4655a0.C4665e.C4670c.C4671a mo14411e(String str) {
            Objects.requireNonNull(str, "Null manufacturer");
            this.f13333h = str;
            return this;
        }

        /* renamed from: f */
        public C4655a0.C4665e.C4670c.C4671a mo14412f(String str) {
            Objects.requireNonNull(str, "Null model");
            this.f13327b = str;
            return this;
        }

        /* renamed from: g */
        public C4655a0.C4665e.C4670c.C4671a mo14413g(String str) {
            Objects.requireNonNull(str, "Null modelClass");
            this.f13334i = str;
            return this;
        }

        /* renamed from: h */
        public C4655a0.C4665e.C4670c.C4671a mo14414h(long j) {
            this.f13329d = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public C4655a0.C4665e.C4670c.C4671a mo14415i(boolean z) {
            this.f13331f = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: j */
        public C4655a0.C4665e.C4670c.C4671a mo14416j(int i) {
            this.f13332g = Integer.valueOf(i);
            return this;
        }
    }

    private C4731j(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f13317a = i;
        this.f13318b = str;
        this.f13319c = i2;
        this.f13320d = j;
        this.f13321e = j2;
        this.f13322f = z;
        this.f13323g = i3;
        this.f13324h = str2;
        this.f13325i = str3;
    }

    /* renamed from: b */
    public int mo14398b() {
        return this.f13317a;
    }

    /* renamed from: c */
    public int mo14399c() {
        return this.f13319c;
    }

    /* renamed from: d */
    public long mo14400d() {
        return this.f13321e;
    }

    /* renamed from: e */
    public String mo14401e() {
        return this.f13324h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4655a0.C4665e.C4670c)) {
            return false;
        }
        C4655a0.C4665e.C4670c cVar = (C4655a0.C4665e.C4670c) obj;
        return this.f13317a == cVar.mo14398b() && this.f13318b.equals(cVar.mo14402f()) && this.f13319c == cVar.mo14399c() && this.f13320d == cVar.mo14404h() && this.f13321e == cVar.mo14400d() && this.f13322f == cVar.mo14406j() && this.f13323g == cVar.mo14405i() && this.f13324h.equals(cVar.mo14401e()) && this.f13325i.equals(cVar.mo14403g());
    }

    /* renamed from: f */
    public String mo14402f() {
        return this.f13318b;
    }

    /* renamed from: g */
    public String mo14403g() {
        return this.f13325i;
    }

    /* renamed from: h */
    public long mo14404h() {
        return this.f13320d;
    }

    public int hashCode() {
        long j = this.f13320d;
        long j2 = this.f13321e;
        return ((((((((((((((((this.f13317a ^ 1000003) * 1000003) ^ this.f13318b.hashCode()) * 1000003) ^ this.f13319c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f13322f ? 1231 : 1237)) * 1000003) ^ this.f13323g) * 1000003) ^ this.f13324h.hashCode()) * 1000003) ^ this.f13325i.hashCode();
    }

    /* renamed from: i */
    public int mo14405i() {
        return this.f13323g;
    }

    /* renamed from: j */
    public boolean mo14406j() {
        return this.f13322f;
    }

    public String toString() {
        return "Device{arch=" + this.f13317a + ", model=" + this.f13318b + ", cores=" + this.f13319c + ", ram=" + this.f13320d + ", diskSpace=" + this.f13321e + ", simulator=" + this.f13322f + ", state=" + this.f13323g + ", manufacturer=" + this.f13324h + ", modelClass=" + this.f13325i + "}";
    }
}
