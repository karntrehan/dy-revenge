package okhttp3.internal;

import javax.net.ssl.SSLSocket;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import p455g.p470y.p472d.C10457l;

public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str) {
        C10457l.m35320e(builder, "builder");
        C10457l.m35320e(str, "line");
        return builder.addLenient$okhttp(str);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str, String str2) {
        C10457l.m35320e(builder, "builder");
        C10457l.m35320e(str, "name");
        C10457l.m35320e(str2, "value");
        return builder.addLenient$okhttp(str, str2);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z) {
        C10457l.m35320e(connectionSpec, "connectionSpec");
        C10457l.m35320e(sSLSocket, "sslSocket");
        connectionSpec.apply$okhttp(sSLSocket, z);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        C10457l.m35320e(cache, "cache");
        C10457l.m35320e(request, "request");
        return cache.get$okhttp(request);
    }

    public static final String cookieToString(Cookie cookie, boolean z) {
        C10457l.m35320e(cookie, "cookie");
        return cookie.toString$okhttp(z);
    }

    public static final Cookie parseCookie(long j, HttpUrl httpUrl, String str) {
        C10457l.m35320e(httpUrl, "url");
        C10457l.m35320e(str, "setCookie");
        return Cookie.Companion.parse$okhttp(j, httpUrl, str);
    }
}
