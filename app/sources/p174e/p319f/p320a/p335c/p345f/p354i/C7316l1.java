package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.i.l1 */
abstract class C7316l1<K, V> extends AbstractMap<K, V> {
    @NullableDecl

    /* renamed from: f */
    private transient Set<Map.Entry<K, V>> f19522f;
    @NullableDecl

    /* renamed from: o */
    private transient Collection<V> f19523o;

    C7316l1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Set<Map.Entry<K, V>> mo20800a();

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f19522f;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> a = mo20800a();
        this.f19522f = a;
        return a;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.f19523o;
        if (collection != null) {
            return collection;
        }
        C7302k1 k1Var = new C7302k1(this);
        this.f19523o = k1Var;
        return k1Var;
    }
}
