package com.google.firebase.installations.p152m;

import com.google.firebase.installations.p152m.C4847a;
import com.google.firebase.installations.p152m.C4851c;

/* renamed from: com.google.firebase.installations.m.d */
public abstract class C4853d {

    /* renamed from: a */
    public static C4853d f13659a = m18542a().mo14775a();

    /* renamed from: com.google.firebase.installations.m.d$a */
    public static abstract class C4854a {
        /* renamed from: a */
        public abstract C4853d mo14775a();

        /* renamed from: b */
        public abstract C4854a mo14776b(String str);

        /* renamed from: c */
        public abstract C4854a mo14777c(long j);

        /* renamed from: d */
        public abstract C4854a mo14778d(String str);

        /* renamed from: e */
        public abstract C4854a mo14779e(String str);

        /* renamed from: f */
        public abstract C4854a mo14780f(String str);

        /* renamed from: g */
        public abstract C4854a mo14781g(C4851c.C4852a aVar);

        /* renamed from: h */
        public abstract C4854a mo14782h(long j);
    }

    /* renamed from: a */
    public static C4854a m18542a() {
        return new C4847a.C4849b().mo14782h(0).mo14781g(C4851c.C4852a.ATTEMPT_MIGRATION).mo14777c(0);
    }

    /* renamed from: b */
    public abstract String mo14764b();

    /* renamed from: c */
    public abstract long mo14765c();

    /* renamed from: d */
    public abstract String mo14766d();

    /* renamed from: e */
    public abstract String mo14767e();

    /* renamed from: f */
    public abstract String mo14769f();

    /* renamed from: g */
    public abstract C4851c.C4852a mo14770g();

    /* renamed from: h */
    public abstract long mo14771h();

    /* renamed from: i */
    public boolean mo14787i() {
        return mo14770g() == C4851c.C4852a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean mo14788j() {
        return mo14770g() == C4851c.C4852a.NOT_GENERATED || mo14770g() == C4851c.C4852a.ATTEMPT_MIGRATION;
    }

    /* renamed from: k */
    public boolean mo14789k() {
        return mo14770g() == C4851c.C4852a.REGISTERED;
    }

    /* renamed from: l */
    public boolean mo14790l() {
        return mo14770g() == C4851c.C4852a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean mo14791m() {
        return mo14770g() == C4851c.C4852a.ATTEMPT_MIGRATION;
    }

    /* renamed from: n */
    public abstract C4854a mo14773n();

    /* renamed from: o */
    public C4853d mo14792o(String str, long j, long j2) {
        return mo14773n().mo14776b(str).mo14777c(j).mo14782h(j2).mo14775a();
    }

    /* renamed from: p */
    public C4853d mo14793p() {
        return mo14773n().mo14776b((String) null).mo14775a();
    }

    /* renamed from: q */
    public C4853d mo14794q(String str) {
        return mo14773n().mo14779e(str).mo14781g(C4851c.C4852a.REGISTER_ERROR).mo14775a();
    }

    /* renamed from: r */
    public C4853d mo14795r() {
        return mo14773n().mo14781g(C4851c.C4852a.NOT_GENERATED).mo14775a();
    }

    /* renamed from: s */
    public C4853d mo14796s(String str, String str2, long j, String str3, long j2) {
        return mo14773n().mo14778d(str).mo14781g(C4851c.C4852a.REGISTERED).mo14776b(str3).mo14780f(str2).mo14777c(j2).mo14782h(j).mo14775a();
    }

    /* renamed from: t */
    public C4853d mo14797t(String str) {
        return mo14773n().mo14778d(str).mo14781g(C4851c.C4852a.UNREGISTERED).mo14775a();
    }
}
