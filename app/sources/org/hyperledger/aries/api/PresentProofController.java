package org.hyperledger.aries.api;

import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;

public interface PresentProofController {
    ResponseEnvelope acceptPresentation(RequestEnvelope requestEnvelope);

    ResponseEnvelope acceptProblemReport(RequestEnvelope requestEnvelope);

    ResponseEnvelope acceptProposePresentation(RequestEnvelope requestEnvelope);

    ResponseEnvelope acceptRequestPresentation(RequestEnvelope requestEnvelope);

    ResponseEnvelope actions(RequestEnvelope requestEnvelope);

    ResponseEnvelope declinePresentation(RequestEnvelope requestEnvelope);

    ResponseEnvelope declineProposePresentation(RequestEnvelope requestEnvelope);

    ResponseEnvelope declineRequestPresentation(RequestEnvelope requestEnvelope);

    ResponseEnvelope negotiateRequestPresentation(RequestEnvelope requestEnvelope);

    ResponseEnvelope sendProposePresentation(RequestEnvelope requestEnvelope);

    ResponseEnvelope sendRequestPresentation(RequestEnvelope requestEnvelope);
}
