package org.hyperledger.aries.api;

import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;

public interface MessagingController {
    ResponseEnvelope registerHTTPService(RequestEnvelope requestEnvelope);

    ResponseEnvelope registerService(RequestEnvelope requestEnvelope);

    ResponseEnvelope reply(RequestEnvelope requestEnvelope);

    ResponseEnvelope send(RequestEnvelope requestEnvelope);

    ResponseEnvelope services(RequestEnvelope requestEnvelope);

    ResponseEnvelope unregisterService(RequestEnvelope requestEnvelope);
}
