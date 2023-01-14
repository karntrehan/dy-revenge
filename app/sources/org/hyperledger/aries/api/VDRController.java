package org.hyperledger.aries.api;

import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;

public interface VDRController {
    ResponseEnvelope createDID(RequestEnvelope requestEnvelope);

    ResponseEnvelope getDID(RequestEnvelope requestEnvelope);

    ResponseEnvelope getDIDRecords(RequestEnvelope requestEnvelope);

    ResponseEnvelope resolveDID(RequestEnvelope requestEnvelope);

    ResponseEnvelope saveDID(RequestEnvelope requestEnvelope);
}
