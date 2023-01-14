package p174e.p319f.p320a.p335c.p345f.p352g;

import android.net.Uri;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.r6 */
public final class C6977r6 {

    /* renamed from: a */
    final String f18838a;

    /* renamed from: b */
    final Uri f18839b;

    /* renamed from: c */
    final String f18840c;

    /* renamed from: d */
    final String f18841d;

    /* renamed from: e */
    final boolean f18842e;

    /* renamed from: f */
    final boolean f18843f;

    /* renamed from: g */
    final boolean f18844g;

    /* renamed from: h */
    final boolean f18845h;

    /* renamed from: i */
    final C7105z6 f18846i;

    public C6977r6(Uri uri) {
        this((String) null, uri, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, false, (C7105z6) null);
    }

    private C6977r6(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, C7105z6 z6Var) {
        this.f18838a = null;
        this.f18839b = uri;
        this.f18840c = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f18841d = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f18842e = z;
        this.f18843f = false;
        this.f18844g = z3;
        this.f18845h = false;
        this.f18846i = null;
    }

    /* renamed from: a */
    public final C6977r6 mo20125a() {
        return new C6977r6((String) null, this.f18839b, this.f18840c, this.f18841d, this.f18842e, false, true, false, (C7105z6) null);
    }

    /* renamed from: b */
    public final C6977r6 mo20126b() {
        if (this.f18840c.isEmpty()) {
            return new C6977r6((String) null, this.f18839b, this.f18840c, this.f18841d, true, false, this.f18844g, false, (C7105z6) null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: c */
    public final C7041v6 mo20127c(String str, double d) {
        return new C6945p6(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: d */
    public final C7041v6 mo20128d(String str, long j) {
        return new C6913n6(this, str, Long.valueOf(j), true);
    }

    /* renamed from: e */
    public final C7041v6 mo20129e(String str, String str2) {
        return new C6961q6(this, str, str2, true);
    }

    /* renamed from: f */
    public final C7041v6 mo20130f(String str, boolean z) {
        return new C6929o6(this, str, Boolean.valueOf(z), true);
    }
}
