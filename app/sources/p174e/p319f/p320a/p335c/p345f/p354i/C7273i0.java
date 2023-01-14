package p174e.p319f.p320a.p335c.p345f.p354i;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.i.i0 */
abstract class C7273i0<K, V> implements C7344n1<K, V> {
    @NullableDecl

    /* renamed from: f */
    private transient Set<K> f19379f;
    @NullableDecl

    /* renamed from: o */
    private transient Map<K, Collection<V>> f19380o;

    C7273i0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract Map<K, Collection<V>> mo20721c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract Set<K> mo20722d();

    /* renamed from: e */
    public final Set<K> mo20758e() {
        Set<K> set = this.f19379f;
        if (set != null) {
            return set;
        }
        Set<K> d = mo20722d();
        this.f19379f = d;
        return d;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7344n1)) {
            return false;
        }
        return mo20760f().equals(((C7344n1) obj).mo20760f());
    }

    /* renamed from: f */
    public final Map<K, Collection<V>> mo20760f() {
        Map<K, Collection<V>> map = this.f19380o;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> c = mo20721c();
        this.f19380o = c;
        return c;
    }

    public final int hashCode() {
        return mo20760f().hashCode();
    }

    public final String toString() {
        return ((C7482x) mo20760f()).f20104p.toString();
    }
}
