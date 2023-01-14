package p174e.p319f.p320a.p322b.p323i;

import java.util.concurrent.Executor;
import p174e.p319f.p320a.p322b.p323i.p333y.C6610a;

/* renamed from: e.f.a.b.i.n */
class C6579n implements Executor {

    /* renamed from: f */
    private final Executor f18198f;

    /* renamed from: e.f.a.b.i.n$a */
    static class C6580a implements Runnable {

        /* renamed from: f */
        private final Runnable f18199f;

        C6580a(Runnable runnable) {
            this.f18199f = runnable;
        }

        public void run() {
            try {
                this.f18199f.run();
            } catch (Exception e) {
                C6610a.m25244d("Executor", "Background execution failure.", e);
            }
        }
    }

    C6579n(Executor executor) {
        this.f18198f = executor;
    }

    public void execute(Runnable runnable) {
        this.f18198f.execute(new C6580a(runnable));
    }
}
