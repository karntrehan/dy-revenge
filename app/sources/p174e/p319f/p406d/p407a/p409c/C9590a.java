package p174e.p319f.p406d.p407a.p409c;

import androidx.annotation.RecentlyNonNull;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: e.f.d.a.c.a */
public class C9590a {

    /* renamed from: a */
    private final ReferenceQueue<Object> f25673a = new ReferenceQueue<>();

    /* renamed from: b */
    private final Set<C9618t> f25674b = Collections.synchronizedSet(new HashSet());

    /* renamed from: e.f.d.a.c.a$a */
    public interface C9591a {
        /* renamed from: a */
        void mo24088a();
    }

    private C9590a() {
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static C9590a m32693a() {
        C9590a aVar = new C9590a();
        aVar.mo24087b(aVar, C9616r.f25729f);
        Thread thread = new Thread(new C9615q(aVar.f25673a, aVar.f25674b), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public C9591a mo24087b(@RecentlyNonNull Object obj, @RecentlyNonNull Runnable runnable) {
        C9618t tVar = new C9618t(obj, this.f25673a, this.f25674b, runnable, (C9617s) null);
        this.f25674b.add(tVar);
        return tVar;
    }
}
