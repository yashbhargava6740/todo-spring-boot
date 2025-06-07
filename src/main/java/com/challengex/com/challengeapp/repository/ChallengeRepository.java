package com.challengex.com.challengeapp.repository;

import com.challengex.com.challengeapp.interfaces.ChallengeInterface;
import com.challengex.com.challengeapp.models.Challenge;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ChallengeRepository implements ChallengeInterface {
    private final List<Challenge> challengeList = new ArrayList<>();

    @Override
    public List<Challenge> getAllChallenges() {
        if (challengeList.isEmpty()) {
            return null;
        }
        return new ArrayList<>(this.challengeList);
    }

    @Override
    public Challenge getChallenge(Long id) {
        for (Challenge challenge : this.challengeList) {
            if (challenge.getId().equals(id)) {
                return challenge;
            }
        }

        return null;
    }

    @Override
    public Boolean removeChallenge(Long id) {
        return this.challengeList.removeIf(challenge -> challenge.getId().equals(id));
    }

    @Override
    public Boolean addChallenge(Challenge challenge) {
        return this.challengeList.add(challenge);
    }

    @Override
    public Boolean updateChallenge(Long id, Challenge challengeToUpdate) {
        for(Challenge challenge : this.challengeList) {
            if (challenge.getId().equals(id)) {
                challenge.setDescription(challengeToUpdate.getDescription());
                challenge.setName(challengeToUpdate.getName());
                challenge.setMonth(challengeToUpdate.getMonth());
                return true;
            }
        }

        return false;
    }
}
