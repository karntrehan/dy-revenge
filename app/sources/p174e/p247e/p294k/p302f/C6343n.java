package p174e.p247e.p294k.p302f;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e.e.k.f.n */
public class C6343n implements ThreadFactory {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f17666a;

    /* renamed from: b */
    private final String f17667b;

    /* renamed from: c */
    private final boolean f17668c;

    /* renamed from: d */
    private final AtomicInteger f17669d = new AtomicInteger(1);

    /* renamed from: e.e.k.f.n$a */
    class C6344a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Runnable f17670f;

        C6344a(Runnable runnable) {
            this.f17670f = runnable;
        }

        public void run() {
            try {
                Process.setThreadPriority(C6343n.this.f17666a);
            } catch (Throwable unused) {
            }
            this.f17670f.run();
        }
    }

    public C6343n(int i, String str, boolean z) {
        this.f17666a = i;
        this.f17667b = str;
        this.f17668c = z;
    }

    public Thread newThread(Runnable runnable) {
        String str;
        C6344a aVar = new C6344a(runnable);
        if (this.f17668c) {
            str = this.f17667b + "-" + this.f17669d.getAndIncrement();
        } else {
            str = this.f17667b;
        }
        return new Thread(aVar, str);
    }
}
