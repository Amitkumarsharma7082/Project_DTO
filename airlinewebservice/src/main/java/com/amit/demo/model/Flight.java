package com.amit.demo.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Flight 
{

	@Id
	@Column(name="flight_id")
	private int id;
	
	@Column (name="flight-number",nullable=false)
	private String flightNumber;
	
	
	@Column(name="date",nullable=false)
	//@JsonFormat(pattern=MM/dd/yyyy)
	private LocalDate date;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFlightNumber() {
		return flightNumber;
	}


	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightNumber=" + flightNumber + ", date=" + date + "]";
	}
	
}

