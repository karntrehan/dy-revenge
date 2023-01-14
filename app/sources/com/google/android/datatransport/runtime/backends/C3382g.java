package com.google.android.datatransport.runtime.backends;

/* renamed from: com.google.android.datatransport.runtime.backends.g */
public abstract class C3382g {

    /* renamed from: com.google.android.datatransport.runtime.backends.g$a */
    public enum C3383a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static C3382g m13253a() {
        return new C3376b(C3383a.FATAL_ERROR, -1);
    }

    /* renamed from: d */
    public static C3382g m13254d() {
        return new C3376b(C3383a.INVALID_PAYLOAD, -1);
    }

    /* renamed from: e */
    public static C3382g m13255e(long j) {
        return new C3376b(C3383a.OK, j);
    }

    /* renamed from: f */
    public static C3382g m13256f() {
        return new C3376b(C3383a.TRANSIENT_ERROR, -1);
    }

    /* renamed from: b */
    public abstract long mo10958b();

    /* renamed from: c */
    public abstract C3383a mo10959c();
}
