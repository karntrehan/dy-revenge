package p174e.p319f.p320a.p382e.p383a.p385b;

import java.io.File;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.e.a.b.m */
public final class C9125m {
    /* renamed from: a */
    public static String m30375a(File file) {
        if (file.getName().endsWith(".apk")) {
            String name = file.getName();
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            String replaceFirst = name.replaceFirst("(_\\d+)?\\.apk", str);
            if (replaceFirst.equals("base-master")) {
                return str;
            }
            String str2 = "base-";
            if (replaceFirst.startsWith(str2)) {
                str = "config.";
            } else {
                replaceFirst = replaceFirst.replace("-", ".config.");
                str2 = ".config.master";
            }
            return replaceFirst.replace(str2, str);
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    /* renamed from: b */
    public static void m30376b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static <T> void m30377c(T t, Object obj) {
        if (t == null) {
            throw new NullPointerException((String) obj);
        }
    }
}
