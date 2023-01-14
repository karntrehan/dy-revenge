package p174e.p319f.p320a.p335c.p345f.p358m;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.m.j0 */
final class C8704j0<K, V> extends C8794q<K, V> implements Serializable {
    @NullableDecl

    /* renamed from: f */
    final K f23800f;
    @NullableDecl

    /* renamed from: o */
    final V f23801o;

    C8704j0(@NullableDecl K k, @NullableDecl V v) {
        this.f23800f = k;
        this.f23801o = v;
    }

    @NullableDecl
    public final K getKey() {
        return this.f23800f;
    }

    @NullableDecl
    public final V getValue() {
        return this.f23801o;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
