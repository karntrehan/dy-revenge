package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.m.a1 */
public final class C8588a1 {
    /* renamed from: a */
    static <V> V m29363a(Map<?, V> map, @NullableDecl Object obj) {
        Objects.requireNonNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: b */
    static boolean m29364b(Map<?, ?> map, Object obj) {
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
