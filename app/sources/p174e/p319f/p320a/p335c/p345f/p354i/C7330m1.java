package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.i.m1 */
public final class C7330m1 {
    /* renamed from: a */
    static <V> V m27351a(Map<?, V> map, @NullableDecl Object obj) {
        Objects.requireNonNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: b */
    static boolean m27352b(Map<?, ?> map, Object obj) {
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
