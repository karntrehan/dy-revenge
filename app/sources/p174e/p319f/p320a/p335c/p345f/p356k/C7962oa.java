package p174e.p319f.p320a.p335c.p345f.p356k;

import com.google.android.gms.common.internal.C3705r;
import com.google.firebase.p156m.p158i.C4890d;
import java.io.UnsupportedEncodingException;

/* renamed from: e.f.a.c.f.k.oa */
public final class C7962oa {

    /* renamed from: a */
    private final C7817d8 f21661a;

    /* renamed from: b */
    private C8039u9 f21662b = new C8039u9();

    /* renamed from: c */
    private final int f21663c;

    private C7962oa(C7817d8 d8Var, int i) {
        this.f21661a = d8Var;
        C8079xa.m28290a();
        this.f21663c = i;
    }

    /* renamed from: d */
    public static C7962oa m28112d(C7817d8 d8Var) {
        return new C7962oa(d8Var, 0);
    }

    /* renamed from: e */
    public static C7962oa m28113e(C7817d8 d8Var, int i) {
        return new C7962oa(d8Var, 1);
    }

    /* renamed from: a */
    public final int mo21510a() {
        return this.f21663c;
    }

    /* renamed from: b */
    public final String mo21511b() {
        C8052v9 e = this.f21661a.mo21276i().mo21316e();
        return (e == null || C7808d.m27897b(e.mo21624j())) ? "NA" : (String) C3705r.m14346k(e.mo21624j());
    }

    /* renamed from: c */
    public final byte[] mo21512c(int i, boolean z) {
        this.f21662b.mo21603f(Boolean.valueOf(i == 0));
        this.f21662b.mo21602e(Boolean.FALSE);
        this.f21661a.mo21275h(this.f21662b.mo21609l());
        try {
            C8079xa.m28290a();
            if (i == 0) {
                return new C4890d().mo14863g(C7893j6.f21520a).mo14864h(true).mo14862f().mo14846b(this.f21661a.mo21276i()).getBytes("utf-8");
            }
            C7830e8 i2 = this.f21661a.mo21276i();
            C7992r1 r1Var = new C7992r1();
            C7893j6.f21520a.mo10874a(r1Var);
            return r1Var.mo21558b().mo21572a(i2);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    /* renamed from: f */
    public final C7962oa mo21513f(C7791b8 b8Var) {
        this.f21661a.mo21271d(b8Var);
        return this;
    }

    /* renamed from: g */
    public final C7962oa mo21514g(C8039u9 u9Var) {
        this.f21662b = u9Var;
        return this;
    }
}
