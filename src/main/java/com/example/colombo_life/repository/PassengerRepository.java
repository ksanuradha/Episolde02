package com.example.colombo_life.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.colombo_life.model.Passenger;
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, String> {

}
