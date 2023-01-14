package okhttp3.internal.http;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import p455g.p470y.p472d.C10457l;
import p493i.C10603f;
import p493i.C10616i;

public final class HttpHeaders {
    private static final C10616i QUOTED_STRING_DELIMITERS;
    private static final C10616i TOKEN_DELIMITERS;

    static {
        C10616i.C10617a aVar = C10616i.f28050o;
        QUOTED_STRING_DELIMITERS = aVar.mo26428d("\"\\");
        TOKEN_DELIMITERS = aVar.mo26428d("\t ,=");
    }

    public static final boolean hasBody(Response response) {
        C10457l.m35320e(response, "response");
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        C10457l.m35320e(headers, "$this$parseChallenges");
        C10457l.m35320e(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (C10299p.m34929o(str, headers.name(i), true)) {
                try {
                    readChallengeHeader(new C10603f().mo26320K(headers.value(i)), arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        C10457l.m35320e(response, "$this$promisesBody");
        if (C10457l.m35316a(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1 && !C10299p.m34929o("chunked", Response.header$default(response, "Transfer-Encoding", (String) null, 2, (Object) null), true)) ? false : true;
    }

    private static final void readChallengeHeader(C10603f fVar, List<Challenge> list) {
        String readToken;
        int skipAll;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    skipCommasAndWhitespace(fVar);
                    str = readToken(fVar);
                    if (str == null) {
                        return;
                    }
                }
                boolean skipCommasAndWhitespace = skipCommasAndWhitespace(fVar);
                readToken = readToken(fVar);
                if (readToken != null) {
                    byte b = (byte) 61;
                    skipAll = Util.skipAll(fVar, b);
                    boolean skipCommasAndWhitespace2 = skipCommasAndWhitespace(fVar);
                    if (skipCommasAndWhitespace || (!skipCommasAndWhitespace2 && !fVar.mo26390x())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int skipAll2 = skipAll + Util.skipAll(fVar, b);
                        while (true) {
                            if (readToken == null) {
                                readToken = readToken(fVar);
                                if (skipCommasAndWhitespace(fVar)) {
                                    continue;
                                    break;
                                }
                                skipAll2 = Util.skipAll(fVar, b);
                            }
                            if (skipAll2 == 0) {
                                continue;
                                break;
                            } else if (skipAll2 <= 1 && !skipCommasAndWhitespace(fVar)) {
                                String readQuotedString = startsWith(fVar, (byte) 34) ? readQuotedString(fVar) : readToken(fVar);
                                if (readQuotedString != null && ((String) linkedHashMap.put(readToken, readQuotedString)) == null) {
                                    if (skipCommasAndWhitespace(fVar) || fVar.mo26390x()) {
                                        readToken = null;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new Challenge(str, (Map<String, String>) linkedHashMap));
                        str = readToken;
                    }
                } else if (fVar.mo26390x()) {
                    list.add(new Challenge(str, (Map<String, String>) C10334c0.m35034d()));
                    return;
                } else {
                    return;
                }
            }
            Map singletonMap = Collections.singletonMap((Object) null, readToken + C10299p.m34934t("=", skipAll));
            C10457l.m35319d(singletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
            list.add(new Challenge(str, (Map<String, String>) singletonMap));
        }
    }

    private static final String readQuotedString(C10603f fVar) {
        byte b = (byte) 34;
        if (fVar.readByte() == b) {
            C10603f fVar2 = new C10603f();
            while (true) {
                long B = fVar.mo26308B(QUOTED_STRING_DELIMITERS);
                if (B == -1) {
                    return null;
                }
                if (fVar.mo26392y0(B) == b) {
                    fVar2.write(fVar, B);
                    fVar.readByte();
                    return fVar2.mo26319J0();
                } else if (fVar.size() == B + 1) {
                    return null;
                } else {
                    fVar2.write(fVar, B);
                    fVar.readByte();
                    fVar2.write(fVar, 1);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final String readToken(C10603f fVar) {
        long B = fVar.mo26308B(TOKEN_DELIMITERS);
        if (B == -1) {
            B = fVar.size();
        }
        if (B != 0) {
            return fVar.mo26321K0(B);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        C10457l.m35320e(cookieJar, "$this$receiveHeaders");
        C10457l.m35320e(httpUrl, "url");
        C10457l.m35320e(headers, "headers");
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> parseAll = Cookie.Companion.parseAll(httpUrl, headers);
            if (!parseAll.isEmpty()) {
                cookieJar.saveFromResponse(httpUrl, parseAll);
            }
        }
    }

    private static final boolean skipCommasAndWhitespace(C10603f fVar) {
        boolean z = false;
        while (!fVar.mo26390x()) {
            byte y0 = fVar.mo26392y0(0);
            if (y0 == 9 || y0 == 32) {
                fVar.readByte();
            } else if (y0 != 44) {
                break;
            } else {
                fVar.readByte();
                z = true;
            }
        }
        return z;
    }

    private static final boolean startsWith(C10603f fVar, byte b) {
        return !fVar.mo26390x() && fVar.mo26392y0(0) == b;
    }
}
