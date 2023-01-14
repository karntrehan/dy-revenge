package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import okhttp3.Handshake;
import p455g.p470y.p471c.C10419a;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10458m;

final class RealConnection$connectTls$2 extends C10458m implements C10419a<List<? extends X509Certificate>> {
    final /* synthetic */ RealConnection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.this$0 = realConnection;
    }

    public final List<X509Certificate> invoke() {
        Handshake access$getHandshake$p = this.this$0.handshake;
        C10457l.m35317b(access$getHandshake$p);
        List<Certificate> peerCertificates = access$getHandshake$p.peerCertificates();
        ArrayList arrayList = new ArrayList(C10351m.m35147p(peerCertificates, 10));
        for (Certificate certificate : peerCertificates) {
            Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
