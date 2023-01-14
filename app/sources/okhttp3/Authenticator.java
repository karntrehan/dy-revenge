package okhttp3;

import okhttp3.internal.authenticator.JavaNetAuthenticator;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

public interface Authenticator {
    public static final Companion Companion = new Companion((C10452g) null);
    public static final Authenticator JAVA_NET_AUTHENTICATOR = new JavaNetAuthenticator((Dns) null, 1, (C10452g) null);
    public static final Authenticator NONE = new Companion.AuthenticatorNone();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        private static final class AuthenticatorNone implements Authenticator {
            public Request authenticate(Route route, Response response) {
                C10457l.m35320e(response, "response");
                return null;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }
    }

    Request authenticate(Route route, Response response);
}
