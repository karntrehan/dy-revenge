package org.hyperledger.aries.models;

import java.util.Arrays;
import p476go.Seq;

public final class ResponseEnvelope implements Seq.Proxy {
    private final int refnum;

    static {
        Models.touch();
    }

    public ResponseEnvelope() {
        int __NewResponseEnvelope = __NewResponseEnvelope();
        this.refnum = __NewResponseEnvelope;
        Seq.trackGoRef(__NewResponseEnvelope, this);
    }

    ResponseEnvelope(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __NewResponseEnvelope();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ResponseEnvelope)) {
            return false;
        }
        ResponseEnvelope responseEnvelope = (ResponseEnvelope) obj;
        byte[] payload = getPayload();
        byte[] payload2 = responseEnvelope.getPayload();
        if (payload == null) {
            if (payload2 != null) {
                return false;
            }
        } else if (!payload.equals(payload2)) {
            return false;
        }
        CommandError error = getError();
        CommandError error2 = responseEnvelope.getError();
        return error == null ? error2 == null : error.equals(error2);
    }

    public final native CommandError getError();

    public final native byte[] getPayload();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getPayload(), getError()});
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setError(CommandError commandError);

    public final native void setPayload(byte[] bArr);

    public String toString() {
        return "ResponseEnvelope" + "{" + "Payload:" + getPayload() + "," + "Error:" + getError() + "," + "}";
    }
}
