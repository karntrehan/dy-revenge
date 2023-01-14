package androidx.camera.core.impl.p014a3.p015n;

import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.a3.n.b */
final class C0745b implements Executor {

    /* renamed from: f */
    private static volatile C0745b f2286f;

    C0745b() {
    }

    /* renamed from: a */
    static Executor m3051a() {
        if (f2286f != null) {
            return f2286f;
        }
        synchronized (C0745b.class) {
            if (f2286f == null) {
                f2286f = new C0745b();
            }
        }
        return f2286f;
    }

    public void execute(Runnable runnable) {
        runnable.run();
    }
}
