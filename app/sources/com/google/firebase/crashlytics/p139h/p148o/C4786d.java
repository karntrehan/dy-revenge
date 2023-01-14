package com.google.firebase.crashlytics.p139h.p148o;

import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.p142j.C4564f0;
import com.google.firebase.crashlytics.p139h.p142j.C4603t;
import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import com.google.firebase.crashlytics.p139h.p149p.C4792d;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p174e.p319f.p320a.p322b.C6464c;
import p174e.p319f.p320a.p322b.C6467f;
import p174e.p319f.p320a.p335c.p362h.C8965m;

/* renamed from: com.google.firebase.crashlytics.h.o.d */
final class C4786d {

    /* renamed from: a */
    private final double f13482a;

    /* renamed from: b */
    private final double f13483b;

    /* renamed from: c */
    private final long f13484c;

    /* renamed from: d */
    private final int f13485d;

    /* renamed from: e */
    private final BlockingQueue<Runnable> f13486e;

    /* renamed from: f */
    private final ThreadPoolExecutor f13487f;

    /* renamed from: g */
    private final C6467f<C4655a0> f13488g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C4564f0 f13489h;

    /* renamed from: i */
    private int f13490i;

    /* renamed from: j */
    private long f13491j;

    /* renamed from: com.google.firebase.crashlytics.h.o.d$b */
    private final class C4788b implements Runnable {

        /* renamed from: f */
        private final C4603t f13492f;

        /* renamed from: o */
        private final C8965m<C4603t> f13493o;

        private C4788b(C4603t tVar, C8965m<C4603t> mVar) {
            this.f13492f = tVar;
            this.f13493o = mVar;
        }

        public void run() {
            C4786d.this.m18316l(this.f13492f, this.f13493o);
            C4786d.this.f13489h.mo14130c();
            double c = C4786d.this.m18310e();
            C4542f f = C4542f.m17259f();
            f.mo14104b("Delay for: " + String.format(Locale.US, "%.2f", new Object[]{Double.valueOf(c / 1000.0d)}) + " s for report: " + this.f13492f.mo14145d());
            C4786d.m18317m(c);
        }
    }

    C4786d(double d, double d2, long j, C6467f<C4655a0> fVar, C4564f0 f0Var) {
        this.f13482a = d;
        this.f13483b = d2;
        this.f13484c = j;
        this.f13488g = fVar;
        this.f13489h = f0Var;
        int i = (int) d;
        this.f13485d = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f13486e = arrayBlockingQueue;
        this.f13487f = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f13490i = 0;
        this.f13491j = 0;
    }

    C4786d(C6467f<C4655a0> fVar, C4792d dVar, C4564f0 f0Var) {
        this(dVar.f13504f, dVar.f13505g, ((long) dVar.f13506h) * 1000, fVar, f0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public double m18310e() {
        return Math.min(3600000.0d, (60000.0d / this.f13482a) * Math.pow(this.f13483b, (double) m18311f()));
    }

    /* renamed from: f */
    private int m18311f() {
        if (this.f13491j == 0) {
            this.f13491j = m18315k();
        }
        int k = (int) ((m18315k() - this.f13491j) / this.f13484c);
        int min = m18313i() ? Math.min(100, this.f13490i + k) : Math.max(0, this.f13490i - k);
        if (this.f13490i != min) {
            this.f13490i = min;
            this.f13491j = m18315k();
        }
        return min;
    }

    /* renamed from: h */
    private boolean m18312h() {
        return this.f13486e.size() < this.f13485d;
    }

    /* renamed from: i */
    private boolean m18313i() {
        return this.f13486e.size() == this.f13485d;
    }

    /* renamed from: j */
    static /* synthetic */ void m18314j(C8965m mVar, C4603t tVar, Exception exc) {
        if (exc != null) {
            mVar.mo22785d(exc);
        } else {
            mVar.mo22786e(tVar);
        }
    }

    /* renamed from: k */
    private long m18315k() {
        return System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m18316l(C4603t tVar, C8965m<C4603t> mVar) {
        C4542f f = C4542f.m17259f();
        f.mo14104b("Sending report through Google DataTransport: " + tVar.mo14145d());
        this.f13488g.mo19244b(C6464c.m24867f(tVar.mo14143b()), new C4784b(mVar, tVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static void m18317m(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C8965m<C4603t> mo14688g(C4603t tVar, boolean z) {
        synchronized (this.f13486e) {
            C8965m<C4603t> mVar = new C8965m<>();
            if (z) {
                this.f13489h.mo14129b();
                if (m18312h()) {
                    C4542f f = C4542f.m17259f();
                    f.mo14104b("Enqueueing report: " + tVar.mo14145d());
                    C4542f f2 = C4542f.m17259f();
                    f2.mo14104b("Queue size: " + this.f13486e.size());
                    this.f13487f.execute(new C4788b(tVar, mVar));
                    C4542f f3 = C4542f.m17259f();
                    f3.mo14104b("Closing task for report: " + tVar.mo14145d());
                    mVar.mo22786e(tVar);
                    return mVar;
                }
                m18311f();
                C4542f f4 = C4542f.m17259f();
                f4.mo14104b("Dropping report due to queue being full: " + tVar.mo14145d());
                this.f13489h.mo14128a();
                mVar.mo22786e(tVar);
                return mVar;
            }
            m18316l(tVar, mVar);
            return mVar;
        }
    }
}
