package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.m.z0 */
abstract class C8909z0<K, V> extends AbstractMap<K, V> {
    @NullableDecl

    /* renamed from: f */
    private transient Set<Map.Entry<K, V>> f24248f;
    @NullableDecl

    /* renamed from: o */
    private transient Collection<V> f24249o;

    C8909z0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Set<Map.Entry<K, V>> mo22430a();

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f24248f;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> a = mo22430a();
        this.f24248f = a;
        return a;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f24249o;
        if (collection != null) {
            return collection;
        }
        C8897y0 y0Var = new C8897y0(this);
        this.f24249o = y0Var;
        return y0Var;
    }
}
