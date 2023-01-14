package org.hyperledger.aries.api;

import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;

public interface MediatorController {
    ResponseEnvelope batchPickup(RequestEnvelope requestEnvelope);

    ResponseEnvelope connections(RequestEnvelope requestEnvelope);

    ResponseEnvelope reconnect(RequestEnvelope requestEnvelope);

    ResponseEnvelope reconnectAll(RequestEnvelope requestEnvelope);

    ResponseEnvelope register(RequestEnvelope requestEnvelope);

    ResponseEnvelope status(RequestEnvelope requestEnvelope);

    ResponseEnvelope unregister(RequestEnvelope requestEnvelope);
}
