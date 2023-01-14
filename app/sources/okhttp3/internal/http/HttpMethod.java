package okhttp3.internal.http;

import p455g.p470y.p472d.C10457l;

public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String str) {
        C10457l.m35320e(str, "method");
        return !C10457l.m35316a(str, "GET") && !C10457l.m35316a(str, "HEAD");
    }

    public static final boolean requiresRequestBody(String str) {
        C10457l.m35320e(str, "method");
        return C10457l.m35316a(str, "POST") || C10457l.m35316a(str, "PUT") || C10457l.m35316a(str, "PATCH") || C10457l.m35316a(str, "PROPPATCH") || C10457l.m35316a(str, "REPORT");
    }

    public final boolean invalidatesCache(String str) {
        C10457l.m35320e(str, "method");
        return C10457l.m35316a(str, "POST") || C10457l.m35316a(str, "PATCH") || C10457l.m35316a(str, "PUT") || C10457l.m35316a(str, "DELETE") || C10457l.m35316a(str, "MOVE");
    }

    public final boolean redirectsToGet(String str) {
        C10457l.m35320e(str, "method");
        return !C10457l.m35316a(str, "PROPFIND");
    }

    public final boolean redirectsWithBody(String str) {
        C10457l.m35320e(str, "method");
        return C10457l.m35316a(str, "PROPFIND");
    }
}
