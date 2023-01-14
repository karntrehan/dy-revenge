package org.hyperledger.aries.command;

import java.util.Arrays;
import org.hyperledger.aries.api.LDController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

/* renamed from: org.hyperledger.aries.command.LD */
public final class C10901LD implements Seq.Proxy, LDController {
    private final int refnum;

    static {
        Command.touch();
    }

    public C10901LD() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    C10901LD(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public native ResponseEnvelope addContexts(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope addRemoteProvider(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope deleteRemoteProvider(RequestEnvelope requestEnvelope);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C10901LD)) {
            return false;
        }
        C10901LD ld = (C10901LD) obj;
        return true;
    }

    public native ResponseEnvelope getAllRemoteProviders(RequestEnvelope requestEnvelope);

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native ResponseEnvelope refreshAllRemoteProviders(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope refreshRemoteProvider(RequestEnvelope requestEnvelope);

    public String toString() {
        return "LD" + "{" + "}";
    }
}
