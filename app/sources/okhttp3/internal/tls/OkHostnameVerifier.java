package okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import p455g.p470y.p472d.C10457l;
import p493i.C10607f0;

public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale locale = Locale.US;
        C10457l.m35319d(locale, "Locale.US");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        C10457l.m35319d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C10350l.m35138g();
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (!(!C10457l.m35316a(next.get(0), Integer.valueOf(i)))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C10350l.m35138g();
        }
    }

    private final boolean isAscii(String str) {
        return str.length() == ((int) C10607f0.m36054b(str, 0, 0, 3, (Object) null));
    }

    private final boolean verifyHostname(String str, String str2) {
        if (!(str == null || str.length() == 0) && !C10299p.m34926B(str, ".", false, 2, (Object) null) && !C10299p.m34928n(str, "..", false, 2, (Object) null)) {
            if (!(str2 == null || str2.length() == 0) && !C10299p.m34926B(str2, ".", false, 2, (Object) null) && !C10299p.m34928n(str2, "..", false, 2, (Object) null)) {
                if (!C10299p.m34928n(str, ".", false, 2, (Object) null)) {
                    str = str + ".";
                }
                String str3 = str;
                if (!C10299p.m34928n(str2, ".", false, 2, (Object) null)) {
                    str2 = str2 + ".";
                }
                String asciiToLowercase = asciiToLowercase(str2);
                if (!C10300q.m34950G(asciiToLowercase, "*", false, 2, (Object) null)) {
                    return C10457l.m35316a(str3, asciiToLowercase);
                }
                if (!C10299p.m34926B(asciiToLowercase, "*.", false, 2, (Object) null) || C10300q.m34960Q(asciiToLowercase, '*', 1, false, 4, (Object) null) != -1 || str3.length() < asciiToLowercase.length() || C10457l.m35316a("*.", asciiToLowercase)) {
                    return false;
                }
                String substring = asciiToLowercase.substring(1);
                C10457l.m35319d(substring, "(this as java.lang.String).substring(startIndex)");
                if (!C10299p.m34928n(str3, substring, false, 2, (Object) null)) {
                    return false;
                }
                int length = str3.length() - substring.length();
                return length <= 0 || C10300q.m34965V(str3, '.', length + -1, false, 4, (Object) null) == -1;
            }
        }
        return false;
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String asciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        for (String verifyHostname : subjectAltNames) {
            if (INSTANCE.verifyHostname(asciiToLowercase, verifyHostname)) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        for (String canonicalHost2 : subjectAltNames) {
            if (C10457l.m35316a(canonicalHost, HostnamesKt.toCanonicalHost(canonicalHost2))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        C10457l.m35320e(x509Certificate, "certificate");
        return C10358t.m35164K(getSubjectAltNames(x509Certificate, 7), getSubjectAltNames(x509Certificate, 2));
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        C10457l.m35320e(str, "host");
        C10457l.m35320e(x509Certificate, "certificate");
        return Util.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        C10457l.m35320e(str, "host");
        C10457l.m35320e(sSLSession, "session");
        if (!isAscii(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return verify(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
