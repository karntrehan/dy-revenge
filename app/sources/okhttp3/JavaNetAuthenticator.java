package okhttp3;

import p455g.p470y.p472d.C10457l;

public final class JavaNetAuthenticator implements Authenticator {
    public Request authenticate(Route route, Response response) {
        C10457l.m35320e(response, "response");
        return Authenticator.JAVA_NET_AUTHENTICATOR.authenticate(route, response);
    }
}
