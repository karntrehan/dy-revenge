package org.hyperledger.aries.command;

import java.util.Arrays;
import org.hyperledger.aries.api.IntroduceController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class Introduce implements Seq.Proxy, IntroduceController {
    private final int refnum;

    static {
        Command.touch();
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
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native ResponseEnvelope sendProposal(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope sendProposalWithOOBInvitation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope sendRequest(RequestEnvelope requestEnvelope);

    public String toString() {
        return "Introduce" + "{" + "}";
    }
}
