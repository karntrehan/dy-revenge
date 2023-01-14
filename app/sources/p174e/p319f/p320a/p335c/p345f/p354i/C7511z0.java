package p174e.p319f.p320a.p335c.p345f.p354i;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.i.z0 */
final class C7511z0<K, V> extends C7258h0<K, V> implements Serializable {
    @NullableDecl

    /* renamed from: f */
    final K f20212f;
    @NullableDecl

    /* renamed from: o */
    final V f20213o;

    C7511z0(@NullableDecl K k, @NullableDecl V v) {
        this.f20212f = k;
        this.f20213o = v;
    }

    @NullableDecl
    public final K getKey() {
        return this.f20212f;
    }

    @NullableDecl
    public final V getValue() {
        return this.f20213o;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
