package com.challengex.com.challengeapp.interfaces;

import com.challengex.com.challengeapp.models.Challenge;

import java.util.List;

public interface ChallengeInterface {
    List<Challenge> getAllChallenges();
    Challenge getChallenge(Long id);
    Boolean updateChallenge(Long id, Challenge challenge);
    Boolean removeChallenge(Long id);
    Boolean addChallenge(Challenge challenge);

}
