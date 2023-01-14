package org.hyperledger.aries.command;

import java.util.Arrays;
import org.hyperledger.aries.api.MessagingController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class Messaging implements Seq.Proxy, MessagingController {
    private final int refnum;

    static {
        Command.touch();
    }

    public Messaging() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    Messaging(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Messaging)) {
            return false;
        }
        Messaging messaging = (Messaging) obj;
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native ResponseEnvelope registerHTTPService(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope registerService(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope reply(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope send(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope services(RequestEnvelope requestEnvelope);

    public String toString() {
        return "Messaging" + "{" + "}";
    }

    public native ResponseEnvelope unregisterService(RequestEnvelope requestEnvelope);
}
