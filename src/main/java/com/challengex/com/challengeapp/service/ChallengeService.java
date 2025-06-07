package com.challengex.com.challengeapp.service;

import com.challengex.com.challengeapp.models.Challenge;
import com.challengex.com.challengeapp.repository.ChallengeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChallengeService {
    private final ChallengeRepository challengeRepository;

    public ChallengeService(ChallengeRepository challengeRepository) {
        this.challengeRepository = challengeRepository;
    }

    public List<Challenge> getAllChallenges() {
        return this.challengeRepository.getAllChallenges();
    }

    public Challenge getChallenge(Long id) {
        return this.challengeRepository.getChallenge(id);
    }

    public Boolean removeChallenge(Long id) {
        return this.challengeRepository.removeChallenge(id);
    }

    public Boolean addChallenge(Challenge challenge) {
        return this.challengeRepository.addChallenge(challenge);
    }

    public Boolean updateChallenge(Long id, Challenge challenge) {
        return this.challengeRepository.updateChallenge(id, challenge);
    }
}
