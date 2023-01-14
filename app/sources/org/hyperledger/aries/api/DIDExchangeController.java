package org.hyperledger.aries.api;

import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;

public interface DIDExchangeController extends OutOfBandV2Controller {
    ResponseEnvelope acceptExchangeRequest(RequestEnvelope requestEnvelope);

    ResponseEnvelope acceptInvitation(RequestEnvelope requestEnvelope);

    ResponseEnvelope createConnection(RequestEnvelope requestEnvelope);

    ResponseEnvelope createImplicitInvitation(RequestEnvelope requestEnvelope);

    ResponseEnvelope createInvitation(RequestEnvelope requestEnvelope);

    ResponseEnvelope queryConnectionByID(RequestEnvelope requestEnvelope);

    ResponseEnvelope queryConnections(RequestEnvelope requestEnvelope);

    ResponseEnvelope receiveInvitation(RequestEnvelope requestEnvelope);

    ResponseEnvelope removeConnection(RequestEnvelope requestEnvelope);
}
