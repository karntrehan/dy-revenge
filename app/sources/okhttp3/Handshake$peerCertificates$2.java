package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import p455g.p470y.p471c.C10419a;
import p455g.p470y.p472d.C10458m;

final class Handshake$peerCertificates$2 extends C10458m implements C10419a<List<? extends Certificate>> {
    final /* synthetic */ C10419a $peerCertificatesFn;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Handshake$peerCertificates$2(C10419a aVar) {
        super(0);
        this.$peerCertificatesFn = aVar;
    }

    public final List<Certificate> invoke() {
        try {
            return (List) this.$peerCertificatesFn.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return C10350l.m35138g();
        }
    }
}
