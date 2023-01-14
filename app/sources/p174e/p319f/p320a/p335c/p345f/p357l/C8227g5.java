package p174e.p319f.p320a.p335c.p345f.p357l;

import android.content.Context;
import java.util.Objects;

/* renamed from: e.f.a.c.f.l.g5 */
final class C8227g5 extends C8315kh {

    /* renamed from: a */
    private final Context f22539a;

    /* renamed from: b */
    private final C8185e1<C8515w0<C8405pg>> f22540b;

    C8227g5(Context context, C8185e1<C8515w0<C8405pg>> e1Var) {
        Objects.requireNonNull(context, "Null context");
        this.f22539a = context;
        this.f22540b = e1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Context mo21825a() {
        return this.f22539a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C8185e1<C8515w0<C8405pg>> mo21826b() {
        return this.f22540b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8315kh) {
            C8315kh khVar = (C8315kh) obj;
            if (this.f22539a.equals(khVar.mo21825a())) {
                C8185e1<C8515w0<C8405pg>> e1Var = this.f22540b;
                C8185e1<C8515w0<C8405pg>> b = khVar.mo21826b();
                if (e1Var != null ? e1Var.equals(b) : b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f22539a.hashCode() ^ 1000003) * 1000003;
        C8185e1<C8515w0<C8405pg>> e1Var = this.f22540b;
        return hashCode ^ (e1Var == null ? 0 : e1Var.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f22539a);
        String valueOf2 = String.valueOf(this.f22540b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 46 + valueOf2.length());
        sb.append("FlagsContext{context=");
        sb.append(valueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
