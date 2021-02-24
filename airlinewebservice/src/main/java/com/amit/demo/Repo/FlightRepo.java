package com.amit.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.demo.model.Flight;

public interface FlightRepo extends JpaRepository<Flight, Integer>
{

}
