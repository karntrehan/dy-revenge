package org.hyperledger.aries.rest;

import java.util.Arrays;
import org.hyperledger.aries.api.MediatorController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class Mediator implements Seq.Proxy, MediatorController {
    private final int refnum;

    static {
        Rest.touch();
    }

    public Mediator() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    Mediator(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public native ResponseEnvelope batchPickup(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope connections(RequestEnvelope requestEnvelope);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Mediator)) {
            return false;
        }
        Mediator mediator = (Mediator) obj;
        String url = getURL();
        String url2 = mediator.getURL();
        if (url == null) {
            if (url2 != null) {
                return false;
            }
        } else if (!url.equals(url2)) {
            return false;
        }
        String token = getToken();
        String token2 = mediator.getToken();
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

    public native ResponseEnvelope reconnect(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope reconnectAll(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope register(RequestEnvelope requestEnvelope);

    public final native void setToken(String str);

    public final native void setURL(String str);

    public native ResponseEnvelope status(RequestEnvelope requestEnvelope);

    public String toString() {
        return "Mediator" + "{" + "URL:" + getURL() + "," + "Token:" + getToken() + "," + "}";
    }

    public native ResponseEnvelope unregister(RequestEnvelope requestEnvelope);
}
