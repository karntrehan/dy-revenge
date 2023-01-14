package p174e.p247e.p253d.p255b;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: e.e.d.b.a */
public class C6036a extends AbstractExecutorService {

    /* renamed from: f */
    private static final C6036a f16688f = new C6036a();

    private C6036a() {
    }

    /* renamed from: a */
    public static C6036a m22791a() {
        return f16688f;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return true;
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
    }

    public List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }
}
