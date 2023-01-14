package p173d;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: d.b */
final class C5362b {

    /* renamed from: a */
    private static final C5362b f14994a = new C5362b();

    /* renamed from: b */
    private final ExecutorService f14995b;

    /* renamed from: c */
    private final ScheduledExecutorService f14996c;

    /* renamed from: d */
    private final Executor f14997d;

    /* renamed from: d.b$b */
    private static class C5364b implements Executor {

        /* renamed from: f */
        private ThreadLocal<Integer> f14998f;

        private C5364b() {
            this.f14998f = new ThreadLocal<>();
        }

        /* renamed from: a */
        private int m19836a() {
            Integer num = this.f14998f.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            ThreadLocal<Integer> threadLocal = this.f14998f;
            if (intValue == 0) {
                threadLocal.remove();
            } else {
                threadLocal.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        /* renamed from: b */
        private int m19837b() {
            Integer num = this.f14998f.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f14998f.set(Integer.valueOf(intValue));
            return intValue;
        }

        public void execute(Runnable runnable) {
            if (m19837b() <= 15) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    m19836a();
                    throw th;
                }
            } else {
                C5362b.m19833a().execute(runnable);
            }
            m19836a();
        }
    }

    private C5362b() {
        this.f14995b = !m19835c() ? Executors.newCachedThreadPool() : C5359a.m19831b();
        this.f14996c = Executors.newSingleThreadScheduledExecutor();
        this.f14997d = new C5364b();
    }

    /* renamed from: a */
    public static ExecutorService m19833a() {
        return f14994a.f14995b;
    }

    /* renamed from: b */
    static Executor m19834b() {
        return f14994a.f14997d;
    }

    /* renamed from: c */
    private static boolean m19835c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }
}
