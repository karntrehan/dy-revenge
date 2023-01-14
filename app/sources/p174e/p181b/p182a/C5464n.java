package p174e.p181b.p182a;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import p174e.p181b.p182a.p195z.C5643d;

/* renamed from: e.b.a.n */
public class C5464n<T> {

    /* renamed from: a */
    public static Executor f15312a = Executors.newCachedThreadPool();

    /* renamed from: b */
    private final Set<C5459i<T>> f15313b;

    /* renamed from: c */
    private final Set<C5459i<Throwable>> f15314c;

    /* renamed from: d */
    private final Handler f15315d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile C5463m<T> f15316e;

    /* renamed from: e.b.a.n$a */
    class C5465a implements Runnable {
        C5465a() {
        }

        public void run() {
            if (C5464n.this.f15316e != null) {
                C5463m a = C5464n.this.f15316e;
                if (a.mo16572b() != null) {
                    C5464n.this.m20371i(a.mo16572b());
                } else {
                    C5464n.this.m20369g(a.mo16571a());
                }
            }
        }
    }

    /* renamed from: e.b.a.n$b */
    private class C5466b extends FutureTask<C5463m<T>> {
        C5466b(Callable<C5463m<T>> callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            if (!isCancelled()) {
                try {
                    C5464n.this.m20372l((C5463m) get());
                } catch (InterruptedException | ExecutionException e) {
                    C5464n.this.m20372l(new C5463m(e));
                }
            }
        }
    }

    public C5464n(Callable<C5463m<T>> callable) {
        this(callable, false);
    }

    C5464n(Callable<C5463m<T>> callable, boolean z) {
        this.f15313b = new LinkedHashSet(1);
        this.f15314c = new LinkedHashSet(1);
        this.f15315d = new Handler(Looper.getMainLooper());
        this.f15316e = null;
        if (z) {
            try {
                m20372l(callable.call());
            } catch (Throwable th) {
                m20372l(new C5463m(th));
            }
        } else {
            f15312a.execute(new C5466b(callable));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public synchronized void m20369g(Throwable th) {
        ArrayList<C5459i> arrayList = new ArrayList<>(this.f15314c);
        if (arrayList.isEmpty()) {
            C5643d.m21028d("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        for (C5459i a : arrayList) {
            a.mo16442a(th);
        }
    }

    /* renamed from: h */
    private void m20370h() {
        this.f15315d.post(new C5465a());
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public synchronized void m20371i(T t) {
        for (C5459i a : new ArrayList(this.f15313b)) {
            a.mo16442a(t);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m20372l(C5463m<T> mVar) {
        if (this.f15316e == null) {
            this.f15316e = mVar;
            m20370h();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: e */
    public synchronized C5464n<T> mo16575e(C5459i<Throwable> iVar) {
        if (!(this.f15316e == null || this.f15316e.mo16571a() == null)) {
            iVar.mo16442a(this.f15316e.mo16571a());
        }
        this.f15314c.add(iVar);
        return this;
    }

    /* renamed from: f */
    public synchronized C5464n<T> mo16576f(C5459i<T> iVar) {
        if (!(this.f15316e == null || this.f15316e.mo16572b() == null)) {
            iVar.mo16442a(this.f15316e.mo16572b());
        }
        this.f15313b.add(iVar);
        return this;
    }

    /* renamed from: j */
    public synchronized C5464n<T> mo16577j(C5459i<Throwable> iVar) {
        this.f15314c.remove(iVar);
        return this;
    }

    /* renamed from: k */
    public synchronized C5464n<T> mo16578k(C5459i<T> iVar) {
        this.f15313b.remove(iVar);
        return this;
    }
}
