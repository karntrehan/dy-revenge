package p174e.p319f.p320a.p335c.p345f.p353h;

import java.util.Arrays;
import java.util.Objects;
import okhttp3.HttpUrl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: e.f.a.c.f.h.i0 */
public final class C7131i0 {

    /* renamed from: a */
    private final String f19105a;

    /* renamed from: b */
    private final C7129h0 f19106b;

    /* renamed from: c */
    private C7129h0 f19107c;

    /* synthetic */ C7131i0(String str, C7127g0 g0Var) {
        C7129h0 h0Var = new C7129h0((C7127g0) null);
        this.f19106b = h0Var;
        this.f19107c = h0Var;
        Objects.requireNonNull(str);
        this.f19105a = str;
    }

    /* renamed from: b */
    private final C7131i0 m27122b(String str, @NullableDecl Object obj) {
        C7129h0 h0Var = new C7129h0((C7127g0) null);
        this.f19107c.f19104c = h0Var;
        this.f19107c = h0Var;
        h0Var.f19103b = obj;
        h0Var.f19102a = str;
        return this;
    }

    /* renamed from: a */
    public final C7131i0 mo20525a(String str, @NullableDecl Object obj) {
        m27122b(str, obj);
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f19105a);
        sb.append('{');
        C7129h0 h0Var = this.f19106b.f19104c;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        while (h0Var != null) {
            Object obj = h0Var.f19103b;
            sb.append(str);
            String str2 = h0Var.f19102a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            h0Var = h0Var.f19104c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
