package org.hyperledger.aries.command;

import java.util.Arrays;
import org.hyperledger.aries.api.MediatorController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class Mediator implements Seq.Proxy, MediatorController {
    private final int refnum;

    static {
        Command.touch();
    }

    public Mediator() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    Mediator(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public native ResponseEnvelope batchPickup(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope connections(RequestEnvelope requestEnvelope);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Mediator)) {
            return false;
        }
        Mediator mediator = (Mediator) obj;
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native ResponseEnvelope reconnect(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope reconnectAll(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope register(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope status(RequestEnvelope requestEnvelope);

    public String toString() {
        return "Mediator" + "{" + "}";
    }

    public native ResponseEnvelope unregister(RequestEnvelope requestEnvelope);
}
