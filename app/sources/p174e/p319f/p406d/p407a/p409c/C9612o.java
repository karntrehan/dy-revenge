package p174e.p319f.p406d.p407a.p409c;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: e.f.d.a.c.o */
public class C9612o {

    /* renamed from: a */
    private final Object f25713a = new Object();

    /* renamed from: b */
    private boolean f25714b;

    /* renamed from: c */
    private final Queue<C9602f0> f25715c = new ArrayDeque();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final AtomicReference<Thread> f25716d = new AtomicReference<>();

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m32731d() {
        synchronized (this.f25713a) {
            if (this.f25715c.isEmpty()) {
                this.f25714b = false;
                return;
            }
            C9602f0 remove = this.f25715c.remove();
            m32732e(remove.f25691a, remove.f25692b);
        }
    }

    /* renamed from: e */
    private final void m32732e(Executor executor, Runnable runnable) {
        try {
            executor.execute(new C9598d0(this, runnable));
        } catch (RejectedExecutionException unused) {
            m32731d();
        }
    }

    /* renamed from: a */
    public void mo24106a(@RecentlyNonNull Executor executor, @RecentlyNonNull Runnable runnable) {
        synchronized (this.f25713a) {
            if (this.f25714b) {
                this.f25715c.add(new C9602f0(executor, runnable, (C9600e0) null));
                return;
            }
            this.f25714b = true;
            m32732e(executor, runnable);
        }
    }
}
