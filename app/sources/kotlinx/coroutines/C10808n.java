package kotlinx.coroutines;

import p455g.C10323s;
import p455g.p462v.C10376d;
import p455g.p470y.p471c.C10430l;

/* renamed from: kotlinx.coroutines.n */
public interface C10808n<T> extends C10376d<T> {

    /* renamed from: kotlinx.coroutines.n$a */
    public static final class C10809a {
        /* renamed from: a */
        public static /* synthetic */ boolean m36724a(C10808n nVar, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return nVar.mo26804k(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

    /* renamed from: e */
    void mo26802e(C10430l<? super Throwable, C10323s> lVar);

    /* renamed from: i */
    Object mo26803i(Throwable th);

    /* renamed from: k */
    boolean mo26804k(Throwable th);

    /* renamed from: l */
    boolean mo26805l();

    /* renamed from: m */
    void mo26806m(Object obj);
}
