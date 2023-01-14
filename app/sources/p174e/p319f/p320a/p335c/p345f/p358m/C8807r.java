package p174e.p319f.p320a.p335c.p345f.p358m;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.m.r */
abstract class C8807r<K, V> implements C8614c1<K, V> {
    @NullableDecl

    /* renamed from: f */
    private transient Set<K> f24029f;
    @NullableDecl

    /* renamed from: o */
    private transient Map<K, Collection<V>> f24030o;

    C8807r() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract Map<K, Collection<V>> mo22589c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract Set<K> mo22590d();

    /* renamed from: e */
    public final Set<K> mo22325e() {
        Set<K> set = this.f24029f;
        if (set != null) {
            return set;
        }
        Set<K> d = mo22590d();
        this.f24029f = d;
        return d;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8614c1)) {
            return false;
        }
        return mo22326f().equals(((C8614c1) obj).mo22326f());
    }

    /* renamed from: f */
    public final Map<K, Collection<V>> mo22326f() {
        Map<K, Collection<V>> map = this.f24030o;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> c = mo22589c();
        this.f24030o = c;
        return c;
    }

    public final int hashCode() {
        return mo22326f().hashCode();
    }

    public final String toString() {
        return ((C8677h) mo22326f()).f23750p.toString();
    }
}
