package com.matrimonialaws.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matrimonialaws.entities.Profile;
@Repository
public interface ProfileRepository extends JpaRepository<Profile,Long>{

	

}

