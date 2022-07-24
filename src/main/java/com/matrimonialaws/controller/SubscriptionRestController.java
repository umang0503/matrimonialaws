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

import com.matrimonialaws.entities.Subscription;
import com.matrimonialaws.service.SubscriptionService;
@Controller
public class SubscriptionRestController {
	private final SubscriptionService subscriptionService;


    public SubscriptionRestController(SubscriptionService subscriptionService) {
        this.subscriptionService = subscriptionService;
    }

    @PostMapping("/subscription")
    public ResponseEntity<Subscription> createPost(@RequestBody Subscription subscription){
        subscriptionService.saveMed(subscription);
        return new ResponseEntity<>(subscription,HttpStatus.CREATED);
    }

    @GetMapping("/subscription")
    public ResponseEntity<List<Subscription>> getAllPosts(){
        return new ResponseEntity<>(subscriptionService.getAllMed(), HttpStatus.OK);
    }
    @GetMapping
    public void print(){
        System.out.println("hello");
    }
    
    @DeleteMapping("/subscription/{id}")
	public ResponseEntity<Object> deleteCar(@PathVariable("id") Long carId) {
		 subscriptionService.deleteCar(carId);
		 return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		
	}
}
