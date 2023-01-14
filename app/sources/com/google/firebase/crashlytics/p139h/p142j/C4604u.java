package com.google.firebase.crashlytics.p139h.p142j;

import com.google.firebase.crashlytics.p139h.C4535c;
import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.p149p.C4800i;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.firebase.crashlytics.h.j.u */
class C4604u implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final C4605a f13032a;

    /* renamed from: b */
    private final C4800i f13033b;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f13034c;

    /* renamed from: d */
    private final C4535c f13035d;

    /* renamed from: e */
    private final AtomicBoolean f13036e = new AtomicBoolean(false);

    /* renamed from: com.google.firebase.crashlytics.h.j.u$a */
    interface C4605a {
        /* renamed from: a */
        void mo14182a(C4800i iVar, Thread thread, Throwable th);
    }

    public C4604u(C4605a aVar, C4800i iVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C4535c cVar) {
        this.f13032a = aVar;
        this.f13033b = iVar;
        this.f13034c = uncaughtExceptionHandler;
        this.f13035d = cVar;
    }

    /* renamed from: b */
    private boolean m17531b(Thread thread, Throwable th) {
        if (thread == null) {
            C4542f.m17259f().mo14106d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            C4542f.m17259f().mo14106d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (!this.f13035d.mo14092b()) {
            return true;
        } else {
            C4542f.m17259f().mo14104b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo14226a() {
        return this.f13036e.get();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.f13036e.set(true);
        try {
            if (m17531b(thread, th)) {
                this.f13032a.mo14182a(this.f13033b, thread, th);
            } else {
                C4542f.m17259f().mo14104b("Uncaught exception will not be recorded by Crashlytics.");
            }
        } catch (Exception e) {
            C4542f.m17259f().mo14107e("An error occurred in the uncaught exception handler", e);
        } catch (Throwable th2) {
            C4542f.m17259f().mo14104b("Completed exception processing. Invoking default exception handler.");
            this.f13034c.uncaughtException(thread, th);
            this.f13036e.set(false);
            throw th2;
        }
        C4542f.m17259f().mo14104b("Completed exception processing. Invoking default exception handler.");
        this.f13034c.uncaughtException(thread, th);
        this.f13036e.set(false);
    }
}
