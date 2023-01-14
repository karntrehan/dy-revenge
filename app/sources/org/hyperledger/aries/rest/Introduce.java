package org.hyperledger.aries.rest;

import java.util.Arrays;
import org.hyperledger.aries.api.IntroduceController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class Introduce implements Seq.Proxy, IntroduceController {
    private final int refnum;

    static {
        Rest.touch();
    }

    public Introduce() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    Introduce(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public native ResponseEnvelope acceptProblemReport(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope acceptProposal(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope acceptProposalWithOOBInvitation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope acceptRequestWithPublicOOBInvitation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope acceptRequestWithRecipients(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope actions(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope declineProposal(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope declineRequest(RequestEnvelope requestEnvelope);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Introduce)) {
            return false;
        }
        Introduce introduce = (Introduce) obj;
        String url = getURL();
        String url2 = introduce.getURL();
        if (url == null) {
            if (url2 != null) {
                return false;
            }
        } else if (!url.equals(url2)) {
            return false;
        }
        String token = getToken();
        String token2 = introduce.getToken();
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

    public native ResponseEnvelope sendProposal(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope sendProposalWithOOBInvitation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope sendRequest(RequestEnvelope requestEnvelope);

    public final native void setToken(String str);

    public final native void setURL(String str);

    public String toString() {
        return "Introduce" + "{" + "URL:" + getURL() + "," + "Token:" + getToken() + "," + "}";
    }
}
