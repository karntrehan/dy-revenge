package p174e.p319f.p406d.p407a.p409c;

import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* renamed from: e.f.d.a.c.q */
public final /* synthetic */ class C9615q implements Runnable {

    /* renamed from: f */
    public final /* synthetic */ ReferenceQueue f25727f;

    /* renamed from: o */
    public final /* synthetic */ Set f25728o;

    public /* synthetic */ C9615q(ReferenceQueue referenceQueue, Set set) {
        this.f25727f = referenceQueue;
        this.f25728o = set;
    }

    public final void run() {
        ReferenceQueue referenceQueue = this.f25727f;
        Set set = this.f25728o;
        while (!set.isEmpty()) {
            try {
                ((C9618t) referenceQueue.remove()).mo24088a();
            } catch (InterruptedException unused) {
            }
        }
    }
}
