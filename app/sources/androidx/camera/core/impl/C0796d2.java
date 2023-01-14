package androidx.camera.core.impl;

import java.util.concurrent.Executor;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.impl.d2 */
public interface C0796d2<T> {

    /* renamed from: androidx.camera.core.impl.d2$a */
    public interface C0797a<T> {
        /* renamed from: a */
        void mo2977a(Throwable th);

        /* renamed from: b */
        void mo2978b(T t);
    }

    /* renamed from: a */
    void mo2974a(C0797a<? super T> aVar);

    /* renamed from: d */
    C9172b<T> mo2975d();

    /* renamed from: e */
    void mo2976e(Executor executor, C0797a<? super T> aVar);
}
