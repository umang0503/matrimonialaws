package com.matrimonialaws.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.matrimonialaws.entities.Mediator;
import com.matrimonialaws.service.MediatorService;
@Controller
public class MediatorRestController {
	private final MediatorService mediatorService;


    public MediatorRestController(MediatorService mediatorService) {
        this.mediatorService = mediatorService;
    }

    @PostMapping("/meds")
    public ResponseEntity<Mediator> createPost(@RequestBody Mediator mediator){
        mediatorService.saveMed(mediator);
        return new ResponseEntity<>(mediator,HttpStatus.CREATED);
    }

    @GetMapping("/meds")
    public ResponseEntity<List<Mediator>> getAllPosts(){
        return new ResponseEntity<>(mediatorService.getAllMed(), HttpStatus.OK);
    }
    
    @DeleteMapping("/meds/{id}")
	public ResponseEntity<Object> deleteCar(@PathVariable("id") Long medId) {
		 mediatorService.deleteCar(medId);
		 return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		
	}
}
