package org.hyperledger.aries.api;

import org.hyperledger.aries.models.Models;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import p476go.Seq;

public abstract class Api {

    private static final class proxyAriesController implements Seq.Proxy, AriesController {
        private final int refnum;

        proxyAriesController(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
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

        public native VCWalletController getVCWalletController();

        public native VDRController getVDRController();

        public native VerifiableController getVerifiableController();

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public native String registerHandler(Handler handler, String str);

        public native void unregisterHandler(String str);
    }

    private static final class proxyDIDExchangeController implements Seq.Proxy, DIDExchangeController {
        private final int refnum;

        proxyDIDExchangeController(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native ResponseEnvelope acceptExchangeRequest(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope acceptInvitation(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope createConnection(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope createImplicitInvitation(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope createInvitation(RequestEnvelope requestEnvelope);

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public native ResponseEnvelope queryConnectionByID(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope queryConnections(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope receiveInvitation(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope removeConnection(RequestEnvelope requestEnvelope);
    }

    private static final class proxyHandler implements Seq.Proxy, Handler {
        private final int refnum;

        proxyHandler(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native void handle(String str, byte[] bArr);

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }
    }

    private static final class proxyIntroduceController implements Seq.Proxy, IntroduceController {
        private final int refnum;

        proxyIntroduceController(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native ResponseEnvelope acceptProblemReport(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope acceptProposal(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope acceptProposalWithOOBInvitation(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope acceptRequestWithPublicOOBInvitation(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope acceptRequestWithRecipients(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope actions(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope declineProposal(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope declineRequest(RequestEnvelope requestEnvelope);

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public native ResponseEnvelope sendProposal(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope sendProposalWithOOBInvitation(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope sendRequest(RequestEnvelope requestEnvelope);
    }

    private static final class proxyIssueCredentialController implements Seq.Proxy, IssueCredentialController {
        private final int refnum;

        proxyIssueCredentialController(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native ResponseEnvelope acceptCredential(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope acceptOffer(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope acceptProblemReport(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope acceptProposal(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope acceptRequest(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope actions(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope declineCredential(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope declineOffer(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope declineProposal(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope declineRequest(RequestEnvelope requestEnvelope);

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public native ResponseEnvelope negotiateProposal(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope sendOffer(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope sendProposal(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope sendRequest(RequestEnvelope requestEnvelope);
    }

    private static final class proxyIterator implements Seq.Proxy, Iterator {
        private final int refnum;

        proxyIterator(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native void close();

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public native String key();

        public native boolean next();

        public native byte[] tags();

        public native byte[] value();
    }

    private static final class proxyKMSController implements Seq.Proxy, KMSController {
        private final int refnum;

        proxyKMSController(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native ResponseEnvelope createKeySet(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope importKey(RequestEnvelope requestEnvelope);

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }
    }

    private static final class proxyLDController implements Seq.Proxy, LDController {
        private final int refnum;

        proxyLDController(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native ResponseEnvelope addContexts(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope addRemoteProvider(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope deleteRemoteProvider(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope getAllRemoteProviders(RequestEnvelope requestEnvelope);

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public native ResponseEnvelope refreshAllRemoteProviders(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope refreshRemoteProvider(RequestEnvelope requestEnvelope);
    }

    private static final class proxyLogger implements Seq.Proxy, Logger {
        private final int refnum;

        proxyLogger(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native void debug(String str);

        public native void error(String str);

        public native void fatal(String str);

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public native void info(String str);

        public native void panic(String str);

        public native void warn(String str);
    }

    private static final class proxyLoggerProvider implements Seq.Proxy, LoggerProvider {
        private final int refnum;

        proxyLoggerProvider(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native Logger getLogger(String str);

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }
    }

    private static final class proxyMediatorController implements Seq.Proxy, MediatorController {
        private final int refnum;

        proxyMediatorController(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native ResponseEnvelope batchPickup(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope connections(RequestEnvelope requestEnvelope);

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public native ResponseEnvelope reconnect(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope reconnectAll(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope register(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope status(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope unregister(RequestEnvelope requestEnvelope);
    }

    private static final class proxyMessagingController implements Seq.Proxy, MessagingController {
        private final int refnum;

        proxyMessagingController(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public native ResponseEnvelope registerHTTPService(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope registerService(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope reply(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope send(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope services(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope unregisterService(RequestEnvelope requestEnvelope);
    }

    private static final class proxyOutOfBandController implements Seq.Proxy, OutOfBandController {
        private final int refnum;

        proxyOutOfBandController(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native ResponseEnvelope acceptInvitation(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope actionContinue(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope actionStop(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope actions(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope createInvitation(RequestEnvelope requestEnvelope);

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }
    }

    private static final class proxyOutOfBandV2Controller implements Seq.Proxy, OutOfBandV2Controller {
        private final int refnum;

        proxyOutOfBandV2Controller(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native ResponseEnvelope acceptInvitation(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope createInvitation(RequestEnvelope requestEnvelope);

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }
    }

    private static final class proxyPresentProofController implements Seq.Proxy, PresentProofController {
        private final int refnum;

        proxyPresentProofController(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native ResponseEnvelope acceptPresentation(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope acceptProblemReport(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope acceptProposePresentation(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope acceptRequestPresentation(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope actions(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope declinePresentation(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope declineProposePresentation(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope declineRequestPresentation(RequestEnvelope requestEnvelope);

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public native ResponseEnvelope negotiateRequestPresentation(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope sendProposePresentation(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope sendRequestPresentation(RequestEnvelope requestEnvelope);
    }

    private static final class proxyProvider implements Seq.Proxy, Provider {
        private final int refnum;

        proxyProvider(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native void close();

        public native byte[] getStoreConfig(String str);

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public native Store openStore(String str);

        public native void setStoreConfig(String str, byte[] bArr);
    }

    private static final class proxyStore implements Seq.Proxy, Store {
        private final int refnum;

        proxyStore(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native void batch(byte[] bArr);

        public native void close();

        public native void delete(String str);

        public native void flush();

        public native byte[] get(String str);

        public native byte[] getBulk(byte[] bArr);

        public native byte[] getTags(String str);

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public native void put(String str, byte[] bArr, byte[] bArr2);

        public native Iterator query(String str, long j);
    }

    private static final class proxyVCWalletController implements Seq.Proxy, VCWalletController {
        private final int refnum;

        proxyVCWalletController(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native ResponseEnvelope add(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope close(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope connect(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope createKeyPair(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope createProfile(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope derive(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope get(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope getAll(RequestEnvelope requestEnvelope);

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

        public native ResponseEnvelope updateProfile(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope verify(RequestEnvelope requestEnvelope);
    }

    private static final class proxyVDRController implements Seq.Proxy, VDRController {
        private final int refnum;

        proxyVDRController(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native ResponseEnvelope createDID(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope getDID(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope getDIDRecords(RequestEnvelope requestEnvelope);

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public native ResponseEnvelope resolveDID(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope saveDID(RequestEnvelope requestEnvelope);
    }

    private static final class proxyVerifiableController implements Seq.Proxy, VerifiableController {
        private final int refnum;

        proxyVerifiableController(int i) {
            this.refnum = i;
            Seq.trackGoRef(i, this);
        }

        public native ResponseEnvelope generatePresentation(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope generatePresentationByID(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope getCredential(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope getCredentialByName(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope getCredentials(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope getPresentation(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope getPresentations(RequestEnvelope requestEnvelope);

        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        public native ResponseEnvelope removeCredentialByName(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope removePresentationByName(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope saveCredential(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope savePresentation(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope signCredential(RequestEnvelope requestEnvelope);

        public native ResponseEnvelope validateCredential(RequestEnvelope requestEnvelope);
    }

    static {
        Seq.touch();
        Models.touch();
        _init();
    }

    private Api() {
    }

    private static native void _init();

    public static void touch() {
    }
}
