package p174e.p319f.p320a.p335c.p345f.p357l;

import android.net.Uri;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.l.pg */
public final class C8405pg {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f22911a;

    C8405pg(Map<String, Map<String, String>> map) {
        this.f22911a = map;
    }

    /* renamed from: a */
    public final String mo22078a(Uri uri, String str, String str2, String str3) {
        Map map;
        if (uri == null || (map = this.f22911a.get(uri.toString())) == null) {
            return null;
        }
        String valueOf = String.valueOf(str3);
        return (String) map.get(valueOf.length() != 0 ? HttpUrl.FRAGMENT_ENCODE_SET.concat(valueOf) : new String(HttpUrl.FRAGMENT_ENCODE_SET));
    }
}
