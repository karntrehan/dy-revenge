package p027c.p036b.p037a.p038a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: c.b.a.a.b */
public class C1482b extends C1484c {

    /* renamed from: a */
    private final Object f4632a = new Object();

    /* renamed from: b */
    private final ExecutorService f4633b = Executors.newFixedThreadPool(4, new C1483a());

    /* renamed from: c */
    private volatile Handler f4634c;

    /* renamed from: c.b.a.a.b$a */
    class C1483a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f4635a = new AtomicInteger(0);

        C1483a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f4635a.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: d */
    private static Handler m6617d(Looper looper) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Handler.createAsync(looper);
        }
        if (i >= 16) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    /* renamed from: a */
    public void mo5514a(Runnable runnable) {
        this.f4633b.execute(runnable);
    }

    /* renamed from: b */
    public boolean mo5515b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: c */
    public void mo5516c(Runnable runnable) {
        if (this.f4634c == null) {
            synchronized (this.f4632a) {
                if (this.f4634c == null) {
                    this.f4634c = m6617d(Looper.getMainLooper());
                }
            }
        }
        this.f4634c.post(runnable);
    }
}
