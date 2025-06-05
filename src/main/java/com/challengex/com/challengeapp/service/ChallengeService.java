package com.challengex.com.challengeapp.service;

import com.challengex.com.challengeapp.interfaces.ChallengeInterface;
import com.challengex.com.challengeapp.models.Challenge;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChallengeService {
    private final ChallengeInterface challengeRepository;

    public ChallengeService(ChallengeInterface challengeInterface) {
        this.challengeRepository = challengeInterface;
    }

    public List<Challenge> getChallenges() {
        return this.challengeRepository.getAllChallenges();
    }

    public List<Challenge> getChallengeByMonth(String month) {
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
