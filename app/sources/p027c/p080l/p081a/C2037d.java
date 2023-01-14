package p027c.p080l.p081a;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* renamed from: c.l.a.d */
class C2037d extends C2034a {

    /* renamed from: b */
    private Context f5851b;

    /* renamed from: c */
    private Uri f5852c;

    C2037d(C2034a aVar, Context context, Uri uri) {
        super(aVar);
        this.f5851b = context;
        this.f5852c = uri;
    }

    /* renamed from: a */
    public C2034a mo6795a(String str) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public C2034a mo6796b(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public boolean mo6797c() {
        try {
            return DocumentsContract.deleteDocument(this.f5851b.getContentResolver(), this.f5852c);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public boolean mo6798d() {
        return C2036c.m8660b(this.f5851b, this.f5852c);
    }

    /* renamed from: h */
    public String mo6800h() {
        return C2036c.m8661c(this.f5851b, this.f5852c);
    }

    /* renamed from: i */
    public String mo6801i() {
        return C2036c.m8663e(this.f5851b, this.f5852c);
    }

    /* renamed from: j */
    public Uri mo6802j() {
        return this.f5852c;
    }

    /* renamed from: k */
    public boolean mo6803k() {
        return C2036c.m8664f(this.f5851b, this.f5852c);
    }

    /* renamed from: l */
    public boolean mo6804l() {
        return C2036c.m8665g(this.f5851b, this.f5852c);
    }

    /* renamed from: m */
    public long mo6805m() {
        return C2036c.m8666h(this.f5851b, this.f5852c);
    }

    /* renamed from: n */
    public long mo6806n() {
        return C2036c.m8667i(this.f5851b, this.f5852c);
    }

    /* renamed from: o */
    public C2034a[] mo6807o() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: p */
    public boolean mo6808p(String str) {
        throw new UnsupportedOperationException();
    }
}
