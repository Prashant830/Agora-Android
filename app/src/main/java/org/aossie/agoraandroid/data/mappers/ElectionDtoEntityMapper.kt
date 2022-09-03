package org.aossie.agoraandroid.data.mappers

import org.aossie.agoraandroid.data.network.dto.ElectionDto
import org.aossie.agoraandroid.domain.model.ElectionDtoModel

class ElectionDtoEntityMapper {
  fun mapToEntity(domainModel: ElectionDtoModel): ElectionDto {
    return ElectionDto(
      ballot = domainModel.ballot,
      ballotVisibility = domainModel.ballotVisibility,
      candidates = domainModel.candidates,
      description = domainModel.description,
      electionType = domainModel.electionType,
      endingDate = domainModel.endingDate,
      isInvite = domainModel.isInvite,
      isRealTime = domainModel.isRealTime,
      name = domainModel.name,
      noVacancies = domainModel.noVacancies,
      startingDate = domainModel.startingDate,
      voterListVisibility = domainModel.voterListVisibility,
      votingAlgo = domainModel.votingAlgo,
      _id = domainModel._id
    )
  }
}
