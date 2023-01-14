package p174e.p319f.p320a.p335c.p362h;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p174e.p319f.p320a.p335c.p345f.p359n.C8920a;

/* renamed from: e.f.a.c.h.n0 */
final class C8968n0 implements Executor {

    /* renamed from: f */
    private final Handler f24377f = new C8920a(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f24377f.post(runnable);
    }
}
