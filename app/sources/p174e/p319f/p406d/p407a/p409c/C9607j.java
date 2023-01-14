package p174e.p319f.p406d.p407a.p409c;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3705r;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p174e.p319f.p320a.p335c.p345f.p353h.C7138m;

/* renamed from: e.f.d.a.c.j */
public class C9607j extends C7138m {

    /* renamed from: f */
    private static final ThreadLocal<Deque<Runnable>> f25699f = new ThreadLocal<>();

    /* renamed from: o */
    private final ThreadPoolExecutor f25700o;

    public C9607j() {
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C9623y(defaultThreadFactory));
        this.f25700o = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* renamed from: d */
    static /* synthetic */ void m32714d(Runnable runnable) {
        f25699f.set(new ArrayDeque());
        runnable.run();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m32715e(Deque<Runnable> deque, Runnable runnable) {
        C3705r.m14346k(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = deque.peekFirst();
            } while (runnable != null);
        }
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20494a() {
        return this.f25700o;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: b */
    public final ExecutorService mo20533b() {
        return this.f25700o;
    }

    public final void execute(@RecentlyNonNull Runnable runnable) {
        Deque deque = f25699f.get();
        if (deque == null || deque.size() > 1) {
            this.f25700o.execute(new C9621w(runnable));
        } else {
            m32715e(deque, runnable);
        }
    }
}
