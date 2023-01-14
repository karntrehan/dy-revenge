package org.hyperledger.aries.rest;

import java.util.Arrays;
import org.hyperledger.aries.api.OutOfBandController;
import org.hyperledger.aries.api.OutOfBandV2Controller;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class OutOfBand implements Seq.Proxy, OutOfBandController, OutOfBandV2Controller {
    private final int refnum;

    static {
        Rest.touch();
    }

    public OutOfBand() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    OutOfBand(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public native ResponseEnvelope acceptInvitation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope actionContinue(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope actionStop(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope actions(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope createInvitation(RequestEnvelope requestEnvelope);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof OutOfBand)) {
            return false;
        }
        OutOfBand outOfBand = (OutOfBand) obj;
        String url = getURL();
        String url2 = outOfBand.getURL();
        if (url == null) {
            if (url2 != null) {
                return false;
            }
        } else if (!url.equals(url2)) {
            return false;
        }
        String token = getToken();
        String token2 = outOfBand.getToken();
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

    public final native void setToken(String str);

    public final native void setURL(String str);

    public String toString() {
        return "OutOfBand" + "{" + "URL:" + getURL() + "," + "Token:" + getToken() + "," + "}";
    }
}
