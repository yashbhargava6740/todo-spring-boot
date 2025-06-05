package com.challengex.com.challengeapp.controllers;

import com.challengex.com.challengeapp.interfaces.ChallengeInterface;
import com.challengex.com.challengeapp.models.Challenge;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChallengeController {
    private final ChallengeInterface challengeService;

    public ChallengeController(ChallengeInterface challengeService) {
        this.challengeService = challengeService;
    }

    @GetMapping("/challenges")
    public List<Challenge> getChallengeList() {
        return this.challengeService.getAllChallenges();
    }

    @PostMapping("/add-challenge")
    public void addChallenge(@RequestBody Challenge challenge) {
        this.challengeService.addChallenge(challenge);
    }

    @PutMapping("/update-challenge/{id}")
    public void updateChallenge(@PathVariable String id, @RequestBody Challenge challenge) {
        this.challengeService.updateChallenge(Long.parseLong(id), challenge);
    }

    @GetMapping("/challenges/{month}")
    public List<Challenge> getChallengeByMonth(@PathVariable String month) {
        return this.challengeService.getChallengesByMonth(month);
    }

    @DeleteMapping("/challenges/{month}")
    public void deleteChallengeByMonth(@PathVariable String month) {
        this.challengeService.removeChallengeByMonth(month);
    }
}
