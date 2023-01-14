package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.Iterator;
import java.util.Objects;

/* renamed from: e.f.a.c.f.i.f1 */
public final class C7229f1 {
    /* renamed from: a */
    static void m27228a(Iterator<?> it) {
        Objects.requireNonNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
