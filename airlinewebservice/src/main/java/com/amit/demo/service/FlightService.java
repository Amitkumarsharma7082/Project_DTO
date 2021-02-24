package com.amit.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.demo.Repo.FlightRepo;
import com.amit.demo.dto.FlightDto;
import com.amit.demo.model.Flight;


@Service
public class FlightService implements IFlightservice 
{
	@Autowired
	FlightRepo flightRepo;
	
	
@Override
public FlightDto postData(FlightDto flightDto) 
{
	Flight flight = new Flight();
	BeanUtils.copyProperties(flightDto, flight);
	
	flight = flightRepo.save(flight);
	
	BeanUtils.copyProperties(flight, flightDto);
	return flightDto;
}
}
