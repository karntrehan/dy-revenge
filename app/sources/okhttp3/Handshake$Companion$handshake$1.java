package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import p455g.p470y.p471c.C10419a;
import p455g.p470y.p472d.C10458m;

final class Handshake$Companion$handshake$1 extends C10458m implements C10419a<List<? extends Certificate>> {
    final /* synthetic */ List $peerCertificatesCopy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Handshake$Companion$handshake$1(List list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    public final List<Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
