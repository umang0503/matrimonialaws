package com.matrimonialaws.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.matrimonialaws.entities.Subscription;
import com.matrimonialaws.repository.SubscriptionRepository;
@Service
public class SubscriptionService {
	private final SubscriptionRepository subscriptionRepository;


    public SubscriptionService(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    public void saveMed(Subscription post){
        getSubscriptionRepository().save(post);
    }

    public List<Subscription> getAllMed(){
        return getSubscriptionRepository().findAll();
    }

public Subscription deleteCar(Long CarId) {
		
		Optional<Subscription> retrievedCar=getSubscriptionRepository().findById(CarId);
		if(retrievedCar==null)
			try {
				throw new Exception("Car not found");
			} catch (Exception e) {
				e.printStackTrace();
			}
		getSubscriptionRepository().deleteById(CarId);
		return retrievedCar.get();
}

    public 	SubscriptionRepository getSubscriptionRepository() {
        return subscriptionRepository;
    }
}
