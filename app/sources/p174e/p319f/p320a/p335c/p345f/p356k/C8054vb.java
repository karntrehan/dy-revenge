package p174e.p319f.p320a.p335c.p345f.p356k;

import java.util.Arrays;
import java.util.Objects;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.k.vb */
public final class C8054vb {

    /* renamed from: a */
    private final String f21878a;

    /* renamed from: b */
    private final C8041ub f21879b;

    /* renamed from: c */
    private C8041ub f21880c;

    /* synthetic */ C8054vb(String str, C8015sb sbVar) {
        C8041ub ubVar = new C8041ub((C8015sb) null);
        this.f21879b = ubVar;
        this.f21880c = ubVar;
        this.f21878a = str;
    }

    /* renamed from: e */
    private final C8054vb m28267e(String str, Object obj) {
        C8028tb tbVar = new C8028tb((C8015sb) null);
        this.f21880c.f21850c = tbVar;
        this.f21880c = tbVar;
        tbVar.f21849b = obj;
        tbVar.f21848a = str;
        return this;
    }

    /* renamed from: a */
    public final C8054vb mo21625a(String str, float f) {
        m28267e(str, String.valueOf(f));
        return this;
    }

    /* renamed from: b */
    public final C8054vb mo21626b(String str, int i) {
        m28267e(str, String.valueOf(i));
        return this;
    }

    /* renamed from: c */
    public final C8054vb mo21627c(String str, Object obj) {
        C8041ub ubVar = new C8041ub((C8015sb) null);
        this.f21880c.f21850c = ubVar;
        this.f21880c = ubVar;
        ubVar.f21849b = obj;
        Objects.requireNonNull(str);
        ubVar.f21848a = str;
        return this;
    }

    /* renamed from: d */
    public final C8054vb mo21628d(String str, boolean z) {
        m28267e("trackingEnabled", String.valueOf(z));
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f21878a);
        sb.append('{');
        C8041ub ubVar = this.f21879b.f21850c;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        while (ubVar != null) {
            Object obj = ubVar.f21849b;
            sb.append(str);
            String str2 = ubVar.f21848a;
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
            ubVar = ubVar.f21850c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
