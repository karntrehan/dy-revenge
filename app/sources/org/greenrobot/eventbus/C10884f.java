package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: org.greenrobot.eventbus.f */
public class C10884f extends Handler implements C10892l {

    /* renamed from: f */
    private final C10891k f28483f = new C10891k();

    /* renamed from: o */
    private final int f28484o;

    /* renamed from: p */
    private final C10878c f28485p;

    /* renamed from: q */
    private boolean f28486q;

    public C10884f(C10878c cVar, Looper looper, int i) {
        super(looper);
        this.f28485p = cVar;
        this.f28484o = i;
    }

    /* renamed from: a */
    public void mo28467a(C10898q qVar, Object obj) {
        C10890j a = C10890j.m37031a(qVar, obj);
        synchronized (this) {
            this.f28483f.mo28488a(a);
            if (!this.f28486q) {
                this.f28486q = true;
                if (!sendMessage(obtainMessage())) {
                    throw new C10883e("Could not send handler message");
                }
            }
        }
    }

    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                C10890j b = this.f28483f.mo28489b();
                if (b == null) {
                    synchronized (this) {
                        b = this.f28483f.mo28489b();
                        if (b == null) {
                            this.f28486q = false;
                            this.f28486q = false;
                            return;
                        }
                    }
                }
                this.f28485p.mo28476g(b);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.f28484o));
            if (sendMessage(obtainMessage())) {
                this.f28486q = true;
                return;
            }
            throw new C10883e("Could not send handler message");
        } catch (Throwable th) {
            this.f28486q = false;
            throw th;
        }
    }
}
