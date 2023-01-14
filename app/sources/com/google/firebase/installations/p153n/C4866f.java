package com.google.firebase.installations.p153n;

import com.google.firebase.installations.p153n.C4858b;

/* renamed from: com.google.firebase.installations.n.f */
public abstract class C4866f {

    /* renamed from: com.google.firebase.installations.n.f$a */
    public static abstract class C4867a {
        /* renamed from: a */
        public abstract C4866f mo14818a();

        /* renamed from: b */
        public abstract C4867a mo14819b(C4868b bVar);

        /* renamed from: c */
        public abstract C4867a mo14820c(String str);

        /* renamed from: d */
        public abstract C4867a mo14821d(long j);
    }

    /* renamed from: com.google.firebase.installations.n.f$b */
    public enum C4868b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* renamed from: a */
    public static C4867a m18625a() {
        return new C4858b.C4860b().mo14821d(0);
    }

    /* renamed from: b */
    public abstract C4868b mo14812b();

    /* renamed from: c */
    public abstract String mo14813c();

    /* renamed from: d */
    public abstract long mo14814d();
}
