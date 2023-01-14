package p174e.p319f.p320a.p335c.p345f.p357l;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.l.h1 */
final class C8242h1<T> implements Serializable, C8185e1 {
    @NullableDecl

    /* renamed from: f */
    final T f22586f;

    C8242h1(@NullableDecl T t) {
        this.f22586f = t;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof C8242h1) {
            return C8497v0.m29127a(this.f22586f, ((C8242h1) obj).f22586f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22586f});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f22586f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public final T zza() {
        return this.f22586f;
    }
}
