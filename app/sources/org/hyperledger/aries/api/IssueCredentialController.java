package org.hyperledger.aries.api;

import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;

public interface IssueCredentialController {
    ResponseEnvelope acceptCredential(RequestEnvelope requestEnvelope);

    ResponseEnvelope acceptOffer(RequestEnvelope requestEnvelope);

    ResponseEnvelope acceptProblemReport(RequestEnvelope requestEnvelope);

    ResponseEnvelope acceptProposal(RequestEnvelope requestEnvelope);

    ResponseEnvelope acceptRequest(RequestEnvelope requestEnvelope);

    ResponseEnvelope actions(RequestEnvelope requestEnvelope);

    ResponseEnvelope declineCredential(RequestEnvelope requestEnvelope);

    ResponseEnvelope declineOffer(RequestEnvelope requestEnvelope);

    ResponseEnvelope declineProposal(RequestEnvelope requestEnvelope);

    ResponseEnvelope declineRequest(RequestEnvelope requestEnvelope);

    ResponseEnvelope negotiateProposal(RequestEnvelope requestEnvelope);

    ResponseEnvelope sendOffer(RequestEnvelope requestEnvelope);

    ResponseEnvelope sendProposal(RequestEnvelope requestEnvelope);

    ResponseEnvelope sendRequest(RequestEnvelope requestEnvelope);
}
