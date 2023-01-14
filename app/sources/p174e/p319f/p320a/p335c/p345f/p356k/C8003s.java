package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.k.s */
abstract class C8003s<K, V> implements C8069x0<K, V> {
    @NullableDecl

    /* renamed from: f */
    private transient Set<K> f21759f;
    @NullableDecl

    /* renamed from: o */
    private transient Map<K, Collection<V>> f21760o;

    C8003s() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract Map<K, Collection<V>> mo21537c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract Set<K> mo21538d();

    /* renamed from: e */
    public final Set<K> mo21564e() {
        Set<K> set = this.f21759f;
        if (set != null) {
            return set;
        }
        Set<K> d = mo21538d();
        this.f21759f = d;
        return d;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8069x0)) {
            return false;
        }
        return mo21566f().equals(((C8069x0) obj).mo21566f());
    }

    /* renamed from: f */
    public final Map<K, Collection<V>> mo21566f() {
        Map<K, Collection<V>> map = this.f21760o;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> c = mo21537c();
        this.f21760o = c;
        return c;
    }

    public final int hashCode() {
        return mo21566f().hashCode();
    }

    public final String toString() {
        return ((C7873i) mo21566f()).f21478p.toString();
    }
}
