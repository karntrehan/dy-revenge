package p174e.p247e.p274h.p280b;

import android.os.Looper;

/* renamed from: e.e.h.b.a */
public abstract class C6163a {

    /* renamed from: a */
    private static C6163a f16948a;

    /* renamed from: e.e.h.b.a$a */
    public interface C6164a {
        /* renamed from: a */
        void mo18253a();
    }

    /* renamed from: b */
    public static synchronized C6163a m23251b() {
        C6163a aVar;
        synchronized (C6163a.class) {
            if (f16948a == null) {
                f16948a = new C6165b();
            }
            aVar = f16948a;
        }
        return aVar;
    }

    /* renamed from: c */
    static boolean m23252c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: a */
    public abstract void mo18251a(C6164a aVar);

    /* renamed from: d */
    public abstract void mo18252d(C6164a aVar);
}
