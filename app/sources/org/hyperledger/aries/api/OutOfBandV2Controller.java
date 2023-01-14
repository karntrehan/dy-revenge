package org.hyperledger.aries.api;

import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;

public interface OutOfBandV2Controller {
    ResponseEnvelope acceptInvitation(RequestEnvelope requestEnvelope);

    ResponseEnvelope createInvitation(RequestEnvelope requestEnvelope);
}
