package p455g.p460t;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p455g.C10314l;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.t.c0 */
class C10334c0 extends C10332b0 {
    /* renamed from: d */
    public static <K, V> Map<K, V> m35034d() {
        C10362w wVar = C10362w.f27562f;
        C10457l.m35318c(wVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return wVar;
    }

    /* renamed from: e */
    public static <K, V> Map<K, V> m35035e(C10314l<? extends K, ? extends V>... lVarArr) {
        C10457l.m35320e(lVarArr, "pairs");
        return lVarArr.length > 0 ? m35043m(lVarArr, new LinkedHashMap(C10332b0.m35030a(lVarArr.length))) : m35034d();
    }

    /* renamed from: f */
    public static <K, V> Map<K, V> m35036f(C10314l<? extends K, ? extends V>... lVarArr) {
        C10457l.m35320e(lVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10332b0.m35030a(lVarArr.length));
        m35039i(linkedHashMap, lVarArr);
        return linkedHashMap;
    }

    /* renamed from: g */
    public static final <K, V> Map<K, V> m35037g(Map<K, ? extends V> map) {
        C10457l.m35320e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : C10332b0.m35032c(map) : m35034d();
    }

    /* renamed from: h */
    public static final <K, V> void m35038h(Map<? super K, ? super V> map, Iterable<? extends C10314l<? extends K, ? extends V>> iterable) {
        C10457l.m35320e(map, "<this>");
        C10457l.m35320e(iterable, "pairs");
        for (C10314l lVar : iterable) {
            map.put(lVar.mo25609a(), lVar.mo25610b());
        }
    }

    /* renamed from: i */
    public static final <K, V> void m35039i(Map<? super K, ? super V> map, C10314l<? extends K, ? extends V>[] lVarArr) {
        C10457l.m35320e(map, "<this>");
        C10457l.m35320e(lVarArr, "pairs");
        for (C10314l<? extends K, ? extends V> lVar : lVarArr) {
            map.put(lVar.mo25609a(), lVar.mo25610b());
        }
    }

    /* renamed from: j */
    public static <K, V> Map<K, V> m35040j(Iterable<? extends C10314l<? extends K, ? extends V>> iterable) {
        C10457l.m35320e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m35037g(m35041k(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m35034d();
        }
        if (size != 1) {
            return m35041k(iterable, new LinkedHashMap(C10332b0.m35030a(collection.size())));
        }
        return C10332b0.m35031b((C10314l) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    /* renamed from: k */
    public static final <K, V, M extends Map<? super K, ? super V>> M m35041k(Iterable<? extends C10314l<? extends K, ? extends V>> iterable, M m) {
        C10457l.m35320e(iterable, "<this>");
        C10457l.m35320e(m, "destination");
        m35038h(m, iterable);
        return m;
    }

    /* renamed from: l */
    public static <K, V> Map<K, V> m35042l(Map<? extends K, ? extends V> map) {
        C10457l.m35320e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m35044n(map) : C10332b0.m35032c(map) : m35034d();
    }

    /* renamed from: m */
    public static final <K, V, M extends Map<? super K, ? super V>> M m35043m(C10314l<? extends K, ? extends V>[] lVarArr, M m) {
        C10457l.m35320e(lVarArr, "<this>");
        C10457l.m35320e(m, "destination");
        m35039i(m, lVarArr);
        return m;
    }

    /* renamed from: n */
    public static <K, V> Map<K, V> m35044n(Map<? extends K, ? extends V> map) {
        C10457l.m35320e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
