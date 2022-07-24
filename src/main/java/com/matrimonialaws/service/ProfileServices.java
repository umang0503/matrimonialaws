package com.matrimonialaws.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.matrimonialaws.entities.Profile;
import com.matrimonialaws.repository.ProfileRepository;
@Service
public class ProfileServices {
	private final ProfileRepository profileRepository;


    public ProfileServices(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public void saveProfile(Profile profile){
        getProfileRepository().save(profile);
    }

    public List<Profile> getAllProfile(){
        return getProfileRepository().findAll();
    }

    public void deleteProfile(Profile profile){
        getProfileRepository().delete(profile);
    }

    public 	ProfileRepository getProfileRepository() {
        return profileRepository;
    }
    
}
