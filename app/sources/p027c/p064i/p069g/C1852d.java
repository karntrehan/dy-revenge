package p027c.p064i.p069g;

import android.os.Handler;
import androidx.core.util.C1177h;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: c.i.g.d */
public final class C1852d {

    /* renamed from: c.i.g.d$a */
    private static class C1853a implements Executor {

        /* renamed from: f */
        private final Handler f5489f;

        C1853a(Handler handler) {
            this.f5489f = (Handler) C1177h.m4583e(handler);
        }

        public void execute(Runnable runnable) {
            if (!this.f5489f.post((Runnable) C1177h.m4583e(runnable))) {
                throw new RejectedExecutionException(this.f5489f + " is shutting down");
            }
        }
    }

    /* renamed from: a */
    public static Executor m7866a(Handler handler) {
        return new C1853a(handler);
    }
}
