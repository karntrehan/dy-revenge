package p027c.p092r.p094b;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: c.r.b.c */
abstract class C2080c<Params, Progress, Result> {

    /* renamed from: f */
    private static final ThreadFactory f6060f;

    /* renamed from: o */
    private static final BlockingQueue<Runnable> f6061o;

    /* renamed from: p */
    public static final Executor f6062p;

    /* renamed from: q */
    private static C2086f f6063q;

    /* renamed from: r */
    private static volatile Executor f6064r;

    /* renamed from: s */
    private final C2088h<Params, Result> f6065s;

    /* renamed from: t */
    private final FutureTask<Result> f6066t;

    /* renamed from: u */
    private volatile C2087g f6067u = C2087g.PENDING;

    /* renamed from: v */
    final AtomicBoolean f6068v = new AtomicBoolean();

    /* renamed from: w */
    final AtomicBoolean f6069w = new AtomicBoolean();

    /* renamed from: c.r.b.c$a */
    static class C2081a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f6070a = new AtomicInteger(1);

        C2081a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f6070a.getAndIncrement());
        }
    }

    /* renamed from: c.r.b.c$b */
    class C2082b extends C2088h<Params, Result> {
        C2082b() {
        }

        public Result call() {
            C2080c.this.f6069w.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = C2080c.this.mo6983b(this.f6080a);
                Binder.flushPendingCommands();
                C2080c.this.mo7016l(result);
                return result;
            } catch (Throwable th) {
                C2080c.this.mo7016l(result);
                throw th;
            }
        }
    }

    /* renamed from: c.r.b.c$c */
    class C2083c extends FutureTask<Result> {
        C2083c(Callable callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            try {
                C2080c.this.mo7017m(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                C2080c.this.mo7017m(null);
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: c.r.b.c$d */
    static /* synthetic */ class C2084d {

        /* renamed from: a */
        static final /* synthetic */ int[] f6073a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                c.r.b.c$g[] r0 = p027c.p092r.p094b.C2080c.C2087g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6073a = r0
                c.r.b.c$g r1 = p027c.p092r.p094b.C2080c.C2087g.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6073a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.r.b.c$g r1 = p027c.p092r.p094b.C2080c.C2087g.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p027c.p092r.p094b.C2080c.C2084d.<clinit>():void");
        }
    }

    /* renamed from: c.r.b.c$e */
    private static class C2085e<Data> {

        /* renamed from: a */
        final C2080c f6074a;

        /* renamed from: b */
        final Data[] f6075b;

        C2085e(C2080c cVar, Data... dataArr) {
            this.f6074a = cVar;
            this.f6075b = dataArr;
        }
    }

    /* renamed from: c.r.b.c$f */
    private static class C2086f extends Handler {
        C2086f() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C2085e eVar = (C2085e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.f6074a.mo7011d(eVar.f6075b[0]);
            } else if (i == 2) {
                eVar.f6074a.mo7015k(eVar.f6075b);
            }
        }
    }

    /* renamed from: c.r.b.c$g */
    public enum C2087g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: c.r.b.c$h */
    private static abstract class C2088h<Params, Result> implements Callable<Result> {

        /* renamed from: a */
        Params[] f6080a;

        C2088h() {
        }
    }

    static {
        C2081a aVar = new C2081a();
        f6060f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f6061o = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f6062p = threadPoolExecutor;
        f6064r = threadPoolExecutor;
    }

    C2080c() {
        C2082b bVar = new C2082b();
        this.f6065s = bVar;
        this.f6066t = new C2083c(bVar);
    }

    /* renamed from: e */
    private static Handler m8951e() {
        C2086f fVar;
        synchronized (C2080c.class) {
            if (f6063q == null) {
                f6063q = new C2086f();
            }
            fVar = f6063q;
        }
        return fVar;
    }

    /* renamed from: a */
    public final boolean mo7009a(boolean z) {
        this.f6068v.set(true);
        return this.f6066t.cancel(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Result mo6983b(Params... paramsArr);

    /* renamed from: c */
    public final C2080c<Params, Progress, Result> mo7010c(Executor executor, Params... paramsArr) {
        if (this.f6067u != C2087g.PENDING) {
            int i = C2084d.f6073a[this.f6067u.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f6067u = C2087g.RUNNING;
            mo7014j();
            this.f6065s.f6080a = paramsArr;
            executor.execute(this.f6066t);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo7011d(Result result) {
        if (mo7012f()) {
            mo6984h(result);
        } else {
            mo6985i(result);
        }
        this.f6067u = C2087g.FINISHED;
    }

    /* renamed from: f */
    public final boolean mo7012f() {
        return this.f6068v.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo7013g() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo6984h(Result result) {
        mo7013g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo6985i(Result result) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo7014j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo7015k(Progress... progressArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Result mo7016l(Result result) {
        m8951e().obtainMessage(1, new C2085e(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo7017m(Result result) {
        if (!this.f6069w.get()) {
            mo7016l(result);
        }
    }
}
