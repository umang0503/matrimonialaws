package com.matrimonialaws.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.matrimonialaws.entities.Profile;
import com.matrimonialaws.service.ProfileServices;
@Controller
public class ProfileRestController {
	private final ProfileServices profileService;


    public ProfileRestController(ProfileServices profileService) {
        this.profileService = profileService;
    }

    @PostMapping("/profile")
    public ResponseEntity<Profile> createPost(@RequestBody Profile profile){
        profileService.saveProfile(profile);
        return new ResponseEntity<>(profile,HttpStatus.CREATED);
    }

    @GetMapping("/profile")
    public ResponseEntity<List<Profile>> getAllPosts(){
        return new ResponseEntity<>(profileService.getAllProfile(), HttpStatus.OK);
    }
}
