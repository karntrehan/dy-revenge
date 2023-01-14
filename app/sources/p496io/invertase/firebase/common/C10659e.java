package p496io.invertase.firebase.common;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: io.invertase.firebase.common.e */
public final /* synthetic */ class C10659e implements RejectedExecutionHandler {

    /* renamed from: a */
    public final /* synthetic */ C10668n f28131a;

    public /* synthetic */ C10659e(C10668n nVar) {
        this.f28131a = nVar;
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        this.f28131a.mo26577h(runnable, threadPoolExecutor);
    }
}
