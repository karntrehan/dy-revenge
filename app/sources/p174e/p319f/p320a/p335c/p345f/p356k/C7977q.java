package p174e.p319f.p320a.p335c.p345f.p356k;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.k.q */
abstract class C7977q<K, V> extends C8003s<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public transient Map<K, Collection<V>> f21704p;

    /* renamed from: q */
    private transient int f21705q;

    protected C7977q(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.f21704p = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    static /* synthetic */ int m28142i(C7977q qVar) {
        int i = qVar.f21705q;
        qVar.f21705q = i + 1;
        return i;
    }

    /* renamed from: j */
    static /* synthetic */ int m28143j(C7977q qVar) {
        int i = qVar.f21705q;
        qVar.f21705q = i - 1;
        return i;
    }

    /* renamed from: k */
    static /* synthetic */ int m28144k(C7977q qVar, int i) {
        int i2 = qVar.f21705q + i;
        qVar.f21705q = i2;
        return i2;
    }

    /* renamed from: l */
    static /* synthetic */ int m28145l(C7977q qVar, int i) {
        int i2 = qVar.f21705q - i;
        qVar.f21705q = i2;
        return i2;
    }

    /* renamed from: p */
    static /* synthetic */ void m28147p(C7977q qVar, Object obj) {
        Collection<V> collection;
        Map<K, Collection<V>> map = qVar.f21704p;
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
            qVar.f21705q -= size;
        }
    }

    /* renamed from: b */
    public final boolean mo21536b(@NullableDecl K k, @NullableDecl V v) {
        Collection collection = this.f21704p.get(k);
        if (collection == null) {
            Collection g = mo21539g();
            if (g.add(v)) {
                this.f21705q++;
                this.f21704p.put(k, g);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.f21705q++;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map<K, Collection<V>> mo21537c() {
        return new C7873i(this, this.f21704p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Set<K> mo21538d() {
        return new C7899k(this, this.f21704p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract Collection<V> mo21539g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Collection<V> mo21333h(@NullableDecl K k, Collection<V> collection);

    /* renamed from: m */
    public final Collection<V> mo21540m(@NullableDecl K k) {
        Collection collection = this.f21704p.get(k);
        if (collection == null) {
            collection = mo21539g();
        }
        return mo21333h(k, collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final List<V> mo21541n(@NullableDecl K k, List<V> list, @NullableDecl C7938n nVar) {
        return list instanceof RandomAccess ? new C7912l(this, k, list, nVar) : new C7964p(this, k, list, nVar);
    }

    /* renamed from: q */
    public final void mo21542q() {
        for (Collection<V> clear : this.f21704p.values()) {
            clear.clear();
        }
        this.f21704p.clear();
        this.f21705q = 0;
    }
}
