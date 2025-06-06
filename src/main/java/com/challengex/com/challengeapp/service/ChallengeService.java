package com.challengex.com.challengeapp.service;

import com.challengex.com.challengeapp.interfaces.ChallengeInterface;
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

    public List<Challenge> getChallengesByMonth(String month) {
        return this.challengeRepository.getChallengesByMonth(month);
    }

    public void removeChallengeByMonth(String month) {
        this.challengeRepository.removeChallengeByMonth(month);
    }

    public void addChallenge(Challenge challenge) {
        this.challengeRepository.addChallenge(challenge);
    }

    public void updateChallenge(Long id, Challenge challenge) {
        this.challengeRepository.updateChallenge(id, challenge);
    }
}
