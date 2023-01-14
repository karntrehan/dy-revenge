package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

public interface Dns {
    public static final Companion Companion = new Companion((C10452g) null);
    public static final Dns SYSTEM = new Companion.DnsSystem();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        private static final class DnsSystem implements Dns {
            public List<InetAddress> lookup(String str) {
                C10457l.m35320e(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    C10457l.m35319d(allByName, "InetAddress.getAllByName(hostname)");
                    return C10343h.m35081C(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }
    }

    List<InetAddress> lookup(String str);
}
