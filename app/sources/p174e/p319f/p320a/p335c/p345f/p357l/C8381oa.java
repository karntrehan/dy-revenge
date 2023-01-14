package p174e.p319f.p320a.p335c.p345f.p357l;

import com.google.android.gms.common.internal.C3705r;
import com.google.firebase.p156m.p158i.C4890d;
import java.io.UnsupportedEncodingException;

/* renamed from: e.f.a.c.f.l.oa */
public final class C8381oa {

    /* renamed from: a */
    private final C8268i8 f22868a;

    /* renamed from: b */
    private C8506v9 f22869b = new C8506v9();

    private C8381oa(C8268i8 i8Var, int i) {
        this.f22868a = i8Var;
        C8489ua.m29081a();
    }

    /* renamed from: c */
    public static C8381oa m28903c(C8268i8 i8Var) {
        return new C8381oa(i8Var, 0);
    }

    /* renamed from: a */
    public final String mo22048a() {
        C8524w9 c = this.f22868a.mo21856g().mo21920c();
        return (c == null || C8166d1.m28410b(c.mo22237j())) ? "NA" : (String) C3705r.m14346k(c.mo22237j());
    }

    /* renamed from: b */
    public final byte[] mo22049b(int i, boolean z) {
        this.f22869b.mo22191f(Boolean.valueOf(i == 0));
        this.f22869b.mo22190e(Boolean.FALSE);
        this.f22868a.mo21855f(this.f22869b.mo22197l());
        try {
            C8489ua.m29081a();
            if (i == 0) {
                return new C4890d().mo14863g(C8449s6.f23056a).mo14864h(true).mo14862f().mo14846b(this.f22868a.mo21856g()).getBytes("utf-8");
            }
            C8306k8 g = this.f22868a.mo21856g();
            C8186e2 e2Var = new C8186e2();
            C8449s6.f23056a.mo10874a(e2Var);
            return e2Var.mo21758b().mo21783a(g);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    /* renamed from: d */
    public final C8381oa mo22050d(C8211f8 f8Var) {
        this.f22868a.mo21852c(f8Var);
        return this;
    }

    /* renamed from: e */
    public final C8381oa mo22051e(C8506v9 v9Var) {
        this.f22869b = v9Var;
        return this;
    }
}
