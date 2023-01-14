package com.google.firebase.crashlytics.p139h.p150q;

/* renamed from: com.google.firebase.crashlytics.h.q.e */
public class C4808e {

    /* renamed from: a */
    public final String f13540a;

    /* renamed from: b */
    public final String f13541b;

    /* renamed from: c */
    public final StackTraceElement[] f13542c;

    /* renamed from: d */
    public final C4808e f13543d;

    public C4808e(Throwable th, C4807d dVar) {
        this.f13540a = th.getLocalizedMessage();
        this.f13541b = th.getClass().getName();
        this.f13542c = dVar.mo14705a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f13543d = cause != null ? new C4808e(cause, dVar) : null;
    }
}
