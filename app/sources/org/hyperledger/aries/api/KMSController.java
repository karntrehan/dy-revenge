package org.hyperledger.aries.api;

import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;

public interface KMSController {
    ResponseEnvelope createKeySet(RequestEnvelope requestEnvelope);

    ResponseEnvelope importKey(RequestEnvelope requestEnvelope);
}
