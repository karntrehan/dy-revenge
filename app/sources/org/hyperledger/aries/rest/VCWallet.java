package org.hyperledger.aries.rest;

import java.util.Arrays;
import org.hyperledger.aries.api.VCWalletController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class VCWallet implements Seq.Proxy, VCWalletController {
    private final int refnum;

    static {
        Rest.touch();
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
        String url = getURL();
        String url2 = vCWallet.getURL();
        if (url == null) {
            if (url2 != null) {
                return false;
            }
        } else if (!url.equals(url2)) {
            return false;
        }
        String token = getToken();
        String token2 = vCWallet.getToken();
        return token == null ? token2 == null : token.equals(token2);
    }

    public native ResponseEnvelope get(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope getAll(RequestEnvelope requestEnvelope);

    public final native String getToken();

    public final native String getURL();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getURL(), getToken()});
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

    public final native void setToken(String str);

    public final native void setURL(String str);

    public String toString() {
        return "VCWallet" + "{" + "URL:" + getURL() + "," + "Token:" + getToken() + "," + "}";
    }

    public native ResponseEnvelope updateProfile(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope verify(RequestEnvelope requestEnvelope);
}
