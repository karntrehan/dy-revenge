package okhttp3;

import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import okhttp3.Cookie;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import p455g.C10320p;
import p455g.p470y.p472d.C10457l;

public final class JavaNetCookieJar implements CookieJar {
    private final CookieHandler cookieHandler;

    public JavaNetCookieJar(CookieHandler cookieHandler2) {
        C10457l.m35320e(cookieHandler2, "cookieHandler");
        this.cookieHandler = cookieHandler2;
    }

    private final List<Cookie> decodeHeaderAsJavaNetCookies(HttpUrl httpUrl, String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int delimiterOffset = Util.delimiterOffset(str, ";,", i, length);
            int delimiterOffset2 = Util.delimiterOffset(str, '=', i, delimiterOffset);
            String trimSubstring = Util.trimSubstring(str, i, delimiterOffset2);
            if (!C10299p.m34926B(trimSubstring, "$", false, 2, (Object) null)) {
                String trimSubstring2 = delimiterOffset2 < delimiterOffset ? Util.trimSubstring(str, delimiterOffset2 + 1, delimiterOffset) : HttpUrl.FRAGMENT_ENCODE_SET;
                if (C10299p.m34926B(trimSubstring2, "\"", false, 2, (Object) null) && C10299p.m34928n(trimSubstring2, "\"", false, 2, (Object) null)) {
                    trimSubstring2 = trimSubstring2.substring(1, trimSubstring2.length() - 1);
                    C10457l.m35319d(trimSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(new Cookie.Builder().name(trimSubstring).value(trimSubstring2).domain(httpUrl.host()).build());
            }
            i = delimiterOffset + 1;
        }
        return arrayList;
    }

    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        C10457l.m35320e(httpUrl, "url");
        try {
            Map<String, List<String>> map = this.cookieHandler.get(httpUrl.uri(), C10334c0.m35034d());
            ArrayList arrayList = null;
            C10457l.m35319d(map, "cookieHeaders");
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                List<String> list = (List) next.getValue();
                if (C10299p.m34929o("Cookie", str, true) || C10299p.m34929o("Cookie2", str, true)) {
                    C10457l.m35319d(list, "value");
                    if (!list.isEmpty()) {
                        for (String str2 : list) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            C10457l.m35319d(str2, "header");
                            arrayList.addAll(decodeHeaderAsJavaNetCookies(httpUrl, str2));
                        }
                    }
                }
            }
            if (arrayList == null) {
                return C10350l.m35138g();
            }
            List<Cookie> unmodifiableList = Collections.unmodifiableList(arrayList);
            C10457l.m35319d(unmodifiableList, "Collections.unmodifiableList(cookies)");
            return unmodifiableList;
        } catch (IOException e) {
            Platform platform = Platform.Companion.get();
            StringBuilder sb = new StringBuilder();
            sb.append("Loading cookies failed for ");
            HttpUrl resolve = httpUrl.resolve("/...");
            C10457l.m35317b(resolve);
            sb.append(resolve);
            platform.log(sb.toString(), 5, e);
            return C10350l.m35138g();
        }
    }

    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        C10457l.m35320e(httpUrl, "url");
        C10457l.m35320e(list, "cookies");
        ArrayList arrayList = new ArrayList();
        for (Cookie cookieToString : list) {
            arrayList.add(Internal.cookieToString(cookieToString, true));
        }
        try {
            this.cookieHandler.put(httpUrl.uri(), C10332b0.m35031b(C10320p.m35019a("Set-Cookie", arrayList)));
        } catch (IOException e) {
            Platform platform = Platform.Companion.get();
            StringBuilder sb = new StringBuilder();
            sb.append("Saving cookies failed for ");
            HttpUrl resolve = httpUrl.resolve("/...");
            C10457l.m35317b(resolve);
            sb.append(resolve);
            platform.log(sb.toString(), 5, e);
        }
    }
}
