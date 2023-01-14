package p174e.p319f.p320a.p335c.p345f.p357l;

import android.content.Context;
import android.net.Uri;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.l.jh */
public final class C8296jh {

    /* renamed from: a */
    final String f22677a;

    /* renamed from: b */
    final Uri f22678b;

    /* renamed from: c */
    final String f22679c;

    /* renamed from: d */
    final String f22680d;

    /* renamed from: e */
    final boolean f22681e;

    /* renamed from: f */
    final boolean f22682f;

    /* renamed from: g */
    final boolean f22683g;

    /* renamed from: h */
    final boolean f22684h;

    /* renamed from: i */
    final C8479u0<Context, Boolean> f22685i;

    public C8296jh(Uri uri) {
        this((String) null, uri, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, false, (C8479u0<Context, Boolean>) null);
    }

    private C8296jh(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, C8479u0<Context, Boolean> u0Var) {
        this.f22677a = null;
        this.f22678b = uri;
        this.f22679c = str2;
        this.f22680d = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f22681e = false;
        this.f22682f = false;
        this.f22683g = false;
        this.f22684h = false;
        this.f22685i = null;
    }

    /* renamed from: a */
    public final C8296jh mo21909a(String str) {
        return new C8296jh((String) null, this.f22678b, "vision.sdk:", this.f22680d, false, false, false, false, (C8479u0<Context, Boolean>) null);
    }

    /* renamed from: b */
    public final C8126b<Boolean> mo21910b(String str, boolean z) {
        return new C8277ih(this, str, Boolean.valueOf(z), true);
    }
}
