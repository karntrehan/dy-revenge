package org.hyperledger.aries.command;

import java.util.Arrays;
import org.hyperledger.aries.api.PresentProofController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class PresentProof implements Seq.Proxy, PresentProofController {
    private final int refnum;

    static {
        Command.touch();
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
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native ResponseEnvelope negotiateRequestPresentation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope sendProposePresentation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope sendRequestPresentation(RequestEnvelope requestEnvelope);

    public String toString() {
        return "PresentProof" + "{" + "}";
    }
}
