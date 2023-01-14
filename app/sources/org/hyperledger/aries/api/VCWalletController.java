package org.hyperledger.aries.api;

import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;

public interface VCWalletController {
    ResponseEnvelope add(RequestEnvelope requestEnvelope);

    ResponseEnvelope close(RequestEnvelope requestEnvelope);

    ResponseEnvelope connect(RequestEnvelope requestEnvelope);

    ResponseEnvelope createKeyPair(RequestEnvelope requestEnvelope);

    ResponseEnvelope createProfile(RequestEnvelope requestEnvelope);

    ResponseEnvelope derive(RequestEnvelope requestEnvelope);

    ResponseEnvelope get(RequestEnvelope requestEnvelope);

    ResponseEnvelope getAll(RequestEnvelope requestEnvelope);

    ResponseEnvelope issue(RequestEnvelope requestEnvelope);

    ResponseEnvelope open(RequestEnvelope requestEnvelope);

    ResponseEnvelope presentProof(RequestEnvelope requestEnvelope);

    ResponseEnvelope profileExists(RequestEnvelope requestEnvelope);

    ResponseEnvelope proposePresentation(RequestEnvelope requestEnvelope);

    ResponseEnvelope prove(RequestEnvelope requestEnvelope);

    ResponseEnvelope query(RequestEnvelope requestEnvelope);

    ResponseEnvelope remove(RequestEnvelope requestEnvelope);

    ResponseEnvelope updateProfile(RequestEnvelope requestEnvelope);

    ResponseEnvelope verify(RequestEnvelope requestEnvelope);
}
