package org.hyperledger.aries.models;

import java.util.Arrays;
import p476go.Seq;

public final class RequestEnvelope implements Seq.Proxy {
    private final int refnum;

    static {
        Models.touch();
    }

    RequestEnvelope(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    public RequestEnvelope(byte[] bArr) {
        int __NewRequestEnvelope = __NewRequestEnvelope(bArr);
        this.refnum = __NewRequestEnvelope;
        Seq.trackGoRef(__NewRequestEnvelope, this);
    }

    private static native int __NewRequestEnvelope(byte[] bArr);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof RequestEnvelope)) {
            return false;
        }
        byte[] payload = getPayload();
        byte[] payload2 = ((RequestEnvelope) obj).getPayload();
        return payload == null ? payload2 == null : payload.equals(payload2);
    }

    public final native byte[] getPayload();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getPayload()});
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setPayload(byte[] bArr);

    public String toString() {
        return "RequestEnvelope" + "{" + "Payload:" + getPayload() + "," + "}";
    }
}
