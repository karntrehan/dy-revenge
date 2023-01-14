package org.hyperledger.aries.api;

import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;

public interface LDController {
    ResponseEnvelope addContexts(RequestEnvelope requestEnvelope);

    ResponseEnvelope addRemoteProvider(RequestEnvelope requestEnvelope);

    ResponseEnvelope deleteRemoteProvider(RequestEnvelope requestEnvelope);

    ResponseEnvelope getAllRemoteProviders(RequestEnvelope requestEnvelope);

    ResponseEnvelope refreshAllRemoteProviders(RequestEnvelope requestEnvelope);

    ResponseEnvelope refreshRemoteProvider(RequestEnvelope requestEnvelope);
}
