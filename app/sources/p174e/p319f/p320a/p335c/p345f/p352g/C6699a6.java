package p174e.p319f.p320a.p335c.p345f.p352g;

import android.net.Uri;
import okhttp3.HttpUrl;
import p027c.p060f.C1801g;

/* renamed from: e.f.a.c.f.g.a6 */
public final class C6699a6 {

    /* renamed from: a */
    private final C1801g f18348a;

    C6699a6(C1801g gVar) {
        this.f18348a = gVar;
    }

    /* renamed from: a */
    public final String mo19512a(Uri uri, String str, String str2, String str3) {
        if (uri == null) {
            return null;
        }
        C1801g gVar = (C1801g) this.f18348a.get(uri.toString());
        if (gVar == null) {
            return null;
        }
        return (String) gVar.get(HttpUrl.FRAGMENT_ENCODE_SET.concat(String.valueOf(str3)));
    }
}
