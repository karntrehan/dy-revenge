package p174e.p319f.p320a.p335c.p345f.p355j;

import com.google.android.gms.common.internal.C3705r;
import com.google.firebase.p156m.p158i.C4890d;
import java.io.UnsupportedEncodingException;

/* renamed from: e.f.a.c.f.j.g7 */
public final class C7592g7 {

    /* renamed from: a */
    private final C7530a5 f20463a;

    /* renamed from: b */
    private C7659n6 f20464b = new C7659n6();

    private C7592g7(C7530a5 a5Var, int i) {
        this.f20463a = a5Var;
        C7714t7.m27789a();
    }

    /* renamed from: c */
    public static C7592g7 m27647c(C7530a5 a5Var) {
        return new C7592g7(a5Var, 0);
    }

    /* renamed from: a */
    public final String mo21090a() {
        C7668o6 c = this.f20463a.mo21042f().mo21052c();
        return (c == null || C7590g5.m27646b(c.mo21141j())) ? "NA" : (String) C3705r.m14346k(c.mo21141j());
    }

    /* renamed from: b */
    public final byte[] mo21091b(int i, boolean z) {
        this.f20464b.mo21123f(Boolean.valueOf(i == 0));
        this.f20464b.mo21122e(Boolean.FALSE);
        this.f20463a.mo21041e(this.f20464b.mo21129l());
        try {
            C7714t7.m27789a();
            if (i == 0) {
                return new C4890d().mo14863g(C7683q3.f20708a).mo14864h(true).mo14862f().mo14846b(this.f20463a.mo21042f()).getBytes("utf-8");
            }
            C7540b5 f = this.f20463a.mo21042f();
            C7544c cVar = new C7544c();
            C7683q3.f20708a.mo10874a(cVar);
            return cVar.mo21057b().mo21061a(f);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    /* renamed from: d */
    public final C7592g7 mo21092d(C7756y4 y4Var) {
        this.f20463a.mo21039c(y4Var);
        return this;
    }

    /* renamed from: e */
    public final C7592g7 mo21093e(C7659n6 n6Var) {
        this.f20464b = n6Var;
        return this;
    }
}
