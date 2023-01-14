package org.hyperledger.aries.rest;

import java.util.Arrays;
import org.hyperledger.aries.api.KMSController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class KMS implements Seq.Proxy, KMSController {
    private final int refnum;

    static {
        Rest.touch();
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
        String url = getURL();
        String url2 = kms.getURL();
        if (url == null) {
            if (url2 != null) {
                return false;
            }
        } else if (!url.equals(url2)) {
            return false;
        }
        String token = getToken();
        String token2 = kms.getToken();
        return token == null ? token2 == null : token.equals(token2);
    }

    public final native String getToken();

    public final native String getURL();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getURL(), getToken()});
    }

    public native ResponseEnvelope importKey(RequestEnvelope requestEnvelope);

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setToken(String str);

    public final native void setURL(String str);

    public String toString() {
        return "KMS" + "{" + "URL:" + getURL() + "," + "Token:" + getToken() + "," + "}";
    }
}
