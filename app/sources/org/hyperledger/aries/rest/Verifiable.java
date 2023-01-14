package org.hyperledger.aries.rest;

import java.util.Arrays;
import org.hyperledger.aries.api.VerifiableController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public final class Verifiable implements Seq.Proxy, VerifiableController {
    private final int refnum;

    static {
        Rest.touch();
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
        String url = getURL();
        String url2 = verifiable.getURL();
        if (url == null) {
            if (url2 != null) {
                return false;
            }
        } else if (!url.equals(url2)) {
            return false;
        }
        String token = getToken();
        String token2 = verifiable.getToken();
        return token == null ? token2 == null : token.equals(token2);
    }

    public native ResponseEnvelope generatePresentation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope generatePresentationByID(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope getCredential(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope getCredentialByName(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope getCredentials(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope getPresentation(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope getPresentations(RequestEnvelope requestEnvelope);

    public final native String getToken();

    public final native String getURL();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getURL(), getToken()});
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native ResponseEnvelope removeCredentialByName(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope removePresentationByName(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope saveCredential(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope savePresentation(RequestEnvelope requestEnvelope);

    public final native void setToken(String str);

    public final native void setURL(String str);

    public native ResponseEnvelope signCredential(RequestEnvelope requestEnvelope);

    public String toString() {
        return "Verifiable" + "{" + "URL:" + getURL() + "," + "Token:" + getToken() + "," + "}";
    }

    public native ResponseEnvelope validateCredential(RequestEnvelope requestEnvelope);
}
