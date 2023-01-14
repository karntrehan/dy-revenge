package okhttp3;

import java.util.List;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

public interface CookieJar {
    public static final Companion Companion = new Companion((C10452g) null);
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        private static final class NoCookies implements CookieJar {
            public List<Cookie> loadForRequest(HttpUrl httpUrl) {
                C10457l.m35320e(httpUrl, "url");
                return C10350l.m35138g();
            }

            public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
                C10457l.m35320e(httpUrl, "url");
                C10457l.m35320e(list, "cookies");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }
    }

    List<Cookie> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<Cookie> list);
}
