package com.challengex.com.challengeapp.repository;

import com.challengex.com.challengeapp.interfaces.ChallengeInterface;
import com.challengex.com.challengeapp.models.Challenge;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ChallengeRepository implements ChallengeInterface {
    private final List<Challenge> challengeList = new ArrayList<>();

    public ChallengeRepository() {
        this.challengeList.add(new Challenge(1L, "Development", "This month i will master springboot", "June"));
    }

    @Override
    public List<Challenge> getAllChallenges() {
        return new ArrayList<>(this.challengeList);
    }

    @Override
    public List<Challenge> getChallengesByMonth(String month) {
        List<Challenge> monthlyFilteredChallenges = new ArrayList<>();
        for (Challenge challenge : this.challengeList) {
            if (challenge.getMonth().equals(month)) {
                monthlyFilteredChallenges.add(challenge);
            }
        }

        return monthlyFilteredChallenges;
    }

    @Override
    public void removeChallengeByMonth(String month) {
        this.challengeList.removeIf(challenge -> challenge.getMonth().equals(month));
    }

    @Override
    public void addChallenge(Challenge challenge) {
        this.challengeList.add(challenge);
    }

    @Override
    public void updateChallenge(Long id, Challenge challengeToUpdate) {
        this.challengeList.removeIf(challenge -> challenge.getId().equals(id));
        this.challengeList.add(challengeToUpdate);
    }
}
