package com.matrimonialaws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matrimonialaws.entities.Subscription;
@Repository
public interface SubscriptionRepository extends JpaRepository<Subscription,Long> {

}
