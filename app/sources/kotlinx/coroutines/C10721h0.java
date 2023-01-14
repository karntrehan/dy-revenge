package kotlinx.coroutines;

import p455g.p462v.C10381g;

/* renamed from: kotlinx.coroutines.h0 */
public final class C10721h0 {
    /* renamed from: a */
    public static final void m36450a(C10381g gVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) gVar.get(CoroutineExceptionHandler.f28165m);
            if (coroutineExceptionHandler == null) {
                C10715g0.m36445a(gVar, th);
            } else {
                coroutineExceptionHandler.handleException(gVar, th);
            }
        } catch (Throwable th2) {
            C10715g0.m36445a(gVar, m36451b(th, th2));
        }
    }

    /* renamed from: b */
    public static final Throwable m36451b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C10248b.m34834a(runtimeException, th);
        return runtimeException;
    }
}
