package org.hyperledger.aries.command;

import java.util.Arrays;
import org.hyperledger.aries.api.OutOfBandController;
import org.hyperledger.aries.api.OutOfBandV2Controller;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class OutOfBand implements Seq.Proxy, OutOfBandController, OutOfBandV2Controller {
    private final int refnum;

    static {
        Command.touch();
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
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public String toString() {
        return "OutOfBand" + "{" + "}";
    }
}
