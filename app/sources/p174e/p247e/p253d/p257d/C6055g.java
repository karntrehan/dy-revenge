package p174e.p247e.p253d.p257d;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e.e.d.d.g */
public class C6055g<K, V> extends HashMap<K, V> {
    private C6055g(Map<? extends K, ? extends V> map) {
        super(map);
    }

    /* renamed from: c */
    public static <K, V> C6055g<K, V> m22820c(Map<? extends K, ? extends V> map) {
        return new C6055g<>(map);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m22821of(K k, V v) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(k, v);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: of */
    public static <K, V> Map<K, V> m22822of(K k, V v, K k2, V v2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        return Collections.unmodifiableMap(hashMap);
    }
}
