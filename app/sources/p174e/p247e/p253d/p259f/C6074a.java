package p174e.p247e.p253d.p259f;

import java.util.Locale;
import java.util.Map;
import p174e.p247e.p253d.p257d.C6055g;

/* renamed from: e.e.d.f.a */
public class C6074a {

    /* renamed from: a */
    public static final Map<String, String> f16710a = C6055g.m22822of("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    /* renamed from: a */
    private static String m22921a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    /* renamed from: b */
    public static String m22922b(String str) {
        String a = m22921a(str);
        if (a == null) {
            return null;
        }
        String lowerCase = a.toLowerCase(Locale.US);
        String a2 = C6075b.m22924a(lowerCase);
        return a2 == null ? f16710a.get(lowerCase) : a2;
    }

    /* renamed from: c */
    public static boolean m22923c(String str) {
        return str != null && str.startsWith("video/");
    }
}
