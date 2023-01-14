package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C10850y1;

/* renamed from: kotlinx.coroutines.internal.o */
public final class C10756o {

    /* renamed from: a */
    public static final C10756o f28259a;

    /* renamed from: b */
    private static final boolean f28260b = C10764w.m36600e("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: c */
    public static final C10850y1 f28261c;

    static {
        C10756o oVar = new C10756o();
        f28259a = oVar;
        f28261c = oVar.m36566a();
    }

    private C10756o() {
    }

    /* renamed from: a */
    private final C10850y1 m36566a() {
        T t;
        try {
            List<MainDispatcherFactory> c = f28260b ? C10746h.f28240a.mo26723c() : C10275j.m34858j(C10272h.m34849a(C0000a.m1b()));
            Iterator<T> it = c.iterator();
            if (!it.hasNext()) {
                t = null;
            } else {
                t = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((MainDispatcherFactory) t).getLoadPriority();
                    do {
                        T next = it.next();
                        int loadPriority2 = ((MainDispatcherFactory) next).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            t = next;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) t;
            return mainDispatcherFactory == null ? C10757p.m36568b((Throwable) null, (String) null, 3, (Object) null) : C10757p.m36570d(mainDispatcherFactory, c);
        } catch (Throwable th) {
            return C10757p.m36568b(th, (String) null, 2, (Object) null);
        }
    }
}
