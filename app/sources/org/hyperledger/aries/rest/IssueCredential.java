package org.hyperledger.aries.rest;

import java.util.Arrays;
import org.hyperledger.aries.api.IssueCredentialController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class IssueCredential implements Seq.Proxy, IssueCredentialController {
    private final int refnum;

    static {
        Rest.touch();
    }

    public IssueCredential() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    IssueCredential(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public native ResponseEnvelope acceptCredential(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope acceptOffer(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope acceptProblemReport(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope acceptProposal(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope acceptRequest(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope actions(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope declineCredential(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope declineOffer(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope declineProposal(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope declineRequest(RequestEnvelope requestEnvelope);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof IssueCredential)) {
            return false;
        }
        IssueCredential issueCredential = (IssueCredential) obj;
        String url = getURL();
        String url2 = issueCredential.getURL();
        if (url == null) {
            if (url2 != null) {
                return false;
            }
        } else if (!url.equals(url2)) {
            return false;
        }
        String token = getToken();
        String token2 = issueCredential.getToken();
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

    public native ResponseEnvelope negotiateProposal(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope sendOffer(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope sendProposal(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope sendRequest(RequestEnvelope requestEnvelope);

    public final native void setToken(String str);

    public final native void setURL(String str);

    public String toString() {
        return "IssueCredential" + "{" + "URL:" + getURL() + "," + "Token:" + getToken() + "," + "}";
    }
}
