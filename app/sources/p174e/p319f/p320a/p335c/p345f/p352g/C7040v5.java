package p174e.p319f.p320a.p335c.p345f.p352g;

import android.content.Context;
import java.util.Objects;

/* renamed from: e.f.a.c.f.g.v5 */
final class C7040v5 extends C6993s6 {

    /* renamed from: a */
    private final Context f19008a;

    /* renamed from: b */
    private final C6734c7 f19009b;

    C7040v5(Context context, C6734c7 c7Var) {
        Objects.requireNonNull(context, "Null context");
        this.f19008a = context;
        this.f19009b = c7Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo20151a() {
        return this.f19008a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C6734c7 mo20152b() {
        return this.f19009b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6993s6) {
            C6993s6 s6Var = (C6993s6) obj;
            if (this.f19008a.equals(s6Var.mo20151a())) {
                C6734c7 c7Var = this.f19009b;
                C6734c7 b = s6Var.mo20152b();
                if (c7Var != null ? c7Var.equals(b) : b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f19008a.hashCode() ^ 1000003) * 1000003;
        C6734c7 c7Var = this.f19009b;
        return hashCode ^ (c7Var == null ? 0 : c7Var.hashCode());
    }

    public final String toString() {
        String obj = this.f19008a.toString();
        String valueOf = String.valueOf(this.f19009b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
