package org.hyperledger.aries.command;

import java.util.Arrays;
import org.hyperledger.aries.api.KMSController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class KMS implements Seq.Proxy, KMSController {
    private final int refnum;

    static {
        Command.touch();
    }

    public KMS() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    KMS(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public native ResponseEnvelope createKeySet(RequestEnvelope requestEnvelope);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof KMS)) {
            return false;
        }
        KMS kms = (KMS) obj;
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    public native ResponseEnvelope importKey(RequestEnvelope requestEnvelope);

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public String toString() {
        return "KMS" + "{" + "}";
    }
}
