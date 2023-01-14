package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.k.v0 */
abstract class C8043v0<K, V> extends AbstractMap<K, V> {
    @NullableDecl

    /* renamed from: f */
    private transient Set<Map.Entry<K, V>> f21852f;
    @NullableDecl

    /* renamed from: o */
    private transient Collection<V> f21853o;

    C8043v0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Set<Map.Entry<K, V>> mo21381a();

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f21852f;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> a = mo21381a();
        this.f21852f = a;
        return a;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f21853o;
        if (collection != null) {
            return collection;
        }
        C8030u0 u0Var = new C8030u0(this);
        this.f21853o = u0Var;
        return u0Var;
    }
}
