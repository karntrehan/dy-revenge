package p174e.p319f.p390b.p391a.p392a;

import java.util.concurrent.Executor;

/* renamed from: e.f.b.a.a.a */
enum C9171a implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
