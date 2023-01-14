package org.hyperledger.aries.command;

import java.util.Arrays;
import org.hyperledger.aries.api.IssueCredentialController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class IssueCredential implements Seq.Proxy, IssueCredentialController {
    private final int refnum;

    static {
        Command.touch();
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
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native ResponseEnvelope negotiateProposal(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope sendOffer(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope sendProposal(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope sendRequest(RequestEnvelope requestEnvelope);

    public String toString() {
        return "IssueCredential" + "{" + "}";
    }
}
