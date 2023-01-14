package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.d */
public abstract class C1286d {

    /* renamed from: a */
    AtomicReference<Object> f3714a = new AtomicReference<>();

    /* renamed from: androidx.lifecycle.d$a */
    public enum C1287a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: androidx.lifecycle.d$b */
    public enum C1288b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: e */
        public boolean mo4341e(C1288b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    /* renamed from: a */
    public abstract void mo4338a(C1290f fVar);

    /* renamed from: b */
    public abstract C1288b mo4339b();

    /* renamed from: c */
    public abstract void mo4340c(C1290f fVar);
}
