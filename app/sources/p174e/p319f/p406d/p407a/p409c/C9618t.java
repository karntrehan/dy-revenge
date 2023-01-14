package p174e.p319f.p406d.p407a.p409c;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import p174e.p319f.p406d.p407a.p409c.C9590a;

/* renamed from: e.f.d.a.c.t */
final class C9618t extends PhantomReference<Object> implements C9590a.C9591a {

    /* renamed from: a */
    private final Set<C9618t> f25730a;

    /* renamed from: b */
    private final Runnable f25731b;

    /* synthetic */ C9618t(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, C9617s sVar) {
        super(obj, referenceQueue);
        this.f25730a = set;
        this.f25731b = runnable;
    }

    /* renamed from: a */
    public final void mo24088a() {
        if (this.f25730a.remove(this)) {
            clear();
            this.f25731b.run();
        }
    }
}
