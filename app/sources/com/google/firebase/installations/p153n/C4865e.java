package com.google.firebase.installations.p153n;

import com.google.firebase.installations.C4845k;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.installations.n.e */
class C4865e {

    /* renamed from: a */
    private static final long f13684a = TimeUnit.HOURS.toMillis(24);

    /* renamed from: b */
    private static final long f13685b = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: c */
    private final C4845k f13686c = C4845k.m18504c();

    /* renamed from: d */
    private long f13687d;

    /* renamed from: e */
    private int f13688e;

    C4865e() {
    }

    /* renamed from: a */
    private synchronized long m18619a(int i) {
        if (!m18620c(i)) {
            return f13684a;
        }
        return (long) Math.min(Math.pow(2.0d, (double) this.f13688e) + ((double) this.f13686c.mo14761e()), (double) f13685b);
    }

    /* renamed from: c */
    private static boolean m18620c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    /* renamed from: d */
    private static boolean m18621d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    /* renamed from: e */
    private synchronized void m18622e() {
        this.f13688e = 0;
    }

    /* renamed from: b */
    public synchronized boolean mo14824b() {
        return this.f13688e == 0 || this.f13686c.mo14759a() > this.f13687d;
    }

    /* renamed from: f */
    public synchronized void mo14825f(int i) {
        if (m18621d(i)) {
            m18622e();
            return;
        }
        this.f13688e++;
        this.f13687d = this.f13686c.mo14759a() + m18619a(i);
    }
}
