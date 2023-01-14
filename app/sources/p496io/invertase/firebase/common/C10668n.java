package p496io.invertase.firebase.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;

/* renamed from: io.invertase.firebase.common.n */
public class C10668n {

    /* renamed from: a */
    private static final Map<String, ExecutorService> f28146a = new HashMap();

    /* renamed from: b */
    private final String f28147b;

    /* renamed from: c */
    private final int f28148c;

    /* renamed from: d */
    private final int f28149d;

    /* renamed from: e */
    private final RejectedExecutionHandler f28150e = new C10659e(this);

    C10668n(String str) {
        this.f28147b = str;
        C10664j f = C10664j.m36298f();
        this.f28148c = f.mo26562d("android_task_executor_maximum_pool_size", 1);
        this.f28149d = f.mo26562d("android_task_executor_keep_alive_seconds", 3);
    }

    /* renamed from: d */
    private ExecutorService m36323d(boolean z) {
        if (z) {
            return Executors.newSingleThreadExecutor();
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, this.f28148c, (long) this.f28149d, TimeUnit.SECONDS, new SynchronousQueue());
        threadPoolExecutor.setRejectedExecutionHandler(this.f28150e);
        return threadPoolExecutor;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void mo26577h(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (!threadPoolExecutor.isShutdown() && !threadPoolExecutor.isTerminated() && !threadPoolExecutor.isTerminating()) {
            mo26575e().execute(runnable);
        }
    }

    /* renamed from: a */
    public ExecutorService mo26572a() {
        boolean z = true;
        if (this.f28148c > 1) {
            z = false;
        }
        return mo26573b(z, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: b */
    public ExecutorService mo26573b(boolean z, String str) {
        String c = mo26574c(z, str);
        Map<String, ExecutorService> map = f28146a;
        synchronized (map) {
            ExecutorService executorService = map.get(c);
            if (executorService != null) {
                return executorService;
            }
            ExecutorService d = m36323d(z);
            map.put(c, d);
            return d;
        }
    }

    /* renamed from: c */
    public String mo26574c(boolean z, String str) {
        StringBuilder sb;
        String str2;
        if (z) {
            sb = new StringBuilder();
            sb.append(this.f28147b);
            str2 = "TransactionalExecutor";
        } else {
            sb = new StringBuilder();
            sb.append(this.f28147b);
            str2 = "Executor";
        }
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: e */
    public ExecutorService mo26575e() {
        return mo26573b(true, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: f */
    public ExecutorService mo26576f(String str) {
        if (this.f28148c == 0) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return mo26573b(true, str);
    }

    /* renamed from: i */
    public void mo26578i(String str) {
        Map<String, ExecutorService> map = f28146a;
        synchronized (map) {
            ExecutorService executorService = map.get(str);
            if (executorService != null) {
                executorService.shutdownNow();
                map.remove(str);
            }
        }
    }

    /* renamed from: j */
    public void mo26579j() {
        Map<String, ExecutorService> map = f28146a;
        synchronized (map) {
            for (String str : new ArrayList(map.keySet())) {
                if (!str.startsWith(this.f28147b)) {
                    f28146a.remove(str);
                } else {
                    mo26578i(str);
                }
            }
        }
    }
}
