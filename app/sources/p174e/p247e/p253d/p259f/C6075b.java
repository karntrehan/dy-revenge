package p174e.p247e.p253d.p259f;

import android.webkit.MimeTypeMap;
import java.util.Map;
import p174e.p247e.p253d.p257d.C6055g;

/* renamed from: e.e.d.f.b */
public class C6075b {

    /* renamed from: a */
    private static final MimeTypeMap f16711a = MimeTypeMap.getSingleton();

    /* renamed from: b */
    private static final Map<String, String> f16712b = C6055g.m22822of("image/heif", "heif", "image/heic", "heic");

    /* renamed from: c */
    private static final Map<String, String> f16713c = C6055g.m22822of("heif", "image/heif", "heic", "image/heic");

    /* renamed from: a */
    public static String m22924a(String str) {
        String str2 = f16713c.get(str);
        return str2 != null ? str2 : f16711a.getMimeTypeFromExtension(str);
    }
}
