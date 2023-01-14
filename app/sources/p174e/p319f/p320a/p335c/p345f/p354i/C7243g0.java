package p174e.p319f.p320a.p335c.p345f.p354i;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.i.g0 */
abstract class C7243g0<K, V> extends C7273i0<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public transient Map<K, Collection<V>> f19307p;

    /* renamed from: q */
    private transient int f19308q;

    protected C7243g0(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.f19307p = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    static /* synthetic */ int m27274i(C7243g0 g0Var) {
        int i = g0Var.f19308q;
        g0Var.f19308q = i + 1;
        return i;
    }

    /* renamed from: j */
    static /* synthetic */ int m27275j(C7243g0 g0Var) {
        int i = g0Var.f19308q;
        g0Var.f19308q = i - 1;
        return i;
    }

    /* renamed from: k */
    static /* synthetic */ int m27276k(C7243g0 g0Var, int i) {
        int i2 = g0Var.f19308q + i;
        g0Var.f19308q = i2;
        return i2;
    }

    /* renamed from: l */
    static /* synthetic */ int m27277l(C7243g0 g0Var, int i) {
        int i2 = g0Var.f19308q - i;
        g0Var.f19308q = i2;
        return i2;
    }

    /* renamed from: p */
    static /* synthetic */ void m27279p(C7243g0 g0Var, Object obj) {
        Collection<V> collection;
        Map<K, Collection<V>> map = g0Var.f19307p;
        Objects.requireNonNull(map);
        try {
            collection = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collection = null;
        }
        Collection collection2 = collection;
        if (collection2 != null) {
            int size = collection2.size();
            collection2.clear();
            g0Var.f19308q -= size;
        }
    }

    /* renamed from: b */
    public final boolean mo20720b(@NullableDecl K k, @NullableDecl V v) {
        Collection collection = this.f19307p.get(k);
        if (collection == null) {
            Collection g = mo20723g();
            if (g.add(v)) {
                this.f19308q++;
                this.f19307p.put(k, g);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f19308q++;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map<K, Collection<V>> mo20721c() {
        return new C7482x(this, this.f19307p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Set<K> mo20722d() {
        return new C7510z(this, this.f19307p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract Collection<V> mo20723g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Collection<V> mo20724h(@NullableDecl K k, Collection<V> collection);

    /* renamed from: m */
    public final Collection<V> mo20725m(@NullableDecl K k) {
        Collection collection = this.f19307p.get(k);
        if (collection == null) {
            collection = mo20723g();
        }
        return mo20724h(k, collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final List<V> mo20726n(@NullableDecl K k, List<V> list, @NullableDecl C7198d0 d0Var) {
        return list instanceof RandomAccess ? new C7153a0(this, k, list, d0Var) : new C7228f0(this, k, list, d0Var);
    }

    /* renamed from: q */
    public final void mo20727q() {
        for (Collection<V> clear : this.f19307p.values()) {
            clear.clear();
        }
        this.f19307p.clear();
        this.f19308q = 0;
    }
}
