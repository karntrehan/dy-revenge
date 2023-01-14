package org.hyperledger.aries.command;

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
import org.hyperledger.aries.api.OutOfBandV2Controller;
import org.hyperledger.aries.api.PresentProofController;
import org.hyperledger.aries.api.VCWalletController;
import org.hyperledger.aries.api.VDRController;
import org.hyperledger.aries.api.VerifiableController;
import org.hyperledger.aries.config.Options;
import p476go.Seq;

public final class Aries implements Seq.Proxy, AriesController {
    private final int refnum;

    static {
        Command.touch();
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
        return true;
    }

    public native DIDExchangeController getDIDExchangeController();

    public native IntroduceController getIntroduceController();

    public native IssueCredentialController getIssueCredentialController();

    public native KMSController getKMSController();

    public native LDController getLDController();

    public native MediatorController getMediatorController();

    public native MessagingController getMessagingController();

    public native OutOfBandController getOutOfBandController();

    public native OutOfBandV2Controller getOutOfBandV2Controller();

    public native PresentProofController getPresentProofController();

    public native VCWalletController getVCWalletController();

    public native VDRController getVDRController();

    public native VerifiableController getVerifiableController();

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native String registerHandler(Handler handler, String str);

    public String toString() {
        return "Aries" + "{" + "}";
    }

    public native void unregisterHandler(String str);
}
