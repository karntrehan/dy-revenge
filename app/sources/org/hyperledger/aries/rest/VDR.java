package org.hyperledger.aries.rest;

import java.util.Arrays;
import org.hyperledger.aries.api.VDRController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class VDR implements Seq.Proxy, VDRController {
    private final int refnum;

    static {
        Rest.touch();
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
        String url = getURL();
        String url2 = vdr.getURL();
        if (url == null) {
            if (url2 != null) {
                return false;
            }
        } else if (!url.equals(url2)) {
            return false;
        }
        String token = getToken();
        String token2 = vdr.getToken();
        return token == null ? token2 == null : token.equals(token2);
    }

    public native ResponseEnvelope getDID(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope getDIDRecords(RequestEnvelope requestEnvelope);

    public final native String getToken();

    public final native String getURL();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getURL(), getToken()});
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native ResponseEnvelope resolveDID(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope saveDID(RequestEnvelope requestEnvelope);

    public final native void setToken(String str);

    public final native void setURL(String str);

    public String toString() {
        return "VDR" + "{" + "URL:" + getURL() + "," + "Token:" + getToken() + "," + "}";
    }
}
