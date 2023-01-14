package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.Iterator;
import java.util.Objects;

/* renamed from: e.f.a.c.f.k.p0 */
public final class C7965p0 {
    /* renamed from: a */
    static void m28119a(Iterator<?> it) {
        Objects.requireNonNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
