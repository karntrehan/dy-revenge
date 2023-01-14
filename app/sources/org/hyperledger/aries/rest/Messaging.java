package org.hyperledger.aries.rest;

import java.util.Arrays;
import org.hyperledger.aries.api.MessagingController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class Messaging implements Seq.Proxy, MessagingController {
    private final int refnum;

    static {
        Rest.touch();
    }

    public Messaging() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    Messaging(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Messaging)) {
            return false;
        }
        Messaging messaging = (Messaging) obj;
        String url = getURL();
        String url2 = messaging.getURL();
        if (url == null) {
            if (url2 != null) {
                return false;
            }
        } else if (!url.equals(url2)) {
            return false;
        }
        String token = getToken();
        String token2 = messaging.getToken();
        return token == null ? token2 == null : token.equals(token2);
    }

    public final native String getToken();

    public final native String getURL();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getURL(), getToken()});
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native ResponseEnvelope registerHTTPService(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope registerService(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope reply(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope send(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope services(RequestEnvelope requestEnvelope);

    public final native void setToken(String str);

    public final native void setURL(String str);

    public String toString() {
        return "Messaging" + "{" + "URL:" + getURL() + "," + "Token:" + getToken() + "," + "}";
    }

    public native ResponseEnvelope unregisterService(RequestEnvelope requestEnvelope);
}
