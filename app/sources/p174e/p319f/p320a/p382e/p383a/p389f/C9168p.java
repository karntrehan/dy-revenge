package p174e.p319f.p320a.p382e.p383a.p389f;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: e.f.a.e.a.f.p */
final class C9168p implements Executor {

    /* renamed from: f */
    private final Handler f25050f = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f25050f.post(runnable);
    }
}
