package org.hyperledger.aries.api;

import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;

public interface IntroduceController {
    ResponseEnvelope acceptProblemReport(RequestEnvelope requestEnvelope);

    ResponseEnvelope acceptProposal(RequestEnvelope requestEnvelope);

    ResponseEnvelope acceptProposalWithOOBInvitation(RequestEnvelope requestEnvelope);

    ResponseEnvelope acceptRequestWithPublicOOBInvitation(RequestEnvelope requestEnvelope);

    ResponseEnvelope acceptRequestWithRecipients(RequestEnvelope requestEnvelope);

    ResponseEnvelope actions(RequestEnvelope requestEnvelope);

    ResponseEnvelope declineProposal(RequestEnvelope requestEnvelope);

    ResponseEnvelope declineRequest(RequestEnvelope requestEnvelope);

    ResponseEnvelope sendProposal(RequestEnvelope requestEnvelope);

    ResponseEnvelope sendProposalWithOOBInvitation(RequestEnvelope requestEnvelope);

    ResponseEnvelope sendRequest(RequestEnvelope requestEnvelope);
}
