package p174e.p319f.p406d.p407a.p409c;

import com.google.android.gms.common.internal.C3705r;
import java.io.Closeable;

/* renamed from: e.f.d.a.c.g0 */
final class C9604g0 implements Closeable {

    /* renamed from: f */
    final /* synthetic */ C9612o f25696f;

    /* synthetic */ C9604g0(C9612o oVar, C9600e0 e0Var) {
        this.f25696f = oVar;
        C3705r.m14349n(((Thread) oVar.f25716d.getAndSet(Thread.currentThread())) == null);
    }

    public final void close() {
        this.f25696f.f25716d.set((Object) null);
        this.f25696f.m32731d();
    }
}
