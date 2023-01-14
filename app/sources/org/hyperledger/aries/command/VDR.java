package org.hyperledger.aries.command;

import java.util.Arrays;
import org.hyperledger.aries.api.VDRController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class VDR implements Seq.Proxy, VDRController {
    private final int refnum;

    static {
        Command.touch();
    }

    public VDR() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    VDR(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public native ResponseEnvelope createDID(RequestEnvelope requestEnvelope);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof VDR)) {
            return false;
        }
        VDR vdr = (VDR) obj;
        return true;
    }

    public native ResponseEnvelope getDID(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope getDIDRecords(RequestEnvelope requestEnvelope);

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native ResponseEnvelope resolveDID(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope saveDID(RequestEnvelope requestEnvelope);

    public String toString() {
        return "VDR" + "{" + "}";
    }
}
