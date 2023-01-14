package okhttp3;

import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import p455g.p470y.p471c.C10419a;
import p455g.p470y.p472d.C10443a0;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p493i.C10616i;

public final class CertificatePinner {
    public static final Companion Companion = new Companion((C10452g) null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            C10457l.m35320e(str, "pattern");
            C10457l.m35320e(strArr, "pins");
            for (String pin : strArr) {
                this.pins.add(new Pin(str, pin));
            }
            return this;
        }

        public final CertificatePinner build() {
            return new CertificatePinner(C10358t.m35174U(this.pins), (CertificateChainCleaner) null, 2, (C10452g) null);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }

        public final String pin(Certificate certificate) {
            C10457l.m35320e(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + sha256Hash((X509Certificate) certificate).mo26270e();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final C10616i sha1Hash(X509Certificate x509Certificate) {
            C10457l.m35320e(x509Certificate, "$this$sha1Hash");
            C10616i.C10617a aVar = C10616i.f28050o;
            PublicKey publicKey = x509Certificate.getPublicKey();
            C10457l.m35319d(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C10457l.m35319d(encoded, "publicKey.encoded");
            return C10616i.C10617a.m36135g(aVar, encoded, 0, 0, 3, (Object) null).mo26418W();
        }

        public final C10616i sha256Hash(X509Certificate x509Certificate) {
            C10457l.m35320e(x509Certificate, "$this$sha256Hash");
            C10616i.C10617a aVar = C10616i.f28050o;
            PublicKey publicKey = x509Certificate.getPublicKey();
            C10457l.m35319d(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C10457l.m35319d(encoded, "publicKey.encoded");
            return C10616i.C10617a.m36135g(aVar, encoded, 0, 0, 3, (Object) null).mo26419X();
        }
    }

    public static final class Pin {
        private final C10616i hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String str, String str2) {
            C10616i a;
            C10457l.m35320e(str, "pattern");
            C10457l.m35320e(str2, "pin");
            if ((C10299p.m34926B(str, "*.", false, 2, (Object) null) && C10300q.m34961R(str, "*", 1, false, 4, (Object) null) == -1) || (C10299p.m34926B(str, "**.", false, 2, (Object) null) && C10300q.m34961R(str, "*", 2, false, 4, (Object) null) == -1) || C10300q.m34961R(str, "*", 0, false, 6, (Object) null) == -1) {
                String canonicalHost = HostnamesKt.toCanonicalHost(str);
                if (canonicalHost != null) {
                    this.pattern = canonicalHost;
                    if (C10299p.m34926B(str2, "sha1/", false, 2, (Object) null)) {
                        this.hashAlgorithm = "sha1";
                        C10616i.C10617a aVar = C10616i.f28050o;
                        String substring = str2.substring(5);
                        C10457l.m35319d(substring, "(this as java.lang.String).substring(startIndex)");
                        a = aVar.mo26425a(substring);
                        if (a == null) {
                            throw new IllegalArgumentException("Invalid pin hash: " + str2);
                        }
                    } else if (C10299p.m34926B(str2, "sha256/", false, 2, (Object) null)) {
                        this.hashAlgorithm = "sha256";
                        C10616i.C10617a aVar2 = C10616i.f28050o;
                        String substring2 = str2.substring(7);
                        C10457l.m35319d(substring2, "(this as java.lang.String).substring(startIndex)");
                        a = aVar2.mo26425a(substring2);
                        if (a == null) {
                            throw new IllegalArgumentException("Invalid pin hash: " + str2);
                        }
                    } else {
                        throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
                    }
                    this.hash = a;
                    return;
                }
                throw new IllegalArgumentException("Invalid pattern: " + str);
            }
            throw new IllegalArgumentException(("Unexpected pattern: " + str).toString());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return !(C10457l.m35316a(this.pattern, pin.pattern) ^ true) && !(C10457l.m35316a(this.hashAlgorithm, pin.hashAlgorithm) ^ true) && !(C10457l.m35316a(this.hash, pin.hash) ^ true);
        }

        public final C10616i getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final boolean matchesCertificate(X509Certificate x509Certificate) {
            C10616i iVar;
            C10616i iVar2;
            C10457l.m35320e(x509Certificate, "certificate");
            String str = this.hashAlgorithm;
            int hashCode = str.hashCode();
            if (hashCode != -903629273) {
                if (hashCode == 3528965 && str.equals("sha1")) {
                    iVar2 = this.hash;
                    iVar = CertificatePinner.Companion.sha1Hash(x509Certificate);
                }
                return false;
            }
            if (str.equals("sha256")) {
                iVar2 = this.hash;
                iVar = CertificatePinner.Companion.sha256Hash(x509Certificate);
            }
            return false;
            return C10457l.m35316a(iVar2, iVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x003f A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean matchesHostname(java.lang.String r12) {
            /*
                r11 = this;
                java.lang.String r0 = "hostname"
                p455g.p470y.p472d.C10457l.m35320e(r12, r0)
                java.lang.String r0 = r11.pattern
                java.lang.String r1 = "**."
                r2 = 0
                r3 = 2
                r4 = 0
                boolean r0 = p455g.p459d0.C10299p.m34926B(r0, r1, r2, r3, r4)
                r1 = 1
                if (r0 == 0) goto L_0x0041
                java.lang.String r0 = r11.pattern
                int r0 = r0.length()
                int r7 = r0 + -3
                int r0 = r12.length()
                int r0 = r0 - r7
                int r3 = r12.length()
                int r4 = r3 - r7
                java.lang.String r5 = r11.pattern
                r6 = 3
                r8 = 0
                r9 = 16
                r10 = 0
                r3 = r12
                boolean r3 = p455g.p459d0.C10299p.m34933s(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r3 == 0) goto L_0x0082
                if (r0 == 0) goto L_0x003f
                int r0 = r0 - r1
                char r12 = r12.charAt(r0)
                r0 = 46
                if (r12 != r0) goto L_0x0082
            L_0x003f:
                r2 = 1
                goto L_0x0082
            L_0x0041:
                java.lang.String r0 = r11.pattern
                java.lang.String r5 = "*."
                boolean r0 = p455g.p459d0.C10299p.m34926B(r0, r5, r2, r3, r4)
                if (r0 == 0) goto L_0x007c
                java.lang.String r0 = r11.pattern
                int r0 = r0.length()
                int r7 = r0 + -1
                int r0 = r12.length()
                int r0 = r0 - r7
                int r3 = r12.length()
                int r4 = r3 - r7
                java.lang.String r5 = r11.pattern
                r6 = 1
                r8 = 0
                r9 = 16
                r10 = 0
                r3 = r12
                boolean r3 = p455g.p459d0.C10299p.m34933s(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r3 == 0) goto L_0x0082
                r5 = 46
                int r6 = r0 + -1
                r7 = 0
                r8 = 4
                r9 = 0
                r4 = r12
                int r12 = p455g.p459d0.C10300q.m34965V(r4, r5, r6, r7, r8, r9)
                r0 = -1
                if (r12 != r0) goto L_0x0082
                goto L_0x003f
            L_0x007c:
                java.lang.String r0 = r11.pattern
                boolean r2 = p455g.p470y.p472d.C10457l.m35316a(r12, r0)
            L_0x0082:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.Pin.matchesHostname(java.lang.String):boolean");
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.mo26270e();
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner2) {
        C10457l.m35320e(set, "pins");
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner2, int i, C10452g gVar) {
        this(set, (i & 2) != 0 ? null : certificateChainCleaner2);
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final C10616i sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final C10616i sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String str, List<? extends Certificate> list) {
        C10457l.m35320e(str, "hostname");
        C10457l.m35320e(list, "peerCertificates");
        check$okhttp(str, new CertificatePinner$check$1(this, list, str));
    }

    public final void check(String str, Certificate... certificateArr) {
        C10457l.m35320e(str, "hostname");
        C10457l.m35320e(certificateArr, "peerCertificates");
        check(str, (List<? extends Certificate>) C10343h.m35081C(certificateArr));
    }

    public final void check$okhttp(String str, C10419a<? extends List<? extends X509Certificate>> aVar) {
        Pin next;
        C10457l.m35320e(str, "hostname");
        C10457l.m35320e(aVar, "cleanedPeerCertificatesFn");
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (!findMatchingPins.isEmpty()) {
            List<X509Certificate> list = (List) aVar.invoke();
            loop0:
            for (X509Certificate x509Certificate : list) {
                Iterator<Pin> it = findMatchingPins.iterator();
                C10616i iVar = null;
                C10616i iVar2 = null;
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        String hashAlgorithm = next.getHashAlgorithm();
                        int hashCode = hashAlgorithm.hashCode();
                        if (hashCode == -903629273) {
                            if (!hashAlgorithm.equals("sha256")) {
                                break loop0;
                            }
                            if (iVar == null) {
                                iVar = Companion.sha256Hash(x509Certificate);
                            }
                            if (C10457l.m35316a(next.getHash(), iVar)) {
                                return;
                            }
                        } else if (hashCode != 3528965 || !hashAlgorithm.equals("sha1")) {
                            break loop0;
                        } else {
                            if (iVar2 == null) {
                                iVar2 = Companion.sha1Hash(x509Certificate);
                            }
                            if (C10457l.m35316a(next.getHash(), iVar2)) {
                                return;
                            }
                        }
                    }
                }
                throw new AssertionError("unsupported hashAlgorithm: " + next.getHashAlgorithm());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                sb.append("\n    ");
                sb.append(Companion.pin(x509Certificate2));
                sb.append(": ");
                Principal subjectDN = x509Certificate2.getSubjectDN();
                C10457l.m35319d(subjectDN, "element.subjectDN");
                sb.append(subjectDN.getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            for (Pin append : findMatchingPins) {
                sb.append("\n    ");
                sb.append(append);
            }
            String sb2 = sb.toString();
            C10457l.m35319d(sb2, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb2);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            return C10457l.m35316a(certificatePinner.pins, this.pins) && C10457l.m35316a(certificatePinner.certificateChainCleaner, this.certificateChainCleaner);
        }
    }

    public final List<Pin> findMatchingPins(String str) {
        C10457l.m35320e(str, "hostname");
        Set<Pin> set = this.pins;
        List<Pin> g = C10350l.m35138g();
        for (T next : set) {
            if (((Pin) next).matchesHostname(str)) {
                if (g.isEmpty()) {
                    g = new ArrayList<>();
                }
                C10443a0.m35294b(g).add(next);
            }
        }
        return g;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int hashCode = (1517 + this.pins.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner2 = this.certificateChainCleaner;
        return hashCode + (certificateChainCleaner2 != null ? certificateChainCleaner2.hashCode() : 0);
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner2) {
        C10457l.m35320e(certificateChainCleaner2, "certificateChainCleaner");
        return C10457l.m35316a(this.certificateChainCleaner, certificateChainCleaner2) ? this : new CertificatePinner(this.pins, certificateChainCleaner2);
    }
}
