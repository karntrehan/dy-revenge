package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* renamed from: kotlinx.coroutines.f1 */
public final class C10710f1 {
    /* renamed from: a */
    public static final CancellationException m36432a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
