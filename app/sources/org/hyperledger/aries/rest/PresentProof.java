package org.hyperledger.aries.rest;

import java.util.Arrays;
import org.hyperledger.aries.api.PresentProofController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class PresentProof implements Seq.Proxy, PresentProofController {
    private final int refnum;

    static {
        Rest.touch();
    }

    public PresentProof() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    PresentProof(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public native ResponseEnvelope acceptPresentation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope acceptProblemReport(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope acceptProposePresentation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope acceptRequestPresentation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope actions(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope declinePresentation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope declineProposePresentation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope declineRequestPresentation(RequestEnvelope requestEnvelope);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof PresentProof)) {
            return false;
        }
        PresentProof presentProof = (PresentProof) obj;
        String url = getURL();
        String url2 = presentProof.getURL();
        if (url == null) {
            if (url2 != null) {
                return false;
            }
        } else if (!url.equals(url2)) {
            return false;
        }
        String token = getToken();
        String token2 = presentProof.getToken();
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

    public native ResponseEnvelope negotiateRequestPresentation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope sendProposePresentation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope sendRequestPresentation(RequestEnvelope requestEnvelope);

    public final native void setToken(String str);

    public final native void setURL(String str);

    public String toString() {
        return "PresentProof" + "{" + "URL:" + getURL() + "," + "Token:" + getToken() + "," + "}";
    }
}
