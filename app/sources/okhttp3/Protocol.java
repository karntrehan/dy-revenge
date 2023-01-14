package okhttp3;

import java.io.IOException;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final Companion Companion = null;
    /* access modifiers changed from: private */
    public final String protocol;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }

        public final Protocol get(String str) {
            C10457l.m35320e(str, "protocol");
            Protocol protocol = Protocol.HTTP_1_0;
            if (!C10457l.m35316a(str, protocol.protocol)) {
                protocol = Protocol.HTTP_1_1;
                if (!C10457l.m35316a(str, protocol.protocol)) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!C10457l.m35316a(str, protocol.protocol)) {
                        protocol = Protocol.HTTP_2;
                        if (!C10457l.m35316a(str, protocol.protocol)) {
                            protocol = Protocol.SPDY_3;
                            if (!C10457l.m35316a(str, protocol.protocol)) {
                                protocol = Protocol.QUIC;
                                if (!C10457l.m35316a(str, protocol.protocol)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }
    }

    static {
        Companion = new Companion((C10452g) null);
    }

    private Protocol(String str) {
        this.protocol = str;
    }

    public static final Protocol get(String str) {
        return Companion.get(str);
    }

    public String toString() {
        return this.protocol;
    }
}
