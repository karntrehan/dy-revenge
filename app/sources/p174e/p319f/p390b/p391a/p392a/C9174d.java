package p174e.p319f.p390b.p391a.p392a;

import java.util.concurrent.Future;

/* renamed from: e.f.b.a.a.d */
public final class C9174d {
    /* renamed from: a */
    public static <V> V m30496a(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }
}
