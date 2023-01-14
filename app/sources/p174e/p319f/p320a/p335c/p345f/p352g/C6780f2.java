package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: e.f.a.c.f.g.f2 */
final class C6780f2 implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f18478a = Executors.defaultThreadFactory();

    C6780f2(C7037v2 v2Var) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f18478a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
