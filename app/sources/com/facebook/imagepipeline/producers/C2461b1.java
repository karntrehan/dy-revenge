package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: com.facebook.imagepipeline.producers.b1 */
public class C2461b1<T> implements C2529o0<T> {

    /* renamed from: a */
    private final C2529o0<T> f7269a;

    /* renamed from: b */
    private final int f7270b;

    /* renamed from: c */
    private int f7271c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ConcurrentLinkedQueue<Pair<C2505l<T>, C2531p0>> f7272d = new ConcurrentLinkedQueue<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Executor f7273e;

    /* renamed from: com.facebook.imagepipeline.producers.b1$b */
    private class C2463b extends C2530p<T, T> {

        /* renamed from: com.facebook.imagepipeline.producers.b1$b$a */
        class C2464a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Pair f7275f;

            C2464a(Pair pair) {
                this.f7275f = pair;
            }

            public void run() {
                C2461b1 b1Var = C2461b1.this;
                Pair pair = this.f7275f;
                b1Var.mo8230f((C2505l) pair.first, (C2531p0) pair.second);
            }
        }

        private C2463b(C2505l<T> lVar) {
            super(lVar);
        }

        /* renamed from: q */
        private void m10234q() {
            Pair pair;
            synchronized (C2461b1.this) {
                pair = (Pair) C2461b1.this.f7272d.poll();
                if (pair == null) {
                    C2461b1.m10230d(C2461b1.this);
                }
            }
            if (pair != null) {
                C2461b1.this.f7273e.execute(new C2464a(pair));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo8224g() {
            mo8320p().mo8220a();
            m10234q();
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo8225h(Throwable th) {
            mo8320p().mo8221b(th);
            m10234q();
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo8209i(T t, int i) {
            mo8320p().mo8223d(t, i);
            if (C2459b.m10210e(i)) {
                m10234q();
            }
        }
    }

    public C2461b1(int i, Executor executor, C2529o0<T> o0Var) {
        this.f7270b = i;
        this.f7273e = (Executor) C6062k.m22839g(executor);
        this.f7269a = (C2529o0) C6062k.m22839g(o0Var);
    }

    /* renamed from: d */
    static /* synthetic */ int m10230d(C2461b1 b1Var) {
        int i = b1Var.f7271c;
        b1Var.f7271c = i - 1;
        return i;
    }

    /* renamed from: b */
    public void mo8198b(C2505l<T> lVar, C2531p0 p0Var) {
        boolean z;
        p0Var.mo8250p().mo8326e(p0Var, "ThrottlingProducer");
        synchronized (this) {
            int i = this.f7271c;
            z = true;
            if (i >= this.f7270b) {
                this.f7272d.add(Pair.create(lVar, p0Var));
            } else {
                this.f7271c = i + 1;
                z = false;
            }
        }
        if (!z) {
            mo8230f(lVar, p0Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo8230f(C2505l<T> lVar, C2531p0 p0Var) {
        p0Var.mo8250p().mo8328j(p0Var, "ThrottlingProducer", (Map<String, String>) null);
        this.f7269a.mo8198b(new C2463b(lVar), p0Var);
    }
}
