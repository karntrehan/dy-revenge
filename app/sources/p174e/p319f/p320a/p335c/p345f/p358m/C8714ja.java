package p174e.p319f.p320a.p335c.p345f.p358m;

import com.google.android.gms.common.internal.C3705r;
import com.google.firebase.p156m.p158i.C4890d;
import java.io.UnsupportedEncodingException;

/* renamed from: e.f.a.c.f.m.ja */
public final class C8714ja {

    /* renamed from: a */
    private final C8621c8 f23830a;

    /* renamed from: b */
    private C8817r9 f23831b = new C8817r9();

    /* renamed from: c */
    private final int f23832c;

    private C8714ja(C8621c8 c8Var, int i) {
        this.f23830a = c8Var;
        C8844ta.m29702a();
        this.f23832c = i;
    }

    /* renamed from: d */
    public static C8714ja m29532d(C8621c8 c8Var) {
        return new C8714ja(c8Var, 0);
    }

    /* renamed from: e */
    public static C8714ja m29533e(C8621c8 c8Var, int i) {
        return new C8714ja(c8Var, 1);
    }

    /* renamed from: a */
    public final int mo22495a() {
        return this.f23832c;
    }

    /* renamed from: b */
    public final String mo22496b() {
        C8830s9 d = this.f23830a.mo22335h().mo22375d();
        return (d == null || C8612c.m29392b(d.mo22649j())) ? "NA" : (String) C3705r.m14346k(d.mo22649j());
    }

    /* renamed from: c */
    public final byte[] mo22497c(int i, boolean z) {
        this.f23831b.mo22622f(Boolean.valueOf(i == 0));
        this.f23831b.mo22621e(Boolean.FALSE);
        this.f23830a.mo22334g(this.f23831b.mo22628l());
        try {
            C8844ta.m29702a();
            if (i == 0) {
                return new C4890d().mo14863g(C8775o6.f23972a).mo14864h(true).mo14862f().mo14846b(this.f23830a.mo22335h()).getBytes("utf-8");
            }
            C8634d8 h = this.f23830a.mo22335h();
            C8874w1 w1Var = new C8874w1();
            C8775o6.f23972a.mo10874a(w1Var);
            return w1Var.mo22685b().mo22697a(h);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    /* renamed from: f */
    public final C8714ja mo22498f(C8595a8 a8Var) {
        this.f23830a.mo22331d(a8Var);
        return this;
    }

    /* renamed from: g */
    public final C8714ja mo22499g(C8817r9 r9Var) {
        this.f23831b = r9Var;
        return this;
    }
}
