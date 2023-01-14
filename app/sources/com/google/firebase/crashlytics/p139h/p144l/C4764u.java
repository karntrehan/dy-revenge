package com.google.firebase.crashlytics.p139h.p144l;

import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: com.google.firebase.crashlytics.h.l.u */
final class C4764u extends C4655a0.C4665e.C4692e {

    /* renamed from: a */
    private final int f13419a;

    /* renamed from: b */
    private final String f13420b;

    /* renamed from: c */
    private final String f13421c;

    /* renamed from: d */
    private final boolean f13422d;

    /* renamed from: com.google.firebase.crashlytics.h.l.u$b */
    static final class C4766b extends C4655a0.C4665e.C4692e.C4693a {

        /* renamed from: a */
        private Integer f13423a;

        /* renamed from: b */
        private String f13424b;

        /* renamed from: c */
        private String f13425c;

        /* renamed from: d */
        private Boolean f13426d;

        C4766b() {
        }

        /* renamed from: a */
        public C4655a0.C4665e.C4692e mo14519a() {
            Integer num = this.f13423a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (num == null) {
                str = str + " platform";
            }
            if (this.f13424b == null) {
                str = str + " version";
            }
            if (this.f13425c == null) {
                str = str + " buildVersion";
            }
            if (this.f13426d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new C4764u(this.f13423a.intValue(), this.f13424b, this.f13425c, this.f13426d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C4655a0.C4665e.C4692e.C4693a mo14520b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f13425c = str;
            return this;
        }

        /* renamed from: c */
        public C4655a0.C4665e.C4692e.C4693a mo14521c(boolean z) {
            this.f13426d = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public C4655a0.C4665e.C4692e.C4693a mo14522d(int i) {
            this.f13423a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: e */
        public C4655a0.C4665e.C4692e.C4693a mo14523e(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f13424b = str;
            return this;
        }
    }

    private C4764u(int i, String str, String str2, boolean z) {
        this.f13419a = i;
        this.f13420b = str;
        this.f13421c = str2;
        this.f13422d = z;
    }

    /* renamed from: b */
    public String mo14515b() {
        return this.f13421c;
    }

    /* renamed from: c */
    public int mo14516c() {
        return this.f13419a;
    }

    /* renamed from: d */
    public String mo14517d() {
        return this.f13420b;
    }

    /* renamed from: e */
    public boolean mo14518e() {
        return this.f13422d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4655a0.C4665e.C4692e)) {
            return false;
        }
        C4655a0.C4665e.C4692e eVar = (C4655a0.C4665e.C4692e) obj;
        return this.f13419a == eVar.mo14516c() && this.f13420b.equals(eVar.mo14517d()) && this.f13421c.equals(eVar.mo14515b()) && this.f13422d == eVar.mo14518e();
    }

    public int hashCode() {
        return ((((((this.f13419a ^ 1000003) * 1000003) ^ this.f13420b.hashCode()) * 1000003) ^ this.f13421c.hashCode()) * 1000003) ^ (this.f13422d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f13419a + ", version=" + this.f13420b + ", buildVersion=" + this.f13421c + ", jailbroken=" + this.f13422d + "}";
    }
}
