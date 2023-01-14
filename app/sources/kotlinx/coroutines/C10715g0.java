package kotlinx.coroutines;

import java.util.List;
import p455g.p462v.C10381g;

/* renamed from: kotlinx.coroutines.g0 */
public final class C10715g0 {

    /* renamed from: a */
    private static final List<CoroutineExceptionHandler> f28201a = C10275j.m34858j(C10272h.m34849a(C0000a.m0a()));

    /* renamed from: a */
    public static final void m36445a(C10381g gVar, Throwable th) {
        for (CoroutineExceptionHandler handleException : f28201a) {
            try {
                handleException.handleException(gVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C10721h0.m36451b(th, th2));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
