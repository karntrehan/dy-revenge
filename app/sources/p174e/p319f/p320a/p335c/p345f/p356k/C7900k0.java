package p174e.p319f.p320a.p335c.p345f.p356k;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.k.k0 */
final class C7900k0<K, V> extends C7990r<K, V> implements Serializable {
    @NullableDecl

    /* renamed from: f */
    final K f21527f;
    @NullableDecl

    /* renamed from: o */
    final V f21528o;

    C7900k0(@NullableDecl K k, @NullableDecl V v) {
        this.f21527f = k;
        this.f21528o = v;
    }

    @NullableDecl
    public final K getKey() {
        return this.f21527f;
    }

    @NullableDecl
    public final V getValue() {
        return this.f21528o;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
