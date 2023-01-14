package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.b */
class C4302b {

    /* renamed from: a */
    private static C4302b f12183a;

    /* renamed from: b */
    private final Object f12184b = new Object();

    /* renamed from: c */
    private final Handler f12185c = new Handler(Looper.getMainLooper(), new C4303a());

    /* renamed from: d */
    private C4305c f12186d;

    /* renamed from: e */
    private C4305c f12187e;

    /* renamed from: com.google.android.material.snackbar.b$a */
    class C4303a implements Handler.Callback {
        C4303a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C4302b.this.mo13578d((C4305c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.b$b */
    interface C4304b {
        /* renamed from: a */
        void mo13542a();

        /* renamed from: b */
        void mo13543b(int i);
    }

    /* renamed from: com.google.android.material.snackbar.b$c */
    private static class C4305c {

        /* renamed from: a */
        final WeakReference<C4304b> f12189a;

        /* renamed from: b */
        int f12190b;

        /* renamed from: c */
        boolean f12191c;

        C4305c(int i, C4304b bVar) {
            this.f12189a = new WeakReference<>(bVar);
            this.f12190b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo13586a(C4304b bVar) {
            return bVar != null && this.f12189a.get() == bVar;
        }
    }

    private C4302b() {
    }

    /* renamed from: a */
    private boolean m16516a(C4305c cVar, int i) {
        C4304b bVar = (C4304b) cVar.f12189a.get();
        if (bVar == null) {
            return false;
        }
        this.f12185c.removeCallbacksAndMessages(cVar);
        bVar.mo13543b(i);
        return true;
    }

    /* renamed from: c */
    static C4302b m16517c() {
        if (f12183a == null) {
            f12183a = new C4302b();
        }
        return f12183a;
    }

    /* renamed from: f */
    private boolean m16518f(C4304b bVar) {
        C4305c cVar = this.f12186d;
        return cVar != null && cVar.mo13586a(bVar);
    }

    /* renamed from: g */
    private boolean m16519g(C4304b bVar) {
        C4305c cVar = this.f12187e;
        return cVar != null && cVar.mo13586a(bVar);
    }

    /* renamed from: l */
    private void m16520l(C4305c cVar) {
        int i = cVar.f12190b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f12185c.removeCallbacksAndMessages(cVar);
            Handler handler = this.f12185c;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    /* renamed from: n */
    private void m16521n() {
        C4305c cVar = this.f12187e;
        if (cVar != null) {
            this.f12186d = cVar;
            this.f12187e = null;
            C4304b bVar = (C4304b) cVar.f12189a.get();
            if (bVar != null) {
                bVar.mo13542a();
            } else {
                this.f12186d = null;
            }
        }
    }

    /* renamed from: b */
    public void mo13577b(C4304b bVar, int i) {
        C4305c cVar;
        synchronized (this.f12184b) {
            if (m16518f(bVar)) {
                cVar = this.f12186d;
            } else if (m16519g(bVar)) {
                cVar = this.f12187e;
            }
            m16516a(cVar, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo13578d(C4305c cVar) {
        synchronized (this.f12184b) {
            if (this.f12186d == cVar || this.f12187e == cVar) {
                m16516a(cVar, 2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo13579e(C4304b bVar) {
        boolean z;
        synchronized (this.f12184b) {
            if (!m16518f(bVar)) {
                if (!m16519g(bVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public void mo13580h(C4304b bVar) {
        synchronized (this.f12184b) {
            if (m16518f(bVar)) {
                this.f12186d = null;
                if (this.f12187e != null) {
                    m16521n();
                }
            }
        }
    }

    /* renamed from: i */
    public void mo13581i(C4304b bVar) {
        synchronized (this.f12184b) {
            if (m16518f(bVar)) {
                m16520l(this.f12186d);
            }
        }
    }

    /* renamed from: j */
    public void mo13582j(C4304b bVar) {
        synchronized (this.f12184b) {
            if (m16518f(bVar)) {
                C4305c cVar = this.f12186d;
                if (!cVar.f12191c) {
                    cVar.f12191c = true;
                    this.f12185c.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    /* renamed from: k */
    public void mo13583k(C4304b bVar) {
        synchronized (this.f12184b) {
            if (m16518f(bVar)) {
                C4305c cVar = this.f12186d;
                if (cVar.f12191c) {
                    cVar.f12191c = false;
                    m16520l(cVar);
                }
            }
        }
    }

    /* renamed from: m */
    public void mo13584m(int i, C4304b bVar) {
        synchronized (this.f12184b) {
            if (m16518f(bVar)) {
                C4305c cVar = this.f12186d;
                cVar.f12190b = i;
                this.f12185c.removeCallbacksAndMessages(cVar);
                m16520l(this.f12186d);
                return;
            }
            if (m16519g(bVar)) {
                this.f12187e.f12190b = i;
            } else {
                this.f12187e = new C4305c(i, bVar);
            }
            C4305c cVar2 = this.f12186d;
            if (cVar2 == null || !m16516a(cVar2, 4)) {
                this.f12186d = null;
                m16521n();
            }
        }
    }
}
