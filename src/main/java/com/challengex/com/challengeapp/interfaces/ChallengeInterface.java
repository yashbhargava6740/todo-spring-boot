package com.challengex.com.challengeapp.interfaces;

import com.challengex.com.challengeapp.models.Challenge;

import java.util.List;

public interface ChallengeInterface {
    List<Challenge> getAllChallenges();
    List<Challenge> getChallengesByMonth(String month);
    void updateChallenge(Long id, Challenge challenge);
    void removeChallengeByMonth(String month);
    void addChallenge(Challenge challenge);

}
