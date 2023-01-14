package org.hyperledger.aries.rest;

import java.util.Arrays;
import org.hyperledger.aries.api.LDController;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

/* renamed from: org.hyperledger.aries.rest.LD */
public final class C10902LD implements Seq.Proxy, LDController {
    private final int refnum;

    static {
        Rest.touch();
    }

    public C10902LD() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    C10902LD(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public native ResponseEnvelope addContexts(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope addRemoteProvider(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope deleteRemoteProvider(RequestEnvelope requestEnvelope);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C10902LD)) {
            return false;
        }
        C10902LD ld = (C10902LD) obj;
        String url = getURL();
        String url2 = ld.getURL();
        if (url == null) {
            if (url2 != null) {
                return false;
            }
        } else if (!url.equals(url2)) {
            return false;
        }
        String token = getToken();
        String token2 = ld.getToken();
        return token == null ? token2 == null : token.equals(token2);
    }

    public native ResponseEnvelope getAllRemoteProviders(RequestEnvelope requestEnvelope);

    public final native String getToken();

    public final native String getURL();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getURL(), getToken()});
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native ResponseEnvelope refreshAllRemoteProviders(RequestEnvelope requestEnvelope);

    public native ResponseEnvelope refreshRemoteProvider(RequestEnvelope requestEnvelope);

    public final native void setToken(String str);

    public final native void setURL(String str);

    public String toString() {
        return "LD" + "{" + "URL:" + getURL() + "," + "Token:" + getToken() + "," + "}";
    }
}
