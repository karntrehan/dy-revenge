package p174e.p319f.p320a.p335c.p345f.p354i;

import com.google.android.gms.common.internal.C3705r;
import com.google.firebase.p156m.p158i.C4890d;
import java.io.UnsupportedEncodingException;

/* renamed from: e.f.a.c.f.i.cb */
public final class C7194cb {

    /* renamed from: a */
    private final C7351n8 f19220a;

    /* renamed from: b */
    private C7238fa f19221b = new C7238fa();

    /* renamed from: c */
    private final int f19222c;

    private C7194cb(C7351n8 n8Var, int i) {
        this.f19220a = n8Var;
        C7340mb.m27358a();
        this.f19222c = i;
    }

    /* renamed from: d */
    public static C7194cb m27197d(C7351n8 n8Var) {
        return new C7194cb(n8Var, 0);
    }

    /* renamed from: e */
    public static C7194cb m27198e(C7351n8 n8Var, int i) {
        return new C7194cb(n8Var, 1);
    }

    /* renamed from: a */
    public final int mo20608a() {
        return this.f19222c;
    }

    /* renamed from: b */
    public final String mo20609b() {
        C7253ga e = this.f19220a.mo20823i().mo20836e();
        return (e == null || C7412s.m27450b(e.mo20739j())) ? "NA" : (String) C3705r.m14346k(e.mo20739j());
    }

    /* renamed from: c */
    public final byte[] mo20610c(int i, boolean z) {
        this.f19221b.mo20706f(Boolean.valueOf(i == 0));
        this.f19221b.mo20705e(Boolean.FALSE);
        this.f19220a.mo20822h(this.f19221b.mo20712l());
        try {
            C7340mb.m27358a();
            if (i == 0) {
                return new C4890d().mo14863g(C7503y6.f20164a).mo14864h(true).mo14862f().mo14846b(this.f19220a.mo20823i()).getBytes("utf-8");
            }
            C7365o8 i2 = this.f19220a.mo20823i();
            C7260h2 h2Var = new C7260h2();
            C7503y6.f20164a.mo10874a(h2Var);
            return h2Var.mo20751b().mo20770a(i2);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    /* renamed from: f */
    public final C7194cb mo20611f(C7323l8 l8Var) {
        this.f19220a.mo20818d(l8Var);
        return this;
    }

    /* renamed from: g */
    public final C7194cb mo20612g(C7238fa faVar) {
        this.f19221b = faVar;
        return this;
    }
}
