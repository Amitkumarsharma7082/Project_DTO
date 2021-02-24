package com.amit.demo.controller;

import org.apache.catalina.authenticator.SavedRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amit.demo.Repo.FlightRepo;
import com.amit.demo.dto.FlightDto;
import com.amit.demo.model.Flight;
import com.amit.demo.service.FlightService;
import com.amit.demo.service.IFlightservice;


@RestController
public class FlightController 
{
	//Amit
	@Autowired
	IFlightservice FlightService;
	
	
	
	@GetMapping(path="/flight")
	public String getFlight()
	{
		return "Get method invoked";
	}
	@PostMapping(path="/flight")
	public FlightDto createFlight(@RequestBody FlightDto flightDto)
	{
		flightDto = FlightService.postData(flightDto);
				return flightDto;
	}
	
	@PutMapping(path="/flight")
	public String updateFlight()
	{
		return "Put method invoked";
	}
	@DeleteMapping(path="/flight")
	public String deleteFlight()
	{
		return "Delete method invoked";
	}
}