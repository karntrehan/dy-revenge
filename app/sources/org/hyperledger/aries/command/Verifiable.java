package org.hyperledger.aries.command;

import java.util.Arrays;
import org.hyperledger.aries.api.VerifiableController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class Verifiable implements Seq.Proxy, VerifiableController {
    private final int refnum;

    static {
        Command.touch();
    }

    public Verifiable() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    Verifiable(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Verifiable)) {
            return false;
        }
        Verifiable verifiable = (Verifiable) obj;
        return true;
    }

    public native ResponseEnvelope generatePresentation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope generatePresentationByID(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope getCredential(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope getCredentialByName(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope getCredentials(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope getPresentation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope getPresentations(RequestEnvelope requestEnvelope);

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native ResponseEnvelope removeCredentialByName(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope removePresentationByName(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope saveCredential(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope savePresentation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope signCredential(RequestEnvelope requestEnvelope);

    public String toString() {
        return "Verifiable" + "{" + "}";
    }

    public native ResponseEnvelope validateCredential(RequestEnvelope requestEnvelope);
}
