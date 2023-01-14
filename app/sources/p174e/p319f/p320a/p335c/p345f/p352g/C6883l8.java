package p174e.p319f.p320a.p335c.p345f.p352g;

import okhttp3.internal.http2.Settings;

/* renamed from: e.f.a.c.f.g.l8 */
final class C6883l8 {

    /* renamed from: a */
    private final Object f18616a;

    /* renamed from: b */
    private final int f18617b;

    C6883l8(Object obj, int i) {
        this.f18616a = obj;
        this.f18617b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6883l8)) {
            return false;
        }
        C6883l8 l8Var = (C6883l8) obj;
        return this.f18616a == l8Var.f18616a && this.f18617b == l8Var.f18617b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f18616a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f18617b;
    }
}
