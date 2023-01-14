package p174e.p319f.p406d.p407a.p409c;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p174e.p319f.p320a.p335c.p345f.p353h.C7114a;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8965m;

/* renamed from: e.f.d.a.c.g */
public class C9603g {

    /* renamed from: a */
    private static final Object f25693a = new Object();

    /* renamed from: b */
    private static C9603g f25694b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f25695c;

    private C9603g(Looper looper) {
        this.f25695c = new C7114a(looper);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static C9603g m32703a() {
        C9603g gVar;
        synchronized (f25693a) {
            if (f25694b == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                f25694b = new C9603g(handlerThread.getLooper());
            }
            gVar = f25694b;
        }
        return gVar;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public static Executor m32704d() {
        return C9620v.INSTANCE;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public <ResultT> C8963l<ResultT> mo24094b(@RecentlyNonNull Callable<ResultT> callable) {
        C8965m mVar = new C8965m();
        mo24095c(new C9619u(callable, mVar));
        return mVar.mo22782a();
    }

    /* renamed from: c */
    public void mo24095c(@RecentlyNonNull Runnable runnable) {
        m32704d().execute(runnable);
    }
}
