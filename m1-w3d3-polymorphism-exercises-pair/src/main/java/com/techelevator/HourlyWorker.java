package com.techelevator;

public class HourlyWorker implements Worker {

	private double hourlyRate;
	private String firstName;
	private String lastName;
	
	public HourlyWorker(String firstName, String lastName, double hourlyRate) {
		this.hourlyRate = hourlyRate;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

	@Override
	public double calculateWeeklyPay(int hoursWorked) {
		double pay = 0;
		double overtime = 0;
		pay = hourlyRate * hoursWorked;
		if(hoursWorked < 40) {
			return pay;
		}
		overtime = hoursWorked - 4;
		pay = pay + (hourlyRate * overtime * 0.5);
		return pay;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	
}
