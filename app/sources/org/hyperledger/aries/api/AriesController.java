package org.hyperledger.aries.api;

public interface AriesController {
    DIDExchangeController getDIDExchangeController();

    IntroduceController getIntroduceController();

    IssueCredentialController getIssueCredentialController();

    KMSController getKMSController();

    LDController getLDController();

    MediatorController getMediatorController();

    MessagingController getMessagingController();

    OutOfBandController getOutOfBandController();

    PresentProofController getPresentProofController();

    VCWalletController getVCWalletController();

    VDRController getVDRController();

    VerifiableController getVerifiableController();

    String registerHandler(Handler handler, String str);

    void unregisterHandler(String str);
}
