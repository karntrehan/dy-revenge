package com.th3rdwave.safeareacontext;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p455g.p470y.p472d.C10464s;

/* renamed from: com.th3rdwave.safeareacontext.c */
public final /* synthetic */ class C10105c implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ ReentrantLock f26934f;

    /* renamed from: o */
    public final /* synthetic */ C10464s f26935o;

    /* renamed from: p */
    public final /* synthetic */ Condition f26936p;

    public /* synthetic */ C10105c(ReentrantLock reentrantLock, C10464s sVar, Condition condition) {
        this.f26934f = reentrantLock;
        this.f26935o = sVar;
        this.f26936p = condition;
    }

    public final void run() {
        C10115l.m34225K(this.f26934f, this.f26935o, this.f26936p);
    }
}
