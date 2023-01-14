package org.hyperledger.aries.api;

import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;

public interface VerifiableController {
    ResponseEnvelope generatePresentation(RequestEnvelope requestEnvelope);

    ResponseEnvelope generatePresentationByID(RequestEnvelope requestEnvelope);

    ResponseEnvelope getCredential(RequestEnvelope requestEnvelope);

    ResponseEnvelope getCredentialByName(RequestEnvelope requestEnvelope);

    ResponseEnvelope getCredentials(RequestEnvelope requestEnvelope);

    ResponseEnvelope getPresentation(RequestEnvelope requestEnvelope);

    ResponseEnvelope getPresentations(RequestEnvelope requestEnvelope);

    ResponseEnvelope removeCredentialByName(RequestEnvelope requestEnvelope);

    ResponseEnvelope removePresentationByName(RequestEnvelope requestEnvelope);

    ResponseEnvelope saveCredential(RequestEnvelope requestEnvelope);

    ResponseEnvelope savePresentation(RequestEnvelope requestEnvelope);

    ResponseEnvelope signCredential(RequestEnvelope requestEnvelope);

    ResponseEnvelope validateCredential(RequestEnvelope requestEnvelope);
}
