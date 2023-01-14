package p174e.p247e.p253d.p257d;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: e.e.d.d.m */
public final class C6064m {
    /* renamed from: a */
    public static <E> CopyOnWriteArraySet<E> m22844a() {
        return new CopyOnWriteArraySet<>();
    }

    /* renamed from: b */
    public static <E> Set<E> m22845b() {
        return m22846c(new IdentityHashMap());
    }

    /* renamed from: c */
    public static <E> Set<E> m22846c(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }
}
