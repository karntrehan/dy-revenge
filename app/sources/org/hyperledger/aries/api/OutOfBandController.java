package org.hyperledger.aries.api;

import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;

public interface OutOfBandController extends OutOfBandV2Controller {
    ResponseEnvelope acceptInvitation(RequestEnvelope requestEnvelope);

    ResponseEnvelope actionContinue(RequestEnvelope requestEnvelope);

    ResponseEnvelope actionStop(RequestEnvelope requestEnvelope);

    ResponseEnvelope actions(RequestEnvelope requestEnvelope);

    ResponseEnvelope createInvitation(RequestEnvelope requestEnvelope);
}
