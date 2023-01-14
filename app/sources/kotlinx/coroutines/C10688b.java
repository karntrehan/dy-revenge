package kotlinx.coroutines;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: kotlinx.coroutines.b */
public final /* synthetic */ class C10688b implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ AtomicInteger f28177a;

    public /* synthetic */ C10688b(AtomicInteger atomicInteger) {
        this.f28177a = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        return C10839v.m36906x0(this.f28177a, runnable);
    }
}
