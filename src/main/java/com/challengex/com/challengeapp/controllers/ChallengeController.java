package com.challengex.com.challengeapp.controllers;

import com.challengex.com.challengeapp.models.Challenge;
import com.challengex.com.challengeapp.service.ChallengeService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/challenges")
@RestController
public class ChallengeController {
    private final ChallengeService challengeService;

    public ChallengeController(ChallengeService challengeService) {
        this.challengeService = challengeService;
    }

    @GetMapping
    public ResponseEntity<List<Challenge>> getChallenges() {
        List<Challenge> challenges = this.challengeService.getAllChallenges();
        if (challenges == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(challenges, HttpStatus.OK);
    }

    @PostMapping("/add-challenge")
    public ResponseEntity<String> addChallenge(@RequestBody Challenge challenge) {
        if (this.challengeService.addChallenge(challenge)) {
            return new ResponseEntity<>("Challenge Added Successfully", HttpStatus.CREATED);
        };

        return new ResponseEntity<>("Cannot Add Challenge", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PutMapping("/update-challenge/{id}")
    public ResponseEntity<String> updateChallenge(@PathVariable String id, @RequestBody Challenge challenge) {
        if (this.challengeService.updateChallenge(Long.parseLong(id), challenge)) {
            return new ResponseEntity<>("Challenge Updated Successfully", HttpStatus.OK);
        };

        return new ResponseEntity<>("Cannot Update Challenge", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Challenge> getChallenge(@PathVariable String id) {
        Challenge challenge = this.challengeService.getChallenge(Long.parseLong(id));

        if (challenge == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(challenge, HttpStatus.OK);
    }

    @DeleteMapping("/delete-challenge/{id}")
    public ResponseEntity<String> deleteChallengeByMonth(@PathVariable String id) {
        if (this.challengeService.removeChallenge(Long.parseLong(id))) {
            return new ResponseEntity<>("Challenge Deleted Successfully", HttpStatus.OK);
        }

        return new ResponseEntity<>("Cannot Delete Challenge", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
