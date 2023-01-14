package org.hyperledger.aries.rest;

import java.util.Arrays;
import org.hyperledger.aries.api.AriesController;
import org.hyperledger.aries.api.DIDExchangeController;
import org.hyperledger.aries.api.Handler;
import org.hyperledger.aries.api.IntroduceController;
import org.hyperledger.aries.api.IssueCredentialController;
import org.hyperledger.aries.api.KMSController;
import org.hyperledger.aries.api.LDController;
import org.hyperledger.aries.api.MediatorController;
import org.hyperledger.aries.api.MessagingController;
import org.hyperledger.aries.api.OutOfBandController;
import org.hyperledger.aries.api.PresentProofController;
import org.hyperledger.aries.api.VCWalletController;
import org.hyperledger.aries.api.VDRController;
import org.hyperledger.aries.api.VerifiableController;
import org.hyperledger.aries.config.Options;
import p476go.Seq;

public final class Aries implements Seq.Proxy, AriesController {
    private final int refnum;

    static {
        Rest.touch();
    }

    Aries(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    public Aries(Options options) {
        int __NewAries = __NewAries(options);
        this.refnum = __NewAries;
        Seq.trackGoRef(__NewAries, this);
    }

    private static native int __NewAries(Options options);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Aries)) {
            return false;
        }
        Aries aries = (Aries) obj;
        String url = getURL();
        String url2 = aries.getURL();
        if (url == null) {
            if (url2 != null) {
                return false;
            }
        } else if (!url.equals(url2)) {
            return false;
        }
        String websocketURL = getWebsocketURL();
        String websocketURL2 = aries.getWebsocketURL();
        if (websocketURL == null) {
            if (websocketURL2 != null) {
                return false;
            }
        } else if (!websocketURL.equals(websocketURL2)) {
            return false;
        }
        String token = getToken();
        String token2 = aries.getToken();
        return token == null ? token2 == null : token.equals(token2);
    }

    public native DIDExchangeController getDIDExchangeController();

    public native IntroduceController getIntroduceController();

    public native IssueCredentialController getIssueCredentialController();

    public native KMSController getKMSController();

    public native LDController getLDController();

    public native MediatorController getMediatorController();

    public native MessagingController getMessagingController();

    public native OutOfBandController getOutOfBandController();

    public native PresentProofController getPresentProofController();

    public final native String getToken();

    public final native String getURL();

    public native VCWalletController getVCWalletController();

    public native VDRController getVDRController();

    public native VerifiableController getVerifiableController();

    public final native String getWebsocketURL();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getURL(), getWebsocketURL(), getToken()});
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native String registerHandler(Handler handler, String str);

    public final native void setToken(String str);

    public final native void setURL(String str);

    public final native void setWebsocketURL(String str);

    public String toString() {
        return "Aries" + "{" + "URL:" + getURL() + "," + "WebsocketURL:" + getWebsocketURL() + "," + "Token:" + getToken() + "," + "}";
    }

    public native void unregisterHandler(String str);
}
