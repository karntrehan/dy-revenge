package p174e.p319f.p320a.p335c.p345f.p358m;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.m.p */
abstract class C8781p<K, V> extends C8807r<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public transient Map<K, Collection<V>> f23986p;

    /* renamed from: q */
    private transient int f23987q;

    protected C8781p(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.f23986p = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    static /* synthetic */ int m29591i(C8781p pVar) {
        int i = pVar.f23987q;
        pVar.f23987q = i + 1;
        return i;
    }

    /* renamed from: j */
    static /* synthetic */ int m29592j(C8781p pVar) {
        int i = pVar.f23987q;
        pVar.f23987q = i - 1;
        return i;
    }

    /* renamed from: k */
    static /* synthetic */ int m29593k(C8781p pVar, int i) {
        int i2 = pVar.f23987q + i;
        pVar.f23987q = i2;
        return i2;
    }

    /* renamed from: l */
    static /* synthetic */ int m29594l(C8781p pVar, int i) {
        int i2 = pVar.f23987q - i;
        pVar.f23987q = i2;
        return i2;
    }

    /* renamed from: p */
    static /* synthetic */ void m29596p(C8781p pVar, Object obj) {
        Collection<V> collection;
        Map<K, Collection<V>> map = pVar.f23986p;
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
            pVar.f23987q -= size;
        }
    }

    /* renamed from: b */
    public final boolean mo22324b(@NullableDecl K k, @NullableDecl V v) {
        Collection collection = this.f23986p.get(k);
        if (collection == null) {
            Collection g = mo22591g();
            if (g.add(v)) {
                this.f23987q++;
                this.f23986p.put(k, g);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f23987q++;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map<K, Collection<V>> mo22589c() {
        return new C8677h(this, this.f23986p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Set<K> mo22590d() {
        return new C8703j(this, this.f23986p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract Collection<V> mo22591g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Collection<V> mo22383h(@NullableDecl K k, Collection<V> collection);

    /* renamed from: m */
    public final Collection<V> mo22592m(@NullableDecl K k) {
        Collection collection = this.f23986p.get(k);
        if (collection == null) {
            collection = mo22591g();
        }
        return mo22383h(k, collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final List<V> mo22593n(@NullableDecl K k, List<V> list, @NullableDecl C8742m mVar) {
        return list instanceof RandomAccess ? new C8716k(this, k, list, mVar) : new C8768o(this, k, list, mVar);
    }

    /* renamed from: q */
    public final void mo22594q() {
        for (Collection<V> clear : this.f23986p.values()) {
            clear.clear();
        }
        this.f23986p.clear();
        this.f23987q = 0;
    }
}
