package p174e.p319f.p406d.p407a.p409c;

import java.util.concurrent.ThreadFactory;

/* renamed from: e.f.d.a.c.y */
public final /* synthetic */ class C9623y implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ ThreadFactory f25738a;

    public /* synthetic */ C9623y(ThreadFactory threadFactory) {
        this.f25738a = threadFactory;
    }

    public final Thread newThread(Runnable runnable) {
        return this.f25738a.newThread(new C9622x(runnable));
    }
}
