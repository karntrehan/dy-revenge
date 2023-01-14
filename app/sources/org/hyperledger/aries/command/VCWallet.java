package org.hyperledger.aries.command;

import java.util.Arrays;
import org.hyperledger.aries.api.VCWalletController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class VCWallet implements Seq.Proxy, VCWalletController {
    private final int refnum;

    static {
        Command.touch();
    }

    public VCWallet() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    VCWallet(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public native ResponseEnvelope add(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope close(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope connect(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope createKeyPair(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope createProfile(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope derive(RequestEnvelope requestEnvelope);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof VCWallet)) {
            return false;
        }
        VCWallet vCWallet = (VCWallet) obj;
        return true;
    }

    public native ResponseEnvelope get(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope getAll(RequestEnvelope requestEnvelope);

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native ResponseEnvelope issue(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope open(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope presentProof(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope profileExists(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope proposePresentation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope prove(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope query(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope remove(RequestEnvelope requestEnvelope);

    public String toString() {
        return "VCWallet" + "{" + "}";
    }

    public native ResponseEnvelope updateProfile(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope verify(RequestEnvelope requestEnvelope);
}
